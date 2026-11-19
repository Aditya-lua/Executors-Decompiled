/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a9910
 */

void ssl3_write(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  undefined4 *puVar2;
  
  puVar2 = (undefined4 *)__errno();
  *puVar2 = 0;
  if (*(int *)(param_1 + 0x1ac) != 0) {
    iVar1 = RECORD_LAYER_read_pending(param_1 + 0xc58);
    if (((iVar1 == 0) && (iVar1 = RECORD_LAYER_write_pending(param_1 + 0xc58), iVar1 == 0)) &&
       (iVar1 = SSL_in_init(param_1), iVar1 == 0)) {
      ossl_statem_set_renegotiate(param_1);
      *(undefined4 *)(param_1 + 0x1ac) = 0;
      *(ulong *)(param_1 + 0x1b0) =
           CONCAT44((int)((ulong)*(undefined8 *)(param_1 + 0x1b0) >> 0x20) + 1,
                    (int)*(undefined8 *)(param_1 + 0x1b0) + 1);
    }
  }
                    /* WARNING: Could not recover jumptable at 0x009a99b4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*(long *)(param_1 + 8) + 0x70))(param_1,0x17,param_2,param_3,param_4);
  return;
}

