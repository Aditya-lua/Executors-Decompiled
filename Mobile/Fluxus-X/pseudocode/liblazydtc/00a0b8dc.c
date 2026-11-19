/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0b8dc
 */

long BUF_MEM_new_ex(undefined8 param_1)

{
  long lVar1;
  
  lVar1 = CRYPTO_zalloc(0x20,"crypto/buffer/buffer.c",0x23);
  if (lVar1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/buffer/buffer.c",0x25,"BUF_MEM_new");
    ERR_set_error(7,0xc0100,0);
    lVar1 = 0;
  }
  else {
    *(undefined8 *)(lVar1 + 0x18) = param_1;
  }
  return lVar1;
}

