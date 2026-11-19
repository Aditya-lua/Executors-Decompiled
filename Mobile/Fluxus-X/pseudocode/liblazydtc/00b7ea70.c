/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7ea70
 */

undefined8 FUN_00b7ea70(long *param_1,ulong param_2)

{
  undefined8 uVar1;
  void *pvVar2;
  
  if (param_2 == 0) {
    if (param_1 == (long *)0x0) {
      uVar1 = 0;
    }
    else {
      if (*param_1 != 0) {
        mbedtls_zeroize_and_free(*param_1,(ulong)*(ushort *)((long)param_1 + 10) << 3);
      }
      uVar1 = 0;
      *(undefined4 *)(param_1 + 1) = 1;
      *param_1 = 0;
    }
  }
  else if (*(ushort *)((long)param_1 + 10) == param_2) {
    memset((void *)*param_1,0,param_2 << 3);
    uVar1 = 0;
    *(undefined2 *)(param_1 + 1) = 1;
  }
  else {
    if (*param_1 != 0) {
      mbedtls_zeroize_and_free(*param_1,(ulong)*(ushort *)((long)param_1 + 10) << 3);
    }
    *(undefined4 *)(param_1 + 1) = 1;
    *param_1 = 0;
    if ((param_2 < 0x2711) && (pvVar2 = calloc(param_2,8), pvVar2 != (void *)0x0)) {
      uVar1 = 0;
      *(short *)((long)param_1 + 10) = (short)param_2;
      *param_1 = (long)pvVar2;
    }
    else {
      uVar1 = 0xfffffff0;
    }
  }
  return uVar1;
}

