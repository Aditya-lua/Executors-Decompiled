
undefined8 FUN_001eec2c(void)

{
  ushort *puVar1;
  undefined1 in_ZR;
  uint in_w8;
  ushort *puVar2;
  ushort *in_x9;
  long in_x10;
  
  do {
    puVar2 = in_x9;
    if ((bool)in_ZR) {
      return 1;
    }
    do {
      in_x9 = puVar2 + 2;
      in_x10 = in_x10 + -4;
      if (in_x10 == 0) {
        return 0;
      }
      puVar1 = puVar2 + 1;
      puVar2 = in_x9;
    } while (*puVar1 != 0xd);
    in_ZR = *in_x9 == in_w8;
  } while( true );
}

