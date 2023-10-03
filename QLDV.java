/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DV;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class QLDV {

    public QLDV() {
        lstDV.add(new DongVat("1234", "meo", "l1", "duc"));
        lstDV.add(new DongVat("1235", "bo", "l2", "cai"));
        lstDV.add(new DongVat("1236", "ga", "l3", "duc"));
        lstDV.add(new DongVat("1237", "cho", "l4", "duc"));
    }

    ArrayList<DongVat> lstDV = new ArrayList<>();

    ArrayList<DongVat> getlstDV() {
        return lstDV;
    }

    Boolean addNew(DongVat dv) {
        lstDV.add(dv);
        return true;
    }

    boolean delete(int viTri) {
        lstDV.remove(viTri);
        return true;

    }

    Boolean update(int vitri, DongVat dongVatNew) {
        lstDV.set(vitri, dongVatNew);
        return true;

    }

    ArrayList<DongVat> search(String tenTim) {
        ArrayList<DongVat> lstKQ = new ArrayList<>();
        for (DongVat dongVat : lstDV) {
            if (dongVat.getTen().equals(tenTim)) {
                lstKQ.add(dongVat);
            }
        }
        return lstKQ;
        
    }

}
