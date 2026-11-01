
void FUN_004b3118(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  undefined *puVar1;
  undefined8 uVar2;
  undefined *puVar3;
  long in_x9;
  undefined1 uStack0000000000000008;
  
  if (in_x9 == 0) {
    puVar3 = &UNK_009e4cc8;
    puVar1 = &UNK_008a15bf;
    uVar2 = 5;
  }
  else if (in_x9 == 1) {
    puVar3 = &UNK_009e4ce8;
    puVar1 = &UNK_008a15c4;
    uVar2 = 6;
  }
  else {
    puVar3 = &UNK_009e4d28;
    puVar1 = &UNK_0089fb00;
    uVar2 = 4;
  }
  _uStack0000000000000008 = param_1;
  func_0x004699b0(param_3,puVar1,uVar2,&uStack0000000000000008,puVar3);
  return;
}

