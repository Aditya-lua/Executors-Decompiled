
uint FUN_0067e49c(void)

{
  int iVar1;
  long *unaff_x19;
  ulong unaff_x24;
  uint uVar2;
  uint unaff_w26;
  
  iVar1 = (**(code **)(*unaff_x19 + 0xb0))();
  uVar2 = 0;
  if (iVar1 == 1) {
    if ((unaff_x24 & 1) == 0) {
      iVar1 = func_0x0068c6f4();
      uVar2 = (uint)(iVar1 == 1);
    }
  }
  else {
    uVar2 = unaff_w26;
  }
  return uVar2;
}

