/* 7ff70c9e7180 FUN_7ff70c9e7180 */

/* WARNING: Control flow encountered bad instruction data */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 * FUN_7ff70c9e7180(undefined8 *param_1)

{
  code *pcVar1;
  undefined *puVar2;
  int iVar3;
  undefined4 uVar4;
  longlong lVar5;
  int *piVar6;
  undefined8 uVar7;
  undefined8 *puVar8;
  longlong lVar9;
  undefined *puVar10;
  undefined *unaff_RBX;
  undefined **ppuVar11;
  undefined **ppuVar12;
  undefined **ppuVar13;
  byte unaff_DIL;
  undefined *unaff_R14;
  byte unaff_R15B;
  undefined *puStack_170;
  undefined8 uStack_168;
  undefined1 *puStack_160;
  undefined1 auStack_158 [24];
  undefined4 uStack_140;
  undefined4 uStack_138;
  undefined4 uStack_130;
  undefined1 auStack_118 [64];
  undefined1 auStack_d8 [7];
  undefined8 uStack_d1;
  undefined1 uStack_a8;
  char cStack_a7;
  undefined6 uStack_a6;
  char cStack_a0;
  undefined *puStack_98;
  undefined *puStack_90;
  undefined1 uStack_88;
  byte bStack_87;
  undefined *puStack_60;
  undefined1 uStack_58;
  byte bStack_57;
  undefined1 auStack_50 [4];
  undefined1 uStack_4c;
  undefined *puStack_48;
  undefined2 uStack_40;
  undefined8 uStack_38;
  
  ppuVar12 = (undefined **)auStack_158;
  uStack_38 = 0xfffffffffffffffe;
  if (*(int *)(*(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)_DAT_7ff70cc1a960 * 8)
              + 4) < _DAT_7ff70cc1b1a0) {
    puStack_160 = (undefined1 *)0x7ff70c9e74d3;
    FUN_7ff70caa4e60(&DAT_7ff70cc1b1a0);
    if (_DAT_7ff70cc1b1a0 == -1) {
      _DAT_7ff70cc1b188 = 0;
      uRam00007ff70cc1b190 = 0;
      _DAT_7ff70cc1b178 = 0;
      uRam00007ff70cc1b180 = 0;
      _DAT_7ff70cc1b168 = 0;
      uRam00007ff70cc1b170 = 0;
      _DAT_7ff70cc1b158 = 0;
      uRam00007ff70cc1b160 = 0;
      _DAT_7ff70cc1b198 = 0xffffffff;
      _DAT_7ff70cc1b150 = 0x102;
      puStack_160 = (undefined1 *)0x7ff70c9e7521;
      FUN_7ff70caa4f40(&DAT_7ff70cc1b1a0);
    }
  }
  puStack_160 = (undefined1 *)0x7ff70c9e71d6;
  iVar3 = FUN_7ff70cb12570(&DAT_7ff70cc1b150);
  if (iVar3 == 0) {
    if (_DAT_7ff70cc1b19c == 0x7fffffff) goto LAB_7ff70c9e7530;
    ppuVar11 = &puStack_160;
    uStack_168 = 0x7ff70c9e71f4;
    puStack_160 = auStack_d8;
    unaff_RBX = (undefined *)func_0x7ff70d684a5a();
    uStack_168 = 0x7ff70c9e71fd;
    iVar3 = FUN_7ff70c9a46c0();
    if (iVar3 == 2) {
      if (*(int *)(*(longlong *)
                    ((longlong)ThreadLocalStoragePointer + (ulonglong)_DAT_7ff70cc1a960 * 8) + 4) <
          _DAT_7ff70cc1b148) {
        uStack_168 = 0x7ff70c9e7595;
        FUN_7ff70caa4e60(&DAT_7ff70cc1b148);
        if (_DAT_7ff70cc1b148 == -1) {
          puStack_98 = (undefined *)((ulonglong)puStack_98 & 0xffffffff00000000);
          uStack_168 = 0x7ff70c9e75c0;
          FUN_7ff70c9e7c10(0x7ff70cc1b108,&puStack_98,&puStack_48);
          uStack_168 = 0x7ff70c9e75cd;
          FUN_7ff70caa4fb0(&UNK_7ff70c9e70a0);
          uStack_168 = 0x7ff70c9e75d9;
          FUN_7ff70caa4f40(&DAT_7ff70cc1b148);
        }
      }
      lVar9 = (((ulonglong)unaff_RBX >> 0x38 ^
               ((ulonglong)unaff_RBX >> 0x30 & 0xff ^
               ((ulonglong)unaff_RBX >> 0x28 & 0xff ^
               ((ulonglong)unaff_RBX >> 0x20 & 0xff ^
               ((ulonglong)unaff_RBX >> 0x18 & 0xff ^
               ((ulonglong)unaff_RBX >> 0x10 & 0xff ^
               ((ulonglong)unaff_RBX >> 8 & 0xff ^
               ((ulonglong)unaff_RBX & 0xff ^ 0xcbf29ce484222325) * 0x100000001b3) * 0x100000001b3)
               * 0x100000001b3) * 0x100000001b3) * 0x100000001b3) * 0x100000001b3) * 0x100000001b3)
               * 0x100000001b3 & _DAT_7ff70cc1b138) * 0x10;
      lVar5 = *(longlong *)(_DAT_7ff70cc1b120 + 8 + lVar9);
      if (lVar5 != _DAT_7ff70cc1b110) {
        if (unaff_RBX != *(undefined **)(lVar5 + 0x10)) {
          do {
            if (lVar5 == *(longlong *)(_DAT_7ff70cc1b120 + lVar9)) goto LAB_7ff70c9e7306;
            lVar5 = *(longlong *)(lVar5 + 8);
          } while (unaff_RBX != *(undefined **)(lVar5 + 0x10));
        }
        if (lVar5 != _DAT_7ff70cc1b110) {
          *param_1 = *(undefined8 *)(lVar5 + 0x18);
          *(undefined2 *)(param_1 + 1) = 0;
          goto LAB_7ff70c9e7480;
        }
      }
    }
LAB_7ff70c9e7306:
    puStack_48 = (undefined *)0x0;
    uStack_40 = 0x100;
    auStack_50[0] = 0;
    uStack_4c = 0;
    uStack_130 = 2;
    uStack_138 = 0;
    uStack_140 = 0;
    uStack_168 = 0x7ff70c9e7355;
    puVar10 = unaff_RBX;
    piVar6 = (int *)func_0x7ff70da58e29(unaff_RBX,unaff_RBX,unaff_RBX,&puStack_48);
    *(uint *)((longlong)piVar6 + -0x7bf03f7b) =
         *(uint *)((longlong)piVar6 + -0x7bf03f7b) | (uint)puVar10;
    *piVar6 = *piVar6 + (int)piVar6;
    cStack_a7 = cStack_a7 + (char)piVar6;
    *(int *)((longlong)piVar6 + -0x77) = *(int *)((longlong)piVar6 + -0x77) + -1;
    uStack_168 = uStack_d1;
    puVar10 = (undefined *)0x0;
    ppuVar12 = &puStack_170;
    ppuVar13 = &puStack_170;
    ppuVar11 = &puStack_170;
    puStack_170 = unaff_RBX;
    uVar7 = func_0x7ff70d74249a(puStack_48,0,1);
    puVar2 = puStack_48;
    if ((int)uVar7 == 0) goto LAB_7ff70c9e7544;
    unaff_DIL = unaff_R15B ^ 1;
    unaff_R14 = unaff_RBX;
    if (unaff_R15B == 0) {
      puStack_48 = (undefined *)0x0;
      unaff_R14 = puVar2;
    }
    uStack_58 = 1;
    puStack_60 = unaff_R14;
    bStack_57 = unaff_DIL;
    iVar3 = FUN_7ff70c9a46c0();
    if (iVar3 == 2) {
      ppuVar11 = &puStack_170;
      if (*(int *)(*(longlong *)
                    ((longlong)ThreadLocalStoragePointer + (ulonglong)_DAT_7ff70cc1a960 * 8) + 4) <
          _DAT_7ff70cc1b148) goto LAB_7ff70c9e760e;
      goto LAB_7ff70c9e73eb;
    }
    puStack_60 = (undefined *)0x0;
    *param_1 = unaff_R14;
    *(undefined1 *)(param_1 + 1) = 1;
    *(byte *)((longlong)param_1 + 9) = unaff_DIL;
  }
  else {
    puStack_160 = (undefined1 *)0x7ff70c9e7530;
    FUN_7ff70cb124d0(5);
LAB_7ff70c9e7530:
    _DAT_7ff70cc1b198 = CONCAT44(0x7ffffffe,_DAT_7ff70cc1b198);
    puStack_160 = (undefined1 *)0x7ff70c9e7544;
    uVar7 = FUN_7ff70cb124d0(6);
LAB_7ff70c9e7544:
    if (unaff_R15B == 0) {
      *(undefined **)((longlong)ppuVar12 + -8) = &UNK_7ff70c9e75e3;
      func_0x7ff70d61c088();
                    /* WARNING: Bad instruction - Truncating control flow here */
      halt_baddata();
    }
    ppuVar13 = (undefined **)((longlong)ppuVar12 + -8);
    *(undefined8 *)((longlong)ppuVar12 + -8) = uVar7;
    *(undefined8 *)((longlong)ppuVar12 + -0x10) = 0x7ff70c9e7553;
    uVar4 = func_0x7ff70d5a645e();
    puStack_98 = (undefined *)CONCAT44(puStack_98._4_4_,uVar4);
    *(undefined8 *)((longlong)ppuVar12 + -0x10) = 0x7ff70c9e7572;
    FUN_7ff70c9e7ab0(auStack_118,&UNK_7ff70cb7f404,&puStack_98,auStack_50);
    *(undefined8 *)((longlong)ppuVar12 + -0x10) = 0x7ff70c9e7583;
    FUN_7ff70cb12a50(auStack_118,&UNK_7ff70cbcadd0);
LAB_7ff70c9e760e:
    *(undefined8 *)((longlong)ppuVar13 + -8) = 0x7ff70c9e761a;
    FUN_7ff70caa4e60(&DAT_7ff70cc1b148);
    ppuVar11 = ppuVar13;
    if (_DAT_7ff70cc1b148 == -1) {
      puStack_98 = (undefined *)((ulonglong)puStack_98 & 0xffffffff00000000);
      *(undefined8 *)((longlong)ppuVar13 + -8) = 0x7ff70c9e7642;
      FUN_7ff70c9e7c10(0x7ff70cc1b108,&puStack_98,&uStack_a8);
      *(undefined8 *)((longlong)ppuVar13 + -8) = 0x7ff70c9e764f;
      FUN_7ff70caa4fb0(&UNK_7ff70c9e70a0);
      *(undefined8 *)((longlong)ppuVar13 + -8) = 0x7ff70c9e765b;
      FUN_7ff70caa4f40(&DAT_7ff70cc1b148);
    }
LAB_7ff70c9e73eb:
    puStack_60 = (undefined *)0x0;
    uStack_88 = 1;
    puVar10 = &uStack_a8;
    *(undefined8 *)((longlong)ppuVar11 + -8) = 0x7ff70c9e7417;
    puStack_98 = unaff_RBX;
    puStack_90 = unaff_R14;
    bStack_87 = unaff_DIL;
    FUN_7ff70c9e7d70(0x7ff70cc1b108,puVar10,&puStack_98);
    *(undefined8 *)((longlong)ppuVar11 + -8) = 0x7ff70c9e7421;
    FUN_7ff70c9e6e90(&puStack_90);
    if (cStack_a0 == '\0') {
      puStack_98 = &UNK_7ff70cb83dba;
      puStack_90 = (undefined *)CONCAT44(puStack_90._4_4_,0x84);
      *(undefined8 *)((longlong)ppuVar11 + 0x20) = 0;
      puVar10 = &UNK_7ff70cb8772a;
      *(undefined8 *)((longlong)ppuVar11 + -8) = 0x7ff70c9e7697;
      FUN_7ff70c99b6a0(1,&UNK_7ff70cb8772a,&UNK_7ff70cb8f40f,&puStack_98);
      goto LAB_7ff70c9e7698;
    }
    *param_1 = *(undefined8 *)(CONCAT62(uStack_a6,CONCAT11(cStack_a7,uStack_a8)) + 0x18);
    *(undefined2 *)(param_1 + 1) = 0;
  }
  ppuVar11[-1] = (undefined *)0x7ff70c9e745b;
  FUN_7ff70c9e6e90(&puStack_60);
  if ((uStack_40._1_1_ == '\x01') && (puStack_48 != (undefined *)0x0)) {
    ppuVar11[-1] = (undefined *)0x7ff70c9e7476;
    iVar3 = func_0x7ff70da73dbc();
    ppuVar11 = (undefined **)*ppuVar11;
    if (iVar3 == 0) {
LAB_7ff70c9e7698:
      *(undefined **)((longlong)ppuVar11 + -8) = puVar10;
      *(undefined8 *)((longlong)ppuVar11 + -0x10) = 0x7ff70c9e769e;
      uVar4 = func_0x7ff70d6ad9af();
      puStack_60 = (undefined *)CONCAT44(puStack_60._4_4_,uVar4);
      *(undefined8 *)((longlong)ppuVar11 + -0x10) = 0x7ff70c9e76b6;
      FUN_7ff70c9e79f0(&puStack_98,&UNK_7ff70cb90c9d,&puStack_60);
      *(undefined8 *)((longlong)ppuVar11 + -0x10) = 0x7ff70c9e76c7;
      FUN_7ff70cb12a50(&puStack_98,&UNK_7ff70cbcadd0);
      pcVar1 = (code *)swi(3);
      puVar8 = (undefined8 *)(*pcVar1)();
      return puVar8;
    }
  }
LAB_7ff70c9e7480:
  *(undefined8 *)((longlong)ppuVar11 + -8) = 0x7ff70c9e748c;
  FUN_7ff70cb12580(&DAT_7ff70cc1b150);
  return param_1;
}


