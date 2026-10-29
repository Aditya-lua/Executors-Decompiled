/* 7ff70c98fd10 FUN_7ff70c98fd10 */

/* WARNING: Control flow encountered bad instruction data */
/* WARNING: Instruction at (ram,0x7ff70c9908a8) overlaps instruction at (ram,0x7ff70c9908a5)
    */
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

int FUN_7ff70c98fd10(longlong param_1)

{
  undefined8 *puVar1;
  byte bVar2;
  int iVar3;
  ulonglong uVar4;
  ulonglong uVar5;
  longlong lVar6;
  ulonglong uVar7;
  ulonglong uVar8;
  undefined *puVar9;
  uint uVar10;
  longlong lVar11;
  longlong lVar12;
  ulonglong uVar13;
  ulonglong uStack_e0;
  ulonglong uStack_d8;
  ulonglong uStack_d0;
  undefined8 uStack_c8;
  uint uStack_c0;
  undefined4 uStack_bc;
  undefined8 uStack_b8;
  undefined1 uStack_b0;
  undefined8 uStack_a8;
  undefined1 uStack_a0;
  longlong lStack_98;
  undefined8 uStack_90;
  longlong lStack_88;
  undefined8 uStack_80;
  undefined1 auStack_74 [10];
  undefined1 auStack_6a [10];
  undefined1 auStack_60 [10];
  undefined1 auStack_56 [22];
  
  FUN_7ff70c958630(&lStack_98);
  lStack_88 = lStack_98;
  uStack_80 = uStack_90;
  uStack_c8 = *(undefined8 *)(param_1 + 0xaf0);
  uStack_c0 = *(uint *)(param_1 + 0xaf8);
  uStack_bc = *(undefined4 *)(param_1 + 0xafc);
  uVar4 = FUN_7ff70c958790(&lStack_88,&uStack_c8);
  *(ulonglong *)(param_1 + 0xaa8) = uVar4;
  uVar13 = *(ulonglong *)(param_1 + 0xa88);
  if ((longlong)uVar4 < 1) {
    uVar5 = uVar13 * 1000000;
    *(ulonglong *)(param_1 + 0xab0) = uVar5;
    uVar8 = *(ulonglong *)(param_1 + 0xa90);
    uVar7 = uVar8 * 1000000;
    *(ulonglong *)(param_1 + 0xab8) = uVar7;
    lVar11 = *(longlong *)(param_1 + 0xa70);
joined_r0x7ff70c98fdfd:
    if (lVar11 == lStack_98) goto LAB_7ff70c98ffdd;
LAB_7ff70c98fe03:
    iVar3 = *(int *)(param_1 + 0xbf0);
    lVar12 = (longlong)(iVar3 % 6);
    *(longlong *)(param_1 + 0xa70) = lStack_98;
    *(ulonglong *)(param_1 + 0xb60 + lVar12 * 8) = uVar8 + uVar13;
    *(longlong *)(param_1 + 0xb90 + lVar12 * 0x10) = lStack_98;
    *(undefined8 *)(param_1 + 0xb98 + lVar12 * 0x10) = uStack_90;
    *(uint *)(param_1 + 0xbf0) = iVar3 + 1U;
    if (iVar3 == 0) {
      *(ulonglong *)(param_1 + 0xa98) = uVar7 + uVar5;
      bVar2 = *(byte *)(param_1 + 0xaa4);
    }
    else {
      uVar13 = 0;
      if (4 < iVar3) {
        uVar13 = (ulonglong)((iVar3 + 1U) % 6);
      }
      lStack_88 = lStack_98;
      uStack_80 = uStack_90;
      puVar1 = (undefined8 *)(param_1 + 0xb90 + uVar13 * 0x10);
      uStack_c8 = *puVar1;
      uStack_c0 = *(uint *)(puVar1 + 1);
      uStack_bc = *(undefined4 *)((longlong)puVar1 + 0xc);
      lVar6 = FUN_7ff70c9586d0(&lStack_88,&uStack_c8);
      uVar4 = lVar6 + (ulonglong)(lVar6 == 0);
      lVar12 = *(longlong *)(param_1 + 0xb60 + lVar12 * 8) -
               *(longlong *)(param_1 + 0xb60 + uVar13 * 8);
      if (lVar12 < 0x418938) {
        uVar13 = lVar12 * 1000;
        if ((uVar13 | uVar4) >> 0x20 == 0) {
          *(ulonglong *)(param_1 + 0xa98) = (uVar13 & 0xffffffff) / (uVar4 & 0xffffffff);
          bVar2 = *(byte *)(param_1 + 0xaa4);
        }
        else {
          *(longlong *)(param_1 + 0xa98) = (longlong)uVar13 / (longlong)uVar4;
          bVar2 = *(byte *)(param_1 + 0xaa4);
        }
      }
      else {
        *(longlong *)(param_1 + 0xa98) =
             (longlong)((double)lVar12 / ((double)(longlong)uVar4 / _DAT_7ff70cb52c20));
        bVar2 = *(byte *)(param_1 + 0xaa4);
      }
    }
  }
  else {
    uVar7 = 0x7fffffffffffffff;
    if (0x8637bd05af5 < (longlong)uVar13) {
      uVar5 = 0x7fffffffffffffff;
      if (uVar4 < 1000000) goto LAB_7ff70c990051;
      uVar5 = uVar4 / 1000000;
      if ((uVar13 | uVar5) >> 0x20 != 0) {
        uVar5 = uVar13 / uVar5;
        goto LAB_7ff70c98ff6f;
      }
      uVar5 = (uVar13 & 0xffffffff) / (uVar5 & 0xffffffff);
      *(ulonglong *)(param_1 + 0xab0) = uVar5;
      uVar8 = *(ulonglong *)(param_1 + 0xa90);
      if ((longlong)uVar8 < 0x8637bd05af6) goto LAB_7ff70c990068;
LAB_7ff70c98ff89:
      if (uVar4 < 1000000) {
        *(undefined8 *)(param_1 + 0xab8) = 0x7fffffffffffffff;
        lVar11 = *(longlong *)(param_1 + 0xa70);
      }
      else {
        uVar4 = uVar4 / 1000000;
        if ((uVar8 | uVar4) >> 0x20 == 0) {
          uVar10 = (uint)((uVar8 & 0xffffffff) / (uVar4 & 0xffffffff));
          goto LAB_7ff70c9900d0;
        }
        uVar7 = uVar8 / uVar4;
LAB_7ff70c990080:
        *(ulonglong *)(param_1 + 0xab8) = uVar7;
        lVar11 = *(longlong *)(param_1 + 0xa70);
      }
      goto joined_r0x7ff70c98fdfd;
    }
    uVar5 = uVar13 * 1000000;
    if ((uVar5 | uVar4) >> 0x20 == 0) {
      uVar5 = (uVar5 & 0xffffffff) / (uVar4 & 0xffffffff);
LAB_7ff70c990051:
      *(ulonglong *)(param_1 + 0xab0) = uVar5;
      uVar8 = *(ulonglong *)(param_1 + 0xa90);
    }
    else {
      uVar5 = (longlong)uVar5 / (longlong)uVar4;
LAB_7ff70c98ff6f:
      *(ulonglong *)(param_1 + 0xab0) = uVar5;
      uVar8 = *(ulonglong *)(param_1 + 0xa90);
    }
    if (0x8637bd05af5 < (longlong)uVar8) goto LAB_7ff70c98ff89;
LAB_7ff70c990068:
    uVar7 = uVar8 * 1000000;
    if ((uVar7 | uVar4) >> 0x20 != 0) {
      uVar7 = (longlong)uVar7 / (longlong)uVar4;
      goto LAB_7ff70c990080;
    }
    uVar10 = (uint)((uVar7 & 0xffffffff) / (uVar4 & 0xffffffff));
LAB_7ff70c9900d0:
    uVar7 = (ulonglong)uVar10;
    *(ulonglong *)(param_1 + 0xab8) = uVar7;
    lVar11 = *(longlong *)(param_1 + 0xa70);
    if (lVar11 != lStack_98) goto LAB_7ff70c98fe03;
LAB_7ff70c98ffdd:
    bVar2 = *(byte *)(param_1 + 0xaa4);
  }
  if ((bVar2 & 0x10) != 0) {
    return 0;
  }
  if (*(longlong *)(param_1 + 0x260) == 0) {
    if (*(longlong *)(param_1 + 600) != 0) {
      FUN_7ff70c94f020(param_1,1);
      iVar3 = (**(code **)(param_1 + 600))
                        (*(undefined8 *)(param_1 + 0x2f0),(double)*(longlong *)(param_1 + 0xa78),
                         (double)*(longlong *)(param_1 + 0xa88),
                         (double)*(longlong *)(param_1 + 0xa80),
                         (double)*(longlong *)(param_1 + 0xa90));
      goto LAB_7ff70c9901a1;
    }
  }
  else {
    FUN_7ff70c94f020(param_1,1);
    iVar3 = (**(code **)(param_1 + 0x260))
                      (*(undefined8 *)(param_1 + 0x2f0),*(undefined8 *)(param_1 + 0xa78),
                       *(undefined8 *)(param_1 + 0xa88),*(undefined8 *)(param_1 + 0xa80),
                       *(undefined8 *)(param_1 + 0xa90));
LAB_7ff70c9901a1:
    FUN_7ff70c94f020(param_1,0);
    if (iVar3 == 0) {
      return 0;
    }
    if (iVar3 != 0x10000001) {
      FUN_7ff70c9412d0(param_1,&UNK_7ff70cb87c57);
      return iVar3;
    }
  }
  if (lVar11 == lStack_98) {
    return 0;
  }
  lVar11 = *(longlong *)(param_1 + 0xaa8);
  uVar10 = *(uint *)(param_1 + 0xaa4);
  if (-1 < (char)uVar10) {
    if (*(longlong *)(param_1 + 0x1100) != 0) {
      FUN_7ff70c95c3b0(*(undefined8 *)(param_1 + 0x1d8),&UNK_7ff70cb911ac);
    }
    FUN_7ff70c95c3b0();
    uVar10 = *(uint *)(param_1 + 0xaa4) | 0x80;
    *(uint *)(param_1 + 0xaa4) = uVar10;
  }
  uVar13 = lVar11 / 1000000;
  if (((uVar10 & 0x20) == 0) || (uVar4 = *(ulonglong *)(param_1 + 0xab8), (longlong)uVar4 < 1)) {
    uVar4 = 0;
    uStack_d8 = 0;
  }
  else {
    uVar8 = *(ulonglong *)(param_1 + 0xa80);
    if ((uVar8 | uVar4) >> 0x20 == 0) {
      uVar4 = (uVar8 & 0xffffffff) / (uVar4 & 0xffffffff);
      if ((longlong)uVar8 < 0x2711) goto LAB_7ff70c9902f5;
LAB_7ff70c990283:
      uStack_d8 = *(ulonglong *)(param_1 + 0xa90);
      uVar8 = uVar8 / 100;
      if ((uStack_d8 | uVar8) >> 0x20 == 0) {
        uStack_d8 = uStack_d8 & 0xffffffff;
LAB_7ff70c990328:
        uStack_d8 = (uStack_d8 & 0xffffffff) / (uVar8 & 0xffffffff);
        goto LAB_7ff70c990335;
      }
    }
    else {
      uVar4 = (longlong)uVar8 / (longlong)uVar4;
      if (10000 < (longlong)uVar8) goto LAB_7ff70c990283;
LAB_7ff70c9902f5:
      if ((longlong)uVar8 < 1) {
        uStack_d8 = 0;
        goto LAB_7ff70c990335;
      }
      uStack_d8 = *(longlong *)(param_1 + 0xa90) * 100;
      if ((uStack_d8 | uVar8) >> 0x20 == 0) goto LAB_7ff70c990328;
    }
    uStack_d8 = (longlong)uStack_d8 / (longlong)uVar8;
  }
LAB_7ff70c990335:
  if (((uVar10 & 0x40) == 0) || (uVar8 = *(ulonglong *)(param_1 + 0xab0), (longlong)uVar8 < 1)) {
    uVar8 = 0;
    uStack_e0 = 0;
    goto LAB_7ff70c9903fe;
  }
  uVar5 = *(ulonglong *)(param_1 + 0xa78);
  if ((uVar5 | uVar8) >> 0x20 == 0) {
    uVar8 = (uVar5 & 0xffffffff) / (uVar8 & 0xffffffff);
    if ((longlong)uVar5 < 0x2711) goto LAB_7ff70c9903c4;
LAB_7ff70c990371:
    uStack_e0 = *(ulonglong *)(param_1 + 0xa88);
    uVar5 = uVar5 / 100;
    if ((uStack_e0 | uVar5) >> 0x20 == 0) {
      uStack_e0 = uStack_e0 & 0xffffffff;
LAB_7ff70c9903f4:
      uStack_e0 = (uStack_e0 & 0xffffffff) / (uVar5 & 0xffffffff);
      goto LAB_7ff70c9903fe;
    }
  }
  else {
    uVar8 = (longlong)uVar5 / (longlong)uVar8;
    if (10000 < (longlong)uVar5) goto LAB_7ff70c990371;
LAB_7ff70c9903c4:
    if ((longlong)uVar5 < 1) {
      uStack_e0 = 0;
      goto LAB_7ff70c9903fe;
    }
    uStack_e0 = *(longlong *)(param_1 + 0xa88) * 100;
    if ((uStack_e0 | uVar5) >> 0x20 == 0) goto LAB_7ff70c9903f4;
  }
  uStack_e0 = (longlong)uStack_e0 / (longlong)uVar5;
LAB_7ff70c9903fe:
  if ((longlong)uVar8 < (longlong)uVar4) {
    uVar8 = uVar4;
  }
  uVar4 = 0;
  if (0 < (longlong)uVar8) {
    uVar4 = uVar8 - uVar13;
  }
  if ((longlong)uVar4 < 1) {
    uStack_c8 = 0x2d2d3a2d2d3a2d2d;
    uStack_c0 = uStack_c0 & 0xffffff00;
  }
  else {
    if (uVar4 < 360000) {
      puVar9 = &UNK_7ff70cb8886f;
    }
    else if (uVar4 < 86400000) {
      puVar9 = &UNK_7ff70cb855c0;
    }
    else {
      puVar9 = &UNK_7ff70cb88753;
    }
    FUN_7ff70c95c190(&uStack_c8,9,puVar9);
  }
  if ((longlong)uVar8 < 1) {
    uStack_a8 = 0x2d2d3a2d2d3a2d2d;
    uStack_a0 = 0;
  }
  else {
    if (uVar8 < 360000) {
      puVar9 = &UNK_7ff70cb8886f;
    }
    else if (uVar8 < 86400000) {
      puVar9 = &UNK_7ff70cb855c0;
    }
    else {
      puVar9 = &UNK_7ff70cb88753;
    }
    FUN_7ff70c95c190(&uStack_a8,9,puVar9);
  }
  if (lVar11 < 1000000) {
    uStack_b8 = 0x2d2d3a2d2d3a2d2d;
    uStack_b0 = 0;
  }
  else {
    if (uVar13 < 360000) {
      puVar9 = &UNK_7ff70cb8886f;
    }
    else if (uVar13 < 86400000) {
      puVar9 = &UNK_7ff70cb855c0;
    }
    else {
      puVar9 = &UNK_7ff70cb88753;
    }
    FUN_7ff70c95c190(&uStack_b8,9,puVar9);
  }
  uVar13 = *(longlong *)
            ((ulonglong)((*(uint *)(param_1 + 0xaa4) & 0x40) == 0) * 0x10 + 0xa78 + param_1) +
           *(longlong *)
            (param_1 + 0xa80 + (ulonglong)((*(uint *)(param_1 + 0xaa4) & 0x20) == 0) * 0x10);
  uStack_d0 = *(longlong *)(param_1 + 0xa90) + *(longlong *)(param_1 + 0xa88);
  if ((longlong)uVar13 < 0x2711) {
    if ((longlong)uVar13 < 1) {
      uStack_d0 = 0;
    }
    else {
      uStack_d0 = uStack_d0 * 100;
      if ((uStack_d0 | uVar13) >> 0x20 == 0) {
        uStack_d0 = (uStack_d0 & 0xffffffff) / (uVar13 & 0xffffffff);
      }
      else {
        uStack_d0 = (longlong)uStack_d0 / (longlong)uVar13;
      }
    }
  }
  else {
    uVar4 = uVar13 / 100;
    if ((uStack_d0 | uVar4) >> 0x20 == 0) {
      uStack_d0 = (uStack_d0 & 0xffffffff) / (uVar4 & 0xffffffff);
    }
    else {
      uStack_d0 = (longlong)uStack_d0 / (longlong)uVar4;
    }
  }
  FUN_7ff70c990e90(*(undefined8 *)(param_1 + 0xa98),auStack_56);
  FUN_7ff70c990e90(*(undefined8 *)(param_1 + 0xab8),auStack_60);
  FUN_7ff70c990e90(*(undefined8 *)(param_1 + 0xab0),auStack_6a);
  FUN_7ff70c990e90(*(undefined8 *)(param_1 + 0xa90),(longlong)&uStack_80 + 2);
  FUN_7ff70c990e90(*(undefined8 *)(param_1 + 0xa88),&lStack_88);
  FUN_7ff70c990e90(uVar13,auStack_74);
  FUN_7ff70c95c3b0(*(undefined8 *)(param_1 + 0x1d8),&UNK_7ff70cb8262c,uStack_d0,auStack_74,uStack_e0
                   ,&lStack_88,uStack_d8,(longlong)&uStack_80 + 2,auStack_6a,auStack_60,&uStack_a8,
                   &uStack_b8,&uStack_c8,auStack_56);
  FUN_7ff70ca22cc5(*(undefined8 *)(param_1 + 0x1d8));
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}


