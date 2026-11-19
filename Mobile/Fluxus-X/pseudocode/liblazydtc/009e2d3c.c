/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e2d3c
 */

undefined4 ssl_get_min_max_version(int *param_1,int *param_2,int *param_3,int *param_4)

{
  undefined4 uVar1;
  bool bVar2;
  int iVar3;
  int *piVar4;
  int *piVar5;
  int iVar6;
  int iVar7;
  
  if (**(int **)(param_1 + 2) == 0x10000) {
    piVar5 = &DAT_00c58798;
    *param_2 = 0;
  }
  else {
    if (**(int **)(param_1 + 2) != 0x1ffff) {
      iVar6 = *param_1;
      *param_3 = iVar6;
      *param_2 = iVar6;
      uVar1 = 0;
      if (param_4 != (int *)0x0) {
        uVar1 = 0xc0103;
      }
      return uVar1;
    }
    piVar5 = &DAT_00c58828;
    *param_2 = 0;
  }
  if (param_4 != (int *)0x0) {
    *param_4 = 0;
  }
  if (*piVar5 == 0) {
    *param_3 = 0;
  }
  else {
    iVar6 = 0;
    iVar7 = 0;
    bVar2 = true;
    do {
      while (*(code **)(piVar5 + 2) == (code *)0x0) {
        iVar6 = 0;
        bVar2 = true;
        piVar5 = piVar5 + 6;
        if (*piVar5 == 0) goto LAB_009e2e4c;
      }
      piVar4 = (int *)(**(code **)(piVar5 + 2))();
      if ((iVar6 == 0) && (bVar2)) {
        iVar6 = *piVar5;
      }
      iVar3 = FUN_009e4f38(param_1,piVar4);
      if (iVar3 == 0) {
        if (bVar2) {
          if ((param_4 != (int *)0x0) && (iVar6 != 0)) {
            *param_4 = iVar6;
          }
          iVar7 = *piVar4;
          bVar2 = false;
          *param_2 = iVar7;
          iVar3 = piVar5[6];
        }
        else {
          *param_2 = *piVar4;
          iVar3 = piVar5[6];
        }
      }
      else {
        bVar2 = true;
        iVar3 = piVar5[6];
      }
      piVar5 = piVar5 + 6;
    } while (iVar3 != 0);
LAB_009e2e4c:
    *param_3 = iVar7;
    if (iVar7 != 0) {
      return 0;
    }
  }
  return 0xbf;
}

