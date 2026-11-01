
long FUN_00655a5c(undefined8 param_1,long param_2,long param_3,long param_4)

{
  undefined8 *puVar1;
  long lVar2;
  
  if (param_2 != param_3) {
    lVar2 = 0;
    do {
      puVar1 = (undefined8 *)(param_4 + lVar2);
      *puVar1 = &UNK_00a09a40;
      func_0x005fe0b4(puVar1 + 1,param_2 + lVar2 + 8);
      func_0x005fe0b4(puVar1 + 7,param_2 + lVar2 + 0x38);
      *(undefined1 *)(param_4 + lVar2 + 0x68) = *(undefined1 *)(param_2 + lVar2 + 0x68);
      lVar2 = lVar2 + 0x70;
    } while (param_2 + lVar2 != param_3);
    param_4 = param_4 + lVar2;
  }
  return param_4;
}

