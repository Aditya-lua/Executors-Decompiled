
void FUN_005d2688(long param_1,undefined8 *param_2,ulong param_3)

{
  ulong uVar1;
  long lVar2;
  long *unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  ulong uVar3;
  ulong unaff_x24;
  ulong unaff_x26;
  undefined1 auVar4 [16];
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  
  do {
    func_0x0059ca50(param_2,unaff_x20 + unaff_x24,param_1 + param_3);
    func_0x0059ca50(&uStack0000000000000008);
    uVar3 = unaff_x26;
    while( true ) {
      if (unaff_x21 - uVar3 < 0x10) {
        if (unaff_x21 == uVar3) goto code_r0x005d26b8;
        param_3 = 0;
        while (*(char *)(unaff_x20 + uVar3 + param_3) != '\n') {
          param_3 = param_3 + 1;
          if (unaff_x21 - uVar3 == param_3) goto code_r0x005d26b8;
        }
      }
      else {
        auVar4 = func_0x0046b0fc(10,unaff_x20 + uVar3);
        param_3 = auVar4._8_8_;
        if ((auVar4._0_8_ & 1) == 0) goto code_r0x005d26b8;
      }
      uVar1 = uVar3 + param_3 + 1;
      if ((uVar3 + param_3 < unaff_x21) &&
         (param_1 = unaff_x20 + uVar3, *(char *)(param_1 + param_3) == '\n')) break;
      uVar3 = uVar1;
      if (unaff_x21 < uVar1) {
code_r0x005d26b8:
        uVar3 = unaff_x21 - unaff_x26;
        if ((ulong)(uStack0000000000000008 - in_stack_00000018) < uVar3) {
          func_0x007af5a0(&uStack0000000000000008,in_stack_00000018,uVar3,1,1);
        }
        lVar2 = in_stack_00000018;
        _memcpy(in_stack_00000010 + in_stack_00000018,unaff_x20 + unaff_x26,uVar3);
        unaff_x19[2] = lVar2 + uVar3;
        unaff_x19[1] = in_stack_00000010;
        *unaff_x19 = uStack0000000000000008;
        return;
      }
    }
    param_2 = &uStack0000000000000008;
    unaff_x24 = unaff_x26;
    unaff_x26 = uVar1;
  } while( true );
}

