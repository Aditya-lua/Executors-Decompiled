
void FUN_00508358(long param_1,long param_2)

{
  undefined8 uVar1;
  long lVar2;
  long lVar3;
  long in_x9;
  long lVar4;
  undefined8 *unaff_x19;
  long lVar5;
  
  if (param_2 == 0) {
    for (; param_1 != 0; param_1 = param_1 + -1) {
      in_x9 = *(long *)(in_x9 + 0x1c8);
    }
    lVar4 = *(long *)(in_x9 + 0x160);
    lVar5 = 0;
    param_2 = in_x9;
  }
  else {
    lVar4 = *(long *)(param_2 + 0x160);
    lVar5 = in_x9;
  }
  if (lVar4 != 0) {
    lVar2 = param_2;
    lVar3 = lVar5;
    do {
      param_2 = lVar4;
      lVar5 = lVar3 + 1;
      uVar1 = 0x1c8;
      if (lVar3 != 0) {
        uVar1 = 0x228;
      }
      func_0x00187bd4(lVar2,uVar1,8);
      lVar2 = param_2;
      lVar3 = lVar5;
      lVar4 = *(long *)(param_2 + 0x160);
    } while (*(long *)(param_2 + 0x160) != 0);
  }
  uVar1 = 0x1c8;
  if (lVar5 != 0) {
    uVar1 = 0x228;
  }
  func_0x00187bd4(param_2,uVar1,8);
  *unaff_x19 = 0;
  return;
}

