/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a82924
 */

undefined4 ossl_namemap_add_name(long param_1,undefined4 param_2,char *param_3)

{
  int iVar1;
  undefined4 uVar2;
  size_t sVar3;
  
  if (param_3 != (char *)0x0) {
    sVar3 = strlen(param_3);
    if (param_1 == 0) {
      param_1 = ossl_namemap_stored(0);
    }
    if (((sVar3 != 0) && (param_1 != 0)) &&
       (iVar1 = CRYPTO_THREAD_write_lock(*(undefined8 *)(param_1 + 8)), iVar1 != 0)) {
      uVar2 = FUN_00a827e8(param_1,param_2,param_3,sVar3);
      CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 8));
      return uVar2;
    }
  }
  return 0;
}

