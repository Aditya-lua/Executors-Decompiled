/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a277f0
 */

undefined8 ossl_ec_pt_format_param2id(long param_1,undefined4 *param_2)

{
  int iVar1;
  undefined4 uVar2;
  long lVar3;
  long local_28;
  
  local_28 = 0;
  if (*(int *)(param_1 + 8) == 6) {
    iVar1 = OSSL_PARAM_get_utf8_ptr(param_1,&local_28);
    if (iVar1 == 0) {
      return 0;
    }
  }
  else {
    if (*(int *)(param_1 + 8) != 4) {
      return 0;
    }
    local_28 = *(long *)(param_1 + 0x10);
    if (local_28 == 0) {
      return 0;
    }
  }
  lVar3 = local_28;
  if (local_28 == 0) {
    uVar2 = 4;
  }
  else {
    iVar1 = OPENSSL_strcasecmp(local_28,"uncompressed");
    if (iVar1 == 0) {
      lVar3 = 0;
    }
    else {
      iVar1 = OPENSSL_strcasecmp(lVar3,"compressed");
      if (iVar1 == 0) {
        lVar3 = 1;
      }
      else {
        iVar1 = OPENSSL_strcasecmp(lVar3,"hybrid");
        if (iVar1 != 0) {
          return 0;
        }
        lVar3 = 2;
      }
    }
    uVar2 = (&DAT_00c5b408)[lVar3 * 4];
  }
  *param_2 = uVar2;
  return 1;
}

