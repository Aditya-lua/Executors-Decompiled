/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a22370
 */

int DSA_do_verify(uchar *dgst,int dgst_len,DSA_SIG *sig,DSA *dsa)

{
  int iVar1;
  
                    /* WARNING: Could not recover jumptable at 0x00a22378. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = (*(code *)dsa[1].p[1].d)((int)dgst,dgst_len);
  return iVar1;
}

