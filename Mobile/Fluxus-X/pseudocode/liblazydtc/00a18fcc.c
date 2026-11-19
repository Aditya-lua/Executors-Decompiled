/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a18fcc
 */

DH * d2i_DHxparams(undefined8 *param_1,uchar **param_2,long param_3)

{
  DH *dh;
  ASN1_VALUE *ptr;
  ulong uVar1;
  
  dh = DH_new();
  if (dh != (DH *)0x0) {
    ptr = ASN1_item_d2i((ASN1_VALUE **)0x0,param_2,param_3,(ASN1_ITEM *)&DAT_00c59ff0);
    if (ptr == (ASN1_VALUE *)0x0) {
      DH_free(dh);
      dh = (DH *)0x0;
    }
    else {
      if (param_1 != (undefined8 *)0x0) {
        DH_free((DH *)*param_1);
        *param_1 = dh;
      }
      DH_set0_pqg(dh,*(undefined8 *)ptr,*(undefined8 *)(ptr + 8),*(undefined8 *)(ptr + 0x10));
      ossl_ffc_params_set0_j(&dh->p,*(undefined8 *)(ptr + 0x18));
      if (*(long *)(ptr + 0x20) != 0) {
        uVar1 = BN_get_word(*(BIGNUM **)(*(long *)(ptr + 0x20) + 8));
        ossl_ffc_params_set_validate_params
                  (&dh->p,*(undefined8 *)((int *)**(undefined8 **)(ptr + 0x20) + 2),
                   (long)*(int *)**(undefined8 **)(ptr + 0x20),uVar1);
        ASN1_BIT_STRING_free((ASN1_STRING *)**(undefined8 **)(ptr + 0x20));
        BN_free(*(BIGNUM **)(*(long *)(ptr + 0x20) + 8));
        CRYPTO_free(*(void **)(ptr + 0x20));
        *(undefined8 *)(ptr + 0x20) = 0;
      }
      CRYPTO_free(ptr);
      DH_clear_flags(dh,0xf000);
      DH_set_flags(dh,0x1000);
    }
  }
  return dh;
}

