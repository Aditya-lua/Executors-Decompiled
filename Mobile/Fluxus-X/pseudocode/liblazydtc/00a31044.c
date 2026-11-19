/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a31044
 */

int EC_GROUP_set_curve_GFp(EC_GROUP *group,BIGNUM *p,BIGNUM *a,BIGNUM *b,BN_CTX *ctx)

{
  int iVar1;
  
  if (*(code **)(*(long *)group + 0x28) == (code *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x22f,"EC_GROUP_set_curve");
    ERR_set_error(0x10,0xc0101,0);
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x00a31050. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = (**(code **)(*(long *)group + 0x28))();
  return iVar1;
}

