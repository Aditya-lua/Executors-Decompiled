
bool FUN_0074fc70(long param_1,undefined8 param_2)

{
  int iVar1;
  ulong uVar2;
  ulong uVar3;
  
  uVar2 = _strlen(param_2);
  uVar3 = _strlen(param_1);
  if (uVar3 < uVar2) {
    return false;
  }
  iVar1 = func_0x0077e76c(param_2,param_1 + (uVar3 - uVar2),uVar2);
  return iVar1 != 0;
}

