
void FUN_002e8274(long param_1)

{
  bool bVar1;
  ulong uVar2;
  ulong uVar3;
  undefined1 auVar4 [16];
  
  if (*(long *)PTR____stack_chk_guard_009b01e8 == param_1) {
    return;
  }
  auVar4 = ___stack_chk_fail();
  if (*auVar4._0_8_ != 0) {
    uVar2 = 0;
    uVar3 = 1;
    do {
      func_0x002ed608(auVar4._8_8_ + uVar2 * 0x200);
      bVar1 = uVar3 < *auVar4._0_8_;
      uVar2 = uVar3;
      uVar3 = (ulong)((int)uVar3 + 1);
    } while (bVar1);
  }
  return;
}

