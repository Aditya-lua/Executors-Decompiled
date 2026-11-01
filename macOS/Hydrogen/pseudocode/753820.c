
bool FUN_00753820(long param_1)

{
  bool bVar1;
  int iVar2;
  ulong unaff_x19;
  long unaff_x21;
  ulong unaff_x22;
  ulong uVar3;
  
  if (param_1 - unaff_x22 < unaff_x19) {
    return false;
  }
  uVar3 = ~unaff_x22 + param_1;
  do {
    iVar2 = func_0x0077e76c(unaff_x21);
    if (iVar2 != 0) {
      return iVar2 != 0;
    }
    unaff_x21 = unaff_x21 + 1;
    bVar1 = unaff_x19 <= uVar3;
    uVar3 = uVar3 - 1;
  } while (bVar1);
  return iVar2 != 0;
}

