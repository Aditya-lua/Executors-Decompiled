/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac3910
 */

int PKCS7_set_cipher(PKCS7 *p7,EVP_CIPHER *cipher)

{
  int iVar1;
  undefined8 uVar2;
  pkcs7_st **pppVar3;
  pkcs7_st *ppVar4;
  
  iVar1 = OBJ_obj2nid(p7->type);
  if (iVar1 == 0x17) {
    pppVar3 = (pkcs7_st **)&((p7->d).enveloped)->enc_data;
  }
  else {
    if (iVar1 != 0x18) {
      ERR_new();
      ERR_set_debug("crypto/pkcs7/pk7_lib.c",0x2b7,"PKCS7_set_cipher");
      uVar2 = 0x71;
      goto LAB_00ac39c0;
    }
    pppVar3 = &((p7->d).sign)->contents;
  }
  ppVar4 = *pppVar3;
  iVar1 = EVP_CIPHER_get_type(cipher);
  if (iVar1 != 0) {
    ppVar4->type = (ASN1_OBJECT *)cipher;
    (ppVar4->d).ptr = (char *)(p7 + 1);
    return 1;
  }
  ERR_new();
  ERR_set_debug("crypto/pkcs7/pk7_lib.c",0x2be,"PKCS7_set_cipher");
  uVar2 = 0x90;
LAB_00ac39c0:
  ERR_set_error(0x21,uVar2,0);
  return 0;
}

