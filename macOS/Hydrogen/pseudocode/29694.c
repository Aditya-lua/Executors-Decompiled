
undefined8 FUN_00029694(undefined8 param_1)

{
  bool bVar1;
  undefined8 uVar2;
  long *plVar3;
  long *plVar4;
  ulong uVar5;
  undefined8 *puVar6;
  long lVar7;
  undefined8 uVar8;
  ulong extraout_x1;
  ulong extraout_x1_00;
  undefined8 *puVar9;
  ulong uVar10;
  undefined8 *puVar11;
  byte bVar12;
  undefined8 *puVar13;
  undefined1 auVar14 [16];
  int iStack0000000000000000;
  int iStack0000000000000004;
  int iStack0000000000000008;
  int iStack000000000000000c;
  undefined1 uStack0000000000000050;
  undefined1 auStack_38 [8];
  undefined8 uStack_30;
  undefined8 *puStack_28;
  ulong uStack_20;
  undefined8 uStack_18;
  undefined1 *puStack_10;
  undefined *puStack_8;
  
  uVar2 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar2 = func_0x00086db4(uVar2,"restorefunction",0xf);
  uVar2 = func_0x00086db4(uVar2," @ ",3);
  uVar2 = func_0x00086db4(uVar2,"/Users/x0rch/hydrogen-m/src/lua/libs/newclosure.h",0x31);
  uVar2 = func_0x00086db4(uVar2,":",1);
  plVar3 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar2,0x188);
  __ZNKSt3__18ios_base6getlocEv((long)plVar3 + *(long *)(*plVar3 + -0x18));
  plVar4 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE();
  uVar2 = (**(code **)(*plVar4 + 0x38))(plVar4,10);
  __ZNSt3__16localeD1Ev();
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar3,uVar2);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar3);
  func_0x006e69bc(param_1,1,7);
  uVar5 = func_0x006e3790(param_1,1);
  if (puRam0000000000a33360 == (undefined8 *)0x0) {
    return 0;
  }
  puVar9 = (undefined8 *)0xa33360;
  puVar11 = puRam0000000000a33360;
  do {
    puVar6 = puVar11 + 1;
    if (uVar5 <= (ulong)puVar11[4]) {
      puVar9 = puVar11;
      puVar6 = puVar11;
    }
    puVar11 = (undefined8 *)*puVar6;
  } while (puVar11 != (undefined8 *)0x0);
  if (puVar9 == (undefined8 *)0xa33360) {
    return 0;
  }
  puVar11 = puRam0000000000a33360;
  if (uVar5 < (ulong)puVar9[4]) {
    return 0;
  }
  do {
    while( true ) {
      puVar9 = puVar11;
      if ((ulong)puVar9[4] <= uVar5) break;
      puVar11 = (undefined8 *)*puVar9;
      if ((undefined8 *)*puVar9 == (undefined8 *)0x0) {
        puVar11 = puVar9;
        goto code_r0x000297f8;
      }
    }
    if (uVar5 <= (ulong)puVar9[4]) goto code_r0x00029850;
    puVar11 = (undefined8 *)puVar9[1];
  } while ((undefined8 *)puVar9[1] != (undefined8 *)0x0);
  puVar11 = puVar9 + 1;
code_r0x000297f8:
  puVar6 = (undefined8 *)__Znwm(0x38);
  puVar6[5] = 0;
  puVar6[6] = 0;
  puVar6[4] = uVar5;
  *puVar6 = 0;
  puVar6[1] = 0;
  puVar6[2] = puVar9;
  *puVar11 = puVar6;
  puVar9 = puVar6;
  if ((undefined8 *)*puRam0000000000a33358 != (undefined8 *)0x0) {
    puVar9 = (undefined8 *)*puVar11;
    puRam0000000000a33358 = (undefined8 *)*puRam0000000000a33358;
  }
  func_0x0003767c(puRam0000000000a33360,puVar9);
  lRam0000000000a33368 = lRam0000000000a33368 + 1;
  puVar9 = puVar6;
