/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b5414
 */

undefined8 SSL_new_session_ticket(long param_1)

{
  int iVar1;
  
  iVar1 = SSL_in_init();
  if ((((iVar1 == 0) || (*(int *)(param_1 + 0xa9c) != 0)) && (*(long *)(param_1 + 0x240) != 0)) &&
     ((*(long *)(param_1 + 0x2c8) != 0 && (*(int *)(param_1 + 0x38) != 0)))) {
    if ((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) != 0) {
      return 0;
    }
    iVar1 = **(int **)(param_1 + 8);
    if (0x303 < iVar1) {
      if (iVar1 == 0x10000) {
        return 0;
      }
      *(int *)(param_1 + 0xa9c) = *(int *)(param_1 + 0xa9c) + 1;
      iVar1 = RECORD_LAYER_write_pending(param_1 + 0xc58);
      if ((iVar1 == 0) && (iVar1 = SSL_in_init(param_1), iVar1 == 0)) {
        ossl_statem_set_in_init(param_1,1);
        return 1;
      }
      return 1;
    }
  }
  return 0;
}

