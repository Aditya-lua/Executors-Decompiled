/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a21d50
 */

DSA_SIG * DSA_do_sign(uchar *dgst,int dlen,DSA *dsa)

{
  DSA_SIG *pDVar1;
  
                    /* WARNING: Could not recover jumptable at 0x00a21d58. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  pDVar1 = (DSA_SIG *)(**(code **)&(dsa[1].p)->top)(dgst,dlen);
  return pDVar1;
}

