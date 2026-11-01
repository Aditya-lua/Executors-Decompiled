
undefined8 * FUN_00139830(undefined8 *param_1,long param_2)

{
  undefined1 uVar1;
  long lVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  long lVar6;
  long in_x9;
  undefined8 *puVar7;
  undefined8 *puVar9;
  undefined8 *puVar8;
  undefined8 *unaff_x19;
  long *unaff_x20;
  long unaff_x24;
  undefined1 uStack0000000000000008;
  undefined8 *puStack0000000000000010;
  undefined8 *puStack0000000000000018;
  long lStack0000000000000020;
  
  lStack0000000000000020 = param_2 + unaff_x24 * in_x9;
  _uStack0000000000000008 = param_2;
  puStack0000000000000010 = param_1;
  puStack0000000000000018 = param_1;
  func_0x001493a0(&uStack0000000000000008);
  puVar4 = puStack0000000000000018;
  puVar3 = puStack0000000000000010;
  puVar7 = (undefined8 *)*unaff_x20;
  if (puVar7 != unaff_x19) {
    puVar5 = puStack0000000000000010;
    puVar9 = unaff_x19;
    do {
      puVar8 = (undefined8 *)((long)puVar9 + -0xc);
      uVar1 = *(undefined1 *)((long)puVar9 + -4);
      puStack0000000000000010 = (undefined8 *)((long)puVar5 + -0xc);
      *puStack0000000000000010 = *puVar8;
      *(undefined1 *)((long)puVar5 + -4) = uVar1;
      puVar5 = puStack0000000000000010;
      puVar9 = puVar8;
    } while (puVar8 != puVar7);
  }
  lVar2 = unaff_x20[1] - (long)unaff_x19;
  if (lVar2 != 0) {
    _memmove(puStack0000000000000018);
    unaff_x19 = (undefined8 *)unaff_x20[1];
  }
  _uStack0000000000000008 = *unaff_x20;
  *unaff_x20 = (long)puStack0000000000000010;
  unaff_x20[1] = (long)puVar4 + lVar2;
  lVar6 = unaff_x20[2];
  unaff_x20[2] = lStack0000000000000020;
  lVar2 = (long)unaff_x19 - _uStack0000000000000008;
  puStack0000000000000018 = unaff_x19;
  if (lVar2 != 0) {
    puStack0000000000000018 = (undefined8 *)((long)unaff_x19 + ((lVar2 - 0xcU) % 0xc - lVar2));
  }
  if (_uStack0000000000000008 != 0) {
    puStack0000000000000010 = (undefined8 *)_uStack0000000000000008;
    lStack0000000000000020 = lVar6;
    __ZdlPv();
  }
  return puVar3;
}

