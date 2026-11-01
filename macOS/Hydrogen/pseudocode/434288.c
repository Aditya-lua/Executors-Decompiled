
undefined1  [16] FUN_00434288(undefined8 param_1)

{
  int iVar1;
  undefined8 uVar2;
  uint *puVar3;
  ulong uVar4;
  long unaff_x29;
  undefined1 auVar5 [16];
  undefined1 uStack0000000000000008;
  
  _uStack0000000000000008 = 0;
  *(undefined4 *)(unaff_x29 + -4) = 4;
  iVar1 = _getsockopt(param_1,0xffff,"rks/CoreFoundation.framework/Versions/A/CoreFoundation",
                      &uStack0000000000000008,unaff_x29 + -4);
  if (iVar1 == -1) {
    puVar3 = (uint *)___error();
    uVar4 = (ulong)*puVar3 << 0x20 | 2;
    uVar2 = 1;
  }
  else {
    uVar4 = 0;
    if (_uStack0000000000000008 != 0) {
      uVar4 = (long)_uStack0000000000000008 << 0x20 | 2;
    }
    uVar2 = 0;
  }
  auVar5._8_8_ = uVar4;
  auVar5._0_8_ = uVar2;
  return auVar5;
}

