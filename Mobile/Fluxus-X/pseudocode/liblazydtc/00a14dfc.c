/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a14dfc
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

char * DES_options(void)

{
  if ((DAT_00d21978 & 1) == 0) {
    OPENSSL_strlcpy(&DAT_00d21979,"des(int)",0xc);
    DAT_00d21978 = 1;
  }
  return &DAT_00d21979;
}

