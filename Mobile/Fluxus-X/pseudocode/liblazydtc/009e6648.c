/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e6648
 */

undefined8 ossl_statem_server_write_transition(long param_1)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  undefined8 uVar4;
  char *pcVar5;
  int *piVar6;
  undefined4 uVar7;
  
  piVar6 = *(int **)(param_1 + 8);
  uVar3 = *(uint *)(*(long *)(piVar6 + 0x30) + 0x60);
  if ((((uVar3 >> 3 & 1) != 0) || (*piVar6 < 0x304)) || (*piVar6 == 0x10000)) {
    switch(*(undefined4 *)(param_1 + 0x5c)) {
    case 0:
      break;
    case 1:
      if (*(int *)(param_1 + 0x60) == 0x13) {
        *(undefined8 *)(param_1 + 0x5c) = 0x13;
        return 1;
      }
      uVar4 = tls_setup_handshake(param_1);
      if ((int)uVar4 == 0) {
        return uVar4;
      }
      break;
    default:
      ERR_new(2);
      pcVar5 = "ossl_statem_server_write_transition";
      uVar4 = 0x22f;
      goto LAB_009e684c;
    case 0x13:
      goto switchD_009e66a0_caseD_2a;
    case 0x14:
      if ((((uVar3 >> 3 & 1) != 0) && (*(int *)(*(long *)(param_1 + 0x4b8) + 0x108) == 0)) &&
         (uVar3 = SSL_get_options(param_1), (uVar3 >> 0xd & 1) != 0)) {
        uVar7 = 0x15;
        goto LAB_009e6aec;
      }
      if (((*(int *)(param_1 + 0xba0) == 0) && (*(long *)(param_1 + 0x240) != 0)) &&
         (*(long *)(param_1 + 0x2c8) != 0)) goto switchD_009e66a0_caseD_2a;
      goto switchD_009e66a0_caseD_14;
    case 0x15:
    case 0x1a:
      goto switchD_009e66a0_caseD_2e;
    case 0x16:
      if (*(int *)(param_1 + 0x4d0) != 0) {
        if (*(int *)(param_1 + 0xa98) != 0) {
LAB_009e6754:
          uVar7 = 0x21;
          goto LAB_009e6aec;
        }
        goto switchD_009e66d8_caseD_21;
      }
      uVar2 = *(uint *)(*(long *)(param_1 + 0x2e0) + 0x20);
      if ((uVar2 & 0x54) == 0) goto LAB_009e6a5c;
      uVar1 = *(uint *)(*(long *)(param_1 + 0x2e0) + 0x1c);
      if ((uVar1 & 6) == 0) {
        if ((uVar1 & 0x48) == 0) {
          if ((uVar1 & 0x1a0) == 0) goto LAB_009e6a88;
        }
        else if (((uVar1 & 0x1a0) == 0) && (*(long *)(*(long *)(param_1 + 0x898) + 0x200) == 0)) {
LAB_009e6a88:
          uVar1 = *(uint *)(param_1 + 0x968);
          if (((((uVar1 & 1) != 0) &&
               (((((uVar3 >> 3 & 1) != 0 || ((uVar1 >> 3 & 1) == 0)) || (*piVar6 < 0x304)) ||
                ((*piVar6 == 0x10000 || (*(int *)(param_1 + 0xba8) == 3)))))) &&
              (((uVar1 >> 2 & 1) == 0 || (*(int *)(param_1 + 0xbc0) < 1)))) &&
             (((uVar2 & 0x50) == 0 && ((uVar2 & 4) == 0 || (uVar1 & 2) != 0)))) goto LAB_009e6a04;
          goto switchD_009e66d8_caseD_19;
        }
      }
      goto LAB_009e677c;
    case 0x17:
      if (*(int *)(param_1 + 0xa74) != 0) {
        uVar7 = 0x22;
        goto LAB_009e6aec;
      }
    case 0x22:
      uVar2 = *(uint *)(*(long *)(param_1 + 0x2e0) + 0x1c);
      if ((uVar2 & 6) == 0) {
        if ((uVar2 & 0x48) == 0) {
          if ((uVar2 & 0x1a0) == 0) goto switchD_009e66d8_caseD_18;
        }
        else if (((uVar2 & 0x1a0) == 0) && (*(long *)(*(long *)(param_1 + 0x898) + 0x200) == 0)) {
switchD_009e66d8_caseD_18:
          uVar2 = *(uint *)(param_1 + 0x968);
          if (((((uVar2 & 1) == 0) ||
               ((((uVar3 >> 3 & 1) == 0 && ((uVar2 >> 3 & 1) != 0)) &&
                ((0x303 < *piVar6 && ((*piVar6 != 0x10000 && (*(int *)(param_1 + 0xba8) != 3))))))))
              || (((uVar2 >> 2 & 1) != 0 && (0 < *(int *)(param_1 + 0xbc0))))) ||
             ((uVar3 = *(uint *)(*(long *)(param_1 + 0x2e0) + 0x20), (uVar3 & 0x50) != 0 ||
              ((uVar3 & 4) != 0 && (uVar2 & 2) == 0)))) {
switchD_009e66d8_caseD_19:
            uVar7 = 0x1a;
            goto LAB_009e6aec;
          }
          goto LAB_009e6a04;
        }
      }
LAB_009e677c:
      uVar7 = 0x18;
      goto LAB_009e6aec;
    case 0x18:
      goto switchD_009e66d8_caseD_18;
    case 0x19:
      goto switchD_009e66d8_caseD_19;
    case 0x20:
      if (*(int *)(param_1 + 0x4d0) == 0) {
        uVar7 = 0x23;
        if (*(int *)(param_1 + 0xa98) != 0) {
          uVar7 = 0x21;
        }
        goto LAB_009e6aec;
      }
      goto switchD_009e66a0_caseD_2a;
    case 0x21:
switchD_009e66d8_caseD_21:
      uVar7 = 0x23;
      goto LAB_009e6aec;
    case 0x23:
      goto switchD_009e66a0_caseD_28;
    case 0x24:
      if (*(int *)(param_1 + 0x4d0) == 0) goto switchD_009e66a0_caseD_2a;
    }
switchD_009e66d8_caseD_0:
switchD_009e66a0_caseD_2e:
    return 2;
  }
  switch(*(undefined4 *)(param_1 + 0x5c)) {
  case 1:
    if (*(int *)(param_1 + 0xba4) != -1) {
      uVar7 = 0x2a;
      break;
    }
    if (*(int *)(param_1 + 0xba8) != 3) {
      if (0 < *(int *)(param_1 + 0xa9c)) goto LAB_009e6754;
      goto switchD_009e66d8_caseD_0;
    }
    goto LAB_009e6a04;
  default:
    ERR_new(2);
    pcVar5 = "ossl_statem_server13_write_transition";
    uVar4 = 0x1a8;
LAB_009e684c:
    ERR_set_debug("ssl/statem/statem_srvr.c",uVar4,pcVar5);
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
    return 0;
  case 0x14:
switchD_009e66a0_caseD_14:
    uVar7 = 0x16;
    break;
  case 0x16:
    if ((*(byte *)(param_1 + 0x9ea) >> 4 & 1) == 0) {
      if (*(int *)(param_1 + 0x8e8) == 1) goto switchD_009e66a0_caseD_24;
    }
    else if (*(int *)(param_1 + 0x8e8) != 2) goto switchD_009e66d8_caseD_21;
    uVar7 = 0x25;
    break;
  case 0x17:
    uVar7 = 0x28;
    break;
  case 0x19:
    if (*(int *)(param_1 + 0xba8) == 3) {
      *(undefined4 *)(param_1 + 0xba8) = 4;
      uVar7 = 1;
      break;
    }
LAB_009e6a5c:
    uVar7 = 0x17;
    break;
  case 0x20:
    if (*(int *)(param_1 + 0xba8) == 4) {
      *(undefined4 *)(param_1 + 0xba8) = 2;
    }
    else if (*(int *)(param_1 + 0xa98) == 0) goto switchD_009e66a0_caseD_2a;
    uVar7 = 0x21;
    if (*(ulong *)(param_1 + 0x1d70) <= *(ulong *)(param_1 + 0x1d78)) {
      uVar7 = 1;
    }
    break;
  case 0x21:
    if (((*(long *)(param_1 + 0x240) != 0) && (*(long *)(param_1 + 0x2c8) != 0)) &&
       (0 < *(int *)(param_1 + 0xa9c))) {
      return 1;
    }
    if ((*(int *)(param_1 + 0x4d0) == 0) &&
       (*(ulong *)(param_1 + 0x1d78) < *(ulong *)(param_1 + 0x1d70))) {
      return 1;
    }
  case 0x2a:
  case 0x2c:
switchD_009e66a0_caseD_2a:
    *(undefined4 *)(param_1 + 0x5c) = 1;
    return 1;
  case 0x23:
    uVar7 = 0x2e;
    if (*(int *)(param_1 + 0x8e8) != 1) {
      uVar7 = 0x25;
    }
    break;
  case 0x24:
switchD_009e66a0_caseD_24:
    uVar7 = 0x2e;
    break;
  case 0x25:
    if (*(int *)(param_1 + 0x4d0) != 0) goto switchD_009e66a0_caseD_28;
    uVar3 = *(uint *)(param_1 + 0x968);
    if ((((uVar3 & 1) == 0) || (((uVar3 >> 3 & 1) != 0 && (*(int *)(param_1 + 0xba8) != 3)))) ||
       ((((uVar3 >> 2 & 1) != 0 && (0 < *(int *)(param_1 + 0xbc0))) ||
        ((uVar2 = *(uint *)(*(long *)(param_1 + 0x2e0) + 0x20), (uVar2 & 0x50) != 0 ||
         (!((uVar2 & 4) == 0 || (uVar3 & 2) != 0))))))) goto LAB_009e6a5c;
LAB_009e6a04:
    uVar7 = 0x19;
    break;
  case 0x28:
switchD_009e66a0_caseD_28:
    uVar7 = 0x24;
    break;
  case 0x2e:
    goto switchD_009e66a0_caseD_2e;
  }
LAB_009e6aec:
  *(undefined4 *)(param_1 + 0x5c) = uVar7;
  return 1;
}

