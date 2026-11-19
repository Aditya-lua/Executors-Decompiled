/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b8aec
 */

undefined8 SSL_free_buffers(long param_1)

{
  int iVar1;
  undefined8 uVar2;
  
  param_1 = param_1 + 0xc58;
  iVar1 = RECORD_LAYER_read_pending(param_1);
  uVar2 = 0;
  if (iVar1 == 0) {
    iVar1 = RECORD_LAYER_write_pending(param_1);
    uVar2 = 0;
    if (iVar1 == 0) {
      iVar1 = RECORD_LAYER_data_present(param_1);
      uVar2 = 0;
      if (iVar1 == 0) {
        RECORD_LAYER_release(param_1);
        uVar2 = 1;
      }
    }
  }
  return uVar2;
}

