/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abc050
 */

int PKCS12_set_mac(PKCS12 *p12,char *pass,int passlen,uchar *salt,int saltlen,int iter,
                  EVP_MD *md_type)

{
  int iVar1;
  undefined8 uVar2;
  ASN1_STRING *local_90;
  int local_84;
  undefined1 auStack_80 [64];
  
  if (md_type == (EVP_MD *)0x0) {
    md_type = EVP_sha256();
  }
  iVar1 = 0x800;
  if (iter != 0) {
    iVar1 = iter;
  }
  iVar1 = PKCS12_setup_mac(p12,iVar1,salt,saltlen,md_type);
  if (iVar1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/pkcs12/p12_mutl.c",0xdf,"PKCS12_set_mac");
    uVar2 = 0x6e;
  }
  else {
    iVar1 = FUN_00abbc20(p12,pass,passlen,auStack_80,&local_84);
    if (iVar1 == 0) {
      ERR_new();
      ERR_set_debug("crypto/pkcs12/p12_mutl.c",0xe6,"PKCS12_set_mac");
      uVar2 = 0x6d;
    }
    else {
      X509_SIG_getm(p12->mac->dinfo,0,&local_90);
      iVar1 = ASN1_OCTET_STRING_set(local_90,auStack_80,local_84);
      if (iVar1 != 0) {
        return 1;
      }
      ERR_new();
      ERR_set_debug("crypto/pkcs12/p12_mutl.c",0xeb,"PKCS12_set_mac");
      uVar2 = 0x6f;
    }
  }
  ERR_set_error(0x23,uVar2,0);
  return 0;
}

