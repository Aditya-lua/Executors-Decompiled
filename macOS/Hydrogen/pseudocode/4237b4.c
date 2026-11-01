
void FUN_004237b4(undefined1 *param_1,long param_2,undefined8 param_3)

{
  long unaff_x21;
  long unaff_x22;
  long lVar1;
  long unaff_x23;
  long in_stack_00000020;
  undefined8 in_stack_00000028;
  
  do {
    func_0x00187bd4(param_1,param_2,param_3);
    lVar1 = unaff_x23;
    do {
      unaff_x23 = lVar1 + 0x10;
      unaff_x22 = unaff_x22 + -1;
      if (unaff_x22 == 0) {
        if (unaff_x21 != 0) {
          func_0x00187bd4();
        }
        if (in_stack_00000020 != 0) {
          func_0x00187bd4(in_stack_00000028,in_stack_00000020 << 3,8);
        }
        return;
      }
      param_1 = *(undefined1 **)(lVar1 + 8);
      param_2 = *(long *)(lVar1 + 0x10);
      *param_1 = 0;
      lVar1 = unaff_x23;
    } while (param_2 == 0);
    param_3 = 1;
  } while( true );
}

