
void FUN_00686908(long param_1)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  
  func_0x006861dc(*(undefined8 *)(param_1 + 0x30),*(undefined8 *)(param_1 + 0x28));
  lVar1 = *(long *)(param_1 + 0x28);
  lVar2 = *(long *)(param_1 + 0x30);
  lVar4 = *(long *)(param_1 + 0x50);
  lVar3 = *(long *)(param_1 + 0x58);
  if (lVar4 != lVar1) {
    if (lVar3 != 0) {
      if (lVar4 != 0) {
        do {
          *(undefined1 *)(lVar3 + -1 + lVar4) = 0;
          lVar4 = lVar4 + -1;
        } while (lVar4 != 0);
      }
      func_0x00611644();
    }
    if (lVar1 == 0) {
      *(long *)(param_1 + 0x50) = 0;
      *(undefined8 *)(param_1 + 0x58) = 0;
      *(undefined8 *)(param_1 + 0x48) = 0xffffffffffffffff;
      return;
    }
    lVar3 = func_0x006115d0(lVar1);
  }
  *(undefined8 *)(param_1 + 0x48) = 0xffffffffffffffff;
  *(long *)(param_1 + 0x50) = lVar1;
  *(long *)(param_1 + 0x58) = lVar3;
  if ((lVar2 != 0) && (lVar3 != 0)) {
    _memcpy(lVar3,lVar2,lVar1);
  }
  *(undefined8 *)(param_1 + 0x48) = 0xffffffffffffffff;
  return;
}

