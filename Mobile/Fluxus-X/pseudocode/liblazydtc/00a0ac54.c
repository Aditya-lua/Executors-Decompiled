/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0ac54
 */

int BN_lshift(BIGNUM *r,BIGNUM *a,int n)

{
  int iVar1;
  
  if (n < 0) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_shift.c",0x56,"BN_lshift");
    ERR_set_error(3,0x77,0);
    iVar1 = 0;
  }
  else {
    iVar1 = bn_lshift_fixed_top();
    bn_correct_top(r);
  }
  return iVar1;
}

