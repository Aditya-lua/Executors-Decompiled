/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009db880
 */

undefined8 ossl_statem_client_pre_work(long param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  switch(*(undefined4 *)(param_1 + 0x5c)) {
  case 1:
    uVar2 = tls_finish_handshake(param_1,param_2,1,1);
    return uVar2;
  case 0xc:
    *(undefined4 *)(param_1 + 0x44) = 0;
    if (((*(byte *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) >> 3 & 1) != 0) &&
       (iVar1 = ssl3_init_finished_mac(), iVar1 == 0)) {
      return 0;
    }
    break;
  case 0x10:
    if (((*(byte *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) >> 3 & 1) != 0) &&
       (*(int *)(param_1 + 0x4d0) != 0)) {
      *(undefined4 *)(param_1 + 0x78) = 0;
    }
    break;
  case 0x2f:
    if (*(int *)(param_1 + 0x84) == 0) {
      return 2;
    }
    if (*(int *)(param_1 + 0x84) == 7) {
      return 2;
    }
  case 0x2e:
    uVar2 = tls_finish_handshake(param_1,param_2,0,1);
    return uVar2;
  }
  return 2;
}

