
void FUN_00631068(void)

{
  long lVar1;
  long lVar2;
  long unaff_x19;
  long unaff_x29;
  
  if (unaff_x19 != 0) {
    lVar1 = *(long *)(unaff_x29 + -0x30);
    lVar2 = unaff_x19;
    if (lVar1 != unaff_x19) {
      do {
        lVar1 = func_0x00650db0(lVar1 + -0x80);
      } while (lVar1 != unaff_x19);
      lVar2 = *(long *)(unaff_x29 + -0x38);
    }
    *(long *)(unaff_x29 + -0x30) = unaff_x19;
    __ZdlPv(lVar2);
  }
  return;
}

