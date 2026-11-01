
uint * FUN_00423084(ulong *param_1,undefined4 *param_2)

{
  int iVar1;
  uint *puVar2;
  undefined4 *puVar3;
  ulong *extraout_x8;
  ulong uVar4;
  ulong uVar5;
  uint uVar6;
  undefined1 uStack0000000000000008;
  int iStack0000000000000010;
  undefined1 uStack000000000000001c;
  ulong uStack_38;
  int iStack_30;
  undefined4 uStack_24;
  undefined8 uStack_20;
  ulong *puStack_18;
  long lStack_10;
  undefined *puStack_8;
  
  _uStack0000000000000008 = 0;
  iStack0000000000000010 = 0;
  _uStack000000000000001c = 0x10;
  puVar2 = (uint *)_getsockopt(*param_2,0xffff,
                               "orks/CoreFoundation.framework/Versions/A/CoreFoundation",
                               &uStack0000000000000008,&uStack000000000000001c);
  uVar6 = 1000000000;
  if ((int)puVar2 == -1) {
    puVar2 = (uint *)___error();
    *param_1 = (ulong)*puVar2 << 0x20 | 2;
    uVar6 = 0x3b9aca01;
  }
  else if (_uStack0000000000000008 != 0 || iStack0000000000000010 != 0) {
    uVar6 = iStack0000000000000010 * 1000;
    if (999999999 < uVar6) {
      uVar4 = (ulong)(uVar6 >> 9) * 0x44b83;
      uVar5 = uVar4 >> 0x27;
      if (CARRY8(_uStack0000000000000008,uVar5)) {
        puVar3 = (undefined4 *)func_0x007a23d8(&UNK_008850f5,0x19,&UNK_009d9300);
        uStack_20 = 1000000000;
        puStack_8 = &__ZN3std2os4unix3net6stream10UnixStream13write_timeout17h6b5b6d9dd6c99241E;
        uVar6 = 1000000000;
        uStack_38 = 0;
        iStack_30 = 0;
        uStack_24 = 0x10;
        puStack_18 = param_1;
        lStack_10 = (long)register0x00000008 + 0x30;
        puVar2 = (uint *)_getsockopt(*puVar3,0xffff,
                                     "works/CoreFoundation.framework/Versions/A/CoreFoundation",
                                     &uStack_38,&uStack_24);
        if ((int)puVar2 == -1) {
          puVar2 = (uint *)___error();
          *extraout_x8 = (ulong)*puVar2 << 0x20 | 2;
          uVar6 = 0x3b9aca01;
        }
        else if (uStack_38 != 0 || iStack_30 != 0) {
          uVar6 = iStack_30 * 1000;
          if (999999999 < uVar6) {
            uVar4 = (ulong)(uVar6 >> 9) * 0x44b83;
            uVar5 = uVar4 >> 0x27;
            if (CARRY8(uStack_38,uVar5)) {
              puVar3 = (undefined4 *)func_0x007a23d8(&UNK_008850f5,0x19,&UNK_009d9300);
              iVar1 = _ioctl(*puVar3,0x8004667e);
              if (iVar1 == -1) {
                puVar2 = (uint *)___error();
                puVar2 = (uint *)((ulong)*puVar2 << 0x20 | 2);
              }
              else {
                puVar2 = (uint *)0x0;
              }
              return puVar2;
            }
            uStack_38 = uStack_38 + uVar5;
            uVar6 = uVar6 + (uint)(uVar4 >> 0x27) * -1000000000;
          }
          *extraout_x8 = uStack_38;
        }
        *(uint *)(extraout_x8 + 1) = uVar6;
        return puVar2;
      }
      _uStack0000000000000008 = _uStack0000000000000008 + uVar5;
      uVar6 = uVar6 + (uint)(uVar4 >> 0x27) * -1000000000;
    }
    *param_1 = _uStack0000000000000008;
  }
  *(uint *)(param_1 + 1) = uVar6;
  return puVar2;
}

