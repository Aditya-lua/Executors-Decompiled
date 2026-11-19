/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1b370
 */

int X509_CRL_get0_by_cert(X509_CRL *crl,X509_REVOKED **ret,X509 *x)

{
  int iVar1;
  code *UNRECOVERED_JUMPTABLE;
  undefined8 uVar2;
  X509_NAME *pXVar3;
  
  UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(crl[1].sha1_hash + 0x10) + 0x18);
  if (UNRECOVERED_JUMPTABLE == (code *)0x0) {
    return 0;
  }
  uVar2 = X509_get0_serialNumber(x);
  pXVar3 = X509_get_issuer_name(x);
                    /* WARNING: Could not recover jumptable at 0x00b1b3d8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = (*UNRECOVERED_JUMPTABLE)(crl,ret,uVar2,pXVar3);
  return iVar1;
}

