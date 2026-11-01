
void FUN_0060c6a4(long param_1)

{
  ulong *puVar1;
  ulong *puVar2;
  ulong uVar3;
  ulong uVar4;
  undefined1 in_CY;
  ulong uVar5;
  ulong in_x9;
  ulong in_x10;
  long in_x11;
  ulong uVar6;
  ulong in_x12;
  ulong uVar7;
  
  while (!(bool)in_CY) {
    puVar1 = (ulong *)(param_1 + in_x10 * 8);
    puVar2 = (ulong *)(in_x11 + in_x10 * 8);
    uVar7 = *puVar2;
    uVar4 = *puVar1;
    uVar5 = (ulong)CARRY8(uVar7 + uVar4,in_x12);
    *puVar1 = uVar7 + uVar4 + in_x12;
    uVar6 = puVar2[1];
    uVar3 = uVar6 + puVar1[1];
    in_x12 = (ulong)(CARRY8(uVar3,uVar5) || CARRY8(uVar3 + uVar5,(ulong)CARRY8(uVar7,uVar4)));
    if (CARRY8(uVar6,puVar1[1])) {
      in_x12 = in_x12 + 1;
    }
    puVar1[1] = uVar3 + uVar5 + (ulong)CARRY8(uVar7,uVar4);
    in_x10 = in_x10 + 2;
    in_CY = in_x9 <= in_x10;
  }
  return;
}

