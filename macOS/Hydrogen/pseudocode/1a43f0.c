
void FUN_001a43f0(long param_1,long param_2)

{
  int iVar1;
  long lVar2;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  undefined8 unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  
  do {
    iVar1 = func_0x001f7540(param_1,param_2);
    lVar2 = unaff_x24;
    if (iVar1 != 0) {
      if (unaff_x24 + -0x10 == 0) {
LAB_001a444c:
        unaff_x19[1] = in_stack_00000010;
        *unaff_x19 = uStack0000000000000008;
        unaff_x19[2] = in_stack_00000018;
        return;
      }
      if (unaff_x20 == uStack0000000000000008) {
        func_0x0079b61c(&uStack0000000000000008,unaff_x20,1,8,8);
        unaff_x21 = in_stack_00000010;
      }
      *(long *)(unaff_x21 + unaff_x20 * 8) = unaff_x24 + -0x10;
      unaff_x20 = unaff_x20 + 1;
      *(undefined8 *)(unaff_x29 + -0x40) = unaff_x22;
      lVar2 = in_stack_00000020;
      unaff_x23 = in_stack_00000028;
      in_stack_00000018 = unaff_x20;
    }
    if (lVar2 == unaff_x23) goto LAB_001a444c;
    unaff_x24 = lVar2 + 0x10;
    *(long *)(unaff_x29 + -0x38) = lVar2;
    param_1 = unaff_x29 + -0x40;
    param_2 = unaff_x29 + -0x38;
    in_stack_00000020 = unaff_x24;
  } while( true );
}

