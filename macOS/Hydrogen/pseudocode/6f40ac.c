
void FUN_006f40ac(long param_1,long param_2)

{
  int iVar1;
  code *unaff_x19;
  long unaff_x22;
  long unaff_x23;
  int iVar2;
  
  iVar2 = *(int *)(param_2 + 0x34);
  param_2 = param_2 + unaff_x22;
  while (((*(char *)(param_2 + param_1 + 0x40) == '\0' || (iVar1 = (*unaff_x19)(), iVar1 == 0)) ||
         (iVar2 = iVar2 + -1, iVar2 != 0))) {
    param_2 = param_2 + unaff_x22;
    if (param_2 + param_1 + 0x40 == unaff_x23) {
      return;
    }
  }
  return;
}

