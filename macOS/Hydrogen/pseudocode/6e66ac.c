
long FUN_006e66ac(void)

{
  long lVar1;
  int iVar2;
  long unaff_x22;
  long lVar3;
  
  lVar3 = 0;
  do {
    iVar2 = _strcmp();
    if (iVar2 == 0) {
      return lVar3;
    }
    lVar1 = lVar3 * 8;
    lVar3 = lVar3 + 1;
  } while (*(long *)(unaff_x22 + 8 + lVar1) != 0);
  func_0x006e3a84();
  func_0x006e63b0();
  return lVar3;
}

