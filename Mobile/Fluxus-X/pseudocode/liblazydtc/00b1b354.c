/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1b354
 */

int X509_CRL_get0_by_serial(X509_CRL *crl,X509_REVOKED **ret,ASN1_INTEGER *serial)

{
  int iVar1;
  code *UNRECOVERED_JUMPTABLE;
  
  UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(crl[1].sha1_hash + 0x10) + 0x18);
  if (UNRECOVERED_JUMPTABLE == (code *)0x0) {
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x00b1b364. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = (*UNRECOVERED_JUMPTABLE)();
  return iVar1;
}

