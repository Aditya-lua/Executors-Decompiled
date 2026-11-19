/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b52978
 */

undefined8 * FUN_00b52978(undefined8 param_1,ulong param_2,undefined4 param_3,undefined8 param_4)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 *ptr;
  BIGNUM *a;
  
  uVar2 = ossl_prov_ctx_get0_libctx();
  iVar1 = ossl_prov_is_running();
  if (((param_2 & 3) != 0) && (iVar1 != 0)) {
    ptr = (undefined8 *)CRYPTO_zalloc(0x58,"providers/implementations/keymgmt/rsa_kmgmt.c",0x1ce);
    if (ptr != (undefined8 *)0x0) {
      *ptr = uVar2;
      a = BN_new();
      ptr[4] = a;
      if ((a != (BIGNUM *)0x0) && (iVar1 = BN_set_word(a,0x10001), iVar1 != 0)) {
        ptr[3] = 0x800;
        ptr[5] = 2;
        *(undefined4 *)(ptr + 2) = param_3;
        iVar1 = FUN_00b51f64(ptr,param_4);
        if (iVar1 != 0) {
          return ptr;
        }
      }
      BN_free((BIGNUM *)ptr[4]);
    }
    CRYPTO_free(ptr);
  }
  return (undefined8 *)0x0;
}

