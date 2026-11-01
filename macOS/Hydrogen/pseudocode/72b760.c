
undefined8 FUN_0072b760(void)

{
  bool bVar1;
  undefined8 uVar2;
  long unaff_x19;
  undefined1 *unaff_x20;
  long *unaff_x21;
  long unaff_x22;
  long unaff_x24;
  
  uVar2 = func_0x00731158(unaff_x21[1]);
  if ((int)uVar2 == 0) {
    (*pcRam0000000000a2b5f0)(*(undefined8 *)((long)&linkedit_data_command_00001328.cmd + unaff_x19))
    ;
    *(undefined8 *)((long)&linkedit_data_command_00001328.cmd + unaff_x19) = 0;
    if (unaff_x21[2] == 0) {
      uVar2 = 0;
      *unaff_x20 = 0;
    }
    else {
      bVar1 = *(int *)(unaff_x21[2] + 0xa8) == 4;
      *unaff_x20 = bVar1;
      if (bVar1) {
        *(byte *)((long)unaff_x21 + 0x24) = *(byte *)((long)unaff_x21 + 0x24) | 1;
        func_0x007710b8(unaff_x19 + 0xe8);
        func_0x00773c94();
        func_0x00770948();
        func_0x0077093c();
        func_0x0072bbb8();
      }
      uVar2 = 0;
    }
  }
  else {
    if (*(int *)(unaff_x22 + 0xa8) != 5) {
      if ((((unaff_x19 != 0) && (*(char *)(unaff_x24 + 3) < '\0')) &&
          ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x19 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8))))) && (0 < *(int *)(*unaff_x21 + 0xc)))
      {
        func_0x0073cbdc();
      }
      *(undefined4 *)(unaff_x22 + 0xa8) = 5;
      func_0x007406b0();
      func_0x007406b0();
      *(undefined4 *)(&UNK_00001350 + unaff_x19) = 0;
      (*pcRam0000000000a2b5f0)
                (*(undefined8 *)((long)&linkedit_data_command_00001328.cmd + unaff_x19));
      *(undefined8 *)((long)&linkedit_data_command_00001328.cmd + unaff_x19) = 0;
    }
    *unaff_x20 = 0;
  }
  return uVar2;
}

