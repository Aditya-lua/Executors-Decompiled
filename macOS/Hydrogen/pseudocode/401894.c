
void FUN_00401894(undefined8 param_1,uint *param_2)

{
  undefined8 uVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  undefined8 *unaff_x19;
  long lVar5;
  long lVar6;
  
  lVar6 = *(long *)(param_2 + 2);
  lVar5 = *(long *)(param_2 + 4);
  lVar2 = *(long *)(param_2 + 6);
  param_2[0] = 0;
  param_2[1] = 0;
  if ((*param_2 & 1) != 0) {
    if (lVar6 == 0) {
      for (; lVar2 != 0; lVar2 = lVar2 + -1) {
        lVar5 = *(long *)(lVar5 + 0x538);
      }
      lVar3 = *(long *)(lVar5 + 0x4d0);
      lVar2 = 0;
      lVar6 = lVar5;
    }
    else {
      lVar3 = *(long *)(lVar6 + 0x4d0);
      lVar2 = lVar5;
    }
    if (lVar3 != 0) {
      lVar5 = lVar6;
      lVar4 = lVar2;
      do {
        lVar6 = lVar3;
        lVar2 = lVar4 + 1;
        uVar1 = 0x538;
        if (lVar4 != 0) {
          uVar1 = 0x598;
        }
        func_0x00187bd4(lVar5,uVar1,8);
        lVar5 = lVar6;
        lVar3 = *(long *)(lVar6 + 0x4d0);
        lVar4 = lVar2;
      } while (*(long *)(lVar6 + 0x4d0) != 0);
    }
    uVar1 = 0x538;
    if (lVar2 != 0) {
      uVar1 = 0x598;
    }
    func_0x00187bd4(lVar6,uVar1,8);
  }
  *unaff_x19 = 0;
  return;
}

