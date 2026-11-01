
ulong FUN_0005ad28(void)

{
  ulong uVar1;
  long lVar2;
  long unaff_x29;
  undefined1 uStack0000000000000010;
  
  uVar1 = _getnameinfo(&uStack0000000000000010);
  if ((int)uVar1 == 0) {
    uVar1 = func_0x0002a730();
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
    return uVar1;
  }
  ___stack_chk_fail();
  lVar2 = __Unwind_Resume();
  return (ulong)*(uint *)(lVar2 + 8);
}

