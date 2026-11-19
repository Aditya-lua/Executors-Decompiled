/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0b94c
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

BUF_MEM * BUF_MEM_new(void)

{
  BUF_MEM *pBVar1;
  
  pBVar1 = (BUF_MEM *)CRYPTO_zalloc(0x20,"crypto/buffer/buffer.c",0x23);
  if (pBVar1 == (BUF_MEM *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/buffer/buffer.c",0x25,"BUF_MEM_new");
    ERR_set_error(7,0xc0100,0);
    return (BUF_MEM *)0x0;
  }
  return pBVar1;
}

