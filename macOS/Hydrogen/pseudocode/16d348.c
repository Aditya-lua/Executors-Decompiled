
void FUN_0016d348(void)

{
  long *plVar1;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x23;
  long unaff_x24;
  long in_stack_00000000;
  long in_stack_00000008;
  undefined1 uStack0000000000000030;
  undefined8 uStack0000000000000048;
  long in_stack_00000050;
  long in_stack_00000058;
  
  do {
    func_0x0079a190();
    do {
      plVar1 = (long *)(in_stack_00000008 + unaff_x23);
      plVar1[2] = in_stack_00000058;
      plVar1[1] = in_stack_00000050;
      *plVar1 = uStack0000000000000048;
      unaff_x20 = unaff_x20 + 1;
      unaff_x23 = unaff_x23 + 0x18;
      func_0x001738b8(&uStack0000000000000048,&uStack0000000000000030);
      if (uStack0000000000000048 == unaff_x24) {
        unaff_x19[1] = in_stack_00000008;
        *unaff_x19 = in_stack_00000000;
        unaff_x19[2] = unaff_x20;
        return;
      }
    } while (unaff_x20 != in_stack_00000000);
  } while( true );
}

