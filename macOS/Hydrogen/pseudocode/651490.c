
void FUN_00651490(ulong param_1,long param_2)

{
  undefined1 in_CY;
  ulong in_x9;
  long unaff_x19;
  undefined *unaff_x21;
  long unaff_x22;
  
  do {
    if ((bool)in_CY) {
      param_1 = in_x9;
    }
    if (param_2 != 0) {
      if (param_1 != 0) {
        do {
          *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
          param_1 = param_1 - 1;
        } while (param_1 != 0);
      }
      func_0x00611644();
    }
    func_0x0064f6d0(unaff_x19);
    if (unaff_x19 + 0xa0 == unaff_x22) {
      __Unwind_Resume();
      unaff_x21 = &UNK_009f5d60;
    }
    *(undefined **)(unaff_x19 + 0x110) = unaff_x21;
    in_x9 = *(ulong *)(unaff_x19 + 0x128);
    param_2 = *(long *)(unaff_x19 + 0x130);
    param_1 = *(ulong *)(unaff_x19 + 0x120);
    in_CY = in_x9 <= param_1;
    unaff_x19 = unaff_x19 + 0xa0;
  } while( true );
}

