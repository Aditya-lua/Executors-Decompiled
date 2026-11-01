
undefined8 FUN_006112d4(void)

{
  int iVar1;
  long *unaff_x20;
  
  while( true ) {
    if (unaff_x20 == (long *)0x0) {
      return 0;
    }
    iVar1 = _strcmp();
    if (iVar1 == 0) break;
    unaff_x20 = (long *)unaff_x20[3];
  }
  (**(code **)(*unaff_x20 + 0x10))(unaff_x20);
  *(undefined1 *)((long)unaff_x20 + 0x11) = 1;
  return 1;
}

