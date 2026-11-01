
undefined8 FUN_00730d74(void)

{
  undefined8 uVar1;
  long *unaff_x20;
  undefined1 *unaff_x21;
  long unaff_x24;
  long *unaff_x25;
  
  if ((*(char *)(unaff_x24 + 3) < '\0') &&
     (((*unaff_x25 == 0 || (0 < *(int *)(*unaff_x25 + 8))) && (0 < *(int *)(*unaff_x20 + 0xc))))) {
    func_0x0073cbdc();
  }
  *(byte *)((long)unaff_x20 + 0x24) = *(byte *)((long)unaff_x20 + 0x24) | 2;
  do {
    unaff_x20 = (long *)unaff_x20[1];
    if (unaff_x20 == (long *)0x0) {
      *unaff_x21 = 1;
      return 0;
    }
  } while ((*(byte *)((long)unaff_x20 + 0x24) >> 1 & 1) != 0);
  uVar1 = (**(code **)(*unaff_x20 + 0x28))(unaff_x20);
  if ((int)uVar1 == 0) {
    if (((*(char *)(unaff_x24 + 3) < '\0') && ((*unaff_x25 == 0 || (0 < *(int *)(*unaff_x25 + 8)))))
       && (0 < *(int *)(*unaff_x20 + 0xc))) {
      func_0x0073cbdc();
    }
    uVar1 = 0;
  }
  else if (((*(char *)(unaff_x24 + 3) < '\0') &&
           ((*unaff_x25 == 0 || (0 < *(int *)(*unaff_x25 + 8))))) &&
          (0 < *(int *)(*unaff_x20 + 0xc))) {
    func_0x0073cbdc();
  }
  return uVar1;
}

