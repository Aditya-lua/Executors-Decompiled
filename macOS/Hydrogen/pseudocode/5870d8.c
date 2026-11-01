
void FUN_005870d8(undefined8 param_1,undefined8 *param_2)

{
  undefined *puVar1;
  undefined8 uVar2;
  undefined1 uStack0000000000000008;
  
  _uStack0000000000000008 = (int *)*param_2 + 2;
  if (*(int *)*param_2 == 1) {
    puVar1 = &UNK_008ad43e;
    uVar2 = 3;
  }
  else {
    puVar1 = &UNK_008a1588;
    uVar2 = 4;
  }
  func_0x004699b0(param_1,puVar1,uVar2,&uStack0000000000000008,&UNK_009f0b40);
  return;
}

