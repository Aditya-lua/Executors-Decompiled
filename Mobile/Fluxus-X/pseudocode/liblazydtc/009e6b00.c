/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e6b00
 */

undefined8 ossl_statem_server_pre_work(long param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  
  switch(*(undefined4 *)(param_1 + 0x5c)) {
  default:
    goto switchD_009e6b34_caseD_2;
  case 0x13:
    *(undefined4 *)(param_1 + 0x44) = 0;
    if ((*(byte *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) >> 3 & 1) == 0) {
      return 2;
    }
    dtls1_clear_sent_buffer(param_1);
    return 2;
  case 0x15:
    *(undefined4 *)(param_1 + 0x44) = 0;
    if ((*(byte *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) >> 3 & 1) == 0) {
      return 2;
    }
    dtls1_clear_sent_buffer(param_1);
    break;
  case 0x16:
    if ((*(byte *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) >> 3 & 1) == 0) {
      return 2;
    }
    *(undefined4 *)(param_1 + 0x78) = 1;
    return 2;
  case 0x21:
    if ((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0) {
      iVar1 = **(int **)(param_1 + 8);
      if (iVar1 < 0x304) {
        return 2;
      }
      if (iVar1 == 0x10000) {
        return 2;
      }
      if (*(long *)(param_1 + 0x1d78) != 0) {
        return 2;
      }
      if (*(int *)(param_1 + 0xa9c) != 0) {
        return 2;
      }
      uVar2 = 0;
      uVar3 = 0;
      goto LAB_009e6c74;
    }
    break;
  case 0x23:
    lVar4 = *(long *)(*(int **)(param_1 + 8) + 0x30);
    if ((((*(byte *)(lVar4 + 0x60) >> 3 & 1) == 0) &&
        (iVar1 = **(int **)(param_1 + 8), 0x303 < iVar1)) && (iVar1 != 0x10000)) {
      return 2;
    }
    lVar5 = *(long *)(*(long *)(param_1 + 0x918) + 0x2f8);
    if (lVar5 == 0) {
      *(undefined8 *)(*(long *)(param_1 + 0x918) + 0x2f8) = *(undefined8 *)(param_1 + 0x2e0);
    }
    else if (lVar5 != *(long *)(param_1 + 0x2e0)) {
      ERR_new(2);
      ERR_set_debug("ssl/statem/statem_srvr.c",0x2f1,"ossl_statem_server_pre_work");
      ossl_statem_fatal(param_1,0x50,0xc0103,0);
      return 0;
    }
    uVar2 = (**(code **)(lVar4 + 0x10))(param_1);
    if ((int)uVar2 == 0) {
      return uVar2;
    }
    if ((*(byte *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) >> 3 & 1) == 0) {
      return 2;
    }
    break;
  case 0x2e:
    if ((*(int *)(param_1 + 0x84) != 9) && ((*(byte *)(param_1 + 0xa9) >> 3 & 1) == 0)) {
      return 2;
    }
  case 1:
    uVar2 = 1;
    uVar3 = 1;
LAB_009e6c74:
    uVar2 = tls_finish_handshake(param_1,param_2,uVar2,uVar3);
    return uVar2;
  }
  *(undefined4 *)(param_1 + 0x78) = 0;
switchD_009e6b34_caseD_2:
  return 2;
}

