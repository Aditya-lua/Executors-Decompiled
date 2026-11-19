/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00969774
 */

void FUN_00969774(long *param_1,long *param_2,undefined4 param_3)

{
  long lVar1;
  undefined4 uVar2;
  char cVar3;
  long lVar4;
  bool bVar5;
  int iVar6;
  long lVar7;
  size_t sVar8;
  undefined8 uVar9;
  long lVar10;
  char *pcVar11;
  ulong uVar12;
  char *__s2;
  char *__s1;
  undefined1 auStack_78 [16];
  long local_68;
  
  lVar4 = tpidr_el0;
  local_68 = *(long *)(lVar4 + 0x28);
  lVar10 = param_2[3];
  bVar5 = (*(uint *)(*param_2 + 8) & 10) != 10;
  lVar7 = 0xd8;
  if (bVar5) {
    lVar7 = 0x50;
  }
  lVar1 = 0xe8;
  if (bVar5) {
    lVar1 = 0x560;
  }
  __s1 = *(char **)(lVar10 + lVar7);
  uVar2 = *(undefined4 *)(lVar10 + lVar1);
  lVar7 = 0xe0;
  if (bVar5) {
    lVar7 = 0x58;
  }
  if (__s1 != (char *)0x0) {
    pcVar11 = (char *)*param_1;
    __s2 = *(char **)(lVar10 + lVar7);
    if ((pcVar11 == (char *)0x0) || (iVar6 = strcmp(__s1,pcVar11), iVar6 != 0)) {
      if ((char *)param_1[1] != pcVar11) {
        (*(code *)PTR_free_00cc4678)();
      }
      (*(code *)PTR_free_00cc4678)(param_1[2]);
      (*(code *)PTR_free_00cc4678)(*param_1);
      *(undefined4 *)(param_1 + 3) = 0;
      param_1[1] = 0;
      param_1[2] = 0;
      *param_1 = 0;
      pcVar11 = (char *)(*(code *)PTR_strdup_00cc4688)(__s1);
      *param_1 = (long)pcVar11;
      if (pcVar11 == (char *)0x0) {
        lVar7 = param_1[1];
        if (lVar7 != 0) {
LAB_009698e8:
          (*(code *)PTR_free_00cc4678)(lVar7);
        }
LAB_009698ec:
        lVar7 = param_1[2];
LAB_009698f4:
        (*(code *)PTR_free_00cc4678)(lVar7);
        (*(code *)PTR_free_00cc4678)(*param_1);
        *param_1 = 0;
        param_1[1] = 0;
        *(undefined4 *)(param_1 + 3) = 0;
        param_1[2] = 0;
        uVar9 = 0x1b;
        goto LAB_009699c4;
      }
      if ((__s2 == (char *)0x0) || (iVar6 = strcmp(__s1,__s2), iVar6 == 0)) {
        param_1[1] = (long)pcVar11;
        cVar3 = *pcVar11;
joined_r0x009698b8:
        if (cVar3 != '\0') {
          iVar6 = inet_pton(2,pcVar11,auStack_78);
          if (iVar6 == 0) {
            iVar6 = inet_pton(10,pcVar11,auStack_78);
            if (iVar6 == 0) {
              pcVar11 = (char *)*param_1;
              goto LAB_0096994c;
            }
            *(undefined4 *)(param_1 + 3) = 2;
          }
          else {
            *(undefined4 *)(param_1 + 3) = 1;
          }
          goto LAB_009699bc;
        }
      }
      else {
        lVar7 = (*(code *)PTR_strdup_00cc4688)(__s2);
        pcVar11 = (char *)*param_1;
        param_1[1] = lVar7;
        if (lVar7 == 0) {
          if (pcVar11 != (char *)0x0) {
            lVar7 = 0;
            goto LAB_009698e8;
          }
          goto LAB_009698ec;
        }
        if (pcVar11 != (char *)0x0) {
          cVar3 = *pcVar11;
          goto joined_r0x009698b8;
        }
      }
LAB_0096994c:
      *(undefined4 *)(param_1 + 3) = 0;
      if (*pcVar11 != '\0') {
        sVar8 = strlen(pcVar11);
        if (sVar8 == 0) {
          uVar12 = 0;
        }
        else {
          uVar12 = sVar8 - 1;
          if (pcVar11[sVar8 - 1] != '.') {
            uVar12 = sVar8;
          }
          if (0xfffe < uVar12) goto LAB_009699bc;
        }
        lVar7 = (*(code *)PTR_calloc_00cc4690)(1,uVar12 + 1);
        param_1[2] = lVar7;
        if (lVar7 == 0) {
          if (param_1[1] == *param_1) {
            lVar7 = 0;
          }
          else {
            (*(code *)PTR_free_00cc4678)();
            lVar7 = param_1[2];
          }
          goto LAB_009698f4;
        }
        FUN_00941848(lVar7,*param_1,uVar12);
        *(undefined1 *)(param_1[2] + uVar12) = 0;
      }
    }
  }
LAB_009699bc:
  uVar9 = 0;
  *(undefined4 *)((long)param_1 + 0x1c) = uVar2;
  *(undefined4 *)(param_1 + 4) = param_3;
LAB_009699c4:
  if (*(long *)(lVar4 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar9);
  }
  return;
}

