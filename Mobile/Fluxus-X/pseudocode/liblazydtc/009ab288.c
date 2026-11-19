/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ab288
 */

undefined8 ssl3_finish_mac(long param_1,void *param_2,ulong param_3)

{
  int iVar1;
  undefined8 uVar2;
  
  if (*(EVP_MD_CTX **)(param_1 + 400) == (EVP_MD_CTX *)0x0) {
    if (param_3 >> 0x1f != 0) {
      ERR_new();
      ERR_set_debug("ssl/s3_enc.c",0x161,"ssl3_finish_mac");
      uVar2 = 0xed;
      goto LAB_009ab348;
    }
    iVar1 = BIO_write(*(BIO **)(param_1 + 0x188),param_2,(int)param_3);
    if ((0 < iVar1) && (iVar1 == (int)param_3)) {
      return 1;
    }
    ERR_new();
    uVar2 = 0x166;
  }
  else {
    iVar1 = EVP_DigestUpdate(*(EVP_MD_CTX **)(param_1 + 400),param_2,param_3);
    if (iVar1 != 0) {
      return 1;
    }
    ERR_new();
    uVar2 = 0x16c;
  }
  ERR_set_debug("ssl/s3_enc.c",uVar2,"ssl3_finish_mac");
  uVar2 = 0xc0103;
LAB_009ab348:
  ossl_statem_fatal(param_1,0x50,uVar2,0);
  return 0;
}

