/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6960c
 */

void evp_cleanup_int(void)

{
  OBJ_NAME_cleanup(6);
  OBJ_NAME_cleanup(2);
  OBJ_NAME_cleanup(1);
  OBJ_NAME_cleanup(-1);
  EVP_PBE_cleanup();
  OBJ_sigid_free();
  evp_app_cleanup_int();
  return;
}

