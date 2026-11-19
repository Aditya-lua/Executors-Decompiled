/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a78ab0
 */

undefined8
DH_KDF_X9_42(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
            ASN1_OBJECT *param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  int iVar1;
  undefined8 uVar2;
  char acStack_94 [52];
  
  EVP_MD_get0_provider(param_8);
  uVar2 = ossl_provider_libctx();
  iVar1 = OBJ_obj2txt(acStack_94,0x32,param_5,0);
  if (iVar1 < 1) {
    uVar2 = 0;
  }
  else {
    uVar2 = ossl_dh_kdf_X9_42_asn1
                      (param_1,param_2,param_3,param_4,acStack_94,param_6,param_7,param_8,uVar2,0);
  }
  return uVar2;
}

