/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1cd70
 */

undefined8 FUN_00b1cd70(undefined8 *param_1,undefined8 *param_2)

{
  int iVar1;
  ENGINE *e;
  EVP_PKEY *pkey;
  undefined8 uVar2;
  code *pcVar3;
  
  iVar1 = OBJ_obj2nid(*(ASN1_OBJECT **)*param_2);
  if ((*(byte *)(param_2 + 5) & 1) == 0) {
    e = ENGINE_get_pkey_meth_engine(iVar1);
    if (e == (ENGINE *)0x0) {
      return 0;
    }
    ENGINE_finish(e);
  }
  pkey = EVP_PKEY_new();
  if (pkey == (EVP_PKEY *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x_pubkey.c",0x1a3,"x509_pubkey_decode");
    ERR_set_error(0xb,0xc0100,0);
    return 0xffffffff;
  }
  iVar1 = EVP_PKEY_set_type(pkey,iVar1);
  if (iVar1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x_pubkey.c",0x1a8,"x509_pubkey_decode");
    uVar2 = 0x6f;
  }
  else {
    pcVar3 = *(code **)(*(long *)&pkey->references + 0x20);
    if (pcVar3 != (code *)0x0) {
      iVar1 = (*pcVar3)(pkey,param_2);
      if (iVar1 != 0) {
        *param_1 = pkey;
        return 1;
      }
      goto LAB_00b1ce80;
    }
    ERR_new();
    ERR_set_debug("crypto/x509/x_pubkey.c",0x1b5,"x509_pubkey_decode");
    uVar2 = 0x7c;
  }
  ERR_set_error(0xb,uVar2,0);
LAB_00b1ce80:
  EVP_PKEY_free(pkey);
  return 0;
}

