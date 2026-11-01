
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_00028b58(undefined8 param_1)

{
  undefined4 uVar1;
  bool bVar2;
  int iVar3;
  undefined4 uVar4;
  undefined8 uVar5;
  ulong uVar6;
  long lVar7;
  undefined8 *puVar8;
  undefined8 uVar9;
  long *plVar10;
  long *plVar11;
  ulong extraout_x1;
  ulong extraout_x1_00;
  undefined8 *puVar12;
  undefined8 *extraout_x8;
  long lVar13;
  undefined8 *puVar14;
  ulong uVar15;
  byte bVar16;
  long unaff_x19;
  undefined8 unaff_x20;
  undefined8 *puVar17;
  undefined8 unaff_x22;
  uint uVar18;
  undefined8 *unaff_x23;
  ulong unaff_x24;
  undefined8 *unaff_x26;
  undefined1 auVar19 [16];
  undefined1 uStack0000000000000008;
  undefined1 auStack_98 [8];
  undefined8 uStack_90;
  undefined8 *puStack_88;
  ulong uStack_80;
  undefined8 uStack_78;
  long lStack_70;
  undefined *puStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 *puStack_50;
  undefined8 uStack_48;
  ulong uStack_40;
  undefined8 *puStack_38;
  undefined8 uStack_30;
  undefined8 uStack_28;
  
  func_0x006e4cdc(param_1,1,1,0);
  uVar5 = func_0x006e1c18();
  uVar6 = func_0x006e3790();
  if (puRam0000000000a33360 == (undefined8 *)0x0) {
LAB_00028bd4:
    unaff_x22 = func_0x006e1c18();
    unaff_x24 = func_0x006e3790();
    puVar14 = puRam0000000000a33360;
    if (puRam0000000000a33360 == (undefined8 *)0x0) {
      puVar12 = (undefined8 *)0xa33360;
      unaff_x26 = (undefined8 *)0xa33360;
    }
    else {
      do {
        while( true ) {
          unaff_x23 = puVar14;
          puVar12 = unaff_x23;
          if ((ulong)unaff_x23[4] <= unaff_x24) break;
          puVar14 = (undefined8 *)*unaff_x23;
          unaff_x26 = unaff_x23;
          if ((undefined8 *)*unaff_x23 == (undefined8 *)0x0) goto LAB_00028c38;
        }
        if (unaff_x24 <= (ulong)unaff_x23[4]) goto LAB_00028c8c;
        puVar14 = (undefined8 *)unaff_x23[1];
      } while ((undefined8 *)unaff_x23[1] != (undefined8 *)0x0);
      unaff_x26 = unaff_x23 + 1;
    }
LAB_00028c38:
    unaff_x23 = (undefined8 *)__Znwm(0x38);
    unaff_x23[5] = 0;
    unaff_x23[6] = 0;
    unaff_x23[4] = unaff_x24;
    *unaff_x23 = 0;
    unaff_x23[1] = 0;
    unaff_x23[2] = puVar12;
    *unaff_x26 = unaff_x23;
    puVar14 = unaff_x23;
    if ((undefined8 *)*puRam0000000000a33358 != (undefined8 *)0x0) {
      puVar14 = (undefined8 *)*unaff_x26;
      puRam0000000000a33358 = (undefined8 *)*puRam0000000000a33358;
    }
    func_0x0003767c(puRam0000000000a33360,puVar14);
    lRam0000000000a33368 = lRam0000000000a33368 + 1;
LAB_00028c8c:
    *(int *)(unaff_x23 + 5) = (int)unaff_x22;
    *(int *)((long)unaff_x23 + 0x2c) = (int)uVar5;
    unaff_x23[6] = 0;
  }
  else {
    puVar14 = (undefined8 *)0xa33360;
    puVar12 = puRam0000000000a33360;
    do {
      puVar8 = puVar12 + 1;
      if (uVar6 <= (ulong)puVar12[4]) {
        puVar14 = puVar12;
        puVar8 = puVar12;
      }
      puVar12 = (undefined8 *)*puVar8;
    } while (puVar12 != (undefined8 *)0x0);
    if ((puVar14 == (undefined8 *)0xa33360) || (uVar6 < (ulong)puVar14[4])) goto LAB_00028bd4;
  }
  func_0x006e1d54();
  iVar3 = func_0x006e22d0();
  if (iVar3 == 0) {
    iVar3 = func_0x006e22d0();
    if (iVar3 != 0) {
      uVar9 = func_0x006e644c();
      __ZNSt3__16localeD1Ev(&uStack0000000000000008);
      uVar9 = __Unwind_Resume(uVar9);
      uStack_48 = 0xa33360;
      puStack_50 = unaff_x26;
      uStack_40 = unaff_x24;
      puStack_38 = unaff_x23;
      uStack_30 = unaff_x22;
      uStack_28 = uVar5;
      uVar5 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
      uVar5 = func_0x00086db4(uVar5,"restorefunction",0xf);
      uVar5 = func_0x00086db4(uVar5," @ ",3);
      uVar5 = func_0x00086db4(uVar5,"/Users/x0rch/hydrogen-m/src/lua/libs/newclosure.h",0x31);
      uVar5 = func_0x00086db4(uVar5,":",1);
      plVar10 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar5,0x188);
      __ZNKSt3__18ios_base6getlocEv(&uStack_60,(long)plVar10 + *(long *)(*plVar10 + -0x18));
      plVar11 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                                  (&uStack_60,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
      uVar5 = (**(code **)(*plVar11 + 0x38))(plVar11,10);
      __ZNSt3__16localeD1Ev(&uStack_60);
      __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar10,uVar5);
      __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar10);
      func_0x006e69bc(uVar9,1,7);
      uVar6 = func_0x006e3790(uVar9,1);
      if (puRam0000000000a33360 == (undefined8 *)0x0) {
        return 0;
      }
      puVar14 = (undefined8 *)0xa33360;
      puVar12 = puRam0000000000a33360;
      do {
        puVar8 = puVar12 + 1;
        if (uVar6 <= (ulong)puVar12[4]) {
          puVar14 = puVar12;
          puVar8 = puVar12;
        }
        puVar12 = (undefined8 *)*puVar8;
      } while (puVar12 != (undefined8 *)0x0);
      if (puVar14 == (undefined8 *)0xa33360) {
        return 0;
      }
      puVar12 = puRam0000000000a33360;
      if (uVar6 < (ulong)puVar14[4]) {
        return 0;
      }
      do {
        while( true ) {
          puVar14 = puVar12;
          if ((ulong)puVar14[4] <= uVar6) break;
          puVar12 = (undefined8 *)*puVar14;
          if ((undefined8 *)*puVar14 == (undefined8 *)0x0) {
            puVar12 = puVar14;
            goto LAB_000297f8;
          }
        }
        if (uVar6 <= (ulong)puVar14[4]) goto LAB_00029850;
        puVar12 = (undefined8 *)puVar14[1];
      } while ((undefined8 *)puVar14[1] != (undefined8 *)0x0);
      puVar12 = puVar14 + 1;
LAB_000297f8:
      puVar8 = (undefined8 *)__Znwm(0x38);
      puVar8[5] = 0;
      puVar8[6] = 0;
      puVar8[4] = uVar6;
      *puVar8 = 0;
      puVar8[1] = 0;
      puVar8[2] = puVar14;
      *puVar12 = puVar8;
      puVar14 = puVar8;
      if ((undefined8 *)*puRam0000000000a33358 != (undefined8 *)0x0) {
        puVar14 = (undefined8 *)*puVar12;
        puRam0000000000a33358 = (undefined8 *)*puRam0000000000a33358;
      }
      func_0x0003767c(puRam0000000000a33360,puVar14);
      lRam0000000000a33368 = lRam0000000000a33368 + 1;
      puVar14 = puVar8;
LAB_00029850:
      uStack_58 = puVar14[6];
      uStack_60 = puVar14[5];
      func_0x0002a764(&uStack_60,uVar9);
      if ((extraout_x1 & 0xff) == 0) {
        func_0x006e644c(uVar9,"Cannot obtain original function to unhook.");
      }
      else if (((int)uStack_58 == uStack_58._4_4_) &&
              (func_0x0002a764(&uStack_60,uVar9), (extraout_x1_00 & 0xff) != 0)) {
        auVar19 = func_0x0002a764(&uStack_60,uVar9);
        if ((auVar19._8_8_ & 0xff) != 0) {
          if (*(char *)(auVar19._0_8_ + 3) == '\0') {
            auVar19 = func_0x0002a764(&uStack_60,uVar9);
            lVar13 = auVar19._0_8_;
            if ((auVar19._8_8_ & 0xff) != 0) {
              *(undefined8 *)(uVar6 + 0x10) = *(undefined8 *)(lVar13 + 0x10);
              *(undefined2 *)(uVar6 + 5) = *(undefined2 *)(lVar13 + 5);
              if (*(char *)(lVar13 + 4) == '\0') {
                bVar16 = 0;
              }
              else {
                uVar15 = 0;
                puVar12 = (undefined8 *)(lVar13 + 0x20);
                puVar8 = (undefined8 *)(uVar6 + 0x20);
                do {
                  uVar5 = *puVar12;
                  puVar8[1] = puVar12[1];
                  *puVar8 = uVar5;
                  uVar15 = uVar15 + 1;
                  bVar16 = *(byte *)(lVar13 + 4);
                  puVar12 = puVar12 + 2;
                  puVar8 = puVar8 + 2;
                } while (uVar15 < bVar16);
              }
              *(byte *)(uVar6 + 4) = bVar16;
              *(undefined8 *)(uVar6 + 0x18) = *(undefined8 *)(lVar13 + 0x18);
code_r0x00029a54:
              if (0 < (int)uStack_60) {
                func_0x006e5bd0(uVar9);
              }
              goto code_r0x00029a6c;
            }
          }
          else {
            if ((int)uStack_58 == 0) {
              puVar12 = puRam0000000000a33378;
              if (puRam0000000000a33378 == (undefined8 *)0x0) {
                puVar8 = (undefined8 *)0xa33378;
                puVar17 = (undefined8 *)0xa33378;
              }
              else {
                do {
                  while( true ) {
                    puVar14 = puVar12;
                    puVar8 = puVar14;
                    if ((ulong)puVar14[4] <= uVar6) break;
                    puVar12 = (undefined8 *)*puVar14;
                    puVar17 = puVar14;
                    if ((undefined8 *)*puVar14 == (undefined8 *)0x0) goto code_r0x000299c0;
                  }
                  if (uVar6 <= (ulong)puVar14[4]) goto code_r0x00029a14;
                  puVar12 = (undefined8 *)puVar14[1];
                } while ((undefined8 *)puVar14[1] != (undefined8 *)0x0);
                puVar17 = puVar14 + 1;
              }
code_r0x000299c0:
              puVar14 = (undefined8 *)__Znwm(0x30);
              puVar14[4] = uVar6;
              *(undefined4 *)(puVar14 + 5) = 0;
              *puVar14 = 0;
              puVar14[1] = 0;
              puVar14[2] = puVar8;
              *puVar17 = puVar14;
              puVar12 = puVar14;
              if ((undefined8 *)*puRam0000000000a33370 != (undefined8 *)0x0) {
                puVar12 = (undefined8 *)*puVar17;
                puRam0000000000a33370 = (undefined8 *)*puRam0000000000a33370;
              }
              func_0x0003767c(puRam0000000000a33378,puVar12);
              lRam0000000000a33380 = lRam0000000000a33380 + 1;
code_r0x00029a14:
              *(int *)(puVar14 + 5) = (int)uStack_60;
code_r0x00029a6c:
              if (0 < uStack_60._4_4_) {
                func_0x006e5bd0(uVar9);
              }
              goto LAB_00029a7c;
            }
            auVar19 = func_0x0002a764(&uStack_60,uVar9);
            lVar13 = auVar19._0_8_;
            if ((auVar19._8_8_ & 0xff) != 0) {
              *(undefined **)(uVar6 + 0x18) = &DAT_00037c90;
              *(ulong *)(uVar6 + 0x20) = (long)&DAT_00037c98 - (uVar6 + 0x20);
              *(undefined8 *)(uVar6 + 0x10) = *(undefined8 *)(lVar13 + 0x10);
              *(undefined2 *)(uVar6 + 5) = *(undefined2 *)(lVar13 + 5);
              if (*(char *)(lVar13 + 4) == '\0') {
                bVar16 = 0;
              }
              else {
                uVar15 = 0;
                puVar12 = (undefined8 *)(lVar13 + 0x30);
                puVar8 = (undefined8 *)(uVar6 + 0x30);
                do {
                  uVar5 = *puVar12;
                  puVar8[1] = puVar12[1];
                  *puVar8 = uVar5;
                  uVar15 = uVar15 + 1;
                  bVar16 = *(byte *)(lVar13 + 4);
                  puVar12 = puVar12 + 2;
                  puVar8 = puVar8 + 2;
                } while (uVar15 < bVar16);
              }
              *(byte *)(uVar6 + 4) = bVar16;
              *(undefined8 *)(uVar6 + 0x18) = *(undefined8 *)(lVar13 + 0x18);
              *(ulong *)(uVar6 + 0x20) = lVar13 + 0x20 + (*(long *)(lVar13 + 0x20) - (uVar6 + 0x20))
              ;
              goto code_r0x00029a54;
            }
          }
        }
      }
      else {
LAB_00029a7c:
        if ((int)uStack_58 != 1 || uStack_58._4_4_ != 0) {
code_r0x00029c34:
          if (puRam0000000000a33360 != (undefined8 *)0x0) {
            puVar14 = (undefined8 *)0xa33360;
            puVar12 = puRam0000000000a33360;
            do {
              puVar8 = puVar12 + 1;
              if (uVar6 <= (ulong)puVar12[4]) {
                puVar14 = puVar12;
                puVar8 = puVar12;
              }
              puVar12 = (undefined8 *)*puVar8;
            } while (puVar12 != (undefined8 *)0x0);
            if ((puVar14 != (undefined8 *)0xa33360) && ((ulong)puVar14[4] <= uVar6)) {
              puVar14 = (undefined8 *)0xa33360;
              puVar12 = puRam0000000000a33360;
              do {
                puVar8 = puVar12 + 1;
                if (uVar6 <= (ulong)puVar12[4]) {
                  puVar14 = puVar12;
                  puVar8 = puVar12;
                }
                puVar12 = (undefined8 *)*puVar8;
              } while (puVar12 != (undefined8 *)0x0);
              if ((puVar14 != (undefined8 *)0xa33360) && ((ulong)puVar14[4] <= uVar6)) {
                puVar12 = (undefined8 *)puVar14[1];
                if ((undefined8 *)puVar14[1] == (undefined8 *)0x0) {
                  puVar12 = puVar14;
                  do {
                    puVar8 = (undefined8 *)puVar12[2];
                    bVar2 = (undefined8 *)*puVar8 != puVar12;
                    puVar12 = puVar8;
                  } while (bVar2);
                }
                else {
                  do {
                    puVar8 = puVar12;
                    puVar12 = (undefined8 *)*puVar8;
                  } while ((undefined8 *)*puVar8 != (undefined8 *)0x0);
                }
                if (puRam0000000000a33358 == puVar14) {
                  puRam0000000000a33358 = puVar8;
                }
                lRam0000000000a33368 = lRam0000000000a33368 + -1;
                func_0x00037ca0(puRam0000000000a33360,puVar14);
                __ZdlPv(puVar14);
              }
            }
          }
          return 0;
        }
        if (puRam0000000000a33378 != (undefined8 *)0x0) {
          puVar12 = (undefined8 *)0xa33378;
          puVar8 = puRam0000000000a33378;
          do {
            puVar17 = puVar8 + 1;
            if (uVar6 <= (ulong)puVar8[4]) {
              puVar12 = puVar8;
              puVar17 = puVar8;
            }
            puVar8 = (undefined8 *)*puVar17;
          } while (puVar8 != (undefined8 *)0x0);
          if ((puVar12 != (undefined8 *)0xa33378) && ((ulong)puVar12[4] <= uVar6)) {
            puVar14 = (undefined8 *)0xa33378;
            puVar12 = puRam0000000000a33378;
            do {
              puVar8 = puVar12 + 1;
              if (uVar6 <= (ulong)puVar12[4]) {
                puVar14 = puVar12;
                puVar8 = puVar12;
              }
              puVar12 = (undefined8 *)*puVar8;
            } while (puVar12 != (undefined8 *)0x0);
            if ((puVar14 != (undefined8 *)0xa33378) && ((ulong)puVar14[4] <= uVar6)) {
              puVar12 = (undefined8 *)puVar14[1];
              if ((undefined8 *)puVar14[1] == (undefined8 *)0x0) {
                puVar12 = puVar14;
                do {
                  puVar8 = (undefined8 *)puVar12[2];
                  bVar2 = (undefined8 *)*puVar8 != puVar12;
                  puVar12 = puVar8;
                } while (bVar2);
              }
              else {
                do {
                  puVar8 = puVar12;
                  puVar12 = (undefined8 *)*puVar8;
                } while ((undefined8 *)*puVar8 != (undefined8 *)0x0);
              }
              if (puRam0000000000a33370 == puVar14) {
                puRam0000000000a33370 = puVar8;
              }
              lRam0000000000a33380 = lRam0000000000a33380 + -1;
              func_0x00037ca0(puRam0000000000a33378,puVar14);
              __ZdlPv(puVar14);
            }
          }
        }
        auVar19 = func_0x0002a764(&uStack_60,uVar9);
        lVar13 = auVar19._0_8_;
        if ((auVar19._8_8_ & 0xff) != 0) {
          *(undefined **)(uVar6 + 0x18) = &DAT_00038064;
          *(ulong *)(uVar6 + 0x20) = (long)&DAT_0003806c - (uVar6 + 0x20);
          *(undefined8 *)(uVar6 + 0x10) = *(undefined8 *)(lVar13 + 0x10);
          *(undefined2 *)(uVar6 + 5) = *(undefined2 *)(lVar13 + 5);
          if (*(char *)(lVar13 + 4) == '\0') {
            bVar16 = 0;
          }
          else {
            uVar15 = 0;
            puVar14 = (undefined8 *)(lVar13 + 0x30);
            puVar12 = (undefined8 *)(uVar6 + 0x30);
            do {
              uVar5 = *puVar14;
              puVar12[1] = puVar14[1];
              *puVar12 = uVar5;
              uVar15 = uVar15 + 1;
              bVar16 = *(byte *)(lVar13 + 4);
              puVar14 = puVar14 + 2;
              puVar12 = puVar12 + 2;
            } while (uVar15 < bVar16);
          }
          *(byte *)(uVar6 + 4) = bVar16;
          *(undefined8 *)(uVar6 + 0x18) = *(undefined8 *)(lVar13 + 0x18);
          *(ulong *)(uVar6 + 0x20) = lVar13 + 0x20 + (*(long *)(lVar13 + 0x20) - (uVar6 + 0x20));
          if (0 < (int)uStack_60) {
            func_0x006e5bd0(uVar9);
          }
          if (0 < uStack_60._4_4_) {
            func_0x006e5bd0(uVar9);
          }
          goto code_r0x00029c34;
        }
      }
      uVar5 = func_0x00023168();
      __ZNSt3__16localeD1Ev(&uStack_60);
      uVar9 = __Unwind_Resume(uVar5);
      uStack_90 = 0xa33000;
      puStack_68 = &DAT_00029d68;
      puStack_88 = puVar14;
      uStack_80 = uVar6;
      uStack_78 = uVar5;
      lStack_70 = (long)register0x00000008 + -0x10;
      uVar5 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
      uVar5 = func_0x00086db4(uVar5,"isfunctionhooked",0x10);
      uVar5 = func_0x00086db4(uVar5," @ ",3);
      uVar5 = func_0x00086db4(uVar5,"/Users/x0rch/hydrogen-m/src/lua/libs/newclosure.h",0x31);
      uVar5 = func_0x00086db4(uVar5,":",1);
      plVar10 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar5,0x1e6);
      __ZNKSt3__18ios_base6getlocEv(auStack_98,(long)plVar10 + *(long *)(*plVar10 + -0x18));
      plVar11 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                                  (auStack_98,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
      uVar5 = (**(code **)(*plVar11 + 0x38))(plVar11,10);
      __ZNSt3__16localeD1Ev(auStack_98);
      __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar10,uVar5);
      __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar10);
      func_0x006e69bc(uVar9,1,7);
      uVar6 = func_0x006e3790(uVar9,1);
      if (puRam0000000000a33360 != (undefined8 *)0x0) {
        puVar14 = (undefined8 *)0xa33360;
        puVar12 = puRam0000000000a33360;
        do {
          puVar8 = puVar12 + 1;
          if (uVar6 <= (ulong)puVar12[4]) {
            puVar14 = puVar12;
            puVar8 = puVar12;
          }
          puVar12 = (undefined8 *)*puVar8;
        } while (puVar12 != (undefined8 *)0x0);
        if ((puVar14 != (undefined8 *)0xa33360) && ((ulong)puVar14[4] <= uVar6)) {
          uVar5 = 1;
          goto code_r0x00029ea0;
        }
      }
      uVar5 = 0;
