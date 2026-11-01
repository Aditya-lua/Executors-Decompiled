
long * FUN_006dbf1c(long param_1)

{
  long *plVar1;
  long lVar2;
  ulong in_x9;
  ulong in_x10;
  long in_x11;
  ulong in_x12;
  long lVar3;
  ulong uVar4;
  long *plVar5;
  long lVar6;
  long *unaff_x19;
  long unaff_x20;
  
  uVar4 = in_x12 >> 4 ^ in_x12 >> 9;
  lVar3 = *unaff_x19;
  while( true ) {
    uVar4 = uVar4 & in_x10;
    lVar6 = *(long *)(lVar3 + uVar4 * 0x10);
    plVar5 = (long *)(lVar3 + uVar4 * 0x10 + 8);
    lVar2 = *plVar5;
    if (lVar6 == unaff_x19[3] && lVar2 == unaff_x19[4]) {
      plVar1 = (long *)(lVar3 + uVar4 * 0x10);
      *plVar1 = param_1;
      *plVar5 = *(long *)(unaff_x20 + 8);
      unaff_x19[2] = unaff_x19[2] + 1;
      return plVar1;
    }
    if (lVar6 == param_1 && lVar2 == in_x11) break;
    in_x9 = in_x9 + 1;
    uVar4 = in_x9 + uVar4;
    if (in_x10 < in_x9) {
      return (long *)0x0;
    }
  }
  return (long *)(lVar3 + uVar4 * 0x10);
}

