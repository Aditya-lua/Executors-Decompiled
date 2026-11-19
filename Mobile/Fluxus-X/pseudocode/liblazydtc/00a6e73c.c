/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6e73c
 */

ulong EVP_PKEY_get_default_digest_name(long param_1,undefined8 param_2,undefined8 param_3)

{
  uint uVar1;
  char *pcVar2;
  ulong uVar3;
  int local_24;
  
  if (*(long *)(param_1 + 8) == 0) {
    uVar3 = evp_keymgmt_util_get_deflt_digest_name
                      (*(undefined8 *)(param_1 + 0x60),*(undefined8 *)(param_1 + 0x68),param_2,
                       param_3);
    return uVar3;
  }
  local_24 = 0;
  uVar1 = FUN_00a6e614(param_1,3,0,&local_24);
  if (0 < (int)uVar1) {
    pcVar2 = OBJ_nid2sn(local_24);
    OPENSSL_strlcpy(param_2,pcVar2,param_3);
  }
  return (ulong)uVar1;
}

