/* 7ff70c79fb60 FUN_7ff70c79fb60 */

void FUN_7ff70c79fb60(longlong param_1)

{
  undefined1 *puVar1;
  code *pcVar2;
  char cVar3;
  longlong lVar4;
  ulonglong uVar5;
  undefined8 ***pppuVar6;
  ulonglong uVar7;
  undefined8 *puVar8;
  undefined8 uVar9;
  undefined1 *puVar10;
  longlong lVar11;
  undefined8 *puVar12;
  undefined8 ****ppppuVar13;
  undefined8 ****ppppuVar14;
  ulonglong uVar15;
  ulonglong uVar16;
  undefined8 *puVar17;
  longlong lVar18;
  ulonglong uVar19;
  undefined8 ****ppppuVar20;
  undefined8 ***pppuStack_108;
  ulonglong uStack_100;
  ulonglong uStack_f8;
  undefined8 uStack_f0;
  undefined8 ***apppuStack_e0 [2];
  ulonglong uStack_d0;
  ulonglong uStack_c8;
  ulonglong uStack_c0;
  undefined8 ***pppuStack_b8;
  ulonglong uStack_b0;
  undefined8 ***pppuStack_a8;
  undefined4 uStack_a0;
  undefined4 uStack_9c;
  undefined4 uStack_98;
  undefined4 uStack_94;
  undefined4 uStack_90;
  undefined4 uStack_8c;
  undefined4 uStack_88;
  undefined4 uStack_84;
  undefined8 *puStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined4 uStack_58;
  undefined4 uStack_54;
  undefined8 uStack_48;
  
  uStack_48 = 0xfffffffffffffffe;
  FUN_7ff70c7a0440();
  FUN_7ff70c79e600(param_1);
  FUN_7ff70c8f6d10(param_1 + 0x80,apppuStack_e0,*(undefined8 *)(param_1 + 0x48));
  if (uStack_d0 != 0) {
    lVar11 = *(longlong *)(param_1 + 0x70);
    uVar16 = 0x7fffffffffffffff;
    if (lVar11 == 0x7fffffffffffffff) {
      FUN_7ff70ca00780();
    }
    else {
      puVar8 = *(undefined8 **)(param_1 + 0x60);
      uVar7 = *(ulonglong *)(param_1 + 0x78);
      uStack_78 = (undefined8 *)0x0;
      uStack_70 = (undefined8 ****)0x0;
      if (lVar11 + 1U < 0x10) {
        puVar17 = &uStack_78;
        uVar19 = 0xf;
      }
      else {
        puStack_80 = puVar8;
        if (lVar11 < -1) {
          uVar19 = 0x7fffffffffffffff;
        }
        else {
          uVar5 = lVar11 + 1U | 0xf;
          uVar19 = 0x16;
          if (0x16 < uVar5) {
            uVar19 = uVar5;
          }
          if (uVar5 < 0xfff) {
            puVar17 = (undefined8 *)FUN_7ff70ca8ff40(uVar19 + 1);
            puVar8 = puStack_80;
            uStack_78 = puVar17;
            goto LAB_7ff70c79fc7c;
          }
        }
        lVar4 = FUN_7ff70ca8ff40(uVar19 + 0x28);
        puVar17 = (undefined8 *)(lVar4 + 0x27U & 0xffffffffffffffe0);
        puVar17[-1] = lVar4;
        puVar8 = puStack_80;
        uStack_78 = puVar17;
      }
LAB_7ff70c79fc7c:
      uStack_68 = lVar11 + 1;
      puVar12 = (undefined8 *)(param_1 + 0x60);
      if (0xf < uVar7) {
        puVar12 = puVar8;
      }
      uStack_60 = uVar19;
      FUN_7ff70cb12b60(puVar17,puVar12,lVar11);
      *(undefined2 *)((longlong)puVar17 + lVar11) = 0x3f;
      uVar7 = uStack_68;
      uStack_90 = (undefined4)uStack_68;
      uStack_8c = uStack_68._4_4_;
      uStack_88 = (undefined4)uStack_60;
      uStack_84 = uStack_60._4_4_;
      uStack_a0 = (undefined4)uStack_78;
      uStack_9c = uStack_78._4_4_;
      uStack_98 = (undefined4)uStack_70;
      uStack_94 = uStack_70._4_4_;
      pppuStack_a8 = (undefined8 ***)&UNK_7ff70cb743b8;
      if (uStack_d0 <= (uStack_68 ^ 0x7fffffffffffffff)) {
        pppuStack_108 = (undefined8 ****)0x0;
        uStack_100 = 0;
        uVar19 = uStack_d0 + uStack_68;
        if (uVar19 < 0x10) {
          ppppuVar20 = &pppuStack_108;
          uVar16 = 0xf;
          puVar8 = uStack_78;
          uVar5 = uStack_60;
          ppppuVar14 = (undefined8 ****)apppuStack_e0[0];
          uVar15 = uStack_c8;
        }
        else {
          pppuStack_b8 = apppuStack_e0[0];
          uStack_b0 = uStack_c8;
          uStack_c0 = uStack_60;
          puStack_80 = uStack_78;
          if (-1 < (longlong)uVar19) {
            uVar5 = uVar19 | 0xf;
            uVar16 = 0x16;
            if (0x16 < uVar5) {
              uVar16 = uVar5;
            }
            if (uVar5 < 0xfff) {
              ppppuVar20 = (undefined8 ****)FUN_7ff70ca8ff40(uVar16 + 1);
              puVar8 = puStack_80;
              uVar5 = uStack_c0;
              ppppuVar14 = (undefined8 ****)pppuStack_b8;
              uVar15 = uStack_b0;
              pppuStack_108 = ppppuVar20;
              goto LAB_7ff70c79fd71;
            }
          }
          pppuVar6 = (undefined8 ***)FUN_7ff70ca8ff40(uVar16 + 0x28);
          ppppuVar20 = (undefined8 ****)((longlong)pppuVar6 + 0x27U & 0xffffffffffffffe0);
          ppppuVar20[-1] = pppuVar6;
          puVar8 = puStack_80;
          uVar5 = uStack_c0;
          ppppuVar14 = (undefined8 ****)pppuStack_b8;
          uVar15 = uStack_b0;
          pppuStack_108 = ppppuVar20;
        }
LAB_7ff70c79fd71:
        ppppuVar13 = apppuStack_e0;
        if (0xf < uVar15) {
          ppppuVar13 = ppppuVar14;
        }
        puVar17 = (undefined8 *)&uStack_a0;
        if (0xf < uVar5) {
          puVar17 = puVar8;
        }
        uStack_f8 = uVar19;
        uStack_f0 = uVar16;
        FUN_7ff70cb12b60(ppppuVar20,puVar17,uVar7);
        FUN_7ff70cb12b60(uVar7 + (longlong)ppppuVar20,ppppuVar13,uStack_d0);
        *(undefined1 *)((longlong)ppppuVar20 + uVar19) = 0;
        uStack_70 = (undefined8 ****)pppuStack_108;
        uStack_68 = uStack_100;
        uStack_60 = uStack_f8;
        uStack_58 = (undefined4)uStack_f0;
        uStack_54 = uStack_f0._4_4_;
        uStack_78 = (undefined8 *)&UNK_7ff70cb743b8;
        uVar16 = CONCAT44(uStack_84,uStack_88);
        if (0xf < uVar16) {
          lVar4 = CONCAT44(uStack_9c,uStack_a0);
          uVar7 = uVar16 + 1;
          lVar11 = lVar4;
          if (0xfff < uVar7) {
            lVar11 = *(longlong *)(lVar4 + -8);
            if (0x1f < (ulonglong)((lVar4 + -8) - lVar11)) goto LAB_7ff70c7a02de;
            uVar7 = uVar16 + 0x28;
          }
          thunk_FUN_7ff70ca90250(lVar11,uVar7);
        }
        ppppuVar20 = uStack_70;
        if (CONCAT44(uStack_54,uStack_58) < 0x10) {
          ppppuVar20 = (undefined8 ****)&uStack_70;
        }
        FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x2712,ppppuVar20);
        uStack_78 = (undefined8 *)&UNK_7ff70cb743c8;
        uVar16 = CONCAT44(uStack_54,uStack_58);
        if (0xf < uVar16) {
          uVar7 = uVar16 + 1;
          ppppuVar20 = uStack_70;
          if (0xfff < uVar7) {
            ppppuVar20 = (undefined8 ****)uStack_70[-1];
            if (0x1f < (ulonglong)((longlong)uStack_70 + (-8 - (longlong)ppppuVar20)))
            goto LAB_7ff70c7a02de;
            uVar7 = uVar16 + 0x28;
          }
          thunk_FUN_7ff70ca90250(ppppuVar20,uVar7);
        }
        goto LAB_7ff70c79fe75;
      }
    }
    FUN_7ff70ca00780();
LAB_7ff70c7a02ec:
    FUN_7ff70ca00780();
    pcVar2 = (code *)swi(3);
    (*pcVar2)();
    return;
  }
  if (*(ulonglong *)(param_1 + 0x78) < 0x10) {
    lVar11 = param_1 + 0x60;
  }
  else {
    lVar11 = *(longlong *)(param_1 + 0x60);
  }
  FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x2712,lVar11);
