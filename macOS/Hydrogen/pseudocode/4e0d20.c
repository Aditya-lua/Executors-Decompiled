
void FUN_004e0d20(ulong *param_1,ulong param_2,undefined8 *param_3,undefined8 param_4)

{
  undefined8 *puVar1;
  code *pcVar2;
  ulong uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  
  uVar3 = param_1[2];
  if (uVar3 < param_2) {
    func_0x007a204c(param_2,uVar3,param_4);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x4e0da8);
    (*pcVar2)();
  }
  if (uVar3 == *param_1) {
    func_0x0050c2ec(param_1,param_4);
  }
  puVar1 = (undefined8 *)(param_1[1] + param_2 * 0x20);
  if (param_2 <= uVar3 && uVar3 - param_2 != 0) {
    _memmove(puVar1 + 4,puVar1,(uVar3 - param_2) * 0x20);
  }
  uVar4 = *param_3;
  uVar6 = param_3[3];
  uVar5 = param_3[2];
  puVar1[1] = param_3[1];
  *puVar1 = uVar4;
  puVar1[3] = uVar6;
  puVar1[2] = uVar5;
  param_1[2] = uVar3 + 1;
  return;
}

