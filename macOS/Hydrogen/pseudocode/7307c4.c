
void FUN_007307c4(void)

{
  int iVar1;
  undefined4 *puVar2;
  undefined4 unaff_w19;
  long unaff_x20;
  long unaff_x29;
  undefined1 auVar3 [16];
  undefined4 uStack_28;
  undefined4 uStack_24;
  
  func_0x0077ea88();
  func_0x0073cab8();
  *(undefined4 *)(unaff_x20 + 0xc54) = unaff_w19;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
    return;
  }
  auVar3 = ___stack_chk_fail(7);
  uStack_28 = 4;
  uStack_24 = 0;
  puVar2 = &uStack_24;
  iVar1 = _getsockopt(auVar3._0_8_,0xffff,"rks/CoreFoundation.framework/Versions/A/CoreFoundation",
                      &uStack_24,&uStack_28);
  if (iVar1 != 0) {
    puVar2 = (undefined4 *)___error();
  }
  if (auVar3._8_8_ != (undefined4 *)0x0) {
    *auVar3._8_8_ = *puVar2;
  }
  return;
}

