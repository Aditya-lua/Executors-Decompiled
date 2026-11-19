/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b22020
 */

undefined8 ossl_sm2_ciphertext_size(EC_KEY *param_1,undefined8 param_2,int param_3,long *param_4)

{
  int iVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  undefined8 uVar5;
  
  EC_KEY_get0_group(param_1);
  lVar4 = FUN_00b220d0();
  iVar1 = EVP_MD_get_size(param_2);
  uVar5 = 0;
  if ((lVar4 != 0) && (-1 < iVar1)) {
    iVar2 = ASN1_object_size(0,(int)lVar4 + 1,2);
    iVar1 = ASN1_object_size(0,iVar1,4);
    iVar3 = ASN1_object_size(0,param_3,4);
    uVar5 = 1;
    iVar1 = ASN1_object_size(1,iVar1 + iVar2 * 2 + iVar3,0x10);
    *param_4 = (long)iVar1;
  }
  return uVar5;
}

