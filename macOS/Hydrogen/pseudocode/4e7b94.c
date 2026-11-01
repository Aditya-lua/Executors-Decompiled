
void FUN_004e7b94(void)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long *plVar4;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x23;
  undefined8 unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  long lStack0000000000000020;
  long in_stack_00000028;
  undefined8 uStack0000000000000040;
  undefined8 uStack0000000000000048;
  long in_stack_00000050;
  long in_stack_00000058;
  
  do {
    lStack0000000000000020 = unaff_x27;
    func_0x004e9a3c(&uStack0000000000000048,&uStack0000000000000040);
    lVar3 = in_stack_00000058;
    lVar2 = in_stack_00000050;
    lVar1 = uStack0000000000000048;
    if (uStack0000000000000048 == unaff_x25) {
      lStack0000000000000020 = unaff_x27;
      if (unaff_x27 == unaff_x23) goto LAB_004e7c10;
    }
    else {
      if (unaff_x21 == uStack0000000000000008) {
        func_0x007a5594(&uStack0000000000000008,unaff_x21,1,8,0x18);
        unaff_x20 = in_stack_00000010;
      }
      plVar4 = (long *)(unaff_x20 + unaff_x21 * unaff_x26);
      *plVar4 = lVar1;
      plVar4[1] = lVar2;
      plVar4[2] = lVar3;
      unaff_x21 = unaff_x21 + 1;
      unaff_x23 = in_stack_00000028;
      in_stack_00000018 = unaff_x21;
      uStack0000000000000040 = unaff_x24;
      if (lStack0000000000000020 == in_stack_00000028) {
LAB_004e7c10:
        unaff_x19[1] = in_stack_00000010;
        *unaff_x19 = uStack0000000000000008;
        unaff_x19[2] = in_stack_00000018;
        return;
      }
    }
    unaff_x27 = lStack0000000000000020 + 0x10;
  } while( true );
}

