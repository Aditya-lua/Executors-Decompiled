/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00933c1c
 */

void FUN_00933c1c(long param_1,long param_2)

{
  bool bVar1;
  ulong uVar2;
  byte bVar3;
  char cVar4;
  long lVar5;
  int iVar6;
  uint uVar7;
  long lVar8;
  ulong uVar9;
  char *pcVar10;
  size_t sVar11;
  ulong uVar12;
  char *pcVar13;
  byte *pbVar14;
  byte *__s1;
  char *pcVar15;
  size_t __n;
  char *local_60;
  long local_58;
  
  lVar5 = tpidr_el0;
  local_58 = *(long *)(lVar5 + 0x28);
  iVar6 = curl_strnequal(param_2,"CSeq:",5);
  if (iVar6 == 0) {
    iVar6 = curl_strnequal(param_2,"Session:",8);
    if (iVar6 == 0) {
      uVar9 = curl_strnequal(param_2,"Transport:",10);
      if ((int)uVar9 != 0) {
        pcVar15 = (char *)(param_2 + 10);
        pcVar13 = pcVar15;
        do {
          cVar4 = *pcVar13;
          if (cVar4 == '\0') goto LAB_00933f8c;
          pcVar13 = pcVar13 + 0xc;
          while ((cVar4 == ' ' || (cVar4 == '\t'))) {
            pcVar10 = pcVar13 + -0xb;
            pcVar13 = pcVar13 + 1;
            cVar4 = *pcVar10;
          }
          pcVar10 = strchr(pcVar13 + -0xc,0x3b);
          uVar9 = curl_strnequal(pcVar13 + -0xc,"interleaved=",0xc);
          if ((int)uVar9 != 0) {
            uVar9 = strtol(pcVar13,&local_60,10);
            if ((uVar9 < 0x100) && (local_60 != pcVar13)) {
              uVar12 = uVar9;
              if (*local_60 == '-') {
                pcVar13 = local_60 + 1;
                uVar12 = strtol(pcVar13,&local_60,10);
                if ((((0xff < uVar12) || (pcVar13 == local_60)) && (uVar12 = uVar9, param_1 != 0))
                   && (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0 &&
                       ((*(long *)(param_1 + 0x12a0) == 0 ||
                        (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))))) {
                  FUN_00904c98(param_1,
                               "Unable to read the interleaved parameter from Transport header: [%s]"
                               ,pcVar15);
                }
              }
              if ((long)uVar9 <= (long)uVar12) {
                do {
                  uVar2 = uVar9 + 7;
                  if (-1 < (long)uVar9) {
                    uVar2 = uVar9;
                  }
                  lVar8 = param_1 + ((long)uVar2 >> 3);
                  *(byte *)(lVar8 + 0x1138) =
                       *(byte *)(lVar8 + 0x1138) |
                       (byte)(1 << (ulong)((int)uVar9 + (int)((long)uVar2 >> 3) * -8 & 0x1f));
                  bVar1 = (long)uVar9 < (long)uVar12;
                  uVar9 = uVar9 + 1;
                } while (bVar1);
              }
            }
            else if (((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
                    ((*(long *)(param_1 + 0x12a0) == 0 ||
                     (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
              FUN_00904c98(param_1,
                           "Unable to read the interleaved parameter from Transport header: [%s]",
                           pcVar15);
            }
            goto LAB_00933f8c;
          }
          pcVar13 = pcVar10 + 1;
        } while (pcVar10 != (char *)0x0);
      }
    }
    else {
      for (__s1 = (byte *)(param_2 + 8); (bVar3 = *__s1, bVar3 == 9 || (bVar3 == 0x20));
          __s1 = __s1 + 1) {
      }
      if (bVar3 == 0) {
        FUN_00904b80(param_1,"Got a blank Session ID");
        uVar9 = 0x56;
      }
      else {
        pbVar14 = __s1;
        while (((0x3b < bVar3 || ((1L << ((ulong)bVar3 & 0x3f) & 0x800000100000201U) == 0)) &&
               (3 < (byte)(bVar3 - 10)))) {
          pbVar14 = pbVar14 + 1;
          bVar3 = *pbVar14;
        }
        pcVar15 = *(char **)(param_1 + 0x8d0);
        __n = (long)pbVar14 - (long)__s1;
        if (pcVar15 == (char *)0x0) {
          lVar8 = FUN_00941948(__s1,__n);
          uVar9 = 0;
          *(long *)(param_1 + 0x8d0) = lVar8;
          if (lVar8 == 0) {
            uVar9 = 0x1b;
          }
        }
        else {
          sVar11 = strlen(pcVar15);
          if (sVar11 == __n) {
            uVar7 = strncmp((char *)__s1,pcVar15,__n);
            uVar9 = (ulong)uVar7;
            if (uVar7 == 0) goto LAB_00933f90;
          }
          FUN_00904b80(param_1,"Got RTSP Session ID Line [%s], but wanted ID [%s]",__s1,pcVar15);
          uVar9 = 0x56;
        }
      }
    }
  }
  else {
    for (pcVar15 = (char *)(param_2 + 5); (*pcVar15 == ' ' || (*pcVar15 == '\t'));
        pcVar15 = pcVar15 + 1) {
    }
    lVar8 = strtol(pcVar15,&local_60,10);
    if (local_60 == pcVar15) {
      FUN_00904b80(param_1,"Unable to read the CSeq header: [%s]",param_2);
      uVar9 = 0x55;
    }
    else {
      uVar9 = 0;
      *(long *)(*(long *)(param_1 + 0x1a0) + 8) = lVar8;
      *(long *)(param_1 + 0x1130) = lVar8;
    }
  }
  goto LAB_00933f90;
LAB_00933f8c:
  uVar9 = 0;
LAB_00933f90:
  if (*(long *)(lVar5 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar9);
  }
  return;
}

