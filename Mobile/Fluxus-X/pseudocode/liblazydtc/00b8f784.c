/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8f784
 */

int psa_crypto_init(void)

{
  long lVar1;
  int iVar2;
  uint uVar3;
  undefined4 local_3c;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  uVar3 = (uint)DAT_00d25b10;
  if ((DAT_00d25b11 == '\x02') && (iVar2 = 0, DAT_00d25b10 == 7)) goto LAB_00b8f920;
  if ((DAT_00d25b10 & 1) == 0) {
    uVar3 = DAT_00d25b10 | 1;
    DAT_00d25b10 = (byte)uVar3;
  }
  if ((uVar3 >> 1 & 1) == 0) {
    iVar2 = psa_initialize_key_slots();
    uVar3 = DAT_00d25b10 | 2;
    DAT_00d25b10 = (byte)uVar3;
    if (iVar2 == 0) goto LAB_00b8f7fc;
LAB_00b8f888:
    if ((uVar3 >> 2 & 1) != 0) {
      uVar3 = uVar3 & 0xfffffffb;
      DAT_00d25b10 = (byte)uVar3;
    }
    if ((uVar3 >> 1 & 1) != 0) {
      psa_wipe_all_key_slots();
      DAT_00d25b10 = DAT_00d25b10 & 0xfd;
    }
    if (DAT_00d25b11 != '\0') {
      mbedtls_ctr_drbg_free(&DAT_00d25e68);
      (*DAT_00d25b20)(&DAT_00d25b28);
    }
    DAT_00d25b11 = '\0';
    mbedtls_platform_zeroize(&DAT_00d25b18,0x4a8);
    if ((DAT_00d25b10 & 1) != 0) {
      DAT_00d25b10 = DAT_00d25b10 & 0xfe;
    }
  }
  else {
LAB_00b8f7fc:
    if ((DAT_00d25b11 == '\0') && ((uVar3 & 1) != 0)) {
      if (DAT_00d25b18 == (code *)0x0) {
        DAT_00d25b18 = mbedtls_entropy_init;
      }
      if (DAT_00d25b20 == (code *)0x0) {
        DAT_00d25b20 = mbedtls_entropy_free;
      }
      (*DAT_00d25b18)(&DAT_00d25b28);
      mbedtls_ctr_drbg_init(&DAT_00d25e68);
      DAT_00d25b11 = '\x01';
      local_3c = 0x415350;
      mbedtls_ctr_drbg_seed(&DAT_00d25e68,mbedtls_entropy_func,&DAT_00d25b28,&local_3c,3);
      iVar2 = mbedtls_to_psa_error();
      if (iVar2 != 0) {
        uVar3 = (uint)DAT_00d25b10;
        goto LAB_00b8f888;
      }
      uVar3 = (uint)DAT_00d25b10;
      DAT_00d25b11 = '\x02';
    }
    iVar2 = 0;
    if ((uVar3 >> 2 & 1) == 0) {
      iVar2 = 0;
      DAT_00d25b10 = (byte)uVar3 | 4;
    }
  }
LAB_00b8f920:
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