code_r0x00029ea0:
      func_0x006e3c24(uVar9,uVar5);
      return 1;
    }
    iVar3 = func_0x006e22d0();
    if (iVar3 == 0) {
      lVar13 = func_0x006e3790();
      bVar16 = *(byte *)(lVar13 + 4);
      lVar13 = func_0x006e3790();
      if (*(byte *)(lVar13 + 4) < bVar16) goto code_r0x00028e14;
    }
    else {
code_r0x00028e14:
      func_0x006e3af8();
      func_0x006e2154();
      func_0x006e4c80();
    }
    lVar13 = func_0x006e3790();
    lVar7 = func_0x006e3790();
    *(undefined8 *)(lVar13 + 0x10) = *(undefined8 *)(lVar7 + 0x10);
    *(undefined2 *)(lVar13 + 5) = *(undefined2 *)(lVar7 + 5);
    if (*(char *)(lVar7 + 4) == '\0') {
      bVar16 = 0;
    }
    else {
      uVar6 = 0;
      puVar14 = (undefined8 *)(lVar7 + 0x20);
      puVar12 = (undefined8 *)(lVar13 + 0x20);
      do {
        uVar5 = *puVar14;
        puVar12[1] = puVar14[1];
        *puVar12 = uVar5;
        uVar6 = uVar6 + 1;
        bVar16 = *(byte *)(lVar7 + 4);
        puVar14 = puVar14 + 2;
        puVar12 = puVar12 + 2;
      } while (uVar6 < bVar16);
    }
    *(byte *)(lVar13 + 4) = bVar16;
    *(undefined8 *)(lVar13 + 0x18) = *(undefined8 *)(lVar7 + 0x18);
    uVar6 = func_0x006e3790();
    puVar14 = puRam0000000000a33360;
    if (puRam0000000000a33360 == (undefined8 *)0x0) {
      puVar12 = (undefined8 *)0xa33360;
      puVar17 = (undefined8 *)0xa33360;
    }
    else {
      do {
        while( true ) {
          puVar8 = puVar14;
          puVar12 = puVar8;
          if ((ulong)puVar8[4] <= uVar6) break;
          puVar14 = (undefined8 *)*puVar8;
          puVar17 = puVar8;
          if ((undefined8 *)*puVar8 == (undefined8 *)0x0) goto LAB_00029420;
        }
        if (uVar6 <= (ulong)puVar8[4]) goto LAB_00029474;
        puVar14 = (undefined8 *)puVar8[1];
      } while ((undefined8 *)puVar8[1] != (undefined8 *)0x0);
      puVar17 = puVar8 + 1;
    }
