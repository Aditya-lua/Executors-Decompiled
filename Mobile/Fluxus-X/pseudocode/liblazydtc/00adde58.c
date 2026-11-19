/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00adde58
 */

uchar * ossl_sha1(void *param_1,size_t param_2,uchar *param_3)

{
  int iVar1;
  uchar *md;
  SHA_CTX SStack_90;
  
  md = (uchar *)0xd22234;
  if (param_3 != (uchar *)0x0) {
    md = param_3;
  }
  iVar1 = SHA1_Init(&SStack_90);
  if (iVar1 == 0) {
    md = (uchar *)0x0;
  }
  else {
    SHA1_Update(&SStack_90,param_1,param_2);
    SHA1_Final(md,&SStack_90);
    OPENSSL_cleanse(&SStack_90,0x60);
  }
  return md;
}

