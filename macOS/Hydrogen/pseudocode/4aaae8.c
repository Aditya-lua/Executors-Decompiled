
void FUN_004aaae8(long *param_1,undefined8 param_2)

{
  long lVar1;
  undefined4 *puVar2;
  ulong uVar3;
  
  puVar2 = (undefined4 *)*param_1;
  if (puVar2 != (undefined4 *)param_1[1]) {
    lVar1 = param_1[2];
    uVar3 = (ulong)(param_1[1] - (long)puVar2) >> 2;
    do {
      func_0x0049e6ac(param_2,*puVar2,lVar1);
      lVar1 = lVar1 + 1;
      uVar3 = uVar3 - 1;
      puVar2 = puVar2 + 1;
    } while (uVar3 != 0);
  }
  return;
}

