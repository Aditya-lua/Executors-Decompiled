
undefined8 FUN_00730ddc(code *param_1,long *param_2,undefined8 param_3,long param_4)

{
  undefined8 uVar1;
  long *unaff_x20;
  undefined1 *unaff_x21;
  ulong unaff_x23;
  long unaff_x24;
  long *unaff_x25;
  undefined8 uStack0000000000000008;
  
  while( true ) {
    uVar1 = (*param_1)(param_2,param_3,param_4);
    if ((int)uVar1 != 0) {
      if (((((unaff_x23 & 1) == 0) && (*(char *)(unaff_x24 + 3) < '\0')) &&
          ((*unaff_x25 == 0 || (0 < *(int *)(*unaff_x25 + 8))))) && (0 < *(int *)(*unaff_x20 + 0xc))
         ) {
        func_0x0073cbdc();
      }
      return uVar1;
    }
    if (uStack0000000000000008._7_1_ == '\0') break;
    *(byte *)((long)unaff_x20 + 0x24) = *(byte *)((long)unaff_x20 + 0x24) | 2;
    param_2 = unaff_x20;
    do {
      param_2 = (long *)param_2[1];
      if (param_2 == (long *)0x0) {
        *unaff_x21 = 1;
        return 0;
      }
    } while ((*(byte *)((long)param_2 + 0x24) >> 1 & 1) != 0);
    uStack0000000000000008._7_1_ = '\0';
    param_1 = *(code **)(*param_2 + 0x28);
    param_4 = (long)&uStack0000000000000008 + 7;
    param_3 = 0;
    unaff_x20 = param_2;
  }
  if ((((unaff_x23 & 1) == 0) && (*(char *)(unaff_x24 + 3) < '\0')) &&
     (((*unaff_x25 == 0 || (0 < *(int *)(*unaff_x25 + 8))) && (0 < *(int *)(*unaff_x20 + 0xc))))) {
    func_0x0073cbdc();
  }
  return 0;
}

