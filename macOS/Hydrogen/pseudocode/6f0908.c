
long FUN_006f0908(double param_1,double param_2)

{
  long lVar1;
  long lVar2;
  long unaff_x19;
  long unaff_x20;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long lVar3;
  double dVar4;
  double unaff_d9;
  
  *(double *)(&UNK_00001b88 + unaff_x20) = param_2 + param_1;
  lVar1 = *(long *)(unaff_x19 + 0x18) + 0x300;
  lVar2 = *(long *)(*(long *)(unaff_x19 + 0x18) + 0x318);
  if (lVar2 == lVar1) {
    lVar3 = 0;
  }
  else {
    lVar3 = 0;
    do {
      while (*(char *)(lVar2 + 3) == '\0') {
        lVar2 = *(long *)(lVar2 + 0x18);
        func_0x006ef9ec();
        lVar3 = lVar3 + 0x28;
        if (lVar2 == lVar1) goto FUN_006f0978;
      }
      *(undefined1 *)(lVar2 + 3) = 0;
      lVar2 = *(long *)(lVar2 + 0x18);
      lVar3 = lVar3 + 0x28;
    } while (lVar2 != lVar1);
  }
FUN_006f0978:
  dVar4 = (double)func_0x006f5d58();
  *(double *)(&UNK_00001b70 + unaff_x20) =
       *(double *)(&UNK_00001b70 + unaff_x20) + (dVar4 - unaff_d9);
  *(byte *)(unaff_x20 + 0x20) = *(byte *)(unaff_x20 + 0x20) ^ 3;
  *(undefined8 *)(unaff_x20 + 0x2f0) = *(undefined8 *)(unaff_x20 + 0x2e8);
  *(undefined1 *)(unaff_x20 + 0x21) = 4;
  return unaff_x23 + unaff_x22 + unaff_x24 + unaff_x25 + unaff_x26 + lVar3;
}

