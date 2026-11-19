/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c7704
 */

undefined8
FUN_009c7704(long param_1,int param_2,undefined8 param_3,EVP_CIPHER *param_4,undefined8 param_5,
            undefined8 param_6,undefined8 param_7,undefined8 param_8,undefined8 param_9,
            uchar *param_10,undefined8 param_11,EVP_CIPHER_CTX *param_12)

{
  int iVar1;
  int iVar2;
  int iVar3;
  undefined8 uVar4;
  long lVar5;
  long lVar6;
  
  iVar1 = EVP_MD_get_size(param_3);
  if (iVar1 < 0) {
    ERR_new();
    uVar4 = 0x15c;
  }
  else {
    uVar4 = tls13_hkdf_expand(param_1,param_3,param_5,param_7,param_8,param_6,(long)iVar1,param_9,
                              (long)iVar1,1);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
    iVar1 = EVP_CIPHER_get_key_length(param_4);
    iVar2 = EVP_CIPHER_get_mode(param_4);
    if (iVar2 == 7) {
      lVar5 = *(long *)(param_1 + 0x2e0);
      if (((lVar5 == 0) && (lVar5 = *(long *)(*(long *)(param_1 + 0x918) + 0x2f8), lVar5 == 0)) &&
         ((*(long *)(param_1 + 0x920) == 0 ||
          (lVar5 = *(long *)(*(long *)(param_1 + 0x920) + 0x2f8), lVar5 == 0)))) {
        ERR_new();
        uVar4 = 0x175;
        goto LAB_009c791c;
      }
      lVar6 = 0xc;
      iVar2 = 0x10;
      if ((*(byte *)(lVar5 + 0x26) & 3) != 0) {
        iVar2 = 8;
      }
    }
    else {
      iVar3 = EVP_CIPHER_get_iv_length(param_4);
      iVar2 = 0;
      lVar6 = (long)iVar3;
    }
    uVar4 = tls13_hkdf_expand(param_1,param_3,param_9,&DAT_0074ce1c,3,0,0,param_10,(long)iVar1,1);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
    uVar4 = tls13_hkdf_expand(param_1,param_3,param_9,&DAT_0074ce27,2,0,0,param_11,lVar6,1);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
    iVar1 = EVP_CipherInit_ex(param_12,param_4,(ENGINE *)0x0,(uchar *)0x0,(uchar *)0x0,param_2);
    if (((0 < iVar1) && (iVar1 = EVP_CIPHER_CTX_ctrl(param_12,9,(int)lVar6,(void *)0x0), 0 < iVar1))
       && (((iVar2 == 0 || (iVar1 = EVP_CIPHER_CTX_ctrl(param_12,0x11,iVar2,(void *)0x0), 0 < iVar1)
            ) && (iVar1 = EVP_CipherInit_ex(param_12,(EVP_CIPHER *)0x0,(ENGINE *)0x0,param_10,
                                            (uchar *)0x0,-1), 0 < iVar1)))) {
      return 1;
    }
    ERR_new();
    uVar4 = 0x18c;
  }
LAB_009c791c:
  ERR_set_debug("ssl/tls13_enc.c",uVar4,"derive_secret_key_and_iv");
  ossl_statem_fatal(param_1,0x50,0x80006,0);
  return 0;
}

