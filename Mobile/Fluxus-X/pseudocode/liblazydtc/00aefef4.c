/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aefef4
 */

UI_METHOD * UI_UTIL_wrap_read_pem_callback(code *param_1,undefined4 param_2)

{
  code *pcVar1;
  int iVar2;
  long *ptr;
  UI_METHOD *method;
  
  ptr = (long *)CRYPTO_zalloc(0x10,"crypto/ui/ui_util.c",0x93);
  if (ptr == (long *)0x0) {
    method = (UI_METHOD *)0x0;
  }
  else {
    method = UI_create_method("PEM password callback wrapper");
    if (((((method != (UI_METHOD *)0x0) &&
          (iVar2 = UI_method_set_opener(method,(opener *)&LAB_00af001c), -1 < iVar2)) &&
         (iVar2 = UI_method_set_reader(method,(reader *)&LAB_00af0024), -1 < iVar2)) &&
        ((iVar2 = UI_method_set_writer(method,(writer *)&LAB_00af00f8), -1 < iVar2 &&
         (iVar2 = UI_method_set_closer(method,(closer *)&LAB_00af0100), -1 < iVar2)))) &&
       ((iVar2 = CRYPTO_THREAD_run_once(&DAT_00d2278c,FUN_00af0108), iVar2 != 0 &&
        ((DAT_00d22790 != '\0' &&
         (iVar2 = UI_method_set_ex_data(method,DAT_00cc9468,ptr), iVar2 != 0)))))) {
      *(undefined4 *)(ptr + 1) = param_2;
      pcVar1 = PEM_def_callback;
      if (param_1 != (code *)0x0) {
        pcVar1 = param_1;
      }
      *ptr = (long)pcVar1;
      return method;
    }
  }
  UI_destroy_method(method);
  CRYPTO_free(ptr);
  return (UI_METHOD *)0x0;
}

