/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b14a90
 */

int X509_REVOKED_set_revocationDate(X509_REVOKED *r,ASN1_TIME *tm)

{
  uint uVar1;
  
  uVar1 = 0;
  if (r != (X509_REVOKED *)0x0) {
    if (((ASN1_TIME *)r->issuer != tm) && (tm = ASN1_STRING_dup(tm), tm != (ASN1_STRING *)0x0)) {
      ASN1_TIME_free((ASN1_TIME *)r->issuer);
      r->issuer = (stack_st_GENERAL_NAME *)tm;
    }
    uVar1 = (uint)(tm != (ASN1_STRING *)0x0);
  }
  return uVar1;
}

