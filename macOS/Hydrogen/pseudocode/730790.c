
void FUN_00730790(void)

{
  int iVar1;
  undefined4 *puVar2;
  long unaff_x29;
  undefined1 auVar3 [16];
  undefined4 uStack_28;
  undefined4 uStack_24;
  
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
    return;
  }
  auVar3 = ___stack_chk_fail(0);
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

