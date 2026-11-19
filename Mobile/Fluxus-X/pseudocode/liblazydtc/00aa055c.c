/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa055c
 */

char * BN_bn2dec(BIGNUM *a)

{
  int iVar1;
  int iVar2;
  int iVar3;
  ulong *ptr;
  char *ptr_00;
  BIGNUM *a_00;
  ulong uVar4;
  char *pcVar5;
  ulong *puVar6;
  
  iVar1 = BN_num_bits(a);
  iVar3 = (iVar1 * 3) / 10 + (iVar1 * 3) / 1000;
  iVar1 = iVar3 + 5;
  iVar3 = (iVar3 + 2) / 0x13 + 1;
  ptr = CRYPTO_malloc(iVar3 * 8,"crypto/bn/bn_conv.c",0x47);
  ptr_00 = CRYPTO_malloc(iVar1,"crypto/bn/bn_conv.c",0x48);
  if ((ptr == (ulong *)0x0) || (ptr_00 == (char *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_conv.c",0x4a,"BN_bn2dec");
    ERR_set_error(3,0xc0100,0);
  }
  else {
    a_00 = BN_dup(a);
    if (a_00 != (BIGNUM *)0x0) {
      iVar2 = BN_is_zero();
      if (iVar2 != 0) {
        ptr_00[0] = '0';
        ptr_00[1] = '\0';
LAB_00aa0634:
        CRYPTO_free(ptr);
        BN_free(a_00);
        return ptr_00;
      }
      iVar2 = BN_is_negative(a_00);
      pcVar5 = ptr_00;
      if (iVar2 != 0) {
        pcVar5 = ptr_00 + 1;
        *ptr_00 = '-';
      }
      iVar2 = BN_is_zero(a_00);
      puVar6 = ptr;
      if (iVar2 == 0) {
        do {
          if ((long)iVar3 <= (long)puVar6 - (long)ptr >> 3) goto LAB_00aa07bc;
          uVar4 = BN_div_word(a_00,10000000000000000000);
          *puVar6 = uVar4;
          if (uVar4 == 0xffffffffffffffff) goto LAB_00aa07bc;
          puVar6 = puVar6 + 1;
          iVar2 = BN_is_zero(a_00);
        } while (iVar2 == 0);
      }
      puVar6 = puVar6 + -1;
      iVar3 = BIO_snprintf(pcVar5,(size_t)(ptr_00 + ((long)iVar1 - (long)pcVar5)),"%lu",*puVar6);
      if (-1 < iVar3) {
        if (puVar6 != ptr) {
          pcVar5 = pcVar5 + iVar3;
          do {
            puVar6 = puVar6 + -1;
            iVar3 = BIO_snprintf(pcVar5,(size_t)(ptr_00 + ((long)iVar1 - (long)pcVar5)),"%019lu",
                                 *puVar6);
            if (iVar3 < 0) goto LAB_00aa07bc;
            pcVar5 = pcVar5 + iVar3;
          } while (ptr != puVar6);
        }
        goto LAB_00aa0634;
      }
LAB_00aa07bc:
      CRYPTO_free(ptr);
      goto LAB_00aa06b0;
    }
  }
  CRYPTO_free(ptr);
  a_00 = (BIGNUM *)0x0;
LAB_00aa06b0:
  BN_free(a_00);
  CRYPTO_free(ptr_00);
  return (char *)0x0;
}

