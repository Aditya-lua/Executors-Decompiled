
void FUN_00267ce8(void)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long *plVar4;
  long *unaff_x19;
  long unaff_x20;
  long *unaff_x21;
  long lVar5;
  long unaff_x25;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  undefined1 uStack0000000000000020;
  long lStack0000000000000028;
  long lStack0000000000000030;
  undefined1 uStack0000000000000038;
  undefined4 in_stack_00000040;
  undefined8 uStack0000000000000048;
  long in_stack_00000050;
  long in_stack_00000058;
  undefined8 uStack0000000000000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined1 uStack0000000000000078;
  undefined4 uStack0000000000000079;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  
  lStack0000000000000028 = unaff_x21[1];
  _uStack0000000000000020 = *unaff_x21;
  lStack0000000000000030 = unaff_x21[2];
  if (_uStack0000000000000020 != 0) {
    lVar5 = 1;
    do {
      while( true ) {
        if (lStack0000000000000030 == lStack0000000000000028) goto LAB_00267dec;
        func_0x00261518(&uStack0000000000000060,&uStack0000000000000020);
        if (uStack0000000000000060 != unaff_x25) {
          _uStack0000000000000020 = 0;
        }
        in_stack_00000040 = uStack0000000000000079;
        func_0x00268408(&uStack0000000000000048,&uStack0000000000000038,&uStack0000000000000060);
        lVar3 = in_stack_00000058;
        lVar2 = in_stack_00000050;
        lVar1 = uStack0000000000000048;
        if (uStack0000000000000048 != -0x8000000000000000) break;
        if (_uStack0000000000000020 == 0) goto LAB_00267dec;
      }
      if (lVar5 == uStack0000000000000008) {
        func_0x0079ce18(&uStack0000000000000008,lVar5,1,8,0x18);
        unaff_x20 = in_stack_00000010;
      }
      plVar4 = (long *)(unaff_x20 + lVar5 * 0x18);
      *plVar4 = lVar1;
      plVar4[1] = lVar2;
      plVar4[2] = lVar3;
      lVar5 = lVar5 + 1;
      in_stack_00000018 = lVar5;
    } while (_uStack0000000000000020 != 0);
  }
LAB_00267dec:
  unaff_x19[1] = in_stack_00000010;
  *unaff_x19 = uStack0000000000000008;
  unaff_x19[2] = in_stack_00000018;
  return;
}

