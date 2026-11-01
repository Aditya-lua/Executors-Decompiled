
short * FUN_001b4c2c(void)

{
  byte bVar1;
  undefined8 uVar2;
  long lVar3;
  short *psVar4;
  long unaff_x22;
  
  func_0x007a28b0();
  func_0x007a28bc();
  uVar2 = func_0x007a28b0();
  if (unaff_x22 != 0) {
    func_0x00187bd4();
  }
  lVar3 = __Unwind_Resume(uVar2);
  if (*(long *)(lVar3 + 0x10) != 0) {
    psVar4 = (short *)(*(long *)(lVar3 + 8) + 0x20);
    lVar3 = *(long *)(lVar3 + 0x10) * 0x28;
    do {
      bVar1 = *(byte *)(psVar4 + -0x10);
      if (((1 << (ulong)(bVar1 & 0x1f) & 0xffdfU) == 0) && ((bVar1 != 0x10 || (*psVar4 == 0x22)))) {
        psVar4 = psVar4 + -0xc;
        if (bVar1 != 5) {
          psVar4 = (short *)0x0;
        }
        return psVar4;
      }
      psVar4 = psVar4 + 0x14;
      lVar3 = lVar3 + -0x28;
    } while (lVar3 != 0);
  }
  return (short *)0x0;
}

