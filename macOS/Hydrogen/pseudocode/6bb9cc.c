
long * FUN_006bb9cc(ulong param_1)

{
  int iVar1;
  long lVar2;
  long unaff_x19;
  long unaff_x21;
  long *plVar3;
  long lVar4;
  ulong unaff_x24;
  long unaff_x26;
  ulong unaff_x27;
  long unaff_x28;
  
  do {
    if (unaff_x24 < unaff_x27) {
      return (long *)0x0;
    }
    plVar3 = (long *)(unaff_x26 + (param_1 & unaff_x24) * unaff_x28);
    lVar4 = *plVar3;
    if (lVar4 == 0) {
      lVar2 = *(long *)(unaff_x19 + 0x18);
LAB_006bb9bc:
      if (lVar4 == lVar2) {
        return (long *)0x0;
      }
    }
    else {
      if ((plVar3[1] == unaff_x21) && (iVar1 = _memcmp(lVar4), iVar1 == 0)) {
        return plVar3;
      }
      lVar2 = 0;
      if (*(long *)(unaff_x19 + 0x18) == 0) goto LAB_006bb9bc;
      if ((plVar3[1] == *(long *)(unaff_x19 + 0x20)) && (iVar1 = _memcmp(lVar4), iVar1 == 0)) {
        return (long *)0x0;
      }
    }
    unaff_x27 = unaff_x27 + 1;
    param_1 = unaff_x27 + (param_1 & unaff_x24);
  } while( true );
}

