
void FUN_00575790(long param_1,undefined8 param_2,undefined8 param_3)

{
  undefined *puVar1;
  undefined8 uVar2;
  undefined *puVar3;
  undefined1 uStack0000000000000008;
  
  if (param_1 == 1) {
    puVar3 = &UNK_009efb20;
    puVar1 = &UNK_008ac4af;
    uVar2 = 6;
  }
  else {
    puVar3 = &UNK_009efb60;
    puVar1 = &UNK_0089fb00;
    uVar2 = 4;
  }
  _uStack0000000000000008 = param_2;
  func_0x004699b0(param_3,puVar1,uVar2,&uStack0000000000000008,puVar3);
  return;
}

