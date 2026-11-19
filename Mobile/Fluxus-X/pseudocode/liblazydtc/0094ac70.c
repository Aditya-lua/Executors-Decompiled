/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0094ac70
 */

void FUN_0094ac70(char *param_1,byte *param_2)

{
  char *__src;
  uint uVar1;
  size_t sVar2;
  char cVar3;
  byte bVar4;
  long lVar5;
  int iVar6;
  int iVar7;
  undefined8 uVar8;
  char *pcVar9;
  byte *pbVar10;
  ulong uVar11;
  long lVar12;
  size_t __n;
  ulong __n_00;
  uint uVar13;
  char local_190 [128];
  char acStack_110 [128];
  uint local_90 [4];
  uint local_80 [4];
  long local_70;
  
  lVar5 = tpidr_el0;
  local_70 = *(long *)(lVar5 + 0x28);
  uVar8 = 0;
  if (param_1 == (char *)0x0) goto LAB_0094b02c;
  if (param_2 != (byte *)0x0) {
    cVar3 = *param_1;
    uVar8 = 0;
    if (cVar3 == '\0') goto LAB_0094b02c;
    bVar4 = *param_2;
    if (bVar4 != 0) {
      iVar6 = strcmp("*",(char *)param_2);
      if (iVar6 == 0) {
LAB_0094b020:
        uVar8 = 1;
        goto LAB_0094b02c;
      }
      if (cVar3 == '[') {
        pcVar9 = strchr(param_1,0x5d);
        uVar8 = 0;
        if (pcVar9 == (char *)0x0) goto LAB_0094b02c;
        __src = param_1 + 1;
        __n = (long)pcVar9 - (long)__src;
        uVar8 = 0;
        if (0x7f < __n) goto LAB_0094b02c;
        param_1 = acStack_110;
        memcpy(acStack_110,__src,__n);
        param_1[__n] = '\0';
        iVar6 = 2;
      }
      else {
        __n = strlen(param_1);
        iVar6 = inet_pton(2,param_1,acStack_110);
        if (iVar6 == 1) {
          iVar6 = 1;
          bVar4 = *param_2;
        }
        else {
          iVar6 = 0;
          sVar2 = __n - 1;
          if (param_1[__n - 1] != '.') {
            sVar2 = __n;
          }
          bVar4 = *param_2;
          __n = sVar2;
        }
        if (bVar4 == 0) goto LAB_0094b028;
      }
      uVar13 = (uint)bVar4;
      do {
        while ((uVar13 == 9 || (uVar13 == 0x20))) {
          param_2 = param_2 + 1;
          uVar13 = (uint)*param_2;
        }
        __n_00 = 0;
        uVar11 = (ulong)uVar13;
        while ((0x2c < (uint)uVar11 || ((1L << (uVar11 & 0x3f) & 0x100100000201U) == 0))) {
          lVar12 = __n_00 + 1;
          __n_00 = __n_00 + 1;
          uVar11 = (ulong)param_2[lVar12];
        }
        if (__n_00 == 0) goto LAB_0094afbc;
        if (iVar6 - 1U < 2) {
          if (__n_00 < 0x80) {
            memcpy(local_190,param_2,__n_00);
            local_190[__n_00] = '\0';
            pcVar9 = strchr(local_190,0x2f);
            if (pcVar9 == (char *)0x0) {
              uVar13 = 0;
            }
            else {
              uVar13 = atoi(pcVar9 + 1);
              *pcVar9 = '\0';
            }
            if (iVar6 == 2) {
              uVar1 = 0x80;
              if (uVar13 != 0) {
                uVar1 = uVar13;
              }
              if (uVar1 < 0x88) {
                uVar13 = uVar1 >> 3;
                uVar1 = uVar1 & 7;
                if ((((uVar13 == 0x10) && (uVar1 != 0)) ||
                    ((iVar7 = inet_pton(10,param_1,local_80), iVar7 != 1 ||
                     (iVar7 = inet_pton(10,local_190,local_90), iVar7 != 1)))) ||
                   ((uVar13 != 0 && (iVar7 = memcmp(local_80,local_90,(ulong)uVar13), iVar7 != 0))))
                goto LAB_0094afbc;
                if (uVar1 != 0) {
                  uVar13 = 0xff << (ulong)(8 - uVar1 & 0x1f) &
                           (uint)(*(byte *)((long)local_90 + (ulong)uVar13) ^
                                 *(byte *)((long)local_80 + (ulong)uVar13));
                  goto joined_r0x0094afa0;
                }
                goto LAB_0094b020;
              }
            }
            else {
              local_80[0] = 0;
              local_90[0] = 0;
              if (((uVar13 < 0x21) && (iVar7 = inet_pton(2,param_1,local_80), iVar7 == 1)) &&
                 (iVar7 = inet_pton(2,local_190,local_90), iVar7 == 1)) {
                if ((uVar13 | 0x20) == 0x20) {
                  if (local_80[0] == local_90[0]) goto LAB_0094b020;
                }
                else {
                  uVar1 = ((local_90[0] ^ local_80[0]) & 0xff00ff00) >> 8 |
                          ((local_90[0] ^ local_80[0]) & 0xff00ff) << 8;
                  if (((uVar1 >> 0x10 | uVar1 << 0x10) & -1 << (ulong)(0x20 - uVar13 & 0x1f)) == 0)
                  goto LAB_0094b020;
                }
              }
            }
          }
        }
        else {
          if (iVar6 != 0) goto LAB_0094afbc;
          uVar11 = __n_00 - 1;
          if (param_2[__n_00 - 1] != 0x2e) {
            uVar11 = __n_00;
          }
          if ((uVar11 == 0) || (uVar13 != 0x2e)) {
            lVar12 = __n - uVar11;
            pbVar10 = param_2;
            if (lVar12 == 0) goto LAB_0094af94;
LAB_0094afa8:
            if ((__n < uVar11) || (pcVar9 = param_1 + lVar12, (param_1 + lVar12)[-1] != '.'))
            goto LAB_0094afbc;
          }
          else {
            pbVar10 = param_2 + 1;
            uVar11 = uVar11 - 1;
            lVar12 = __n - uVar11;
            if (lVar12 != 0) goto LAB_0094afa8;
LAB_0094af94:
            pcVar9 = param_1;
            uVar11 = __n;
          }
          uVar13 = curl_strnequal(pbVar10,pcVar9,uVar11);
joined_r0x0094afa0:
          if (uVar13 != 0) goto LAB_0094b020;
        }
LAB_0094afbc:
        for (param_2 = param_2 + __n_00; (bVar4 = *param_2, bVar4 == 9 || (bVar4 == 0x20));
            param_2 = param_2 + 1) {
        }
        if (bVar4 != 0x2c) break;
        do {
          param_2 = param_2 + 1;
          uVar13 = (uint)*param_2;
        } while (uVar13 == 0x2c);
      } while (uVar13 != 0);
    }
  }
LAB_0094b028:
  uVar8 = 0;
LAB_0094b02c:
  if (*(long *)(lVar5 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar8);
  }
  return;
}

