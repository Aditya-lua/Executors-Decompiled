/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6a2d4
 */

int PKCS5_v2_scrypt_keyivgen_ex
              (EVP_CIPHER_CTX *param_1,undefined8 param_2,int param_3,undefined8 param_4,
              undefined8 param_5,undefined8 param_6,int param_7,undefined8 param_8,
              undefined8 param_9)

{
  int iVar1;
  int iVar2;
  long lVar3;
  ASN1_VALUE *val;
  undefined8 uVar4;
  size_t len;
  undefined8 local_b0;
  undefined8 uStack_a8;
  size_t local_a0 [8];
  undefined8 local_58;
  
  lVar3 = EVP_CIPHER_CTX_get0_cipher();
  if (lVar3 == 0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/p5_scrypt.c",0xe0,"PKCS5_v2_scrypt_keyivgen_ex");
    ERR_set_error(6,0x83,0);
    val = (ASN1_VALUE *)0x0;
    iVar2 = 0;
    goto LAB_00a6a518;
  }
  val = (ASN1_VALUE *)ASN1_TYPE_unpack_sequence(&DAT_00c5e8f0,param_4);
  if (val == (ASN1_VALUE *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/p5_scrypt.c",0xe9,"PKCS5_v2_scrypt_keyivgen_ex");
    uVar4 = 0x72;
  }
  else {
    iVar1 = EVP_CIPHER_CTX_get_key_length(param_1);
    if (-1 < iVar1) {
      len = (size_t)iVar1;
      if ((*(long *)(val + 0x20) == 0) ||
         ((iVar2 = ASN1_INTEGER_get_uint64(local_a0), iVar2 != 0 && (local_a0[0] == len)))) {
        iVar2 = ASN1_INTEGER_get_uint64(&local_b0,*(undefined8 *)(val + 8));
        if ((iVar2 == 0) ||
           (((iVar2 = ASN1_INTEGER_get_uint64(&uStack_a8,*(undefined8 *)(val + 0x10)), iVar2 == 0 ||
             (iVar2 = ASN1_INTEGER_get_uint64(&local_58,*(undefined8 *)(val + 0x18)), iVar2 == 0))
            || (iVar2 = EVP_PBE_scrypt_ex(0,0,0,0,local_b0,uStack_a8,local_58,0,0,0,param_8,param_9)
               , iVar2 == 0)))) {
          ERR_new();
          ERR_set_debug("crypto/asn1/p5_scrypt.c",0x104,"PKCS5_v2_scrypt_keyivgen_ex");
          uVar4 = 0xab;
          goto LAB_00a6a4fc;
        }
        iVar2 = EVP_PBE_scrypt_ex(param_2,(long)param_3,*(undefined8 *)(*(int **)val + 2),
                                  (long)**(int **)val,local_b0,uStack_a8,local_58,0,local_a0,len,
                                  param_8,param_9);
        if (iVar2 == 0) {
          iVar2 = 0;
        }
        else {
          iVar2 = EVP_CipherInit_ex(param_1,(EVP_CIPHER *)0x0,(ENGINE *)0x0,(uchar *)local_a0,
                                    (uchar *)0x0,param_7);
        }
      }
      else {
        ERR_new();
        ERR_set_debug("crypto/asn1/p5_scrypt.c",0xfa,"PKCS5_v2_scrypt_keyivgen_ex");
        uVar4 = 0x7b;
LAB_00a6a4fc:
        ERR_set_error(6,uVar4,0);
        iVar2 = 0;
      }
      if (iVar1 != 0) {
        OPENSSL_cleanse(local_a0,len);
      }
      goto LAB_00a6a518;
    }
    ERR_new();
    ERR_set_debug("crypto/asn1/p5_scrypt.c",0xef,"PKCS5_v2_scrypt_keyivgen_ex");
    uVar4 = 0x82;
  }
  ERR_set_error(6,uVar4,0);
  iVar2 = 0;
LAB_00a6a518:
  ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c5e8f0);
  return iVar2;
}

