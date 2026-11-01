
undefined8 * FUN_006658dc(void)

{
  long lVar1;
  ulong uVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  undefined8 *unaff_x22;
  undefined8 unaff_x24;
  undefined1 *unaff_x29;
  undefined1 auVar5 [16];
  undefined1 auVar6 [12];
  
  while( true ) {
    func_0x0060bf40(unaff_x19[2],(undefined1 *)((long)register0x00000008 + 0x30),unaff_x21);
    uVar2 = func_0x006129e8((undefined1 *)((long)register0x00000008 + 0x30));
    if ((uVar2 & 1) == 0) {
      *(undefined8 *)((long)register0x00000008 + 0x20) = 0;
      *(undefined8 *)((long)register0x00000008 + 0x28) = 0;
      *(undefined8 *)((long)register0x00000008 + 0x18) = 0xffffffffffffffff;
      func_0x00612524((undefined1 *)((long)register0x00000008 + 0x30),
                      (undefined1 *)((long)register0x00000008 + 0x10),
                      (undefined1 *)((long)register0x00000008 + 0xc));
      lVar1 = *(long *)((long)register0x00000008 + 0x28);
      uVar2 = *(ulong *)((long)register0x00000008 + 0x18);
      if (*(ulong *)((long)register0x00000008 + 0x20) <= *(ulong *)((long)register0x00000008 + 0x18)
         ) {
        uVar2 = *(ulong *)((long)register0x00000008 + 0x20);
      }
      if (lVar1 != 0) {
        if (uVar2 != 0) {
          do {
            *(undefined1 *)(lVar1 + -1 + uVar2) = 0;
            uVar2 = uVar2 - 1;
          } while (uVar2 != 0);
        }
        func_0x00611644();
      }
    }
    func_0x00612a40((undefined1 *)((long)register0x00000008 + 0x30));
    func_0x00613f64((undefined1 *)((long)register0x00000008 + 0x30));
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) break;
    auVar6 = ___stack_chk_fail();
    uVar3 = auVar6._0_8_;
    if (auVar6._8_4_ != 0) {
      uVar3 = func_0x0001753c(uVar3);
      func_0x00087574(unaff_x21);
      func_0x00087574(unaff_x20);
      if ((long *)unaff_x19[2] != (long *)0x0) {
        (**(code **)(*(long *)unaff_x19[2] + 8))();
      }
    }
    auVar5 = __Unwind_Resume(uVar3);
    puVar4 = auVar5._0_8_;
    *(undefined8 *)((long)register0x00000008 + -0x40) = unaff_x24;
    *(undefined8 *)((long)register0x00000008 + -0x38) = uVar3;
    *(undefined8 **)((long)register0x00000008 + -0x30) = unaff_x22;
    *(undefined8 **)((long)register0x00000008 + -0x28) = unaff_x21;
    *(undefined8 **)((long)register0x00000008 + -0x20) = unaff_x20;
    *(undefined8 **)((long)register0x00000008 + -0x18) = unaff_x19;
    *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
    *(undefined8 *)((long)register0x00000008 + -8) = 0x665a64;
    unaff_x29 = (undefined1 *)((long)register0x00000008 + -0x10);
    *(undefined8 *)((long)register0x00000008 + -0x48) =
         *(undefined8 *)PTR____stack_chk_guard_009b01e8;
    *puVar4 = &UNK_00a0c0d0;
    puVar4[1] = &UNK_00a0c190;
    uVar3 = __Znwm(0xa8);
    func_0x0060ba24(uVar3,auVar5._8_8_);
    puVar4[2] = uVar3;
    unaff_x20 = puVar4 + 3;
    func_0x005fdd18(unaff_x20);
    unaff_x21 = puVar4 + 9;
    func_0x005fdd18(unaff_x21);
    unaff_x22 = puVar4 + 0xf;
    *unaff_x22 = &UNK_00a09a40;
    func_0x005fdd18(puVar4 + 0x10);
    func_0x005fdd18(puVar4 + 0x16);
    *(undefined1 *)(puVar4 + 0x1c) = 1;
    func_0x00612940((undefined1 *)((long)register0x00000008 + -0x80),auVar5._8_8_,0x30);
    *(undefined **)((long)register0x00000008 + -0x80) = &UNK_009f6498;
    *(undefined **)((long)register0x00000008 + -0x78) = &UNK_009f6630;
    func_0x0060bf40(puVar4[2],(undefined1 *)((long)register0x00000008 + -0x80),unaff_x20);
    register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + -0xb0);
    unaff_x19 = puVar4;
  }
  return unaff_x19;
}

