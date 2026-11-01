
ulong FUN_00426e90(long param_1,undefined8 param_2,long param_3)

{
  ulong uVar1;
  ulong uVar2;
  long lVar3;
  uint *puVar4;
  long in_x9;
  ulong uVar5;
  long unaff_x19;
  long lVar6;
  
  lVar6 = *(long *)(param_3 + 0x10);
  uVar5 = in_x9 - lVar6;
  if (0x7ffffffd < uVar5) {
    uVar5 = 0x7ffffffe;
  }
  lVar3 = _read(param_2,param_1 + lVar6,uVar5);
  if (lVar3 == -1) {
    puVar4 = (uint *)___error();
    uVar5 = (ulong)*puVar4 << 0x20 | 2;
  }
  else {
    uVar5 = 0;
    uVar1 = lVar3 + lVar6;
    uVar2 = uVar1;
    if (uVar1 <= *(ulong *)(unaff_x19 + 0x18)) {
      uVar2 = *(ulong *)(unaff_x19 + 0x18);
    }
    *(ulong *)(unaff_x19 + 0x10) = uVar1;
    *(ulong *)(unaff_x19 + 0x18) = uVar2;
  }
  return uVar5;
}

