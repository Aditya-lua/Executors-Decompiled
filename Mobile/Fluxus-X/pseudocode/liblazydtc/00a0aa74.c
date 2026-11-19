/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0aa74
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

char * BN_options(void)

{
  if ((DAT_00d21910 & 1) == 0) {
    DAT_00d21910 = 1;
    BIO_snprintf(&DAT_00d21911,0x10,"bn(%zu,%zu)",0x40,0x40);
  }
  return &DAT_00d21911;
}

