/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aed8b8
 */

void UI_free(UI *ui)

{
  if (ui == (UI *)0x0) {
    return;
  }
  if (((byte)ui[0x28] >> 1 & 1) != 0) {
    (**(code **)(*(long *)ui + 0x38))(ui,*(undefined8 *)(ui + 0x10));
  }
  OPENSSL_sk_pop_free(*(undefined8 *)(ui + 8),FUN_00aed930);
  CRYPTO_free_ex_data(0xb,ui,(CRYPTO_EX_DATA *)(ui + 0x18));
  CRYPTO_THREAD_lock_free(*(undefined8 *)(ui + 0x30));
  CRYPTO_free(ui);
  return;
}

