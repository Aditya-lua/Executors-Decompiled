
undefined8 FUN_0066be28(long param_1)

{
  int iVar1;
  undefined1 in_ZR;
  long lVar2;
  long *plVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  long in_x9;
  ulong uVar7;
  long in_x10;
  long *unaff_x19;
  int unaff_w20;
  long unaff_x21;
  long lVar8;
  int unaff_w22;
  long lVar9;
  ulong unaff_x24;
  undefined2 uVar10;
  undefined8 uVar11;
  long lStack0000000000000018;
  
  do {
    if (!(bool)in_ZR) {
      in_x10 = in_x9;
    }
    unaff_x19[0x10] = param_1;
    unaff_x19[0x11] = in_x10;
    do {
      (**(code **)(*unaff_x19 + 0x1e0))();
      uVar7 = unaff_x19[7];
      lVar8 = unaff_x19[8];
      unaff_x24 = unaff_x24 - uVar7;
      if (unaff_x24 < lVar8 + uVar7) {
LAB_0066bf24:
        if (unaff_x24 < lVar8 + uVar7) {
          uVar6 = unaff_x19[0x10];
          uVar7 = unaff_x24 - uVar6;
        }
        else {
          uVar11 = CONCAT17(POPCOUNT((char)(uVar7 >> 0x38)),
                            CONCAT16(POPCOUNT((char)(uVar7 >> 0x30)),
                                     CONCAT15(POPCOUNT((char)(uVar7 >> 0x28)),
                                              CONCAT14(POPCOUNT((char)(uVar7 >> 0x20)),
                                                       CONCAT13(POPCOUNT((char)(uVar7 >> 0x18)),
                                                                CONCAT12(POPCOUNT((char)(uVar7 >> 
                                                  0x10)),CONCAT11(POPCOUNT((char)(uVar7 >> 8)),
                                                                  POPCOUNT((char)uVar7))))))));
          uVar10 = NEON_uaddlv(uVar11,1);
          uVar5 = 0;
          if (uVar7 != 0) {
            uVar5 = (unaff_x24 - lVar8) / uVar7;
          }
          uVar5 = uVar5 * uVar7;
          if ((int)CONCAT62((int6)((ulong)uVar11 >> 0x10),uVar10) == 1) {
            uVar5 = unaff_x24 - lVar8 & -uVar7;
          }
          lVar8 = 0x1e0;
          if (unaff_w22 == 0) {
            lVar8 = 0x1d8;
          }
          (**(code **)(*unaff_x19 + lVar8))();
          unaff_x21 = unaff_x21 + uVar5;
          uVar6 = unaff_x19[0x10];
          uVar7 = (unaff_x24 - uVar5) - uVar6;
        }
        if ((unaff_x21 != 0) && (uVar7 != 0)) {
          lVar8 = unaff_x19[0xd] + unaff_x19[0xc];
          lVar4 = 0;
          if ((ulong)(lVar8 - unaff_x19[0x11]) <= uVar6) {
            lVar4 = unaff_x19[0xc];
          }
          lVar4 = unaff_x19[0x11] + (uVar6 - lVar4);
          uVar6 = lVar8 - lVar4;
          uVar5 = uVar6;
          if (uVar7 <= uVar6) {
            uVar5 = uVar7;
          }
          _memcpy(lVar4,unaff_x21,uVar5);
          if (uVar6 <= uVar7 && uVar7 - uVar6 != 0) {
            _memcpy(unaff_x19[0xd],unaff_x21 + uVar6,uVar7 - uVar6);
          }
          unaff_x19[0x10] = unaff_x19[0x10] + uVar7;
        }
        if (unaff_w20 != 0) {
          if (((char)unaff_x19[9] == '\0') && (unaff_x19[6] == 0)) {
            (**(code **)(*unaff_x19 + 0x1c8))();
            lVar8 = unaff_x19[0x10];
            if (lVar8 == 0) goto LAB_0066c0c0;
LAB_0066c028:
            lStack0000000000000018 = func_0x006115d0(lVar8);
            if (lStack0000000000000018 != 0) {
              uVar5 = unaff_x19[0x10];
              lVar2 = unaff_x19[0x11];
              lVar4 = unaff_x19[0xd] + unaff_x19[0xc];
              uVar6 = lVar4 - lVar2;
              uVar7 = uVar5;
              if (uVar6 <= uVar5) {
                uVar7 = uVar6;
              }
              if ((ulong)(unaff_x19[0xe] * unaff_x19[0xf]) <= uVar7) {
                uVar7 = unaff_x19[0xe] * unaff_x19[0xf];
              }
              unaff_x19[0x10] = uVar5 - uVar7;
              unaff_x19[0x11] = lVar2 + uVar7;
              if (uVar5 - uVar7 == 0 || lVar2 + uVar7 == lVar4) {
                unaff_x19[0x11] = unaff_x19[0xd];
              }
              _memcpy(lStack0000000000000018,lVar2,uVar7);
              _memcpy(lStack0000000000000018 + uVar7,unaff_x19[0x11],unaff_x19[0x10]);
              unaff_x19[0x10] = 0;
            }
          }
          else {
            lVar8 = unaff_x19[0x10];
            if (lVar8 != 0) goto LAB_0066c028;
LAB_0066c0c0:
            lStack0000000000000018 = 0;
          }
          (**(code **)(*unaff_x19 + 0x1e8))();
          *(undefined1 *)(unaff_x19 + 9) = 0;
          lVar9 = unaff_x19[6];
          lVar4 = unaff_x19[0xc];
          lVar2 = unaff_x19[0xd];
          if (lVar4 != lVar9) {
            if (lVar2 != 0) {
              if (lVar4 != 0) {
                do {
                  *(undefined1 *)(lVar2 + -1 + lVar4) = 0;
                  lVar4 = lVar4 + -1;
                } while (lVar4 != 0);
              }
              func_0x00611644();
            }
            if (lVar9 == 0) {
              lVar2 = 0;
            }
            else {
              lVar2 = func_0x006115d0(lVar9);
            }
          }
          unaff_x19[0xb] = -1;
          unaff_x19[0xc] = lVar9;
          unaff_x19[0xd] = lVar2;
          unaff_x19[0xe] = 1;
          unaff_x19[0xf] = lVar9;
          unaff_x19[0x10] = 0;
          unaff_x19[0x11] = lVar2;
          plVar3 = (long *)(**(code **)(*unaff_x19 + 0x160))();
          iVar1 = 0;
          if (unaff_w20 != 0) {
            iVar1 = unaff_w20 + -1;
          }
          lVar4 = (**(code **)(*plVar3 + 0x130))(plVar3,&UNK_008ba5c8,0,0,iVar1,1);
          *(uint *)(unaff_x19 + 5) = (uint)(lVar4 != 0);
          if (lStack0000000000000018 != 0) {
            if (lVar8 != 0) {
              do {
                *(undefined1 *)(lStack0000000000000018 + -1 + lVar8) = 0;
                lVar8 = lVar8 + -1;
              } while (lVar8 != 0);
            }
            func_0x00611644();
          }
        }
        return 0;
      }
      uVar5 = unaff_x19[0x10];
      if (uVar5 < uVar7) {
        if (uVar5 != 0) {
          uVar7 = uVar7 - uVar5;
          if (unaff_x21 != 0) {
            lVar8 = unaff_x19[0xd] + unaff_x19[0xc];
            lVar4 = 0;
            if ((ulong)(lVar8 - unaff_x19[0x11]) <= uVar5) {
              lVar4 = unaff_x19[0xc];
            }
            uVar5 = lVar8 - (unaff_x19[0x11] + (uVar5 - lVar4));
            _memcpy();
            if (uVar5 <= uVar7 && uVar7 - uVar5 != 0) {
              _memcpy(unaff_x19[0xd],unaff_x21 + uVar5,uVar7 - uVar5);
            }
            uVar5 = unaff_x19[0x10] + uVar7;
            unaff_x19[0x10] = uVar5;
          }
          unaff_x21 = unaff_x21 + uVar7;
          uVar7 = unaff_x19[0xe];
          if (uVar7 <= uVar5) {
            lVar8 = unaff_x19[0xd];
            if (unaff_x19[0x11] + uVar7 != unaff_x19[0xd] + unaff_x19[0xc]) {
              lVar8 = unaff_x19[0x11] + uVar7;
            }
            unaff_x19[0x10] = uVar5 - uVar7;
            unaff_x19[0x11] = lVar8;
          }
          (**(code **)(*unaff_x19 + 0x1e0))();
          uVar7 = unaff_x19[7];
          lVar8 = unaff_x19[8];
          unaff_x24 = unaff_x24 - uVar7;
        }
        goto LAB_0066bf24;
      }
      uVar7 = unaff_x19[0xe];
      param_1 = uVar5 - uVar7;
    } while (uVar5 < uVar7);
    in_x9 = unaff_x19[0x11] + uVar7;
    in_x10 = unaff_x19[0xd];
    in_ZR = in_x9 == in_x10 + unaff_x19[0xc];
  } while( true );
}

