
undefined8 * FUN_0063a024(void)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  long unaff_x29;
  undefined1 auVar3 [16];
  undefined1 auVar4 [12];
  undefined1 uStack0000000000000030;
  undefined1 uStack0000000000000060;
  undefined1 uStack00000000000000b0;
  long lStack00000000000000b8;
  long lStack00000000000000c0;
  undefined8 uStack00000000000000c8;
  
  _uStack00000000000000b0 = &UNK_009f6678;
  lStack00000000000000b8 = 0;
  lStack00000000000000c0 = 0;
  uStack00000000000000c8 = 0;
  func_0x00613128(&uStack00000000000000b0);
  func_0x0063945c();
  _uStack00000000000000b0 = &UNK_009f6678;
  puVar1 = (undefined8 *)0x0;
  if (lStack00000000000000b8 != 0) {
    lStack00000000000000c0 = lStack00000000000000b8;
    puVar1 = (undefined8 *)__ZdlPv();
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
    return puVar1;
  }
  auVar4 = ___stack_chk_fail();
  uVar2 = auVar4._0_8_;
  if (auVar4._8_4_ != 0) {
    uVar2 = func_0x0001753c(uVar2);
    func_0x00087574(&uStack0000000000000030);
    func_0x0062ec4c(&uStack0000000000000060);
    func_0x0065556c(&uStack00000000000000b0);
    func_0x00613f64(unaff_x29 + -0x60);
    uVar2 = __Unwind_Resume(uVar2);
  }
  auVar3 = __Unwind_Resume(uVar2);
  puVar1 = auVar3._0_8_;
  *(undefined4 *)(puVar1 + 1) = 0;
  *puVar1 = &UNK_00a015c0;
  puVar1[2] = &UNK_00a09b58;
  func_0x00655478(puVar1 + 3);
  func_0x00630464(puVar1 + 0x18);
  *puVar1 = &UNK_009fb320;
  puVar1[0x2d] = &UNK_009f6678;
  puVar1[0x2e] = 0;
  puVar1[0x2f] = 0;
  puVar1[0x30] = 0;
  func_0x005fdd18(puVar1 + 0x31);
  func_0x005fdd18(puVar1 + 0x37);
  *(undefined2 *)(puVar1 + 0x3d) = 0x100;
  func_0x00639fd4(puVar1,auVar3._8_8_);
  return puVar1;
}

