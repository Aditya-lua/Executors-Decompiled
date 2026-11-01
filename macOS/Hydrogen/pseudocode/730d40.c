
undefined8 FUN_00730d40(void)

{
  undefined8 uVar1;
  long *unaff_x20;
  undefined1 *unaff_x21;
  long unaff_x24;
  long *unaff_x25;
  char cStack000000000000000f;
  
  do {
    if (unaff_x20 == (long *)0x0) {
      *unaff_x21 = 1;
      return 0;
    }
    if ((*(byte *)((long)unaff_x20 + 0x24) >> 1 & 1) == 0) {
      cStack000000000000000f = '\0';
      uVar1 = (**(code **)(*unaff_x20 + 0x28))(unaff_x20);
      if ((int)uVar1 != 0) {
        if (-1 < *(char *)(unaff_x24 + 3)) {
          return uVar1;
        }
        if ((*unaff_x25 != 0) && (*(int *)(*unaff_x25 + 8) < 1)) {
          return uVar1;
        }
        if (*(int *)(*unaff_x20 + 0xc) < 1) {
          return uVar1;
        }
        func_0x0073cbdc();
        return uVar1;
      }
      if (cStack000000000000000f == '\0') {
        if ((*(char *)(unaff_x24 + 3) < '\0') &&
           (((*unaff_x25 == 0 || (0 < *(int *)(*unaff_x25 + 8))) && (0 < *(int *)(*unaff_x20 + 0xc))
            ))) {
          func_0x0073cbdc();
        }
        return 0;
      }
      if (((*(char *)(unaff_x24 + 3) < '\0') &&
          ((*unaff_x25 == 0 || (0 < *(int *)(*unaff_x25 + 8))))) && (0 < *(int *)(*unaff_x20 + 0xc))
         ) {
        func_0x0073cbdc();
      }
      *(byte *)((long)unaff_x20 + 0x24) = *(byte *)((long)unaff_x20 + 0x24) | 2;
    }
    unaff_x20 = (long *)unaff_x20[1];
  } while( true );
}

