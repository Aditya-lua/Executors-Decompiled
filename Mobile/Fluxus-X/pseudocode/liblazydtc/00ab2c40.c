/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab2c40
 */

int FUN_00ab2c40(long param_1,long param_2,long param_3,uint param_4)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  long lVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  
  if ((param_4 >> 2 & 1) == 0) {
    lVar2 = X509_get0_pubkey(param_3);
    if (lVar2 == 0) {
      ERR_new();
      ERR_set_debug("crypto/ocsp/ocsp_vfy.c",0x54,"ocsp_verify");
      ERR_set_error(0x27,0x82,0);
      iVar1 = -1;
    }
    else {
      if (param_1 == 0) {
        uVar3 = OCSP_RESPDATA_it();
        uVar5 = *(undefined8 *)(param_2 + 0x40);
        uVar6 = *(undefined8 *)(param_3 + 0x170);
        uVar7 = *(undefined8 *)(param_3 + 0x178);
        lVar4 = param_2 + 0x30;
      }
      else {
        uVar3 = OCSP_REQINFO_it();
        lVar4 = *(long *)(param_1 + 0x20);
        uVar6 = *(undefined8 *)(param_3 + 0x170);
        uVar7 = *(undefined8 *)(param_3 + 0x178);
        uVar5 = *(undefined8 *)(lVar4 + 0x10);
        param_2 = param_1;
      }
      iVar1 = ASN1_item_verify_ex(uVar3,lVar4,uVar5,param_2,0,lVar2,uVar6,uVar7);
      if (iVar1 < 1) {
        ERR_new();
        ERR_set_debug("crypto/ocsp/ocsp_vfy.c",0x5c,"ocsp_verify");
        ERR_set_error(0x27,0x75,0);
      }
    }
  }
  else {
    iVar1 = 1;
  }
  return iVar1;
}

