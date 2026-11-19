/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a74d38
 */

EVP_PKEY_METHOD * EVP_PKEY_meth_find(int type)

{
  int iVar1;
  EVP_PKEY_METHOD *pEVar2;
  undefined8 *puVar3;
  int local_130 [64];
  undefined1 *local_28;
  
  if (((DAT_00d21b48 == 0) ||
      (local_130[0] = type, iVar1 = OPENSSL_sk_find(DAT_00d21b48,local_130), iVar1 < 0)) ||
     (pEVar2 = (EVP_PKEY_METHOD *)OPENSSL_sk_value(DAT_00d21b48,iVar1),
     pEVar2 == (EVP_PKEY_METHOD *)0x0)) {
    local_130[0] = type;
    local_28 = (undefined1 *)local_130;
    puVar3 = OBJ_bsearch_(&local_28,&switchD_00a75b78::switchdataD_00cc8ed8,10,8,
                          (cmp *)&LAB_00a77e44);
    pEVar2 = (EVP_PKEY_METHOD *)0x0;
    if (puVar3 != (undefined8 *)0x0) {
      if ((code *)*puVar3 == (code *)0x0) {
        pEVar2 = (EVP_PKEY_METHOD *)0x0;
      }
      else {
        pEVar2 = (EVP_PKEY_METHOD *)(*(code *)*puVar3)();
      }
    }
  }
  return pEVar2;
}

