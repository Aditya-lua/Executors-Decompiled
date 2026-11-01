
void FUN_0059fc50(long param_1,long param_2)

{
  long in_x9;
  long in_x10;
  long *plVar1;
  long lVar2;
  long *unaff_x19;
  long unaff_x20;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  
  lVar4 = *(long *)(in_x10 + 0x2d8);
  lVar3 = *(long *)(in_x10 + 0x2d0);
  plVar1 = (long *)(param_2 + 0x20);
  lVar2 = in_x9;
  do {
    lVar5 = unaff_x20 + lVar3 * 0x10;
    lVar6 = unaff_x20 + lVar4 * 0x10;
    plVar1[-3] = lVar6 + 8;
    plVar1[-4] = lVar5 + 8;
    plVar1[-1] = lVar6 + 0x28;
    plVar1[-2] = lVar5 + 0x28;
    plVar1[1] = lVar6 + 0x48;
    *plVar1 = lVar5 + 0x48;
    plVar1[3] = lVar6 + 0x68;
    plVar1[2] = lVar5 + 0x68;
    lVar3 = lVar3 + 8;
    lVar4 = lVar4 + 8;
    lVar2 = lVar2 + -8;
    plVar1 = plVar1 + 8;
  } while (lVar2 != 0);
  if (param_1 != in_x9) {
    lVar2 = unaff_x20 + in_x9 * 0x10 + 8;
    do {
      *(long *)(param_2 + in_x9 * 8) = lVar2;
      in_x9 = in_x9 + 1;
      lVar2 = lVar2 + 0x10;
    } while (param_1 != in_x9);
  }
  *unaff_x19 = param_1;
  unaff_x19[1] = param_2;
  unaff_x19[2] = param_1;
  return;
}

