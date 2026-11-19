/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae86b4
 */

void OPENSSL_sk_set_cmp_func(long param_1,long param_2)

{
  if (*(long *)(param_1 + 0x18) != param_2) {
    *(undefined4 *)(param_1 + 0x10) = 0;
  }
  *(long *)(param_1 + 0x18) = param_2;
  return;
}

