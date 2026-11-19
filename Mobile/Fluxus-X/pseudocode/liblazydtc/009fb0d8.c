/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fb0d8
 */

char * BIO_ADDR_path_string(short *param_1)

{
  char *pcVar1;
  
  if (*param_1 == 1) {
    pcVar1 = CRYPTO_strdup((char *)(param_1 + 1),"crypto/bio/bio_addr.c",0x12d);
    return pcVar1;
  }
  return (char *)0x0;
}

