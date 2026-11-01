
void FUN_007307f8(long param_1)

{
  undefined4 uVar1;
  int iVar2;
  undefined4 *extraout_x1;
  long in_x9;
  undefined4 *puVar3;
  undefined4 uStack_28;
  undefined4 uStack_24;
  
  if (**(long **)(in_x9 + 0x1e8) == param_1) {
    return;
  }
  uVar1 = ___stack_chk_fail();
  uStack_28 = 4;
  uStack_24 = 0;
  puVar3 = &uStack_24;
  iVar2 = _getsockopt(uVar1,0xffff,"rks/CoreFoundation.framework/Versions/A/CoreFoundation",
                      &uStack_24,&uStack_28);
  if (iVar2 != 0) {
    puVar3 = (undefined4 *)___error();
  }
  if (extraout_x1 != (undefined4 *)0x0) {
    *extraout_x1 = *puVar3;
  }
  return;
}

