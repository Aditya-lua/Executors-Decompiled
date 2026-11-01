
void FUN_00173940(long param_1,long param_2,undefined8 param_3)

{
  long lVar1;
  long lVar2;
  long *unaff_x19;
  long *unaff_x20;
  undefined8 *unaff_x21;
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  long lVar3;
  long lVar4;
  undefined8 uStack0000000000000010;
  long in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  
  do {
    func_0x00187bd4(param_1,param_2,param_3);
LAB_001738fc:
    do {
      func_0x003eee9c(&uStack0000000000000010,unaff_x22,unaff_x23);
      lVar2 = in_stack_00000028;
      lVar1 = in_stack_00000020;
      if (in_stack_00000018 == unaff_x25) {
code_r0x00173980:
        in_stack_00000028 = -0x7fffffffffffffff;
        goto code_r0x00173998;
      }
      if (in_stack_00000018 == unaff_x26) {
        lVar4 = *(long *)(unaff_x24 + 0x28);
        lVar3 = *(long *)(unaff_x24 + 0x20);
        if (in_stack_00000020 == 6) goto code_r0x00173980;
        if (in_stack_00000020 != 5) {
          if (*unaff_x20 != 5) {
            func_0x00174248();
          }
          *unaff_x20 = lVar1;
          unaff_x20[1] = lVar2;
          unaff_x20[3] = lVar4;
          unaff_x20[2] = lVar3;
          in_stack_00000028 = -0x7fffffffffffffff;
          goto code_r0x00173998;
        }
        if ((in_stack_00000028 != unaff_x26) &&
           (uStack0000000000000010 = lVar3, in_stack_00000018 = lVar4,
           in_stack_00000028 != unaff_x27)) {
code_r0x00173990:
          unaff_x19[2] = in_stack_00000018;
          unaff_x19[1] = uStack0000000000000010;
code_r0x00173998:
          *unaff_x19 = in_stack_00000028;
          return;
        }
        goto LAB_001738fc;
      }
      *unaff_x21 = in_stack_00000030;
      unaff_x21[1] = in_stack_00000038;
      if ((char)uStack0000000000000010 == '\x05') {
        in_stack_00000028 = in_stack_00000018;
        uStack0000000000000010 = *(long *)(unaff_x24 + 0x10);
        in_stack_00000018 = *(long *)(unaff_x24 + 0x18);
        goto code_r0x00173990;
      }
      unaff_x22 = in_stack_00000030;
      unaff_x23 = in_stack_00000038;
    } while (in_stack_00000018 == 0);
    param_3 = 1;
    param_1 = in_stack_00000020;
    param_2 = in_stack_00000018;
  } while( true );
}

