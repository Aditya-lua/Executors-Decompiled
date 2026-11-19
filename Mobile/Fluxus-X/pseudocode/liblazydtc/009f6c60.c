/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f6c60
 */

/* WARNING: Type propagation algorithm not settling */

int FUN_009f6c60(long *param_1,void *param_2,undefined4 *param_3,char *param_4)

{
  void **ppvVar1;
  int iVar2;
  undefined4 *puVar3;
  undefined4 uVar4;
  code *pcVar5;
  int *piVar6;
  undefined1 *__src;
  undefined1 local_24 [4];
  void *local_18;
  
  local_18 = param_2;
  if ((*(long *)(param_4 + 0x20) != 0) &&
     (pcVar5 = *(code **)(*(long *)(param_4 + 0x20) + 0x30), pcVar5 != (code *)0x0)) {
    iVar2 = (*pcVar5)();
    return iVar2;
  }
  if ((*param_4 == '\0') && (*(long *)(param_4 + 8) == 1)) {
LAB_009f6cdc:
    uVar4 = *param_3;
  }
  else {
    if (*param_1 == 0) {
      return -1;
    }
    if (*param_4 == '\x05') {
      uVar4 = *(undefined4 *)(*param_1 + 4);
      *param_3 = uVar4;
    }
    else {
      if (*(long *)(param_4 + 8) != -4) goto LAB_009f6cdc;
      puVar3 = (undefined4 *)*param_1;
      param_1 = (long *)(puVar3 + 2);
      uVar4 = *puVar3;
      *param_3 = uVar4;
    }
  }
  iVar2 = 0;
  switch(uVar4) {
  case 1:
    iVar2 = (int)*param_1;
    if (iVar2 == -1) {
      return -1;
    }
    if (*(long *)(param_4 + 8) != -4) {
      if (iVar2 == 0) {
        if (*(long *)(param_4 + 0x28) == 0) {
          return -1;
        }
      }
      else if (0 < *(long *)(param_4 + 0x28)) {
        return -1;
      }
    }
    local_24[0] = (undefined1)*param_1;
    iVar2 = 1;
    __src = local_24;
    break;
  case 2:
  case 10:
    ppvVar1 = (void **)0x0;
    if (param_2 != (void *)0x0) {
      ppvVar1 = &local_18;
    }
    iVar2 = ossl_i2c_ASN1_INTEGER(*param_1,ppvVar1);
    return iVar2;
  case 3:
    ppvVar1 = (void **)0x0;
    if (param_2 != (void *)0x0) {
      ppvVar1 = &local_18;
    }
    iVar2 = ossl_i2c_ASN1_BIT_STRING(*param_1,ppvVar1);
    return iVar2;
  default:
    piVar6 = (int *)*param_1;
    if ((*(long *)(param_4 + 0x28) == 0x800) && ((*(byte *)(piVar6 + 4) >> 4 & 1) != 0)) {
      if (param_2 == (void *)0x0) {
        return -2;
      }
      *(void **)(piVar6 + 2) = param_2;
      *piVar6 = 0;
      return -2;
    }
    __src = *(undefined1 **)(piVar6 + 2);
    iVar2 = *piVar6;
    break;
  case 5:
    goto switchD_009f6d00_caseD_5;
  case 6:
    __src = *(undefined1 **)(*param_1 + 0x18);
    if (__src == (undefined1 *)0x0) {
      return -1;
    }
    iVar2 = *(int *)(*param_1 + 0x14);
    if (iVar2 == 0) {
      return -1;
    }
  }
  if ((param_2 != (void *)0x0) && (iVar2 != 0)) {
    memcpy(param_2,__src,(long)iVar2);
  }
switchD_009f6d00_caseD_5:
  return iVar2;
}

