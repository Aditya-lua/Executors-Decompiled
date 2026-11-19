/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b19c68
 */

ulong FUN_00b19c68(long param_1,int param_2,long param_3,BIO *param_4)

{
  int iVar1;
  char *pcVar2;
  void *pvVar3;
  void *ptr;
  uint uVar4;
  BIO_METHOD *pBVar5;
  int *piVar6;
  long *plVar7;
  ulong uVar8;
  
  if (0x9a < param_2 - 1U) goto switchD_00b19ca4_caseD_3;
  piVar6 = *(int **)(param_1 + 0x40);
  uVar8 = 1;
  switch(param_2) {
  case 1:
    *piVar6 = 1;
    if (*(int *)(param_1 + 0x38) != -1) {
      BIO_closesocket();
      *(undefined4 *)(param_1 + 0x38) = 0xffffffff;
    }
    BIO_ADDRINFO_free(*(undefined8 *)(piVar6 + 8));
    uVar8 = 0;
    piVar6[8] = 0;
    piVar6[9] = 0;
    *(undefined4 *)(param_1 + 0x30) = 0;
    break;
  case 2:
    uVar8 = (ulong)(*(uint *)(param_1 + 0x30) >> 0xb & 1);
    break;
  default:
    goto switchD_00b19ca4_caseD_3;
  case 8:
    uVar8 = (ulong)*(int *)(param_1 + 0x2c);
    break;
  case 9:
    *(int *)(param_1 + 0x2c) = (int)param_3;
    uVar8 = 1;
    break;
  case 0xb:
    break;
  case 0xc:
    if (*(void **)(piVar6 + 2) != (void *)0x0) {
      BIO_ctrl(param_4,100,0,*(void **)(piVar6 + 2));
    }
    if (*(void **)(piVar6 + 4) != (void *)0x0) {
      BIO_ctrl(param_4,100,1,*(void **)(piVar6 + 4));
    }
    BIO_int_ctrl(param_4,100,3,piVar6[1]);
    BIO_ctrl(param_4,0x9b,(long)piVar6[6],(void *)0x0);
    BIO_callback_ctrl(param_4,0xe,*(fp **)(piVar6 + 0xc));
    uVar8 = 1;
    break;
  case 0xf:
    pBVar5 = *(BIO_METHOD **)(piVar6 + 0xc);
    goto LAB_00b19e40;
  case 100:
    if (param_4 == (BIO *)0x0) {
      return 1;
    }
    *(undefined4 *)(param_1 + 0x28) = 1;
    switch(param_3) {
    case 0:
      plVar7 = (long *)(piVar6 + 4);
      pvVar3 = (void *)*plVar7;
      piVar6 = piVar6 + 2;
      CRYPTO_free(*(void **)piVar6);
      piVar6[0] = 0;
      piVar6[1] = 0;
      iVar1 = BIO_parse_hostserv(param_4,piVar6,plVar7,0);
      if (pvVar3 == (void *)*plVar7) {
        return (long)iVar1;
      }
      CRYPTO_free(pvVar3);
      return (long)iVar1;
    case 1:
      CRYPTO_free(*(void **)(piVar6 + 4));
      pcVar2 = CRYPTO_strdup((char *)param_4,"crypto/bio/bss_conn.c",0x1d3);
      *(char **)(piVar6 + 4) = pcVar2;
      return (ulong)(pcVar2 != (char *)0x0);
    case 2:
      pvVar3 = (void *)BIO_ADDR_hostname_string(param_4,1);
      ptr = (void *)BIO_ADDR_service_string(param_4,1);
      if ((pvVar3 != (void *)0x0) && (ptr != (void *)0x0)) {
        CRYPTO_free(*(void **)(piVar6 + 2));
        *(void **)(piVar6 + 2) = pvVar3;
        CRYPTO_free(*(void **)(piVar6 + 4));
        *(void **)(piVar6 + 4) = ptr;
        BIO_ADDRINFO_free(*(undefined8 *)(piVar6 + 8));
        piVar6[8] = 0;
        piVar6[9] = 0;
        piVar6[10] = 0;
        piVar6[0xb] = 0;
        return 1;
      }
      CRYPTO_free(pvVar3);
      CRYPTO_free(ptr);
      break;
    case 3:
      piVar6[1] = *(int *)&param_4->method;
      return 1;
    }
    goto switchD_00b19ca4_caseD_3;
  case 0x65:
    if (*piVar6 == 5) {
      uVar8 = 1;
    }
    else {
      iVar1 = FUN_00b1a170(param_1,piVar6);
      uVar8 = (ulong)iVar1;
    }
    break;
  case 0x66:
    if (param_3 == 0) {
      uVar4 = piVar6[6] & 0xfffffff7;
    }
    else {
      uVar4 = piVar6[6] | 8;
    }
    piVar6[6] = uVar4;
    uVar8 = 1;
    break;
  case 0x69:
    if (*(int *)(param_1 + 0x28) != 0) {
      if (param_4 == (BIO *)0x0) {
        return (long)*(int *)(param_1 + 0x38);
      }
      *(int *)&param_4->method = *(int *)(param_1 + 0x38);
      return (long)*(int *)(param_1 + 0x38);
    }
LAB_00b19fa8:
    uVar8 = 0xffffffffffffffff;
    break;
  case 0x7b:
    if (param_4 != (BIO *)0x0) {
      switch(param_3) {
      case 0:
        pBVar5 = *(BIO_METHOD **)(piVar6 + 2);
        break;
      case 1:
        pBVar5 = *(BIO_METHOD **)(piVar6 + 4);
        break;
      case 2:
        pBVar5 = (BIO_METHOD *)BIO_ADDRINFO_address(*(undefined8 *)(piVar6 + 10));
        param_4->method = pBVar5;
        return 1;
      case 3:
        iVar1 = BIO_ADDRINFO_family(*(undefined8 *)(piVar6 + 10));
        if (iVar1 == 0) {
          return (long)piVar6[1];
        }
        if (iVar1 == 10) {
          return 6;
        }
        if (iVar1 == 2) {
          return 4;
        }
        goto LAB_00b19fa8;
      default:
        goto switchD_00b19ca4_caseD_3;
      }
LAB_00b19e40:
      param_4->method = pBVar5;
      return 1;
    }
switchD_00b19ca4_caseD_3:
    uVar8 = 0;
    break;
  case 0x9b:
    piVar6[6] = (int)param_3;
    uVar8 = 1;
  }
  return uVar8;
}

