
void FUN_0070f578(long param_1,long *param_2)

{
  undefined8 uVar1;
  long unaff_x19;
  long *plVar2;
  undefined8 *puVar3;
  long lVar4;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  
  plVar2 = (long *)(param_1 + 8);
  *plVar2 = 0;
  *(undefined8 *)(param_1 + 0x10) = 0;
  *(undefined8 *)(param_1 + 0x18) = 0;
  lVar4 = *param_2;
  *(long *)(param_1 + 0x10) = param_2[1];
  *plVar2 = lVar4;
  *(long *)(param_1 + 0x18) = param_2[2];
  *param_2 = 0;
  param_2[1] = 0;
  param_2[2] = 0;
  puVar3 = (undefined8 *)(param_1 + 0x20);
  *puVar3 = 0;
  *(undefined8 *)(param_1 + 0x28) = 0;
  *(undefined8 *)(param_1 + 0x30) = 0;
  if (*(long *)(param_1 + 0x10) - *plVar2 == 0x30) {
    uVar1 = (**(code **)(*(long *)*plVar2 + 0x10))();
    func_0x0002a730(puVar3,uVar1);
    return;
  }
  func_0x00798aa4(&uStack0000000000000008,"%d parse errors");
  if (*(char *)(unaff_x19 + 0x37) < '\0') {
    __ZdlPv(*puVar3);
  }
  *(undefined8 *)(param_1 + 0x28) = in_stack_00000010;
  *puVar3 = uStack0000000000000008;
  *(undefined8 *)(param_1 + 0x30) = in_stack_00000018;
  return;
}

