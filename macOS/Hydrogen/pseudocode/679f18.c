
void FUN_00679f18(long param_1,long *param_2,long param_3)

{
  long lVar1;
  undefined8 uVar2;
  long lVar3;
  uint uVar4;
  long lVar5;
  
  lVar5 = *(long *)(param_3 + 0x10);
  *(undefined8 *)(param_1 + 8) = 0x1fffffffffffffff;
  *(long *)(param_1 + 0x10) = lVar5;
  func_0x006108a0(lVar5);
  if (lVar5 == 0) {
    lVar1 = 0;
    *(undefined8 *)(param_1 + 0x18) = 0;
    lVar3 = *(long *)(param_3 + 0x18);
    if (lVar3 == 0) goto LAB_00679f68;
  }
  else {
    lVar1 = func_0x006115d0(lVar5 << 3);
    *(long *)(param_1 + 0x18) = lVar1;
    lVar3 = *(long *)(param_3 + 0x18);
    if (lVar1 == lVar3) goto LAB_00679f68;
  }
  _memcpy(lVar1,lVar3,lVar5 << 3);
LAB_00679f68:
  if (1 < (int)param_2[0x12] - 1U) {
    uVar4 = 0;
    do {
      uVar2 = (**(code **)(*param_2 + 0x90))(param_2,param_1);
      uVar2 = (**(code **)(*param_2 + 0x90))(param_2,uVar2);
      uVar2 = (**(code **)(*param_2 + 0x20))(param_2,uVar2,param_3);
      func_0x006771a4(param_1,uVar2);
      uVar4 = uVar4 + 1;
    } while (uVar4 < (int)param_2[0x12] - 1U >> 1);
  }
  return;
}

