/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afa0d0
 */

ulong X509v3_asid_subset(undefined8 *param_1,undefined8 *param_2)

{
  int iVar1;
  ulong uVar2;
  int *piVar3;
  int *piVar4;
  int *piVar5;
  
  if (param_1 == (undefined8 *)0x0) {
    return 1;
  }
  if (param_1 == param_2) {
    return 1;
  }
  if ((((param_2 != (undefined8 *)0x0) &&
       ((piVar3 = (int *)*param_1, piVar3 == (int *)0x0 || (*piVar3 != 0)))) &&
      ((piVar4 = (int *)param_1[1], piVar4 == (int *)0x0 || (*piVar4 != 0)))) &&
     (((piVar5 = (int *)*param_2, piVar5 == (int *)0x0 || (*piVar5 != 0)) &&
      (((int *)param_2[1] == (int *)0x0 || (*(int *)param_2[1] != 0)))))) {
    if (piVar3 != (int *)0x0) {
      if (piVar5 == (int *)0x0) {
        return 0;
      }
      uVar2 = FUN_00afa190(*(undefined8 *)(piVar5 + 2),*(undefined8 *)(piVar3 + 2));
      if ((int)uVar2 == 0) {
        return uVar2;
      }
      piVar4 = (int *)param_1[1];
    }
    if (piVar4 == (int *)0x0) {
      return 1;
    }
    if (param_2[1] != 0) {
      iVar1 = FUN_00afa190(*(undefined8 *)(param_2[1] + 8),*(undefined8 *)(piVar4 + 2));
      return (ulong)(iVar1 != 0);
    }
  }
  return 0;
}

