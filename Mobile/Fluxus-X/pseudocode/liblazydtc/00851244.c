/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851244
 */

void FUN_00851244(long param_1,long *param_2)

{
  ulong uVar1;
  undefined8 *puVar2;
  long lVar3;
  
  uVar1 = (**(code **)(*param_2 + 0x1f8))(param_2,param_1);
  if ((uVar1 & 1) != 0) {
    if (*(long *)(param_1 + 0x28) != 0) {
      lVar3 = *(long *)(param_1 + 0x28) << 3;
      puVar2 = *(undefined8 **)(param_1 + 0x20);
      do {
        (*(code *)**(undefined8 **)*puVar2)((undefined8 *)*puVar2,param_2);
        lVar3 = lVar3 + -8;
        puVar2 = puVar2 + 1;
      } while (lVar3 != 0);
    }
    puVar2 = *(undefined8 **)(param_1 + 0x30);
    if (puVar2 != (undefined8 *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x008512c0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (**(code **)*puVar2)(puVar2,param_2);
      return;
    }
  }
  return;
}

