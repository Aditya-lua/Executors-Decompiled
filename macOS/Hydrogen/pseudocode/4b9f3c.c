
void FUN_004b9f3c(undefined4 *param_1,long param_2,undefined8 param_3,undefined8 param_4)

{
  undefined8 *puVar1;
  long lVar2;
  long lVar3;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  long unaff_x28;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 *in_stack_00000008;
  undefined8 uStack0000000000000050;
  long in_stack_00000058;
  long in_stack_00000060;
  undefined4 uStack0000000000000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  
  while( true ) {
    func_0x004a3a40(param_1,param_2,param_3,param_4);
    param_4 = in_stack_00000078;
    param_3 = in_stack_00000070;
    lVar3 = in_stack_00000060;
    if (uStack0000000000000068 == 1) {
      uVar5 = *(undefined8 *)(unaff_x26 + 0x20);
      uVar4 = *(undefined8 *)(unaff_x26 + 0x18);
      if (in_stack_00000060 != 0) {
        puVar1 = (undefined8 *)(in_stack_00000058 + 8);
        do {
          lVar2 = puVar1[-1];
          if (-0x7ffffffffffffff9 < lVar2 && lVar2 != 0) {
            func_0x00187bd4(*puVar1,lVar2 << 3,8);
          }
          puVar1 = puVar1 + 3;
          lVar3 = lVar3 + -1;
        } while (lVar3 != 0);
      }
      if (uStack0000000000000050 != 0) {
        func_0x00187bd4(in_stack_00000058,uStack0000000000000050 * 0x18,8);
      }
      in_stack_00000008[4] = uVar5;
      in_stack_00000008[3] = uVar4;
      in_stack_00000008[1] = param_3;
      in_stack_00000008[2] = param_4;
      *in_stack_00000008 = 1;
      return;
    }
    if (in_stack_00000060 == uStack0000000000000050) {
      func_0x004aae30(&uStack0000000000000050);
    }
    puVar1 = (undefined8 *)(in_stack_00000058 + lVar3 * unaff_x28);
    uVar4 = *(undefined8 *)(unaff_x26 + 0x18);
    puVar1[1] = *(undefined8 *)(unaff_x26 + 0x20);
    *puVar1 = uVar4;
    puVar1[2] = *(undefined8 *)(unaff_x26 + 0x28);
    in_stack_00000060 = lVar3 + 1;
    unaff_x25 = unaff_x25 + -1;
    if (unaff_x25 == 0) break;
    param_1 = &uStack0000000000000068;
    param_2 = unaff_x27 + 8;
  }
  in_stack_00000008[4] = in_stack_00000058;
  in_stack_00000008[3] = uStack0000000000000050;
  in_stack_00000008[5] = in_stack_00000060;
  in_stack_00000008[1] = param_3;
  in_stack_00000008[2] = param_4;
  *in_stack_00000008 = 0;
  return;
}

