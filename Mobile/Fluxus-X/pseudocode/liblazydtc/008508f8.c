/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008508f8
 */

void FUN_008508f8(long param_1,long *param_2)

{
  ulong uVar1;
  undefined8 *puVar2;
  long lVar3;
  
  uVar1 = (**(code **)(*param_2 + 0x168))(param_2,param_1);
  if ((uVar1 & 1) == 0) {
    return;
  }
  if (*(long *)(param_1 + 0x70) != 0) {
    lVar3 = *(long *)(param_1 + 0x70) << 3;
    puVar2 = *(undefined8 **)(param_1 + 0x68);
    do {
      (*(code *)**(undefined8 **)*puVar2)((undefined8 *)*puVar2,param_2);
      lVar3 = lVar3 + -8;
      puVar2 = puVar2 + 1;
    } while (lVar3 != 0);
  }
  puVar2 = *(undefined8 **)(param_1 + 0x78);
  if (puVar2 != (undefined8 *)0x0) {
    (**(code **)*puVar2)(puVar2,param_2);
  }
                    /* WARNING: Could not recover jumptable at 0x00850988. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)**(undefined8 **)(param_1 + 0xa8))(*(undefined8 **)(param_1 + 0xa8),param_2);
  return;
}

