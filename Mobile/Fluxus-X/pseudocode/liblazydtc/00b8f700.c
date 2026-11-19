/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8f700
 */

void mbedtls_psa_crypto_free(void)

{
  uint uVar1;
  
  uVar1 = (uint)DAT_00d25b10;
  if ((DAT_00d25b10 >> 2 & 1) != 0) {
    uVar1 = DAT_00d25b10 & 0xfffffffb;
    DAT_00d25b10 = (byte)uVar1;
  }
  if ((uVar1 >> 1 & 1) != 0) {
    psa_wipe_all_key_slots();
    DAT_00d25b10 = DAT_00d25b10 & 0xfd;
  }
  if (DAT_00d25b11 != '\0') {
    mbedtls_ctr_drbg_free(&DAT_00d25e68);
    (*DAT_00d25b20)(&DAT_00d25b28);
  }
  DAT_00d25b11 = 0;
  mbedtls_platform_zeroize(&DAT_00d25b18,0x4a8);
  if ((DAT_00d25b10 & 1) != 0) {
    DAT_00d25b10 = DAT_00d25b10 & 0xfe;
  }
  return;
}

