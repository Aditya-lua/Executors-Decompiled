
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined1  [16] __ZN3std9panicking9take_hook17hae1e09753b65d86dE(void)

{
  undefined *puVar1;
  int iVar2;
  ulong uVar3;
  long unaff_x19;
  undefined *unaff_x20;
  long *unaff_x21;
  long in_xzr;
  undefined1 auVar4 [16];
  undefined *puStack_60;
  long *plStack_58;
  ulong uStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  
  if (((___ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E &
       0x7fffffffffffffff) == 0) || (iVar2 = func_0x007a1140(), iVar2 != 0)) {
    func_0x00428488(&puStack_60);
    unaff_x21 = plStack_58;
    unaff_x19 = plStack_58[2];
    unaff_x20 = (undefined *)plStack_58[3];
    plStack_58[2] = 0;
    if (((uStack_50 & 1) == 0) &&
       (((___ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E &
         0x7fffffffffffffff) != 0 && (uVar3 = func_0x007a1140(), (uVar3 & 1) == 0)))) {
      *(undefined1 *)(unaff_x21 + 1) = 1;
    }
    if (*unaff_x21 == 1) {
      *unaff_x21 = in_xzr;
      goto code_r0x0042c964;
    }
  }
  else {
    puStack_60 = &UNK_009db0c8;
    plStack_58 = (long *)((long)&MACH_HEADER.magic + 1);
    uStack_48 = 0;
    uStack_40 = 0;
    uStack_50 = 8;
    func_0x007a2420(&puStack_60,&UNK_009db120);
  }
  func_0x007a1ae8(unaff_x21);
code_r0x0042c964:
  puVar1 = &UNK_009db0f0;
  if (unaff_x19 == 0) {
    unaff_x19 = 1;
  }
  else {
    puVar1 = unaff_x20;
  }
  auVar4._8_8_ = puVar1;
  auVar4._0_8_ = unaff_x19;
  return auVar4;
}

