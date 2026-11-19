/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b16434
 */

int X509_digest(X509 *data,EVP_MD *type,uchar *md,uint *len)

{
  int iVar1;
  undefined8 uVar2;
  AUTHORITY_KEYID *pAVar3;
  
  iVar1 = EVP_MD_is_a(type,&DAT_002d142e);
  if ((iVar1 == 0) || (((ulong)data[1].name & 0x100100) != 0x100)) {
    uVar2 = X509_it();
    iVar1 = ossl_asn1_item_digest_ex
                      (uVar2,type,data,md,len,*(undefined8 *)data[1].sha1_hash,
                       *(undefined8 *)(data[1].sha1_hash + 8));
    return iVar1;
  }
  if (len != (uint *)0x0) {
    *len = 0x14;
  }
  *(undefined4 *)(md + 0x10) = *(undefined4 *)&data[1].crldp;
  pAVar3 = data[1].akid;
  *(X509_POLICY_CACHE **)(md + 8) = data[1].policy_cache;
  *(AUTHORITY_KEYID **)md = pAVar3;
  return 1;
}

