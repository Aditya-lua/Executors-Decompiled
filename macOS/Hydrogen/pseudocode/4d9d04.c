
void FUN_004d9d04(undefined8 param_1)

{
  undefined *puVar1;
  undefined8 uVar2;
  undefined *puVar3;
  long in_x9;
  ulong in_x10;
  ulong in_x11;
  undefined1 uStack0000000000000008;
  
  if (1 < in_x10) {
    in_x10 = in_x11;
  }
  _uStack0000000000000008 = in_x9;
  if (in_x10 == 0) {
    puVar1 = &UNK_008a2e69;
    puVar3 = &UNK_009e73b0;
    uVar2 = 6;
  }
  else if (in_x10 == 1) {
    _uStack0000000000000008 = in_x9 + 8;
    puVar1 = &UNK_0089fb00;
    puVar3 = &UNK_009e7370;
    uVar2 = 4;
  }
  else {
    puVar1 = &UNK_008a2e5f;
    puVar3 = &UNK_009e7390;
    uVar2 = 10;
  }
  func_0x004699b0(param_1,puVar1,uVar2,&uStack0000000000000008,puVar3);
  return;
}

