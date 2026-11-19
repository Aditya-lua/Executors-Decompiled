/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00877948
 */

void FUN_00877948(undefined8 param_1,undefined8 param_2,int *param_3)

{
  bool bVar1;
  int *piVar2;
  int *piVar3;
  ulong uVar4;
  
  uVar4 = (long)*param_3;
  do {
    FUN_00877148(param_2,(uint)uVar4 & 0x7f | (uint)(0x7f < uVar4) << 7);
    bVar1 = 0x7f < uVar4;
    uVar4 = uVar4 >> 7;
  } while (bVar1);
  FUN_00877148(param_2,(char)param_3[1]);
  FUN_00877148(param_2,*(undefined1 *)((long)param_3 + 5));
  uVar4 = (ulong)*(byte *)(param_3 + 1) + (*(long *)(param_3 + 4) - *(long *)(param_3 + 2) >> 2);
  do {
    FUN_00877148(param_2,(uint)uVar4 & 0x7f | (uint)(0x7f < uVar4) << 7);
    bVar1 = 0x7f < uVar4;
    uVar4 = uVar4 >> 7;
  } while (bVar1);
  uVar4 = (ulong)*(byte *)((long)param_3 + 5) +
          (*(long *)(param_3 + 10) - *(long *)(param_3 + 8) >> 2);
  do {
    FUN_00877148(param_2,(uint)uVar4 & 0x7f | (uint)(0x7f < uVar4) << 7);
    bVar1 = 0x7f < uVar4;
    uVar4 = uVar4 >> 7;
  } while (bVar1);
  piVar3 = *(int **)(param_3 + 4);
  for (piVar2 = *(int **)(param_3 + 2); piVar2 != piVar3; piVar2 = piVar2 + 1) {
    uVar4 = (long)*piVar2;
    do {
      FUN_00877148(param_2,(uint)uVar4 & 0x7f | (uint)(0x7f < uVar4) << 7);
      bVar1 = 0x7f < uVar4;
      uVar4 = uVar4 >> 7;
    } while (bVar1);
  }
  piVar3 = *(int **)(param_3 + 10);
  for (piVar2 = *(int **)(param_3 + 8); piVar2 != piVar3; piVar2 = piVar2 + 1) {
    uVar4 = (long)*piVar2;
    do {
      FUN_00877148(param_2,(uint)uVar4 & 0x7f | (uint)(0x7f < uVar4) << 7);
      bVar1 = 0x7f < uVar4;
      uVar4 = uVar4 >> 7;
    } while (bVar1);
  }
  return;
}

