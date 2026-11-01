
long * FUN_00660bc4(long *param_1,long *param_2)

{
  long lVar1;
  long *plVar2;
  long *plVar3;
  
  *param_1 = (long)&UNK_00a0b780;
  plVar2 = param_1 + 1;
  *plVar2 = (long)&UNK_009b9688;
  lVar1 = param_2[5];
  plVar3 = param_1 + 2;
  *plVar3 = lVar1;
  *(long *)((long)plVar3 + *(long *)(lVar1 + -0x70)) = param_2[6];
  lVar1 = param_2[4];
  *plVar3 = lVar1;
  *(long *)((long)plVar3 + *(long *)(lVar1 + -0x70)) = param_2[7];
  lVar1 = param_2[3];
  *plVar2 = lVar1;
  *plVar3 = param_2[8];
  *(long *)((long)plVar2 + *(long *)(lVar1 + -0x18)) = param_2[9];
  lVar1 = param_2[2];
  *plVar2 = lVar1;
  *plVar3 = param_2[10];
  *(long *)((long)plVar2 + *(long *)(lVar1 + -0x18)) = param_2[0xb];
  func_0x006986fc(param_1 + 3,0);
  lVar1 = param_2[1];
  *plVar2 = lVar1;
  *plVar3 = param_2[0xc];
  *(long *)((long)plVar2 + *(long *)(lVar1 + -0x18)) = param_2[0xd];
  func_0x00633de0(param_1 + 0xc);
  lVar1 = *param_2;
  *param_1 = lVar1;
  param_1[1] = param_2[0xe];
  param_1[2] = param_2[0xf];
  *(long *)((long)param_1 + *(long *)(lVar1 + -0x18)) = param_2[0x10];
  func_0x005fdd18(param_1 + 0x3b);
  return param_1;
}

