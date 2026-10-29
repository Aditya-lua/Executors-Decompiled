/* 7ff70c8f7390 FUN_7ff70c8f7390 */

undefined8 * FUN_7ff70c8f7390(char *param_1,undefined8 *param_2,undefined8 param_3)

{
  longlong lVar1;
  undefined8 *puVar2;
  code *pcVar3;
  ulonglong uVar4;
  undefined8 ***pppuVar5;
  ulonglong uVar6;
  undefined8 *puVar7;
  longlong lVar8;
  undefined8 *puVar9;
  undefined8 ****ppppuVar10;
  ulonglong uVar11;
  undefined8 ***pppuVar12;
  ulonglong *puVar13;
  undefined8 ****ppppuVar14;
  ulonglong uVar15;
  uint uStack_c8;
  undefined4 uStack_c4;
  undefined4 uStack_c0;
  undefined4 uStack_bc;
  undefined8 **ppuStack_b8;
  undefined8 **ppuStack_b0;
  undefined8 ***pppuStack_a8;
  undefined8 uStack_a0;
  ulonglong uStack_98;
  ulonglong uStack_90;
  undefined8 ***pppuStack_88;
  ulonglong uStack_80;
  ulonglong uStack_78;
  ulonglong uStack_70;
  undefined8 *puStack_68;
  undefined8 uStack_60;
  
  uStack_60 = 0xfffffffffffffffe;
  *param_2 = 0;
  param_2[1] = 0;
  param_2[2] = 0;
  param_2[3] = 0xf;
  puVar7 = *(undefined8 **)(param_1 + 8);
  puVar2 = *(undefined8 **)(param_1 + 0x10);
  puStack_68 = param_2;
  do {
    if (puVar7 == puVar2) {
      return param_2;
    }
    uVar6 = param_2[2];
    if (uVar6 == 0) {
LAB_7ff70c8f743e:
      if (*param_1 == '\x01') goto LAB_7ff70c8f744b;
LAB_7ff70c8f7487:
      puVar13 = puVar7 + 4;
      uStack_78 = 0;
      uStack_70 = 0;
      pppuStack_88 = (undefined8 ****)0x0;
      uStack_80 = 0;
      if (0xf < (ulonglong)puVar7[7]) {
        puVar13 = (ulonglong *)puVar7[4];
      }
      uVar6 = puVar7[6];
      if ((longlong)uVar6 < 0) goto LAB_7ff70c8f77d0;
      if (uVar6 < 0x10) {
        uStack_70 = 0xf;
        pppuStack_88 = (undefined8 ***)*puVar13;
        uStack_80 = puVar13[1];
        uStack_78 = uVar6;
      }
      else {
        uVar15 = uVar6 | 0xf;
        uVar11 = 0x16;
        if (0x16 < uVar15) {
          uVar11 = uVar15;
        }
        if (uVar15 < 0xfff) {
          pppuStack_88 = (undefined8 ***)FUN_7ff70ca8ff40(uVar11 + 1);
        }
        else {
          pppuVar5 = (undefined8 ***)FUN_7ff70ca8ff40(uVar11 + 0x28);
          pppuStack_88 = (undefined8 ***)((longlong)pppuVar5 + 0x27U & 0xffffffffffffffe0);
          pppuStack_88[-1] = pppuVar5;
        }
        uStack_78 = uVar6;
        uStack_70 = uVar11;
        FUN_7ff70cb12b60(pppuStack_88,puVar13,uVar6 + 1);
      }
    }
    else {
      uVar11 = puStack_68[3];
      if (uVar11 == uVar6) {
        FUN_7ff70ca00b60(puStack_68,1,uVar11,&UNK_7ff70cb8fcf7,1);
        goto LAB_7ff70c8f743e;
      }
      puStack_68[2] = uVar6 + 1;
      puVar9 = puStack_68;
      if (0xf < uVar11) {
        puVar9 = (undefined8 *)*puStack_68;
      }
      *(undefined2 *)((longlong)puVar9 + uVar6) = 0x26;
      if (*param_1 != '\x01') goto LAB_7ff70c8f7487;
LAB_7ff70c8f744b:
      FUN_7ff70c8f5150(param_3,&pppuStack_88,puVar7 + 4);
    }
    lVar8 = puVar7[2];
    if (lVar8 == 0x7fffffffffffffff) {
      FUN_7ff70ca00780();
LAB_7ff70c8f77d0:
      FUN_7ff70ca00780();
      pcVar3 = (code *)swi(3);
      puVar7 = (undefined8 *)(*pcVar3)();
      return puVar7;
    }
    puVar9 = (undefined8 *)*puVar7;
    uVar11 = puVar7[3];
    pppuStack_a8 = (undefined8 ****)0x0;
    uStack_a0 = 0;
    uVar6 = lVar8 + 1;
    uVar15 = 0xf;
    ppppuVar14 = &pppuStack_a8;
    if (0xf < uVar6) {
      uVar15 = 0x7fffffffffffffff;
      if (-2 < lVar8) {
        uVar4 = uVar6 | 0xf;
        uVar15 = 0x16;
        if (0x16 < uVar4) {
          uVar15 = uVar4;
        }
        if (uVar4 < 0xfff) {
          ppppuVar14 = (undefined8 ****)FUN_7ff70ca8ff40(uVar15 + 1);
          pppuStack_a8 = ppppuVar14;
          goto LAB_7ff70c8f75be;
        }
      }
      pppuVar5 = (undefined8 ***)FUN_7ff70ca8ff40(uVar15 + 0x28);
      ppppuVar14 = (undefined8 ****)((longlong)pppuVar5 + 0x27U & 0xffffffffffffffe0);
      ppppuVar14[-1] = pppuVar5;
      pppuStack_a8 = ppppuVar14;
    }
LAB_7ff70c8f75be:
    if (uVar11 < 0x10) {
      puVar9 = puVar7;
    }
    uStack_98 = uVar6;
    uStack_90 = uVar15;
    FUN_7ff70cb12b60(ppppuVar14,puVar9,lVar8);
    *(undefined2 *)((longlong)ppppuVar14 + lVar8) = 0x3d;
    puVar9 = puStack_68;
    ppppuVar14 = &pppuStack_88;
    if (0xf < uStack_70) {
      ppppuVar14 = (undefined8 ****)pppuStack_88;
    }
    if (uStack_90 - uStack_98 < uStack_78) {
      ppppuVar14 = (undefined8 ****)
                   FUN_7ff70ca00b60(&pppuStack_a8,uStack_78,uStack_78,ppppuVar14,uStack_78);
      puVar9 = puStack_68;
    }
    else {
      uVar6 = uStack_98 + uStack_78;
      ppppuVar10 = &pppuStack_a8;
      if (0xf < uStack_90) {
        ppppuVar10 = (undefined8 ****)pppuStack_a8;
      }
      lVar8 = uStack_98 + (longlong)ppppuVar10;
      uStack_98 = uVar6;
      FUN_7ff70cb12b70(lVar8,ppppuVar14);
      *(undefined1 *)((longlong)ppppuVar10 + uVar6) = 0;
      ppppuVar14 = &pppuStack_a8;
    }
    uStack_c8 = *(uint *)ppppuVar14;
    uStack_c4 = *(undefined4 *)((longlong)ppppuVar14 + 4);
    pppuVar5 = *ppppuVar14;
    uStack_c0 = *(undefined4 *)(ppppuVar14 + 1);
    uStack_bc = *(undefined4 *)((longlong)ppppuVar14 + 0xc);
    ppuStack_b8 = ppppuVar14[2];
    ppuStack_b0 = ppppuVar14[3];
    ppppuVar14[2] = (undefined8 ***)0x0;
    ppppuVar14[3] = (undefined8 ***)0xf;
    *(undefined1 *)ppppuVar14 = 0;
    pppuVar12 = (undefined8 ***)&uStack_c8;
    if ((undefined8 ***)0xf < ppuStack_b0) {
      pppuVar12 = pppuVar5;
    }
    lVar8 = puVar9[2];
    if ((undefined8 ***)(puVar9[3] - lVar8) < ppuStack_b8) {
      FUN_7ff70ca00b60(puVar9,ppuStack_b8,ppuStack_b8,pppuVar12,ppuStack_b8);
    }
    else {
      lVar1 = lVar8 + (longlong)ppuStack_b8;
      puVar9[2] = lVar1;
      if (0xf < (ulonglong)puVar9[3]) {
        puVar9 = (undefined8 *)*puVar9;
      }
      FUN_7ff70cb12b70(lVar8 + (longlong)puVar9,pppuVar12);
      *(undefined1 *)((longlong)puVar9 + lVar1) = 0;
    }
    if ((undefined8 ***)0xf < ppuStack_b0) {
      lVar1 = CONCAT44(uStack_c4,uStack_c8);
      pppuVar5 = (undefined8 ***)((longlong)ppuStack_b0 + 1);
      lVar8 = lVar1;
      if ((undefined8 ***)0xfff < pppuVar5) {
        lVar8 = *(longlong *)(lVar1 + -8);
        if (0x1f < (ulonglong)((lVar1 + -8) - lVar8)) goto LAB_7ff70c8f77ad;
        pppuVar5 = (undefined8 ***)(ppuStack_b0 + 5);
      }
      thunk_FUN_7ff70ca90250(lVar8,pppuVar5);
    }
    ppuStack_b8 = (undefined8 ***)0x0;
    ppuStack_b0 = (undefined8 ***)0xf;
    uStack_c8 = uStack_c8 & 0xffffff00;
    if (0xf < uStack_90) {
      uVar6 = uStack_90 + 1;
      ppppuVar14 = (undefined8 ****)pppuStack_a8;
      if (0xfff < uVar6) {
        ppppuVar14 = (undefined8 ****)pppuStack_a8[-1];
        if (0x1f < (ulonglong)((longlong)pppuStack_a8 + (-8 - (longlong)ppppuVar14)))
        goto LAB_7ff70c8f77ad;
        uVar6 = uStack_90 + 0x28;
      }
      thunk_FUN_7ff70ca90250(ppppuVar14,uVar6);
    }
    param_2 = puStack_68;
    if (0xf < uStack_70) {
      uVar6 = uStack_70 + 1;
      ppppuVar14 = (undefined8 ****)pppuStack_88;
      if (0xfff < uVar6) {
        ppppuVar14 = (undefined8 ****)pppuStack_88[-1];
        if (0x1f < (ulonglong)((longlong)pppuStack_88 + (-8 - (longlong)ppppuVar14))) {
LAB_7ff70c8f77ad:
                    /* WARNING: Does not return */
          pcVar3 = (code *)invalidInstructionException();
          (*pcVar3)();
        }
        uVar6 = uStack_70 + 0x28;
      }
      thunk_FUN_7ff70ca90250(ppppuVar14,uVar6);
    }
    puVar7 = puVar7 + 8;
  } while( true );
}


