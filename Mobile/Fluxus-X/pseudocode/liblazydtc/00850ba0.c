/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00850ba0
 */

void FUN_00850ba0(long param_1,long *param_2)

{
  ulong uVar1;
  undefined8 *puVar2;
  long lVar3;
  long *plVar4;
  
  uVar1 = (**(code **)(*param_2 + 0x198))(param_2,param_1);
  if (((uVar1 & 1) != 0) && (*(long *)(param_1 + 0x70) != 0)) {
    lVar3 = *(long *)(param_1 + 0x70) << 4;
    plVar4 = (long *)(*(long *)(param_1 + 0x68) + 8);
    do {
      puVar2 = (undefined8 *)plVar4[-1];
      if (puVar2 == (undefined8 *)0x0) {
        puVar2 = (undefined8 *)*plVar4;
      }
      (**(code **)*puVar2)(puVar2,param_2);
      lVar3 = lVar3 + -0x10;
      plVar4 = plVar4 + 2;
    } while (lVar3 != 0);
  }
  return;
}

