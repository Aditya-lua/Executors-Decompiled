/* 7ff70c93bfd0 FUN_7ff70c93bfd0 */

/* WARNING: Instruction at (ram,0x7ff70c93c482) overlaps instruction at (ram,0x7ff70c93c481)
    */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined1 * FUN_7ff70c93bfd0(undefined1 *param_1)

{
  char *pcVar1;
  code *pcVar2;
  int iVar3;
  int *piVar4;
  undefined1 *puVar5;
  int *piVar6;
  undefined8 *****pppppuVar7;
  ulonglong uVar8;
  char cVar9;
  ulonglong uVar10;
  undefined1 *puVar11;
  undefined8 ******ppppppuVar12;
  longlong lVar13;
  undefined1 *puVar14;
  undefined8 auStack_278 [2];
  undefined1 auStack_268 [32];
  undefined8 uStack_248;
  undefined4 uStack_240;
  undefined4 *puStack_238;
  undefined8 uStack_230;
  int aiStack_220 [14];
  undefined1 auStack_1e8 [80];
  uint uStack_198;
  uint uStack_194;
  undefined8 uStack_118;
  undefined8 uStack_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  ulonglong uStack_d8;
  longlong lStack_d0;
  longlong lStack_c8;
  int *piStack_c0;
  longlong lStack_b8;
  longlong lStack_b0;
  undefined1 *puStack_a8;
  undefined1 *puStack_a0;
  undefined8 *****pppppuStack_98;
  undefined8 uStack_90;
  undefined1 *puStack_88;
  int *piStack_80;
  undefined1 *puStack_78;
  undefined4 uStack_64;
  undefined8 uStack_60;
  
  uStack_60 = 0xfffffffffffffffe;
  if (param_1 != (undefined1 *)0x0) {
    uStack_e8 = 0;
    uStack_e0 = 0;
    uStack_f8 = 0;
    uStack_f0 = 0;
    uStack_108 = 0;
    uStack_100 = 0;
    uStack_118 = 0;
    uStack_110 = 0;
    FUN_7ff70cb12b80(aiStack_220,0,0x108);
    uStack_90 = 0;
    pppppuStack_98 = (undefined8 *****)0x33;
    piStack_80 = (int *)&uStack_118;
    puStack_78 = (undefined1 *)0x40;
    uStack_64 = 0;
    uStack_230 = 0;
    uStack_240 = 0;
    uStack_248 = 0;
    puStack_238 = &uStack_64;
    puStack_88 = param_1;
    iVar3 = (*_DAT_7ff70cb95730)(_DAT_7ff70cc1ab40,0x80862007,&pppppuStack_98,0x28);
    if (iVar3 == 0) {
      return (undefined1 *)0x0;
    }
    if ((short)uStack_118 != 0x5a4d) {
      return (undefined1 *)0x0;
    }
    puStack_88 = param_1 + uStack_e0._4_4_;
    if (puStack_88 != (undefined1 *)0x0) {
      uStack_90 = 0;
      pppppuStack_98 = (undefined8 ******)0x33;
      puStack_78 = (undefined1 *)0x108;
      uStack_64 = 0;
      uStack_230 = 0;
      uStack_240 = 0;
      uStack_248 = 0;
      puStack_238 = &uStack_64;
      piStack_80 = aiStack_220;
      iVar3 = (*_DAT_7ff70cb95730)(_DAT_7ff70cc1ab40,0x80862007,&pppppuStack_98,0x28);
      puVar14 = (undefined1 *)0x0;
      if (iVar3 == 0) {
        return (undefined1 *)0x0;
      }
      if (aiStack_220[0] != 0x4550) {
        return (undefined1 *)0x0;
      }
      uVar10 = (ulonglong)uStack_198;
      if (uStack_194 != 0 && uVar10 != 0) {
        puStack_a8 = (undefined1 *)(ulonglong)uStack_194;
        piVar4 = (int *)(*_DAT_7ff70cb95988)(0,puStack_a8,0x3000,4);
        puStack_a0 = param_1 + uVar10;
        puVar5 = auStack_268;
        if (puStack_a0 != (undefined1 *)0x0 && piVar4 != (int *)0x0) {
          uStack_90 = 0;
          pppppuStack_98 = (undefined8 ******)0x33;
          puStack_78 = puStack_a8;
          uStack_64 = 0;
          uStack_230 = 0;
          uStack_240 = 0;
          uStack_248 = 0;
          puStack_238 = &uStack_64;
          puStack_88 = puStack_a0;
          piStack_80 = piVar4;
          iVar3 = (*_DAT_7ff70cb95730)(_DAT_7ff70cc1ab40,0x80862007,&pppppuStack_98,0x28);
          puVar5 = auStack_268;
          if ((iVar3 != 0) && (puVar5 = auStack_268, piVar4[6] != 0)) {
            lStack_d0 = (longlong)piVar4 - uVar10;
            lStack_c8 = (ulonglong)(uint)piVar4[8] + lStack_d0;
            lStack_b0 = (ulonglong)(uint)piVar4[9] + lStack_d0;
            lStack_b8 = (ulonglong)(uint)piVar4[7] + lStack_d0;
            puStack_a8 = puStack_a8 + (longlong)puStack_a0;
            uVar10 = 0;
            puVar11 = auStack_268;
            piStack_c0 = piVar4;
            do {
              lVar13 = (ulonglong)*(uint *)(lStack_c8 + uVar10 * 4) + lStack_d0;
              puStack_88 = (undefined1 *)0x0;
              piStack_80 = (int *)0x0;
              pppppuStack_98 = (undefined8 ******)0x0;
              uStack_90 = 0;
              *(undefined8 *)(puVar11 + -8) = 0x7ff70c93c2f5;
              uStack_d8 = uVar10;
              puVar5 = (undefined1 *)FUN_7ff70cb12e80(lVar13);
              if ((longlong)puVar5 < 0) {
                *(undefined8 *)(puVar11 + -8) = 0x7ff70c93c4a5;
                FUN_7ff70ca00780();
LAB_7ff70c93c4a5:
                    /* WARNING: Does not return */
                pcVar2 = (code *)invalidInstructionException();
                (*pcVar2)();
              }
              piVar4 = (int *)0xf;
              ppppppuVar12 = &pppppuStack_98;
              if ((undefined1 *)0xf < puVar5) {
                piVar6 = (int *)((ulonglong)puVar5 | 0xf);
                piVar4 = (int *)0x16;
                if ((int *)0x16 < piVar6) {
                  piVar4 = piVar6;
                }
                if (piVar6 < (int *)0xfff) {
                  *(undefined8 *)(puVar11 + -8) = 0x7ff70c93c350;
                  ppppppuVar12 = (undefined8 ******)FUN_7ff70ca8ff40((longlong)piVar4 + 1);
                  pppppuStack_98 = ppppppuVar12;
                }
                else {
                  *(undefined8 *)(puVar11 + -8) = 0x7ff70c93c338;
                  pppppuVar7 = (undefined8 *****)FUN_7ff70ca8ff40(piVar4 + 10);
                  ppppppuVar12 = (undefined8 ******)
                                 ((longlong)pppppuVar7 + 0x27U & 0xffffffffffffffe0);
                  ppppppuVar12[-1] = pppppuVar7;
                  pppppuStack_98 = ppppppuVar12;
                }
              }
              *(undefined8 *)(puVar11 + -8) = 0x7ff70c93c376;
              puStack_88 = puVar5;
              piStack_80 = piVar4;
              FUN_7ff70cb12b60(ppppppuVar12,lVar13,puVar5);
              piVar4 = piStack_c0;
              uVar10 = uStack_d8;
              *(undefined1 *)((longlong)ppppppuVar12 + (longlong)puVar5) = 0;
              ppppppuVar12 = &pppppuStack_98;
              if ((int *)0xf < piStack_80) {
                ppppppuVar12 = (undefined8 ******)pppppuStack_98;
              }
              *(undefined8 *)(puVar11 + -8) = 0x7ff70c93c3b6;
              iVar3 = func_0x7ff70cc4735d(ppppppuVar12);
              *param_1 = (char)iVar3;
              puVar5 = puVar11;
              if (iVar3 == 0) {
                uVar8 = (ulonglong)
                        *(uint *)(lStack_b8 + (ulonglong)*(ushort *)(lStack_b0 + uVar10 * 2) * 4);
                if (uVar8 < 0x1001) {
                  puVar14 = (undefined1 *)0x0;
                }
                else {
                  puVar5 = param_1 + 1 + uVar8;
                  puVar14 = (undefined1 *)0x0;
                  if (puStack_a8 < puVar5) {
                    puVar14 = puVar5;
                  }
                  if (puVar5 < puStack_a0) {
                    puVar14 = puVar5;
                  }
                  puVar5 = puVar11 + -8;
                  *(int **)(puVar11 + -8) = piVar4;
                  *(undefined8 *)(puVar11 + -0x10) = 0x7ff70c93c411;
                  func_0x7ff70d5c065a(piVar4,0,0x8000);
                }
              }
              if ((int *)0xf < piStack_80) {
                ppppppuVar12 = (undefined8 ******)pppppuStack_98;
                if ((0xfff < (longlong)piStack_80 + 1U) &&
                   (ppppppuVar12 = (undefined8 ******)pppppuStack_98[-1],
                   0x1f < (ulonglong)((longlong)pppppuStack_98 + (-8 - (longlong)ppppppuVar12))))
                goto LAB_7ff70c93c4a5;
                *(undefined8 *)(puVar5 + -8) = 0x7ff70c93c453;
                thunk_FUN_7ff70ca90250(ppppppuVar12);
              }
              if (iVar3 == 0) {
                return puVar14;
              }
              uVar10 = uVar10 + 1;
              puVar11 = puVar5;
              param_1 = param_1 + 1;
            } while (uVar10 < (uint)piVar4[6]);
          }
        }
        cVar9 = '\0';
        *(undefined8 *)(puVar5 + -8) = 0x7ff70c93c47c;
        iVar3 = func_0x7ff70d7f52b5(piVar4,0,0x8000);
        uVar10 = (ulonglong)((uint)auStack_1e8 | (uint)uVar10);
        pcVar1 = (char *)(uVar10 + 400);
        *pcVar1 = *pcVar1 - cVar9;
        return (undefined1 *)(ulonglong)(uint)(iVar3 + *(int *)(uVar10 + 0x31));
      }
    }
  }
  return (undefined1 *)0x0;
}


