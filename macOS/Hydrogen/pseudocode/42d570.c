
undefined1  [16] FUN_0042d570(undefined8 *param_1,long param_2)

{
  undefined *puVar1;
  undefined8 uVar2;
  long lVar3;
  undefined8 *puVar4;
  code *pcVar5;
  undefined1 auVar6 [16];
  
  pcVar5 = *(code **)(param_2 + 0x18);
  auVar6 = (*pcVar5)();
  if (auVar6._0_8_ == -0x4674e48ea859be88 && auVar6._8_8_ == 0x63eb502cd6cb5d6d) {
    lVar3 = 8;
    puVar4 = param_1;
  }
  else {
    auVar6 = (*pcVar5)(param_1);
    if (auVar6._0_8_ != -0x6fc1c45dc407a2e1 || auVar6._8_8_ != -0x918ee8033412eb2) {
      puVar1 = &UNK_00886c1f;
      uVar2 = 0xc;
      goto LAB_0042d608;
    }
    lVar3 = 0x10;
    puVar4 = param_1 + 1;
  }
  puVar1 = (undefined *)*puVar4;
  uVar2 = *(undefined8 *)((long)param_1 + lVar3);
LAB_0042d608:
  auVar6._8_8_ = uVar2;
  auVar6._0_8_ = puVar1;
  return auVar6;
}

