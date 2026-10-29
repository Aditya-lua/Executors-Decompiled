/* 7ff70c79e600 FUN_7ff70c79e600 */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c79e600(longlong param_1)

{
  undefined2 *puVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  code *pcVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  byte bVar8;
  char cVar9;
  undefined8 *puVar10;
  ulonglong uVar11;
  undefined8 ******ppppppuVar12;
  longlong lVar13;
  ulonglong uVar14;
  longlong lVar15;
  undefined8 *puVar16;
  ulonglong uVar17;
  ulonglong uVar18;
  undefined8 *******pppppppuVar19;
  longlong *plVar20;
  undefined8 *******pppppppuVar21;
  bool bVar22;
  undefined8 *******pppppppuStack_b8;
  undefined8 uStack_b0;
  ulonglong uStack_a8;
  ulonglong uStack_a0;
  longlong *plStack_98;
  longlong lStack_90;
  undefined8 *******pppppppuStack_88;
  longlong lStack_80;
  ulonglong uStack_78;
  ulonglong uStack_70;
  undefined8 uStack_60;
  
  uStack_60 = 0xfffffffffffffffe;
  plStack_98 = (longlong *)(param_1 + 0xc0);
  puVar2 = *(undefined8 **)(param_1 + 0xc0);
  puVar10 = (undefined8 *)*puVar2;
  lStack_90 = 0;
  do {
    if (puVar10 == puVar2) {
      if (*(char *)(param_1 + 0x10) != '\0') {
        lStack_80 = 0;
        pppppppuStack_88 = (undefined8 *******)FUN_7ff70ca8ff40(0x20);
        uVar7 = _UNK_7ff70cb85a53;
        uVar6 = _UNK_7ff70cb85a4f;
        uVar5 = _UNK_7ff70cb85a4b;
        uStack_78 = 0x11;
        uStack_70 = 0x1f;
        *(undefined4 *)pppppppuStack_88 = _DAT_7ff70cb85a47;
        *(undefined4 *)((longlong)pppppppuStack_88 + 4) = uVar5;
        *(undefined4 *)(pppppppuStack_88 + 1) = uVar6;
        *(undefined4 *)((longlong)pppppppuStack_88 + 0xc) = uVar7;
        *(undefined2 *)(pppppppuStack_88 + 2) = 0x67;
        lVar13 = *plStack_98;
        lVar15 = *(longlong *)(lVar13 + 8);
        if (*(char *)(lVar15 + 0x19) == '\0') {
          do {
            bVar8 = FUN_7ff70c7b18c0(plStack_98,lVar15 + 0x20,&pppppppuStack_88);
            if (bVar8 == 0) {
              lVar13 = lVar15;
            }
            lVar15 = *(longlong *)(lVar15 + (ulonglong)bVar8 * 0x10);
          } while (*(char *)(lVar15 + 0x19) == '\0');
        }
        plVar20 = plStack_98;
        bVar22 = true;
        if ((*(char *)(lVar13 + 0x19) == '\0') &&
           (cVar9 = FUN_7ff70c7b18c0(plStack_98,&pppppppuStack_88,lVar13 + 0x20), cVar9 == '\0')) {
          bVar22 = lVar13 == *plVar20;
        }
        if (0xf < uStack_70) {
          uVar14 = uStack_70 + 1;
          pppppppuVar21 = pppppppuStack_88;
          if (0xfff < uVar14) {
            pppppppuVar21 = (undefined8 *******)pppppppuStack_88[-1];
            if (0x1f < (ulonglong)((longlong)pppppppuStack_88 + (-8 - (longlong)pppppppuVar21))) {
LAB_7ff70c79eb6b:
                    /* WARNING: Does not return */
              pcVar4 = (code *)invalidInstructionException();
              (*pcVar4)();
            }
            uVar14 = uStack_70 + 0x28;
          }
          thunk_FUN_7ff70ca90250(pppppppuVar21,uVar14);
        }
        lVar13 = lStack_90;
        lStack_90 = lVar13;
        if ((bVar22) &&
           (lVar15 = FUN_7ff70c8f2b60(lStack_90,&UNK_7ff70cb884ff), lStack_90 = lVar13, lVar15 != 0)
           ) {
          lStack_90 = lVar15;
        }
      }
      lVar13 = lStack_90;
      lVar15 = FUN_7ff70c8f2b60(lStack_90,&UNK_7ff70cb8af7e);
      if (lVar15 == 0) {
        lVar15 = lVar13;
      }
      FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x2727,lVar15);
      FUN_7ff70c8f2cb0(*(undefined8 *)(*(longlong *)(param_1 + 0x48) + 8));
      *(longlong *)(*(longlong *)(param_1 + 0x48) + 8) = lVar15;
      return;
    }
    uStack_78 = 0;
    uStack_70 = 0;
    pppppppuStack_88 = (undefined8 *******)0x0;
    lStack_80 = 0;
    if ((ulonglong)puVar10[7] < 0x10) {
      plVar20 = puVar10 + 4;
    }
    else {
      plVar20 = (longlong *)puVar10[4];
    }
    uVar14 = puVar10[6];
    if ((longlong)uVar14 < 0) {
      FUN_7ff70ca00780();
LAB_7ff70c79eb65:
      FUN_7ff70ca00780();
      goto LAB_7ff70c79eb6b;
    }
    if (uVar14 < 0x10) {
      uStack_70 = 0xf;
      pppppppuStack_88 = (undefined8 *******)*plVar20;
      lStack_80 = plVar20[1];
      lVar13 = puVar10[10];
      uStack_78 = uVar14;
      if (lVar13 == 0) goto LAB_7ff70c79e7c3;
LAB_7ff70c79e6bd:
      if (0x7ffffffffffffffd < lVar13) goto LAB_7ff70c79eb65;
      puVar3 = (undefined8 *)puVar10[8];
      uVar17 = puVar10[0xb];
      pppppppuStack_b8 = (undefined8 *******)0x0;
      uStack_b0 = 0;
      uVar14 = lVar13 + 2;
      uVar18 = 0xf;
      pppppppuVar21 = &pppppppuStack_b8;
      if (0xf < uVar14) {
        uVar18 = 0x7fffffffffffffff;
        if (-3 < lVar13) {
          uVar11 = uVar14 | 0xf;
          uVar18 = 0x16;
          if (0x16 < uVar11) {
            uVar18 = uVar11;
          }
          if (uVar11 < 0xfff) {
            pppppppuVar21 = (undefined8 *******)FUN_7ff70ca8ff40(uVar18 + 1);
            pppppppuStack_b8 = pppppppuVar21;
            goto LAB_7ff70c79e835;
          }
        }
        ppppppuVar12 = (undefined8 ******)FUN_7ff70ca8ff40(uVar18 + 0x28);
        pppppppuVar21 = (undefined8 *******)((longlong)ppppppuVar12 + 0x27U & 0xffffffffffffffe0);
        pppppppuVar21[-1] = ppppppuVar12;
        pppppppuStack_b8 = pppppppuVar21;
      }
LAB_7ff70c79e835:
      puVar16 = puVar10 + 8;
      if (0xf < uVar17) {
        puVar16 = puVar3;
      }
      uStack_a8 = uVar14;
      uStack_a0 = uVar18;
      *(undefined2 *)pppppppuVar21 = 0x203a;
      FUN_7ff70cb12b60((undefined2 *)((longlong)pppppppuVar21 + 2),puVar16,lVar13);
      *(undefined1 *)((longlong)pppppppuVar21 + lVar13 + 2) = 0;
      pppppppuVar21 = &pppppppuStack_b8;
      if (0xf < uStack_a0) {
        pppppppuVar21 = pppppppuStack_b8;
      }
      if (uStack_70 - uStack_78 < uStack_a8) {
        FUN_7ff70ca00b60(&pppppppuStack_88,uStack_a8,uStack_a8,pppppppuVar21,uStack_a8);
      }
      else {
        uVar14 = uStack_78 + uStack_a8;
        pppppppuVar19 = &pppppppuStack_88;
        if (0xf < uStack_70) {
          pppppppuVar19 = pppppppuStack_88;
        }
        lVar13 = uStack_78 + (longlong)pppppppuVar19;
        uStack_78 = uVar14;
        FUN_7ff70cb12b70(lVar13,pppppppuVar21);
        *(undefined1 *)((longlong)pppppppuVar19 + uVar14) = 0;
      }
      if (0xf < uStack_a0) {
        uVar14 = uStack_a0 + 1;
        pppppppuVar21 = pppppppuStack_b8;
        if (0xfff < uVar14) {
          pppppppuVar21 = *(undefined8 ********)((longlong)pppppppuStack_b8 + 0xfffffffffffffff8);
          if (0x1f < (ulonglong)((longlong)pppppppuStack_b8 + (-8 - (longlong)pppppppuVar21)))
          goto LAB_7ff70c79eb6b;
          uVar14 = uStack_a0 + 0x28;
        }
        thunk_FUN_7ff70ca90250(pppppppuVar21,uVar14);
      }
    }
    else {
      uVar18 = uVar14 | 0xf;
      uVar17 = 0x16;
      if (0x16 < uVar18) {
        uVar17 = uVar18;
      }
      if (uVar18 < 0xfff) {
        pppppppuStack_88 = (undefined8 *******)FUN_7ff70ca8ff40(uVar17 + 1);
      }
      else {
        ppppppuVar12 = (undefined8 ******)FUN_7ff70ca8ff40(uVar17 + 0x28);
        pppppppuStack_88 = (undefined8 *******)((longlong)ppppppuVar12 + 0x27U & 0xffffffffffffffe0)
        ;
        pppppppuStack_88[-1] = ppppppuVar12;
      }
      uStack_78 = uVar14;
      uStack_70 = uVar17;
      FUN_7ff70cb12b60(pppppppuStack_88,plVar20,uVar14 + 1);
      lVar13 = puVar10[10];
      if (lVar13 != 0) goto LAB_7ff70c79e6bd;
LAB_7ff70c79e7c3:
      if (uStack_70 == uStack_78) {
        FUN_7ff70ca00b60(&pppppppuStack_88,1);
      }
      else {
        pppppppuVar21 = &pppppppuStack_88;
        if (0xf < uStack_70) {
          pppppppuVar21 = pppppppuStack_88;
        }
        puVar1 = (undefined2 *)((longlong)pppppppuVar21 + uStack_78);
        uStack_78 = uStack_78 + 1;
        *puVar1 = 0x3b;
      }
    }
    pppppppuVar21 = &pppppppuStack_88;
    if (0xf < uStack_70) {
      pppppppuVar21 = pppppppuStack_88;
    }
    lVar13 = FUN_7ff70c8f2b60(lStack_90,pppppppuVar21);
    if (lVar13 != 0) {
      lStack_90 = lVar13;
    }
    if (0xf < uStack_70) {
      uVar14 = uStack_70 + 1;
      pppppppuVar21 = pppppppuStack_88;
      if (0xfff < uVar14) {
        pppppppuVar21 = (undefined8 *******)pppppppuStack_88[-1];
        if (0x1f < (ulonglong)((longlong)pppppppuStack_88 + (-8 - (longlong)pppppppuVar21)))
        goto LAB_7ff70c79eb6b;
        uVar14 = uStack_70 + 0x28;
      }
      thunk_FUN_7ff70ca90250(pppppppuVar21,uVar14);
    }
    puVar3 = (undefined8 *)puVar10[2];
    puVar16 = puVar10;
    if (*(char *)((longlong)puVar10[2] + 0x19) == '\0') {
      do {
        puVar10 = puVar3;
        puVar3 = (undefined8 *)*puVar10;
      } while (*(char *)((longlong)*puVar10 + 0x19) == '\0');
    }
    else {
      do {
        puVar10 = (undefined8 *)puVar16[1];
        if (*(char *)((longlong)puVar10 + 0x19) != '\0') break;
        bVar22 = puVar16 == (undefined8 *)puVar10[2];
        puVar16 = puVar10;
      } while (bVar22);
    }
  } while( true );
}


