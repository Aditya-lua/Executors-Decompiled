/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092adb0
 */

void curl_multi_cleanup(int *param_1)

{
  long lVar1;
  int *piVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  int *piVar6;
  undefined1 auStack_60 [24];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  if ((param_1 == (int *)0x0) || (*param_1 != 0xbab1e)) {
LAB_0092afc8:
    uVar3 = 1;
  }
  else if ((*(byte *)((long)param_1 + 0x231) >> 2 & 1) == 0) {
    *param_1 = 0;
    if (*(long **)(param_1 + 0x18) != (long *)0x0) {
      *(undefined8 *)(**(long **)(param_1 + 0x18) + 0xc0) = 0;
    }
    if (*(long **)(param_1 + 0x10) == (long *)0x0) {
      piVar2 = *(int **)(param_1 + 2);
    }
    else {
      lVar5 = **(long **)(param_1 + 0x10);
      *(undefined8 *)(lVar5 + 0x10) = 0;
      if (*(long *)(param_1 + 2) == 0) {
        *(undefined8 *)(lVar5 + 0x18) = 0;
        *(long *)(param_1 + 2) = lVar5;
      }
      else {
        lVar4 = *(long *)(param_1 + 4);
        *(long *)(lVar4 + 0x10) = lVar5;
        *(long *)(lVar5 + 0x18) = lVar4;
      }
      *(long *)(param_1 + 4) = lVar5;
      if (*(int *)(lVar5 + 0x58) != 3) {
        *(undefined4 *)(lVar5 + 0x58) = 3;
        FUN_009425cc(lVar5);
      }
      FUN_00925d80(param_1 + 0x10,lVar5 + 0x28,0);
      FUN_0092aff8(lVar5,0,8);
      piVar2 = *(int **)(param_1 + 2);
    }
    while (piVar2 != (int *)0x0) {
      if (*piVar2 != -0x3f212453) goto LAB_0092afc8;
      piVar6 = *(int **)(piVar2 + 4);
      if (((*(byte *)((long)piVar2 + 0x131d) >> 2 & 1) == 0) && (*(long *)(piVar2 + 8) != 0)) {
        FUN_0092b674(piVar2,0,1);
      }
      if (piVar2[0x2e] == 1) {
        FUN_00917c84(piVar2,*(undefined8 *)(piVar2 + 0x2c));
        piVar2[0x2c] = 0;
        piVar2[0x2d] = 0;
        piVar2[0x2e] = 0;
      }
      piVar2[0x30e] = 0;
      piVar2[0x30f] = 0;
      piVar2[0x30] = 0;
      piVar2[0x31] = 0;
      piVar2 = piVar6;
    }
    FUN_00911360(param_1);
    FUN_00916a74(param_1 + 0x3e,auStack_60);
    while (lVar5 = FUN_00916a80(auStack_60), lVar5 != 0) {
      FUN_00916838(*(undefined8 *)(lVar5 + 0x18));
    }
    FUN_00916838(param_1 + 0x3e);
    FUN_00916838(param_1 + 0x4a);
    FUN_0090fb7c(param_1 + 0x56);
    FUN_00916838(param_1 + 0x28);
    close(param_1[0x88]);
    close(param_1[0x89]);
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x36));
    param_1[0x36] = 0;
    param_1[0x37] = 0;
    param_1[0x38] = 0;
    param_1[0x39] = 0;
    *(byte *)((long)param_1 + 0x231) = *(byte *)((long)param_1 + 0x231) & 0xdf;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x3a));
    param_1[0x3a] = 0;
    param_1[0x3b] = 0;
    param_1[0x3c] = 0;
    param_1[0x3d] = 0;
    *(byte *)((long)param_1 + 0x231) = *(byte *)((long)param_1 + 0x231) & 0xbf;
    (*(code *)PTR_free_00cc4678)(param_1);
    uVar3 = 0;
  }
  else {
    uVar3 = 8;
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

