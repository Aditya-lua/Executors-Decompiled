/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009db928
 */

undefined8 ossl_statem_client_post_work(long param_1)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  long lVar4;
  undefined4 uVar5;
  
  *(undefined8 *)(param_1 + 0x98) = 0;
  switch(*(undefined4 *)(param_1 + 0x5c)) {
  case 0xc:
    if ((*(int *)(param_1 + 0x84) == 2) && (*(int *)(param_1 + 0x1d40) != 0)) {
      if (((*(byte *)(param_1 + 0x9ea) >> 4 & 1) == 0) &&
         (uVar2 = tls13_change_cipher_state(param_1,0x52), (int)uVar2 == 0)) {
        return uVar2;
      }
    }
    else {
      iVar1 = statem_flush(param_1);
      if (iVar1 == 0) {
        return 3;
      }
    }
    if ((*(byte *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) >> 3 & 1) == 0) {
      return 2;
    }
    *(undefined4 *)(param_1 + 0xa08) = 1;
    return 2;
  default:
    goto LAB_009dbac0;
  case 0xe:
    uVar2 = tls_client_key_exchange_post_work(param_1);
    iVar1 = (int)uVar2;
    break;
  case 0x10:
    lVar3 = *(long *)(*(int **)(param_1 + 8) + 0x30);
    if ((((*(byte *)(lVar3 + 0x60) >> 3 & 1) == 0) &&
        (iVar1 = **(int **)(param_1 + 8), 0x303 < iVar1)) && (iVar1 != 0x10000)) {
      return 2;
    }
    if (*(int *)(param_1 + 0x8e8) == 1) {
      return 2;
    }
    if ((*(int *)(param_1 + 0x84) != 2) || (*(int *)(param_1 + 0x1d40) == 0)) {
      lVar4 = *(long *)(param_1 + 0x918);
      *(undefined8 *)(lVar4 + 0x2f8) = *(undefined8 *)(param_1 + 0x2e0);
      uVar5 = 0;
      if (*(undefined4 **)(param_1 + 0x340) != (undefined4 *)0x0) {
        uVar5 = **(undefined4 **)(param_1 + 0x340);
      }
      *(undefined4 *)(lVar4 + 0x2f4) = uVar5;
      uVar2 = (**(code **)(lVar3 + 0x10))(param_1);
      if ((int)uVar2 == 0) {
        return uVar2;
      }
      uVar2 = (**(code **)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x20))(param_1,0x12);
      if ((int)uVar2 == 0) {
        return uVar2;
      }
      if ((*(byte *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) >> 3 & 1) == 0) {
        return 2;
      }
      dtls1_reset_seq_numbers(param_1,2);
      return 2;
    }
    uVar2 = tls13_change_cipher_state(param_1,0x52);
    iVar1 = (int)uVar2;
    break;
  case 0x12:
    iVar1 = statem_flush(param_1);
    if (iVar1 != 1) {
      return 4;
    }
    if ((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) != 0) {
      return 2;
    }
    iVar1 = **(int **)(param_1 + 8);
    if (iVar1 < 0x304) {
      return 2;
    }
    if (iVar1 == 0x10000) {
      return 2;
    }
    uVar2 = tls13_save_handshake_digest_for_pha(param_1);
    if ((int)uVar2 == 0) {
      return uVar2;
    }
    if (*(int *)(param_1 + 0xba8) == 4) {
      return 2;
    }
    uVar2 = (**(code **)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x20))(param_1,0x112);
    iVar1 = (int)uVar2;
    break;
  case 0x2b:
    iVar1 = statem_flush(param_1);
    if (iVar1 != 1) {
      return 3;
    }
    uVar2 = tls13_update_key(param_1,1);
    iVar1 = (int)uVar2;
    break;
  case 0x30:
    EVP_CIPHER_CTX_free(*(EVP_CIPHER_CTX **)(param_1 + 0x878));
    *(undefined8 *)(param_1 + 0x878) = 0;
    goto LAB_009dbac0;
  }
  if (iVar1 == 0) {
    return uVar2;
  }
LAB_009dbac0:
  return 2;
}

