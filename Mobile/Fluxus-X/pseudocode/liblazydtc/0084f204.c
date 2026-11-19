/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084f204
 */

void FUN_0084f204(long param_1,long *param_2)

{
  ulong uVar1;
  undefined8 *puVar2;
  long lVar3;
  undefined8 *puVar4;
  
  uVar1 = (**(code **)(*param_2 + 0x98))(param_2,param_1);
  if (((uVar1 & 1) != 0) && (*(long *)(param_1 + 0x28) != 0)) {
    lVar3 = *(long *)(param_1 + 0x28) * 0x18;
    puVar4 = (undefined8 *)(*(long *)(param_1 + 0x20) + 0x10);
    do {
      puVar2 = (undefined8 *)puVar4[-1];
      if (puVar2 != (undefined8 *)0x0) {
        (**(code **)*puVar2)(puVar2,param_2);
      }
      (*(code *)**(undefined8 **)*puVar4)((undefined8 *)*puVar4,param_2);
      lVar3 = lVar3 + -0x18;
      puVar4 = puVar4 + 3;
    } while (lVar3 != 0);
  }
  return;
}

