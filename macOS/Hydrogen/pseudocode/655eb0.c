
long FUN_00655eb0(undefined8 param_1,undefined8 param_2,long param_3,long param_4)

{
  undefined8 *puVar1;
  long extraout_x1;
  long lVar2;
  
  __Unwind_Resume();
  if (extraout_x1 != param_3) {
    lVar2 = 0;
    do {
      puVar1 = (undefined8 *)(param_4 + lVar2);
      *puVar1 = &UNK_00a09a70;
      func_0x00675bac(puVar1 + 1,extraout_x1 + lVar2 + 8);
      func_0x00675bac(puVar1 + 5,extraout_x1 + lVar2 + 0x28);
      *(undefined1 *)(param_4 + lVar2 + 0x48) = *(undefined1 *)(extraout_x1 + lVar2 + 0x48);
      lVar2 = lVar2 + 0x50;
    } while (extraout_x1 + lVar2 != param_3);
    param_4 = param_4 + lVar2;
  }
  return param_4;
}

