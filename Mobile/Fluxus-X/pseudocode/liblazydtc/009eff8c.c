/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009eff8c
 */

int ASN1_UTCTIME_cmp_time_t(ASN1_UTCTIME *s,time_t t)

{
  int iVar1;
  long lVar2;
  uint local_90;
  uint local_8c;
  undefined1 auStack_88 [56];
  undefined1 auStack_50 [56];
  time_t local_18;
  
  if ((((s->type == 0x17) && (local_18 = t, iVar1 = ossl_asn1_time_to_tm(auStack_50,s), iVar1 != 0))
      && (lVar2 = OPENSSL_gmtime(&local_18,auStack_88), lVar2 != 0)) &&
     (iVar1 = OPENSSL_gmtime_diff(&local_8c,&local_90,auStack_88,auStack_50), iVar1 != 0)) {
    iVar1 = 1;
    if (((int)local_8c < 1) && ((int)local_90 < 1)) {
      iVar1 = (int)(local_90 | local_8c) >> 0x1f;
    }
  }
  else {
    iVar1 = -2;
  }
  return iVar1;
}

