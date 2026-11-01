
void FUN_00232528(long param_1,undefined8 param_2,ulong param_3)

{
  undefined8 *puVar1;
  code *pcVar2;
  undefined8 unaff_x19;
  undefined8 *unaff_x20;
  undefined8 unaff_x21;
  long unaff_x22;
  ulong unaff_x23;
  ulong uVar3;
  undefined8 *unaff_x24;
  ulong unaff_x25;
  long unaff_x27;
  undefined8 *unaff_x28;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  ulong in_stack_00000018;
  
  while( true ) {
    _memcpy(param_1,param_2,param_3);
    uVar3 = unaff_x23 + unaff_x25;
    puVar1 = unaff_x24 + 2;
    unaff_x27 = unaff_x25 + unaff_x27;
    in_stack_00000018 = uVar3;
    if (puVar1 == unaff_x28) break;
    param_2 = *puVar1;
    param_3 = unaff_x24[3];
    if (uStack0000000000000008 - uVar3 < param_3) {
      func_0x0079b61c(&uStack0000000000000008,uVar3,param_3,1,1);
      unaff_x22 = in_stack_00000010;
    }
    param_1 = unaff_x22 + in_stack_00000018;
    unaff_x23 = in_stack_00000018;
    unaff_x24 = puVar1;
    unaff_x25 = param_3;
  }
  if (uVar3 < uStack0000000000000008) {
    if (uVar3 == 0) {
      func_0x00187bd4(unaff_x22,uStack0000000000000008,1);
      uVar3 = 0;
      unaff_x22 = 1;
    }
    else {
      unaff_x22 = func_0x00187bd8(unaff_x22,uStack0000000000000008,1,uVar3);
      if (unaff_x22 == 0) {
        func_0x007a1f00(1,uVar3,&UNK_009c8d48);
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x232608);
        (*pcVar2)();
      }
    }
  }
  *unaff_x20 = unaff_x21;
  unaff_x20[1] = unaff_x22;
  unaff_x20[2] = uVar3;
  unaff_x20[3] = unaff_x27;
  unaff_x20[4] = unaff_x19;
  return;
}

