
ulong FUN_0076e554(long param_1,ulong param_2,undefined8 param_3,undefined4 *param_4)

{
  uint uVar1;
  undefined1 auVar2 [16];
  
  if (*(long *)PTR____stack_chk_guard_009b01e8 == param_1) {
    return param_2;
  }
  auVar2 = ___stack_chk_fail();
  *param_4 = *(undefined4 *)(*(long *)(auVar2._0_8_ + 0x18) + 0x238);
  uVar1 = 0x10000;
  if (*(long *)(auVar2._8_8_ + 0x18) == 0) {
    uVar1 = 1;
  }
  return (ulong)uVar1;
}

