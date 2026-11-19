/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b199a8
 */

undefined8 * BIO_CONNECT_new(void)

{
  undefined8 *puVar1;
  
  puVar1 = (undefined8 *)CRYPTO_zalloc(0x38,"crypto/bio/bss_conn.c",0x100);
  if (puVar1 == (undefined8 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/bio/bss_conn.c",0x101,"BIO_CONNECT_new");
    ERR_set_error(0x20,0xc0100,0);
    return (undefined8 *)0x0;
  }
  *puVar1 = 0x10000000001;
  return puVar1;
}

