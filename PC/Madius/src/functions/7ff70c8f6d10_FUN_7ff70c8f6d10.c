/* 7ff70c8f6d10 FUN_7ff70c8f6d10 */

/* WARNING: Type propagation algorithm not settling */

undefined8 * FUN_7ff70c8f6d10(char *param_1,undefined8 *param_2,undefined8 param_3)

{
  longlong lVar1;
  ulonglong *puVar2;
  longlong lVar3;
  code *pcVar4;
  ulonglong uVar5;
  ulonglong uVar6;
  ulonglong uVar7;
  undefined8 ******ppppppuVar8;
  undefined8 *puVar9;
  undefined8 *******pppppppuVar10;
  ulonglong *puVar11;
  ulonglong uVar12;
  ulonglong uVar13;
  ulonglong *puVar14;
  undefined8 *******pppppppuVar15;
  undefined8 *******pppppppuStack_c8;
  undefined8 uStack_c0;
  ulonglong uStack_b8;
  ulonglong uStack_b0;
  undefined8 *******pppppppuStack_a8;
  ulonglong uStack_a0;
  ulonglong uStack_98;
  ulonglong uStack_90;
  undefined8 *******pppppppuStack_88;
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
  puVar11 = *(ulonglong **)(param_1 + 8);
  puVar2 = *(ulonglong **)(param_1 + 0x10);
  puStack_68 = param_2;
  do {
    if (puVar11 == puVar2) {
      return puStack_68;
    }
    uVar5 = puStack_68[2];
    if (uVar5 == 0) {
LAB_7ff70c8f6dc2:
      if (*param_1 == '\x01') goto LAB_7ff70c8f6dc8;
LAB_7ff70c8f6e00:
      uStack_78 = 0;
      uStack_70 = 0;
      pppppppuStack_88 = (undefined8 *******)0x0;
      uStack_80 = 0;
      puVar14 = puVar11;
      if (0xf < puVar11[3]) {
        puVar14 = (ulonglong *)*puVar11;
      }
      uVar5 = puVar11[2];
      if (-1 < (longlong)uVar5) {
        if (uVar5 < 0x10) {
          uStack_70 = 0xf;
          pppppppuStack_88 = (undefined8 *******)*puVar14;
          uStack_80 = puVar14[1];
          uStack_78 = uVar5;
          goto LAB_7ff70c8f6e41;
        }
        uVar6 = uVar5 | 0xf;
        uVar12 = 0x16;
        if (0x16 < uVar6) {
          uVar12 = uVar6;
        }
        if (uVar6 < 0xfff) {
          pppppppuStack_88 = (undefined8 *******)FUN_7ff70ca8ff40(uVar12 + 1);
        }
        else {
          ppppppuVar8 = (undefined8 ******)FUN_7ff70ca8ff40(uVar12 + 0x28);
          pppppppuStack_88 =
               (undefined8 *******)((longlong)ppppppuVar8 + 0x27U & 0xffffffffffffffe0);
          pppppppuStack_88[-1] = ppppppuVar8;
        }
        uStack_78 = uVar5;
        uStack_70 = uVar12;
        FUN_7ff70cb12b60(pppppppuStack_88,puVar14,uVar5 + 1);
        uVar5 = puVar11[6];
        goto joined_r0x7ff70c8f6f53;
      }
LAB_7ff70c8f727d:
      FUN_7ff70ca00780();
LAB_7ff70c8f7283:
      FUN_7ff70ca00780();
      pcVar4 = (code *)swi(3);
      puVar9 = (undefined8 *)(*pcVar4)();
      return puVar9;
    }
    uVar12 = puStack_68[3];
    if (uVar12 == uVar5) {
      FUN_7ff70ca00b60(puStack_68,1,uVar12,&UNK_7ff70cb8fcf7,1);
      goto LAB_7ff70c8f6dc2;
    }
    puStack_68[2] = uVar5 + 1;
    puVar9 = puStack_68;
    if (0xf < uVar12) {
      puVar9 = (undefined8 *)*puStack_68;
    }
    *(undefined2 *)((longlong)puVar9 + uVar5) = 0x26;
    if (*param_1 != '\x01') goto LAB_7ff70c8f6e00;
LAB_7ff70c8f6dc8:
    FUN_7ff70c8f5150(param_3,&pppppppuStack_88,puVar11);
LAB_7ff70c8f6e41:
    uVar5 = puVar11[6];
joined_r0x7ff70c8f6f53:
    if (uVar5 == 0) {
      pppppppuVar10 = &pppppppuStack_88;
      if (0xf < uStack_70) {
        pppppppuVar10 = pppppppuStack_88;
      }
      lVar3 = puStack_68[2];
      if ((ulonglong)(puStack_68[3] - lVar3) < uStack_78) {
        FUN_7ff70ca00b60(puStack_68,uStack_78,uStack_78,pppppppuVar10,uStack_78);
      }
      else {
        lVar1 = lVar3 + uStack_78;
        puStack_68[2] = lVar1;
        puVar9 = puStack_68;
        if (0xf < (ulonglong)puStack_68[3]) {
          puVar9 = (undefined8 *)*puStack_68;
        }
        FUN_7ff70cb12b70(lVar3 + (longlong)puVar9,pppppppuVar10);
        *(undefined1 *)((longlong)puVar9 + lVar1) = 0;
      }
    }
    else {
      puVar14 = puVar11 + 4;
      if (*param_1 == '\x01') {
        FUN_7ff70c8f5150(param_3,&pppppppuStack_a8,puVar14);
      }
      else {
        uStack_98 = 0;
        uStack_90 = 0;
        pppppppuStack_a8 = (undefined8 *******)0x0;
        uStack_a0 = 0;
        if (0xf < puVar11[7]) {
          puVar14 = (ulonglong *)puVar11[4];
        }
        if ((longlong)uVar5 < 0) goto LAB_7ff70c8f7283;
        if (uVar5 < 0x10) {
          uStack_90 = 0xf;
          pppppppuStack_a8 = (undefined8 *******)*puVar14;
          uStack_a0 = puVar14[1];
          uStack_98 = uVar5;
        }
        else {
          uVar6 = uVar5 | 0xf;
          uVar12 = 0x16;
          if (0x16 < uVar6) {
            uVar12 = uVar6;
          }
          if (uVar6 < 0xfff) {
            pppppppuStack_a8 = (undefined8 *******)FUN_7ff70ca8ff40(uVar12 + 1);
          }
          else {
            ppppppuVar8 = (undefined8 ******)FUN_7ff70ca8ff40(uVar12 + 0x28);
            pppppppuStack_a8 =
                 (undefined8 *******)((longlong)ppppppuVar8 + 0x27U & 0xffffffffffffffe0);
            pppppppuStack_a8[-1] = ppppppuVar8;
          }
          uStack_98 = uVar5;
          uStack_90 = uVar12;
          FUN_7ff70cb12b60(pppppppuStack_a8,puVar14,uVar5 + 1);
        }
      }
      uVar12 = uStack_70;
      uVar5 = uStack_78;
      pppppppuVar10 = pppppppuStack_88;
      if (uStack_78 == 0x7fffffffffffffff) {
        FUN_7ff70ca00780();
        goto LAB_7ff70c8f727d;
      }
      pppppppuStack_c8 = (undefined8 *******)0x0;
      uStack_c0 = 0;
      uVar6 = uStack_78 + 1;
      uVar13 = 0xf;
      pppppppuVar15 = &pppppppuStack_c8;
      if (0xf < uVar6) {
        uVar13 = 0x7fffffffffffffff;
        if (-2 < (longlong)uStack_78) {
          uVar7 = uVar6 | 0xf;
          uVar13 = 0x16;
          if (0x16 < uVar7) {
            uVar13 = uVar7;
          }
          if (uVar7 < 0xfff) {
            pppppppuVar15 = (undefined8 *******)FUN_7ff70ca8ff40(uVar13 + 1);
            pppppppuStack_c8 = pppppppuVar15;
            goto LAB_7ff70c8f7083;
          }
        }
        ppppppuVar8 = (undefined8 ******)FUN_7ff70ca8ff40(uVar13 + 0x28);
        pppppppuVar15 = (undefined8 *******)((longlong)ppppppuVar8 + 0x27U & 0xffffffffffffffe0);
        pppppppuVar15[-1] = ppppppuVar8;
        pppppppuStack_c8 = pppppppuVar15;
      }
LAB_7ff70c8f7083:
      if (uVar12 < 0x10) {
        pppppppuVar10 = &pppppppuStack_88;
      }
      uStack_b8 = uVar6;
      uStack_b0 = uVar13;
      FUN_7ff70cb12b60(pppppppuVar15,pppppppuVar10,uVar5);
      *(undefined2 *)((longlong)pppppppuVar15 + uVar5) = 0x3d;
      pppppppuVar10 = &pppppppuStack_c8;
      if (0xf < uStack_b0) {
        pppppppuVar10 = pppppppuStack_c8;
      }
      lVar3 = puStack_68[2];
      if ((ulonglong)(puStack_68[3] - lVar3) < uStack_b8) {
        FUN_7ff70ca00b60(puStack_68,uStack_b8,uStack_b8,pppppppuVar10,uStack_b8);
      }
      else {
        lVar1 = lVar3 + uStack_b8;
        puStack_68[2] = lVar1;
        puVar9 = puStack_68;
        if (0xf < (ulonglong)puStack_68[3]) {
          puVar9 = (undefined8 *)*puStack_68;
        }
        FUN_7ff70cb12b70(lVar3 + (longlong)puVar9,pppppppuVar10);
        *(undefined1 *)((longlong)puVar9 + lVar1) = 0;
      }
      if (0xf < uStack_b0) {
        uVar5 = uStack_b0 + 1;
        pppppppuVar10 = pppppppuStack_c8;
        if (0xfff < uVar5) {
          pppppppuVar10 = (undefined8 *******)pppppppuStack_c8[-1];
          if (0x1f < (ulonglong)((longlong)pppppppuStack_c8 + (-8 - (longlong)pppppppuVar10)))
          goto LAB_7ff70c8f725a;
          uVar5 = uStack_b0 + 0x28;
        }
        thunk_FUN_7ff70ca90250(pppppppuVar10,uVar5);
      }
      pppppppuVar10 = &pppppppuStack_a8;
      if (0xf < uStack_90) {
        pppppppuVar10 = pppppppuStack_a8;
      }
      lVar3 = puStack_68[2];
      if ((ulonglong)(puStack_68[3] - lVar3) < uStack_98) {
        FUN_7ff70ca00b60(puStack_68,uStack_98,uStack_98,pppppppuVar10,uStack_98);
      }
      else {
        lVar1 = lVar3 + uStack_98;
        puStack_68[2] = lVar1;
        puVar9 = puStack_68;
        if (0xf < (ulonglong)puStack_68[3]) {
          puVar9 = (undefined8 *)*puStack_68;
        }
        FUN_7ff70cb12b70(lVar3 + (longlong)puVar9,pppppppuVar10);
        *(undefined1 *)((longlong)puVar9 + lVar1) = 0;
      }
      if (0xf < uStack_90) {
        uVar5 = uStack_90 + 1;
        pppppppuVar10 = pppppppuStack_a8;
        if (0xfff < uVar5) {
          pppppppuVar10 = *(undefined8 ********)((longlong)pppppppuStack_a8 + 0xfffffffffffffff8);
          if (0x1f < (ulonglong)((longlong)pppppppuStack_a8 + (-8 - (longlong)pppppppuVar10)))
          goto LAB_7ff70c8f725a;
          uVar5 = uStack_90 + 0x28;
        }
        thunk_FUN_7ff70ca90250(pppppppuVar10,uVar5);
      }
    }
    if (0xf < uStack_70) {
      uVar5 = uStack_70 + 1;
      pppppppuVar10 = pppppppuStack_88;
      if (0xfff < uVar5) {
        pppppppuVar10 = (undefined8 *******)pppppppuStack_88[-1];
        if (0x1f < (ulonglong)((longlong)pppppppuStack_88 + (-8 - (longlong)pppppppuVar10))) {
LAB_7ff70c8f725a:
                    /* WARNING: Does not return */
          pcVar4 = (code *)invalidInstructionException();
          (*pcVar4)();
        }
        uVar5 = uStack_70 + 0x28;
      }
      thunk_FUN_7ff70ca90250(pppppppuVar10,uVar5);
    }
    puVar11 = puVar11 + 8;
  } while( true );
}


