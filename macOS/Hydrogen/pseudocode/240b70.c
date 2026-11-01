
void FUN_00240b70(long *param_1,undefined8 *param_2,undefined8 param_3,undefined8 param_4,
                 long param_5,undefined8 param_6,undefined8 param_7)

{
  long lVar1;
  undefined1 *puVar2;
  long lVar3;
  undefined1 *puVar4;
  code *pcVar5;
  undefined8 uVar6;
  undefined8 *puVar7;
  ulong uVar8;
  undefined1 *puVar9;
  undefined1 auVar10 [16];
  undefined8 uStack0000000000000058;
  long in_stack_00000060;
  undefined1 *in_stack_00000068;
  ulong in_stack_00000070;
  ulong in_stack_00000078;
  long in_stack_00000080;
  long in_stack_00000088;
  
  uVar6 = *param_2;
  lVar1 = param_2[1];
  (**(code **)(param_5 + 0x20))
            (&uStack0000000000000058,param_4,param_6,param_7,
             &__ZN6rustls8versions5TLS1217hdbedbf0d85579c35E);
  uVar8 = in_stack_00000070;
  puVar4 = in_stack_00000068;
  lVar3 = in_stack_00000060;
  if (uStack0000000000000058 == -0x7fffffffffffffd9) {
    if (in_stack_00000070 < in_stack_00000078) {
      func_0x007a28a4(in_stack_00000078,in_stack_00000070,&UNK_009c82e0);
                    /* WARNING: Does not return */
      pcVar5 = (code *)SoftwareBreakpoint(1,0x240cc4);
      (*pcVar5)();
    }
    auVar10 = (**(code **)(lVar1 + 0x18))
                        (uVar6,in_stack_00000068 + in_stack_00000078,
                         in_stack_00000070 - in_stack_00000078);
    puVar7 = auVar10._8_8_;
    uVar6 = auVar10._0_8_;
    func_0x00240e28(param_3,0x30,uVar6,puVar7[3],puVar7[5]);
    if ((code *)*puVar7 != (code *)0x0) {
      (*(code *)*puVar7)(uVar6);
    }
    if (puVar7[1] != 0) {
      func_0x00187bd4(uVar6,puVar7[1],puVar7[2]);
    }
    lVar1 = lVar3;
    puVar2 = puVar4;
    if (uVar8 != 0) {
      puVar9 = puVar4;
      do {
        *puVar9 = 0;
        uVar8 = uVar8 - 1;
        puVar9 = puVar9 + 1;
      } while (uVar8 != 0);
    }
    for (; lVar1 != 0; lVar1 = lVar1 + -1) {
      *puVar2 = 0;
      puVar2 = puVar2 + 1;
    }
    if (lVar3 != 0) {
      func_0x00187bd4(puVar4,lVar3,1);
    }
    *param_1 = -0x7fffffffffffffd9;
  }
  else {
    param_1[6] = in_stack_00000088;
    param_1[5] = in_stack_00000080;
    param_1[2] = (long)in_stack_00000068;
    param_1[1] = in_stack_00000060;
    param_1[4] = in_stack_00000078;
    param_1[3] = in_stack_00000070;
    *param_1 = uStack0000000000000058;
  }
  return;
}

