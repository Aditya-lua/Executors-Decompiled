/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3d000
 */

undefined4
FUN_00a3d000(EVP_MD_CTX *param_1,undefined8 param_2,undefined8 param_3,X509_ALGOR *param_4,
            undefined8 param_5,EVP_PKEY *param_6)

{
  int iVar1;
  undefined4 uVar2;
  int local_2c;
  ASN1_OBJECT *local_28;
  
  X509_ALGOR_get0(&local_28,&local_2c,(void **)0x0,param_4);
  iVar1 = OBJ_obj2nid(local_28);
  if ((iVar1 - 0x43fU < 2) && (local_2c == -1)) {
    iVar1 = EVP_DigestVerifyInit(param_1,(EVP_PKEY_CTX **)0x0,(EVP_MD *)0x0,(ENGINE *)0x0,param_6);
    uVar2 = 0;
    if (iVar1 != 0) {
      uVar2 = 2;
    }
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/ec/ecx_meth.c",0x22a,"ecd_item_verify");
    ERR_set_error(0x10,0x66,0);
    uVar2 = 0;
  }
  return uVar2;
}

