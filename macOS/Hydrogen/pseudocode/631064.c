
void FUN_00631064(void)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long unaff_x29;
  
  lVar3 = *(long *)(unaff_x29 + -0x38);
  if (lVar3 != 0) {
    lVar1 = *(long *)(unaff_x29 + -0x30);
    lVar2 = lVar3;
    if (lVar1 != lVar3) {
      do {
        lVar1 = func_0x00650db0(lVar1 + -0x80);
      } while (lVar1 != lVar3);
      lVar2 = *(long *)(unaff_x29 + -0x38);
    }
    *(long *)(unaff_x29 + -0x30) = lVar3;
    __ZdlPv(lVar2);
  }
  return;
}

