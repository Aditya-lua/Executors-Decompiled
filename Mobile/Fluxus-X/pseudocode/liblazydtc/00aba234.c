/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aba234
 */

int PKCS12_PBE_keyivgen_ex
              (EVP_CIPHER_CTX *param_1,undefined8 param_2,undefined4 param_3,undefined8 param_4,
              EVP_CIPHER *param_5,undefined8 param_6,int param_7,undefined8 param_8,
              undefined8 param_9)

{
  undefined4 uVar1;
  int iVar2;
  int iVar3;
  undefined8 uVar4;
  PBEPARAM *a;
  ulong uVar5;
  uchar *iv;
  uchar *puVar6;
  uchar auStack_b0 [16];
  uchar auStack_a0 [64];
  
  if (param_5 == (EVP_CIPHER *)0x0) {
    return 0;
  }
  uVar4 = PBEPARAM_it();
  a = (PBEPARAM *)ASN1_TYPE_unpack_sequence(uVar4,param_4);
  if (a == (PBEPARAM *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pkcs12/p12_crpt.c",0x29,"PKCS12_PBE_keyivgen_ex");
    ERR_set_error(0x23,0x65,0);
    return 0;
  }
  if (a->iter == (ASN1_INTEGER *)0x0) {
    uVar5 = 1;
  }
  else {
    uVar5 = ASN1_INTEGER_get(a->iter);
  }
  puVar6 = a->salt->data;
  iVar3 = a->salt->length;
  uVar1 = EVP_CIPHER_get_key_length(param_5);
  iVar2 = PKCS12_key_gen_utf8_ex
                    (param_2,param_3,puVar6,iVar3,1,uVar5 & 0xffffffff,uVar1,auStack_a0,param_6,
                     param_8,param_9);
  if (iVar2 == 0) {
    ERR_new();
    ERR_set_debug("crypto/pkcs12/p12_crpt.c",0x37,"PKCS12_PBE_keyivgen_ex");
    uVar4 = 0x6b;
LAB_00aba3c4:
    ERR_set_error(0x23,uVar4,0);
    PBEPARAM_free(a);
    iVar3 = 0;
  }
  else {
    iVar2 = EVP_CIPHER_get_iv_length(param_5);
    if (iVar2 < 1) {
      iv = (uchar *)0x0;
    }
    else {
      uVar1 = EVP_CIPHER_get_iv_length(param_5);
      iv = auStack_b0;
      iVar3 = PKCS12_key_gen_utf8_ex
                        (param_2,param_3,puVar6,iVar3,2,uVar5 & 0xffffffff,uVar1,auStack_b0,param_6,
                         param_8,param_9);
      if (iVar3 == 0) {
        ERR_new();
        ERR_set_debug("crypto/pkcs12/p12_crpt.c",0x40,"PKCS12_PBE_keyivgen_ex");
        uVar4 = 0x6a;
        goto LAB_00aba3c4;
      }
    }
    PBEPARAM_free(a);
    iVar3 = EVP_CipherInit_ex(param_1,param_5,(ENGINE *)0x0,auStack_a0,iv,param_7);
    OPENSSL_cleanse(auStack_a0,0x40);
    OPENSSL_cleanse(auStack_b0,0x10);
  }
  return iVar3;
}

