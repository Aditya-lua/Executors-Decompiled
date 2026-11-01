
void FUN_004e7bd0(void)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long *plVar4;
  long *unaff_x19;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined8 unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  undefined8 uStack0000000000000040;
  undefined8 uStack0000000000000048;
  long in_stack_00000050;
  long in_stack_00000058;
  
  do {
    func_0x007a5594(&uStack0000000000000008,unaff_x21,1,8,0x18);
    lVar2 = in_stack_00000010;
    do {
      lVar3 = in_stack_00000028;
      plVar4 = (long *)(lVar2 + unaff_x21 * unaff_x26);
      *plVar4 = unaff_x22;
      plVar4[1] = unaff_x23;
      plVar4[2] = unaff_x27;
      unaff_x21 = unaff_x21 + 1;
      in_stack_00000018 = unaff_x21;
      uStack0000000000000040 = unaff_x24;
      lVar1 = in_stack_00000020;
      do {
        if (lVar1 == lVar3) {
          unaff_x19[1] = in_stack_00000010;
          *unaff_x19 = uStack0000000000000008;
          unaff_x19[2] = in_stack_00000018;
          return;
        }
        lVar1 = lVar1 + 0x10;
        in_stack_00000020 = lVar1;
        func_0x004e9a3c(&uStack0000000000000048,&uStack0000000000000040);
      } while (uStack0000000000000048 == unaff_x25);
      unaff_x22 = uStack0000000000000048;
      unaff_x23 = in_stack_00000050;
      unaff_x27 = in_stack_00000058;
    } while (unaff_x21 != uStack0000000000000008);
  } while( true );
}

