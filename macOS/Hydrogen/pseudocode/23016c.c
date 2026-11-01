
void FUN_0023016c(long *param_1,undefined8 param_2)

{
  undefined *puVar1;
  undefined8 uVar2;
  undefined *puVar3;
  long *plStack_18;
  
  plStack_18 = (long *)*param_1;
  if (*plStack_18 == -0x8000000000000000) {
    plStack_18 = plStack_18 + 1;
    puVar1 = &UNK_008151a0;
    puVar3 = &UNK_009c8c28;
    uVar2 = 8;
  }
  else {
    puVar1 = &UNK_00828fcc;
    puVar3 = &UNK_009c8c08;
    uVar2 = 5;
  }
  func_0x004699b0(param_2,puVar1,uVar2,&plStack_18,puVar3);
  return;
}

