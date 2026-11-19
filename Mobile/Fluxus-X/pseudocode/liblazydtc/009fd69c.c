/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fd69c
 */

undefined4 * BIO_meth_new(undefined4 param_1,char *param_2)

{
  undefined4 *ptr;
  char *pcVar1;
  
  ptr = (undefined4 *)CRYPTO_zalloc(0x60,"crypto/bio/bio_meth.c",0x26);
  if (ptr != (undefined4 *)0x0) {
    pcVar1 = CRYPTO_strdup(param_2,"crypto/bio/bio_meth.c",0x29);
    *(char **)(ptr + 2) = pcVar1;
    if (pcVar1 != (char *)0x0) {
      *ptr = param_1;
      return ptr;
    }
  }
  CRYPTO_free(ptr);
  ERR_new();
  ERR_set_debug("crypto/bio/bio_meth.c",0x2b,"BIO_meth_new");
  ERR_set_error(0x20,0xc0100,0);
  return (undefined4 *)0x0;
}

