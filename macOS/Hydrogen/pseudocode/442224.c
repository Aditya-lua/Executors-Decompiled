
void FUN_00442224(ulong *param_1)

{
  bool bVar1;
  undefined *in_x9;
  ulong in_x10;
  undefined2 in_w11;
  long in_x12;
  ulong uVar2;
  long lVar3;
  long lVar4;
  
  uVar2 = (in_x12 + 0x10) - (long)in_x9;
  bVar1 = in_x10 <= uVar2;
  if (bVar1) {
    uVar2 = 0x27;
    lVar3 = 0x10;
    lVar4 = 8;
    in_x9 = &UNK_00888a9e;
  }
  else {
    *(undefined2 *)(param_1 + 1) = in_w11;
    lVar3 = 0x18;
    lVar4 = 0x10;
  }
  *(undefined **)((long)param_1 + lVar4) = in_x9;
  *(ulong *)((long)param_1 + lVar3) = uVar2;
  *param_1 = (ulong)bVar1;
  return;
}

