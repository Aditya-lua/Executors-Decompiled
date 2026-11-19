/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009167a8
 */

undefined8 FUN_009167a8(long *param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  long lVar2;
  long *plVar3;
  
  lVar2 = *param_1;
  if (lVar2 != 0) {
    lVar1 = (*(code *)param_1[1])(param_2,param_3,param_1[4]);
    for (plVar3 = *(long **)(lVar2 + lVar1 * 0x20); plVar3 != (long *)0x0;
        plVar3 = (long *)plVar3[2]) {
      lVar1 = *plVar3;
      lVar2 = (*(code *)param_1[2])(lVar1 + 0x30,*(undefined8 *)(lVar1 + 0x28),param_2,param_3);
      if (lVar2 != 0) {
        return *(undefined8 *)(lVar1 + 0x18);
      }
    }
  }
  return 0;
}

