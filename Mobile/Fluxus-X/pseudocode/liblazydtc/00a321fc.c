/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a321fc
 */

int EC_GROUP_precompute_mult(EC_GROUP *group,BN_CTX *ctx)

{
  int iVar1;
  code *UNRECOVERED_JUMPTABLE;
  
  if (*(long *)(*(long *)group + 0xe0) == 0) {
    iVar1 = ossl_ec_wNAF_precompute_mult();
    return iVar1;
  }
  UNRECOVERED_JUMPTABLE = *(code **)(*(long *)group + 0xe8);
  if (UNRECOVERED_JUMPTABLE == (code *)0x0) {
    return 1;
  }
                    /* WARNING: Could not recover jumptable at 0x00a32210. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = (*UNRECOVERED_JUMPTABLE)();
  return iVar1;
}

