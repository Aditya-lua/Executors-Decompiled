
void FUN_007143d8(long param_1)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined1 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  
  uStack0000000000000028 = *(undefined8 *)(param_1 + 0x8c);
  _uStack0000000000000020 = *(undefined8 *)(param_1 + 0x84);
  func_0x00710d48();
  if (*(int *)(*(long *)(param_1 + 0x150) + -4) == 0) {
    uStack0000000000000010 = 0;
    in_stack_00000018 = 0;
    uVar1 = func_0x00704c24(*(undefined8 *)(param_1 + 0xd8),0x20);
    func_0x00706fc0(uVar1,&uStack0000000000000020);
    puVar2 = (undefined8 *)func_0x00704c24(*(undefined8 *)(param_1 + 0xd8),8);
    *puVar2 = uVar1;
    func_0x00716770(param_1,&uStack0000000000000020,&uStack0000000000000010);
    return;
  }
  uVar1 = func_0x00704c24(*(undefined8 *)(param_1 + 0xd8),0x20);
  func_0x00706fc0(uVar1,&uStack0000000000000020);
  return;
}

