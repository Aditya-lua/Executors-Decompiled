/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1b33c
 */

int X509_CRL_verify(X509_CRL *a,EVP_PKEY *r)

{
  int iVar1;
  code *UNRECOVERED_JUMPTABLE;
  
  UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(a[1].sha1_hash + 0x10) + 0x20);
  if (UNRECOVERED_JUMPTABLE == (code *)0x0) {
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x00b1b348. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = (*UNRECOVERED_JUMPTABLE)();
  return iVar1;
}

