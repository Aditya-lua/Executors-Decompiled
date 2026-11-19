/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084f700
 */

void FUN_0084f700(long param_1,long *param_2)

{
  ulong uVar1;
  undefined8 *puVar2;
  long lVar3;
  long *plVar4;
  
  uVar1 = (**(code **)(*param_2 + 200))(param_2,param_1);
  if ((uVar1 & 1) != 0) {
    (**(code **)**(undefined8 **)(param_1 + 0x20))(*(undefined8 **)(param_1 + 0x20),param_2);
    if (*(long *)(param_1 + 0x30) != 0) {
      lVar3 = *(long *)(param_1 + 0x30) << 4;
      plVar4 = (long *)(*(long *)(param_1 + 0x28) + 8);
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
  }
  return;
}

