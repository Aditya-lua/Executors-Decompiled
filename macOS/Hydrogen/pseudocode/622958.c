
void FUN_00622958(long param_1,long *param_2,ulong param_3,long param_4,undefined8 param_5)

{
  bool bVar1;
  int iVar2;
  undefined8 uVar3;
  long *plVar4;
  long lVar5;
  long extraout_x1;
  ulong uVar6;
  long unaff_x20;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  undefined1 auVar10 [16];
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  undefined *apuStack_188 [2];
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
  undefined *apuStack_c8 [2];
  ulong uStack_b8;
  ulong uStack_b0;
  long lStack_a8;
  undefined *apuStack_98 [2];
  ulong uStack_88;
  ulong uStack_80;
  long lStack_78;
  
  if ((ulong)((param_1 >> 5) * -0x5555555555555555) < param_3) {
    if (0x2aaaaaaaaaaaaaa < param_3) {
      uVar3 = func_0x00017f90(param_2);
      func_0x0064bf18(&uStack0000000000000008);
      auVar10 = __Unwind_Resume(uVar3);
      lVar7 = auVar10._0_8_;
      plVar4 = (long *)(**(code **)(*auVar10._8_8_ + 0x28))(auVar10._8_8_);
      func_0x005fdd18(apuStack_98);
      func_0x005fdd18(apuStack_c8);
      func_0x005fe0b4(apuStack_f8,param_5);
      iVar2 = (**(code **)(*plVar4 + 0x30))(plVar4);
      if (iVar2 == 0) {
        bVar1 = false;
      }
      else {
        bVar1 = 1 < *(uint *)(lVar7 + 0x38);
      }
      lVar5 = *(long *)(lVar7 + 0x70);
      if ((ulong)((*(long *)(lVar7 + 0x78) - lVar5 >> 4) * -0x5555555555555555) < 2) {
        uVar9 = 0;
      }
      else {
        uVar6 = 1;
        uVar8 = 0;
        do {
          uVar9 = uVar6;
          func_0x00609138(apuStack_98,apuStack_c8,apuStack_f8,*(undefined4 *)(lVar7 + 0x38));
          func_0x00600180(apuStack_c8,apuStack_f8);
          if ((bVar1) &&
             (iVar2 = func_0x005ffe3c(apuStack_98,*(int *)(lVar7 + 0x38) + -1), iVar2 != 0)) {
            func_0x00605a2c(apuStack_f8);
            uVar3 = (**(code **)(*plVar4 + 0x28))(plVar4,*(long *)(lVar7 + 0x70) + uVar8 * 0x30);
            func_0x00607398(apuStack_188,lVar7 + 0x40,apuStack_98);
            func_0x005fe0b4(apuStack_158,uVar3);
            func_0x005fe0b4(apuStack_128,apuStack_188);
            uVar6 = *(ulong *)(param_4 + 8);
            if (uVar6 < *(ulong *)(param_4 + 0x10)) {
              func_0x005fe0b4(uVar6,apuStack_158);
              func_0x005fe0b4(uVar6 + 0x30,apuStack_128);
              lVar5 = uVar6 + 0x60;
              *(long *)(param_4 + 8) = lVar5;
            }
            else {
              lVar5 = func_0x0064c34c(param_4,apuStack_158);
            }
            *(long *)(param_4 + 8) = lVar5;
            apuStack_128[0] = &UNK_009f5d60;
            uVar6 = uStack_118;
            if (uStack_110 <= uStack_118) {
              uVar6 = uStack_110;
            }
            if (lStack_108 != 0) {
              if (uVar6 != 0) {
                do {
                  *(undefined8 *)(lStack_108 + -8 + uVar6 * 8) = 0;
                  uVar6 = uVar6 - 1;
                } while (uVar6 != 0);
              }
              func_0x00611644();
            }
            apuStack_158[0] = &UNK_009f5d60;
            uVar6 = uStack_148;
            if (uStack_140 <= uStack_148) {
              uVar6 = uStack_140;
            }
            if (lStack_138 != 0) {
              if (uVar6 != 0) {
                do {
                  *(undefined8 *)(lStack_138 + -8 + uVar6 * 8) = 0;
                  uVar6 = uVar6 - 1;
                } while (uVar6 != 0);
              }
              func_0x00611644();
            }
            apuStack_188[0] = &UNK_009f5d60;
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
          }
          else {
            func_0x005fe0b4(apuStack_158,*(long *)(lVar7 + 0x70) + uVar8 * 0x30);
            func_0x005fe0b4(apuStack_128,apuStack_98);
            uVar6 = *(ulong *)(param_4 + 8);
            if (uVar6 < *(ulong *)(param_4 + 0x10)) {
              func_0x005fe0b4(uVar6,apuStack_158);
              func_0x005fe0b4(uVar6 + 0x30,apuStack_128);
              lVar5 = uVar6 + 0x60;
              *(long *)(param_4 + 8) = lVar5;
            }
            else {
              lVar5 = func_0x0064c34c(param_4,apuStack_158);
            }
            *(long *)(param_4 + 8) = lVar5;
            apuStack_128[0] = &UNK_009f5d60;
            uVar6 = uStack_118;
            if (uStack_110 <= uStack_118) {
              uVar6 = uStack_110;
            }
            if (lStack_108 != 0) {
              if (uVar6 != 0) {
                do {
                  *(undefined8 *)(lStack_108 + -8 + uVar6 * 8) = 0;
                  uVar6 = uVar6 - 1;
                } while (uVar6 != 0);
              }
              func_0x00611644();
            }
            apuStack_158[0] = &UNK_009f5d60;
            uVar6 = uStack_148;
            if (uStack_140 <= uStack_148) {
              uVar6 = uStack_140;
            }
            if (lStack_138 != 0) {
              if (uVar6 != 0) {
                do {
                  *(undefined8 *)(lStack_138 + -8 + uVar6 * 8) = 0;
                  uVar6 = uVar6 - 1;
                } while (uVar6 != 0);
              }
              func_0x00611644();
            }
          }
          uVar6 = (ulong)((int)uVar9 + 1);
          lVar5 = *(long *)(lVar7 + 0x70);
          uVar8 = uVar9;
        } while (uVar6 < (ulong)((*(long *)(lVar7 + 0x78) - lVar5 >> 4) * -0x5555555555555555));
      }
      func_0x005fe0b4(apuStack_158,lVar5 + uVar9 * 0x30);
      func_0x005fe0b4(apuStack_128,apuStack_f8);
      uVar9 = *(ulong *)(param_4 + 8);
      if (uVar9 < *(ulong *)(param_4 + 0x10)) {
        func_0x005fe0b4(uVar9,apuStack_158);
        func_0x005fe0b4(uVar9 + 0x30,apuStack_128);
        lVar7 = uVar9 + 0x60;
        *(long *)(param_4 + 8) = lVar7;
      }
      else {
        lVar7 = func_0x0064c34c(param_4,apuStack_158);
      }
      *(long *)(param_4 + 8) = lVar7;
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
      apuStack_c8[0] = &UNK_009f5d60;
      if (uStack_b0 <= uStack_b8) {
        uStack_b8 = uStack_b0;
      }
      if (lStack_a8 != 0) {
        if (uStack_b8 != 0) {
          do {
            *(undefined8 *)(lStack_a8 + -8 + uStack_b8 * 8) = 0;
            uStack_b8 = uStack_b8 - 1;
          } while (uStack_b8 != 0);
        }
        func_0x00611644();
      }
      apuStack_98[0] = &UNK_009f5d60;
      if (uStack_80 <= uStack_88) {
        uStack_88 = uStack_80;
      }
      if (lStack_78 != 0) {
        if (uStack_88 != 0) {
          do {
            *(undefined8 *)(lStack_78 + -8 + uStack_88 * 8) = 0;
            uStack_88 = uStack_88 - 1;
          } while (uStack_88 != 0);
        }
        func_0x00611644();
      }
      return;
    }
    lVar7 = param_2[1];
    uStack0000000000000008 = __Znwm(param_3 * 0x60);
    in_stack_00000010 = uStack0000000000000008 + (lVar7 - unaff_x20);
    in_stack_00000020 = uStack0000000000000008 + param_3 * 0x60;
    in_stack_00000018 = in_stack_00000010;
    func_0x0064bf4c();
    lVar7 = param_2[2];
    lVar5 = param_2[1];
    uStack0000000000000008 = *param_2;
    *param_2 = extraout_x1;
    param_2[2] = in_stack_00000020;
    param_2[1] = in_stack_00000018;
    in_stack_00000010 = uStack0000000000000008;
    in_stack_00000018 = lVar5;
    in_stack_00000020 = lVar7;
    func_0x0064c1b0(&uStack0000000000000008,uStack0000000000000008);
    if (uStack0000000000000008 != 0) {
      __ZdlPv();
    }
  }
  return;
}

