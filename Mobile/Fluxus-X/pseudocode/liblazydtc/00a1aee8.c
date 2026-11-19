/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1aee8
 */

int BN_is_prime_fasttest_ex(BIGNUM *p,int nchecks,BN_CTX *ctx,int do_trial_division,BN_GENCB *cb)

{
  int iVar1;
  int iVar2;
  
  iVar1 = BN_num_bits(p);
  iVar2 = 0x80;
  if (iVar1 < 0x801) {
    iVar2 = 0x40;
  }
  if (iVar2 <= nchecks) {
    iVar2 = nchecks;
  }
  iVar2 = FUN_00a1abb8(p,iVar2,ctx,do_trial_division,cb);
  return iVar2;
}

