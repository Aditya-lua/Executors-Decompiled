
void FUN_005c50b8(void)

{
  long lVar1;
  long unaff_x20;
  long unaff_x21;
  undefined8 *puVar2;
  long in_stack_00000090;
  undefined8 in_stack_00000098;
  long in_stack_000000b0;
  undefined8 in_stack_000000b8;
  long in_stack_000000e8;
  long in_stack_00000100;
  long in_stack_00000108;
  
  func_0x00490eb8();
  if (in_stack_000000b0 == 0) goto LAB_005c5150;
  do {
    func_0x00187bd4(in_stack_000000b8,in_stack_000000b0 << 2,4);
LAB_005c5150:
    do {
      __Unwind_Resume();
      puVar2 = (undefined8 *)(unaff_x20 + 8);
      do {
        if (puVar2[-1] != 0) {
          func_0x00187bd4(*puVar2,puVar2[-1] << 3,8);
        }
        puVar2 = puVar2 + 3;
        unaff_x21 = unaff_x21 + -1;
      } while (unaff_x21 != 0);
      if (in_stack_000000e8 != 0) {
        func_0x00187bd4();
      }
      if ((in_stack_00000108 != 0) && (lVar1 = in_stack_00000108 * 0x11 + 0x19, lVar1 != 0)) {
        func_0x00187bd4(in_stack_00000100 + in_stack_00000108 * -0x10 + -0x10,lVar1,8);
      }
    } while (in_stack_00000090 == 0);
    in_stack_000000b8 = in_stack_00000098;
    in_stack_000000b0 = in_stack_00000090;
  } while( true );
}

