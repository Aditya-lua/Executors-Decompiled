
bool FUN_00679ab4(ulong param_1,long param_2)

{
  undefined1 in_ZR;
  bool bVar1;
  bool bVar2;
  ulong in_x9;
  long *plVar3;
  ulong in_x10;
  long *in_x11;
  long lVar4;
  long *in_x12;
  long in_x13;
  
  while( true ) {
    if (!(bool)in_ZR) {
      return false;
    }
    in_x13 = in_x13 + -1;
    if (in_x13 == 0) break;
    in_ZR = *in_x11 == *in_x12;
    in_x11 = in_x11 + 1;
    in_x12 = in_x12 + 1;
  }
  if (param_1 < in_x10) {
    lVar4 = in_x10 - in_x9;
    plVar3 = (long *)(*(long *)(param_2 + 0x18) + in_x9 * 8);
    do {
      if (*plVar3 != 0) {
        return false;
      }
      lVar4 = lVar4 + -1;
      plVar3 = plVar3 + 1;
    } while (lVar4 != 0);
  }
  if (param_1 <= in_x10) {
    return true;
  }
  lVar4 = ~in_x9 + param_1;
  plVar3 = (long *)(lRam0000000000a3d0d0 + in_x9 * 8);
  do {
    bVar2 = *plVar3 == 0;
    bVar1 = lVar4 != 0;
    lVar4 = lVar4 + -1;
    if (*plVar3 != 0) {
      return bVar2;
    }
    plVar3 = plVar3 + 1;
  } while (bVar1);
  return bVar2;
}

