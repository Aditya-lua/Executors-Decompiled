
void FUN_00621ffc(long param_1,long *param_2,undefined8 param_3)

{
  long lVar1;
  undefined8 *puVar2;
  long lVar3;
  int iVar4;
  ulong uVar5;
  long *plVar6;
  undefined8 *puVar7;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  
  iVar4 = (**(code **)(*param_2 + 0x10))(param_2);
  if (iVar4 == 0) {
    func_0x005fe0b4();
  }
  else {
    (**(code **)(*param_2 + 0x18))(param_2,param_3);
  }
  lVar1 = param_1 + 8;
  func_0x005ffccc(lVar1);
  if (in_stack_00000018 <= in_stack_00000010) {
    in_stack_00000010 = in_stack_00000018;
  }
  if (in_stack_00000020 != 0) {
    if (in_stack_00000010 != 0) {
      do {
        *(undefined8 *)(in_stack_00000020 + -8 + in_stack_00000010 * 8) = 0;
        in_stack_00000010 = in_stack_00000010 - 1;
      } while (in_stack_00000010 != 0);
    }
    func_0x00611644();
  }
  plVar6 = (long *)(param_1 + 0x70);
  if (*plVar6 == *(long *)(param_1 + 0x78)) {
    uVar5 = 0;
LAB_0062210c:
    func_0x0064bb30(plVar6,1 - uVar5);
  }
  else {
    iVar4 = func_0x00609ec8(lVar1);
    if (iVar4 == 0) goto LAB_00622128;
    puVar7 = *(undefined8 **)(param_1 + 0x78);
    lVar3 = (long)puVar7 - *(long *)(param_1 + 0x70);
    uVar5 = (lVar3 >> 4) * -0x5555555555555555;
    if (lVar3 == 0) goto LAB_0062210c;
    if (1 < uVar5) {
      puVar2 = (undefined8 *)(*(long *)(param_1 + 0x70) + 0x30);
      while (puVar7 != puVar2) {
        puVar7 = puVar7 + -6;
        (**(code **)*puVar7)(puVar7);
      }
      *(undefined8 **)(param_1 + 0x78) = puVar2;
    }
  }
  func_0x005ffccc(*plVar6,lVar1);
LAB_00622128:
  iVar4 = (**(code **)(*param_2 + 0x10))(param_2);
  if (iVar4 != 0) {
    func_0x005ffccc(lVar1,param_3);
  }
  return;
}