code_r0x00029850:
  uVar8 = puVar9[6];
  uVar2 = puVar9[5];
  func_0x0002a764();
  if ((extraout_x1 & 0xff) == 0) {
    func_0x006e644c(param_1,"Cannot obtain original function to unhook.");
  }
  else {
    iStack0000000000000008 = (int)uVar8;
    iStack000000000000000c = (int)((ulong)uVar8 >> 0x20);
    iStack0000000000000000 = (int)uVar2;
    iStack0000000000000004 = (int)((ulong)uVar2 >> 0x20);
    if ((iStack0000000000000008 == iStack000000000000000c) &&
       (func_0x0002a764(), (extraout_x1_00 & 0xff) != 0)) {
      auVar14 = func_0x0002a764();
      if ((auVar14._8_8_ & 0xff) != 0) {
        if (*(char *)(auVar14._0_8_ + 3) == '\0') {
          auVar14 = func_0x0002a764();
          lVar7 = auVar14._0_8_;
          if ((auVar14._8_8_ & 0xff) != 0) {
            *(undefined8 *)(uVar5 + 0x10) = *(undefined8 *)(lVar7 + 0x10);
            *(undefined2 *)(uVar5 + 5) = *(undefined2 *)(lVar7 + 5);
            if (*(char *)(lVar7 + 4) == '\0') {
              bVar12 = 0;
            }
            else {
              uVar10 = 0;
              puVar11 = (undefined8 *)(lVar7 + 0x20);
              puVar6 = (undefined8 *)(uVar5 + 0x20);
              do {
                uVar2 = *puVar11;
                puVar6[1] = puVar11[1];
                *puVar6 = uVar2;
                uVar10 = uVar10 + 1;
                bVar12 = *(byte *)(lVar7 + 4);
                puVar11 = puVar11 + 2;
                puVar6 = puVar6 + 2;
              } while (uVar10 < bVar12);
            }
            *(byte *)(uVar5 + 4) = bVar12;
            *(undefined8 *)(uVar5 + 0x18) = *(undefined8 *)(lVar7 + 0x18);
code_r0x00029a54:
            if (0 < iStack0000000000000000) {
              func_0x006e5bd0(param_1);
            }
            goto code_r0x00029a6c;
          }
        }
        else {
          if (iStack0000000000000008 == 0) {
            puVar11 = puRam0000000000a33378;
            if (puRam0000000000a33378 == (undefined8 *)0x0) {
              puVar6 = (undefined8 *)0xa33378;
              puVar13 = (undefined8 *)0xa33378;
            }
            else {
              do {
                while( true ) {
                  puVar9 = puVar11;
                  puVar6 = puVar9;
                  if ((ulong)puVar9[4] <= uVar5) break;
                  puVar11 = (undefined8 *)*puVar9;
                  puVar13 = puVar9;
                  if ((undefined8 *)*puVar9 == (undefined8 *)0x0) goto code_r0x000299c0;
                }
                if (uVar5 <= (ulong)puVar9[4]) goto code_r0x00029a14;
                puVar11 = (undefined8 *)puVar9[1];
              } while ((undefined8 *)puVar9[1] != (undefined8 *)0x0);
              puVar13 = puVar9 + 1;
            }
code_r0x000299c0:
            puVar9 = (undefined8 *)__Znwm(0x30);
            puVar9[4] = uVar5;
            *(undefined4 *)(puVar9 + 5) = 0;
            *puVar9 = 0;
            puVar9[1] = 0;
            puVar9[2] = puVar6;
            *puVar13 = puVar9;
            puVar11 = puVar9;
            if ((undefined8 *)*puRam0000000000a33370 != (undefined8 *)0x0) {
              puVar11 = (undefined8 *)*puVar13;
              puRam0000000000a33370 = (undefined8 *)*puRam0000000000a33370;
            }
            func_0x0003767c(puRam0000000000a33378,puVar11);
            lRam0000000000a33380 = lRam0000000000a33380 + 1;
code_r0x00029a14:
            *(int *)(puVar9 + 5) = iStack0000000000000000;
code_r0x00029a6c:
            if (0 < iStack0000000000000004) {
              func_0x006e5bd0(param_1);
            }
            goto code_r0x00029a7c;
          }
          auVar14 = func_0x0002a764();
          lVar7 = auVar14._0_8_;
          if ((auVar14._8_8_ & 0xff) != 0) {
            *(undefined **)(uVar5 + 0x18) = &DAT_00037c90;
            *(ulong *)(uVar5 + 0x20) = (long)&DAT_00037c98 - (uVar5 + 0x20);
            *(undefined8 *)(uVar5 + 0x10) = *(undefined8 *)(lVar7 + 0x10);
            *(undefined2 *)(uVar5 + 5) = *(undefined2 *)(lVar7 + 5);
            if (*(char *)(lVar7 + 4) == '\0') {
              bVar12 = 0;
            }
            else {
              uVar10 = 0;
              puVar11 = (undefined8 *)(lVar7 + 0x30);
              puVar6 = (undefined8 *)(uVar5 + 0x30);
              do {
                uVar2 = *puVar11;
                puVar6[1] = puVar11[1];
                *puVar6 = uVar2;
                uVar10 = uVar10 + 1;
                bVar12 = *(byte *)(lVar7 + 4);
                puVar11 = puVar11 + 2;
                puVar6 = puVar6 + 2;
              } while (uVar10 < bVar12);
            }
            *(byte *)(uVar5 + 4) = bVar12;
            *(undefined8 *)(uVar5 + 0x18) = *(undefined8 *)(lVar7 + 0x18);
            *(ulong *)(uVar5 + 0x20) = lVar7 + 0x20 + (*(long *)(lVar7 + 0x20) - (uVar5 + 0x20));
            goto code_r0x00029a54;
          }
        }
      }
    }
    else {
code_r0x00029a7c:
      if (iStack0000000000000008 != 1 || iStack000000000000000c != 0) {
code_r0x00029c34:
        if (puRam0000000000a33360 != (undefined8 *)0x0) {
          puVar9 = (undefined8 *)0xa33360;
          puVar11 = puRam0000000000a33360;
          do {
            puVar6 = puVar11 + 1;
            if (uVar5 <= (ulong)puVar11[4]) {
              puVar9 = puVar11;
              puVar6 = puVar11;
            }
            puVar11 = (undefined8 *)*puVar6;
          } while (puVar11 != (undefined8 *)0x0);
          if ((puVar9 != (undefined8 *)0xa33360) && ((ulong)puVar9[4] <= uVar5)) {
            puVar9 = (undefined8 *)0xa33360;
            puVar11 = puRam0000000000a33360;
            do {
              puVar6 = puVar11 + 1;
              if (uVar5 <= (ulong)puVar11[4]) {
                puVar9 = puVar11;
                puVar6 = puVar11;
              }
              puVar11 = (undefined8 *)*puVar6;
            } while (puVar11 != (undefined8 *)0x0);
            if ((puVar9 != (undefined8 *)0xa33360) && ((ulong)puVar9[4] <= uVar5)) {
              puVar11 = (undefined8 *)puVar9[1];
              if ((undefined8 *)puVar9[1] == (undefined8 *)0x0) {
                puVar11 = puVar9;
                do {
                  puVar6 = (undefined8 *)puVar11[2];
                  bVar1 = (undefined8 *)*puVar6 != puVar11;
                  puVar11 = puVar6;
                } while (bVar1);
              }
              else {
                do {
                  puVar6 = puVar11;
                  puVar11 = (undefined8 *)*puVar6;
                } while ((undefined8 *)*puVar6 != (undefined8 *)0x0);
              }
              if (puRam0000000000a33358 == puVar9) {
                puRam0000000000a33358 = puVar6;
              }
              lRam0000000000a33368 = lRam0000000000a33368 + -1;
              func_0x00037ca0(puRam0000000000a33360,puVar9);
              __ZdlPv(puVar9);
            }
          }
        }
        return 0;
      }
      if (puRam0000000000a33378 != (undefined8 *)0x0) {
        puVar11 = (undefined8 *)0xa33378;
        puVar6 = puRam0000000000a33378;
        do {
          puVar13 = puVar6 + 1;
          if (uVar5 <= (ulong)puVar6[4]) {
            puVar11 = puVar6;
            puVar13 = puVar6;
          }
          puVar6 = (undefined8 *)*puVar13;
        } while (puVar6 != (undefined8 *)0x0);
        if ((puVar11 != (undefined8 *)0xa33378) && ((ulong)puVar11[4] <= uVar5)) {
          puVar9 = (undefined8 *)0xa33378;
          puVar11 = puRam0000000000a33378;
          do {
            puVar6 = puVar11 + 1;
            if (uVar5 <= (ulong)puVar11[4]) {
              puVar9 = puVar11;
              puVar6 = puVar11;
            }
            puVar11 = (undefined8 *)*puVar6;
          } while (puVar11 != (undefined8 *)0x0);
          if ((puVar9 != (undefined8 *)0xa33378) && ((ulong)puVar9[4] <= uVar5)) {
            puVar11 = (undefined8 *)puVar9[1];
            if ((undefined8 *)puVar9[1] == (undefined8 *)0x0) {
              puVar11 = puVar9;
              do {
                puVar6 = (undefined8 *)puVar11[2];
                bVar1 = (undefined8 *)*puVar6 != puVar11;
                puVar11 = puVar6;
              } while (bVar1);
            }
            else {
              do {
                puVar6 = puVar11;
                puVar11 = (undefined8 *)*puVar6;
              } while ((undefined8 *)*puVar6 != (undefined8 *)0x0);
            }
            if (puRam0000000000a33370 == puVar9) {
              puRam0000000000a33370 = puVar6;
            }
            lRam0000000000a33380 = lRam0000000000a33380 + -1;
            func_0x00037ca0(puRam0000000000a33378,puVar9);
            __ZdlPv(puVar9);
          }
        }
      }
      auVar14 = func_0x0002a764();
      lVar7 = auVar14._0_8_;
      if ((auVar14._8_8_ & 0xff) != 0) {
        *(undefined **)(uVar5 + 0x18) = &DAT_00038064;
        *(ulong *)(uVar5 + 0x20) = (long)&DAT_0003806c - (uVar5 + 0x20);
        *(undefined8 *)(uVar5 + 0x10) = *(undefined8 *)(lVar7 + 0x10);
        *(undefined2 *)(uVar5 + 5) = *(undefined2 *)(lVar7 + 5);
        if (*(char *)(lVar7 + 4) == '\0') {
          bVar12 = 0;
        }
        else {
          uVar10 = 0;
          puVar9 = (undefined8 *)(lVar7 + 0x30);
          puVar11 = (undefined8 *)(uVar5 + 0x30);
          do {
            uVar2 = *puVar9;
            puVar11[1] = puVar9[1];
            *puVar11 = uVar2;
            uVar10 = uVar10 + 1;
            bVar12 = *(byte *)(lVar7 + 4);
            puVar9 = puVar9 + 2;
            puVar11 = puVar11 + 2;
          } while (uVar10 < bVar12);
        }
        *(byte *)(uVar5 + 4) = bVar12;
        *(undefined8 *)(uVar5 + 0x18) = *(undefined8 *)(lVar7 + 0x18);
        *(ulong *)(uVar5 + 0x20) = lVar7 + 0x20 + (*(long *)(lVar7 + 0x20) - (uVar5 + 0x20));
        if (0 < iStack0000000000000000) {
          func_0x006e5bd0(param_1);
        }
        if (0 < iStack0000000000000004) {
          func_0x006e5bd0(param_1);
        }
        goto code_r0x00029c34;
      }
    }
  }
  uVar2 = func_0x00023168();
  __ZNSt3__16localeD1Ev();
  uVar8 = __Unwind_Resume(uVar2);
  uStack_30 = 0xa33000;
  puStack_8 = &DAT_00029d68;
  puStack_28 = puVar9;
  uStack_20 = uVar5;
  uStack_18 = uVar2;
  puStack_10 = &uStack0000000000000050;
  uVar2 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar2 = func_0x00086db4(uVar2,"isfunctionhooked",0x10);
  uVar2 = func_0x00086db4(uVar2," @ ",3);
  uVar2 = func_0x00086db4(uVar2,"/Users/x0rch/hydrogen-m/src/lua/libs/newclosure.h",0x31);
  uVar2 = func_0x00086db4(uVar2,":",1);
  plVar3 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar2,0x1e6);
  __ZNKSt3__18ios_base6getlocEv(auStack_38,(long)plVar3 + *(long *)(*plVar3 + -0x18));
  plVar4 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (auStack_38,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar2 = (**(code **)(*plVar4 + 0x38))(plVar4,10);
  __ZNSt3__16localeD1Ev(auStack_38);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar3,uVar2);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar3);
  func_0x006e69bc(uVar8,1,7);
  uVar5 = func_0x006e3790(uVar8,1);
  if (puRam0000000000a33360 != (undefined8 *)0x0) {
    puVar9 = (undefined8 *)0xa33360;
    puVar11 = puRam0000000000a33360;
    do {
      puVar6 = puVar11 + 1;
      if (uVar5 <= (ulong)puVar11[4]) {
        puVar9 = puVar11;
        puVar6 = puVar11;
      }
      puVar11 = (undefined8 *)*puVar6;
    } while (puVar11 != (undefined8 *)0x0);
    if ((puVar9 != (undefined8 *)0xa33360) && ((ulong)puVar9[4] <= uVar5)) {
      uVar2 = 1;
      goto LAB_00029ea0;
    }
  }
  uVar2 = 0;
LAB_00029ea0:
  func_0x006e3c24(uVar8,uVar2);
  return 1;
}

