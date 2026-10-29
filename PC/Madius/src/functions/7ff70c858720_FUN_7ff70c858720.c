/* 7ff70c858720 FUN_7ff70c858720 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c858720(undefined8 param_1,longlong param_2)

{
  int *piVar1;
  char cVar2;
  code *pcVar3;
  longlong lVar4;
  char *pcVar5;
  char *pcVar6;
  undefined1 *puVar7;
  longlong lVar8;
  uint uVar9;
  char *pcVar10;
  char *pcVar11;
  short sVar12;
  longlong lVar13;
  int iVar14;
  char *pcVar15;
  int iVar16;
  longlong lVar17;
  int iVar18;
  longlong lVar19;
  char *pcVar20;
  longlong lVar21;
  undefined1 auStack_88 [40];
  char *pcStack_60;
  longlong lStack_58;
  undefined8 uStack_50;
  ulonglong uStack_48;
  
  lVar4 = _DAT_7ff70cc1a3c0;
  uStack_48 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_88;
  if (param_2 == 0) {
    param_2 = FUN_7ff70cb12e80(param_1);
    iVar16 = (int)param_2 + 1;
    iVar14 = *(int *)(lVar4 + 0x267c);
    if (iVar14 <= (int)param_2) goto LAB_7ff70c858788;
  }
  else {
    iVar16 = (int)param_2 + 1;
    iVar14 = *(int *)(_DAT_7ff70cc1a3c0 + 0x267c);
    if (iVar14 <= (int)param_2) {
LAB_7ff70c858788:
      if (iVar14 == 0) {
        iVar14 = 8;
      }
      else {
        iVar14 = iVar14 / 2 + iVar14;
      }
      if (iVar14 <= iVar16) {
        iVar14 = iVar16;
      }
      pcVar5 = (char *)(*_DAT_7ff70cbe9460)((longlong)iVar14,_DAT_7ff70cc1a3d0);
      lVar21 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 == 0) {
LAB_7ff70c8587fb:
        lVar21 = *(longlong *)(lVar4 + 0x2680);
      }
      else {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        sVar12 = *(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + (longlong)sVar12 * 8) == *piVar1) {
          lVar17 = _DAT_7ff70cc1a3c0 + (longlong)sVar12 * 8 + 0x2874;
        }
        else {
          lVar17 = _DAT_7ff70cc1a3c0 + 0x2874;
          iVar18 = (sVar12 + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar18;
          lVar8 = (longlong)iVar18;
          lVar17 = lVar17 + lVar8 * 8;
          *(int *)(lVar21 + 0x2874 + lVar8 * 8) = *piVar1;
          *(undefined4 *)(lVar21 + 0x2878 + lVar8 * 8) = 0;
        }
        if (iVar14 != -1) {
          *(short *)(lVar17 + 4) = *(short *)(lVar17 + 4) + 1;
          *(int *)(lVar21 + 0x2868) = *(int *)(lVar21 + 0x2868) + 1;
          goto LAB_7ff70c8587fb;
        }
        *(short *)(lVar17 + 6) = *(short *)(lVar17 + 6) + 1;
        *(int *)(lVar21 + 0x286c) = *(int *)(lVar21 + 0x286c) + 1;
        lVar21 = *(longlong *)(lVar4 + 0x2680);
      }
      if (lVar21 != 0) {
        FUN_7ff70cb12b60(pcVar5,lVar21,(longlong)*(int *)(lVar4 + 0x2678));
        lVar17 = _DAT_7ff70cc1a3c0;
        lVar21 = *(longlong *)(lVar4 + 0x2680);
        if ((lVar21 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar8 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar8 * 8) == *piVar1) {
            sVar12 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar8 * 8) + 1;
          }
          else {
            iVar18 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar18;
            lVar8 = (longlong)iVar18;
            *(int *)(lVar17 + 0x2874 + lVar8 * 8) = *piVar1;
            *(undefined4 *)(lVar17 + 0x2878 + lVar8 * 8) = 0;
            sVar12 = 1;
          }
          *(short *)(lVar17 + 0x287a + lVar8 * 8) = sVar12;
          *(int *)(lVar17 + 0x286c) = *(int *)(lVar17 + 0x286c) + 1;
        }
        (*_DAT_7ff70cbe9468)(lVar21,_DAT_7ff70cc1a3d0);
      }
      *(char **)(lVar4 + 0x2680) = pcVar5;
      *(int *)(lVar4 + 0x267c) = iVar14;
      goto LAB_7ff70c858949;
    }
  }
  pcVar5 = *(char **)(lVar4 + 0x2680);
LAB_7ff70c858949:
  *(int *)(lVar4 + 0x2678) = iVar16;
  FUN_7ff70cb12b60(pcVar5,param_1,param_2);
  pcVar5[param_2] = '\0';
  pcStack_60 = pcVar5;
  if ((longlong)*(int *)(lVar4 + 0x2688) != 0) {
    lVar21 = *(longlong *)(lVar4 + 0x2690);
    lVar17 = (longlong)*(int *)(lVar4 + 0x2688) * 0x48;
    do {
      if (*(code **)(lVar21 + 0x18) != (code *)0x0) {
        (**(code **)(lVar21 + 0x18))(lVar4,lVar21);
      }
      lVar21 = lVar21 + 0x48;
      lVar17 = lVar17 + -0x48;
    } while (lVar17 != 0);
  }
  lStack_58 = param_2;
  uStack_50 = param_1;
  if (param_2 == 0) {
LAB_7ff70c858bb3:
    *(undefined1 *)(lVar4 + 0x2670) = 1;
    FUN_7ff70cb12b60(pcStack_60,uStack_50,lStack_58);
    if ((longlong)*(int *)(lVar4 + 0x2688) != 0) {
      lVar21 = *(longlong *)(lVar4 + 0x2690);
      lVar17 = (longlong)*(int *)(lVar4 + 0x2688) * 0x48;
      do {
        if (*(code **)(lVar21 + 0x30) != (code *)0x0) {
          (**(code **)(lVar21 + 0x30))(lVar4,lVar21);
        }
        lVar21 = lVar21 + 0x48;
        lVar17 = lVar17 + -0x48;
      } while (lVar17 != 0);
    }
    if (_DAT_7ff70cbebd80 == (uStack_48 ^ (ulonglong)auStack_88)) {
      return;
    }
    FUN_7ff70caa97e0(uStack_48 ^ (ulonglong)auStack_88);
    pcVar3 = (code *)swi(3);
    (*pcVar3)();
    return;
  }
  pcVar5 = pcStack_60 + param_2;
  lVar21 = 0;
  lVar17 = 0;
  pcVar20 = pcStack_60;
LAB_7ff70c8589fc:
  pcVar6 = pcVar20 + 2;
  pcVar15 = pcVar20 + 3;
  pcVar10 = pcVar20;
  while( true ) {
    pcVar10 = pcVar10 + 1;
    cVar2 = *pcVar20;
    if ((cVar2 != '\n') && (cVar2 != '\r')) break;
    pcVar20 = pcVar20 + 1;
    pcVar6 = pcVar6 + 1;
    pcVar15 = pcVar15 + 1;
  }
  pcVar11 = pcVar20;
  if (pcVar20 < pcVar5) {
    while ((pcVar11 = pcVar10, cVar2 != '\n' && (cVar2 != '\r'))) {
      if (pcVar5 <= pcVar11) goto LAB_7ff70c858a63;
      pcVar10 = pcVar11 + 1;
      cVar2 = *pcVar11;
    }
    pcVar11 = pcVar11 + -1;
  }
LAB_7ff70c858a63:
  *pcVar11 = '\0';
  if (*pcVar20 != ';') {
    if (((*pcVar20 == '[') && (pcVar20 < pcVar11)) && (pcVar11[-1] == ']')) {
      pcVar11[-1] = '\0';
      puVar7 = (undefined1 *)FUN_7ff70cb12b40(pcVar20 + 1,0x5d,(longlong)pcVar11 - (longlong)pcVar6)
      ;
      if ((puVar7 != (undefined1 *)0x0) &&
         (lVar8 = FUN_7ff70cb12b40(puVar7 + 1,0x5b,pcVar11 + (-1 - (longlong)(puVar7 + 1))),
         lVar8 != 0)) {
        *puVar7 = 0;
        uVar9 = 0xffffffff;
        do {
          cVar2 = pcVar15[-2];
          if (cVar2 == '#') {
            if ((pcVar15[-1] == '#') && (*pcVar15 == '#')) {
              uVar9 = 0xffffffff;
            }
          }
          else if (cVar2 == '\0') goto LAB_7ff70c858b45;
          uVar9 = crc32(uVar9,cVar2);
          pcVar15 = pcVar15 + 1;
        } while( true );
      }
    }
    else if ((lVar17 != 0) && (lVar21 != 0)) {
      (**(code **)(lVar17 + 0x28))(lVar4,lVar17,lVar21);
    }
  }
  goto LAB_7ff70c8589f0;
LAB_7ff70c858b45:
  if ((longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x2688) == 0) {
    lVar17 = 0;
    lVar21 = 0;
  }
  else {
    lVar13 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x2688) * 0x48;
    lVar19 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x2690);
    do {
      lVar17 = lVar19;
      if ((*(uint *)(lVar17 + 8) ^ uVar9) == 0xffffffff) {
        lVar21 = (**(code **)(lVar17 + 0x20))(lVar4,lVar17,lVar8 + 1);
        break;
      }
      lVar19 = lVar17 + 0x48;
      lVar17 = 0;
      lVar21 = 0;
      lVar13 = lVar13 + -0x48;
    } while (lVar13 != 0);
  }
LAB_7ff70c8589f0:
  pcVar20 = pcVar11 + 1;
  if (pcVar5 <= pcVar20) goto LAB_7ff70c858bb3;
  goto LAB_7ff70c8589fc;
}


