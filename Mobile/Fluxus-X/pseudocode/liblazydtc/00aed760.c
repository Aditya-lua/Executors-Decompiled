/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aed760
 */

UI * UI_new_method(UI_METHOD *method)

{
  int iVar1;
  UI *obj;
  long lVar2;
  
  obj = (UI *)CRYPTO_zalloc(0x38,"crypto/ui/ui_lib.c",0x19);
  if (obj == (UI *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ui/ui_lib.c",0x1c,"UI_new_method");
    ERR_set_error(0x28,0xc0100,0);
  }
  else {
    lVar2 = CRYPTO_THREAD_lock_new();
    *(long *)(obj + 0x30) = lVar2;
    if (lVar2 == 0) {
      ERR_new();
      ERR_set_debug("crypto/ui/ui_lib.c",0x22,"UI_new_method");
      ERR_set_error(0x28,0xc0100,0);
    }
    else {
      if ((method == (UI_METHOD *)0x0) &&
         (method = UI_get_default_method(), method == (UI_METHOD *)0x0)) {
        method = (UI_METHOD *)UI_null();
      }
      *(UI_METHOD **)obj = method;
      iVar1 = CRYPTO_new_ex_data(0xb,obj,(CRYPTO_EX_DATA *)(obj + 0x18));
      if (iVar1 != 0) {
        return obj;
      }
      if (((byte)obj[0x28] >> 1 & 1) != 0) {
        (**(code **)(*(long *)obj + 0x38))(obj,*(undefined8 *)(obj + 0x10));
      }
      OPENSSL_sk_pop_free(*(undefined8 *)(obj + 8),FUN_00aed930);
      CRYPTO_free_ex_data(0xb,obj,(CRYPTO_EX_DATA *)(obj + 0x18));
      CRYPTO_THREAD_lock_free(*(undefined8 *)(obj + 0x30));
    }
    CRYPTO_free(obj);
  }
  return (UI *)0x0;
}

