
void FUN_00509108(undefined8 param_1,undefined8 param_2,ulong param_3)

{
  long lVar1;
  undefined8 *puVar2;
  undefined2 uVar3;
  code *pcVar4;
  undefined1 in_CY;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined2 *unaff_x21;
  undefined2 *unaff_x22;
  ulong unaff_x26;
  undefined8 *unaff_x28;
  undefined8 *in_stack_00000000;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  
  while ((bool)in_CY) {
    lVar1 = (long)unaff_x22 + 3;
    unaff_x22 = (undefined2 *)(lVar1 + param_3);
    _memcpy(lVar1,param_2);
    puVar2 = unaff_x19 + 2;
    if (puVar2 == unaff_x28) {
      in_stack_00000000[1] = in_stack_00000020;
      *in_stack_00000000 = in_stack_00000018;
      in_stack_00000000[2] = unaff_x20 - unaff_x26;
      return;
    }
    if (unaff_x26 < 3) break;
    param_2 = *puVar2;
    param_3 = unaff_x19[3];
    uVar3 = *unaff_x21;
    *(undefined1 *)(unaff_x22 + 1) = *(undefined1 *)(unaff_x21 + 1);
    *unaff_x22 = uVar3;
    in_CY = param_3 <= unaff_x26 - 3;
    unaff_x26 = (unaff_x26 - 3) - param_3;
    unaff_x19 = puVar2;
  }
  uStack0000000000000030 = &UNK_009e8d38;
  in_stack_00000038 = 1;
  in_stack_00000048 = 0;
  in_stack_00000050 = 0;
  in_stack_00000040 = 8;
  func_0x007a2420(&uStack0000000000000030,&UNK_009e8d48);
                    /* WARNING: Does not return */
  pcVar4 = (code *)SoftwareBreakpoint(1,0x509214);
  (*pcVar4)();
}

