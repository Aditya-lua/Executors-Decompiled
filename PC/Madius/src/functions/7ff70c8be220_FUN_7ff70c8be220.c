/* 7ff70c8be220 FUN_7ff70c8be220 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c8be220(void)

{
  longlong *plVar1;
  longlong *plVar2;
  longlong lVar3;
  undefined8 *puVar4;
  code *pcVar5;
  int iVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  longlong *plVar9;
  ulonglong uVar10;
  longlong lVar11;
  longlong lVar12;
  undefined1 auStack_1d8 [32];
  longlong *plStack_1b8;
  longlong *plStack_1b0;
  undefined *puStack_1a8;
  undefined4 uStack_1a0;
  undefined4 uStack_198;
  longlong **pplStack_190;
  undefined8 uStack_188;
  undefined4 uStack_178;
  undefined4 uStack_174;
  undefined4 uStack_170;
  undefined4 uStack_16c;
  undefined8 uStack_168;
  longlong *plStack_160;
  undefined8 uStack_158;
  undefined4 uStack_150;
  undefined4 uStack_14c;
  undefined4 uStack_148;
  undefined4 uStack_144;
  undefined4 uStack_140;
  undefined4 uStack_13c;
  undefined4 uStack_138;
  undefined4 uStack_134;
  undefined4 uStack_130;
  undefined4 uStack_12c;
  undefined4 uStack_128;
  undefined4 uStack_124;
  undefined8 uStack_120;
  undefined8 uStack_118;
  undefined8 uStack_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  ulonglong uStack_50;
  
  uVar10 = _DAT_7ff70cbebd80 ^ (ulonglong)&stack0xffffffffffffffd8;
  FUN_7ff70c808680();
  lVar11 = FUN_7ff70c8194a0();
  if (*(longlong *)(*(longlong *)(lVar11 + 0x98) + 0x28) != 0) {
    if (_DAT_7ff70cbebd80 == (uVar10 ^ (ulonglong)&stack0xffffffffffffffd8)) {
      return uVar10 ^ (ulonglong)&stack0xffffffffffffffd8;
    }
LAB_7ff70c8be281:
    FUN_7ff70caa97e0(uVar10 ^ (ulonglong)&stack0xffffffffffffffd8);
    pcVar5 = (code *)swi(3);
    uVar10 = (*pcVar5)();
    return uVar10;
  }
  if (_DAT_7ff70cbebd80 != (uVar10 ^ (ulonglong)&stack0xffffffffffffffd8)) goto LAB_7ff70c8be281;
  uStack_50 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_1d8;
  FUN_7ff70c808680();
  lVar11 = FUN_7ff70c8194a0();
  plVar1 = *(longlong **)(lVar11 + 0x98);
  if (*plVar1 != 0) {
    FUN_7ff70c808680();
    lVar11 = FUN_7ff70c8194a0();
    plVar2 = *(longlong **)(lVar11 + 0x98);
    if (*plVar2 != 0) {
      lVar11 = FUN_7ff70c819540();
      iVar6 = *(int *)(lVar11 + 0x50);
      if ((longlong)iVar6 != 0) {
        lVar11 = *(longlong *)(lVar11 + 0x58);
        lVar12 = 0;
        do {
          lVar3 = *(longlong *)(lVar11 + lVar12);
          if ((*(short *)(lVar3 + 0x54) == 1) &&
             (puVar4 = *(undefined8 **)(lVar3 + 8), puVar4 != (undefined8 *)0x0)) {
            (**(code **)(*(longlong *)puVar4[1] + 0x10))();
            (**(code **)(*(longlong *)*puVar4 + 0x10))();
            FUN_7ff70c802510(puVar4);
            *(undefined4 *)(lVar3 + 4) = 1;
            *(undefined8 *)(lVar3 + 8) = 0;
            *(undefined8 *)(lVar3 + 0x10) = 0;
          }
          lVar12 = lVar12 + 8;
        } while ((longlong)iVar6 * 8 != lVar12);
      }
      if ((longlong *)plVar2[9] != (longlong *)0x0) {
        (**(code **)(*(longlong *)plVar2[9] + 0x10))();
        plVar2[9] = 0;
      }
      if ((longlong *)plVar2[4] != (longlong *)0x0) {
        (**(code **)(*(longlong *)plVar2[4] + 0x10))();
        plVar2[4] = 0;
      }
      if ((longlong *)plVar2[3] != (longlong *)0x0) {
        (**(code **)(*(longlong *)plVar2[3] + 0x10))();
        plVar2[3] = 0;
      }
      if ((longlong *)plVar2[0xb] != (longlong *)0x0) {
        (**(code **)(*(longlong *)plVar2[0xb] + 0x10))();
        plVar2[0xb] = 0;
      }
      if ((longlong *)plVar2[0xc] != (longlong *)0x0) {
        (**(code **)(*(longlong *)plVar2[0xc] + 0x10))();
        plVar2[0xc] = 0;
      }
      if ((longlong *)plVar2[10] != (longlong *)0x0) {
        (**(code **)(*(longlong *)plVar2[10] + 0x10))();
        plVar2[10] = 0;
      }
      if ((longlong *)plVar2[8] != (longlong *)0x0) {
        (**(code **)(*(longlong *)plVar2[8] + 0x10))();
        plVar2[8] = 0;
      }
      if ((longlong *)plVar2[7] != (longlong *)0x0) {
        (**(code **)(*(longlong *)plVar2[7] + 0x10))();
        plVar2[7] = 0;
      }
      if ((longlong *)plVar2[6] != (longlong *)0x0) {
        (**(code **)(*(longlong *)plVar2[6] + 0x10))();
        plVar2[6] = 0;
      }
      if ((longlong *)plVar2[5] != (longlong *)0x0) {
        (**(code **)(*(longlong *)plVar2[5] + 0x10))();
        plVar2[5] = 0;
      }
    }
    pplStack_190 = &plStack_160;
    puStack_1a8 = &UNK_7ff70cb8be15;
    plStack_1b0 = (longlong *)&UNK_7ff70cb847c9;
    uStack_188 = 0;
    uStack_198 = 0;
    uStack_1a0 = 0;
    plStack_1b8 = (longlong *)0x0;
    iVar6 = FUN_7ff70cb128e0(&UNK_7ff70cb7f6dd,0x2dd,0,0);
    if (-1 < iVar6) {
      plVar2 = (longlong *)*plVar1;
      uVar7 = (**(code **)(*plStack_160 + 0x20))();
      uVar8 = (**(code **)(*plStack_160 + 0x18))();
      plStack_1b8 = plVar1 + 5;
      iVar6 = (**(code **)(*plVar2 + 0x60))(plVar2,uVar8,uVar7,0);
      if (iVar6 == 0) {
        uStack_108 = _DAT_7ff70cb1eb70;
        uStack_100 = _UNK_7ff70cb1eb78;
        uStack_118 = _DAT_7ff70cb1eb60;
        uStack_110 = _UNK_7ff70cb1eb68;
        uStack_128 = (undefined4)_DAT_7ff70cb1eb50;
        uStack_124 = (undefined4)((ulonglong)_DAT_7ff70cb1eb50 >> 0x20);
        uStack_120 = _UNK_7ff70cb1eb58;
        uStack_138 = (undefined4)_DAT_7ff70cb1eb40;
        uStack_134 = (undefined4)((ulonglong)_DAT_7ff70cb1eb40 >> 0x20);
        uStack_130 = (undefined4)_UNK_7ff70cb1eb48;
        uStack_12c = (undefined4)((ulonglong)_UNK_7ff70cb1eb48 >> 0x20);
        uStack_148 = (undefined4)_DAT_7ff70cb1eb30;
        uStack_144 = (undefined4)((ulonglong)_DAT_7ff70cb1eb30 >> 0x20);
        uStack_140 = (undefined4)_UNK_7ff70cb1eb38;
        uStack_13c = (undefined4)((ulonglong)_UNK_7ff70cb1eb38 >> 0x20);
        uStack_158._0_4_ = _DAT_7ff70cb1eb20;
        uStack_158._4_4_ = _UNK_7ff70cb1eb24;
        uStack_150 = _UNK_7ff70cb1eb28;
        uStack_14c = _UNK_7ff70cb1eb2c;
        plVar2 = (longlong *)*plVar1;
        plVar9 = (longlong *)(**(code **)(*plStack_160 + 0x20))();
        uVar7 = (**(code **)(*plStack_160 + 0x18))();
        plStack_1b8 = plVar9;
        plStack_1b0 = plVar1 + 6;
        iVar6 = (**(code **)(*plVar2 + 0x58))(plVar2,&uStack_158,3,uVar7);
        (**(code **)(*plStack_160 + 0x10))();
        if (iVar6 == 0) {
          uStack_178 = _DAT_7ff70cb1ebb0;
          uStack_174 = _UNK_7ff70cb1ebb4;
          uStack_170 = _UNK_7ff70cb1ebb8;
          uStack_16c = _UNK_7ff70cb1ebbc;
          uStack_168 = 0;
          (**(code **)(*(longlong *)*plVar1 + 0x18))((longlong *)*plVar1,&uStack_178,0,plVar1 + 7);
          puStack_1a8 = &UNK_7ff70cb8be1c;
          plStack_1b0 = (longlong *)&UNK_7ff70cb847c9;
          uStack_188 = 0;
          uStack_198 = 0;
          uStack_1a0 = 0;
          plStack_1b8 = (longlong *)0x0;
          pplStack_190 = (longlong **)&uStack_158;
          iVar6 = FUN_7ff70cb128e0(&UNK_7ff70cb7f9bb,0x191,0,0);
          if (-1 < iVar6) {
            plVar2 = (longlong *)*plVar1;
            uVar7 = (**(code **)(*(longlong *)CONCAT44(uStack_158._4_4_,(undefined4)uStack_158) +
                                0x20))();
            uVar8 = (**(code **)(*(longlong *)CONCAT44(uStack_158._4_4_,(undefined4)uStack_158) +
                                0x18))();
            plStack_1b8 = plVar1 + 8;
            iVar6 = (**(code **)(*plVar2 + 0x78))(plVar2,uVar8,uVar7,0);
            (**(code **)(*(longlong *)CONCAT44(uStack_158._4_4_,(undefined4)uStack_158) + 0x10))();
            if (iVar6 == 0) {
              FUN_7ff70cb12b80(&uStack_158,0,0x108);
              uStack_150 = _DAT_7ff70cb1ebc0;
              uStack_14c = _UNK_7ff70cb1ebc4;
              uStack_148 = _UNK_7ff70cb1ebc8;
              uStack_144 = _UNK_7ff70cb1ebcc;
              uStack_140 = 2;
              uStack_13c = 6;
              uStack_138 = 1;
              uStack_134 = CONCAT31(uStack_134._1_3_,0xf);
              (**(code **)(*(longlong *)*plVar1 + 0xa0))
                        ((longlong *)*plVar1,&uStack_158,plVar1 + 0xb);
              uStack_138 = 0;
              uStack_134 = 0;
              uStack_150 = 0;
              uStack_14c = 0;
              uStack_148 = 0;
              uStack_144 = 0;
              uStack_158._0_4_ = 3;
              uStack_158._4_4_ = 1;
              uStack_140 = 1;
              uStack_13c = 1;
              (**(code **)(*(longlong *)*plVar1 + 0xb0))
                        ((longlong *)*plVar1,&uStack_158,plVar1 + 10);
              uStack_158._0_4_ = 0;
              uStack_14c = 0;
              uStack_148 = 0;
              uStack_158._4_4_ = 1;
              uStack_150 = 8;
              uStack_144 = (undefined4)_DAT_7ff70cb1ebd0;
              uStack_140 = (undefined4)((ulonglong)_DAT_7ff70cb1ebd0 >> 0x20);
              uStack_13c = (undefined4)_UNK_7ff70cb1ebd8;
              uStack_138 = (undefined4)((ulonglong)_UNK_7ff70cb1ebd8 >> 0x20);
              uStack_134 = uStack_144;
              uStack_130 = uStack_140;
              uStack_12c = uStack_13c;
              uStack_128 = uStack_138;
              (**(code **)(*(longlong *)*plVar1 + 0xa8))
                        ((longlong *)*plVar1,&uStack_158,plVar1 + 0xc);
              uStack_144 = 0;
              uStack_13c = 0;
              uStack_138 = 0;
              uStack_134 = 0;
              uStack_130 = 0;
              uStack_12c = 0;
              uStack_128 = 0;
              uStack_158._0_4_ = _DAT_7ff70cb1ebe0;
              uStack_158._4_4_ = _UNK_7ff70cb1ebe4;
              uStack_150 = _UNK_7ff70cb1ebe8;
              uStack_14c = _UNK_7ff70cb1ebec;
              uStack_148 = 0;
              uStack_140 = 8;
              (**(code **)(*(longlong *)*plVar1 + 0xb8))((longlong *)*plVar1,&uStack_158,plVar1 + 9)
              ;
              uVar10 = 1;
              goto LAB_7ff70c8bda02;
            }
          }
        }
      }
      else {
        (**(code **)(*plStack_160 + 0x10))();
      }
    }
  }
  uVar10 = 0;
LAB_7ff70c8bda02:
  if (_DAT_7ff70cbebd80 == (uStack_50 ^ (ulonglong)auStack_1d8)) {
    return uVar10;
  }
  FUN_7ff70caa97e0(uStack_50 ^ (ulonglong)auStack_1d8);
  pcVar5 = (code *)swi(3);
  uVar10 = (*pcVar5)();
  return uVar10;
}


