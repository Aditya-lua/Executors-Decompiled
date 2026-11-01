
undefined8 FUN_006fd09c(void)

{
  int iVar1;
  int iVar2;
  int iVar3;
  
  iVar1 = func_0x006e3144();
  if (0 < iVar1) {
    iVar3 = 0;
    do {
      iVar3 = iVar3 + 1;
      func_0x006e2154();
      func_0x006e3870();
      func_0x006e3f90();
      func_0x006e4c80();
      iVar2 = func_0x006e21f8();
      if (iVar2 != 0) {
        return 1;
      }
      func_0x006e1d54();
    } while (iVar1 != iVar3);
  }
  return 0;
}

