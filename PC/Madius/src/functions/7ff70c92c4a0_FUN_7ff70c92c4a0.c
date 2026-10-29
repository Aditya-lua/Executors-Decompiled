/* 7ff70c92c4a0 FUN_7ff70c92c4a0 */

void FUN_7ff70c92c4a0(undefined8 *param_1,longlong param_2,ulonglong *param_3,char *param_4,
                     char *param_5)

{
  char cVar1;
  undefined1 uVar2;
  undefined8 *puVar3;
  undefined1 *puVar4;
  code *pcVar5;
  char *pcVar6;
  byte bVar7;
  ulonglong *puVar8;
  longlong lVar9;
  ulonglong uVar10;
  ulonglong uVar11;
  ulonglong uVar12;
  ulonglong uVar13;
  undefined1 *puVar14;
  ulonglong uVar15;
  
joined_r0x7ff70c92c4c3:
  do {
    pcVar6 = param_4;
    if (pcVar6 == param_5) {
      *param_1 = param_3;
      return;
    }
    cVar1 = *pcVar6;
    param_4 = pcVar6 + 1;
    if (cVar1 != '\\') {
      if (cVar1 == '&') {
        puVar3 = *(undefined8 **)(param_2 + 0x10);
        if (*(undefined8 **)(param_2 + 0x18) != puVar3) {
          puVar4 = (undefined1 *)puVar3[1];
          for (puVar14 = (undefined1 *)*puVar3; puVar14 != puVar4; puVar14 = puVar14 + 1) {
            while( true ) {
              uVar2 = *puVar14;
              uVar12 = param_3[2];
              uVar10 = param_3[3];
              if (uVar10 <= uVar12) break;
              param_3[2] = uVar12 + 1;
              puVar8 = param_3;
              if (0xf < uVar10) {
                puVar8 = (ulonglong *)*param_3;
              }
              *(undefined1 *)((longlong)puVar8 + uVar12) = uVar2;
              *(undefined1 *)((longlong)puVar8 + uVar12 + 1) = 0;
              puVar14 = puVar14 + 1;
              if (puVar14 == puVar4) goto joined_r0x7ff70c92c4c3;
            }
            if (uVar12 == 0x7fffffffffffffff) {
              FUN_7ff70ca00780();
              goto LAB_7ff70c92c830;
            }
            uVar11 = 0x7fffffffffffffff;
            if ((longlong)uVar12 < -1) {
LAB_7ff70c92c5c0:
              lVar9 = FUN_7ff70ca8ff40(uVar11 + 0x28);
              uVar15 = lVar9 + 0x27U & 0xffffffffffffffe0;
              *(longlong *)(uVar15 - 8) = lVar9;
            }
            else {
              uVar11 = 0x7fffffffffffffff;
              if ((uVar10 >> 1 ^ 0x7fffffffffffffff) < uVar10) goto LAB_7ff70c92c5c0;
              uVar15 = uVar12 + 1 | 0xf;
              uVar11 = (uVar10 >> 1) + uVar10;
              if (uVar11 < uVar15) {
                uVar11 = uVar15;
              }
              if (uVar11 == 0xffffffffffffffff) {
                uVar11 = 0xffffffffffffffff;
                uVar15 = 0;
              }
              else {
                if (0xfff < uVar11 + 1) {
                  if (0xffffffffffffffd8 < uVar11 + 1) {
                    FUN_7ff70ca007a0();
                    pcVar5 = (code *)swi(3);
                    (*pcVar5)();
                    return;
                  }
                  goto LAB_7ff70c92c5c0;
                }
                uVar15 = FUN_7ff70ca8ff40();
              }
            }
            param_3[2] = uVar12 + 1;
            param_3[3] = uVar11;
            if (uVar10 < 0x10) {
              FUN_7ff70cb12b60(uVar15,param_3,uVar12);
              *(undefined1 *)(uVar15 + uVar12) = uVar2;
              *(undefined1 *)(uVar15 + 1 + uVar12) = 0;
            }
            else {
              uVar11 = *param_3;
              FUN_7ff70cb12b60(uVar15,uVar11,uVar12);
              *(undefined1 *)(uVar15 + uVar12) = uVar2;
              *(undefined1 *)(uVar15 + 1 + uVar12) = 0;
              uVar12 = uVar10 + 1;
              uVar13 = uVar11;
              if (0xfff < uVar12) {
                uVar13 = *(ulonglong *)(uVar11 - 8);
                if (0x1f < (uVar11 - 8) - uVar13) {
LAB_7ff70c92c830:
                    /* WARNING: Does not return */
                  pcVar5 = (code *)invalidInstructionException();
                  (*pcVar5)();
                }
                uVar12 = uVar10 + 0x28;
              }
              thunk_FUN_7ff70ca90250(uVar13,uVar12);
            }
            *param_3 = uVar15;
          }
        }
      }
      else {
        uVar12 = param_3[2];
        if (uVar12 < param_3[3]) {
          param_3[2] = uVar12 + 1;
          puVar8 = param_3;
          if (0xf < param_3[3]) {
            puVar8 = (ulonglong *)*param_3;
          }
          *(char *)((longlong)puVar8 + uVar12) = cVar1;
          *(undefined1 *)((longlong)puVar8 + uVar12 + 1) = 0;
        }
        else {
          FUN_7ff70ca31d10(param_3,1);
        }
      }
      goto joined_r0x7ff70c92c4c3;
    }
    if (param_4 != param_5) {
      cVar1 = pcVar6[1];
      bVar7 = cVar1 - 0x30;
      param_4 = pcVar6 + 2;
      if (bVar7 < 10) {
        uVar12 = (ulonglong)bVar7;
        lVar9 = *(longlong *)(param_2 + 0x10);
        uVar10 = (*(longlong *)(param_2 + 0x18) - lVar9 >> 3) * -0x5555555555555555;
        if (uVar12 <= uVar10 && uVar10 - uVar12 != 0) {
          puVar4 = *(undefined1 **)(lVar9 + 8 + uVar12 * 0x18);
          for (puVar14 = *(undefined1 **)(lVar9 + uVar12 * 0x18); puVar14 != puVar4;
              puVar14 = puVar14 + 1) {
            while( true ) {
              uVar2 = *puVar14;
              uVar12 = param_3[2];
              if (param_3[3] <= uVar12) break;
              param_3[2] = uVar12 + 1;
              puVar8 = param_3;
              if (0xf < param_3[3]) {
                puVar8 = (ulonglong *)*param_3;
              }
              *(undefined1 *)((longlong)puVar8 + uVar12) = uVar2;
              *(undefined1 *)((longlong)puVar8 + uVar12 + 1) = 0;
              puVar14 = puVar14 + 1;
              if (puVar14 == puVar4) goto joined_r0x7ff70c92c4c3;
            }
            FUN_7ff70ca31d10(param_3,1);
          }
        }
      }
      else {
        uVar12 = param_3[2];
        if (uVar12 < param_3[3]) {
          param_3[2] = uVar12 + 1;
          puVar8 = param_3;
          if (0xf < param_3[3]) {
            puVar8 = (ulonglong *)*param_3;
          }
          *(char *)((longlong)puVar8 + uVar12) = cVar1;
          *(undefined1 *)((longlong)puVar8 + uVar12 + 1) = 0;
        }
        else {
          FUN_7ff70ca31d10(param_3,1);
        }
      }
    }
  } while( true );
}