LAB_00029420:
    puVar8 = (undefined8 *)__Znwm(0x38);
    puVar8[5] = 0;
    puVar8[6] = 0;
    puVar8[4] = uVar6;
    *puVar8 = 0;
    puVar8[1] = 0;
    puVar8[2] = puVar12;
    *puVar17 = puVar8;
    puVar14 = puVar8;
    if ((undefined8 *)*puRam0000000000a33358 != (undefined8 *)0x0) {
      puVar14 = (undefined8 *)*puVar17;
      puRam0000000000a33358 = (undefined8 *)*puRam0000000000a33358;
    }
    func_0x0003767c(puRam0000000000a33360,puVar14);
    lRam0000000000a33368 = lRam0000000000a33368 + 1;
LAB_00029474:
    uVar18 = *(uint *)(puVar8 + 5);
    lVar13 = func_0x006e1c18();
    uVar6 = func_0x006e3790();
    puVar14 = puRam0000000000a33360;
    if (puRam0000000000a33360 == (undefined8 *)0x0) {
      puVar12 = (undefined8 *)0xa33360;
      puVar17 = (undefined8 *)0xa33360;
    }
    else {
      do {
        while( true ) {
          puVar8 = puVar14;
          puVar12 = puVar8;
          if ((ulong)puVar8[4] <= uVar6) break;
          puVar14 = (undefined8 *)*puVar8;
          puVar17 = puVar8;
          if ((undefined8 *)*puVar8 == (undefined8 *)0x0) goto LAB_000294dc;
        }
        if (uVar6 <= (ulong)puVar8[4]) goto LAB_00029530;
        puVar14 = (undefined8 *)puVar8[1];
      } while ((undefined8 *)puVar8[1] != (undefined8 *)0x0);
      puVar17 = puVar8 + 1;
    }
