/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b50444
 */

undefined8 * FUN_00b50444(undefined8 param_1,undefined4 param_2,undefined8 param_3)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 *ptr;
  
  uVar2 = ossl_prov_ctx_get0_libctx();
  iVar1 = ossl_prov_is_running();
  if (iVar1 != 0) {
    ptr = (undefined8 *)CRYPTO_zalloc(0x18,"providers/implementations/keymgmt/ecx_kmgmt.c",0x1e4);
    if (ptr != (undefined8 *)0x0) {
      *ptr = uVar2;
      *(undefined4 *)(ptr + 2) = 0;
      *(undefined4 *)((long)ptr + 0x14) = param_2;
    }
    iVar1 = FUN_00b504cc(ptr,param_3);
    if (iVar1 != 0) {
      return ptr;
    }
    CRYPTO_free(ptr);
  }
  return (undefined8 *)0x0;
}

