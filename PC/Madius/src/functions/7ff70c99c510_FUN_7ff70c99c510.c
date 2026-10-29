/* 7ff70c99c510 FUN_7ff70c99c510 */

/* WARNING: Instruction at (ram,0x7ff70c99c5ee) overlaps instruction at (ram,0x7ff70c99c5ed)
    */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong * FUN_7ff70c99c510(longlong *param_1,longlong param_2,ulonglong param_3,longlong param_4)

{
  longlong *plVar1;
  code *pcVar2;
  undefined8 uVar3;
  int iVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined1 *puVar7;
  undefined1 **ppuVar8;
  undefined1 *puStack_6b0;
  undefined1 auStack_6a8 [80];
  undefined1 auStack_658 [48];
  undefined1 auStack_628 [104];
  undefined8 uStack_5c0;
  longlong lStack_560;
  longlong alStack_180 [5];
  undefined8 uStack_158;
  undefined8 uStack_150;
  undefined8 uStack_148;
  undefined8 uStack_140;
  undefined8 uStack_138;
  undefined8 uStack_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined8 uStack_118;
  undefined8 uStack_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined1 auStack_78 [16];
  longlong lStack_68;
  undefined8 uStack_60;
  char cStack_58;
  longlong *plStack_50;
  undefined8 uStack_48;
  
  ppuVar8 = (undefined1 **)auStack_6a8;
  uStack_48 = 0xfffffffffffffffe;
  puStack_6b0 = (undefined1 *)0x7ff70c99c553;
  FUN_7ff70cb12b80(auStack_658,0,0x4d0);
  if (param_4 == 0) {
    param_2 = param_2 + 1;
    ppuVar8 = &puStack_6b0;
    puStack_6b0 = auStack_628;
    func_0x7ff70d84294f(auStack_658);
  }
  else {
    puStack_6b0 = (undefined1 *)0x7ff70c99c56b;
    FUN_7ff70cb12b60(auStack_658,*(undefined8 *)(param_4 + 8),0x4d0);
  }
  do {
    alStack_180[2] = 0;
    uStack_88 = 0;
    uStack_80 = 0;
    uStack_98 = 0;
    uStack_90 = 0;
    uStack_a8 = 0;
    uStack_a0 = 0;
    uStack_b8 = 0;
    uStack_b0 = 0;
    uStack_c8 = 0;
    uStack_c0 = 0;
    uStack_d8 = 0;
    uStack_d0 = 0;
    uStack_e8 = 0;
    uStack_e0 = 0;
    uStack_f8 = 0;
    uStack_f0 = 0;
    uStack_108 = 0;
    uStack_100 = 0;
    uStack_118 = 0;
    uStack_110 = 0;
    uStack_128 = 0;
    uStack_120 = 0;
    uStack_138 = 0;
    uStack_130 = 0;
    uStack_140 = 0;
    alStack_180[3] = 0;
    alStack_180[0] = lStack_560;
    alStack_180[1] = 0x300000000;
    alStack_180[4] = uStack_5c0;
    uStack_158 = 0x300000000;
    uStack_150 = uStack_5c0;
    uStack_148 = 0x300000000;
    *param_1 = 0;
    param_1[1] = 0;
    param_1[2] = 0;
    *(undefined8 *)((longlong)ppuVar8 + -8) = 0x7ff70c99c649;
    plStack_50 = param_1;
    FUN_7ff70c9e7890(&uStack_60);
    puVar7 = auStack_78;
    *(undefined8 *)((longlong)ppuVar8 + -8) = 0x7ff70c99c656;
    FUN_7ff70c9e7180();
    *(undefined8 *)((longlong)ppuVar8 + -8) = 0x7ff70c99c65c;
    uVar5 = func_0x7ff70da6a595();
    uVar3 = _DAT_7ff70cb961e0;
    pcVar2 = _DAT_7ff70cb961c0;
  } while (puVar7 == (undefined1 *)0x0);
  while ((ulonglong)(plStack_50[1] - *plStack_50 >> 3) < param_3) {
    *(undefined8 *)((longlong)ppuVar8 + -8) = 0x7ff70c99c6a6;
    uVar6 = FUN_7ff70c9e6fb0(auStack_78);
    *(undefined8 *)((longlong)ppuVar8 + 0x38) = _DAT_7ff70cb961f0;
    *(undefined8 *)((longlong)ppuVar8 + 0x30) = uVar3;
    *(undefined1 **)((longlong)ppuVar8 + 0x20) = auStack_658;
    *(undefined8 *)((longlong)ppuVar8 + 0x40) = 0;
    *(undefined8 *)((longlong)ppuVar8 + 0x28) = 0;
    *(undefined8 *)((longlong)ppuVar8 + -8) = 0x7ff70c99c6e4;
    iVar4 = (*pcVar2)(0x8664,uVar6,uVar5,alStack_180);
    if ((iVar4 == 0) || (alStack_180[0] == 0)) break;
    if (param_2 == 0) {
      lStack_68 = alStack_180[0] + -1;
      plVar1 = (longlong *)plStack_50[1];
      if (plVar1 == (longlong *)plStack_50[2]) {
        *(undefined8 *)((longlong)ppuVar8 + -8) = 0x7ff70c99c730;
        FUN_7ff70ca4c1e0(plStack_50,plVar1,&lStack_68);
        param_2 = 0;
      }
      else {
        *plVar1 = lStack_68;
        plStack_50[1] = plStack_50[1] + 8;
        param_2 = 0;
      }
    }
    else {
      param_2 = param_2 + -1;
    }
  }
  *(undefined8 *)((longlong)ppuVar8 + -8) = 0x7ff70c99c744;
  FUN_7ff70c9e6e50(auStack_78);
  if (cStack_58 == '\x01') {
    *(undefined8 *)((longlong)ppuVar8 + -8) = 0x7ff70c99c759;
    FUN_7ff70cb12580(uStack_60);
  }
  return plStack_50;
}


