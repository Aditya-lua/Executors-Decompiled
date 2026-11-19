/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a55558
 */

void err_clear_last_constant_time(uint param_1)

{
  long lVar1;
  long lVar2;
  
  lVar1 = ossl_err_get_state_int();
  if (lVar1 != 0) {
    lVar2 = (long)*(int *)(lVar1 + 0x380) * 4;
    *(uint *)(lVar1 + lVar2) =
         *(uint *)(lVar1 + lVar2) | ~((int)(param_1 - 1 & (param_1 ^ 0xffffffff)) >> 0x1f) & 2U;
  }
  return;
}

