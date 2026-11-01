
void FUN_006000c0(long param_1)

{
  long lVar1;
  int in_w8;
  long lVar2;
  long lVar3;
  
  if ((in_w8 != 1) && (**(long **)(param_1 + 0x20) == 0)) {
    lVar2 = *(long *)(param_1 + 0x18);
    do {
      if (lVar2 == 0) {
        return;
      }
      lVar3 = lVar2 + -1;
      lVar1 = lVar2 + -1;
      lVar2 = lVar3;
    } while ((*(long **)(param_1 + 0x20))[lVar1] == 0);
    if ((int)lVar3 == -1) {
      return;
    }
  }
  *(int *)(param_1 + 0x28) = 1 - in_w8;
  return;
}

