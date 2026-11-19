/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aec284
 */

undefined8 OSSL_STORE_do_all_loaders(undefined8 param_1,undefined8 param_2)

{
  if ((DAT_00d22318 == 0) &&
     (DAT_00d22318 = OPENSSL_LH_new(&LAB_00aec2ec,&LAB_00aec2f4), DAT_00d22318 == 0)) {
    return 1;
  }
  OPENSSL_LH_doall_arg(DAT_00d22318,param_1,param_2);
  return 1;
}

