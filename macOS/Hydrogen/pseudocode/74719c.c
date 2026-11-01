
undefined8
FUN_0074719c(undefined8 param_1,undefined8 param_2,long param_3,undefined8 param_4,
            undefined4 *param_5)

{
  undefined4 uVar1;
  
  if (((*(byte *)(param_3 + 1) - 0x30 < 10) && (*(byte *)(param_3 + 2) - 0x30 < 10)) &&
     (*(char *)(param_3 + 3) == ' ')) {
    _strtol(param_3,0,10);
    uVar1 = func_0x0078bbd8();
    *param_5 = uVar1;
    return 1;
  }
  return 0;
}

