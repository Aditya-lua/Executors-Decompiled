
void FUN_006927c4(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 extraout_x8;
  ulong uVar3;
  long unaff_x29;
  undefined1 auVar4 [16];
  undefined1 uStack0000000000000030;
  undefined1 uStack0000000000000060;
  undefined *apuStack_180 [2];
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
  
  func_0x00087574();
  func_0x00087574(unaff_x29 + -0x70);
  uVar2 = __Unwind_Resume();
  func_0x00087574(unaff_x29 + -0x70);
  uVar2 = __Unwind_Resume(uVar2);
  func_0x00087574(&uStack0000000000000060);
  func_0x00087574(&uStack0000000000000030);
  uVar2 = __Unwind_Resume(uVar2);
  func_0x00087574(&uStack0000000000000030);
  auVar4 = __Unwind_Resume(uVar2);
  uVar2 = auVar4._8_8_;
  func_0x00608730(apuStack_c0,uVar2);
  func_0x005fe1e8(apuStack_f0,4);
  func_0x00607398(apuStack_90,apuStack_c0,apuStack_f0);
  apuStack_f0[0] = &UNK_009f5d60;
  uVar3 = uStack_e0;
  if (uStack_d8 <= uStack_e0) {
    uVar3 = uStack_d8;
  }
  if (lStack_d0 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lStack_d0 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  apuStack_c0[0] = &UNK_009f5d60;
  uVar3 = uStack_b0;
  if (uStack_a8 <= uStack_b0) {
    uVar3 = uStack_a8;
  }
  if (lStack_a0 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lStack_a0 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  iVar1 = func_0x0068c6f4(apuStack_90,param_3);
  func_0x005fe1e8(apuStack_f0,(long)iVar1);
  func_0x00607398(apuStack_c0,param_3,apuStack_f0);
  apuStack_f0[0] = &UNK_009f5d60;
  uVar3 = uStack_e0;
  if (uStack_d8 <= uStack_e0) {
    uVar3 = uStack_d8;
  }
  if (lStack_d0 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lStack_d0 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  func_0x0060aaf0(apuStack_120,auVar4._0_8_,apuStack_c0);
  func_0x0068c96c(apuStack_f0,apuStack_120,uVar2,param_3);
  apuStack_120[0] = &UNK_009f5d60;
  uVar3 = uStack_110;
  if (uStack_108 <= uStack_110) {
    uVar3 = uStack_108;
  }
  if (lStack_100 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lStack_100 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  iVar1 = func_0x0068c6f4(apuStack_90,param_4);
  func_0x005fe1e8(apuStack_150,(long)iVar1);
  func_0x00607398(apuStack_120,param_4,apuStack_150);
  apuStack_150[0] = &UNK_009f5d60;
  uVar3 = uStack_140;
  if (uStack_138 <= uStack_140) {
    uVar3 = uStack_138;
  }
  if (lStack_130 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lStack_130 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  func_0x0060aaf0(apuStack_180,auVar4._0_8_,apuStack_120);
  func_0x0068c96c(apuStack_150,apuStack_180,uVar2,param_4);
  apuStack_180[0] = &UNK_009f5d60;
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
  func_0x0068f560(extraout_x8,apuStack_f0,param_3,apuStack_150,param_4,param_5);
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
  if (lStack_70 != 0) {
    if (uStack_80 != 0) {
      do {
        *(undefined8 *)(lStack_70 + -8 + uStack_80 * 8) = 0;
        uStack_80 = uStack_80 - 1;
      } while (uStack_80 != 0);
    }
    func_0x00611644();
  }
  return;
}

