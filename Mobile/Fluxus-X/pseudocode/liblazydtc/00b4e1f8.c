/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4e1f8
 */

int DSA_generate_parameters_ex
              (DSA *dsa,int bits,uchar *seed,int seed_len,int *counter_ret,ulong *h_ret,BN_GENCB *cb
              )

{
  int iVar1;
  code *UNRECOVERED_JUMPTABLE;
  undefined1 auStack_48 [4];
  undefined1 auStack_44 [4];
  
  UNRECOVERED_JUMPTABLE = *(code **)&dsa[1].p[3].top;
  if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x00b4e260. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    iVar1 = (*UNRECOVERED_JUMPTABLE)(dsa,bits,seed,seed_len,counter_ret,h_ret,cb);
    return iVar1;
  }
  if ((seed != (uchar *)0x0) &&
     (iVar1 = ossl_ffc_params_set_validate_params(&dsa->version,seed,(long)seed_len,0xffffffff),
     iVar1 == 0)) {
    return 0;
  }
  if ((bits < 0x800) && (seed_len < 0x15)) {
    iVar1 = ossl_ffc_params_FIPS186_2_generate
                      (dsa[1].pub_key,&dsa->version,0,(long)bits,0xa0,auStack_48,cb);
  }
  else {
    iVar1 = ossl_ffc_params_FIPS186_4_generate
                      (dsa[1].pub_key,&dsa->version,0,(long)bits,0,auStack_44,cb);
  }
  if (iVar1 < 1) {
    if (iVar1 == 0) {
      return 0;
    }
  }
  else {
    dsa[1].priv_key = (BIGNUM *)((long)&(dsa[1].priv_key)->d + 1);
  }
  if (counter_ret != (int *)0x0) {
    *counter_ret = *(int *)&dsa->priv_key;
  }
  if (h_ret != (ulong *)0x0) {
    *h_ret = (long)*(int *)((long)&dsa->kinv + 4);
  }
  return 1;
}

