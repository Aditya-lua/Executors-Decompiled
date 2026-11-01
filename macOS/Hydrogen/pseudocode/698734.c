
void FUN_00698734(long param_1)

{
  long lVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  long unaff_x19;
  long unaff_x20;
  
  *(undefined8 *)(param_1 + 0x20) = 0;
  *(undefined8 *)(param_1 + 0x18) = 0;
  *(undefined8 *)(param_1 + 0x30) = 0;
  *(undefined8 *)(param_1 + 0x28) = 0;
  *(undefined1 *)(param_1 + 0x40) = 0;
  lVar1 = 0x100;
  if (unaff_x20 != 0) {
    lVar1 = unaff_x20;
  }
  *(bool *)(param_1 + 0x41) = unaff_x20 == 0;
  *(long *)(param_1 + 0x38) = lVar1;
  puVar2 = (undefined8 *)__Znwm(0x38);
  puVar2[2] = 0xffffffffffffffff;
  puVar2[3] = lVar1;
  uVar3 = func_0x006115d0(lVar1);
  *puVar2 = 0;
  puVar2[5] = 0;
  puVar2[6] = 0;
  puVar2[4] = uVar3;
  *(undefined8 **)(unaff_x19 + 0x18) = puVar2;
  *(undefined8 **)(unaff_x19 + 0x20) = puVar2;
  return;
}

