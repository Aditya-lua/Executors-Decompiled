/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1e20c
 */

long ossl_dh_new_by_nid_ex(undefined8 param_1,undefined4 param_2)

{
  undefined4 uVar1;
  long lVar2;
  long lVar3;
  
  lVar2 = ossl_ffc_uid_to_dh_named_group(param_2);
  if (lVar2 == 0) {
    ERR_new();
    ERR_set_debug("crypto/dh/dh_group_params.c",0x2f,"ossl_dh_new_by_nid_ex");
    ERR_set_error(5,0x72,0);
    lVar3 = 0;
  }
  else {
    lVar3 = ossl_dh_new_ex(param_1);
    if (lVar3 != 0) {
      ossl_ffc_named_group_set(lVar3 + 8,lVar2);
      uVar1 = ossl_ffc_named_group_get_uid(lVar2);
      *(undefined4 *)(lVar3 + 0x3c) = uVar1;
      *(long *)(lVar3 + 200) = *(long *)(lVar3 + 200) + 1;
    }
  }
  return lVar3;
}