LAB_000294dc:
    puVar8 = (undefined8 *)__Znwm(0x38);
    puVar8[5] = 0;
    puVar8[6] = 0;
    puVar8[4] = uVar6;
    *puVar8 = 0;
    puVar8[1] = 0;
    puVar8[2] = puVar12;
    *puVar17 = puVar8;
    puVar14 = puVar8;
    if ((undefined8 *)*puRam0000000000a33358 != (undefined8 *)0x0) {
      puVar14 = (undefined8 *)*puVar17;
      puRam0000000000a33358 = (undefined8 *)*puRam0000000000a33358;
    }
    func_0x0003767c(puRam0000000000a33360,puVar14);
    lRam0000000000a33368 = lRam0000000000a33368 + 1;
LAB_00029530:
    puVar8[5] = (ulong)uVar18 | lVar13 << 0x20;
    puVar8[6] = 0x200000002;
LAB_00029618:
    **(undefined8 **)(unaff_x19 + 8) = unaff_x20;
    lVar13 = *(long *)(unaff_x19 + 8);
    *(undefined4 *)(lVar13 + 0xc) = 7;
    *(long *)(unaff_x19 + 8) = lVar13 + 0x10;
    return 1;
  }
  iVar3 = func_0x006e22d0();
  if (iVar3 == 0) {
code_r0x00028d38:
    func_0x006e3af8();
    func_0x006e2154();
    func_0x006e4c80();
    func_0x006e3790();
    iVar3 = func_0x00037830();
  }
  else {
    func_0x006e3790();
    uVar6 = func_0x00037830();
    if ((uVar6 & 1) == 0) goto code_r0x00028d38;
    func_0x006e2154();
    func_0x006e3790();
    iVar3 = func_0x00037830();
  }
  if (iVar3 == 0) {
    uVar6 = func_0x006e3790();
    for (puVar14 = puRam0000000000a33378; puVar14 != (undefined8 *)0x0;
        puVar14 = (undefined8 *)*puVar14) {
      while ((ulong)puVar14[4] <= uVar6) {
        if (uVar6 <= (ulong)puVar14[4]) {
          uVar4 = *(undefined4 *)(puVar14 + 5);
          uVar6 = func_0x006e3790();
          puVar14 = puRam0000000000a33360;
          if (puRam0000000000a33360 != (undefined8 *)0x0) goto code_r0x00028ee4;
          puVar12 = (undefined8 *)0xa33360;
          puVar17 = (undefined8 *)0xa33360;
          goto code_r0x00028f08;
        }
        puVar14 = (undefined8 *)puVar14[1];
        if (puVar14 == (undefined8 *)0x0) goto code_r0x000290d0;
      }
    }
  }
  else {
    uVar6 = func_0x006e3790();
    for (puVar14 = puRam0000000000a33378; puVar14 != (undefined8 *)0x0;
        puVar14 = (undefined8 *)*puVar14) {
      while ((ulong)puVar14[4] <= uVar6) {
        if (uVar6 <= (ulong)puVar14[4]) {
          uVar18 = *(uint *)(puVar14 + 5);
          unaff_x23 = (undefined8 *)(ulong)uVar18;
          uVar6 = func_0x006e3790();
          puVar14 = puRam0000000000a33378;
          goto joined_r0x000290a4;
        }
        puVar14 = (undefined8 *)puVar14[1];
        if (puVar14 == (undefined8 *)0x0) goto code_r0x000290d0;
      }
    }
  }
