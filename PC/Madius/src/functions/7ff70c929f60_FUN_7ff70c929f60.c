/* 7ff70c929f60 FUN_7ff70c929f60 */

ulonglong FUN_7ff70c929f60(longlong *param_1,longlong param_2)

{
  char *pcVar1;
  char *pcVar2;
  ulonglong *puVar3;
  uint uVar4;
  char *pcVar5;
  char *pcVar6;
  char *pcVar7;
  byte *pbVar8;
  code *pcVar9;
  int iVar10;
  int iVar11;
  int iVar12;
  undefined8 uVar13;
  char cVar14;
  char cVar15;
  int iVar16;
  undefined8 in_RAX;
  longlong lVar17;
  longlong lVar18;
  undefined4 *puVar19;
  int *piVar20;
  undefined8 *puVar21;
  ulonglong uVar22;
  uint uVar23;
  int *piVar24;
  longlong lVar25;
  char *pcVar26;
  ulonglong unaff_RBP;
  undefined7 uVar27;
  ulonglong uVar29;
  ulonglong uVar30;
  longlong lVar31;
  longlong lVar32;
  longlong lVar33;
  int *piVar34;
  longlong *plVar35;
  ulonglong uVar36;
  uint uVar37;
  longlong lVar38;
  byte bVar39;
  undefined7 uVar28;
  
  uVar22 = CONCAT71((int7)((ulonglong)in_RAX >> 8),1);
  if (param_2 == 0) goto LAB_7ff70c92b84d;
  uVar22 = 0;
LAB_7ff70c929fa9:
  if (*param_1 < 1) {
LAB_7ff70c92b864:
    FUN_7ff70cb12980(0xb);
code_r0x7ff70c92b86e:
    FUN_7ff70cb12980(0xc);
    pcVar9 = (code *)swi(3);
    uVar22 = (*pcVar9)();
    return uVar22;
  }
  *param_1 = *param_1 + -1;
  if (0x14 < *(int *)(param_2 + 8) - 1U) {
LAB_7ff70c92b843:
    uVar22 = 0;
    goto LAB_7ff70c92b84d;
  }
  lVar31 = *(longlong *)(param_2 + 0x10);
  uVar27 = (undefined7)(unaff_RBP >> 8);
  uVar28 = (undefined7)(uVar22 >> 8);
  switch(*(int *)(param_2 + 8)) {
  default:
    goto code_r0x7ff70c92b020;
  case 2:
    uVar23 = *(uint *)((longlong)param_1 + 0xe4);
    uVar22 = (ulonglong)uVar23;
    if (((uVar23 & 0x100) != 0) || (param_1[1] != param_1[0x1a])) {
      unaff_RBP = CONCAT71((uint7)(uint3)(uVar23 >> 8),1);
      if ((*(byte *)((longlong)param_1 + 0xe1) & 0x10) == 0) goto code_r0x7ff70c92b036;
      cVar14 = *(char *)(param_1[1] + -1);
code_r0x7ff70c92a456:
      uVar22 = CONCAT71((int7)(unaff_RBP >> 8),cVar14 != '\r' && cVar14 != '\n');
    }
    break;
  case 3:
    if ((char *)param_1[1] == (char *)param_1[0x1b]) {
      uVar22 = (ulonglong)(*(byte *)((longlong)param_1 + 0xe4) >> 1);
      break;
    }
    unaff_RBP = CONCAT71(uVar27,1);
    if ((*(byte *)((longlong)param_1 + 0xe1) & 0x10) != 0) {
      cVar14 = *(char *)param_1[1];
      goto code_r0x7ff70c92a456;
    }
    goto code_r0x7ff70c92b036;
  case 4:
    uVar23 = *(uint *)((longlong)param_1 + 0xe4);
    pbVar8 = (byte *)param_1[1];
    if (((uVar23 & 0x100) == 0) && (pbVar8 == (byte *)param_1[0x1a])) {
      if ((char)((uVar23 & 4) >> 2) == '\0' && pbVar8 != (byte *)param_1[0x1b]) {
        bVar39 = *pbVar8;
code_r0x7ff70c92aded:
        bVar39 = (&UNK_7ff70cb46550)[bVar39];
      }
      else {
code_r0x7ff70c92adfa:
        bVar39 = 0;
      }
    }
    else {
      if (pbVar8 == (byte *)param_1[0x1b]) {
        if ((uVar23 & 8) != 0) goto code_r0x7ff70c92adfa;
        bVar39 = pbVar8[-1];
        goto code_r0x7ff70c92aded;
      }
      bVar39 = (&UNK_7ff70cb46550)[pbVar8[-1]] != (&UNK_7ff70cb46550)[*pbVar8];
    }
    uVar22 = CONCAT71(uVar27,(*(byte *)(param_2 + 0xc) & 1) == 0 ^ bVar39);
    break;
  case 5:
    pcVar26 = (char *)param_1[1];
    unaff_RBP = CONCAT71(uVar27,1);
    if (pcVar26 != (char *)param_1[0x1b]) {
      cVar14 = *pcVar26;
      if ((*(byte *)(param_1 + 0x1c) & 0x3e) == 0) {
        if (cVar14 != '\r' && cVar14 != '\n') goto code_r0x7ff70c92ad2f;
      }
      else if (cVar14 != '\0') {
code_r0x7ff70c92ad2f:
        if ((uVar22 & 1) == 0) {
          param_1[1] = (longlong)(pcVar26 + 1);
          uVar22 = 0;
          break;
        }
      }
    }
    goto code_r0x7ff70c92b036;
  case 6:
    lVar38 = *(longlong *)(param_2 + 0x28);
    uVar30 = (ulonglong)*(uint *)(param_2 + 0x24);
    pcVar26 = (char *)param_1[1];
    pcVar5 = (char *)param_1[0x1b];
    if ((*(byte *)((longlong)param_1 + 0xe1) & 1) == 0) {
      uVar36 = 0;
      do {
        pcVar6 = pcVar26 + uVar36;
        if ((pcVar6 == pcVar5) || (uVar30 == uVar36)) {
          if (uVar30 == uVar36) {
            pcVar26 = pcVar6;
          }
          uVar29 = uVar36;
          if (pcVar26 == (char *)param_1[1]) goto code_r0x7ff70c92aaf5;
          goto code_r0x7ff70c92ab1e;
        }
        uVar29 = uVar36 + 1;
        pcVar7 = (char *)(lVar38 + uVar36);
        uVar36 = uVar29;
      } while (*pcVar6 == *pcVar7);
      if (pcVar26 == (char *)param_1[1]) goto code_r0x7ff70c92aaf5;
code_r0x7ff70c92ab1e:
      param_1[1] = (longlong)pcVar26;
    }
    else {
      lVar18 = param_1[0x19];
      uVar36 = 0;
      do {
        pcVar6 = pcVar26 + uVar36;
        if ((pcVar6 == pcVar5) || (uVar30 == uVar36)) {
          if (uVar30 == uVar36) {
            pcVar26 = pcVar6;
          }
          break;
        }
        cVar14 = *(char *)(lVar38 + uVar36);
        uVar36 = uVar36 + 1;
        cVar15 = (**(code **)(**(longlong **)(lVar18 + 8) + 0x20))
                           (*(longlong **)(lVar18 + 8),*pcVar6);
      } while (cVar15 == cVar14);
      uVar29 = uVar36;
      if (pcVar26 != (char *)param_1[1]) goto code_r0x7ff70c92ab1e;
code_r0x7ff70c92aaf5:
      uVar22 = CONCAT71(uVar28,1);
      uVar36 = uVar29;
    }
    uVar30 = uVar36 + 0x3f;
    if (-1 < (longlong)uVar36) {
      uVar30 = uVar36;
    }
    if (*param_1 < (longlong)uVar30 >> 6) goto LAB_7ff70c92b864;
    *param_1 = *param_1 - ((longlong)uVar30 >> 6);
    goto code_r0x7ff70c92b020;
  case 7:
    unaff_RBP = CONCAT71(uVar27,1);
    if ((param_1[1] != param_1[0x1b]) &&
       (lVar38 = func_0x7ff70c92b880(param_1,param_2), lVar38 != param_1[1])) {
      param_1[1] = lVar38;
      goto code_r0x7ff70c92b020;
    }
    goto code_r0x7ff70c92b036;
  case 10:
    uVar30 = param_1[0x16];
    lVar31 = param_1[0x12];
    puVar21 = (undefined8 *)param_1[0x13];
    if (uVar30 < (ulonglong)((longlong)puVar21 - lVar31 >> 5)) {
      lVar38 = uVar30 * 0x20;
      *(undefined4 *)(lVar31 + lVar38) = 1;
      goto code_r0x7ff70c92a168;
    }
    if ((ulonglong)param_1[0x17] <= uVar30) goto code_r0x7ff70c92b86e;
    lVar31 = param_1[1];
    if (puVar21 == (undefined8 *)param_1[0x14]) {
      func_0x7ff70c92c210(param_1 + 0x12);
      puVar21 = (undefined8 *)param_1[0x13];
    }
    *puVar21 = 1;
code_r0x7ff70c92a70a:
    puVar21[1] = param_2;
    puVar21[2] = lVar31;
    puVar21[3] = 0;
    param_1[0x13] = param_1[0x13] + 0x20;
    goto code_r0x7ff70c92a724;
  case 0xb:
    uVar30 = param_1[0x16];
    lVar31 = param_1[0x12];
    puVar21 = (undefined8 *)param_1[0x13];
    if ((ulonglong)((longlong)puVar21 - lVar31 >> 5) <= uVar30) {
      if ((ulonglong)param_1[0x17] <= uVar30) goto code_r0x7ff70c92b86e;
      lVar31 = param_1[1];
      if (puVar21 == (undefined8 *)param_1[0x14]) {
        func_0x7ff70c92c210(param_1 + 0x12);
        puVar21 = (undefined8 *)param_1[0x13];
      }
      *puVar21 = 2;
      goto code_r0x7ff70c92a70a;
    }
    lVar38 = uVar30 * 0x20;
    *(undefined4 *)(lVar31 + lVar38) = 2;
code_r0x7ff70c92a168:
    *(longlong *)(lVar31 + 8 + lVar38) = param_2;
    *(longlong *)(lVar31 + 0x10 + lVar38) = param_1[1];
code_r0x7ff70c92a724:
    param_1[0x16] = param_1[0x16] + 1;
    lVar31 = *(longlong *)(param_2 + 0x20);
    goto code_r0x7ff70c92b020;
  case 0xc:
    lVar38 = param_1[0x12];
    lVar31 = param_1[0x16];
    param_1[0x16] = lVar31 + -1;
    lVar18 = (lVar31 + -1) * 0x20;
    iVar16 = *(int *)(lVar38 + lVar18);
    if (iVar16 - 1U < 2) {
      unaff_RBP = CONCAT71(uVar27,1);
      if (iVar16 == 1) {
        param_1[1] = *(longlong *)(lVar38 + 0x10 + lVar18);
        lVar31 = *(longlong *)(*(longlong *)(lVar38 + 8 + lVar18) + 0x10);
        goto code_r0x7ff70c92b020;
      }
    }
    else {
      lVar18 = lVar31 * 0x20 + -0x10;
      lVar25 = lVar31 * -0x20 + 0x20;
      lVar33 = lVar31 + -2;
      uVar37 = 0;
      uVar23 = 0xffffffff;
      lVar17 = 0;
      lVar31 = lVar31 * -0x20 + 0x60;
      do {
        lVar32 = lVar31;
        if (iVar16 == 0xd) {
          uVar4 = *(uint *)(lVar38 + -0xc + lVar18);
          if (uVar4 <= uVar23) {
            uVar23 = uVar4;
          }
          if (uVar37 <= uVar4) {
            uVar37 = uVar4;
          }
          if (lVar17 == 0) {
            lVar17 = lVar33 + 1;
          }
        }
        param_1[0x16] = lVar33;
        iVar16 = *(int *)(lVar38 + -0x30 + lVar18);
        lVar18 = lVar18 + -0x20;
        lVar25 = lVar25 + 0x20;
        lVar33 = lVar33 + -1;
        lVar31 = lVar32 + 0x20;
      } while (1 < iVar16 - 1U);
      if (iVar16 == 1) {
        param_1[1] = *(longlong *)(lVar38 + lVar18);
        lVar31 = *(longlong *)(*(longlong *)(lVar38 + -8 + lVar18) + 0x10);
        if (lVar17 != 0) {
          piVar24 = (int *)(lVar38 - lVar25);
          lVar17 = lVar17 * 0x20;
          piVar34 = (int *)(lVar38 + lVar17 + 0x20);
          piVar20 = piVar24;
          if (-(lVar17 + 0x20) == lVar25) {
code_r0x7ff70c92a871:
            if ((piVar20 != piVar34) && (piVar24 = piVar20 + 8, piVar24 != piVar34)) {
              do {
                if (0xfffffffd < *piVar24 - 0xeU) {
                  iVar16 = *piVar24;
                  iVar10 = piVar24[1];
                  iVar11 = piVar24[2];
                  iVar12 = piVar24[3];
                  uVar13 = *(undefined8 *)(piVar24 + 6);
                  *(undefined8 *)(piVar20 + 4) = *(undefined8 *)(piVar24 + 4);
                  *(undefined8 *)(piVar20 + 6) = uVar13;
                  *piVar20 = iVar16;
                  piVar20[1] = iVar10;
                  piVar20[2] = iVar11;
                  piVar20[3] = iVar12;
                  piVar20 = piVar20 + 8;
                }
                piVar24 = piVar24 + 8;
              } while (piVar24 != piVar34);
              lVar38 = param_1[0x12];
            }
          }
          else {
            lVar32 = lVar32 + lVar17;
            do {
              piVar20 = piVar24;
              if (*piVar24 - 0xeU < 0xfffffffe) goto code_r0x7ff70c92a871;
              piVar24 = piVar24 + 8;
              lVar32 = lVar32 + -0x20;
              piVar20 = piVar34;
            } while (lVar32 != 0);
          }
          param_1[0x16] = (longlong)piVar20 - lVar38 >> 5;
        }
        break;
      }
      unaff_RBP = CONCAT71(uVar28,1);
      if ((uVar23 <= uVar37) && (uVar23 < uVar37 + 1)) {
        puVar3 = (ulonglong *)(param_1[5] + (ulonglong)(uVar23 >> 6) * 8);
        *puVar3 = *puVar3 & ~(-1L << ((byte)uVar23 & 0x3f));
        uVar30 = (ulonglong)(uVar37 + 1) + 0x3f >> 6;
        uVar22 = (ulonglong)(uVar23 >> 6) + 1;
        if (uVar22 < uVar30) {
          iVar16 = (int)uVar22;
          FUN_7ff70cb12b80((ulonglong)(uint)(iVar16 * 8) + param_1[5],0,((int)uVar30 - iVar16) * 8);
        }
      }
    }
    goto code_r0x7ff70c92b036;
  case 0xd:
    uVar23 = *(int *)(param_2 + 0x20) - 1;
    plVar35 = (longlong *)((ulonglong)uVar23 * 0x10 + param_1[2]);
    uVar30 = param_1[0x16];
    lVar38 = param_1[0x12];
    puVar21 = (undefined8 *)param_1[0x13];
    if (uVar30 < (ulonglong)((longlong)puVar21 - lVar38 >> 5)) {
      lVar18 = uVar30 * 0x20;
      *(undefined4 *)(lVar38 + lVar18) = 0xc;
      *(longlong *)(lVar38 + 8 + lVar18) = param_2;
      *(longlong *)(lVar38 + 0x10 + lVar18) = param_1[1];
    }
    else {
      if ((ulonglong)param_1[0x17] <= uVar30) goto code_r0x7ff70c92b86e;
      lVar38 = param_1[1];
      if (puVar21 == (undefined8 *)param_1[0x14]) {
        func_0x7ff70c92c210(param_1 + 0x12);
        puVar21 = (undefined8 *)param_1[0x13];
      }
      *puVar21 = 0xc;
      puVar21[1] = param_2;
      puVar21[2] = lVar38;
      puVar21[3] = 0;
      param_1[0x13] = param_1[0x13] + 0x20;
    }
    lVar38 = param_1[0x12];
    lVar18 = param_1[0x16];
    param_1[0x16] = lVar18 + 1;
    lVar18 = lVar18 * 0x20;
    *(longlong *)(lVar38 + 0x10 + lVar18) = *plVar35;
    *(uint *)(lVar38 + 4 + lVar18) = uVar23;
    *plVar35 = param_1[1];
    break;
  case 0xe:
    lVar38 = *(longlong *)(param_2 + 0x20);
    if (*(int *)(lVar38 + 0x20) == 0) goto code_r0x7ff70c92b020;
    uVar23 = *(int *)(lVar38 + 0x20) - 1;
    lVar17 = (ulonglong)uVar23 * 0x10 + param_1[2];
    lVar18 = param_1[0x12];
    iVar16 = ((*(ulonglong *)(param_1[5] + (ulonglong)(uVar23 >> 6) * 8) >>
               ((ulonglong)uVar23 & 0x3f) & 1) != 0) + 0xd;
    uVar30 = param_1[0x16];
    piVar20 = (int *)param_1[0x13];
    if (uVar30 < (ulonglong)((longlong)piVar20 - lVar18 >> 5)) {
      lVar25 = uVar30 * 0x20;
      *(int *)(lVar18 + lVar25) = iVar16;
      *(longlong *)(lVar18 + 8 + lVar25) = lVar38;
      *(longlong *)(lVar18 + 0x10 + lVar25) = param_1[1];
    }
    else {
      if ((ulonglong)param_1[0x17] <= uVar30) goto code_r0x7ff70c92b86e;
      lVar18 = param_1[1];
      if (piVar20 == (int *)param_1[0x14]) {
        func_0x7ff70c92c210(param_1 + 0x12);
        piVar20 = (int *)param_1[0x13];
      }
      *piVar20 = iVar16;
      piVar20[1] = 0;
      *(longlong *)(piVar20 + 2) = lVar38;
      *(longlong *)(piVar20 + 4) = lVar18;
      piVar20[6] = 0;
      piVar20[7] = 0;
      param_1[0x13] = param_1[0x13] + 0x20;
    }
    lVar38 = param_1[0x12];
    lVar18 = param_1[0x16];
    param_1[0x16] = lVar18 + 1;
    lVar18 = lVar18 * 0x20;
    *(undefined8 *)(lVar38 + 0x10 + lVar18) = *(undefined8 *)(lVar17 + 8);
    *(uint *)(lVar38 + 4 + lVar18) = uVar23;
    *(longlong *)(lVar17 + 8) = param_1[1];
    puVar3 = (ulonglong *)(param_1[5] + (ulonglong)(uVar23 >> 6) * 8);
    *puVar3 = *puVar3 | 1L << ((byte)uVar23 & 0x3f);
    break;
  case 0xf:
    uVar23 = *(int *)(param_2 + 0x20) - 1;
    if ((*(ulonglong *)(param_1[5] + (ulonglong)(uVar23 >> 6) * 8) >> ((ulonglong)uVar23 & 0x3f) & 1
        ) == 0) {
      uVar22 = uVar22 & 0xff;
      if ((*(byte *)(param_1 + 0x1c) & 0x12) != 0) {
        uVar22 = 1;
      }
    }
    else {
      pcVar26 = (char *)param_1[1];
      lVar38 = (ulonglong)uVar23 * 0x10;
      pcVar5 = *(char **)(param_1[2] + lVar38);
      pcVar6 = *(char **)(param_1[2] + 8 + lVar38);
      if (pcVar5 == pcVar6) {
        lVar38 = 0;
code_r0x7ff70c92addb:
        param_1[1] = (longlong)pcVar26;
      }
      else {
        pcVar7 = (char *)param_1[0x1b];
        if ((*(byte *)((longlong)param_1 + 0xe1) & 1) == 0) {
          lVar38 = 0;
          do {
            pcVar1 = pcVar5 + lVar38;
            pcVar2 = pcVar26 + lVar38;
            if ((pcVar2 == pcVar7) || (pcVar1 == pcVar6)) {
              if (pcVar1 == pcVar6) {
                pcVar26 = pcVar2;
              }
              if (pcVar26 == (char *)param_1[1]) goto code_r0x7ff70c92b336;
              goto code_r0x7ff70c92addb;
            }
            lVar38 = lVar38 + 1;
          } while (*pcVar2 == *pcVar1);
          pcVar5 = (char *)param_1[1];
        }
        else {
          lVar18 = param_1[0x19];
          lVar38 = 0;
          do {
            pcVar1 = pcVar5 + lVar38;
            pcVar2 = pcVar26 + lVar38;
            if ((pcVar2 == pcVar7) || (pcVar1 == pcVar6)) {
              if (pcVar1 == pcVar6) {
                pcVar26 = pcVar2;
              }
              if (pcVar26 != (char *)param_1[1]) goto code_r0x7ff70c92addb;
              goto code_r0x7ff70c92b336;
            }
            lVar38 = lVar38 + 1;
            cVar14 = *pcVar1;
            plVar35 = *(longlong **)(lVar18 + 8);
            cVar15 = (**(code **)(*plVar35 + 0x20))(plVar35,*pcVar2);
            plVar35 = *(longlong **)(lVar18 + 8);
            cVar14 = (**(code **)(*plVar35 + 0x20))(plVar35,cVar14);
          } while (cVar15 == cVar14);
          pcVar5 = (char *)param_1[1];
        }
        if (pcVar26 != pcVar5) goto code_r0x7ff70c92addb;
code_r0x7ff70c92b336:
        uVar22 = CONCAT71(uVar28,1);
      }
      lVar18 = lVar38 + 0x3f;
      if (-1 < lVar38) {
        lVar18 = lVar38;
      }
      if (*param_1 < lVar18 >> 6) goto LAB_7ff70c92b864;
      *param_1 = *param_1 - (lVar18 >> 6);
    }
    break;
  case 0x10:
    lVar38 = *(longlong *)(param_2 + 0x28);
    if (lVar38 != 0) {
      uVar30 = param_1[0x16];
      lVar18 = param_1[0x12];
      puVar21 = (undefined8 *)param_1[0x13];
      if (uVar30 < (ulonglong)((longlong)puVar21 - lVar18 >> 5)) {
        lVar17 = uVar30 * 0x20;
        *(undefined4 *)(lVar18 + lVar17) = 3;
        *(longlong *)(lVar18 + 8 + lVar17) = lVar38;
        *(longlong *)(lVar18 + 0x10 + lVar17) = param_1[1];
        param_1[0x16] = param_1[0x16] + 1;
      }
      else {
        if ((ulonglong)param_1[0x17] <= uVar30) goto code_r0x7ff70c92b86e;
        lVar18 = param_1[1];
        if (puVar21 == (undefined8 *)param_1[0x14]) {
          func_0x7ff70c92c210(param_1 + 0x12);
          puVar21 = (undefined8 *)param_1[0x13];
        }
        *puVar21 = 3;
        puVar21[1] = lVar38;
        puVar21[2] = lVar18;
        puVar21[3] = 0;
        param_1[0x13] = param_1[0x13] + 0x20;
        param_1[0x16] = param_1[0x16] + 1;
      }
    }
    break;
  case 0x12:
    if ((*(int *)(param_1[0xf] + 0xc + (ulonglong)*(uint *)(param_2 + 0x30) * 0x18) == 0) &&
       ((lVar38 = param_1[0xf] + (ulonglong)*(uint *)(param_2 + 0x30) * 0x18,
        (*(byte *)(param_1 + 0x1c) & 0x3e) != 0 ||
        (cVar14 = func_0x7ff70c92c340(param_1,lVar31,lVar38), cVar14 == '\0')))) {
      *(int *)(lVar38 + 0xc) = (int)((ulonglong)(param_1[3] - param_1[2]) >> 4);
    }
    uVar23 = *(uint *)(param_2 + 0xc);
    plVar35 = (longlong *)((ulonglong)*(uint *)(param_2 + 0x30) * 0x18 + param_1[0xf]);
    if (*(int *)(param_2 + 0x34) == 1) {
      uVar30 = param_1[0x16];
      lVar38 = param_1[0x12];
      puVar21 = (undefined8 *)param_1[0x13];
      if (uVar30 < (ulonglong)((longlong)puVar21 - lVar38 >> 5)) {
        lVar18 = uVar30 * 0x20;
        *(undefined4 *)(lVar38 + lVar18) = 4;
        *(longlong *)(lVar38 + 8 + lVar18) = param_2;
        *(longlong *)(lVar38 + 0x10 + lVar18) = param_1[1];
      }
      else {
        if ((ulonglong)param_1[0x17] <= uVar30) goto code_r0x7ff70c92b86e;
        lVar38 = param_1[1];
        if (puVar21 == (undefined8 *)param_1[0x14]) {
          func_0x7ff70c92c210(param_1 + 0x12);
          puVar21 = (undefined8 *)param_1[0x13];
        }
        *puVar21 = 4;
        puVar21[1] = param_2;
        puVar21[2] = lVar38;
        puVar21[3] = 0;
        param_1[0x13] = param_1[0x13] + 0x20;
      }
      lVar38 = param_1[0x16];
      param_1[0x16] = lVar38 + 1;
      *plVar35 = lVar38;
      if ((*(int *)(param_2 + 0x20) < 1) &&
         ((((uVar23 & 2) == 0 || (*(char *)((longlong)param_1 + 0xf3) != '\0')) ||
          (*(int *)(param_2 + 0x24) == 0)))) {
        *(undefined4 *)(plVar35 + 1) = 0;
        lVar31 = *(longlong *)(*(longlong *)(param_2 + 0x28) + 0x10);
        if (*(int *)(param_2 + 0x24) != 0) {
          uVar30 = param_1[0x16];
          lVar38 = param_1[0x12];
          puVar21 = (undefined8 *)param_1[0x13];
          if ((ulonglong)((longlong)puVar21 - lVar38 >> 5) <= uVar30) {
            if ((ulonglong)param_1[0x17] <= uVar30) goto code_r0x7ff70c92b86e;
            lVar38 = param_1[1];
            if (puVar21 == (undefined8 *)param_1[0x14]) {
              func_0x7ff70c92c210(param_1 + 0x12);
              puVar21 = (undefined8 *)param_1[0x13];
            }
            *puVar21 = 5;
            puVar21[1] = param_2;
            puVar21[2] = lVar38;
            puVar21[3] = 0;
            param_1[0x13] = param_1[0x13] + 0x20;
            param_1[0x16] = param_1[0x16] + 1;
            break;
          }
          lVar18 = uVar30 * 0x20;
          *(undefined4 *)(lVar38 + lVar18) = 5;
          *(longlong *)(lVar38 + 8 + lVar18) = param_2;
          *(longlong *)(lVar38 + 0x10 + lVar18) = param_1[1];
          param_1[0x16] = param_1[0x16] + 1;
        }
      }
      else {
        *(undefined4 *)(plVar35 + 1) = 1;
        if (*(int *)(param_2 + 0x20) == 0) {
          *(undefined4 *)(param_1[0x12] + lVar38 * 0x20) = 6;
        }
      }
    }
    else if (*(int *)(param_2 + 0x20) < 1) {
      if (((uVar23 & 2) == 0) || (*(char *)((longlong)param_1 + 0xf3) != '\0')) {
        lVar31 = *(longlong *)(*(longlong *)(param_2 + 0x28) + 0x10);
        if (*(int *)(param_2 + 0x24) != 0) {
          uVar30 = param_1[0x16];
          lVar38 = param_1[0x12];
          puVar21 = (undefined8 *)param_1[0x13];
          if (uVar30 < (ulonglong)((longlong)puVar21 - lVar38 >> 5)) {
            lVar18 = uVar30 * 0x20;
            *(undefined4 *)(lVar38 + lVar18) = 9;
            *(longlong *)(lVar38 + 8 + lVar18) = param_2;
            *(longlong *)(lVar38 + 0x10 + lVar18) = param_1[1];
          }
          else {
            if ((ulonglong)param_1[0x17] <= uVar30) goto code_r0x7ff70c92b86e;
            lVar38 = param_1[1];
            if (puVar21 == (undefined8 *)param_1[0x14]) {
              func_0x7ff70c92c210(param_1 + 0x12);
              puVar21 = (undefined8 *)param_1[0x13];
            }
            *puVar21 = 9;
            puVar21[1] = param_2;
            puVar21[2] = lVar38;
            puVar21[3] = 0;
            param_1[0x13] = param_1[0x13] + 0x20;
          }
          lVar38 = param_1[0x12];
          lVar18 = param_1[0x16];
          param_1[0x16] = lVar18 + 1;
          *(int *)(lVar38 + 4 + lVar18 * 0x20) = (int)plVar35[1];
          *(longlong *)(lVar38 + 0x18 + lVar18 * 0x20) = *plVar35;
          *(undefined4 *)(plVar35 + 1) = 0;
          *plVar35 = lVar18;
        }
      }
      else {
        if (*(int *)(param_2 + 0x24) != 0) goto code_r0x7ff70c92a8c7;
        lVar31 = *(longlong *)(*(longlong *)(param_2 + 0x28) + 0x10);
      }
    }
    else {
code_r0x7ff70c92a8c7:
      iVar16 = 0xb - (uint)(*(int *)(param_2 + 0x20) == 0);
      uVar30 = param_1[0x16];
      lVar38 = param_1[0x12];
      piVar20 = (int *)param_1[0x13];
      if (uVar30 < (ulonglong)((longlong)piVar20 - lVar38 >> 5)) {
        lVar18 = uVar30 * 0x20;
        *(int *)(lVar38 + lVar18) = iVar16;
        *(longlong *)(lVar38 + 8 + lVar18) = param_2;
        *(longlong *)(lVar38 + 0x10 + lVar18) = param_1[1];
      }
      else {
        if ((ulonglong)param_1[0x17] <= uVar30) goto code_r0x7ff70c92b86e;
        lVar38 = param_1[1];
        if (piVar20 == (int *)param_1[0x14]) {
          func_0x7ff70c92c210(param_1 + 0x12);
          piVar20 = (int *)param_1[0x13];
        }
        *piVar20 = iVar16;
        piVar20[1] = 0;
        *(longlong *)(piVar20 + 2) = param_2;
        *(longlong *)(piVar20 + 4) = lVar38;
        piVar20[6] = 0;
        piVar20[7] = 0;
        param_1[0x13] = param_1[0x13] + 0x20;
      }
      lVar38 = param_1[0x12];
      lVar18 = param_1[0x16];
      param_1[0x16] = lVar18 + 1;
      *(int *)(lVar38 + 4 + lVar18 * 0x20) = (int)plVar35[1];
      *(longlong *)(lVar38 + 0x18 + lVar18 * 0x20) = *plVar35;
      *(undefined4 *)(plVar35 + 1) = 1;
      *plVar35 = lVar18;
    }
    goto code_r0x7ff70c92b020;
  case 0x13:
    lVar38 = *(longlong *)(param_2 + 0x20);
    uVar23 = *(uint *)(lVar38 + 0xc);
    plVar35 = (longlong *)((ulonglong)*(uint *)(lVar38 + 0x30) * 0x18 + param_1[0xf]);
    if ((uVar23 & 0x1000) == 0 && *(int *)(lVar38 + 0x34) == 0) {
      lVar18 = param_1[1];
      lVar17 = param_1[0x12];
      lVar25 = *(longlong *)(lVar17 + 0x10 + *plVar35 * 0x20);
      iVar16 = (int)plVar35[1];
      if (iVar16 < *(int *)(lVar38 + 0x20)) {
        puVar21 = (undefined8 *)param_1[0x13];
        uVar30 = param_1[0x16];
        if (uVar30 < (ulonglong)((longlong)puVar21 - lVar17 >> 5)) {
          lVar31 = uVar30 * 0x20;
          *(undefined4 *)(lVar17 + lVar31) = 0xb;
          *(longlong *)(lVar17 + 8 + lVar31) = lVar38;
          *(longlong *)(lVar17 + 0x10 + lVar31) = param_1[1];
        }
        else {
          if ((ulonglong)param_1[0x17] <= uVar30) goto code_r0x7ff70c92b86e;
          if (puVar21 == (undefined8 *)param_1[0x14]) {
            func_0x7ff70c92c210(param_1 + 0x12);
            puVar21 = (undefined8 *)param_1[0x13];
          }
          *puVar21 = 0xb;
          puVar21[1] = lVar38;
          puVar21[2] = lVar18;
          puVar21[3] = 0;
          param_1[0x13] = param_1[0x13] + 0x20;
        }
        lVar31 = param_1[0x12];
        lVar17 = param_1[0x16];
        param_1[0x16] = lVar17 + 1;
        *(int *)(lVar31 + 4 + lVar17 * 0x20) = (int)plVar35[1];
        *(longlong *)(lVar31 + 0x18 + lVar17 * 0x20) = *plVar35;
        *plVar35 = lVar17;
        if ((lVar25 == lVar18) && (*(int *)(lVar38 + 0x24) < 0)) {
          iVar16 = *(int *)(lVar38 + 0x20);
        }
        else {
          iVar16 = (int)plVar35[1] + 1;
        }
code_r0x7ff70c92b000:
        *(int *)(plVar35 + 1) = iVar16;
code_r0x7ff70c92b005:
        func_0x7ff70c92ba70(param_1,*(undefined4 *)((longlong)plVar35 + 0xc));
        lVar31 = *(longlong *)(lVar38 + 0x10);
      }
      else if (lVar25 == lVar18) {
        if (iVar16 != *(int *)(lVar38 + 0x20)) {
          uVar22 = uVar22 & 0xff;
          if ((*(byte *)(param_1 + 0x1c) & 0x3e) == 0) {
            uVar22 = 1;
          }
          if (iVar16 != 1) {
            uVar22 = 1;
          }
          break;
        }
      }
      else if (((uVar23 & 2) == 0) || (*(char *)((longlong)param_1 + 0xf3) != '\0')) {
        if (iVar16 != *(int *)(lVar38 + 0x24)) {
          lVar18 = func_0x7ff70c92b9a0(param_1,9,lVar38);
          lVar38 = param_1[0x12];
          *(int *)(lVar38 + 4 + lVar18 * 0x20) = (int)plVar35[1];
          *(longlong *)(lVar38 + 0x18 + lVar18 * 0x20) = *plVar35;
          *plVar35 = lVar18;
        }
      }
      else if (iVar16 != *(int *)(lVar38 + 0x24)) {
        lVar18 = func_0x7ff70c92b9a0(param_1,10,lVar38);
        lVar31 = param_1[0x12];
        *(int *)(lVar31 + 4 + lVar18 * 0x20) = (int)plVar35[1];
        *(longlong *)(lVar31 + 0x18 + lVar18 * 0x20) = *plVar35;
        *plVar35 = lVar18;
        if ((int)plVar35[1] != 0x7fffffff) {
          iVar16 = (int)plVar35[1] + 1;
          goto code_r0x7ff70c92b000;
        }
        goto code_r0x7ff70c92b005;
      }
    }
    else {
      if ((int)plVar35[1] == 1) {
        lVar18 = param_1[0x12];
        lVar17 = *plVar35 * 0x20;
        lVar25 = param_1[1] - *(longlong *)(lVar18 + 0x10 + lVar17);
        plVar35[2] = lVar25;
        if (lVar25 == 0) {
          if ((*(byte *)(param_1 + 0x1c) & 0x3e) != 0) goto code_r0x7ff70c92b020;
          uVar22 = uVar22 & 0xff;
          if (*(int *)(lVar38 + 0x20) == 0) {
            uVar22 = 1;
          }
          break;
        }
        iVar16 = (uint)((*(int *)(lVar18 + lVar17) - 6U & 0xfffffffb) == 0) * 4 + 4;
        uVar30 = param_1[0x16];
        lVar18 = param_1[0x12];
        piVar20 = (int *)param_1[0x13];
        if (uVar30 < (ulonglong)((longlong)piVar20 - lVar18 >> 5)) {
          lVar17 = uVar30 * 0x20;
          *(int *)(lVar18 + lVar17) = iVar16;
          *(longlong *)(lVar18 + 8 + lVar17) = lVar38;
          *(longlong *)(lVar18 + 0x10 + lVar17) = param_1[1];
        }
        else {
          if ((ulonglong)param_1[0x17] <= uVar30) goto code_r0x7ff70c92b86e;
          lVar18 = param_1[1];
          if (piVar20 == (int *)param_1[0x14]) {
            func_0x7ff70c92c210(param_1 + 0x12);
            piVar20 = (int *)param_1[0x13];
          }
          *piVar20 = iVar16;
          piVar20[1] = 0;
          *(longlong *)(piVar20 + 2) = lVar38;
          *(longlong *)(piVar20 + 4) = lVar18;
          piVar20[6] = 0;
          piVar20[7] = 0;
          param_1[0x13] = param_1[0x13] + 0x20;
        }
        lVar18 = param_1[0x16];
        param_1[0x16] = lVar18 + 1;
        *(longlong *)(param_1[0x12] + 0x18 + lVar18 * 0x20) = *plVar35;
        *plVar35 = lVar18;
        iVar16 = (int)plVar35[1];
        if (iVar16 < *(int *)(lVar38 + 0x20)) goto code_r0x7ff70c92acf9;
      }
      else {
        param_1[0x16] = *plVar35 + 1;
        iVar16 = (int)plVar35[1];
        if (iVar16 < *(int *)(lVar38 + 0x20)) {
code_r0x7ff70c92acf9:
          lVar31 = *(longlong *)(lVar38 + 0x10);
          *(int *)(plVar35 + 1) = iVar16 + 1;
          goto code_r0x7ff70c92b020;
        }
      }
      if (((uVar23 & 2) == 0) || (*(char *)((longlong)param_1 + 0xf3) != '\0')) {
        if (iVar16 == *(int *)(lVar38 + 0x24)) {
code_r0x7ff70c92b6a1:
          param_1[0x16] = param_1[0x16] + -1;
        }
        else {
          lVar18 = param_1[0x12];
          lVar17 = *plVar35 * 0x20;
          *(longlong *)(lVar18 + 0x10 + lVar17) = param_1[1];
          *(undefined4 *)(lVar18 + lVar17) = 5;
          *(longlong *)(lVar18 + 8 + lVar17) = lVar38;
        }
      }
      else {
        puVar19 = (undefined4 *)(param_1[0x12] + *plVar35 * 0x20);
        if (*(int *)(param_1[0x12] + *plVar35 * 0x20) == 4) {
          *puVar19 = 8;
          lVar18 = *(longlong *)(puVar19 + 6);
          lVar17 = param_1[1];
          lVar25 = param_1[0x12];
          *(longlong *)(lVar25 + 0x10 + lVar18 * 0x20) = lVar17;
          *(longlong *)(lVar25 + 0x10 + lVar18 * 0x20) = lVar17 - plVar35[2];
        }
        lVar18 = param_1[1];
        *(longlong *)(puVar19 + 4) = lVar18;
        iVar16 = (int)plVar35[1];
        if (iVar16 == *(int *)(lVar38 + 0x24)) {
          lVar18 = lVar18 - plVar35[2];
          *(longlong *)(puVar19 + 4) = lVar18;
          if (lVar18 == *(longlong *)(param_1[0x12] + 0x10 + *(longlong *)(puVar19 + 6) * 0x20))
          goto code_r0x7ff70c92b6a1;
          *puVar19 = 7;
        }
        else {
          lVar31 = *(longlong *)(lVar38 + 0x10);
          if (iVar16 != 0x7fffffff) {
            *(int *)(plVar35 + 1) = iVar16 + 1;
          }
        }
      }
    }
code_r0x7ff70c92b020:
    break;
  case 0x15:
    uVar30 = (ulonglong)*(ushort *)((longlong)param_1 + 0xe4);
    if (((*(ushort *)((longlong)param_1 + 0xe4) & 0x2020) != 0) &&
       (uVar30 = param_1[0x1a], uVar30 == param_1[1])) {
      unaff_RBP = CONCAT71(uVar27,1);
      goto code_r0x7ff70c92b036;
    }
    if (*(char *)((longlong)param_1 + 0xf4) == '\x01') {
      uVar30 = param_1[1];
      unaff_RBP = CONCAT71(uVar27,1);
      if (uVar30 != param_1[0x1b]) goto code_r0x7ff70c92b036;
    }
    if (*(char *)((longlong)param_1 + 0xf3) != '\x01') {
      uVar22 = CONCAT71((int7)(uVar30 >> 8),1);
      goto LAB_7ff70c92b84d;
    }
    lVar31 = param_1[1];
    unaff_RBP = uVar22;
    if (*(char *)((longlong)param_1 + 0xf2) == '\x01') {
      if (param_1[8] == lVar31) {
        uVar23 = (int)param_1[0x1d] - 1;
        if (uVar23 != 0) {
          lVar38 = 8;
          uVar22 = 0;
          do {
            uVar29 = 1L << ((byte)uVar22 & 0x3f);
            uVar30 = *(ulonglong *)(param_1[5] + (uVar22 >> 6) * 8);
            uVar36 = *(ulonglong *)(param_1[0xc] + (uVar22 >> 6) * 8);
            if (((uVar30 >> (uVar22 & 0x3f) & 1) == 0) || ((uVar36 & uVar29) == 0)) {
              if (((uVar29 & uVar30) != 0) != ((uVar36 & uVar29) != 0)) {
                if ((uVar29 & uVar30) != 0) goto code_r0x7ff70c92a3a6;
                break;
              }
            }
            else {
              lVar18 = *(longlong *)(param_1[9] + -8 + lVar38);
              lVar17 = *(longlong *)(param_1[2] + -8 + lVar38);
              if (lVar18 != lVar17) {
                if (lVar17 - param_1[0x1a] < lVar18 - param_1[0x1a]) goto code_r0x7ff70c92a3a6;
                break;
              }
              lVar17 = *(longlong *)(param_1[9] + lVar38);
              lVar25 = *(longlong *)(param_1[2] + lVar38);
              if (lVar17 != lVar25) {
                if (lVar17 - lVar18 < lVar25 - lVar18) goto code_r0x7ff70c92a3a6;
                break;
              }
            }
            uVar22 = uVar22 + 1;
            lVar38 = lVar38 + 0x10;
          } while (uVar23 != uVar22);
        }
      }
      else if (param_1[8] - param_1[0x1a] < lVar31 - param_1[0x1a]) goto code_r0x7ff70c92a3a6;
    }
    else {
code_r0x7ff70c92a3a6:
      param_1[8] = lVar31;
      FUN_7ff70cb12b70(param_1[9],param_1[2],param_1[3] - param_1[2]);
      FUN_7ff70cb12b70(param_1[0xc],param_1[5],param_1[6] - param_1[5]);
      *(undefined1 *)((longlong)param_1 + 0xf2) = 1;
    }
    goto code_r0x7ff70c92b036;
  }
  unaff_RBP = uVar22;
  if (((uVar22 & 1) == 0) && (uVar22 = 0, param_2 = lVar31, lVar31 != 0)) goto LAB_7ff70c929fa9;
code_r0x7ff70c92b036:
  lVar31 = param_1[0x16];
  uVar22 = unaff_RBP & 0xffffffff;
  if (lVar31 == 0) goto code_r0x7ff70c92b847;
  do {
    lVar31 = lVar31 + -1;
    param_1[0x16] = lVar31;
    iVar16 = *(int *)(param_1[0x12] + lVar31 * 0x20);
    if (0xe < iVar16 - 1U) goto LAB_7ff70c92b843;
    puVar19 = (undefined4 *)(param_1[0x12] + lVar31 * 0x20);
    switch(iVar16) {
    case 2:
      param_1[1] = *(longlong *)(puVar19 + 4);
      param_2 = *(longlong *)(*(longlong *)(puVar19 + 2) + 0x10);
      lVar31 = param_1[0x16];
      goto joined_r0x7ff70c92b139;
    case 3:
      lVar31 = *(longlong *)(puVar19 + 2);
      param_2 = *(longlong *)(lVar31 + 0x10);
      param_1[1] = *(longlong *)(puVar19 + 4);
      lVar31 = *(longlong *)(lVar31 + 0x28);
      if (lVar31 == 0) goto code_r0x7ff70c92b30e;
      *(longlong *)(puVar19 + 2) = lVar31;
      goto code_r0x7ff70c92b26f;
    case 5:
      uVar22 = (ulonglong)*(uint *)(*(longlong *)(puVar19 + 2) + 0x30);
      param_2 = *(longlong *)(*(longlong *)(puVar19 + 2) + 0x10);
      param_1[1] = *(longlong *)(puVar19 + 4);
      iVar16 = *(int *)(param_1[0xf] + 8 + uVar22 * 0x18);
      if (iVar16 != 0x7fffffff) {
        *(int *)(param_1[0xf] + uVar22 * 0x18 + 8) = iVar16 + 1;
      }
      goto code_r0x7ff70c92b30e;
    case 6:
      param_2 = *(longlong *)(*(longlong *)(*(longlong *)(puVar19 + 2) + 0x28) + 0x10);
      param_1[1] = *(longlong *)(puVar19 + 4);
      lVar31 = param_1[0x16];
      goto joined_r0x7ff70c92b139;
    case 7:
      lVar38 = *(longlong *)(puVar19 + 6) + 1;
      if (lVar38 != lVar31) {
        uVar23 = *(uint *)(*(longlong *)(puVar19 + 2) + 0x30);
        lVar31 = param_1[0xf];
        lVar18 = *(longlong *)(puVar19 + 6) * 0x20 + 0x24;
        do {
          plVar35 = (longlong *)
                    ((ulonglong)*(uint *)(param_1[0x12] + lVar18) * 0x10 + param_1[2] +
                    (ulonglong)(*(int *)(param_1[0x12] + -4 + lVar18) != 0xc) * 8);
          *plVar35 = *plVar35 - *(longlong *)((ulonglong)uVar23 * 0x18 + lVar31 + 0x10);
          lVar38 = lVar38 + 1;
          lVar18 = lVar18 + 0x20;
        } while (lVar38 != param_1[0x16]);
      }
    case 8:
      lVar31 = *(longlong *)(puVar19 + 2);
      lVar38 = *(longlong *)(puVar19 + 4);
      param_2 = *(longlong *)(*(longlong *)(lVar31 + 0x28) + 0x10);
      param_1[1] = lVar38;
      lVar38 = lVar38 - *(longlong *)
                         (param_1[0xf] + 0x10 + (ulonglong)*(uint *)(lVar31 + 0x30) * 0x18);
      *(longlong *)(puVar19 + 4) = lVar38;
      if (*(longlong *)(param_1[0x12] + 0x10 + *(longlong *)(puVar19 + 6) * 0x20) == lVar38)
      goto code_r0x7ff70c92b30e;
      *puVar19 = 7;
code_r0x7ff70c92b26f:
      param_1[0x16] = param_1[0x16] + 1;
      lVar31 = param_1[0x16];
      goto joined_r0x7ff70c92b139;
    case 9:
      uVar22 = (ulonglong)*(uint *)(*(longlong *)(puVar19 + 2) + 0x30);
      lVar31 = param_1[0xf] + uVar22 * 0x18;
      param_2 = *(longlong *)(*(longlong *)(puVar19 + 2) + 0x10);
      param_1[1] = *(longlong *)(puVar19 + 4);
      iVar16 = *(int *)(param_1[0xf] + 8 + uVar22 * 0x18);
      if (iVar16 != 0x7fffffff) {
        *(int *)(lVar31 + 8) = iVar16 + 1;
      }
      *puVar19 = 0xb;
      param_1[0x16] = param_1[0x16] + 1;
      func_0x7ff70c92ba70(param_1,*(undefined4 *)(lVar31 + 0xc));
code_r0x7ff70c92b30e:
      lVar31 = param_1[0x16];
joined_r0x7ff70c92b139:
      uVar22 = 0;
      if (lVar31 != 0) goto code_r0x7ff70c92b088;
      goto code_r0x7ff70c929fa0;
    case 10:
      param_2 = *(longlong *)(*(longlong *)(*(longlong *)(puVar19 + 2) + 0x28) + 0x10);
      param_1[1] = *(longlong *)(puVar19 + 4);
      uVar22 = 0;
      goto code_r0x7ff70c92b290;
    case 0xb:
      param_2 = 0;
code_r0x7ff70c92b290:
      uVar23 = *(uint *)(*(longlong *)(puVar19 + 2) + 0x30);
      lVar31 = param_1[0xf];
      *(undefined4 *)(lVar31 + 8 + (ulonglong)uVar23 * 0x18) = puVar19[1];
      *(undefined8 *)(lVar31 + (ulonglong)uVar23 * 0x18) = *(undefined8 *)(puVar19 + 6);
      lVar31 = param_1[0x16];
      goto joined_r0x7ff70c92b2ba;
    case 0xc:
      *(undefined8 *)(param_1[2] + (ulonglong)(uint)puVar19[1] * 0x10) =
           *(undefined8 *)(puVar19 + 4);
      break;
    case 0xd:
      bVar39 = (byte)puVar19[1] & 0x3f;
      puVar3 = (ulonglong *)(param_1[5] + (ulonglong)((uint)puVar19[1] >> 6) * 8);
      *puVar3 = *puVar3 & (-2L << bVar39 | 0xfffffffffffffffeU >> 0x40 - bVar39);
    case 0xe:
      *(undefined8 *)(param_1[2] + 8 + (ulonglong)(uint)puVar19[1] * 0x10) =
           *(undefined8 *)(puVar19 + 4);
      break;
    case 0xf:
      puVar3 = (ulonglong *)(param_1[5] + (ulonglong)((uint)puVar19[1] >> 6) * 8);
      *puVar3 = *puVar3 | 1L << ((byte)puVar19[1] & 0x3f);
    }
    param_2 = 0;
    lVar31 = param_1[0x16];
joined_r0x7ff70c92b2ba:
    if (lVar31 == 0) break;
code_r0x7ff70c92b088:
  } while (param_2 == 0);
code_r0x7ff70c929fa0:
  if (param_2 == 0) goto code_r0x7ff70c92b847;
  goto LAB_7ff70c929fa9;
code_r0x7ff70c92b847:
  uVar22 = uVar22 ^ 1;
LAB_7ff70c92b84d:
  return uVar22 & 0xffffffffffffff01;
}


