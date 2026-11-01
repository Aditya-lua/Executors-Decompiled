
undefined8 FUN_006f85a4(long param_1)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  undefined8 uVar4;
  long lVar5;
  char *pcVar6;
  long in_x9;
  uint auStack_38 [2];
  
  if (**(long **)(in_x9 + 0x1e8) == param_1) {
    return 1;
  }
  uVar4 = ___stack_chk_fail();
  lVar5 = func_0x006e67c8(uVar4,1,auStack_38);
  iVar3 = func_0x006e6bc0(uVar4,2);
  uVar1 = (auStack_38[0] + 1 & iVar3 >> 0x1f) + iVar3;
  iVar3 = func_0x006e6c08(uVar4,3,0xffffffff);
  uVar2 = (auStack_38[0] + 1 & iVar3 >> 0x1f) + iVar3;
  uVar2 = uVar2 & ((int)uVar2 >> 0x1f ^ 0xffffffffU);
  if ((int)uVar1 < 2) {
    uVar1 = 1;
  }
  if ((int)auStack_38[0] <= (int)uVar2) {
    uVar2 = auStack_38[0];
  }
  if ((int)uVar2 < (int)uVar1) {
    pcVar6 = "";
    lVar5 = 0;
  }
  else {
    pcVar6 = (char *)(lVar5 + (ulong)uVar1 + -1);
    lVar5 = (long)(int)((uVar2 - uVar1) + 1);
  }
  func_0x006e38d8(uVar4,pcVar6,lVar5);
  return 1;
}

