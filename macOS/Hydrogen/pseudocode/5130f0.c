
bool FUN_005130f0(undefined8 param_1,long param_2)

{
  long lVar1;
  long lVar2;
  int iVar3;
  long lVar4;
  long *in_x11;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  long *unaff_x26;
  long *unaff_x27;
  
  do {
    iVar3 = _memcmp(in_x11[-1],param_2);
    if (iVar3 != 0) {
      return false;
    }
    while (unaff_x25 = unaff_x25 + -1, unaff_x25 == 0) {
      if (unaff_x22 == unaff_x21) {
        return *(char *)(unaff_x20 + 0x60) == *(char *)(unaff_x19 + 0x60);
      }
      lVar1 = unaff_x23 + unaff_x22 * 0x18;
      lVar2 = unaff_x24 + unaff_x22 * 0x18;
      lVar4 = *(long *)(lVar1 + 0x10);
      if (lVar4 != *(long *)(lVar2 + 0x10)) {
        return false;
      }
      unaff_x22 = unaff_x22 + 1;
      unaff_x26 = (long *)(*(long *)(lVar2 + 8) + 0x10);
      unaff_x27 = (long *)(*(long *)(lVar1 + 8) + 0x10);
      unaff_x25 = lVar4 + 1;
    }
    if (*unaff_x27 != *unaff_x26) {
      return false;
    }
    param_2 = unaff_x26[-1];
    in_x11 = unaff_x27;
    unaff_x26 = unaff_x26 + 3;
    unaff_x27 = unaff_x27 + 3;
  } while( true );
}

