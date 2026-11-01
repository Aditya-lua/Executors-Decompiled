
bool FUN_0017aa6c(undefined8 param_1,undefined8 param_2,long param_3)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  undefined8 *puVar4;
  undefined1 auVar5 [16];
  undefined8 uStack_18;
  
  param_3 = param_3 + 0xb50;
  auVar5 = func_0x007a247c(param_1,0x29);
  puVar4 = (undefined8 *)(auVar5._8_8_ + -0x10);
  param_3 = param_3 << 4;
  uVar2 = 1;
  do {
    if (param_3 == 0) {
      lVar3 = 0;
      goto LAB_0017aab0;
    }
    lVar3 = puVar4[3];
    puVar4 = puVar4 + 2;
    param_3 = param_3 + -0x10;
  } while (lVar3 == 0);
  uVar2 = *puVar4;
LAB_0017aab0:
  uStack_18 = 0;
  iVar1 = (*(code *)*auVar5._0_8_)(auVar5._0_8_[1],uVar2,lVar3,&uStack_18);
  return iVar1 != 0;
}

