/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af633c
 */

undefined8
X509v3_addr_add_range
          (undefined8 param_1,int param_2,undefined8 param_3,undefined8 param_4,undefined8 param_5)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  ASN1_VALUE *local_38;
  
  lVar2 = FUN_00af615c();
  uVar3 = 0;
  if (lVar2 != 0) {
    iVar1 = 4;
    if (param_2 != 1) {
      iVar1 = (uint)(param_2 == 2) << 4;
    }
    uVar3 = FUN_00af63d8(&local_38,param_4,param_5,iVar1);
    if ((int)uVar3 != 0) {
      iVar1 = OPENSSL_sk_push(lVar2,local_38);
      if (iVar1 == 0) {
        ASN1_item_free(local_38,(ASN1_ITEM *)&DAT_00c7e788);
        uVar3 = 0;
      }
      else {
        uVar3 = 1;
      }
    }
  }
  return uVar3;
}

