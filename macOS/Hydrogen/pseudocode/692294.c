
void FUN_00692294(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 param_6)

{
  undefined8 uVar1;
  undefined8 extraout_x8;
  ulong uVar2;
  long unaff_x29;
  undefined1 auVar3 [16];
  undefined1 uStack0000000000000030;
  undefined1 uStack0000000000000060;
  undefined1 uStack0000000000000090;
  undefined1 uStack00000000000000c0;
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
  
  func_0x00087574(&uStack0000000000000030);
  func_0x00087574(&uStack0000000000000090);
  func_0x00087574(unaff_x29 + -0x70);
  uVar1 = __Unwind_Resume();
  func_0x00087574(unaff_x29 + -0x70);
  uVar1 = __Unwind_Resume(uVar1);
  func_0x00087574(unaff_x29 + -0xa0);
  func_0x00087574(&uStack0000000000000090);
  func_0x00087574(&uStack0000000000000060);
  func_0x00087574(&uStack0000000000000030);
  func_0x00087574(&uStack00000000000000c0);
  uVar1 = __Unwind_Resume(uVar1);
  func_0x00087574(&uStack0000000000000030);
  func_0x00087574(&uStack00000000000000c0);
  uVar1 = __Unwind_Resume(uVar1);
  func_0x00087574(&uStack00000000000000c0);
  auVar3 = __Unwind_Resume(uVar1);
  func_0x0060986c(apuStack_b0,auVar3._0_8_,param_4);
  func_0x0060a860(apuStack_80,apuStack_b0,auVar3._8_8_,param_4);
  apuStack_b0[0] = &UNK_009f5d60;
  uVar2 = uStack_a0;
  if (uStack_98 <= uStack_a0) {
    uVar2 = uStack_98;
  }
  if (lStack_90 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(lStack_90 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  func_0x0060986c(apuStack_e0,auVar3._0_8_,param_5);
  func_0x0060a860(apuStack_b0,apuStack_e0,param_3,param_5);
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
  func_0x0068f560(extraout_x8,apuStack_80,param_4,apuStack_b0,param_5,param_6);
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

