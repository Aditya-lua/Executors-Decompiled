/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00918428
 */

void FUN_00918428(undefined8 param_1,char *param_2,char *param_3)

{
  bool bVar1;
  char cVar2;
  long lVar3;
  int iVar4;
  time_t tVar5;
  ulong uVar6;
  undefined8 uVar7;
  long lVar8;
  long lVar9;
  size_t sVar10;
  long lVar11;
  size_t sVar12;
  bool bVar13;
  char *local_78;
  long local_70;
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  local_70 = 0;
  tVar5 = time((time_t *)0x0);
  uVar6 = FUN_009172dc(param_2);
  uVar7 = 0;
  if ((uVar6 & 1) != 0) goto LAB_009185f8;
  bVar1 = false;
  bVar13 = false;
  do {
    for (; (*param_3 == ' ' || (*param_3 == '\t')); param_3 = param_3 + 1) {
    }
    iVar4 = curl_strnequal("max-age=",param_3,8);
    if (iVar4 == 0) {
      iVar4 = curl_strnequal("includesubdomains",param_3,0x11);
      if (iVar4 == 0) {
        for (; (*param_3 != '\0' && (*param_3 != ';')); param_3 = param_3 + 1) {
        }
      }
      else {
        if (bVar13) goto LAB_009185f4;
        param_3 = param_3 + 0x11;
        bVar13 = true;
      }
    }
    else {
      if (bVar1) goto LAB_009185f4;
      for (param_3 = param_3 + 8; (cVar2 = *param_3, cVar2 == ' ' || (cVar2 == '\t'));
          param_3 = param_3 + 1) {
      }
      if (cVar2 == '\"') {
        param_3 = param_3 + 1;
      }
      iVar4 = FUN_00941b6c(param_3,&local_78,10,&local_70);
      if (iVar4 != 0) {
        if (iVar4 != 1) goto LAB_009185f4;
        local_70 = 0x7fffffffffffffff;
      }
      param_3 = local_78;
      if ((cVar2 == '\"') && (param_3 = local_78 + 1, *local_78 != '\"')) goto LAB_009185f4;
      bVar1 = true;
    }
    for (; (cVar2 = *param_3, cVar2 == ' ' || (cVar2 == '\t')); param_3 = param_3 + 1) {
    }
    if (cVar2 == ';') {
      param_3 = param_3 + 1;
    }
  } while (*param_3 != '\0');
  if (!bVar1) {
LAB_009185f4:
    uVar7 = 0x2b;
    goto LAB_009185f8;
  }
  if (local_70 == 0) {
    lVar9 = FUN_00918714(param_1,param_2,0);
    uVar7 = 0;
    if (lVar9 == 0) goto LAB_009185f8;
    FUN_00925d80(param_1,lVar9,0);
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(lVar9 + 0x18));
    (*(code *)PTR_free_00cc4678)(lVar9);
    goto LAB_00918670;
  }
  lVar9 = local_70 + tVar5;
  bVar1 = local_70 <= 0x7fffffffffffffff - tVar5;
  local_70 = 0x7fffffffffffffff;
  if (bVar1) {
    local_70 = lVar9;
  }
  lVar8 = FUN_00918714(param_1,param_2,0);
  lVar9 = local_70;
  if (lVar8 != 0) {
    uVar7 = 0;
    *(long *)(lVar8 + 0x28) = local_70;
    *(bool *)(lVar8 + 0x20) = bVar13;
    goto LAB_009185f8;
  }
  sVar10 = strlen(param_2);
  uVar7 = 0;
  if (sVar10 == 0) goto LAB_009185f8;
  sVar12 = sVar10 - 1;
  if ((param_2[sVar12] == '.') && (sVar10 = sVar12, sVar12 == 0)) {
LAB_00918670:
    uVar7 = 0;
  }
  else {
    lVar8 = (*(code *)PTR_calloc_00cc4690)(1,0x30);
    if (lVar8 != 0) {
      lVar11 = FUN_00941948(param_2,sVar10);
      if (lVar11 != 0) {
        *(long *)(lVar8 + 0x18) = lVar11;
        *(long *)(lVar8 + 0x28) = lVar9;
        *(bool *)(lVar8 + 0x20) = bVar13;
        FUN_00925d10(param_1,lVar8,lVar8);
        goto LAB_00918670;
      }
      (*(code *)PTR_free_00cc4678)(lVar8);
    }
    uVar7 = 0x1b;
  }
LAB_009185f8:
  if (*(long *)(lVar3 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar7);
  }
  return;
}