code_r0x000290d0:
  uVar18 = (uint)unaff_x23;
  func_0x0002a824("map::at:  key not found");
  puVar14 = extraout_x8;
code_r0x000290dc:
  uVar4 = *(undefined4 *)(puVar14 + 5);
  uVar6 = func_0x006e3790();
  puVar14 = puRam0000000000a33360;
  if (puRam0000000000a33360 == (undefined8 *)0x0) {
    puVar12 = (undefined8 *)0xa33360;
    puVar17 = (undefined8 *)0xa33360;
  }
  else {
    do {
      while( true ) {
        puVar8 = puVar14;
        puVar12 = puVar8;
        if ((ulong)puVar8[4] <= uVar6) break;
        puVar14 = (undefined8 *)*puVar8;
        puVar17 = puVar8;
        if ((undefined8 *)*puVar8 == (undefined8 *)0x0) goto code_r0x00029134;
      }
      if (uVar6 <= (ulong)puVar8[4]) goto code_r0x00029188;
      puVar14 = (undefined8 *)puVar8[1];
    } while ((undefined8 *)puVar8[1] != (undefined8 *)0x0);
    puVar17 = puVar8 + 1;
  }
code_r0x00029134:
  puVar8 = (undefined8 *)__Znwm(0x38);
  puVar8[5] = 0;
  puVar8[6] = 0;
  puVar8[4] = uVar6;
  *puVar8 = 0;
  puVar8[1] = 0;
  puVar8[2] = puVar12;
  *puVar17 = puVar8;
  puVar14 = puVar8;
  if ((undefined8 *)*puRam0000000000a33358 != (undefined8 *)0x0) {
    puVar14 = (undefined8 *)*puVar17;
    puRam0000000000a33358 = (undefined8 *)*puRam0000000000a33358;
  }
  func_0x0003767c(puRam0000000000a33360,puVar14);
  lRam0000000000a33368 = lRam0000000000a33368 + 1;
