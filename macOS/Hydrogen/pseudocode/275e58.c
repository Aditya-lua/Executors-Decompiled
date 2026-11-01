
void FUN_00275e58(undefined8 *param_1,undefined8 *param_2)

{
  undefined *puVar1;
  long lVar2;
  long lVar3;
  
  lVar3 = func_0x002d9650(*param_2);
  puVar1 = &UNK_0082d551;
  if (lVar3 != 0) {
    puVar1 = (undefined *)0x0;
  }
  lVar2 = 0xe;
  if (lVar3 != 0) {
    lVar2 = lVar3;
  }
  *param_1 = puVar1;
  param_1[1] = lVar2;
  return;
}

