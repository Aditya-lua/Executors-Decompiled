/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6b504
 */

undefined4
PKCS5_v2_PBE_keyivgen_ex
          (EVP_CIPHER_CTX *param_1,undefined8 param_2,undefined4 param_3,undefined8 param_4,
          undefined8 param_5,undefined8 param_6,int param_7,undefined8 param_8,undefined8 param_9)

{
  int iVar1;
  undefined4 uVar2;
  undefined8 uVar3;
  PBE2PARAM *a;
  EVP_CIPHER *pEVar4;
  EVP_CIPHER *cipher;
  char acStack_b0 [80];
  code *local_58;
  
  uVar3 = PBE2PARAM_it();
  a = (PBE2PARAM *)ASN1_TYPE_unpack_sequence(uVar3,param_4);
  if (a == (PBE2PARAM *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/evp/p5_crpt2.c",0x7f,"PKCS5_v2_PBE_keyivgen_ex");
    uVar3 = 0x72;
LAB_00a6b708:
    ERR_set_error(6,uVar3,0);
    pEVar4 = (EVP_CIPHER *)0x0;
  }
  else {
    iVar1 = OBJ_obj2nid(a->keyfunc->algorithm);
    iVar1 = EVP_PBE_find_ex(2,iVar1,0,0,0,&local_58);
    if (iVar1 == 0) {
      ERR_new();
      ERR_set_debug("crypto/evp/p5_crpt2.c",0x86,"PKCS5_v2_PBE_keyivgen_ex");
      uVar3 = 0x7c;
      goto LAB_00a6b708;
    }
    iVar1 = OBJ_obj2txt(acStack_b0,0x50,a->encryption->algorithm,0);
    if (iVar1 < 1) {
      ERR_new();
      uVar3 = 0x8e;
LAB_00a6b6fc:
      ERR_set_debug("crypto/evp/p5_crpt2.c",uVar3,"PKCS5_v2_PBE_keyivgen_ex");
      uVar3 = 0x6b;
      goto LAB_00a6b708;
    }
    ERR_set_mark();
    pEVar4 = (EVP_CIPHER *)EVP_CIPHER_fetch(param_8,acStack_b0,param_9);
    cipher = pEVar4;
    if ((pEVar4 == (EVP_CIPHER *)0x0) &&
       (cipher = EVP_get_cipherbyname(acStack_b0), cipher == (EVP_CIPHER *)0x0)) {
      ERR_clear_last_mark();
      ERR_new();
      uVar3 = 0x9a;
      goto LAB_00a6b6fc;
    }
    ERR_pop_to_mark();
    iVar1 = EVP_CipherInit_ex(param_1,cipher,(ENGINE *)0x0,(uchar *)0x0,(uchar *)0x0,param_7);
    if (iVar1 != 0) {
      iVar1 = EVP_CIPHER_asn1_to_param(param_1,a->encryption->parameter);
      if (0 < iVar1) {
        uVar2 = (*local_58)(param_1,param_2,param_3,a->keyfunc->parameter,0,0,param_7,param_8,
                            param_9);
        goto LAB_00a6b718;
      }
      ERR_new();
      ERR_set_debug("crypto/evp/p5_crpt2.c",0xa3,"PKCS5_v2_PBE_keyivgen_ex");
      ERR_set_error(6,0x7a,0);
    }
  }
  uVar2 = 0;
LAB_00a6b718:
  EVP_CIPHER_free(pEVar4);
  PBE2PARAM_free(a);
  return uVar2;
}