code_r0x00029188:
  uVar1 = *(undefined4 *)(puVar8 + 5);
  uVar6 = func_0x006e3790();
  puVar14 = puRam0000000000a33360;
  if (puRam0000000000a33360 == (undefined8 *)0x0) {
    puVar12 = (undefined8 *)0xa33360;
    puVar17 = (undefined8 *)0xa33360;
  }
  else {
    do {
      while( true ) {
        puVar8 = puVar14;
        puVar12 = puVar8;
        if ((ulong)puVar8[4] <= uVar6) break;
        puVar14 = (undefined8 *)*puVar8;
        puVar17 = puVar8;
        if ((undefined8 *)*puVar8 == (undefined8 *)0x0) goto LAB_000291e0;
      }
      if (uVar6 <= (ulong)puVar8[4]) goto LAB_00029234;
      puVar14 = (undefined8 *)puVar8[1];
    } while ((undefined8 *)puVar8[1] != (undefined8 *)0x0);
    puVar17 = puVar8 + 1;
  }
LAB_000291e0:
  puVar8 = (undefined8 *)__Znwm(0x38);
  puVar8[5] = 0;
  puVar8[6] = 0;
  puVar8[4] = uVar6;
  *puVar8 = 0;
  puVar8[1] = 0;
  puVar8[2] = puVar12;
  *puVar17 = puVar8;
  puVar14 = puVar8;
  if ((undefined8 *)*puRam0000000000a33358 != (undefined8 *)0x0) {
    puVar14 = (undefined8 *)*puVar17;
    puRam0000000000a33358 = (undefined8 *)*puRam0000000000a33358;
  }
  func_0x0003767c(puRam0000000000a33360,puVar14);
  lRam0000000000a33368 = lRam0000000000a33368 + 1;
