/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeb674
 */

undefined8 OSSL_STORE_LOADER_names_do_all(long param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  
  uVar1 = 0;
  if (param_1 != 0) {
    if (*(long *)(param_1 + 0x60) != 0) {
      ossl_provider_libctx();
      uVar1 = ossl_namemap_stored();
      uVar1 = ossl_namemap_doall_names(uVar1,*(undefined4 *)(param_1 + 0x68),param_2,param_3);
      return uVar1;
    }
    uVar1 = 1;
  }
  return uVar1;
}

