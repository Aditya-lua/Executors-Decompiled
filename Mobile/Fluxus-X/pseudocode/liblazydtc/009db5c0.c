/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009db5c0
 */

undefined4 ossl_statem_client_write_transition(long param_1)

{
  uint uVar1;
  bool bVar2;
  int iVar3;
  undefined8 uVar4;
  char *pcVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  
  uVar1 = *(uint *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60);
  if ((((uVar1 >> 3 & 1) == 0) && (iVar3 = **(int **)(param_1 + 8), 0x303 < iVar3)) &&
     (iVar3 != 0x10000)) {
    switch(*(undefined4 *)(param_1 + 0x5c)) {
    case 1:
      if (*(int *)(param_1 + 0xba4) == -1) {
        return 2;
      }
      uVar6 = 0x2b;
      break;
    default:
      ERR_new();
      pcVar5 = "ossl_statem_client13_write_transition";
      uVar4 = 0x1a3;
      goto LAB_009db814;
    case 7:
      if (*(int *)(param_1 + 0xba8) != 4) {
        if ((*(byte *)(param_1 + 0x44) & 1) == 0) {
          ERR_new();
          pcVar5 = "ossl_statem_client13_write_transition";
          uVar4 = 0x1b1;
          goto LAB_009db814;
        }
        goto switchD_009db614_caseD_9;
      }
      uVar6 = 0xd;
      break;
    case 9:
    case 0x12:
    case 0x2b:
    case 0x2d:
      goto switchD_009db614_caseD_9;
    case 0xb:
      if ((*(uint *)(param_1 + 0x84) | 4) != 7) {
        if (((*(byte *)(param_1 + 0x9ea) >> 4 & 1) != 0) && (*(int *)(param_1 + 0x8e8) == 0))
        goto switchD_009db64c_caseD_f;
        goto switchD_009db614_caseD_10;
      }
      uVar6 = 0x2f;
      break;
    case 0xd:
      uVar7 = 0x12;
      uVar6 = 0xf;
      bVar2 = *(int *)(param_1 + 0x2f0) == 1;
      goto LAB_009db864;
    case 0xf:
      goto switchD_009db614_caseD_f;
    case 0x10:
    case 0x30:
switchD_009db614_caseD_10:
      uVar7 = 0xd;
      uVar6 = 0x12;
      bVar2 = *(int *)(param_1 + 0x2f0) == 0;
      goto LAB_009db864;
    case 0x2f:
      if (*(int *)(param_1 + 0xb30) != 2) goto switchD_009db614_caseD_10;
      uVar6 = 0x30;
    }
    goto LAB_009db868;
  }
  uVar6 = 2;
  switch(*(undefined4 *)(param_1 + 0x5c)) {
  case 0:
  case 2:
    goto switchD_009db64c_caseD_0;
  case 1:
    if (*(int *)(param_1 + 0xba0) == 0) {
      return 2;
    }
    goto switchD_009db64c_caseD_0;
  case 3:
    if (((*(byte *)(param_1 + 0x9ea) >> 4 & 1) != 0) && (*(int *)(param_1 + 0x84) != 7))
    goto switchD_009db64c_caseD_f;
    goto switchD_009db64c_caseD_0;
  default:
    ERR_new();
    pcVar5 = "ossl_statem_client_write_transition";
    uVar4 = 0x1ff;
LAB_009db814:
    ERR_set_debug("ssl/statem/statem_clnt.c",uVar4,pcVar5);
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
    return 0;
  case 8:
    uVar6 = 0xd;
    if (*(int *)(param_1 + 0x2f0) == 0) {
      uVar6 = 0xe;
    }
    break;
  case 0xb:
    if (*(int *)(param_1 + 0x4d0) == 0) goto switchD_009db614_caseD_9;
  case 0xf:
switchD_009db64c_caseD_f:
    uVar6 = 0x10;
    break;
  case 0xc:
    if (*(int *)(param_1 + 0x84) != 2) {
      return 2;
    }
    uVar7 = 0x10;
    uVar6 = 0x2e;
    bVar2 = (*(ulong *)(param_1 + 0x9e8) & 0x100000) == 0;
LAB_009db864:
    if (!bVar2) {
      uVar6 = uVar7;
    }
    break;
  case 0xd:
    uVar6 = 0xe;
    break;
  case 0xe:
    uVar6 = 0xf;
    if (*(int *)(param_1 + 0x2f0) != 1 || (*(ulong *)(param_1 + 0xa8) & 0x10) != 0) {
      uVar6 = 0x10;
    }
    *(undefined4 *)(param_1 + 0x5c) = uVar6;
    return 1;
  case 0x10:
    if (*(int *)(param_1 + 0x8e8) == 1) goto switchD_009db64c_caseD_0;
    if (*(int *)(param_1 + 0x84) == 2) {
      uVar6 = 0x2e;
    }
    else {
      if (((uVar1 >> 3 & 1) != 0) || (*(int *)(param_1 + 0x484) == 0))
      goto switchD_009db614_caseD_f;
      uVar6 = 0x11;
    }
    break;
  case 0x11:
switchD_009db614_caseD_f:
    uVar6 = 0x12;
    break;
  case 0x12:
    if (*(int *)(param_1 + 0x4d0) == 0) {
      return 2;
    }
switchD_009db614_caseD_9:
LAB_009db83c:
    *(undefined4 *)(param_1 + 0x5c) = 1;
    return 1;
  case 0x29:
    iVar3 = ssl3_renegotiate_check(param_1,1);
    if (iVar3 == 0) goto LAB_009db83c;
    iVar3 = tls_setup_handshake(param_1);
    if (iVar3 == 0) {
      return 0;
    }
switchD_009db64c_caseD_0:
    uVar6 = 0xc;
    break;
  case 0x2e:
    goto switchD_009db64c_caseD_2e;
  }
LAB_009db868:
  *(undefined4 *)(param_1 + 0x5c) = uVar6;
  uVar6 = 1;
switchD_009db64c_caseD_2e:
  return uVar6;
}

