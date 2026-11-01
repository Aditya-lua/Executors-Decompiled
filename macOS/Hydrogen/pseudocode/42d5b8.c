
undefined1  [16] FUN_0042d5b8(ulong param_1,ulong param_2,long param_3)

{
  undefined *puVar1;
  undefined8 uVar2;
  long unaff_x19;
  undefined1 auVar3 [16];
  
  if (param_2 == (param_1 & 0xffffffff | 0x903e3ba200000000) && param_3 == -0x918ee8033412eb2) {
    puVar1 = *(undefined **)(unaff_x19 + 8);
    uVar2 = *(undefined8 *)(unaff_x19 + 0x10);
  }
  else {
    puVar1 = &UNK_00886c1f;
    uVar2 = 0xc;
  }
  auVar3._8_8_ = uVar2;
  auVar3._0_8_ = puVar1;
  return auVar3;
}

