
void FUN_001a58d8(long param_1,long param_2)

{
  long *unaff_x19;
  short *unaff_x20;
  short *psVar1;
  short *unaff_x21;
  long unaff_x22;
  short unaff_w23;
  short unaff_w24;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  
  do {
    if (unaff_x22 == param_1) {
      func_0x0079b61c(&uStack0000000000000008,unaff_x22,1,2,4);
      param_2 = in_stack_00000010;
    }
    psVar1 = (short *)(param_2 + unaff_x22 * 4);
    *psVar1 = unaff_w23;
    psVar1[1] = unaff_w24;
    unaff_x22 = unaff_x22 + 1;
    do {
      psVar1 = unaff_x21;
      if (psVar1 == unaff_x20) {
        unaff_x19[1] = in_stack_00000010;
        *unaff_x19 = uStack0000000000000008;
        unaff_x19[2] = unaff_x22;
        return;
      }
      unaff_x21 = psVar1 + 2;
      unaff_w23 = *psVar1;
    } while (unaff_w23 == 3);
    unaff_w24 = psVar1[1];
    param_1 = uStack0000000000000008;
    in_stack_00000018 = unaff_x22;
  } while( true );
}

