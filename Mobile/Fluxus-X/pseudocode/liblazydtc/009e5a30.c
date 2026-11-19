/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e5a30
 */

/* WARNING: Removing unreachable block (ram,0x009e5a88) */

undefined8 ssl_set_client_hello_version(int *param_1)

{
  int iVar1;
  bool bVar2;
  bool bVar3;
  int *piVar4;
  int *piVar5;
  int iVar6;
  int *piVar7;
  
  piVar4 = param_1;
  if ((*(long *)(param_1 + 0x90) != 0) && (piVar4 = (int *)0x0, *(long *)(param_1 + 0xb2) != 0)) {
    return 0;
  }
  piVar5 = *(int **)(param_1 + 2);
  if (*piVar5 == 0x10000) {
    piVar5 = &DAT_00c58798;
  }
  else {
    if (*piVar5 != 0x1ffff) {
      iVar6 = *param_1;
      goto LAB_009e5b08;
    }
    piVar5 = &DAT_00c58828;
  }
  iVar6 = 0;
  bVar2 = true;
  do {
    piVar7 = piVar5 + 6;
    if (*(code **)(piVar5 + 2) == (code *)0x0) {
LAB_009e5ae0:
      bVar3 = true;
    }
    else {
      piVar5 = (int *)(**(code **)(piVar5 + 2))(piVar4);
      piVar4 = (int *)FUN_009e4f38(param_1,piVar5);
      if ((int)piVar4 != 0) goto LAB_009e5ae0;
      bVar3 = false;
      if (bVar2) {
        iVar6 = *piVar5;
        bVar3 = false;
      }
    }
    bVar2 = bVar3;
    piVar5 = piVar7;
  } while (*piVar7 != 0);
  if (iVar6 == 0) {
    return 0xbf;
  }
  piVar5 = *(int **)(param_1 + 2);
LAB_009e5b08:
  *param_1 = iVar6;
  iVar1 = 0x303;
  if ((*(uint *)(*(long *)(piVar5 + 0x30) + 0x60) & 8) != 0 || iVar6 < 0x304) {
    iVar1 = iVar6;
  }
  param_1[0x283] = iVar1;
  return 0;
}

