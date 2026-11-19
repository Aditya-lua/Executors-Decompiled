/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9f694
 */

undefined8 OSSL_PARAM_set_octet_string(long param_1,void *param_2,ulong param_3)

{
  undefined8 uVar1;
  
  if (param_1 == 0) {
    return 0;
  }
  *(undefined8 *)(param_1 + 0x20) = 0;
  if (param_2 == (void *)0x0) {
    return 0;
  }
  *(ulong *)(param_1 + 0x20) = param_3;
  if (*(void **)(param_1 + 0x10) == (void *)0x0) {
    return 1;
  }
  uVar1 = 0;
  if ((*(int *)(param_1 + 8) == 5) && (uVar1 = 0, param_3 <= *(ulong *)(param_1 + 0x18))) {
    memcpy(*(void **)(param_1 + 0x10),param_2,param_3);
    uVar1 = 1;
  }
  return uVar1;
}

