/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00960580
 */

/* WARNING: Removing unreachable block (ram,0x00960a30) */
/* WARNING: Removing unreachable block (ram,0x00960684) */

int FUN_00960580(char *param_1,long *param_2,long *param_3,char *param_4)

{
  long lVar1;
  bool bVar2;
  bool bVar3;
  bool bVar4;
  bool bVar5;
  bool bVar6;
  bool bVar7;
  int iVar8;
  int iVar9;
  FILE *__stream;
  char *pcVar10;
  char *pcVar11;
  char cVar12;
  bool bVar13;
  char *pcVar14;
  char *pcVar15;
  char *pcVar16;
  int iVar17;
  undefined1 auStack_88 [32];
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  pcVar15 = (char *)*param_2;
  pcVar14 = (char *)*param_3;
  if (pcVar15 == (char *)0x0) {
    bVar6 = false;
  }
  else {
    bVar6 = *pcVar15 != '\0';
  }
  __stream = fopen(param_4,"r");
  if (__stream == (FILE *)0x0) {
    iVar17 = 1;
    iVar9 = 0;
  }
  else {
    FUN_00904528(auStack_88,0x1000);
    bVar3 = false;
    iVar9 = 0;
    iVar17 = 1;
    bVar2 = false;
    bVar5 = false;
    bVar4 = false;
    bVar7 = true;
    while (iVar8 = FUN_009049b8(auStack_88,__stream), iVar8 != 0) {
      pcVar10 = (char *)FUN_00904974(auStack_88);
      if (iVar9 == 3) {
        if (*pcVar10 == '\n') {
          iVar9 = 0;
          goto LAB_009606b8;
        }
        iVar9 = 0;
        if (*pcVar10 == '\r') goto LAB_009606b8;
        iVar9 = 3;
      }
      else {
        if (pcVar10 != (char *)0x0) {
LAB_009606b8:
          pcVar16 = pcVar10 + 2;
          do {
            cVar12 = *pcVar10;
            pcVar11 = pcVar10;
            switch(cVar12) {
            case '\0':
            case '#':
              goto switchD_009606dc_caseD_0;
            default:
              goto switchD_009606dc_caseD_1;
            case '\t':
            case ' ':
              pcVar10 = pcVar10 + 1;
              pcVar16 = pcVar16 + 1;
              break;
            case '\"':
              cVar12 = pcVar10[1];
              if (cVar12 == '\0') goto LAB_00960ab0;
              bVar13 = false;
              goto LAB_009606f0;
            }
          } while( true );
        }
switchD_009606dc_caseD_0:
      }
    }
LAB_00960a3c:
    FUN_00904534(auStack_88);
    if (iVar17 == 0) {
      if (bVar4) {
        if (*param_2 != 0) {
          (*(code *)PTR_free_00cc4678)();
        }
        *param_2 = (long)pcVar15;
      }
      iVar17 = 0;
      if (bVar5) {
        if (*param_3 != 0) {
          (*(code *)PTR_free_00cc4678)();
        }
        iVar17 = 0;
        *param_3 = (long)pcVar14;
      }
    }
    else {
LAB_00960ac0:
      if (bVar4) {
        (*(code *)PTR_free_00cc4678)(pcVar15);
      }
      if (bVar5) {
LAB_00960ae4:
        (*(code *)PTR_free_00cc4678)(pcVar14);
      }
    }
LAB_00960af8:
    iVar9 = fclose(__stream);
  }
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(iVar9);
  }
  return iVar17;
LAB_009606f0:
  if (bVar13) {
    if (cVar12 == 't') {
      cVar12 = '\t';
    }
    else if (cVar12 == 'r') {
      cVar12 = '\r';
    }
    else if (cVar12 == 'n') {
      cVar12 = '\n';
    }
LAB_0096074c:
    bVar13 = false;
    *pcVar11 = cVar12;
    cVar12 = *pcVar16;
    pcVar11 = pcVar11 + 1;
  }
  else {
    if (cVar12 != '\\') {
      if (cVar12 != '\"') goto LAB_0096074c;
      goto LAB_00960794;
    }
    bVar13 = true;
    cVar12 = *pcVar16;
  }
  pcVar16 = pcVar16 + 1;
  if (cVar12 == '\0') goto LAB_00960ab0;
  goto LAB_009606f0;
LAB_00960ab0:
  *pcVar11 = '\0';
  FUN_00904534(auStack_88);
  iVar17 = -1;
  goto LAB_00960ac0;
switchD_009606dc_caseD_1:
  while (((cVar12 != '\t' && (cVar12 != ' ')) && (3 < (byte)(cVar12 - 10U)))) {
    pcVar11 = pcVar11 + 1;
    cVar12 = *pcVar11;
  }
  pcVar16 = pcVar11;
