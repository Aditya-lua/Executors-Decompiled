/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a31098
 */

int EC_GROUP_get_curve_GFp(EC_GROUP *group,BIGNUM *p,BIGNUM *a,BIGNUM *b,BN_CTX *ctx)

{
  int iVar1;
  
  if (*(code **)(*(long *)group + 0x30) == (code *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x239,"EC_GROUP_get_curve");
    ERR_set_error(0x10,0xc0101,0);
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x00a310a4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = (**(code **)(*(long *)group + 0x30))();
  return iVar1;
}

