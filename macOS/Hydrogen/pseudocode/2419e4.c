
void FUN_002419e4(long param_1,long param_2)

{
  long lVar1;
  undefined8 *puVar2;
  
  puVar2 = (undefined8 *)(param_1 + 0x10);
  do {
    if (((*(byte *)(puVar2 + -2) & 1) == 0) &&
       (lVar1 = puVar2[-1], lVar1 != -0x8000000000000000 && lVar1 != 0)) {
      func_0x00187bd4(*puVar2,lVar1,1);
    }
    puVar2 = puVar2 + 4;
    param_2 = param_2 + -1;
  } while (param_2 != 0);
  return;
}

