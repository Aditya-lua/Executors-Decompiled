
uint * FUN_004207e4(undefined4 *param_1)

{
  undefined4 uVar1;
  int iVar2;
  uint *puVar3;
  ulong uVar4;
  ulong uVar5;
  ulong *unaff_x19;
  uint unaff_w20;
  uint uVar6;
  long unaff_x29;
  undefined1 auVar7 [12];
  undefined1 uStack0000000000000008;
  int iStack0000000000000010;
  uint uStack_18;
  undefined4 uStack_14;
  
  uVar1 = *param_1;
  _uStack0000000000000008 = 0;
  iStack0000000000000010 = 0;
  *(undefined4 *)(unaff_x29 + -0x14) = 0x10;
  puVar3 = (uint *)_getsockopt(uVar1,0xffff,
                               "works/CoreFoundation.framework/Versions/A/CoreFoundation",
                               &uStack0000000000000008,unaff_x29 + -0x14);
  if ((int)puVar3 == -1) {
    puVar3 = (uint *)___error();
    *unaff_x19 = (ulong)*puVar3 << 0x20 | 2;
    uVar6 = unaff_w20 + 1;
  }
  else {
    uVar6 = unaff_w20;
    if (_uStack0000000000000008 != 0 || iStack0000000000000010 != 0) {
      uVar6 = iStack0000000000000010 * 1000;
      if (unaff_w20 <= uVar6) {
        uVar4 = (ulong)(uVar6 >> 9) * 0x44b83;
        uVar5 = uVar4 >> 0x27;
        if (CARRY8(_uStack0000000000000008,uVar5)) {
          iVar2 = 0x9d9300;
          auVar7 = func_0x007a23d8(&UNK_008850f5,0x19);
          uStack_14 = auVar7._8_4_;
          if (iVar2 == 1000000000) {
            uStack_14 = 0;
          }
          uStack_18 = (uint)(iVar2 != 1000000000);
          iVar2 = _setsockopt(*auVar7._0_8_,0xffff,"k/Versions/A/LDAP",&uStack_18,8);
          if (iVar2 == -1) {
            puVar3 = (uint *)___error();
            puVar3 = (uint *)((ulong)*puVar3 << 0x20 | 2);
          }
          else {
            puVar3 = (uint *)0x0;
          }
          return puVar3;
        }
        _uStack0000000000000008 = _uStack0000000000000008 + uVar5;
        uVar6 = uVar6 - (uint)(uVar4 >> 0x27) * unaff_w20;
      }
      *unaff_x19 = _uStack0000000000000008;
    }
  }
  *(uint *)(unaff_x19 + 1) = uVar6;
  return puVar3;
}

