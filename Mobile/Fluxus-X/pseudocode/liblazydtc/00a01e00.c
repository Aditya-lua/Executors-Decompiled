/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a01e00
 */

ulong BN_get_word(BIGNUM *a)

{
  ulong uVar1;
  
  if (1 < a->top) {
    return 0xffffffffffffffff;
  }
  uVar1 = 0;
  if (a->top == 1) {
    uVar1 = *a->d;
  }
  return uVar1;
}

