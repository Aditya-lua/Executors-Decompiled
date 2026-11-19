/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1e2b0
 */

void ossl_dh_cache_named_group(long param_1)

{
  undefined4 uVar1;
  long lVar2;
  undefined8 uVar3;
  
  if (param_1 != 0) {
    *(undefined4 *)(param_1 + 0x3c) = 0;
    if (((*(long *)(param_1 + 8) != 0) && (*(long *)(param_1 + 0x18) != 0)) &&
       (lVar2 = ossl_ffc_numbers_to_dh_named_group
                          (*(long *)(param_1 + 8),*(undefined8 *)(param_1 + 0x10)), lVar2 != 0)) {
      if (*(long *)(param_1 + 0x10) == 0) {
        uVar3 = ossl_ffc_named_group_get_q(lVar2);
        *(undefined8 *)(param_1 + 0x10) = uVar3;
      }
      uVar1 = ossl_ffc_named_group_get_uid(lVar2);
      *(undefined4 *)(param_1 + 0x3c) = uVar1;
      uVar1 = ossl_ffc_named_group_get_keylength(lVar2);
      *(undefined4 *)(param_1 + 0x60) = uVar1;
      *(long *)(param_1 + 200) = *(long *)(param_1 + 200) + 1;
    }
  }
  return;
}

