
ulong FUN_007335e4(void)

{
  int iVar1;
  undefined8 uVar2;
  code *unaff_x19;
  long unaff_x21;
  code *unaff_x22;
  ulong unaff_x23;
  long unaff_x24;
  
  do {
    if (unaff_x24 == 0) {
LAB_00733614:
      if (unaff_x19 != (code *)0x0) {
        unaff_x23 = (*unaff_x19)(unaff_x23);
      }
      *(byte *)(unaff_x21 + 0x98) = *(byte *)(unaff_x21 + 0x98) & 0xfe;
      if ((*(long *)(unaff_x21 + 0x88) == 0) ||
         ((*(byte *)(*(long *)(unaff_x21 + 0x88) + 4) >> 5 & 1) == 0)) {
        return unaff_x23;
      }
      func_0x00779d40(*(undefined8 *)(unaff_x21 + 0x78),5);
      return unaff_x23;
    }
    uVar2 = func_0x00156654(unaff_x24);
    unaff_x24 = func_0x006f4058(unaff_x24);
    iVar1 = (*unaff_x22)(uVar2);
    if (iVar1 != 0) {
      unaff_x23 = 1;
      goto LAB_00733614;
    }
    unaff_x23 = (ulong)(unaff_x24 != 0);
  } while( true );
}

