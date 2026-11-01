
bool FUN_0064591c(undefined8 param_1,undefined8 param_2,long *param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 param_6)

{
  int iVar1;
  undefined8 uVar2;
  ulong uVar3;
  long *extraout_x1;
  uint uVar4;
  long unaff_x29;
  undefined *apuStack_1a0 [2];
  ulong uStack_190;
  ulong uStack_188;
  long lStack_180;
  ulong uStack_170;
  ulong uStack_168;
  long lStack_160;
  undefined *apuStack_150 [2];
  ulong uStack_140;
  ulong uStack_138;
  long lStack_130;
  undefined *apuStack_120 [2];
  ulong uStack_110;
  ulong uStack_108;
  long lStack_100;
  undefined *apuStack_f0 [2];
  ulong uStack_e0;
  ulong uStack_d8;
  long lStack_d0;
  undefined *apuStack_c0 [2];
  ulong uStack_b0;
  ulong uStack_a8;
  long lStack_a0;
  undefined *apuStack_90 [2];
  ulong uStack_80;
  ulong uStack_78;
  long lStack_70;
  
  func_0x00087574(unaff_x29 + -0x70);
  uVar2 = __Unwind_Resume();
  func_0x00087574(unaff_x29 + -0x70);
  __Unwind_Resume(uVar2);
  uVar2 = (**(code **)(*extraout_x1 + 0xa0))(extraout_x1);
  iVar1 = func_0x00609ec8(param_5,uVar2);
  if (iVar1 < 0) {
    func_0x005fe1e8(apuStack_1a0,1);
    iVar1 = func_0x00609ec8(param_5,apuStack_1a0);
    if ((iVar1 < 0) || (iVar1 = func_0x00609ec8(param_6,uVar2), -1 < iVar1)) {
      uVar4 = 1;
    }
    else {
      func_0x005fe1e8(apuStack_90,1);
      uVar3 = func_0x00609ec8(param_6,apuStack_90);
      uVar4 = (uint)(uVar3 >> 0x1f) & 1;
      apuStack_90[0] = &UNK_009f5d60;
      uVar3 = uStack_80;
      if (uStack_78 <= uStack_80) {
        uVar3 = uStack_78;
      }
      if (lStack_70 != 0) {
        if (uVar3 != 0) {
          do {
            *(undefined8 *)(lStack_70 + -8 + uVar3 * 8) = 0;
            uVar3 = uVar3 - 1;
          } while (uVar3 != 0);
        }
        func_0x00611644();
      }
    }
    apuStack_1a0[0] = &UNK_009f5d60;
    uVar3 = uStack_190;
    if (uStack_188 <= uStack_190) {
      uVar3 = uStack_188;
    }
    if (lStack_180 != 0) {
      if (uVar3 != 0) {
        do {
          *(undefined8 *)(lStack_180 + -8 + uVar3 * 8) = 0;
          uVar3 = uVar3 - 1;
        } while (uVar3 != 0);
      }
      func_0x00611644();
    }
    if (uVar4 == 0) {
      func_0x0060aaf0(apuStack_90,param_6,uVar2);
      func_0x00608730(apuStack_1a0,param_4,apuStack_90);
      func_0x0060986c(apuStack_c0,apuStack_1a0,uVar2);
      apuStack_1a0[0] = &UNK_009f5d60;
      uVar3 = uStack_190;
      if (uStack_188 <= uStack_190) {
        uVar3 = uStack_188;
      }
      if (lStack_180 != 0) {
        if (uVar3 != 0) {
          do {
            *(undefined8 *)(lStack_180 + -8 + uVar3 * 8) = 0;
            uVar3 = uVar3 - 1;
          } while (uVar3 != 0);
        }
        func_0x00611644();
      }
      func_0x00608730(apuStack_1a0,param_5,apuStack_90);
      func_0x0060986c(apuStack_f0,apuStack_1a0,uVar2);
      apuStack_1a0[0] = &UNK_009f5d60;
      uVar3 = uStack_190;
      if (uStack_188 <= uStack_190) {
        uVar3 = uStack_188;
      }
      if (lStack_180 != 0) {
        if (uVar3 != 0) {
          do {
            *(undefined8 *)(lStack_180 + -8 + uVar3 * 8) = 0;
            uVar3 = uVar3 - 1;
          } while (uVar3 != 0);
        }
        func_0x00611644();
      }
      (**(code **)(*param_3 + 0x38))(apuStack_1a0,param_3,apuStack_c0,apuStack_f0);
      (**(code **)(*extraout_x1 + 0xd8))(apuStack_150,extraout_x1,apuStack_1a0);
      func_0x0060986c(apuStack_120,apuStack_150,uVar2);
      iVar1 = func_0x00609ec8(param_5,apuStack_120);
      apuStack_120[0] = &UNK_009f5d60;
      if (uStack_108 <= uStack_110) {
        uStack_110 = uStack_108;
      }
      if (lStack_100 != 0) {
        if (uStack_110 != 0) {
          do {
            *(undefined8 *)(lStack_100 + -8 + uStack_110 * 8) = 0;
            uStack_110 = uStack_110 - 1;
          } while (uStack_110 != 0);
        }
        func_0x00611644();
      }
      apuStack_150[0] = &UNK_009f5d60;
      if (uStack_138 <= uStack_140) {
        uStack_140 = uStack_138;
      }
      if (lStack_130 != 0) {
        if (uStack_140 != 0) {
          do {
            *(undefined8 *)(lStack_130 + -8 + uStack_140 * 8) = 0;
            uStack_140 = uStack_140 - 1;
          } while (uStack_140 != 0);
        }
        func_0x00611644();
      }
      apuStack_1a0[0] = &UNK_00a09a70;
      if (uStack_168 <= uStack_170) {
        uStack_170 = uStack_168;
      }
      if (lStack_160 != 0) {
        if (uStack_170 != 0) {
          do {
            *(undefined8 *)(lStack_160 + -8 + uStack_170 * 8) = 0;
            uStack_170 = uStack_170 - 1;
          } while (uStack_170 != 0);
        }
        func_0x00611644();
      }
      if (uStack_188 <= uStack_190) {
        uStack_190 = uStack_188;
      }
      if (lStack_180 != 0) {
        if (uStack_190 != 0) {
          do {
            *(undefined8 *)(lStack_180 + -8 + uStack_190 * 8) = 0;
            uStack_190 = uStack_190 - 1;
          } while (uStack_190 != 0);
        }
        func_0x00611644();
      }
      apuStack_f0[0] = &UNK_009f5d60;
      if (uStack_d8 <= uStack_e0) {
        uStack_e0 = uStack_d8;
      }
      if (lStack_d0 != 0) {
        if (uStack_e0 != 0) {
          do {
            *(undefined8 *)(lStack_d0 + -8 + uStack_e0 * 8) = 0;
            uStack_e0 = uStack_e0 - 1;
          } while (uStack_e0 != 0);
        }
        func_0x00611644();
      }
      apuStack_c0[0] = &UNK_009f5d60;
      if (uStack_a8 <= uStack_b0) {
        uStack_b0 = uStack_a8;
      }
      if (lStack_a0 != 0) {
        if (uStack_b0 != 0) {
          do {
            *(undefined8 *)(lStack_a0 + -8 + uStack_b0 * 8) = 0;
            uStack_b0 = uStack_b0 - 1;
          } while (uStack_b0 != 0);
        }
        func_0x00611644();
      }
      apuStack_90[0] = &UNK_009f5d60;
      if (uStack_78 <= uStack_80) {
        uStack_80 = uStack_78;
      }
      if (lStack_70 == 0) {
        return iVar1 == 0;
      }
      if (uStack_80 != 0) {
        do {
          *(undefined8 *)(lStack_70 + -8 + uStack_80 * 8) = 0;
          uStack_80 = uStack_80 - 1;
        } while (uStack_80 != 0);
      }
      func_0x00611644();
      return iVar1 == 0;
    }
  }
  return false;
}

