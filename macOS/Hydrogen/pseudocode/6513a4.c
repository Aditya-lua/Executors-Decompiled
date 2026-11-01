
void FUN_006513a4(long *param_1,undefined8 *param_2)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  
  lVar2 = *param_1;
  lVar1 = param_1[1];
  lVar3 = param_2[1];
  if (lVar1 != lVar2) {
    lVar4 = 0;
    do {
      func_0x00651558(lVar3 + lVar4 + -0xa0,lVar1 + lVar4 + -0xa0);
      lVar4 = lVar4 + -0xa0;
    } while (lVar1 + lVar4 != lVar2);
    lVar3 = lVar3 + lVar4;
  }
  param_2[1] = lVar3;
  lVar2 = *param_1;
  *param_1 = lVar3;
  param_2[1] = lVar2;
  lVar3 = param_1[1];
  param_1[1] = param_2[2];
  param_2[2] = lVar3;
  lVar3 = param_1[2];
  param_1[2] = param_2[3];
  param_2[3] = lVar3;
  *param_2 = param_2[1];
  return;
}

