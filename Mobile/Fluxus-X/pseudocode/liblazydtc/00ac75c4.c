/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac75c4
 */

undefined8 FUN_00ac75c4(int param_1,undefined8 param_2,undefined4 param_3)

{
  long lVar1;
  int iVar2;
  undefined8 *puVar3;
  undefined8 local_40;
  undefined4 local_38;
  
  puVar3 = (undefined8 *)ossl_lib_ctx_get_data(param_2,3,&DAT_00c7c760);
  local_40 = 0;
  if (puVar3 != (undefined8 *)0x0) {
    local_40 = 0;
    local_38 = param_3;
    iVar2 = CRYPTO_THREAD_read_lock(*puVar3);
    if (iVar2 == 0) {
      ERR_new();
      ERR_set_debug("crypto/property/property_string.c",199,"ossl_property_str");
      ERR_set_error(0xf,0xc010f,0);
      local_40 = 0;
    }
    else {
      lVar1 = 0x10;
      if (param_1 != 0) {
        lVar1 = 8;
      }
      OPENSSL_LH_doall_arg(*(undefined8 *)((long)puVar3 + lVar1),&LAB_00ac7830,&local_40);
      CRYPTO_THREAD_unlock(*puVar3);
    }
  }
  return local_40;
}