LAB_00029234:
  *(undefined4 *)(puVar8 + 5) = uVar1;
  *(undefined4 *)((long)puVar8 + 0x2c) = uVar4;
  puVar8[6] = 0;
  uVar6 = func_0x006e3790();
  puVar14 = puRam0000000000a33378;
  if (puRam0000000000a33378 == (undefined8 *)0x0) {
    puVar12 = (undefined8 *)0xa33378;
    puVar17 = (undefined8 *)0xa33378;
  }
  else {
    do {
      while( true ) {
        puVar8 = puVar14;
        puVar12 = puVar8;
        if ((ulong)puVar8[4] <= uVar6) break;
        puVar14 = (undefined8 *)*puVar8;
        puVar17 = puVar8;
        if ((undefined8 *)*puVar8 == (undefined8 *)0x0) goto LAB_00029298;
      }
      if (uVar6 <= (ulong)puVar8[4]) goto LAB_000292ec;
      puVar14 = (undefined8 *)puVar8[1];
    } while ((undefined8 *)puVar8[1] != (undefined8 *)0x0);
    puVar17 = puVar8 + 1;
  }
LAB_00029298:
  puVar8 = (undefined8 *)__Znwm(0x30);
  puVar8[4] = uVar6;
  *(undefined4 *)(puVar8 + 5) = 0;
  *puVar8 = 0;
  puVar8[1] = 0;
  puVar8[2] = puVar12;
  *puVar17 = puVar8;
  puVar14 = puVar8;
  if ((undefined8 *)*puRam0000000000a33370 != (undefined8 *)0x0) {
    puVar14 = (undefined8 *)*puVar17;
    puRam0000000000a33370 = (undefined8 *)*puRam0000000000a33370;
  }
  func_0x0003767c(puRam0000000000a33378,puVar14);
  lRam0000000000a33380 = lRam0000000000a33380 + 1;
LAB_000292ec:
  *(undefined4 *)(puVar8 + 5) = uVar4;
  **(undefined8 **)(unaff_x19 + 8) = unaff_x20;
  lVar13 = *(long *)(unaff_x19 + 8);
  *(undefined4 *)(lVar13 + 0xc) = 7;
  *(long *)(unaff_x19 + 8) = lVar13 + 0x10;
  uVar6 = func_0x006e3790();
  puVar14 = puRam0000000000a33378;
  if (puRam0000000000a33378 == (undefined8 *)0x0) {
    puVar12 = (undefined8 *)0xa33378;
    puVar17 = (undefined8 *)0xa33378;
  }
  else {
    do {
      while( true ) {
        puVar8 = puVar14;
        puVar12 = puVar8;
        if ((ulong)puVar8[4] <= uVar6) break;
        puVar14 = (undefined8 *)*puVar8;
        puVar17 = puVar8;
        if ((undefined8 *)*puVar8 == (undefined8 *)0x0) goto LAB_00029360;
      }
      if (uVar6 <= (ulong)puVar8[4]) goto LAB_000293b4;
      puVar14 = (undefined8 *)puVar8[1];
    } while ((undefined8 *)puVar8[1] != (undefined8 *)0x0);
    puVar17 = puVar8 + 1;
  }
LAB_00029360:
  puVar8 = (undefined8 *)__Znwm(0x30);
  puVar8[4] = uVar6;
  *(undefined4 *)(puVar8 + 5) = 0;
  *puVar8 = 0;
  puVar8[1] = 0;
  puVar8[2] = puVar12;
  *puVar17 = puVar8;
  puVar14 = puVar8;
  if ((undefined8 *)*puRam0000000000a33370 != (undefined8 *)0x0) {
    puVar14 = (undefined8 *)*puVar17;
    puRam0000000000a33370 = (undefined8 *)*puRam0000000000a33370;
  }
  func_0x0003767c(puRam0000000000a33378,puVar14);
  lRam0000000000a33380 = lRam0000000000a33380 + 1;
LAB_000293b4:
  *(uint *)(puVar8 + 5) = uVar18;
  return 1;
  while( true ) {
    if (uVar6 <= (ulong)puVar8[4]) goto code_r0x00028f58;
    puVar14 = (undefined8 *)puVar8[1];
    if ((undefined8 *)puVar8[1] == (undefined8 *)0x0) break;
code_r0x00028ee4:
    puVar8 = puVar14;
    puVar12 = puVar8;
    if (uVar6 < (ulong)puVar8[4]) {
      puVar14 = (undefined8 *)*puVar8;
      puVar17 = puVar8;
      if ((undefined8 *)*puVar8 == (undefined8 *)0x0) goto code_r0x00028f08;
      goto code_r0x00028ee4;
    }
  }
  puVar17 = puVar8 + 1;
code_r0x00028f08:
  puVar8 = (undefined8 *)__Znwm(0x38);
  puVar8[5] = 0;
  puVar8[6] = 0;
  puVar8[4] = uVar6;
  *puVar8 = 0;
  puVar8[1] = 0;
  puVar8[2] = puVar12;
  *puVar17 = puVar8;
  puVar14 = puVar8;
  if ((undefined8 *)*puRam0000000000a33358 != (undefined8 *)0x0) {
    puVar14 = (undefined8 *)*puVar17;
    puRam0000000000a33358 = (undefined8 *)*puRam0000000000a33358;
  }
  func_0x0003767c(puRam0000000000a33360,puVar14);
  lRam0000000000a33368 = lRam0000000000a33368 + 1;
