/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a21d5c
 */

int DSA_sign_setup(DSA *dsa,BN_CTX *ctx_in,BIGNUM **kinvp,BIGNUM **rp)

{
  int iVar1;
  
                    /* WARNING: Could not recover jumptable at 0x00a21d64. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = (**(code **)&(dsa[1].p)->neg)();
  return iVar1;
}

