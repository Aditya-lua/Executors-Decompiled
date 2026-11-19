/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009166fc
 */

undefined8 FUN_009166fc(long *param_1,undefined8 param_2,undefined8 param_3)

{
  long *plVar1;
  long lVar2;
  long lVar3;
  long *plVar4;
  
  lVar3 = *param_1;
  if (lVar3 != 0) {
    lVar2 = (*(code *)param_1[1])(param_2,param_3,param_1[4]);
    plVar1 = (long *)(lVar3 + lVar2 * 0x20);
    for (plVar4 = (long *)*plVar1; plVar4 != (long *)0x0; plVar4 = (long *)plVar4[2]) {
      lVar3 = (*(code *)param_1[2])(*plVar4 + 0x30,*(undefined8 *)(*plVar4 + 0x28),param_2,param_3);
      if (lVar3 != 0) {
        FUN_00925d80(plVar1,plVar4,param_1);
        param_1[5] = param_1[5] + -1;
        return 0;
      }
    }
  }
  return 1;
}

