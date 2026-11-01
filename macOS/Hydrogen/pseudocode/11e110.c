
void FUN_0011e110(int param_1)

{
  short sVar1;
  short *psVar2;
  long unaff_x19;
  int *unaff_x20;
  long unaff_x21;
  short *unaff_x22;
  short *psVar3;
  long unaff_x23;
  
  *(int *)(unaff_x19 + 0xc) = *(int *)(unaff_x19 + 0xc) + -1;
  *(int *)(unaff_x19 + 0x10) = *(int *)(unaff_x19 + 0x10) - param_1;
  sVar1 = *(short *)(*(long *)(unaff_x19 + 0x20) + unaff_x23 + 2);
  if (sVar1 != 0) {
    psVar2 = (short *)(*(long *)(unaff_x19 + 0x20) + unaff_x21 * 2 + 4);
    psVar3 = unaff_x22;
    do {
      unaff_x22 = psVar3 + 1;
      *psVar3 = sVar1;
      sVar1 = *psVar2;
      psVar2 = psVar2 + 1;
      psVar3 = unaff_x22;
    } while (sVar1 != 0);
  }
  *unaff_x22 = 0;
  *unaff_x20 = *unaff_x20 + -1;
  *(undefined1 *)(unaff_x19 + 0x6a) = 0;
  *(undefined1 *)(unaff_x19 + 0xe84) = 1;
  *(undefined4 *)(unaff_x19 + 0xe80) = 0xbe99999a;
  return;
}

