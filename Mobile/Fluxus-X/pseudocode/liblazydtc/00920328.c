/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00920328
 */

/* WARNING: Type propagation algorithm not settling */

int curl_formadd(long *param_1,long *param_2)

{
  long lVar1;
  long lVar2;
  long lVar3;
  ulong uVar4;
  long lVar5;
  char cVar6;
  long lVar7;
  bool bVar8;
  bool bVar9;
  long *plVar10;
  long *plVar11;
  char *pcVar12;
  long lVar13;
  long lVar14;
  size_t sVar15;
  int iVar16;
  uint uVar17;
  long lVar18;
  ulong uVar19;
  long lVar20;
  long lVar21;
  long *plVar22;
  long *plVar23;
  int iVar24;
  int *piVar25;
  long *plVar26;
  int iVar27;
  long lVar28;
  char *pcVar29;
  char *pcVar30;
  int iVar31;
  long alStack_490 [128];
  
  lVar7 = tpidr_el0;
  lVar21 = *(long *)(lVar7 + 0x28);
  iVar31 = -0x30;
  plVar10 = (long *)(*(code *)PTR_calloc_00cc4690)(1,0x68);
  if (plVar10 != (long *)0x0) {
    lVar28 = 0;
    piVar25 = (int *)0x0;
    plVar23 = plVar10;
    plVar26 = (long *)register0x00000008;
    iVar27 = 0;
    bVar9 = false;
switchD_009204a0_caseD_9:
    iVar24 = 3;
    do {
      if (iVar27 != 0) {
        plVar26 = plVar10;
        do {
          if ((char)plVar26[0xc] != '\0') {
            (*(code *)PTR_free_00cc4678)(*plVar26);
            *plVar26 = 0;
            *(undefined1 *)(plVar26 + 0xc) = 0;
          }
          if (*(char *)((long)plVar26 + 0x61) != '\0') {
            (*(code *)PTR_free_00cc4678)(plVar26[2]);
            plVar26[2] = 0;
            *(undefined1 *)((long)plVar26 + 0x61) = 0;
          }
          if (*(char *)((long)plVar26 + 0x62) != '\0') {
            (*(code *)PTR_free_00cc4678)(plVar26[4]);
            plVar26[4] = 0;
            *(undefined1 *)((long)plVar26 + 0x62) = 0;
          }
          if (*(char *)((long)plVar26 + 99) != '\0') {
            (*(code *)PTR_free_00cc4678)(plVar26[8]);
            plVar26[8] = 0;
            *(undefined1 *)((long)plVar26 + 99) = 0;
          }
          plVar26 = (long *)plVar26[0xb];
        } while (plVar26 != (long *)0x0);
        goto LAB_00920d1c;
      }
      plVar11 = plVar26;
      if ((bool)(piVar25 == (int *)0x0 | bVar9 ^ 1U)) {
        if (iVar31 < 0) {
          iVar27 = iVar31 + 8;
          if (0 < iVar27) goto LAB_00920468;
          plVar26 = (long *)((long)alStack_490 + (long)iVar31 + 0x400);
          iVar31 = iVar27;
        }
        else {
          iVar27 = iVar31;
LAB_00920468:
          plVar11 = plVar26 + 1;
          iVar31 = iVar27;
        }
        iVar16 = (int)*plVar26;
        if (iVar16 != 0x11) goto LAB_00920480;
        pcVar30 = (char *)0x0;
        plVar26 = plVar10;
        lVar28 = 0;
        goto LAB_00920d7c;
      }
      iVar16 = *piVar25;
      lVar28 = *(long *)(piVar25 + 2);
      bVar9 = false;
      iVar27 = 0;
      piVar25 = piVar25 + 4;
    } while (iVar16 == 0x11);
    bVar9 = true;
LAB_00920480:
    plVar26 = plVar11;
    iVar27 = 4;
    lVar13 = lVar28;
    switch(iVar16) {
    case 1:
      goto switchD_009204a0_caseD_1;
    case 2:
      plVar23[5] = plVar23[5] | 4;
switchD_009204a0_caseD_1:
      iVar27 = 2;
      if (*plVar23 == 0) {
        if (bVar9) {
        }
        else {
          if (iVar31 < 0) {
            iVar27 = iVar31 + 8;
            if (0 < iVar27) goto LAB_00920828;
            plVar11 = (long *)((long)alStack_490 + (long)iVar31 + 0x400);
            iVar31 = iVar27;
          }
          else {
            iVar27 = iVar31;
LAB_00920828:
            plVar26 = plVar11 + 1;
            iVar31 = iVar27;
          }
          lVar13 = *plVar11;
        }
        iVar27 = 3;
        if (lVar13 != 0) {
          iVar27 = 0;
          *plVar23 = lVar13;
        }
      }
      goto switchD_009204a0_caseD_9;
    case 3:
      iVar27 = 2;
      if (plVar23[1] == 0) {
        if (bVar9) {
        }
        else {
          if (iVar31 < 0) {
            iVar27 = iVar31 + 8;
            if (0 < iVar27) goto LAB_00920aac;
            plVar11 = (long *)((long)alStack_490 + (long)iVar31 + 0x400);
            iVar31 = iVar27;
          }
          else {
            iVar27 = iVar31;
LAB_00920aac:
            plVar26 = plVar11 + 1;
            iVar31 = iVar27;
          }
          lVar13 = *plVar11;
        }
        iVar27 = 0;
        plVar23[1] = lVar13;
      }
      goto switchD_009204a0_caseD_9;
    case 4:
      goto switchD_009204a0_caseD_4;
    case 5:
      plVar23[5] = plVar23[5] | 8;
switchD_009204a0_caseD_4:
      iVar27 = 2;
      if (plVar23[2] != 0) goto switchD_009204a0_caseD_9;
      if (!bVar9) {
        if (iVar31 < 0) {
          iVar27 = iVar31 + 8;
          if (0 < iVar27) goto LAB_00920860;
          plVar11 = (long *)((long)alStack_490 + (long)iVar31 + 0x400);
          iVar31 = iVar27;
        }
        else {
          iVar27 = iVar31;
LAB_00920860:
          plVar26 = plVar11 + 1;
          iVar31 = iVar27;
        }
        lVar13 = *plVar11;
      }
      iVar27 = 3;
      if (lVar13 == 0) goto switchD_009204a0_caseD_9;
      break;
    case 6:
      if (!bVar9) goto LAB_009206cc;
LAB_00920598:
      goto LAB_00920408;
    case 7:
      iVar27 = 2;
      if ((*(byte *)(plVar23 + 5) & 10) == 0) {
        if (bVar9) {
        }
        else {
          if (iVar31 < 0) {
            iVar27 = iVar31 + 8;
            if (0 < iVar27) goto LAB_00920b0c;
            plVar11 = (long *)((long)alStack_490 + (long)iVar31 + 0x400);
            iVar31 = iVar27;
          }
          else {
            iVar27 = iVar31;
LAB_00920b0c:
            plVar26 = plVar11 + 1;
            iVar31 = iVar27;
          }
          lVar13 = *plVar11;
        }
        iVar27 = 3;
        if (lVar13 != 0) {
          lVar13 = (*(code *)PTR_strdup_00cc4688)();
          iVar27 = 1;
          plVar23[2] = lVar13;
          if (lVar13 != 0) {
            uVar19 = plVar23[5] | 2;
            goto LAB_00920b6c;
          }
        }
      }
      goto switchD_009204a0_caseD_9;
    case 8:
      bVar8 = !bVar9;
      iVar27 = 6;
      bVar9 = true;
      if (bVar8) {
        if (iVar31 < 0) {
          iVar27 = iVar31 + 8;
          if (0 < iVar27) goto LAB_009207fc;
          plVar11 = (long *)((long)alStack_490 + (long)iVar31 + 0x400);
          iVar31 = iVar27;
        }
        else {
          iVar27 = iVar31;
LAB_009207fc:
          plVar26 = plVar11 + 1;
          iVar31 = iVar27;
        }
        piVar25 = (int *)*plVar11;
        bVar9 = piVar25 != (int *)0x0;
        if (bVar9) {
          iVar24 = 0;
        }
        iVar27 = iVar24;
      }
    default:
      goto switchD_009204a0_caseD_9;
    case 10:
      if (bVar9) {
        lVar18 = plVar23[2];
      }
      else {
        if (iVar31 < 0) {
          iVar27 = iVar31 + 8;
          if (0 < iVar27) goto LAB_00920890;
          plVar11 = (long *)((long)alStack_490 + (long)iVar31 + 0x400);
        }
        else {
          iVar27 = iVar31;
LAB_00920890:
          plVar26 = plVar11 + 1;
        }
        lVar18 = plVar23[2];
        lVar13 = *plVar11;
        iVar31 = iVar27;
      }
      if (lVar18 == 0) {
        iVar27 = 3;
        if (lVar13 != 0) {
          lVar13 = (*(code *)PTR_strdup_00cc4688)();
          plVar23[2] = lVar13;
          iVar27 = 1;
          if (lVar13 != 0) {
            uVar19 = plVar23[5] | 1;
LAB_00920b6c:
            plVar23[5] = uVar19;
            *(undefined1 *)((long)plVar23 + 0x61) = 1;
            iVar27 = 0;
          }
        }
      }
      else {
        iVar27 = 2;
        if ((*(byte *)(plVar23 + 5) & 1) != 0) {
          iVar27 = 3;
          if (lVar13 != 0) {
            lVar13 = (*(code *)PTR_strdup_00cc4688)();
            iVar27 = 1;
            if (lVar13 != 0) {
              plVar11 = (long *)(*(code *)PTR_calloc_00cc4690)(1,0x68);
              if (plVar11 != (long *)0x0) {
                plVar11[2] = lVar13;
                plVar11[5] = 1;
                plVar11[0xb] = plVar23[0xb];
                plVar23[0xb] = (long)plVar11;
                *(undefined1 *)((long)plVar11 + 0x61) = 1;
                goto LAB_009209f4;
              }
LAB_00920c1c:
              (*(code *)PTR_free_00cc4678)(lVar13);
              iVar27 = 1;
            }
          }
        }
      }
      goto switchD_009204a0_caseD_9;
    case 0xb:
    case 0x10:
      if (bVar9) {
      }
      else {
        if (iVar31 < 0) {
          iVar27 = iVar31 + 8;
          if (0 < iVar27) goto LAB_00920720;
          plVar11 = (long *)((long)alStack_490 + (long)iVar31 + 0x400);
          iVar31 = iVar27;
        }
        else {
          iVar27 = iVar31;
LAB_00920720:
          plVar26 = plVar11 + 1;
          iVar31 = iVar27;
        }
        lVar13 = *plVar11;
      }
      iVar27 = 2;
      if (plVar23[8] == 0) {
        lVar13 = (*(code *)PTR_strdup_00cc4688)(lVar13);
        plVar23[8] = lVar13;
        iVar27 = 1;
        if (lVar13 != 0) {
          *(undefined1 *)((long)plVar23 + 99) = 1;
          iVar27 = 0;
        }
      }
      goto switchD_009204a0_caseD_9;
    case 0xc:
      plVar23[5] = plVar23[5] | 0x30;
      iVar27 = 2;
      if (plVar23[6] != 0) goto switchD_009204a0_caseD_9;
      if (!bVar9) {
        if (iVar31 < 0) {
          iVar27 = iVar31 + 8;
          if (0 < iVar27) goto LAB_00920b8c;
          plVar11 = (long *)((long)alStack_490 + (long)iVar31 + 0x400);
          iVar31 = iVar27;
        }
        else {
          iVar27 = iVar31;
LAB_00920b8c:
          plVar26 = plVar11 + 1;
          iVar31 = iVar27;
        }
        lVar13 = *plVar11;
      }
      iVar27 = 3;
      if (lVar13 == 0) goto switchD_009204a0_caseD_9;
      plVar23[6] = lVar13;
      break;
    case 0xd:
      iVar27 = 2;
      if (plVar23[7] == 0) {
        if (bVar9) {
        }
        else {
          if (iVar31 < 0) {
            iVar27 = iVar31 + 8;
            if (0 < iVar27) goto LAB_00920a80;
            plVar11 = (long *)((long)alStack_490 + (long)iVar31 + 0x400);
            iVar31 = iVar27;
          }
          else {
            iVar27 = iVar31;
LAB_00920a80:
            plVar26 = plVar11 + 1;
            iVar31 = iVar27;
          }
          lVar13 = *plVar11;
        }
        plVar23[7] = lVar13;
        iVar27 = 0;
      }
      goto switchD_009204a0_caseD_9;
    case 0xe:
      if (bVar9) {
        lVar18 = plVar23[4];
      }
      else {
        if (iVar31 < 0) {
          iVar27 = iVar31 + 8;
          if (0 < iVar27) goto LAB_0092094c;
          plVar11 = (long *)((long)alStack_490 + (long)iVar31 + 0x400);
        }
        else {
          iVar27 = iVar31;
LAB_0092094c:
          plVar26 = plVar11 + 1;
        }
        lVar18 = plVar23[4];
        lVar13 = *plVar11;
        iVar31 = iVar27;
      }
      if (lVar18 == 0) {
        iVar27 = 3;
        if (lVar13 != 0) {
          lVar13 = (*(code *)PTR_strdup_00cc4688)();
          plVar23[4] = lVar13;
          iVar27 = 1;
          if (lVar13 != 0) {
            *(undefined1 *)((long)plVar23 + 0x62) = 1;
            iVar27 = 0;
          }
        }
      }
      else {
        iVar27 = 2;
        if ((*(byte *)(plVar23 + 5) & 1) != 0) {
          iVar27 = 3;
          if (lVar13 != 0) {
            lVar13 = (*(code *)PTR_strdup_00cc4688)();
            iVar27 = 1;
            if (lVar13 != 0) {
              plVar11 = (long *)(*(code *)PTR_calloc_00cc4690)(1,0x68);
              if (plVar11 == (long *)0x0) goto LAB_00920c1c;
              plVar11[4] = lVar13;
              plVar11[5] = 1;
              plVar11[0xb] = plVar23[0xb];
              plVar23[0xb] = (long)plVar11;
              *(undefined1 *)((long)plVar11 + 0x62) = 1;
LAB_009209f4:
              plVar23 = plVar11;
              iVar27 = 0;
            }
          }
        }
      }
      goto switchD_009204a0_caseD_9;
    case 0xf:
      if (bVar9) {
      }
      else {
        if (iVar31 < 0) {
          iVar27 = iVar31 + 8;
          if (0 < iVar27) goto LAB_00920a24;
          plVar11 = (long *)((long)alStack_490 + (long)iVar31 + 0x400);
          iVar31 = iVar27;
        }
        else {
          iVar27 = iVar31;
LAB_00920a24:
          plVar26 = plVar11 + 1;
          iVar31 = iVar27;
        }
        lVar13 = *plVar11;
      }
      iVar27 = 2;
      if (plVar23[10] == 0) {
        plVar23[10] = lVar13;
        iVar27 = 0;
      }
      goto switchD_009204a0_caseD_9;
    case 0x13:
      plVar23[5] = plVar23[5] | 0x40;
      iVar27 = 2;
      if (plVar23[9] != 0) goto switchD_009204a0_caseD_9;
      if (!bVar9) {
        if (iVar31 < 0) {
          iVar27 = iVar31 + 8;
          if (0 < iVar27) goto LAB_00920ad8;
          plVar11 = (long *)((long)alStack_490 + (long)iVar31 + 0x400);
          iVar31 = iVar27;
        }
        else {
          iVar27 = iVar31;
LAB_00920ad8:
          plVar26 = plVar11 + 1;
          iVar31 = iVar27;
        }
        lVar13 = *plVar11;
      }
      iVar27 = 3;
      if (lVar13 == 0) goto switchD_009204a0_caseD_9;
      plVar23[9] = lVar13;
      break;
    case 0x14:
      plVar23[5] = plVar23[5] | 0x80;
      if (bVar9) goto LAB_00920598;
LAB_009206cc:
      if (iVar31 < 0) {
        iVar27 = iVar31 + 8;
        if (0 < iVar27) goto LAB_009207a0;
        plVar26 = (long *)((long)alStack_490 + (long)iVar31 + 0x400);
        plVar22 = plVar11;
        iVar31 = iVar27;
      }
      else {
        iVar27 = iVar31;
LAB_009207a0:
        plVar22 = plVar11 + 1;
        iVar31 = iVar27;
      }
      lVar13 = *plVar26;
      plVar11 = plVar22;
LAB_00920408:
      plVar23[3] = lVar13;
      plVar26 = plVar11;
      iVar27 = 0;
      goto switchD_009204a0_caseD_9;
    }
    plVar23[2] = lVar13;
    iVar27 = 0;
    goto switchD_009204a0_caseD_9;
  }
  iVar27 = 1;
  goto LAB_00920d38;
LAB_00921024:
  do {
    cVar6 = (char)plVar26[0xc];
joined_r0x009210e8:
    if (cVar6 != '\0') {
      (*(code *)PTR_free_00cc4678)(*plVar26);
      *plVar26 = 0;
      *(undefined1 *)(plVar26 + 0xc) = 0;
    }
    if (*(char *)((long)plVar26 + 0x61) != '\0') {
      (*(code *)PTR_free_00cc4678)(plVar26[2]);
      plVar26[2] = 0;
      *(undefined1 *)((long)plVar26 + 0x61) = 0;
    }
    if (*(char *)((long)plVar26 + 0x62) != '\0') {
      (*(code *)PTR_free_00cc4678)(plVar26[4]);
      plVar26[4] = 0;
      *(undefined1 *)((long)plVar26 + 0x62) = 0;
    }
    if (*(char *)((long)plVar26 + 99) != '\0') {
      (*(code *)PTR_free_00cc4678)(plVar26[8]);
      plVar26[8] = 0;
      *(undefined1 *)((long)plVar26 + 99) = 0;
    }
    plVar26 = (long *)plVar26[0xb];
joined_r0x009210c4:
  } while (plVar26 != (long *)0x0);
  goto LAB_00920d1c;
LAB_00920d7c:
  do {
    pcVar29 = (char *)*plVar26;
    if (pcVar29 == (char *)0x0) {
      if (lVar28 == 0) {
        iVar27 = 5;
        goto joined_r0x009210c4;
      }
    }
    else if ((lVar28 == 0) && (plVar26[2] == 0)) {
      iVar27 = 5;
      cVar6 = (char)plVar26[0xc];
      goto joined_r0x009210e8;
    }
    uVar19 = plVar26[5];
    iVar27 = 5;
    uVar17 = (uint)uVar19;
    if (((~uVar17 & 9) == 0) || ((plVar26[3] != 0 & uVar17) != 0)) goto LAB_00921024;
    iVar27 = 5;
    if (((~uVar17 & 10) == 0) || ((~uVar17 & 0x30) == 0 && plVar26[6] == 0)) goto LAB_00921024;
    if (((uVar19 & 0x11) != 0) && (plVar26[4] == 0)) {
      lVar13 = 0x10;
      if ((uVar19 & 0x10) != 0) {
        lVar13 = 0x40;
      }
      pcVar12 = (char *)FUN_009277e8(*(undefined8 *)((long)plVar26 + lVar13));
      pcVar29 = pcVar30;
      if (pcVar12 != (char *)0x0) {
        pcVar29 = pcVar12;
      }
      pcVar12 = "application/octet-stream";
      if (pcVar29 != (char *)0x0) {
        pcVar12 = pcVar29;
      }
      lVar13 = (*(code *)PTR_strdup_00cc4688)(pcVar12);
      plVar26[4] = lVar13;
      if (lVar13 != 0) {
        pcVar29 = (char *)*plVar26;
        *(undefined1 *)((long)plVar26 + 0x62) = 1;
        goto LAB_00920e58;
      }
LAB_009210a0:
      cVar6 = (char)plVar26[0xc];
joined_r0x009210e8:
      iVar27 = 1;
      goto joined_r0x009210e8;
    }
LAB_00920e58:
    if ((pcVar29 != (char *)0x0) && (plVar26[1] != 0)) {
      uVar19 = 0;
      do {
        if (pcVar29[uVar19] == '\0') {
          iVar27 = 3;
          goto joined_r0x009210c4;
        }
        uVar19 = uVar19 + 1;
      } while (uVar19 < (ulong)plVar26[1]);
    }
    uVar19 = plVar26[5];
    if ((plVar26 == plVar10) && (((uint)uVar19 >> 2 & 1) == 0)) {
      if (pcVar29 == (char *)0x0) {
        iVar27 = 1;
        plVar26 = plVar10;
        goto joined_r0x009210c4;
      }
      sVar15 = plVar10[1];
      if (sVar15 == 0) {
        sVar15 = strlen(pcVar29);
      }
      pcVar29 = (char *)FUN_00941948(pcVar29,sVar15);
      *plVar26 = (long)pcVar29;
      if (pcVar29 == (char *)0x0) {
        cVar6 = (char)plVar10[0xc];
        plVar26 = plVar10;
        goto joined_r0x009210e8;
      }
      *(undefined1 *)(plVar10 + 0xc) = 1;
      uVar19 = plVar26[5];
    }
    if ((uVar19 & 0x6b) == 0) {
      pcVar12 = (char *)plVar26[2];
      lVar13 = 0;
      if (pcVar12 != (char *)0x0) {
        lVar13 = plVar26[3];
        if (lVar13 == 0) {
          sVar15 = strlen(pcVar12);
          lVar13 = sVar15 + 1;
        }
        lVar13 = FUN_009418f0(pcVar12,lVar13);
        plVar26[2] = lVar13;
        if (lVar13 == 0) goto LAB_009210a0;
        pcVar29 = (char *)*plVar26;
        uVar19 = plVar26[5];
        *(undefined1 *)((long)plVar26 + 0x61) = 1;
      }
    }
    else {
      lVar13 = plVar26[2];
    }
    lVar18 = plVar26[3];
    lVar3 = plVar26[4];
    lVar1 = plVar26[6];
    uVar4 = plVar26[7];
    sVar15 = plVar26[1];
    lVar20 = plVar26[10];
    lVar2 = plVar26[8];
    lVar5 = plVar26[9];
    if ((pcVar29 != (char *)0x0) && (sVar15 == 0)) {
      sVar15 = strlen(pcVar29);
    }
    if ((long)(sVar15 | uVar4) < 0) goto LAB_009210a0;
    iVar27 = 1;
    lVar14 = (*(code *)PTR_calloc_00cc4690)(1,0x70);
    if (lVar14 == 0) goto LAB_00921024;
    *(char **)(lVar14 + 8) = pcVar29;
    *(size_t *)(lVar14 + 0x10) = sVar15;
    *(long *)(lVar14 + 0x18) = lVar13;
    *(long *)(lVar14 + 0x60) = lVar5;
    *(long *)(lVar14 + 0x28) = lVar1;
    *(ulong *)(lVar14 + 0x30) = uVar4;
    *(long *)(lVar14 + 0x68) = lVar18;
    *(long *)(lVar14 + 0x38) = lVar3;
    *(long *)(lVar14 + 0x40) = lVar20;
    *(ulong *)(lVar14 + 0x50) = uVar19 | 0x80;
    *(long *)(lVar14 + 0x58) = lVar2;
    if (lVar28 == 0) {
      plVar23 = param_1;
      if ((long *)*param_2 != (long *)0x0) {
        plVar23 = (long *)*param_2;
      }
      *plVar23 = lVar14;
      plVar23 = param_2;
    }
    else {
      *(long *)(lVar14 + 0x48) = *(long *)(lVar28 + 0x48);
      plVar23 = (long *)(lVar28 + 0x48);
    }
    *plVar23 = lVar14;
    plVar23 = plVar26 + 4;
    plVar26 = (long *)plVar26[0xb];
    iVar27 = 0;
    if ((char *)*plVar23 != (char *)0x0) {
      pcVar30 = (char *)*plVar23;
    }
    lVar28 = lVar14;
  } while (plVar26 != (long *)0x0);
LAB_00920d1c:
  do {
    plVar26 = (long *)plVar10[0xb];
    (*(code *)PTR_free_00cc4678)(plVar10);
    plVar10 = plVar26;
  } while (plVar26 != (long *)0x0);
LAB_00920d38:
  if (*(long *)(lVar7 + 0x28) != lVar21) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar27;
}

