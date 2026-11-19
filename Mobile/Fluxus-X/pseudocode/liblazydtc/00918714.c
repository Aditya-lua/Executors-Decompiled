/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00918714
 */

long FUN_00918714(long *param_1,char *param_2,ulong param_3)

{
  long lVar1;
  long lVar2;
  int iVar3;
  time_t tVar4;
  size_t sVar5;
  long lVar6;
  long lVar7;
  char *__s;
  ulong uVar8;
  long *plVar9;
  char acStack_175 [277];
  
  lVar2 = tpidr_el0;
  lVar6 = *(long *)(lVar2 + 0x28);
  if (param_1 != (long *)0x0) {
    tVar4 = time((time_t *)0x0);
    sVar5 = strlen(param_2);
    uVar8 = sVar5 - 1;
    lVar7 = 0;
    if (0xff < uVar8) goto LAB_00918850;
    memcpy(acStack_175 + 1,param_2,sVar5);
    if (param_2[uVar8] != '.') {
      uVar8 = sVar5;
    }
    acStack_175[uVar8 + 1] = '\0';
    plVar9 = (long *)*param_1;
    while (plVar9 != (long *)0x0) {
      while( true ) {
        lVar7 = *plVar9;
        plVar9 = (long *)plVar9[2];
        if (*(long *)(lVar7 + 0x28) <= tVar4) break;
        if (((param_3 & 1) != 0) && (*(char *)(lVar7 + 0x20) != '\0')) {
          __s = *(char **)(lVar7 + 0x18);
          sVar5 = strlen(__s);
          lVar1 = uVar8 - sVar5;
          if ((sVar5 <= uVar8 && lVar1 != 0) &&
             ((acStack_175[lVar1] == '.' &&
              (iVar3 = curl_strnequal(acStack_175 + lVar1 + 1,__s,sVar5), iVar3 != 0))))
          goto LAB_00918850;
        }
        iVar3 = curl_strequal(acStack_175 + 1,*(undefined8 *)(lVar7 + 0x18));
        if (iVar3 != 0) goto LAB_00918850;
        if (plVar9 == (long *)0x0) goto LAB_0091884c;
      }
      FUN_00925d80(param_1,lVar7,0);
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(lVar7 + 0x18));
      (*(code *)PTR_free_00cc4678)(lVar7);
    }
  }
LAB_0091884c:
  lVar7 = 0;
LAB_00918850:
  if (*(long *)(lVar2 + 0x28) != lVar6) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return lVar7;
}

