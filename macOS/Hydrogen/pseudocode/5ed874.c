
long FUN_005ed874(long param_1,long param_2,long param_3,long param_4,long param_5)

{
  long lVar1;
  long in_x9;
  long lVar2;
  long in_x10;
  long *plVar3;
  long in_x11;
  long in_x12;
  long in_x13;
  long in_x14;
  long in_x15;
  long *in_x16;
  long in_x17;
  
  while( true ) {
    if (param_2 == param_1) {
      in_x12 = in_x12 + 1;
    }
    if (param_3 == param_1) {
      in_x13 = in_x13 + 1;
    }
    if (*(long *)(param_4 + 0x10) == param_1) {
      in_x14 = in_x14 + 1;
    }
    if (*(long *)(param_5 + 0x10) == param_1) {
      in_x15 = in_x15 + 1;
    }
    in_x17 = in_x17 + -4;
    if (in_x17 == 0) break;
    param_4 = in_x16[0xc];
    param_5 = in_x16[0xf];
    param_2 = *(long *)(in_x16[6] + 0x10);
    param_3 = *(long *)(in_x16[9] + 0x10);
    in_x16 = in_x16 + 0xc;
  }
  lVar1 = in_x15 + in_x14 + in_x13 + in_x12;
  if (in_x9 != in_x11) {
    lVar2 = in_x9 - in_x11;
    plVar3 = (long *)(in_x10 + in_x11 * 0x18);
    do {
      if (*(long *)(*plVar3 + 0x10) == param_1) {
        lVar1 = lVar1 + 1;
      }
      lVar2 = lVar2 + -1;
      plVar3 = plVar3 + 3;
    } while (lVar2 != 0);
  }
  return lVar1;
}