code_r0x00028f58:
  uVar1 = *(undefined4 *)(puVar8 + 5);
  uVar6 = func_0x006e3790();
  puVar14 = puRam0000000000a33360;
  if (puRam0000000000a33360 == (undefined8 *)0x0) {
    puVar12 = (undefined8 *)0xa33360;
    puVar17 = (undefined8 *)0xa33360;
  }
  else {
    do {
      while( true ) {
        puVar8 = puVar14;
        puVar12 = puVar8;
        if ((ulong)puVar8[4] <= uVar6) break;
        puVar14 = (undefined8 *)*puVar8;
        puVar17 = puVar8;
        if ((undefined8 *)*puVar8 == (undefined8 *)0x0) goto LAB_00028fb0;
      }
      if (uVar6 <= (ulong)puVar8[4]) goto LAB_00029000;
      puVar14 = (undefined8 *)puVar8[1];
    } while ((undefined8 *)puVar8[1] != (undefined8 *)0x0);
    puVar17 = puVar8 + 1;
  }
LAB_00028fb0:
  puVar8 = (undefined8 *)__Znwm(0x38);
  puVar8[5] = 0;
  puVar8[6] = 0;
  puVar8[4] = uVar6;
  *puVar8 = 0;
  puVar8[1] = 0;
  puVar8[2] = puVar12;
  *puVar17 = puVar8;
  puVar14 = puVar8;
  if ((undefined8 *)*puRam0000000000a33358 != (undefined8 *)0x0) {
    puVar14 = (undefined8 *)*puVar17;
    puRam0000000000a33358 = (undefined8 *)*puRam0000000000a33358;
  }
  func_0x0003767c(puRam0000000000a33360,puVar14);
  lRam0000000000a33368 = lRam0000000000a33368 + 1;
LAB_00029000:
  *(undefined4 *)(puVar8 + 5) = uVar1;
  *(undefined4 *)((long)puVar8 + 0x2c) = uVar4;
  puVar8[6] = _UNK_007fc080;
  uVar6 = func_0x006e3790();
  lVar13 = func_0x006e3790();
  *(undefined **)(uVar6 + 0x18) = &DAT_00037c80;
  *(ulong *)(uVar6 + 0x20) = (long)&DAT_00037c88 - (uVar6 + 0x20);
  *(undefined8 *)(uVar6 + 0x10) = *(undefined8 *)(lVar13 + 0x10);
  *(undefined1 *)(uVar6 + 5) = *(undefined1 *)(lVar13 + 5);
  *(undefined1 *)(uVar6 + 6) = *(undefined1 *)(lVar13 + 6);
  if (*(char *)(lVar13 + 4) == '\0') {
    bVar16 = 0;
  }
  else {
    uVar15 = 0;
    puVar14 = (undefined8 *)(lVar13 + 0x30);
    puVar12 = (undefined8 *)(uVar6 + 0x30);
    do {
      uVar5 = *puVar14;
      puVar12[1] = puVar14[1];
      *puVar12 = uVar5;
      uVar15 = uVar15 + 1;
      bVar16 = *(byte *)(lVar13 + 4);
      puVar14 = puVar14 + 2;
      puVar12 = puVar12 + 2;
    } while (uVar15 < bVar16);
  }
  *(byte *)(uVar6 + 4) = bVar16;
  *(undefined8 *)(uVar6 + 0x18) = *(undefined8 *)(lVar13 + 0x18);
  *(ulong *)(uVar6 + 0x20) = lVar13 + 0x20 + (*(long *)(lVar13 + 0x20) - (uVar6 + 0x20));
  uVar4 = func_0x006e1c18();
  puVar14 = puRam0000000000a33378;
  if (puRam0000000000a33378 == (undefined8 *)0x0) {
    puVar12 = (undefined8 *)0xa33378;
    puVar17 = (undefined8 *)0xa33378;
  }
  else {
    do {
      while( true ) {
        puVar8 = puVar14;
        puVar12 = puVar8;
        if ((ulong)puVar8[4] <= uVar6) break;
        puVar14 = (undefined8 *)*puVar8;
        puVar17 = puVar8;
        if ((undefined8 *)*puVar8 == (undefined8 *)0x0) goto code_r0x000295c0;
      }
      if (uVar6 <= (ulong)puVar8[4]) goto code_r0x00029614;
      puVar14 = (undefined8 *)puVar8[1];
    } while ((undefined8 *)puVar8[1] != (undefined8 *)0x0);
    puVar17 = puVar8 + 1;
  }
code_r0x000295c0:
  puVar8 = (undefined8 *)__Znwm(0x30);
  puVar8[4] = uVar6;
  *(undefined4 *)(puVar8 + 5) = 0;
  *puVar8 = 0;
  puVar8[1] = 0;
  puVar8[2] = puVar12;
  *puVar17 = puVar8;
  puVar14 = puVar8;
  if ((undefined8 *)*puRam0000000000a33370 != (undefined8 *)0x0) {
    puVar14 = (undefined8 *)*puVar17;
    puRam0000000000a33370 = (undefined8 *)*puRam0000000000a33370;
  }
  func_0x0003767c(puRam0000000000a33378,puVar14);
  lRam0000000000a33380 = lRam0000000000a33380 + 1;
code_r0x00029614:
  *(undefined4 *)(puVar8 + 5) = uVar4;
  goto LAB_00029618;
joined_r0x000290a4:
  if (puVar14 != (undefined8 *)0x0) {
    if (uVar6 < (ulong)puVar14[4]) {
      puVar14 = (undefined8 *)*puVar14;
    }
    else {
      if (uVar6 <= (ulong)puVar14[4]) goto code_r0x000290dc;
      puVar14 = (undefined8 *)puVar14[1];
    }
    goto joined_r0x000290a4;
  }
  goto code_r0x000290d0;
}

