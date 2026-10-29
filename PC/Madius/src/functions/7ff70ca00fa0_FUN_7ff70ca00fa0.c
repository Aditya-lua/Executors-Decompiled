/* 7ff70ca00fa0 FUN_7ff70ca00fa0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

uint * FUN_7ff70ca00fa0(uint *param_1,uint *param_2)

{
  uint uVar1;
  code *pcVar2;
  char cVar3;
  ulonglong uVar4;
  uint *puVar5;
  ulonglong uVar6;
  longlong lVar7;
  uint *puVar8;
  uint *puVar9;
  ulonglong uVar10;
  short sVar11;
  uint uVar12;
  short sVar13;
  uint *puVar14;
  ulonglong uVar15;
  uint *puVar16;
  uint *puVar17;
  ulonglong uVar18;
  uint *puVar19;
  undefined1 auStack_88 [32];
  ulonglong uStack_68;
  uint *puStack_60;
  uint *puStack_58;
  uint *puStack_50;
  ulonglong uStack_48;
  
  uStack_48 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_88;
  cVar3 = FUN_7ff70ca018a0(param_2);
  if (cVar3 == '\0') {
    puVar8 = param_1;
    if (7 < *(ulonglong *)(param_1 + 6)) {
      puVar8 = *(uint **)param_1;
    }
    uVar4 = *(ulonglong *)(param_1 + 4);
    puVar5 = param_2;
    if (7 < *(ulonglong *)(param_2 + 6)) {
      puVar5 = *(uint **)param_2;
    }
    uVar10 = *(ulonglong *)(param_2 + 4);
    puVar9 = (uint *)((longlong)puVar8 + uVar4 * 2);
    puVar14 = puVar8;
    if (1 < (longlong)uVar4) {
      uVar1 = *puVar8;
      if ((uVar1 & 0xffffffdf) - 0x3a0041 < 0x1a) {
        puVar14 = puVar8 + 1;
      }
      else if (((short)uVar1 == 0x5c) || ((uVar1 & 0xffff) == 0x2f)) {
        uVar12 = uVar1 >> 0x10;
        sVar11 = (short)(uVar1 >> 0x10);
        if (uVar4 < 4) {
          if (uVar4 != 2) goto LAB_7ff70ca01106;
        }
        else if (((*(short *)((longlong)puVar8 + 6) == 0x5c) ||
                 (*(short *)((longlong)puVar8 + 6) == 0x2f)) &&
                ((uVar4 == 4 || (((short)puVar8[2] != 0x2f && ((short)puVar8[2] != 0x5c)))))) {
          puVar19 = (uint *)((longlong)puVar8 + 6);
          puVar14 = puVar19;
          if ((sVar11 == 0x2f) || (uVar12 == 0x5c)) {
            sVar13 = (short)puVar8[1];
            if ((sVar13 != 0x2e) && (sVar13 != 0x3f)) {
              if (uVar12 == 0x3f) goto LAB_7ff70ca01176;
              goto LAB_7ff70ca01106;
            }
          }
          else {
            puVar14 = puVar8;
            if (uVar12 == 0x3f) {
              sVar13 = (short)puVar8[1];
LAB_7ff70ca01176:
              puVar14 = puVar19;
              if (sVar13 != 0x3f) {
                puVar14 = puVar8;
              }
            }
          }
        }
        else {
LAB_7ff70ca01106:
          if ((((sVar11 == 0x5c) || (puVar14 = puVar8, uVar12 == 0x2f)) &&
              (puVar14 = puVar8, (short)puVar8[1] != 0x2f)) &&
             (((short)puVar8[1] != 0x5c &&
              (puVar19 = (uint *)((longlong)puVar8 + 6), puVar14 = puVar19, uVar4 != 3)))) {
            lVar7 = uVar4 * 2 + -6;
            do {
              puVar14 = puVar19;
              if (((short)*puVar19 == 0x2f) || ((short)*puVar19 == 0x5c)) break;
              puVar19 = (uint *)((longlong)puVar19 + 2);
              lVar7 = lVar7 + -2;
              puVar14 = puVar9;
            } while (lVar7 != 0);
          }
        }
      }
    }
    puVar16 = (uint *)((longlong)puVar5 + uVar10 * 2);
    puVar19 = puVar5;
    if (1 < (longlong)uVar10) {
      uVar1 = *puVar5;
      if ((uVar1 & 0xffffffdf) - 0x3a0041 < 0x1a) {
        puVar17 = puVar5 + 1;
LAB_7ff70ca011f9:
        uVar18 = (longlong)puVar17 - (longlong)puVar5 >> 1;
        uVar15 = (longlong)puVar14 - (longlong)puVar8 >> 1;
        uVar10 = uVar15;
        if (uVar18 < uVar15) {
          uVar10 = uVar18;
        }
        puStack_60 = puVar17;
        puStack_58 = puVar9;
        puStack_50 = puVar16;
        uVar6 = thunk_FUN_7ff70caa69e0(puVar8,puVar5,uVar10);
        if ((uVar15 != uVar18) ||
           (puVar9 = puStack_58, puVar16 = puStack_50, puVar19 = puStack_60, uVar6 != uVar10))
        goto LAB_7ff70ca00fd1;
      }
      else if (((short)uVar1 == 0x5c) || ((uVar1 & 0xffff) == 0x2f)) {
        uVar12 = uVar1 >> 0x10;
        sVar11 = (short)(uVar1 >> 0x10);
        if (uVar10 < 4) {
          if (uVar10 != 2) goto LAB_7ff70ca013e6;
        }
        else if (((*(short *)((longlong)puVar5 + 6) == 0x5c) ||
                 (*(short *)((longlong)puVar5 + 6) == 0x2f)) &&
                ((uVar10 == 4 || (((short)puVar5[2] != 0x2f && ((short)puVar5[2] != 0x5c)))))) {
          puVar17 = (uint *)((longlong)puVar5 + 6);
          if ((sVar11 == 0x2f) || (uVar12 == 0x5c)) {
            sVar13 = (short)puVar5[1];
            if ((sVar13 == 0x2e) || (sVar13 == 0x3f)) goto LAB_7ff70ca011f9;
            if (uVar12 != 0x3f) goto LAB_7ff70ca013e6;
          }
          else {
            if (uVar12 != 0x3f) goto LAB_7ff70ca0118f;
            sVar13 = (short)puVar5[1];
          }
          puVar19 = puVar17;
          if (sVar13 != 0x3f) {
            puVar19 = puVar5;
          }
LAB_7ff70ca01477:
          puVar17 = puVar19;
          if (puVar5 != puVar19) goto LAB_7ff70ca011f9;
        }
        else {
LAB_7ff70ca013e6:
          if ((((sVar11 == 0x5c) || (uVar12 == 0x2f)) && ((short)puVar5[1] != 0x2f)) &&
             ((short)puVar5[1] != 0x5c)) {
            puVar19 = (uint *)((longlong)puVar5 + 6);
            puVar17 = puVar19;
            if (uVar10 != 3) {
              lVar7 = uVar10 * 2 + -6;
              do {
                if (((short)*puVar19 == 0x2f) || ((short)*puVar19 == 0x5c)) goto LAB_7ff70ca01477;
                puVar19 = (uint *)((longlong)puVar19 + 2);
                lVar7 = lVar7 + -2;
                puVar17 = puVar16;
              } while (lVar7 != 0);
            }
            goto LAB_7ff70ca011f9;
          }
        }
      }
    }
LAB_7ff70ca0118f:
    if ((puVar19 == puVar16) || (((short)*puVar19 != 0x5c && ((short)*puVar19 != 0x2f)))) {
      if (puVar14 == puVar9) {
        if (4 < (longlong)(uVar4 * 2)) goto LAB_7ff70ca01315;
      }
      else if ((*(short *)((longlong)puVar9 + -2) != 0x2f) &&
              (*(short *)((longlong)puVar9 + -2) != 0x5c)) {
LAB_7ff70ca01315:
        uVar4 = *(ulonglong *)(param_1 + 4);
        if (uVar4 < *(ulonglong *)(param_1 + 6)) {
          *(ulonglong *)(param_1 + 4) = uVar4 + 1;
          puVar8 = param_1;
          if (7 < *(ulonglong *)(param_1 + 6)) {
            puVar8 = *(uint **)param_1;
          }
          *(short *)((longlong)puVar8 + uVar4 * 2) = 0x5c;
          *(undefined2 *)((longlong)puVar8 + uVar4 * 2 + 2) = 0;
        }
        else {
          FUN_7ff70ca01bd0(param_1,1);
        }
      }
    }
    else {
      uVar4 = (longlong)puVar14 - (longlong)puVar8 >> 1;
      if (*(ulonglong *)(param_1 + 4) < uVar4) goto LAB_7ff70ca01492;
      *(ulonglong *)(param_1 + 4) = uVar4;
      puVar5 = param_1;
      if (7 < *(ulonglong *)(param_1 + 6)) {
        puVar5 = *(uint **)param_1;
      }
      *(undefined2 *)((longlong)puVar5 + ((longlong)puVar14 - (longlong)puVar8)) = 0;
    }
    uVar4 = (longlong)puVar16 - (longlong)puVar19 >> 1;
    lVar7 = *(longlong *)(param_1 + 4);
    if (*(ulonglong *)(param_1 + 6) - lVar7 < uVar4) {
      uStack_68 = uVar4;
      FUN_7ff70ca01e20(param_1,uVar4);
    }
    else {
      *(ulonglong *)(param_1 + 4) = uVar4 + lVar7;
      puVar8 = param_1;
      if (7 < *(ulonglong *)(param_1 + 6)) {
        puVar8 = *(uint **)param_1;
      }
      FUN_7ff70cb12b70((short *)((longlong)puVar8 + lVar7 * 2),puVar19,
                       (longlong)puVar16 - (longlong)puVar19);
      *(short *)((longlong)puVar8 + (uVar4 + lVar7) * 2) = 0;
    }
  }
  else {
LAB_7ff70ca00fd1:
    if (param_1 != param_2) {
      uVar4 = *(ulonglong *)(param_2 + 4);
      if (7 < *(ulonglong *)(param_2 + 6)) {
        param_2 = *(uint **)param_2;
      }
      if (*(ulonglong *)(param_1 + 6) < uVar4) {
        FUN_7ff70ca019a0(param_1,uVar4);
      }
      else {
        puVar8 = param_1;
        if (7 < *(ulonglong *)(param_1 + 6)) {
          puVar8 = *(uint **)param_1;
        }
        *(ulonglong *)(param_1 + 4) = uVar4;
        FUN_7ff70cb12b70(puVar8,param_2,uVar4 * 2);
        *(short *)((longlong)puVar8 + uVar4 * 2) = 0;
      }
    }
  }
  if (_DAT_7ff70cbebd80 == (uStack_48 ^ (ulonglong)auStack_88)) {
    return param_1;
  }
  FUN_7ff70caa97e0(uStack_48 ^ (ulonglong)auStack_88);
LAB_7ff70ca01492:
  FUN_7ff70ca01bb0();
  pcVar2 = (code *)swi(3);
  puVar8 = (uint *)(*pcVar2)();
  return puVar8;
}


