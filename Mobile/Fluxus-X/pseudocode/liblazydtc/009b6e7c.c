/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b6e7c
 */

undefined8 ssl_bad_method(void)

{
  ERR_new();
  ERR_set_debug("ssl/ssl_lib.c",4000,"ssl_bad_method");
  ERR_set_error(0x14,0xc0101,0);
  return 0;
}

