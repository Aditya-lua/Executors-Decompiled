
void FUN_00632b28(undefined8 param_1,undefined8 param_2,long param_3,undefined8 param_4)

{
  bool bVar1;
  int iVar2;
  undefined8 uVar3;
  long *plVar4;
  long lVar5;
  ulong uVar6;
  long lVar7;
  long lVar8;
  ulong uVar9;
  ulong uVar10;
  long unaff_x29;
  undefined1 auVar11 [16];
  undefined *apuStack_228 [2];
  ulong uStack_218;
  ulong uStack_210;
  long lStack_208;
  undefined *puStack_1f8;
  undefined *puStack_1f0;
  ulong uStack_1e0;
  ulong uStack_1d8;
  long lStack_1d0;
  undefined *puStack_1c0;
  ulong uStack_1b0;
  ulong uStack_1a8;
  long lStack_1a0;
  undefined *puStack_188;
  ulong uStack_178;
  ulong uStack_170;
  long lStack_168;
  undefined *apuStack_158 [2];
  ulong uStack_148;
  ulong uStack_140;
  long lStack_138;
  undefined *apuStack_128 [2];
  ulong uStack_118;
  ulong uStack_110;
  long lStack_108;
  undefined *apuStack_f8 [2];
  ulong uStack_e8;
  ulong uStack_e0;
  long lStack_d8;
  long lStack_58;
  long lStack_50;
  long lStack_48;
  long lStack_40;
  long *plStack_38;
  
  uVar3 = __Unwind_Resume();
  func_0x006335f4(unaff_x29 + -0x38);
  __Unwind_Resume(uVar3);
  auVar11 = func_0x0001753c();
  uVar10 = auVar11._8_8_;
  plVar4 = auVar11._0_8_;
  plStack_38 = plVar4 + 2;
  lVar5 = *plVar4;
  if ((ulong)((*plStack_38 - lVar5 >> 5) * -0x3333333333333333) < uVar10) {
    if (0x199999999999999 < uVar10) {
      uVar3 = func_0x00017f90(plVar4);
      func_0x006514b4(&lStack_58);
      __Unwind_Resume(uVar3);
      auVar11 = func_0x0001753c();
      lVar5 = auVar11._0_8_;
      plVar4 = (long *)(**(code **)(*auVar11._8_8_ + 0x28))(auVar11._8_8_);
      func_0x005fdd18(apuStack_f8);
      func_0x005fdd18(apuStack_128);
      func_0x005fe0b4(apuStack_158,param_4);
      iVar2 = (**(code **)(*plVar4 + 0x30))(plVar4);
      if (iVar2 == 0) {
        bVar1 = false;
      }
      else {
        bVar1 = 1 < *(uint *)(lVar5 + 0x78);
      }
      lVar7 = *(long *)(lVar5 + 0xb0);
      if ((ulong)((*(long *)(lVar5 + 0xb8) - lVar7 >> 4) * 0x6db6db6db6db6db7) < 2) {
        uVar10 = 0;
      }
      else {
        uVar6 = 1;
        uVar9 = 0;
        do {
          uVar10 = uVar6;
          func_0x00609138(apuStack_f8,apuStack_128,apuStack_158,*(undefined4 *)(lVar5 + 0x78));
          func_0x00600180(apuStack_128,apuStack_158);
          if ((bVar1) &&
             (iVar2 = func_0x005ffe3c(apuStack_f8,*(int *)(lVar5 + 0x78) + -1), iVar2 != 0)) {
            func_0x00605a2c(apuStack_158);
            uVar3 = (**(code **)(*plVar4 + 0x28))(plVar4,*(long *)(lVar5 + 0xb0) + uVar9 * 0x70);
            func_0x00607398(apuStack_228,lVar5 + 0x80,apuStack_f8);
            func_0x0065caac(&puStack_1f8,uVar3,apuStack_228);
            uVar6 = *(ulong *)(param_3 + 8);
            if (uVar6 < *(ulong *)(param_3 + 0x10)) {
              func_0x006517b4(uVar6,&puStack_1f8);
              lVar7 = uVar6 + 0xa0;
              *(long *)(param_3 + 8) = lVar7;
            }
            else {
              lVar7 = func_0x00651628(param_3,&puStack_1f8);
            }
            *(long *)(param_3 + 8) = lVar7;
            puStack_188 = &UNK_009f5d60;
            uVar6 = uStack_178;
            if (uStack_170 <= uStack_178) {
              uVar6 = uStack_170;
            }
            if (lStack_168 != 0) {
              if (uVar6 != 0) {
                do {
                  *(undefined8 *)(lStack_168 + -8 + uVar6 * 8) = 0;
                  uVar6 = uVar6 - 1;
                } while (uVar6 != 0);
              }
              func_0x00611644();
            }
            puStack_1f8 = &UNK_00a09a40;
            puStack_1c0 = &UNK_009f5d60;
            uVar6 = uStack_1b0;
            if (uStack_1a8 <= uStack_1b0) {
              uVar6 = uStack_1a8;
            }
            if (lStack_1a0 != 0) {
              if (uVar6 != 0) {
                do {
                  *(undefined8 *)(lStack_1a0 + -8 + uVar6 * 8) = 0;
                  uVar6 = uVar6 - 1;
                } while (uVar6 != 0);
              }
              func_0x00611644();
            }
            puStack_1f0 = &UNK_009f5d60;
            uVar6 = uStack_1e0;
            if (uStack_1d8 <= uStack_1e0) {
              uVar6 = uStack_1d8;
            }
            if (lStack_1d0 != 0) {
              if (uVar6 != 0) {
                do {
                  *(undefined8 *)(lStack_1d0 + -8 + uVar6 * 8) = 0;
                  uVar6 = uVar6 - 1;
                } while (uVar6 != 0);
              }
              func_0x00611644();
            }
            apuStack_228[0] = &UNK_009f5d60;
            uVar6 = uStack_218;
            if (uStack_210 <= uStack_218) {
              uVar6 = uStack_210;
            }
            if (lStack_208 != 0) {
              if (uVar6 != 0) {
                do {
                  *(undefined8 *)(lStack_208 + -8 + uVar6 * 8) = 0;
                  uVar6 = uVar6 - 1;
                } while (uVar6 != 0);
              }
              func_0x00611644();
            }
          }
          else {
            func_0x0065caac(&puStack_1f8,*(long *)(lVar5 + 0xb0) + uVar9 * 0x70,apuStack_f8);
            uVar6 = *(ulong *)(param_3 + 8);
            if (uVar6 < *(ulong *)(param_3 + 0x10)) {
              func_0x006517b4(uVar6,&puStack_1f8);
              lVar7 = uVar6 + 0xa0;
              *(long *)(param_3 + 8) = lVar7;
            }
            else {
              lVar7 = func_0x00651628(param_3,&puStack_1f8);
            }
            *(long *)(param_3 + 8) = lVar7;
            puStack_188 = &UNK_009f5d60;
            uVar6 = uStack_178;
            if (uStack_170 <= uStack_178) {
              uVar6 = uStack_170;
            }
            if (lStack_168 != 0) {
              if (uVar6 != 0) {
                do {
                  *(undefined8 *)(lStack_168 + -8 + uVar6 * 8) = 0;
                  uVar6 = uVar6 - 1;
                } while (uVar6 != 0);
              }
              func_0x00611644();
            }
            puStack_1f8 = &UNK_00a09a40;
            puStack_1c0 = &UNK_009f5d60;
            uVar6 = uStack_1b0;
            if (uStack_1a8 <= uStack_1b0) {
              uVar6 = uStack_1a8;
            }
            if (lStack_1a0 != 0) {
              if (uVar6 != 0) {
                do {
                  *(undefined8 *)(lStack_1a0 + -8 + uVar6 * 8) = 0;
                  uVar6 = uVar6 - 1;
                } while (uVar6 != 0);
              }
              func_0x00611644();
            }
            puStack_1f0 = &UNK_009f5d60;
            uVar6 = uStack_1e0;
            if (uStack_1d8 <= uStack_1e0) {
              uVar6 = uStack_1d8;
            }
            if (lStack_1d0 != 0) {
              if (uVar6 != 0) {
                do {
                  *(undefined8 *)(lStack_1d0 + -8 + uVar6 * 8) = 0;
                  uVar6 = uVar6 - 1;
                } while (uVar6 != 0);
              }
              func_0x00611644();
            }
          }
          uVar6 = (ulong)((int)uVar10 + 1);
          lVar7 = *(long *)(lVar5 + 0xb0);
          uVar9 = uVar10;
        } while (uVar6 < (ulong)((*(long *)(lVar5 + 0xb8) - lVar7 >> 4) * 0x6db6db6db6db6db7));
      }
      func_0x0065caac(&puStack_1f8,lVar7 + uVar10 * 0x70,apuStack_158);
      uVar10 = *(ulong *)(param_3 + 8);
      if (uVar10 < *(ulong *)(param_3 + 0x10)) {
        func_0x006517b4(uVar10,&puStack_1f8);
        lVar5 = uVar10 + 0xa0;
        *(long *)(param_3 + 8) = lVar5;
      }
      else {
        lVar5 = func_0x00651628(param_3,&puStack_1f8);
      }
      *(long *)(param_3 + 8) = lVar5;
      puStack_188 = &UNK_009f5d60;
      if (uStack_170 <= uStack_178) {
        uStack_178 = uStack_170;
      }
      if (lStack_168 != 0) {
        if (uStack_178 != 0) {
          do {
            *(undefined8 *)(lStack_168 + -8 + uStack_178 * 8) = 0;
            uStack_178 = uStack_178 - 1;
          } while (uStack_178 != 0);
        }
        func_0x00611644();
      }
      puStack_1f8 = &UNK_00a09a40;
      puStack_1c0 = &UNK_009f5d60;
      if (uStack_1a8 <= uStack_1b0) {
        uStack_1b0 = uStack_1a8;
      }
      if (lStack_1a0 != 0) {
        if (uStack_1b0 != 0) {
          do {
            *(undefined8 *)(lStack_1a0 + -8 + uStack_1b0 * 8) = 0;
            uStack_1b0 = uStack_1b0 - 1;
          } while (uStack_1b0 != 0);
        }
        func_0x00611644();
      }
      puStack_1f0 = &UNK_009f5d60;
      if (uStack_1d8 <= uStack_1e0) {
        uStack_1e0 = uStack_1d8;
      }
      if (lStack_1d0 != 0) {
        if (uStack_1e0 != 0) {
          do {
            *(undefined8 *)(lStack_1d0 + -8 + uStack_1e0 * 8) = 0;
            uStack_1e0 = uStack_1e0 - 1;
          } while (uStack_1e0 != 0);
        }
        func_0x00611644();
      }
      apuStack_158[0] = &UNK_009f5d60;
      if (uStack_140 <= uStack_148) {
        uStack_148 = uStack_140;
      }
      if (lStack_138 != 0) {
        if (uStack_148 != 0) {
          do {
            *(undefined8 *)(lStack_138 + -8 + uStack_148 * 8) = 0;
            uStack_148 = uStack_148 - 1;
          } while (uStack_148 != 0);
        }
        func_0x00611644();
      }
      apuStack_128[0] = &UNK_009f5d60;
      if (uStack_110 <= uStack_118) {
        uStack_118 = uStack_110;
      }
      if (lStack_108 != 0) {
        if (uStack_118 != 0) {
          do {
            *(undefined8 *)(lStack_108 + -8 + uStack_118 * 8) = 0;
            uStack_118 = uStack_118 - 1;
          } while (uStack_118 != 0);
        }
        func_0x00611644();
      }
      apuStack_f8[0] = &UNK_009f5d60;
      if (uStack_e0 <= uStack_e8) {
        uStack_e8 = uStack_e0;
      }
      if (lStack_d8 != 0) {
        if (uStack_e8 != 0) {
          do {
            *(undefined8 *)(lStack_d8 + -8 + uStack_e8 * 8) = 0;
            uStack_e8 = uStack_e8 - 1;
          } while (uStack_e8 != 0);
        }
        func_0x00611644();
      }
      return;
    }
    lVar7 = plVar4[1];
    lStack_58 = __Znwm(uVar10 * 0xa0);
    lStack_50 = lStack_58 + (lVar7 - lVar5);
    lStack_40 = lStack_58 + uVar10 * 0xa0;
    lStack_48 = lStack_50;
    func_0x0065139c(plVar4,&lStack_58);
    lVar5 = lStack_50;
    while (lStack_48 != lVar5) {
      lVar8 = lStack_48 + -0xa0;
      *(undefined **)(lStack_48 + -0x30) = &UNK_009f5d60;
      lVar7 = *(long *)(lStack_48 + -0x10);
      uVar10 = *(ulong *)(lStack_48 + -0x20);
      if (*(ulong *)(lStack_48 + -0x18) <= *(ulong *)(lStack_48 + -0x20)) {
        uVar10 = *(ulong *)(lStack_48 + -0x18);
      }
      lStack_48 = lVar8;
      if (lVar7 != 0) {
        if (uVar10 != 0) {
          do {
            *(undefined8 *)(lVar7 + -8 + uVar10 * 8) = 0;
            uVar10 = uVar10 - 1;
          } while (uVar10 != 0);
        }
        func_0x00611644();
      }
      func_0x0064f6d0(lVar8);
    }
    if (lStack_58 != 0) {
      __ZdlPv();
    }
  }
  return;
}

