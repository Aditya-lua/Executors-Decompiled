/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7d018
 */

void ossl_ffc_params_set0_pqg(undefined8 *param_1,BIGNUM *param_2,BIGNUM *param_3,BIGNUM *param_4)

{
  if ((param_2 != (BIGNUM *)0x0) && ((BIGNUM *)*param_1 != param_2)) {
    BN_free((BIGNUM *)*param_1);
    *param_1 = param_2;
  }
  if ((param_3 != (BIGNUM *)0x0) && ((BIGNUM *)param_1[1] != param_3)) {
    BN_free((BIGNUM *)param_1[1]);
    param_1[1] = param_3;
  }
  if ((param_4 != (BIGNUM *)0x0) && ((BIGNUM *)param_1[2] != param_4)) {
    BN_free((BIGNUM *)param_1[2]);
    param_1[2] = param_4;
  }
  return;
}

