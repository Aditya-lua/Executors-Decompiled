/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e5058
 */

/* WARNING: Removing unreachable block (ram,0x009e50a8) */

bool ssl_check_version_downgrade(int *param_1)

{
  int iVar1;
  bool bVar2;
  int *piVar3;
  undefined8 uVar4;
  int *piVar5;
  int *piVar6;
  
  iVar1 = **(int **)(*(long *)(param_1 + 0x26a) + 8);
  if (*param_1 == iVar1) {
    bVar2 = true;
  }
  else {
    piVar3 = (int *)TLS_method();
    if (iVar1 == *piVar3) {
      piVar5 = &DAT_00c58798;
    }
    else {
      iVar1 = **(int **)(*(long *)(param_1 + 0x26a) + 8);
      piVar5 = (int *)DTLS_method();
      piVar3 = (int *)0x0;
      if (iVar1 != *piVar5) {
        return false;
      }
      piVar5 = &DAT_00c58828;
    }
    do {
      piVar6 = piVar5 + 6;
      if (*(code **)(piVar5 + 4) != (code *)0x0) {
        uVar4 = (**(code **)(piVar5 + 4))(piVar3);
        piVar3 = (int *)FUN_009e4f38(param_1,uVar4);
        if ((int)piVar3 == 0) {
          return *param_1 == *piVar5;
        }
      }
      piVar5 = piVar6;
    } while (*piVar6 != 0);
    bVar2 = false;
  }
  return bVar2;
}

