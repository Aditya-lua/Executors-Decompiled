
undefined8 FUN_005e3e10(void)

{
  long lVar1;
  ulong uVar2;
  ulong uVar3;
  char *pcVar4;
  long unaff_x20;
  ulong unaff_x21;
  ulong unaff_x22;
  
  lVar1 = *(long *)(unaff_x20 + 8);
  uVar2 = *(ulong *)(unaff_x20 + 0x10);
  while( true ) {
    pcVar4 = "";
    if ((unaff_x22 >> 5 < uVar2) &&
       (pcVar4 = "",
       (*(uint *)(lVar1 + (unaff_x22 >> 5) * 4) >> (ulong)((uint)unaff_x22 & 0x1f) & 1) != 0)) {
      pcVar4 = &UNK_008b94d2;
    }
    if ((*pcVar4 & 1U) == 0) {
      uVar3 = func_0x0046a9ac();
    }
    else {
      uVar3 = func_0x0046a9ac();
    }
    if ((uVar3 & 1) != 0) break;
    unaff_x22 = unaff_x22 + 1;
    if (unaff_x21 == unaff_x22) {
      return 0;
    }
  }
  return 1;
}

