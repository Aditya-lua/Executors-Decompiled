
undefined8 FUN_00730d0c(void)

{
  long *plVar1;
  undefined8 uVar2;
  long unaff_x19;
  long *unaff_x20;
  undefined1 *unaff_x21;
  bool bVar3;
  undefined1 uStack000000000000000f;
  
  plVar1 = (long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18);
  if (unaff_x19 == 0) {
    do {
      if ((*(byte *)((long)unaff_x20 + 0x24) >> 1 & 1) == 0) {
        uStack000000000000000f = '\0';
        uVar2 = (**(code **)(*unaff_x20 + 0x28))(unaff_x20,0,&uStack000000000000000f);
        if ((int)uVar2 != 0) {
          return uVar2;
        }
        bVar3 = true;
        if (uStack000000000000000f == '\0') goto code_r0x00730e20;
        *(byte *)((long)unaff_x20 + 0x24) = *(byte *)((long)unaff_x20 + 0x24) | 2;
      }
      unaff_x20 = (long *)unaff_x20[1];
    } while (unaff_x20 != (long *)0x0);
  }
  else {
    do {
      if ((*(byte *)((long)unaff_x20 + 0x24) >> 1 & 1) == 0) {
        uStack000000000000000f = '\0';
        uVar2 = (**(code **)(*unaff_x20 + 0x28))(unaff_x20);
        if ((int)uVar2 != 0) {
          if (-1 < *(char *)(unaff_x19 + 0xa1d)) {
            return uVar2;
          }
          if ((*plVar1 != 0) && (*(int *)(*plVar1 + 8) < 1)) {
            return uVar2;
          }
          if (*(int *)(*unaff_x20 + 0xc) < 1) {
            return uVar2;
          }
          func_0x0073cbdc();
          return uVar2;
        }
        if (uStack000000000000000f == '\0') {
          bVar3 = false;
code_r0x00730e20:
          if ((((!bVar3) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
              ((*plVar1 == 0 || (0 < *(int *)(*plVar1 + 8))))) && (0 < *(int *)(*unaff_x20 + 0xc)))
          {
            func_0x0073cbdc();
          }
          return 0;
        }
        if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
           (((*plVar1 == 0 || (0 < *(int *)(*plVar1 + 8))) && (0 < *(int *)(*unaff_x20 + 0xc))))) {
          func_0x0073cbdc();
        }
        *(byte *)((long)unaff_x20 + 0x24) = *(byte *)((long)unaff_x20 + 0x24) | 2;
      }
      unaff_x20 = (long *)unaff_x20[1];
    } while (unaff_x20 != (long *)0x0);
  }
  *unaff_x21 = 1;
  return 0;
}

