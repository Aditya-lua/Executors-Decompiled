
void FUN_00692514(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined8 extraout_x8;
  ulong uVar1;
  undefined1 auVar2 [16];
  undefined *apuStack_110 [2];
  ulong uStack_100;
  ulong uStack_f8;
  long lStack_f0;
  undefined *apuStack_e0 [2];
  ulong uStack_d0;
  ulong uStack_c8;
  long lStack_c0;
  undefined *apuStack_b0 [2];
  ulong uStack_a0;
  ulong uStack_98;
  long lStack_90;
  undefined *apuStack_80 [2];
  ulong uStack_70;
  ulong uStack_68;
  long lStack_60;
  
  auVar2 = __Unwind_Resume();
  func_0x005fe1e8(apuStack_e0,1);
  func_0x00607398(apuStack_b0,param_3,apuStack_e0);
  func_0x0060aaf0(apuStack_80,auVar2._8_8_,apuStack_b0);
  apuStack_b0[0] = &UNK_009f5d60;
  uVar1 = uStack_a0;
  if (uStack_98 <= uStack_a0) {
    uVar1 = uStack_98;
  }
  if (lStack_90 != 0) {
    if (uVar1 != 0) {
      do {
        *(undefined8 *)(lStack_90 + -8 + uVar1 * 8) = 0;
        uVar1 = uVar1 - 1;
      } while (uVar1 != 0);
    }
    func_0x00611644();
  }
  apuStack_e0[0] = &UNK_009f5d60;
  uVar1 = uStack_d0;
  if (uStack_c8 <= uStack_d0) {
    uVar1 = uStack_c8;
  }
  if (lStack_c0 != 0) {
    if (uVar1 != 0) {
      do {
        *(undefined8 *)(lStack_c0 + -8 + uVar1 * 8) = 0;
        uVar1 = uVar1 - 1;
      } while (uVar1 != 0);
    }
    func_0x00611644();
  }
  func_0x005fe1e8(apuStack_110,1);
  func_0x00607398(apuStack_e0,param_4,apuStack_110);
  func_0x0060aaf0(apuStack_b0,auVar2._8_8_,apuStack_e0);
  apuStack_e0[0] = &UNK_009f5d60;
  uVar1 = uStack_d0;
  if (uStack_c8 <= uStack_d0) {
    uVar1 = uStack_c8;
  }
  if (lStack_c0 != 0) {
    if (uVar1 != 0) {
      do {
        *(undefined8 *)(lStack_c0 + -8 + uVar1 * 8) = 0;
        uVar1 = uVar1 - 1;
      } while (uVar1 != 0);
    }
    func_0x00611644();
  }
  apuStack_110[0] = &UNK_009f5d60;
  if (uStack_f8 <= uStack_100) {
    uStack_100 = uStack_f8;
  }
  if (lStack_f0 != 0) {
    if (uStack_100 != 0) {
      do {
        *(undefined8 *)(lStack_f0 + -8 + uStack_100 * 8) = 0;
        uStack_100 = uStack_100 - 1;
      } while (uStack_100 != 0);
    }
    func_0x00611644();
  }
  func_0x0060aaf0(apuStack_e0,param_3,param_4);
  func_0x0069233c(extraout_x8,auVar2._0_8_,apuStack_80,apuStack_b0,param_3,param_4,apuStack_e0);
  apuStack_e0[0] = &UNK_009f5d60;
  if (uStack_c8 <= uStack_d0) {
    uStack_d0 = uStack_c8;
  }
  if (lStack_c0 != 0) {
    if (uStack_d0 != 0) {
      do {
        *(undefined8 *)(lStack_c0 + -8 + uStack_d0 * 8) = 0;
        uStack_d0 = uStack_d0 - 1;
      } while (uStack_d0 != 0);
    }
    func_0x00611644();
  }
  apuStack_b0[0] = &UNK_009f5d60;
  if (uStack_98 <= uStack_a0) {
    uStack_a0 = uStack_98;
  }
  if (lStack_90 != 0) {
    if (uStack_a0 != 0) {
      do {
        *(undefined8 *)(lStack_90 + -8 + uStack_a0 * 8) = 0;
        uStack_a0 = uStack_a0 - 1;
      } while (uStack_a0 != 0);
    }
    func_0x00611644();
  }
  apuStack_80[0] = &UNK_009f5d60;
  if (uStack_68 <= uStack_70) {
    uStack_70 = uStack_68;
  }
  if (lStack_60 != 0) {
    if (uStack_70 != 0) {
      do {
        *(undefined8 *)(lStack_60 + -8 + uStack_70 * 8) = 0;
        uStack_70 = uStack_70 - 1;
      } while (uStack_70 != 0);
    }
    func_0x00611644();
  }
  return;
}

