/* 7ff70c7b21b0 FUN_7ff70c7b21b0 */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong *
FUN_7ff70c7b21b0(longlong *param_1,undefined8 param_2,longlong *param_3,longlong *param_4)

{
  byte *pbVar1;
  code *pcVar2;
  bool bVar3;
  longlong lVar4;
  char cVar5;
  longlong lVar6;
  longlong *plVar7;
  ulonglong uVar8;
  longlong lVar9;
  ulonglong uVar10;
  undefined8 ******ppppppuVar11;
  uint ******ppppppuVar12;
  longlong *plVar13;
  longlong *plVar14;
  undefined8 *******pppppppuVar15;
  ulonglong uVar16;
  undefined8 *******pppppppuVar17;
  ulonglong uVar18;
  ulonglong uVar19;
  uint *******pppppppuVar20;
  bool bVar21;
  undefined1 auStack_2d8 [144];
  undefined1 auStack_248 [96];
  longlong alStack_1e8 [2];
  longlong *plStack_1d8;
  ulonglong uStack_1d0;
  longlong *plStack_1c8;
  longlong *plStack_1c0;
  longlong lStack_1b8;
  uint *******pppppppuStack_1a8;
  undefined8 uStack_1a0;
  ulonglong uStack_198;
  ulonglong uStack_190;
  undefined8 uStack_188;
  undefined8 uStack_180;
  undefined8 uStack_178;
  undefined8 uStack_170;
  undefined8 uStack_168;
  undefined8 uStack_160;
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
  longlong *plStack_a0;
  longlong *plStack_98;
  longlong *plStack_90;
  undefined8 *******pppppppuStack_88;
  undefined8 uStack_80;
  ulonglong uStack_78;
  ulonglong uStack_70;
  char cStack_61;
  undefined8 uStack_60;
  
  uStack_60 = 0xfffffffffffffffe;
  param_1[1] = 0;
  plStack_90 = param_3;
  lVar6 = FUN_7ff70ca8ff40(0x60);
  *(longlong *)lVar6 = lVar6;
  *(longlong *)(lVar6 + 8) = lVar6;
  *(longlong *)(lVar6 + 0x10) = lVar6;
  *(undefined2 *)(lVar6 + 0x18) = 0x101;
  *param_1 = lVar6;
  plStack_1c8 = (longlong *)0x0;
  plStack_1c0 = (longlong *)0x0;
  lStack_1b8 = 0;
  plStack_98 = param_1;
  FUN_7ff70c7b3a50(auStack_2d8,param_2,1,1);
  pcVar2 = _DAT_7ff70cb95d40;
  pppppppuStack_1a8 = (uint *******)0x0;
  uStack_1a0 = 0;
  uStack_198 = 0;
  uStack_190 = 0xf;
  while( true ) {
    plVar7 = (longlong *)FUN_7ff70c788980(auStack_2d8,&pppppppuStack_1a8,10);
    cVar5 = (*pcVar2)((longlong)*(int *)(*plVar7 + 4) + (longlong)plVar7);
    if (cVar5 != '\0') break;
    FUN_7ff70c7b4280(&plStack_1c8,&pppppppuStack_1a8);
  }
  if (0xf < uStack_190) {
    uVar8 = uStack_190 + 1;
    pppppppuVar20 = pppppppuStack_1a8;
    if (0xfff < uVar8) {
      pppppppuVar20 = (uint *******)pppppppuStack_1a8[-1];
      if (0x1f < (ulonglong)((longlong)pppppppuStack_1a8 + (-8 - (longlong)pppppppuVar20)))
      goto LAB_7ff70c7b2f46;
      uVar8 = uStack_190 + 0x28;
    }
    thunk_FUN_7ff70ca90250(pppppppuVar20,uVar8);
  }
  plStack_1d8 = plStack_1c0;
  cStack_61 = plStack_90 != (longlong *)0x0 || param_4 != (longlong *)0x0;
  plVar7 = plStack_1c8;
  plStack_a0 = param_4;
LAB_7ff70c7b2334:
  if (plVar7 == plStack_1d8) goto LAB_7ff70c7b2ea0;
  pppppppuStack_1a8 = (uint *******)0x0;
  uStack_1a0 = 0;
  uVar8 = plVar7[2];
  if (4 < uVar8) {
    uVar8 = 5;
  }
  plVar14 = plVar7;
  if (0xf < (ulonglong)plVar7[3]) {
    plVar14 = (longlong *)*plVar7;
  }
  uStack_190 = 0xf;
  uStack_198 = uVar8;
  FUN_7ff70cb12b60(&pppppppuStack_1a8,plVar14,uVar8);
  *(undefined1 *)((longlong)&pppppppuStack_1a8 + uVar8) = 0;
  if (uStack_198 == 5) {
    pppppppuVar20 = (uint *******)&pppppppuStack_1a8;
    if (0xf < uStack_190) {
      pppppppuVar20 = pppppppuStack_1a8;
    }
    bVar21 = *(char *)((longlong)pppppppuVar20 + 4) == '/' && *(int *)pppppppuVar20 == 0x50545448;
    bVar3 = bVar21;
    if (0xf < uStack_190) goto LAB_7ff70c7b23f8;
LAB_7ff70c7b23ce:
    if (bVar21) goto LAB_7ff70c7b242e;
LAB_7ff70c7b23d3:
    lVar6 = plVar7[2];
  }
  else {
    bVar3 = false;
    bVar21 = false;
    if (uStack_190 < 0x10) goto LAB_7ff70c7b23ce;
LAB_7ff70c7b23f8:
    uVar8 = uStack_190 + 1;
    pppppppuVar20 = pppppppuStack_1a8;
    if (0xfff < uVar8) {
      pppppppuVar20 = (uint *******)pppppppuStack_1a8[-1];
      if (0x1f < (ulonglong)((longlong)pppppppuStack_1a8 + (-8 - (longlong)pppppppuVar20)))
      goto LAB_7ff70c7b2f46;
      uVar8 = uStack_190 + 0x28;
    }
    thunk_FUN_7ff70ca90250(pppppppuVar20,uVar8);
    if (!bVar3) goto LAB_7ff70c7b23d3;
LAB_7ff70c7b242e:
    if (cStack_61 != '\0') {
      plVar14 = (longlong *)*plVar7;
      uVar8 = plVar7[2];
      uVar19 = plVar7[3];
      plVar13 = plVar7;
      if (0xf < uVar19) {
        plVar13 = plVar14;
      }
      if (uVar8 == 0) {
        lVar6 = -1;
        uVar8 = 0;
      }
      else if (uVar8 + 4 < 0x10) {
        pppppppuStack_1a8 = (uint *******)0x0;
        uStack_180 = 0;
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
        uStack_148 = 0;
        uStack_140 = 0;
        uStack_158 = 0;
        uStack_150 = 0;
        uStack_168 = 0;
        uStack_160 = 0;
        uStack_178 = 0;
        uStack_170 = 0;
        uStack_198 = 0;
        uStack_190 = 0;
        uStack_1a0 = 0x10000010100;
        uStack_188 = 1;
        lVar6 = (longlong)plVar13 + (uVar8 - 1);
        uVar16 = uVar8;
        if (*(char *)((longlong)&pppppppuStack_1a8 +
                     (ulonglong)*(byte *)((longlong)plVar13 + (uVar8 - 1))) == '\x01') {
          do {
            if (uVar16 - 1 == 0) {
              lVar6 = -1;
              goto LAB_7ff70c7b2580;
            }
            pbVar1 = (byte *)(lVar6 + -1);
            lVar6 = lVar6 + -1;
            uVar16 = uVar16 - 1;
          } while (*(char *)((longlong)&pppppppuStack_1a8 + (ulonglong)*pbVar1) != '\0');
        }
        lVar6 = lVar6 - (longlong)plVar13;
      }
      else {
        lVar6 = FUN_7ff70caa6050(plVar13,uVar8,&UNK_7ff70cb90bd5,4);
        plVar14 = (longlong *)*plVar7;
        uVar8 = plVar7[2];
        uVar19 = plVar7[3];
      }
LAB_7ff70c7b2580:
      uVar16 = lVar6 + 1U;
      if (uVar8 <= lVar6 + 1U) {
        uVar16 = uVar8;
      }
      plVar7[2] = uVar16;
      if (uVar19 < 0x10) {
        plVar14 = plVar7;
      }
      *(undefined1 *)((longlong)plVar14 + uVar16) = 0;
      if (plStack_90 != plVar7 && plStack_90 != (longlong *)0x0) {
        plVar14 = plVar7;
        if (0xf < (ulonglong)plVar7[3]) {
          plVar14 = (longlong *)*plVar7;
        }
        uVar8 = plVar7[2];
        if ((ulonglong)plStack_90[3] < uVar8) {
          FUN_7ff70ca005a0(plStack_90,uVar8);
        }
        else {
          plVar13 = plStack_90;
          if (0xf < (ulonglong)plStack_90[3]) {
            plVar13 = (longlong *)*plStack_90;
          }
          plStack_90[2] = uVar8;
          FUN_7ff70cb12b70(plVar13,plVar14,uVar8);
          *(undefined1 *)((longlong)plVar13 + uVar8) = 0;
        }
      }
      if (plStack_a0 != (longlong *)0x0) {
        plVar14 = plVar7;
        if (0xf < (ulonglong)plVar7[3]) {
          plVar14 = (longlong *)*plVar7;
        }
        lVar6 = plVar7[2];
        if (lVar6 != 0) {
          if (lVar6 + 2U < 0x10) {
            pppppppuStack_1a8 = (uint *******)0x0;
            uStack_180 = 0;
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
            uStack_148 = 0;
            uStack_140 = 0;
            uStack_158 = 0;
            uStack_150 = 0;
            uStack_168 = 0;
            uStack_160 = 0;
            uStack_178 = 0;
            uStack_170 = 0;
            uStack_198 = 0;
            uStack_190 = 0;
            uStack_1a0 = 0x100;
            uStack_188 = 1;
            lVar9 = 0;
            do {
              if (*(char *)((longlong)&pppppppuStack_1a8 +
                           (ulonglong)*(byte *)((longlong)plVar14 + lVar9)) != '\0')
              goto joined_r0x7ff70c7b2707;
              lVar4 = lVar9 + 1;
              lVar9 = lVar9 + 1;
            } while ((ulonglong)((longlong)plVar14 + lVar4) < (ulonglong)(lVar6 + (longlong)plVar14)
                    );
            lVar9 = -1;
          }
          else {
            lVar9 = thunk_FUN_7ff70caa59d0(plVar14,lVar6,&UNK_7ff70cb90bda,2);
          }
joined_r0x7ff70c7b2707:
          if (lVar9 != -1) {
            plVar14 = plVar7;
            if (0xf < (ulonglong)plVar7[3]) {
              plVar14 = (longlong *)*plVar7;
            }
            uVar19 = lVar9 + 1;
            uVar8 = plVar7[2];
            lVar6 = uVar8 - uVar19;
            if (uVar19 <= uVar8 && lVar6 != 0) {
              if (lVar6 + 2U < 0x10) {
                pppppppuStack_1a8 = (uint *******)0x0;
                uStack_180 = 0;
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
                uStack_148 = 0;
                uStack_140 = 0;
                uStack_158 = 0;
                uStack_150 = 0;
                uStack_168 = 0;
                uStack_160 = 0;
                uStack_178 = 0;
                uStack_170 = 0;
                uStack_198 = 0;
                uStack_190 = 0;
                uStack_1a0 = 0x100;
                uStack_188 = 1;
                do {
                  if (*(char *)((longlong)&pppppppuStack_1a8 +
                               (ulonglong)*(byte *)((longlong)plVar14 + uVar19)) != '\0')
                  goto joined_r0x7ff70c7b281e;
                  lVar6 = uVar19 + 1;
                  uVar19 = uVar19 + 1;
                } while ((ulonglong)((longlong)plVar14 + lVar6) < uVar8 + (longlong)plVar14);
                uVar19 = 0xffffffffffffffff;
              }
              else {
                lVar6 = thunk_FUN_7ff70caa59d0((longlong)plVar14 + uVar19,lVar6,&UNK_7ff70cb90bda,2)
                ;
                if (lVar6 == -1) goto LAB_7ff70c7b28b0;
                uVar19 = uVar19 + lVar6;
              }
joined_r0x7ff70c7b281e:
              if (uVar19 != 0xffffffffffffffff) {
                uVar8 = plVar7[2];
                uVar16 = uVar19 + 1;
                if (uVar8 < uVar19 + 1) {
                  uVar16 = uVar8;
                }
                plVar14 = plVar7;
                if (0xf < (ulonglong)plVar7[3]) {
                  plVar14 = (longlong *)*plVar7;
                }
                uVar8 = uVar8 - uVar16;
                FUN_7ff70cb12b70(plVar14,uVar16 + (longlong)plVar14,uVar8 + 1);
                plVar7[2] = uVar8;
                if (plStack_a0 != plVar7) {
                  plVar14 = plVar7;
                  if (0xf < (ulonglong)plVar7[3]) {
                    plVar14 = (longlong *)*plVar7;
                  }
                  if ((ulonglong)plStack_a0[3] < uVar8) {
                    FUN_7ff70ca005a0(plStack_a0,uVar8);
                  }
                  else {
                    plVar13 = plStack_a0;
                    if (0xf < (ulonglong)plStack_a0[3]) {
                      plVar13 = (longlong *)*plStack_a0;
                    }
                    plStack_a0[2] = uVar8;
                    FUN_7ff70cb12b70(plVar13,plVar14,uVar8);
                    *(undefined1 *)((longlong)plVar13 + uVar8) = 0;
                  }
                }
              }
            }
          }
        }
      }
    }
LAB_7ff70c7b28b0:
    plVar14 = plStack_98;
    lVar6 = *plStack_98;
    FUN_7ff70ca3dc90(plStack_98,plStack_98,*(undefined8 *)(lVar6 + 8));
    *(longlong *)(lVar6 + 8) = lVar6;
    *(longlong *)lVar6 = lVar6;
    *(longlong *)(lVar6 + 0x10) = lVar6;
    plVar14[1] = 0;
    lVar6 = plVar7[2];
  }
  if (lVar6 != 0) {
    plVar14 = plVar7;
    if (0xf < (ulonglong)plVar7[3]) {
      plVar14 = (longlong *)*plVar7;
    }
    lVar9 = thunk_FUN_7ff70caa5630(plVar14,lVar6 + (longlong)plVar14,0x3a);
    if ((lVar9 != lVar6 + (longlong)plVar14) &&
       (uVar8 = lVar9 - (longlong)plVar14, uVar8 != 0xffffffffffffffff)) {
      pppppppuStack_88 = (undefined8 *******)0x0;
      uStack_80 = 0;
      if (uVar8 < (ulonglong)plVar7[2]) {
        uVar19 = plVar7[2] - (uVar8 + 1);
        if ((longlong)uVar19 < 0) goto LAB_7ff70c7b2fb0;
        plVar14 = (longlong *)*plVar7;
        uVar16 = plVar7[3];
        uVar18 = 0xf;
        pppppppuVar15 = &pppppppuStack_88;
        if (0xf < uVar19) {
          uVar10 = uVar19 | 0xf;
          uVar18 = 0x16;
          if (0x16 < uVar10) {
            uVar18 = uVar10;
          }
          uStack_1d0 = uVar16;
          if (uVar10 < 0xfff) {
            pppppppuVar15 = (undefined8 *******)FUN_7ff70ca8ff40(uVar18 + 1);
            uVar16 = uStack_1d0;
            pppppppuStack_88 = pppppppuVar15;
          }
          else {
            ppppppuVar11 = (undefined8 ******)FUN_7ff70ca8ff40(uVar18 + 0x28);
            pppppppuVar15 =
                 (undefined8 *******)((longlong)ppppppuVar11 + 0x27U & 0xffffffffffffffe0);
            pppppppuVar15[-1] = ppppppuVar11;
            uVar16 = uStack_1d0;
            pppppppuStack_88 = pppppppuVar15;
          }
        }
        if (uVar16 < 0x10) {
          plVar14 = plVar7;
        }
        uStack_78 = uVar19;
        uStack_70 = uVar18;
        FUN_7ff70cb12b60(pppppppuVar15,(longlong)plVar14 + uVar8 + 1,uVar19);
        *(undefined1 *)((longlong)pppppppuVar15 + uVar19) = 0;
        pppppppuVar15 = &pppppppuStack_88;
        if (0xf < uStack_70) {
          pppppppuVar15 = pppppppuStack_88;
        }
        lVar6 = -1;
        if (uStack_78 == 0) {
          uVar19 = 0;
LAB_7ff70c7b2ae4:
          uVar16 = 0xffffffffffffffff;
        }
        else {
          if (uStack_78 + 2 < 0x10) {
            pppppppuStack_1a8 = (uint *******)0x0;
            uStack_180 = 0;
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
            uStack_148 = 0;
            uStack_140 = 0;
            uStack_158 = 0;
            uStack_150 = 0;
            uStack_168 = 0;
            uStack_160 = 0;
            uStack_178 = 0;
            uStack_170 = 0;
            uStack_198 = 0;
            uStack_190 = 0;
            uStack_1a0 = 0x100;
            uStack_188 = 1;
            uVar16 = 0;
            do {
              uVar19 = uStack_78;
              if (*(char *)((longlong)&pppppppuStack_1a8 +
                           (ulonglong)*(byte *)((longlong)pppppppuVar15 + uVar16)) != '\x01')
              goto LAB_7ff70c7b2b1d;
              lVar9 = uVar16 + 1;
              uVar16 = uVar16 + 1;
            } while ((ulonglong)((longlong)pppppppuVar15 + lVar9) <
                     (longlong)pppppppuVar15 + uStack_78);
            goto LAB_7ff70c7b2ae4;
          }
          uVar16 = thunk_FUN_7ff70caa5ee0(pppppppuVar15,uStack_78,&UNK_7ff70cb90bda,2);
          uVar19 = uStack_78;
        }
LAB_7ff70c7b2b1d:
        uVar18 = uVar16;
        if (uVar19 < uVar16) {
          uVar18 = uVar19;
        }
        pppppppuVar15 = pppppppuStack_88;
        if (uStack_70 < 0x10) {
          pppppppuVar15 = &pppppppuStack_88;
        }
        uVar10 = uVar19 - uVar18;
        FUN_7ff70cb12b70(pppppppuVar15,(longlong)pppppppuVar15 + uVar18,uVar10 + 1);
        pppppppuVar15 = &pppppppuStack_88;
        if (0xf < uStack_70) {
          pppppppuVar15 = pppppppuStack_88;
        }
        uStack_78 = uVar10;
        if (uVar16 < uVar19) {
          if (uVar10 + 4 < 0x10) {
            pppppppuStack_1a8 = (uint *******)0x0;
            uStack_180 = 0;
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
            uStack_148 = 0;
            uStack_140 = 0;
            uStack_158 = 0;
            uStack_150 = 0;
            uStack_168 = 0;
            uStack_160 = 0;
            uStack_178 = 0;
            uStack_170 = 0;
            uStack_198 = 0;
            uStack_190 = 0;
            uStack_1a0 = 0x10000010100;
            uStack_188 = 1;
            lVar6 = (longlong)pppppppuVar15 + (uVar10 - 1);
            if (*(char *)((longlong)&pppppppuStack_1a8 +
                         (ulonglong)*(byte *)((longlong)pppppppuVar15 + (uVar10 - 1))) == '\x01') {
              lVar9 = uVar18 - uVar19;
              do {
                lVar9 = lVar9 + 1;
                if (lVar9 == 0) {
                  lVar6 = -1;
                  goto LAB_7ff70c7b2ca0;
                }
                pbVar1 = (byte *)(lVar6 + -1);
                lVar6 = lVar6 + -1;
              } while (*(char *)((longlong)&pppppppuStack_1a8 + (ulonglong)*pbVar1) != '\0');
            }
            lVar6 = lVar6 - (longlong)pppppppuVar15;
          }
          else {
            lVar6 = FUN_7ff70caa6050(pppppppuVar15,uVar10,&UNK_7ff70cb90bd5,4);
            uVar10 = uStack_78;
          }
        }
LAB_7ff70c7b2ca0:
        uStack_78 = lVar6 + 1U;
        if (uVar10 <= lVar6 + 1U) {
          uStack_78 = uVar10;
        }
        pppppppuVar15 = pppppppuStack_88;
        if (uStack_70 < 0x10) {
          pppppppuVar15 = &pppppppuStack_88;
        }
        *(undefined1 *)((longlong)pppppppuVar15 + uStack_78) = 0;
        pppppppuStack_1a8 = (uint *******)0x0;
        uStack_1a0 = 0;
        if ((ulonglong)plVar7[2] < uVar8) {
          uVar8 = plVar7[2];
        }
        if (-1 < (longlong)uVar8) {
          plVar14 = (longlong *)*plVar7;
          uVar19 = plVar7[3];
          uVar16 = 0xf;
          pppppppuVar20 = (uint *******)&pppppppuStack_1a8;
          if (0xf < uVar8) {
            uVar18 = uVar8 | 0xf;
            uVar16 = 0x16;
            if (0x16 < uVar18) {
              uVar16 = uVar18;
            }
            if (uVar18 < 0xfff) {
              pppppppuVar20 = (uint *******)FUN_7ff70ca8ff40(uVar16 + 1);
              pppppppuStack_1a8 = pppppppuVar20;
            }
            else {
              ppppppuVar12 = (uint ******)FUN_7ff70ca8ff40(uVar16 + 0x28);
              pppppppuVar20 = (uint *******)((longlong)ppppppuVar12 + 0x27U & 0xffffffffffffffe0);
              pppppppuVar20[-1] = ppppppuVar12;
              pppppppuStack_1a8 = pppppppuVar20;
            }
          }
          if (uVar19 < 0x10) {
            plVar14 = plVar7;
          }
          uStack_198 = uVar8;
          uStack_190 = uVar16;
          FUN_7ff70cb12b60(pppppppuVar20,plVar14,uVar8);
          *(undefined1 *)((longlong)pppppppuVar20 + uVar8) = 0;
          FUN_7ff70c7b48e0(plStack_98,alStack_1e8,&pppppppuStack_1a8);
          uVar8 = uStack_78;
          pppppppuVar15 = (undefined8 *******)(alStack_1e8[0] + 0x40);
          if ((undefined8 ********)pppppppuVar15 != &pppppppuStack_88) {
            pppppppuVar17 = &pppppppuStack_88;
            if (0xf < uStack_70) {
              pppppppuVar17 = pppppppuStack_88;
            }
            if (*(ulonglong *)(alStack_1e8[0] + 0x58) < uStack_78) {
              FUN_7ff70ca005a0(pppppppuVar15,uStack_78);
            }
            else {
              if (0xf < *(ulonglong *)(alStack_1e8[0] + 0x58)) {
                pppppppuVar15 = *(undefined8 ********)(alStack_1e8[0] + 0x40);
              }
              *(ulonglong *)(alStack_1e8[0] + 0x50) = uStack_78;
              FUN_7ff70cb12b70(pppppppuVar15,pppppppuVar17,uStack_78);
              *(undefined1 *)((longlong)pppppppuVar15 + uVar8) = 0;
            }
          }
          if (0xf < uStack_190) {
            uVar8 = uStack_190 + 1;
            pppppppuVar20 = pppppppuStack_1a8;
            if (0xfff < uVar8) {
              pppppppuVar20 = (uint *******)pppppppuStack_1a8[-1];
              if (0x1f < (ulonglong)((longlong)pppppppuStack_1a8 + (-8 - (longlong)pppppppuVar20)))
              goto LAB_7ff70c7b2f46;
              uVar8 = uStack_190 + 0x28;
            }
            thunk_FUN_7ff70ca90250(pppppppuVar20,uVar8);
          }
          if (uStack_70 < 0x10) goto LAB_7ff70c7b2330;
          uVar8 = uStack_70 + 1;
          pppppppuVar15 = pppppppuStack_88;
          if (0xfff < uVar8) {
            pppppppuVar15 = (undefined8 *******)pppppppuStack_88[-1];
            if (0x1f < (ulonglong)((longlong)pppppppuStack_88 + (-8 - (longlong)pppppppuVar15)))
            goto LAB_7ff70c7b2f46;
            uVar8 = uStack_70 + 0x28;
          }
          thunk_FUN_7ff70ca90250(pppppppuVar15,uVar8);
          goto LAB_7ff70c7b2330;
        }
      }
      else {
        FUN_7ff70ca01bb0();
      }
      FUN_7ff70ca00780();
LAB_7ff70c7b2fb0:
      FUN_7ff70ca00780();
      pcVar2 = (code *)swi(3);
      plVar7 = (longlong *)(*pcVar2)();
      return plVar7;
    }
  }
LAB_7ff70c7b2330:
  plVar7 = plVar7 + 4;
  goto LAB_7ff70c7b2334;
LAB_7ff70c7b2ea0:
  FUN_7ff70c7b4780(auStack_248);
  func_0x7ff70d85e7f3(auStack_248);
  plVar14 = plStack_1c0;
  plVar7 = (longlong *)((ulonglong)plStack_1c8 & 0xffffffff);
  if (plVar7 != (longlong *)0x0) {
    if (plVar7 == plStack_1c0) {
      uVar8 = lStack_1b8 - (longlong)plVar7;
    }
    else {
      do {
        uVar8 = plVar7[3];
        if (0xf < uVar8) {
          lVar6 = *plVar7;
          uVar19 = uVar8 + 1;
          lVar9 = lVar6;
          if (0xfff < uVar19) {
            lVar9 = *(longlong *)(lVar6 + -8);
            if (0x1f < (ulonglong)((lVar6 + -8) - lVar9)) goto LAB_7ff70c7b2f46;
            uVar19 = uVar8 + 0x28;
          }
          thunk_FUN_7ff70ca90250(lVar9,uVar19);
        }
        plVar7[2] = 0;
        plVar7[3] = 0xf;
        *(undefined1 *)plVar7 = 0;
        plVar7 = plVar7 + 4;
      } while (plVar7 != plVar14);
      uVar8 = lStack_1b8 - (longlong)plStack_1c8;
      plVar7 = plStack_1c8;
    }
    if (0xfff < uVar8) {
      if (0x1f < (ulonglong)((longlong)plVar7 + (-8 - plVar7[-1]))) {
LAB_7ff70c7b2f46:
                    /* WARNING: Does not return */
        pcVar2 = (code *)invalidInstructionException();
        (*pcVar2)();
      }
      uVar8 = uVar8 + 0x27;
      plVar7 = (longlong *)plVar7[-1];
    }
    thunk_FUN_7ff70ca90250(plVar7,uVar8);
  }
  return plStack_98;
}


