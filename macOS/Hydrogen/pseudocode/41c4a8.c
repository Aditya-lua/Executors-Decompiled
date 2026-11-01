
undefined8 FUN_0041c4a8(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  undefined8 *unaff_x19;
  undefined1 auVar4 [16];
  undefined8 *puStack_38;
  
  unaff_x19[3] = param_1 + 1;
  iVar1 = *(int *)(unaff_x19 + 2);
  *(int *)(unaff_x19 + 2) = iVar1 + -1;
  if (iVar1 + -1 == 0) {
    unaff_x19[1] = 0;
    _pthread_mutex_unlock(*unaff_x19);
  }
  auVar4 = __Unwind_Resume();
  puVar2 = (undefined8 *)func_0x0041d068(*auVar4._0_8_);
  puStack_38 = puVar2;
  uVar3 = func_0x0041cac8(&puStack_38,auVar4._8_8_,param_4);
  iVar1 = *(int *)(puVar2 + 2);
  *(int *)(puVar2 + 2) = iVar1 + -1;
  if (iVar1 + -1 == 0) {
    puVar2[1] = 0;
    _pthread_mutex_unlock(*puVar2);
  }
  return uVar3;
}

