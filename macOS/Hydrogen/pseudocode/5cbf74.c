
undefined8 FUN_005cbf74(long *param_1,undefined8 *param_2)

{
  undefined8 uVar1;
  long *plVar2;
  long lVar3;
  undefined1 uStack0000000000000008;
  undefined *puStack0000000000000010;
  undefined8 *in_stack_00000018;
  undefined *in_stack_00000020;
  undefined8 uStack0000000000000028;
  undefined8 in_stack_00000030;
  undefined1 uStack0000000000000040;
  undefined8 uStack0000000000000048;
  undefined1 *puStack0000000000000050;
  undefined8 uStack0000000000000058;
  undefined8 uStack0000000000000060;
  
  plVar2 = (long *)*param_1;
  lVar3 = *plVar2;
  if ((lVar3 == 9) && ((char)plVar2[3] != '\x05')) goto LAB_005cbfe8;
  if ((char)param_1[1] == '\x01') {
    if (lVar3 == 8) {
      if ((char)plVar2[2] != '\x01') goto LAB_005cc020;
    }
    else if ((((lVar3 != 6) || (plVar2[1] != -0x7ffffffffffffffe)) ||
             (0x7fefffffffffffff < (plVar2[2] & 0x7fffffffffffffffU))) || (-1 < plVar2[2]))
    goto LAB_005cc020;
LAB_005cbfe8:
    _uStack0000000000000040 = &UNK_009f2a08;
    uStack0000000000000048 = 2;
  }
  else {
LAB_005cc020:
    _uStack0000000000000040 = &UNK_008b5968;
    uStack0000000000000048 = 1;
  }
  uStack0000000000000060 = 0;
  puStack0000000000000010 = &DAT_005c0a00;
  puStack0000000000000050 = &uStack0000000000000008;
  uStack0000000000000058 = 1;
  _uStack0000000000000008 = param_1;
  func_0x00459f08(&uStack0000000000000028,&uStack0000000000000040);
  puStack0000000000000010 =
       &
       __ZN65__LT_ast__unary__UnaryOperation_u20_as_u20_core__fmt__Display_GT_3fmt17hb503ece737257cc6E
  ;
  in_stack_00000018 = &uStack0000000000000028;
  in_stack_00000020 = &DAT_005c9f40;
  _uStack0000000000000040 = &UNK_008b5998;
  uStack0000000000000048 = 2;
  uStack0000000000000058 = 2;
  uStack0000000000000060 = 0;
  puStack0000000000000050 = &uStack0000000000000008;
  _uStack0000000000000008 = param_1 + 1;
  uVar1 = func_0x0046849c(*param_2,param_2[1],&uStack0000000000000040);
  if (uStack0000000000000028 != 0) {
    func_0x00187bd4(in_stack_00000030,uStack0000000000000028,1);
  }
  return uVar1;
}

