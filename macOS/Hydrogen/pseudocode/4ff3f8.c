
void FUN_004ff3f8(undefined8 param_1,undefined8 param_2)

{
  long lVar1;
  long lVar2;
  bool bVar3;
  long lVar4;
  undefined8 uVar5;
  long lStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined *puStack_60;
  undefined8 uStack_58;
  undefined8 **ppuStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 *puStack_30;
  undefined *puStack_28;
  undefined1 *puStack_20;
  undefined *puStack_18;
  
  func_0x00187bd4(param_1,param_2,1);
  lVar4 = __Unwind_Resume();
  lStack_80 = *(long *)(lVar4 + 0x260);
  if (lStack_80 == 0) {
    lStack_80 = *(long *)(lVar4 + 0x270);
    uVar5 = *(undefined8 *)(lVar4 + 0x278);
  }
  else {
    uVar5 = *(undefined8 *)(lVar4 + 0x268);
  }
  puStack_20 = (undefined1 *)&lStack_80;
  uStack_78 = 0;
  if (lStack_80 == 0) {
    lStack_80 = 1;
  }
  else {
    uStack_78 = uVar5;
  }
  bVar3 = *(long *)(lVar4 + 0x110) != -0x8000000000000000;
  lVar1 = 0x230;
  if (bVar3) {
    lVar1 = 0x118;
  }
  lVar2 = 0x238;
  if (bVar3) {
    lVar2 = 0x120;
  }
  uStack_68 = *(undefined8 *)(lVar4 + lVar2);
  uStack_70 = *(undefined8 *)(lVar4 + lVar1);
  puStack_30 = &uStack_70;
  puStack_28 = &DAT_00519924;
  puStack_18 = &DAT_00519924;
  puStack_60 = &UNK_009e8b18;
  uStack_58 = 3;
  ppuStack_50 = &puStack_30;
  uStack_48 = 2;
  uStack_40 = 0;
  func_0x00459f08(&puStack_60);
  return;
}

