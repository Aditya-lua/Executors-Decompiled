
void FUN_0061ce28(long param_1,ulong param_2)

{
  ulong uVar1;
  uint uVar2;
  long *plVar3;
  long lVar4;
  ulong uVar5;
  
  plVar3 = (long *)(**(code **)(*(long *)(param_1 + -8) + 0xe0))();
  uVar2 = (**(code **)(*plVar3 + 0x18))();
  uVar5 = (ulong)uVar2;
  uVar1 = 0;
  if (uVar5 != 0) {
    uVar1 = param_2 / uVar5;
  }
  (**(code **)(*plVar3 + 0x60))(plVar3,uVar1);
  lVar4 = param_2 - uVar1 * uVar5;
  if (lVar4 == 0) {
    *(undefined8 *)(param_1 + 0x60) = 0;
    return;
  }
  (**(code **)(*plVar3 + 0x30))
            (plVar3,(*(long *)(param_1 + 0x58) + *(long *)(param_1 + 0x50)) - uVar5,1);
  *(ulong *)(param_1 + 0x60) = (ulong)(uVar2 - (int)lVar4);
  return;
}

