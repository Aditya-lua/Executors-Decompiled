/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeed3c
 */

void UI_destroy_method(UI_METHOD *ui_method)

{
  if (ui_method == (UI_METHOD *)0x0) {
    return;
  }
  CRYPTO_free_ex_data(0xe,ui_method,(CRYPTO_EX_DATA *)(ui_method + 0x48));
  CRYPTO_free(*(void **)ui_method);
  *(undefined8 *)ui_method = 0;
  CRYPTO_free(ui_method);
  return;
}

