/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092693c
 */

undefined8 curl_mime_subparts(undefined8 *param_1,long *param_2)

{
  long *plVar1;
  undefined8 *puVar2;
  long *plVar3;
  
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
      plVar3 = (long *)*param_1;
      if ((long *)*param_1 != (long *)0x0) {
        do {
          plVar1 = plVar3;
          puVar2 = (undefined8 *)*plVar1;
          if (puVar2 == (undefined8 *)0x0) break;
          plVar3 = (long *)*puVar2;
        } while (plVar3 != (long *)0x0);
        if (plVar1 == param_2) {
          return 0x2b;
        }
      }
      *param_2 = (long)param_1;
      param_1[6] = &LAB_009271bc;
      param_1[7] = param_2;
      param_1[5] = &LAB_009270d4;
      param_1[0xe] = 0xffffffffffffffff;
      *(undefined4 *)(param_1 + 2) = 4;
      return 0;
    }
  }
  return 0;
}

