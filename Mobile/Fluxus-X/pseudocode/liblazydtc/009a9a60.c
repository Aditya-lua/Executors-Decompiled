/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a9a60
 */

ulong FUN_009a9a60(long param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4,
                  undefined8 param_5)

{
  int iVar1;
  undefined4 *puVar2;
  ulong uVar3;
  
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
  *(undefined4 *)(param_1 + 0x1b8) = 1;
  uVar3 = (**(code **)(*(long *)(param_1 + 8) + 0x68))
                    (param_1,0x17,0,param_2,param_3,param_4,param_5);
  if (((int)uVar3 == -1) && (*(int *)(param_1 + 0x1b8) == 2)) {
    ossl_statem_set_in_handshake(param_1,1);
    uVar3 = (**(code **)(*(long *)(param_1 + 8) + 0x68))
                      (param_1,0x17,0,param_2,param_3,param_4,param_5);
    uVar3 = uVar3 & 0xffffffff;
    ossl_statem_set_in_handshake(param_1,0);
  }
  else {
    *(undefined4 *)(param_1 + 0x1b8) = 0;
  }
  return uVar3;
}

