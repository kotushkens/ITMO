package com.company;

import com.company.Town;

public class Main {

    public static void main(String[] args) {
	Town grabenberg = new Town(new Coordinates(0, 0), 20, 50); // cсоздание городов
	Town sanKomarika = new Town(new Coordinates(100,100), 45, 30);
	Town davilon = new Town(new Coordinates(200, 200), 30, 20);

	Barge bargeGraben = new Barge(new Coordinates(10, 25), new Telephone(143), "Грабенбергская"); // создание барж
	Barge bargeSan = new Barge(new Coordinates(120, 115), new Telephone(235), "Сан-Комарийская");
	Barge bargeDav = new Barge(new Coordinates(215, 210), new Telephone(385), "Давилонская");

	bargeGraben.addGorloderik(new Gorloderik("Steve", 15)); // добавление людей в баржи
		bargeGraben.addGorloderik(new Gorloderik("Steve", 15));
	bargeGraben.addKrikun(new Krikun("Garry", 30));

	bargeSan.addGorloderik(new Gorloderik("Mike", 16));
	bargeSan.addKrikun(new Krikun("Rick", 20));

	bargeDav.addGorloderik(new Gorloderik("John", 21));
	bargeDav.addKrikun(new Krikun("Роберт", 19));
	bargeDav.addKrikun(new Krikun("Роберт", 19));

	grabenberg.addBarge(bargeGraben); // добавляем баржи в город
	sanKomarika.addBarge(bargeSan);
	davilon.addBarge(bargeDav);

	bargeGraben.telephone.addConnection(bargeSan.telephone); // устанавливаем связь между телефонами на баржах
	bargeGraben.telephone.addConnection(bargeDav.telephone);
	bargeSan.telephone.addConnection(bargeDav.telephone);



	Millioner Skuperfild = new Millioner("Скуперфильд", 27);

	 	Skuperfild.telephone.addConnection(bargeGraben.telephone);  // устанавливаем связь между телефоном Скуперфильда и телефоном на баржах
        Skuperfild.telephone.addConnection(bargeDav.telephone);
        Skuperfild.telephone.addConnection(bargeSan.telephone);

        //bargeDav.telephone.deleteConnection(Skuperfild.telephone);

	Skuperfild.call(Skuperfild.telephone, bargeDav.telephone);
	bargeDav.getGorloderik().accept(bargeDav.telephone, Skuperfild.telephone);

	bargeSan.getGorloderik().call(bargeSan.telephone, Skuperfild.telephone);
	Skuperfild.accept(Skuperfild.telephone, bargeSan.telephone);

	bargeDav.getKrikun().call(bargeDav.telephone, bargeGraben.telephone);
	bargeGraben.getKrikun().accept(bargeGraben.telephone, bargeDav.telephone);


        Skuperfild.move(new Coordinates(10, 15));


    }
}
