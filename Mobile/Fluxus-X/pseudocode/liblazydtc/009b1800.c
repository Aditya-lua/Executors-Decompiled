/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b1800
 */

undefined8 ssl_undefined_function(void)

{
  ERR_new();
  ERR_set_debug("ssl/ssl_lib.c",0xf8f,"ssl_undefined_function");
  ERR_set_error(0x14,0xc0101,0);
  return 0;
}

