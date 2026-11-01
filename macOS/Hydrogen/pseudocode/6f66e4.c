
void FUN_006f66e4(undefined8 param_1,long param_2)

{
  undefined8 uVar1;
  undefined8 in_x9;
  undefined8 in_x10;
  undefined8 *puVar2;
  long unaff_x19;
  long unaff_x20;
  long lVar3;
  
  *(undefined8 *)(unaff_x19 + 0x28) = in_x10;
  *(long *)(unaff_x19 + 0x30) = param_2;
  puVar2 = *(undefined8 **)(unaff_x19 + 0x20);
  *(undefined4 *)(param_2 + 0xc) = 0;
  *puVar2 = param_1;
  puVar2[1] = param_2;
  *(undefined8 *)(unaff_x19 + 8) = param_1;
  *(undefined8 *)(unaff_x19 + 0x10) = param_1;
  puVar2[2] = in_x9;
  uVar1 = func_0x006fb408();
  *(undefined8 *)(unaff_x19 + 0x58) = uVar1;
  lVar3 = *(long *)(unaff_x19 + 0x18);
  uVar1 = func_0x006fb408();
  *(undefined8 *)(lVar3 + 0x490) = uVar1;
  *(undefined4 *)(lVar3 + 0x49c) = 6;
  func_0x006f6b38();
  func_0x006fe4b8();
  lVar3 = func_0x006f6ef8();
  *(byte *)(lVar3 + 1) = *(byte *)(lVar3 + 1) | 8;
  lVar3 = func_0x006f6ef8();
  *(byte *)(lVar3 + 1) = *(byte *)(lVar3 + 1) | 8;
  *(long *)(unaff_x20 + 0x40) = *(long *)(unaff_x20 + 0x48) << 2;
  return;
}

