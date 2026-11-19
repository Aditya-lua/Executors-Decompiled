/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aea2d0
 */

undefined8 OSSL_STORE_INFO_set0_NAME_description(int *param_1,undefined8 param_2)

{
  if (*param_1 == 1) {
    *(undefined8 *)(param_1 + 4) = param_2;
    return 1;
  }
  ERR_new();
  ERR_set_debug("crypto/store/store_lib.c",0x23c,"OSSL_STORE_INFO_set0_NAME_description");
  ERR_set_error(0x2c,0x80106,0);
  return 0;
}

