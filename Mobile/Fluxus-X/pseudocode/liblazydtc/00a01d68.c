/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a01d68
 */

void bn_wexpand(BIGNUM *param_1,int param_2)

{
  if (param_1->dmax < param_2) {
    bn_expand2(param_1,param_2);
    return;
  }
  return;
}

