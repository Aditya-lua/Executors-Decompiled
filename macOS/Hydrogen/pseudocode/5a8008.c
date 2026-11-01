
void FUN_005a8008(void)

{
  char cVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x23;
  long unaff_x24;
  ulong unaff_x25;
  ulong unaff_x26;
  long unaff_x27;
  long unaff_x28;
  
  while( true ) {
    iVar2 = _memcmp();
    if (iVar2 != 0) {
      unaff_x23 = (long)iVar2;
    }
    cVar1 = 0 < unaff_x23;
    if (unaff_x23 < 0) {
      cVar1 = -1;
    }
    unaff_x27 = unaff_x27 + -0x18;
    unaff_x25 = unaff_x25 + 1;
    if (cVar1 == '\x01') goto LAB_005a7ff8;
    unaff_x26 = unaff_x25;
    if (cVar1 == '\0') break;
    do {
      unaff_x25 = unaff_x26;
      if (unaff_x20 == 0) {
        uVar3 = 1;
        unaff_x20 = 0;
        goto code_r0x005a806c;
      }
      unaff_x21 = *(long *)(unaff_x21 + unaff_x25 * 8 + 0x328);
      unaff_x20 = unaff_x20 + -1;
      unaff_x28 = unaff_x21 + 0x218;
      unaff_x26 = (ulong)*(ushort *)(unaff_x21 + 0x322);
      unaff_x27 = unaff_x26 * 0x18;
      unaff_x25 = 0xffffffffffffffff;
LAB_005a7ff8:
    } while (unaff_x27 == 0);
    unaff_x23 = unaff_x24 - *(long *)(unaff_x28 + 0x10);
    unaff_x28 = unaff_x28 + 0x18;
  }
  uVar3 = 0;
code_r0x005a806c:
  unaff_x19[2] = unaff_x20;
  unaff_x19[3] = unaff_x25;
  *unaff_x19 = uVar3;
  unaff_x19[1] = unaff_x21;
  return;
}

