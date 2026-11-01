
undefined8 * FUN_0029bd8c(undefined8 *param_1,undefined8 *param_2)

{
  int iVar1;
  undefined4 uVar2;
  
  if (param_2 == param_1) {
    return param_2;
  }
  iVar1 = func_0x0029afb8(param_1,(long)*(int *)(param_2 + 1));
  if (iVar1 == 0) {
    return (undefined8 *)0x0;
  }
  uVar2 = 0;
  if (*(int *)(param_2 + 1) != 0) {
    _memcpy(*param_1,*param_2,(long)*(int *)(param_2 + 1) << 3);
    uVar2 = *(undefined4 *)(param_2 + 1);
  }
  *(undefined4 *)(param_1 + 1) = uVar2;
  *(undefined4 *)(param_1 + 2) = *(undefined4 *)(param_2 + 2);
  return param_1;
}

