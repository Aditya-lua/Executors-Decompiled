/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a02974
 */

void BN_set_negative(BIGNUM *b,int n)

{
  if ((n == 0) || (b->top == 0)) {
    b->neg = 0;
    return;
  }
  b->neg = 1;
  return;
}

