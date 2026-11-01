
void FUN_00052854(undefined8 param_1,undefined8 param_2,ulong param_3)

{
  byte bVar1;
  undefined8 *puVar2;
  ulong uVar3;
  undefined8 *puVar4;
  uint uVar5;
  ulong uVar6;
  long lVar7;
  ulong uVar8;
  undefined1 auVar9 [16];
  undefined8 in_stack_00000010;
  long in_stack_00000020;
  undefined8 in_stack_00000028;
  long in_stack_00000038;
  
  if (in_stack_00000020 < 0) {
    __ZdlPv(in_stack_00000010);
  }
  if (in_stack_00000038 < 0) {
    __ZdlPv(in_stack_00000028);
  }
  auVar9 = __Unwind_Resume();
  lVar7 = auVar9._8_8_;
  puVar4 = auVar9._0_8_;
  if (param_3 != 0) {
    bVar1 = *(byte *)((long)puVar4 + 0x17);
    uVar5 = (uint)(char)bVar1;
    if ((char)bVar1 < '\0') {
      uVar8 = puVar4[1];
      uVar6 = uVar8 - lVar7;
      puVar2 = (undefined8 *)*puVar4;
      uVar3 = uVar6;
      if (param_3 <= uVar6) {
        uVar3 = param_3;
      }
    }
    else {
      uVar8 = (ulong)bVar1;
      uVar6 = uVar8 - lVar7;
      puVar2 = puVar4;
      uVar3 = uVar6;
      if (param_3 <= uVar6) {
        uVar3 = param_3;
      }
    }
    if (param_3 < uVar6) {
      _memmove((long)puVar2 + lVar7,(long)puVar2 + lVar7 + uVar3,uVar6 - uVar3);
      uVar5 = (uint)*(byte *)((long)puVar4 + 0x17);
    }
    lVar7 = uVar8 - uVar3;
    if ((uVar5 >> 7 & 1) == 0) {
      *(byte *)((long)puVar4 + 0x17) = (byte)lVar7 & 0x7f;
    }
    else {
      puVar4[1] = lVar7;
    }
    *(undefined1 *)((long)puVar2 + lVar7) = 0;
  }
  return;
}

