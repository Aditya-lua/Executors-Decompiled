/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4d0dc
 */

undefined8 * FUN_00b4d0dc(undefined8 param_1,uint param_2,undefined8 param_3)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 *ptr;
  
  uVar2 = ossl_prov_ctx_get0_libctx();
  iVar1 = ossl_prov_is_running();
  ptr = (undefined8 *)0x0;
  if (((param_2 & 7) != 0) && (iVar1 != 0)) {
    ptr = (undefined8 *)CRYPTO_zalloc(0x68,"providers/implementations/keymgmt/dsa_kmgmt.c",0x19e);
    if (ptr != (undefined8 *)0x0) {
      *(uint *)(ptr + 2) = param_2;
      *ptr = uVar2;
      ptr[4] = 0xe0;
      ptr[3] = 0x800;
      ptr[8] = 0xffffffff;
      ptr[7] = 0x2ffffffff;
    }
    iVar1 = FUN_00b4d1d0(ptr,param_3);
    if (iVar1 == 0) {
      CRYPTO_free(ptr);
      ptr = (undefined8 *)0x0;
    }
  }
  return ptr;
}

