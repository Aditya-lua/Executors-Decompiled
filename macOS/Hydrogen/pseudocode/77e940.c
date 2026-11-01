
long FUN_0077e940(undefined8 param_1,long param_2)

{
  long lVar1;
  
  lVar1 = (*pcRam0000000000a2b5e8)(param_2 + 1);
  if (lVar1 != 0) {
    _memcpy(lVar1,param_1,param_2);
    *(undefined1 *)(lVar1 + param_2) = 0;
  }
  return lVar1;
}

