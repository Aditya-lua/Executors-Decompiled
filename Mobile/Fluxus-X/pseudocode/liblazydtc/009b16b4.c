/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b16b4
 */

void FUN_009b16b4(void)

{
  SSL_COMP_get_compression_methods();
  ssl_sort_cipher_list();
  OPENSSL_atexit(&LAB_009b171c);
  DAT_00d218dc = 1;
  DAT_00d218d0 = 1;
  return;
}

