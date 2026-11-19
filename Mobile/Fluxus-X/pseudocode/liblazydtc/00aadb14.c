/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aadb14
 */

void ossl_obj_cleanup_int(void)

{
  if (DAT_00d22188 != 0) {
    OPENSSL_LH_set_down_load(DAT_00d22188,0);
    OPENSSL_LH_doall(DAT_00d22188,&LAB_00aadb7c);
    OPENSSL_LH_doall(DAT_00d22188,&LAB_00aadb98);
    OPENSSL_LH_doall(DAT_00d22188,&LAB_00aadbac);
    OPENSSL_LH_free(DAT_00d22188);
    DAT_00d22188 = 0;
  }
  return;
}

