
ulong FUN_00420a8c(long param_1,undefined8 param_2,long param_3)

{
  ulong uVar1;
  ulong uVar2;
  long lVar3;
  ulong uVar4;
  uint *puVar5;
  long in_x9;
  long unaff_x19;
  long lVar6;
  
  lVar6 = *(long *)(param_3 + 0x10);
  lVar3 = _recv(param_2,param_1 + lVar6,in_x9 - lVar6,0);
  if (lVar3 == -1) {
    puVar5 = (uint *)___error();
    uVar4 = (ulong)*puVar5 << 0x20 | 2;
  }
  else {
    uVar4 = 0;
    uVar1 = lVar3 + lVar6;
    uVar2 = uVar1;
    if (uVar1 <= *(ulong *)(unaff_x19 + 0x18)) {
      uVar2 = *(ulong *)(unaff_x19 + 0x18);
    }
    *(ulong *)(unaff_x19 + 0x10) = uVar1;
    *(ulong *)(unaff_x19 + 0x18) = uVar2;
  }
  return uVar4;
}

