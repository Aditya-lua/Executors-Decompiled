
undefined8 FUN_000297bc(undefined8 *param_1)

{
  bool in_CY;
  bool bVar1;
  undefined8 *puVar2;
  long lVar3;
  long *plVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 *puVar7;
  ulong extraout_x1;
  ulong extraout_x1_00;
  long *plVar8;
  long *plVar9;
  ulong uVar10;
  undefined8 *puVar11;
  long *plVar12;
  byte bVar13;
  ulong unaff_x20;
  long unaff_x22;
  undefined8 *unaff_x23;
  undefined8 *puVar14;
  undefined1 auVar15 [16];
  int iStack0000000000000000;
  int iStack0000000000000004;
  int iStack0000000000000008;
  int iStack000000000000000c;
  undefined1 auStack_38 [8];
  
  if (!in_CY) {
    return 0;
  }
  do {
    while( true ) {
      puVar7 = param_1;
      if ((ulong)puVar7[4] <= unaff_x20) break;
      param_1 = (undefined8 *)*puVar7;
      if ((undefined8 *)*puVar7 == (undefined8 *)0x0) {
        puVar11 = puVar7;
        goto LAB_000297f8;
      }
    }
    if (unaff_x20 <= (ulong)puVar7[4]) goto LAB_00029850;
    param_1 = (undefined8 *)puVar7[1];
  } while ((undefined8 *)puVar7[1] != (undefined8 *)0x0);
  puVar11 = puVar7 + 1;
LAB_000297f8:
  puVar2 = (undefined8 *)__Znwm(0x38);
  puVar2[5] = 0;
  puVar2[6] = 0;
  puVar2[4] = unaff_x20;
  *puVar2 = 0;
  puVar2[1] = 0;
  puVar2[2] = puVar7;
  *puVar11 = puVar2;
  puVar7 = puVar2;
  if ((long *)*plRam0000000000a33358 != (long *)0x0) {
    puVar7 = (undefined8 *)*puVar11;
    plRam0000000000a33358 = (long *)*plRam0000000000a33358;
  }
  func_0x0003767c(*unaff_x23,puVar7);
  unaff_x23[1] = unaff_x23[1] + 1;
  puVar7 = puVar2;
LAB_00029850:
  uVar6 = puVar7[6];
  uVar5 = puVar7[5];
  func_0x0002a764();
  if ((extraout_x1 & 0xff) == 0) {
    func_0x006e644c();
  }
  else {
    iStack0000000000000008 = (int)uVar6;
    iStack000000000000000c = (int)((ulong)uVar6 >> 0x20);
    iStack0000000000000000 = (int)uVar5;
    iStack0000000000000004 = (int)((ulong)uVar5 >> 0x20);
    if ((iStack0000000000000008 == iStack000000000000000c) &&
       (func_0x0002a764(), (extraout_x1_00 & 0xff) != 0)) {
      auVar15 = func_0x0002a764();
      if ((auVar15._8_8_ & 0xff) != 0) {
        if (*(char *)(auVar15._0_8_ + 3) == '\0') {
          auVar15 = func_0x0002a764();
          lVar3 = auVar15._0_8_;
          if ((auVar15._8_8_ & 0xff) != 0) {
            *(undefined8 *)(unaff_x20 + 0x10) = *(undefined8 *)(lVar3 + 0x10);
            *(undefined2 *)(unaff_x20 + 5) = *(undefined2 *)(lVar3 + 5);
            if (*(char *)(lVar3 + 4) == '\0') {
              bVar13 = 0;
            }
            else {
              uVar10 = 0;
              puVar7 = (undefined8 *)(lVar3 + 0x20);
              puVar11 = (undefined8 *)(unaff_x20 + 0x20);
              do {
                uVar5 = *puVar7;
                puVar11[1] = puVar7[1];
                *puVar11 = uVar5;
                uVar10 = uVar10 + 1;
                bVar13 = *(byte *)(lVar3 + 4);
                puVar7 = puVar7 + 2;
                puVar11 = puVar11 + 2;
              } while (uVar10 < bVar13);
            }
            *(byte *)(unaff_x20 + 4) = bVar13;
            *(undefined8 *)(unaff_x20 + 0x18) = *(undefined8 *)(lVar3 + 0x18);
code_r0x00029a54:
            if (0 < iStack0000000000000000) {
              func_0x006e5bd0();
            }
            goto code_r0x00029a6c;
          }
        }
        else {
          if (iStack0000000000000008 == 0) {
            puVar7 = puRam0000000000a33378;
            if (puRam0000000000a33378 == (undefined8 *)0x0) {
              puVar11 = (undefined8 *)0xa33378;
              puVar14 = (undefined8 *)0xa33378;
            }
            else {
              do {
                while( true ) {
                  puVar2 = puVar7;
                  puVar11 = puVar2;
                  if ((ulong)puVar2[4] <= unaff_x20) break;
                  puVar7 = (undefined8 *)*puVar2;
                  puVar14 = puVar2;
                  if ((undefined8 *)*puVar2 == (undefined8 *)0x0) goto code_r0x000299c0;
                }
                if (unaff_x20 <= (ulong)puVar2[4]) goto code_r0x00029a14;
                puVar7 = (undefined8 *)puVar2[1];
              } while ((undefined8 *)puVar2[1] != (undefined8 *)0x0);
              puVar14 = puVar2 + 1;
            }
code_r0x000299c0:
            puVar2 = (undefined8 *)__Znwm(0x30);
            puVar2[4] = unaff_x20;
            *(undefined4 *)(puVar2 + 5) = 0;
            *puVar2 = 0;
            puVar2[1] = 0;
            puVar2[2] = puVar11;
            *puVar14 = puVar2;
            puVar7 = puVar2;
            if ((undefined8 *)*puRam0000000000a33370 != (undefined8 *)0x0) {
              puVar7 = (undefined8 *)*puVar14;
              puRam0000000000a33370 = (undefined8 *)*puRam0000000000a33370;
            }
            func_0x0003767c(puRam0000000000a33378,puVar7);
            lRam0000000000a33380 = lRam0000000000a33380 + 1;
code_r0x00029a14:
            *(int *)(puVar2 + 5) = iStack0000000000000000;
code_r0x00029a6c:
            if (0 < iStack0000000000000004) {
              func_0x006e5bd0();
            }
            goto LAB_00029a7c;
          }
          auVar15 = func_0x0002a764();
          lVar3 = auVar15._0_8_;
          if ((auVar15._8_8_ & 0xff) != 0) {
            *(undefined **)(unaff_x20 + 0x18) = &DAT_00037c90;
            *(ulong *)(unaff_x20 + 0x20) = (long)&DAT_00037c98 - (unaff_x20 + 0x20);
            *(undefined8 *)(unaff_x20 + 0x10) = *(undefined8 *)(lVar3 + 0x10);
            *(undefined2 *)(unaff_x20 + 5) = *(undefined2 *)(lVar3 + 5);
            if (*(char *)(lVar3 + 4) == '\0') {
              bVar13 = 0;
            }
            else {
              uVar10 = 0;
              puVar7 = (undefined8 *)(lVar3 + 0x30);
              puVar11 = (undefined8 *)(unaff_x20 + 0x30);
              do {
                uVar5 = *puVar7;
                puVar11[1] = puVar7[1];
                *puVar11 = uVar5;
                uVar10 = uVar10 + 1;
                bVar13 = *(byte *)(lVar3 + 4);
                puVar7 = puVar7 + 2;
                puVar11 = puVar11 + 2;
              } while (uVar10 < bVar13);
            }
            *(byte *)(unaff_x20 + 4) = bVar13;
            *(undefined8 *)(unaff_x20 + 0x18) = *(undefined8 *)(lVar3 + 0x18);
            *(ulong *)(unaff_x20 + 0x20) =
                 lVar3 + 0x20 + (*(long *)(lVar3 + 0x20) - (unaff_x20 + 0x20));
            goto code_r0x00029a54;
          }
        }
      }
    }
    else {
LAB_00029a7c:
      if (iStack0000000000000008 != 1 || iStack000000000000000c != 0) {
code_r0x00029c34:
        plVar4 = *(long **)(unaff_x22 + 0x360);
        if (plVar4 != (long *)0x0) {
          plVar8 = (long *)0xa33360;
          plVar12 = plVar4;
          do {
            plVar9 = plVar12 + 1;
            if (unaff_x20 <= (ulong)plVar12[4]) {
              plVar8 = plVar12;
              plVar9 = plVar12;
            }
            plVar12 = (long *)*plVar9;
          } while (plVar12 != (long *)0x0);
          if ((plVar8 != (long *)0xa33360) && ((ulong)plVar8[4] <= unaff_x20)) {
            plVar8 = (long *)0xa33360;
            plVar12 = plVar4;
            do {
              plVar9 = plVar12 + 1;
              if (unaff_x20 <= (ulong)plVar12[4]) {
                plVar8 = plVar12;
                plVar9 = plVar12;
              }
              plVar12 = (long *)*plVar9;
            } while (plVar12 != (long *)0x0);
            if ((plVar8 != (long *)0xa33360) && ((ulong)plVar8[4] <= unaff_x20)) {
              plVar12 = (long *)plVar8[1];
              if ((long *)plVar8[1] == (long *)0x0) {
                plVar12 = plVar8;
                do {
                  plVar9 = (long *)plVar12[2];
                  bVar1 = (long *)*plVar9 != plVar12;
                  plVar12 = plVar9;
                } while (bVar1);
              }
              else {
                do {
                  plVar9 = plVar12;
                  plVar12 = (long *)*plVar9;
                } while ((long *)*plVar9 != (long *)0x0);
              }
              if (plRam0000000000a33358 == plVar8) {
                plRam0000000000a33358 = plVar9;
              }
              lRam0000000000a33368 = lRam0000000000a33368 + -1;
              func_0x00037ca0(plVar4,plVar8);
              __ZdlPv(plVar8);
            }
          }
        }
        return 0;
      }
      if (puRam0000000000a33378 != (undefined8 *)0x0) {
        puVar7 = (undefined8 *)0xa33378;
        puVar11 = puRam0000000000a33378;
        do {
          puVar2 = puVar11 + 1;
          if (unaff_x20 <= (ulong)puVar11[4]) {
            puVar7 = puVar11;
            puVar2 = puVar11;
          }
          puVar11 = (undefined8 *)*puVar2;
        } while (puVar11 != (undefined8 *)0x0);
        if ((puVar7 != (undefined8 *)0xa33378) && ((ulong)puVar7[4] <= unaff_x20)) {
          puVar7 = (undefined8 *)0xa33378;
          puVar11 = puRam0000000000a33378;
          do {
            puVar2 = puVar11 + 1;
            if (unaff_x20 <= (ulong)puVar11[4]) {
              puVar7 = puVar11;
              puVar2 = puVar11;
            }
            puVar11 = (undefined8 *)*puVar2;
          } while (puVar11 != (undefined8 *)0x0);
          if ((puVar7 != (undefined8 *)0xa33378) && ((ulong)puVar7[4] <= unaff_x20)) {
            puVar11 = (undefined8 *)puVar7[1];
            if ((undefined8 *)puVar7[1] == (undefined8 *)0x0) {
              puVar11 = puVar7;
              do {
                puVar2 = (undefined8 *)puVar11[2];
                bVar1 = (undefined8 *)*puVar2 != puVar11;
                puVar11 = puVar2;
              } while (bVar1);
            }
            else {
              do {
                puVar2 = puVar11;
                puVar11 = (undefined8 *)*puVar2;
              } while ((undefined8 *)*puVar2 != (undefined8 *)0x0);
            }
            if (puRam0000000000a33370 == puVar7) {
              puRam0000000000a33370 = puVar2;
            }
            lRam0000000000a33380 = lRam0000000000a33380 + -1;
            func_0x00037ca0(puRam0000000000a33378,puVar7);
            __ZdlPv(puVar7);
          }
        }
      }
      auVar15 = func_0x0002a764();
      lVar3 = auVar15._0_8_;
      if ((auVar15._8_8_ & 0xff) != 0) {
        *(undefined **)(unaff_x20 + 0x18) = &DAT_00038064;
        *(ulong *)(unaff_x20 + 0x20) = (long)&DAT_0003806c - (unaff_x20 + 0x20);
        *(undefined8 *)(unaff_x20 + 0x10) = *(undefined8 *)(lVar3 + 0x10);
        *(undefined2 *)(unaff_x20 + 5) = *(undefined2 *)(lVar3 + 5);
        if (*(char *)(lVar3 + 4) == '\0') {
          bVar13 = 0;
        }
        else {
          uVar10 = 0;
          puVar7 = (undefined8 *)(lVar3 + 0x30);
          puVar11 = (undefined8 *)(unaff_x20 + 0x30);
          do {
            uVar5 = *puVar7;
            puVar11[1] = puVar7[1];
            *puVar11 = uVar5;
            uVar10 = uVar10 + 1;
            bVar13 = *(byte *)(lVar3 + 4);
            puVar7 = puVar7 + 2;
            puVar11 = puVar11 + 2;
          } while (uVar10 < bVar13);
        }
        *(byte *)(unaff_x20 + 4) = bVar13;
        *(undefined8 *)(unaff_x20 + 0x18) = *(undefined8 *)(lVar3 + 0x18);
        *(ulong *)(unaff_x20 + 0x20) = lVar3 + 0x20 + (*(long *)(lVar3 + 0x20) - (unaff_x20 + 0x20))
        ;
        if (0 < iStack0000000000000000) {
          func_0x006e5bd0();
        }
        if (0 < iStack0000000000000004) {
          func_0x006e5bd0();
        }
        goto code_r0x00029c34;
      }
    }
  }
  uVar5 = func_0x00023168();
  __ZNSt3__16localeD1Ev();
  uVar5 = __Unwind_Resume(uVar5);
  uVar6 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar6 = func_0x00086db4(uVar6,"isfunctionhooked",0x10);
  uVar6 = func_0x00086db4(uVar6," @ ",3);
  uVar6 = func_0x00086db4(uVar6,"/Users/x0rch/hydrogen-m/src/lua/libs/newclosure.h",0x31);
  uVar6 = func_0x00086db4(uVar6,":",1);
  plVar4 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar6,0x1e6);
  __ZNKSt3__18ios_base6getlocEv(auStack_38,(long)plVar4 + *(long *)(*plVar4 + -0x18));
  plVar8 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (auStack_38,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar6 = (**(code **)(*plVar8 + 0x38))(plVar8,10);
  __ZNSt3__16localeD1Ev(auStack_38);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar4,uVar6);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar4);
  func_0x006e69bc(uVar5,1,7);
  uVar10 = func_0x006e3790(uVar5,1);
  if (plRam0000000000a33360 != (long *)0x0) {
    plVar4 = (long *)0xa33360;
    plVar8 = plRam0000000000a33360;
    do {
      plVar12 = plVar8 + 1;
      if (uVar10 <= (ulong)plVar8[4]) {
        plVar4 = plVar8;
        plVar12 = plVar8;
      }
      plVar8 = (long *)*plVar12;
    } while (plVar8 != (long *)0x0);
    if ((plVar4 != (long *)0xa33360) && ((ulong)plVar4[4] <= uVar10)) {
      uVar6 = 1;
      goto code_r0x00029ea0;
    }
  }
  uVar6 = 0;
code_r0x00029ea0:
  func_0x006e3c24(uVar5,uVar6);
  return 1;
}

