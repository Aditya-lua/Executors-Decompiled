/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b13c74
 */

bool ossl_policy_node_match(long param_1,undefined8 *param_2,ASN1_OBJECT *param_3)

{
  bool bVar1;
  int iVar2;
  int iVar3;
  ASN1_OBJECT *a;
  byte *pbVar4;
  
  pbVar4 = (byte *)*param_2;
  if (((*(byte *)(param_1 + 0x19) >> 2 & 1) == 0) && ((*pbVar4 & 3) != 0)) {
    iVar2 = OPENSSL_sk_num(*(undefined8 *)(pbVar4 + 0x18));
    if (0 < iVar2) {
      iVar2 = 0;
      do {
        a = (ASN1_OBJECT *)OPENSSL_sk_value(*(undefined8 *)(pbVar4 + 0x18),iVar2);
        iVar3 = OBJ_cmp(a,param_3);
        if (iVar3 == 0) {
          return true;
        }
        iVar2 = iVar2 + 1;
        iVar3 = OPENSSL_sk_num(*(undefined8 *)(pbVar4 + 0x18));
      } while (iVar2 < iVar3);
    }
    bVar1 = false;
  }
  else {
    iVar2 = OBJ_cmp(*(ASN1_OBJECT **)(pbVar4 + 8),param_3);
    bVar1 = iVar2 == 0;
  }
  return bVar1;
}