LAB_00960794:
  *pcVar11 = '\0';
  if (((pcVar15 != (char *)0x0) && (pcVar14 != (char *)0x0)) &&
     ((*pcVar15 != '\0' && (*pcVar14 != '\0')))) goto LAB_00960a3c;
  switch(iVar9) {
  case 0:
    iVar9 = curl_strequal("macdef",pcVar10);
    if (iVar9 != 0) {
      iVar9 = 3;
      pcVar10 = pcVar16 + 1;
      goto LAB_009606b8;
    }
    iVar9 = curl_strequal("machine",pcVar10);
    if (iVar9 != 0) {
      iVar9 = 1;
      pcVar10 = pcVar16 + 1;
      goto LAB_009606b8;
    }
    pcVar11 = "default";
    break;
  case 1:
    pcVar11 = param_1;
    break;
  case 2:
    if (bVar2) {
      if (bVar6) {
        iVar9 = FUN_009418b0(pcVar15,pcVar10);
        bVar7 = iVar9 == 0;
        bVar2 = false;
        iVar9 = 2;
        pcVar10 = pcVar16 + 1;
      }
      else if ((pcVar15 == (char *)0x0) || (iVar9 = FUN_009418b0(pcVar15,pcVar10), iVar9 != 0)) {
        if (bVar4) {
          (*(code *)PTR_free_00cc4678)(pcVar15);
        }
        pcVar15 = (char *)(*(code *)PTR_strdup_00cc4688)(pcVar10);
        if (pcVar15 == (char *)0x0) {
          FUN_00904534(auStack_88);
          iVar17 = -1;
          if (bVar5) goto LAB_00960ae4;
          goto LAB_00960af8;
        }
        bVar2 = false;
        iVar9 = 2;
        bVar4 = true;
        pcVar10 = pcVar16 + 1;
      }
      else {
        bVar2 = false;
        iVar9 = 2;
        pcVar10 = pcVar16 + 1;
      }
      goto LAB_009606b8;
    }
    if (bVar3) {
      if ((bool)(!bVar7 & bVar6)) {
        bVar2 = false;
        bVar3 = false;
        bVar7 = false;
        iVar9 = 2;
        pcVar10 = pcVar16 + 1;
      }
      else if ((pcVar14 == (char *)0x0) || (iVar9 = FUN_009418b0(pcVar14,pcVar10), iVar9 != 0)) {
        if (bVar5) {
          (*(code *)PTR_free_00cc4678)(pcVar14);
        }
        pcVar14 = (char *)(*(code *)PTR_strdup_00cc4688)(pcVar10);
        if (pcVar14 == (char *)0x0) {
          FUN_00904534(auStack_88);
          if (bVar4) {
            (*(code *)PTR_free_00cc4678)(pcVar15);
          }
          iVar17 = -1;
          goto LAB_00960af8;
        }
        bVar3 = false;
        iVar9 = 2;
        bVar2 = false;
        bVar5 = true;
        pcVar10 = pcVar16 + 1;
      }
      else {
        bVar2 = false;
        bVar3 = false;
        iVar9 = 2;
        pcVar10 = pcVar16 + 1;
      }
      goto LAB_009606b8;
    }
    iVar9 = curl_strequal("login",pcVar10);
    if (iVar9 != 0) {
      bVar3 = false;
      bVar2 = true;
      iVar9 = 2;
      pcVar10 = pcVar16 + 1;
      goto LAB_009606b8;
    }
    iVar9 = curl_strequal("password",pcVar10);
    if (iVar9 != 0) {
      bVar2 = false;
      bVar3 = true;
      iVar9 = 2;
      pcVar10 = pcVar16 + 1;
      goto LAB_009606b8;
    }
    iVar8 = curl_strequal("machine",pcVar10);
    iVar9 = 1;
    if (iVar8 == 0) {
      iVar9 = 2;
    }
    bVar2 = false;
    bVar3 = false;
    if (iVar8 != 0) {
      bVar7 = false;
    }
  default:
    pcVar10 = pcVar16 + 1;
    goto LAB_009606b8;
  case 3:
    cVar12 = *pcVar10;
    pcVar10 = pcVar16 + 1;
    iVar9 = 0;
    if (cVar12 != '\0') {
      iVar9 = 3;
    }
    goto LAB_009606b8;
  }
  iVar8 = curl_strequal(pcVar11,pcVar10);
  iVar9 = 0;
  if (iVar8 != 0) {
    iVar9 = 2;
    iVar17 = 0;
  }
  pcVar10 = pcVar16 + 1;
  goto LAB_009606b8;
}

