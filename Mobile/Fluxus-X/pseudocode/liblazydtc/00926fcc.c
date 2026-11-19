/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00926fcc
 */

undefined8 FUN_00926fcc(undefined8 *param_1,long *param_2,int param_3)

{
  undefined1 *puVar1;
  long *plVar2;
  undefined8 *puVar3;
  long *plVar4;
  
  if (param_1 == (undefined8 *)0x0) {
    return 0x2b;
  }
  if ((*(int *)(param_1 + 2) != 4) || ((long *)param_1[7] != param_2)) {
    if ((code *)param_1[6] != (code *)0x0) {
      (*(code *)param_1[6])(param_1[7]);
    }
    param_1[0x36] = 1;
    param_1[3] = 0;
    param_1[4] = 0;
    param_1[5] = 0;
    param_1[6] = 0;
    param_1[7] = param_1;
    param_1[8] = 0;
    param_1[0xe] = 0;
    param_1[0x14] = 0;
    param_1[0x15] = 0;
    param_1[0x13] = 0;
    *(undefined4 *)(param_1 + 2) = 0;
    *(uint *)((long)param_1 + 0x14) = *(uint *)((long)param_1 + 0x14) & 0xfffffffb;
    *(undefined4 *)(param_1 + 0xf) = 0;
    if (param_2 != (long *)0x0) {
      if (*param_2 != 0) {
        return 0x2b;
      }
      plVar4 = (long *)*param_1;
      if ((long *)*param_1 != (long *)0x0) {
        do {
          plVar2 = plVar4;
          puVar3 = (undefined8 *)*plVar2;
          if (puVar3 == (undefined8 *)0x0) break;
          plVar4 = (long *)*puVar3;
        } while (plVar4 != (long *)0x0);
        if (plVar2 == param_2) {
          return 0x2b;
        }
      }
      puVar1 = &LAB_00926074;
      if (param_3 != 0) {
        puVar1 = &LAB_009271bc;
      }
      *param_2 = (long)param_1;
      param_1[0xe] = 0xffffffffffffffff;
      param_1[5] = &LAB_009270d4;
      param_1[6] = puVar1;
      param_1[7] = param_2;
      *(undefined4 *)(param_1 + 2) = 4;
      return 0;
    }
  }
  return 0;
}

