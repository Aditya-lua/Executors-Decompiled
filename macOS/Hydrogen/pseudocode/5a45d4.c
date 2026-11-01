
void FUN_005a45d4(long param_1)

{
  long lVar1;
  long *unaff_x19;
  long *unaff_x20;
  long *plVar2;
  long *unaff_x21;
  long unaff_x22;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  
  do {
    if (unaff_x22 == uStack0000000000000008) {
      func_0x007af5a0(&uStack0000000000000008,unaff_x22,1,8,8);
      param_1 = in_stack_00000010;
    }
    *(long **)(param_1 + unaff_x22 * 8) = unaff_x21 + -0x10;
    unaff_x22 = unaff_x22 + 1;
    plVar2 = unaff_x21;
    do {
      if (plVar2 == unaff_x20) {
        unaff_x19[1] = in_stack_00000010;
        *unaff_x19 = uStack0000000000000008;
        unaff_x19[2] = unaff_x22;
        return;
      }
      unaff_x21 = plVar2 + 0x10;
      lVar1 = *plVar2;
      plVar2 = unaff_x21;
      in_stack_00000018 = unaff_x22;
    } while (lVar1 == 0xc);
  } while( true );
}