LAB_7ff70c79fe75:
  if (*(longlong *)(param_1 + 0x70) == 0) {
    uStack_78 = (undefined8 *)0x0;
    uStack_70 = (undefined8 ****)0x0;
    lVar11 = *(longlong *)(param_1 + 0x60);
    uVar16 = *(ulonglong *)(param_1 + 0x78);
    puVar8 = &uStack_78;
    uVar19 = 0xf;
    uVar7 = 0;
  }
  else {
    lVar11 = param_1 + 0x60;
    if (0xf < *(ulonglong *)(param_1 + 0x78)) {
      lVar11 = *(longlong *)(param_1 + 0x60);
    }
    lVar18 = *(longlong *)(param_1 + 0x70) + lVar11;
    lVar4 = thunk_FUN_7ff70caa5630(lVar11,lVar18,0x3a);
    uVar16 = *(ulonglong *)(param_1 + 0x70);
    uVar7 = lVar4 - lVar11;
    if (uVar16 < (ulonglong)(lVar4 - lVar11)) {
      uVar7 = uVar16;
    }
    if (lVar4 == lVar18) {
      uVar7 = uVar16;
    }
    uStack_78 = (undefined8 *)0x0;
    uStack_70 = (undefined8 ****)0x0;
    if ((longlong)uVar7 < 0) goto LAB_7ff70c7a02ec;
    lVar11 = *(longlong *)(param_1 + 0x60);
    uVar16 = *(ulonglong *)(param_1 + 0x78);
    if (uVar7 < 0x10) {
      puVar8 = &uStack_78;
      uVar19 = 0xf;
    }
    else {
      uVar5 = uVar7 | 0xf;
      uVar19 = 0x16;
      if (0x16 < uVar5) {
        uVar19 = uVar5;
      }
      if (uVar5 < 0xfff) {
        puVar8 = (undefined8 *)FUN_7ff70ca8ff40(uVar19 + 1);
        uStack_78 = puVar8;
      }
      else {
        lVar4 = FUN_7ff70ca8ff40(uVar19 + 0x28);
        puVar8 = (undefined8 *)(lVar4 + 0x27U & 0xffffffffffffffe0);
        puVar8[-1] = lVar4;
        uStack_78 = puVar8;
      }
    }
  }
  lVar4 = param_1 + 0x60;
  if (0xf < uVar16) {
    lVar4 = lVar11;
  }
  uStack_68 = uVar7;
  uStack_60 = uVar19;
  FUN_7ff70cb12b60(puVar8,lVar4,uVar7);
  *(undefined1 *)((longlong)puVar8 + uVar7) = 0;
  cVar3 = FUN_7ff70c8f79c0(param_1 + 0xa0,&uStack_78);
  if (cVar3 != '\0') {
    puVar8 = (undefined8 *)FUN_7ff70c8f79e0(param_1 + 0xa0,&uStack_78);
    if (0xf < (ulonglong)puVar8[3]) {
      puVar8 = (undefined8 *)*puVar8;
    }
    FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x2714,puVar8);
    lVar11 = param_1 + 0xb0;
    cVar3 = FUN_7ff70c7b1110(lVar11,&uStack_78);
    if (cVar3 != '\0') {
      uVar9 = FUN_7ff70c7b1130(lVar11,&uStack_78);
      FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x27bf,uVar9);
      uVar9 = FUN_7ff70c7b1160(lVar11,&uStack_78);
      FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x27c0,uVar9);
    }
  }
  lVar11 = param_1 + 0xd0;
  cVar3 = FUN_7ff70c8f85c0(lVar11);
  if (cVar3 == '\0') {
    cVar3 = FUN_7ff70c8f8a60(lVar11);
    if (cVar3 == '\0') {
      FUN_7ff70c8f85d0(lVar11,&pppuStack_a8);
      ppppuVar20 = &pppuStack_a8;
      if (0xf < CONCAT44(uStack_8c,uStack_90)) {
        ppppuVar20 = (undefined8 ****)pppuStack_a8;
      }
      FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x2776,ppppuVar20);
      uVar16 = CONCAT44(uStack_8c,uStack_90);
      if (0xf < uVar16) {
        uVar7 = uVar16 + 1;
        ppppuVar20 = (undefined8 ****)pppuStack_a8;
        if (0xfff < uVar7) {
          ppppuVar20 = (undefined8 ****)pppuStack_a8[-1];
          if ((undefined *)0x1f <
              (undefined *)((longlong)pppuStack_a8 + (-8 - (longlong)ppppuVar20)))
          goto LAB_7ff70c7a02de;
          uVar7 = uVar16 + 0x28;
        }
        thunk_FUN_7ff70ca90250(ppppuVar20,uVar7);
      }
    }
    else {
      FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x2776,0);
    }
  }
  else {
    FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x2776,&UNK_7ff70cb923a7);
  }
  pppuStack_a8 = (undefined8 ***)((ulonglong)pppuStack_a8 & 0xffffffff00000000);
  FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0xd8,&pppuStack_a8);
  pppuVar6 = pppuStack_a8;
  FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0xd8,0x10);
  if (((ulonglong)pppuVar6 & 2) != 0) {
    FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0xd8,2);
  }
  *(undefined1 *)(*(longlong *)(param_1 + 0x48) + 0x20) = 0;
  puVar1 = (undefined1 *)(param_1 + 0x120);
  *(undefined8 *)(param_1 + 0x130) = 0;
  puVar10 = puVar1;
  if (0xf < *(ulonglong *)(param_1 + 0x138)) {
    puVar10 = *(undefined1 **)(param_1 + 0x120);
  }
  *puVar10 = 0;
  uVar16 = *(ulonglong *)(param_1 + 0x118);
  if ((uVar16 != 0) && (*(ulonglong *)(param_1 + 0x138) < uVar16)) {
    lVar11 = *(longlong *)(param_1 + 0x130);
    FUN_7ff70ca323f0(puVar1,uVar16 - lVar11);
    *(longlong *)(param_1 + 0x130) = lVar11;
  }
  *(undefined8 *)(param_1 + 0x150) = 0;
  puVar10 = (undefined1 *)(param_1 + 0x140);
  if (0xf < *(ulonglong *)(param_1 + 0x158)) {
    puVar10 = *(undefined1 **)(param_1 + 0x140);
  }
  *puVar10 = 0;
  if (*(longlong *)(*(longlong *)(param_1 + 0x110) + 0xd8) == 0) {
    FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x4e2b,&UNK_7ff70c7b3280);
    FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x2711,puVar1);
    lVar11 = *(longlong *)(*(longlong *)(param_1 + 0x110) + 0x90);
  }
  else {
    lVar11 = *(longlong *)(*(longlong *)(param_1 + 0x110) + 0x90);
  }
  if (lVar11 == 0) {
    FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x4e6f,&UNK_7ff70c7b3280);
    FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x272d,(undefined1 *)(param_1 + 0x140));
  }
  FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0xac,1);
  if (0xf < uStack_60) {
    uVar16 = uStack_60 + 1;
    puVar8 = uStack_78;
    if (0xfff < uVar16) {
      puVar8 = (undefined8 *)uStack_78[-1];
      if ((undefined *)0x1f < (undefined *)((longlong)uStack_78 + (-8 - (longlong)puVar8)))
      goto LAB_7ff70c7a02de;
      uVar16 = uStack_60 + 0x28;
    }
    thunk_FUN_7ff70ca90250(puVar8,uVar16);
  }
  if (0xf < uStack_c8) {
    uVar16 = uStack_c8 + 1;
    ppppuVar20 = (undefined8 ****)apppuStack_e0[0];
    if (0xfff < uVar16) {
      ppppuVar20 = (undefined8 ****)apppuStack_e0[0][-1];
      if (0x1f < (ulonglong)((longlong)apppuStack_e0[0] + (-8 - (longlong)ppppuVar20))) {
LAB_7ff70c7a02de:
                    /* WARNING: Does not return */
        pcVar2 = (code *)invalidInstructionException();
        (*pcVar2)();
      }
      uVar16 = uStack_c8 + 0x28;
    }
    thunk_FUN_7ff70ca90250(ppppuVar20,uVar16);
  }
  return;
}


