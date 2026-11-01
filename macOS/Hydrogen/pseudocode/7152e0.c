
ulong FUN_007152e0(long param_1)

{
  uint uVar1;
  bool bVar2;
  int *piVar3;
  undefined8 in_x9;
  
  *(undefined8 *)(param_1 + 8) = in_x9;
  piVar3 = (int *)__Unwind_Resume();
  uVar1 = *piVar3 - 0x10e;
  bVar2 = uVar1 < 8;
  if (!bVar2) {
    uVar1 = 0;
  }
  return (ulong)CONCAT14(bVar2,uVar1);
}

