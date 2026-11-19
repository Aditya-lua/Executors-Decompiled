/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4e36c
 */

undefined8 * FUN_00b4e36c(undefined8 param_1,uint param_2,undefined8 param_3)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 *ptr;
  
  uVar2 = ossl_prov_ctx_get0_libctx();
  iVar1 = ossl_prov_is_running();
  ptr = (undefined8 *)0x0;
  if ((((param_2 & 0x87) != 0) && (iVar1 != 0)) &&
     (ptr = (undefined8 *)CRYPTO_zalloc(0x88,"providers/implementations/keymgmt/ec_kmgmt.c",0x3eb),
     ptr != (undefined8 *)0x0)) {
    *ptr = uVar2;
    *(uint *)(ptr + 0xf) = param_2;
    *(undefined4 *)((long)ptr + 0x7c) = 0;
    iVar1 = FUN_00b4e498(ptr,param_3);
    if (iVar1 == 0) {
      CRYPTO_free(ptr);
      ptr = (undefined8 *)0x0;
    }
  }
  return ptr;
}

