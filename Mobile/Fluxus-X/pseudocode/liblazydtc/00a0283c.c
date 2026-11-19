/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0283c
 */

int BN_is_bit_set(BIGNUM *a,int n)

{
  uint uVar1;
  
  if (n < 0) {
    return 0;
  }
  uVar1 = 0;
  if ((int)((uint)n >> 6) < a->top) {
    uVar1 = (uint)(a->d[(uint)n >> 6] >> (n & 0x3fU)) & 1;
  }
  return uVar1;
}

