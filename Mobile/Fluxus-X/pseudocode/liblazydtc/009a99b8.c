/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a99b8
 */

undefined8 ssl3_renegotiate_check(long param_1,int param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  if (*(int *)(param_1 + 0x1ac) == 0) {
    uVar2 = 0;
  }
  else {
    iVar1 = RECORD_LAYER_read_pending(param_1 + 0xc58);
    uVar2 = 0;
    if (iVar1 == 0) {
      iVar1 = RECORD_LAYER_write_pending(param_1 + 0xc58);
      uVar2 = 0;
      if (iVar1 == 0) {
        if ((param_2 == 0) && (iVar1 = SSL_in_init(param_1), iVar1 != 0)) {
          return 0;
        }
        ossl_statem_set_renegotiate(param_1);
        uVar2 = 1;
        *(undefined4 *)(param_1 + 0x1ac) = 0;
        *(ulong *)(param_1 + 0x1b0) =
             CONCAT44((int)((ulong)*(undefined8 *)(param_1 + 0x1b0) >> 0x20) + 1,
                      (int)*(undefined8 *)(param_1 + 0x1b0) + 1);
      }
    }
  }
  return uVar2;
}

