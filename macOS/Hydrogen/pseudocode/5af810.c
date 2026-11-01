
void FUN_005af810(long param_1)

{
  bool in_ZR;
  dword *pdVar1;
  long *plVar2;
  undefined8 uVar3;
  undefined8 *extraout_x8;
  ulong uVar4;
  undefined8 *unaff_x19;
  undefined1 auVar5 [16];
  ulong *puStack_78;
  undefined *puStack_70;
  undefined8 uStack_68;
  ulong ***pppuStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  ulong **ppuStack_40;
  undefined *puStack_38;
  undefined1 *puStack_30;
  undefined8 uStack_28;
  long lStack_20;
  undefined1 auStack_6 [6];
  
  if (in_ZR) {
    pdVar1 = (dword *)func_0x00187bd0(8,8);
    if (pdVar1 == (dword *)0x0) {
      plVar2 = (long *)func_0x007a1f18(8,8);
      if (*plVar2 == -0x8000000000000000) {
        lStack_20 = param_1;
        pdVar1 = (dword *)func_0x00187bd0(8,8);
        if (pdVar1 == (dword *)0x0) {
          auVar5 = func_0x007a1f18(8,8);
          puStack_78 = auVar5._0_8_;
          uStack_28 = 0x5af8e4;
          uVar4 = *puStack_78 ^ 0x8000000000000000;
          if (2 < uVar4) {
            uVar4 = 1;
          }
          if (uVar4 == 0) {
            puStack_78 = puStack_78 + 1;
            puStack_38 = &DAT_005c91c4;
          }
          else if (uVar4 == 1) {
            puStack_38 = &DAT_005c91d4;
          }
          else {
            puStack_78 = puStack_78 + 1;
            puStack_38 = &DAT_005cd9b4;
          }
          ppuStack_40 = &puStack_78;
          puStack_70 = &UNK_007fc120;
          uStack_68 = 1;
          uStack_58 = 1;
          uStack_50 = 0;
          pppuStack_60 = &ppuStack_40;
          puStack_30 = auStack_6 + -10;
          func_0x0046849c(*auVar5._8_8_,auVar5._8_8_[1],&puStack_70);
          return;
        }
        *(long **)pdVar1 = plVar2 + 1;
        uVar3 = 1;
      }
      else {
        uVar3 = 0;
        pdVar1 = &MACH_HEADER.cpusubtype;
      }
      *extraout_x8 = uVar3;
      extraout_x8[1] = pdVar1;
      extraout_x8[2] = uVar3;
      return;
    }
    *(long *)pdVar1 = param_1 + 8;
    uVar3 = 1;
  }
  else {
    uVar3 = 0;
    pdVar1 = &MACH_HEADER.cpusubtype;
  }
  *unaff_x19 = uVar3;
  unaff_x19[1] = pdVar1;
  unaff_x19[2] = uVar3;
  return;
}

