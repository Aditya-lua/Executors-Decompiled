/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4f1f0
 */

undefined8 * FUN_00b4f1f0(undefined8 param_1,uint param_2,undefined8 param_3)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 *ptr;
  char *pcVar3;
  
  uVar2 = ossl_prov_ctx_get0_libctx();
  iVar1 = ossl_prov_is_running();
  if ((param_2 & 0x87) == 0) {
    return (undefined8 *)0x0;
  }
  if (iVar1 == 0) {
    return (undefined8 *)0x0;
  }
  ptr = (undefined8 *)CRYPTO_zalloc(0x88,"providers/implementations/keymgmt/ec_kmgmt.c",0x3eb);
  if (ptr == (undefined8 *)0x0) {
    return (undefined8 *)0x0;
  }
  *ptr = uVar2;
  *(uint *)(ptr + 0xf) = param_2;
  *(undefined4 *)((long)ptr + 0x7c) = 0;
  iVar1 = FUN_00b4e498(ptr,param_3);
  if (iVar1 == 0) {
    CRYPTO_free(ptr);
  }
  else {
    if (ptr[1] != 0) {
      return ptr;
    }
    pcVar3 = CRYPTO_strdup("sm2","providers/implementations/keymgmt/ec_kmgmt.c",0x401);
    ptr[1] = pcVar3;
    if (pcVar3 != (char *)0x0) {
      return ptr;
    }
    ERR_new();
    ERR_set_debug("providers/implementations/keymgmt/ec_kmgmt.c",0x403,"sm2_gen_init");
    ERR_set_error(0x39,0xc0100,0);
    FUN_00b4ea10(ptr);
  }
  return (undefined8 *)0x0;
}

