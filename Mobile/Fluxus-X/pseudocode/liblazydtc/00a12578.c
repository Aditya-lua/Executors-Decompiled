/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a12578
 */

undefined8 * CTLOG_new_ex(EVP_PKEY *param_1,char *param_2,undefined8 param_3,char *param_4)

{
  int iVar1;
  undefined8 *ptr;
  char *pcVar2;
  EVP_MD *type;
  undefined8 uVar3;
  uint uStack_44;
  uchar *local_38;
  
  ptr = (undefined8 *)CRYPTO_zalloc(0x40,"crypto/ct/ct_log.c",0x10e);
  if (ptr == (undefined8 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ct/ct_log.c",0x111,"CTLOG_new_ex");
    ERR_set_error(0x32,0xc0100,0);
    return (undefined8 *)0x0;
  }
  *ptr = param_3;
  if (param_4 == (char *)0x0) {
LAB_00a125e0:
    pcVar2 = CRYPTO_strdup(param_2,"crypto/ct/ct_log.c",0x11e);
    ptr[2] = pcVar2;
    if (pcVar2 != (char *)0x0) {
      local_38 = (uchar *)0x0;
      iVar1 = i2d_PUBKEY(param_1,&local_38);
      if (iVar1 < 1) {
        ERR_new();
        ERR_set_debug("crypto/ct/ct_log.c",0x56,"ct_v1_log_id_from_pkey");
        uVar3 = 0x71;
      }
      else {
        type = (EVP_MD *)EVP_MD_fetch(*ptr,"SHA2-256",ptr[1]);
        if (type != (EVP_MD *)0x0) {
          iVar1 = EVP_Digest(local_38,(long)iVar1,(uchar *)(ptr + 3),&uStack_44,type,(ENGINE *)0x0);
          EVP_MD_free(type);
          CRYPTO_free(local_38);
          if (iVar1 == 1) {
            ptr[7] = param_1;
            return ptr;
          }
          goto LAB_00a12778;
        }
        ERR_new();
        ERR_set_debug("crypto/ct/ct_log.c",0x5b,"ct_v1_log_id_from_pkey");
        uVar3 = 0x80006;
      }
      ERR_set_error(0x32,uVar3,0);
      EVP_MD_free(0);
      CRYPTO_free(local_38);
      goto LAB_00a12778;
    }
    ERR_new();
    uVar3 = 0x120;
  }
  else {
    pcVar2 = CRYPTO_strdup(param_4,"crypto/ct/ct_log.c",0x117);
    ptr[1] = pcVar2;
    if (pcVar2 != (char *)0x0) goto LAB_00a125e0;
    ERR_new();
    uVar3 = 0x119;
  }
  ERR_set_debug("crypto/ct/ct_log.c",uVar3,"CTLOG_new_ex");
  ERR_set_error(0x32,0xc0100,0);
LAB_00a12778:
  CRYPTO_free((void *)ptr[2]);
  EVP_PKEY_free((EVP_PKEY *)ptr[7]);
  CRYPTO_free((void *)ptr[1]);
  CRYPTO_free(ptr);
  return (undefined8 *)0x0;
}

