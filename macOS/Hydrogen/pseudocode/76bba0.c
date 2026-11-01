
void FUN_0076bba0(void)

{
  long lVar1;
  long unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  long unaff_x22;
  
  do {
    unaff_x21 = (ulong)((int)unaff_x21 + 1);
    do {
      unaff_x20 = func_0x006f4058(unaff_x20);
      if (unaff_x20 == 0) {
        *(undefined8 *)(unaff_x19 + unaff_x21 * 8) = 0;
        return;
      }
      lVar1 = func_0x00156654(unaff_x20);
    } while ((*(byte *)(lVar1 + unaff_x22) >> 4 & 1) != 0);
    *(long *)(unaff_x19 + unaff_x21 * 8) = lVar1;
  } while( true );
}

