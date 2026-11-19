/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac4fc8
 */

undefined8 ossl_prop_defn_get(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  long lVar2;
  undefined8 local_48 [3];
  
  lVar2 = ossl_lib_ctx_get_data(param_1,2,&DAT_00c7c688);
  if ((lVar2 != 0) && (iVar1 = ossl_lib_ctx_read_lock(param_1), iVar1 != 0)) {
    local_48[0] = param_2;
    lVar2 = OPENSSL_LH_retrieve(lVar2,local_48);
    ossl_lib_ctx_unlock(param_1);
    if (lVar2 != 0) {
      return *(undefined8 *)(lVar2 + 8);
    }
  }
  return 0;
}

