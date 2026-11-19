/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009636a0
 */

void FUN_009636a0(long param_1,long param_2,ulong param_3)

{
  char *__s;
  long lVar1;
  int iVar2;
  size_t sVar3;
  char *pcVar4;
  undefined8 uVar5;
  long lVar6;
  char cVar7;
  ulong uVar8;
  char *pcVar9;
  size_t sVar10;
  char *pcVar11;
  char local_88 [48];
  undefined1 auStack_58 [16];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  if (3 < param_3) {
    __s = (char *)(param_2 + 1);
    sVar10 = param_3 - 2;
    sVar3 = strspn(__s,"0123456789abcdefABCDEF:.");
    if (sVar10 == sVar3) {
      pcVar11 = __s + sVar10;
      sVar3 = sVar10;
LAB_009636fc:
      __s[sVar3] = '\0';
      iVar2 = inet_pton(10,__s,auStack_58);
      if (iVar2 == 1) {
        pcVar4 = inet_ntop(10,auStack_58,local_88,0x2e);
        if ((pcVar4 != (char *)0x0) && (sVar10 = strlen(local_88), sVar10 < sVar3)) {
          strcpy(__s,local_88);
          sVar3 = strlen(local_88);
          pcVar11 = __s + sVar3;
          pcVar11[1] = '\0';
        }
        uVar5 = 0;
        *pcVar11 = ']';
        goto LAB_009637d8;
      }
    }
    else {
      pcVar11 = __s + sVar3;
      if (*pcVar11 == '%') {
        pcVar4 = pcVar11 + 1;
        iVar2 = strncmp(pcVar4,"25",2);
        if (iVar2 == 0) {
          pcVar9 = pcVar11 + 3;
          cVar7 = *pcVar9;
          if ((cVar7 == ']') || (cVar7 == '\0')) goto LAB_00963798;
        }
        else {
LAB_00963798:
          cVar7 = *pcVar4;
          pcVar9 = pcVar4;
        }
        if (cVar7 != '\0') {
          uVar8 = 0;
          do {
            if ((0xe < uVar8) || (cVar7 == ']')) {
              uVar5 = 0x16;
              if (((int)uVar8 == 0) || (cVar7 != ']')) goto LAB_009637d8;
              local_88[uVar8] = '\0';
              lVar6 = (*(code *)PTR_strdup_00cc4688)(local_88);
              *(long *)(param_1 + 0x28) = lVar6;
              if (lVar6 == 0) {
                uVar5 = 7;
                goto LAB_009637d8;
              }
              *pcVar11 = ']';
              *pcVar4 = '\0';
              goto LAB_009636fc;
            }
            local_88[uVar8] = cVar7;
            cVar7 = pcVar9[uVar8 + 1];
            uVar8 = uVar8 + 1;
          } while (cVar7 != '\0');
        }
      }
    }
  }
  uVar5 = 0x16;
LAB_009637d8:
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar5);
  }
  return;
}

