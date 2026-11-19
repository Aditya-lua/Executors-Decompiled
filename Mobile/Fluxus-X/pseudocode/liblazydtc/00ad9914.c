/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad9914
 */

undefined8
ossl_rsa_verify(int param_1,uchar *param_2,uint param_3,undefined8 *param_4,size_t *param_5,
               uchar *param_6,long param_7,RSA *param_8)

{
  bool bVar1;
  int iVar2;
  uchar *to;
  size_t __n;
  size_t sVar3;
  undefined8 uVar4;
  size_t sVar5;
  undefined8 uVar6;
  void *local_68;
  size_t local_58;
  
  local_58 = 0;
  sVar3 = (size_t)param_3;
  local_68 = (void *)0x0;
  iVar2 = RSA_size(param_8);
  if (iVar2 != param_7) {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_sign.c",0x154,"ossl_rsa_verify");
    ERR_set_error(4,0x77,0);
    return 0;
  }
  to = CRYPTO_malloc((int)param_7,"crypto/rsa/rsa_sign.c",0x159);
  if (to == (uchar *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_sign.c",0x15b,"ossl_rsa_verify");
    uVar4 = 0xc0100;
LAB_00ad9d04:
    ERR_set_error(4,uVar4,0);
LAB_00ad9d0c:
    sVar5 = 0;
  }
  else {
    iVar2 = RSA_public_decrypt((int)param_7,param_6,to,param_8,1);
    if (iVar2 < 1) goto LAB_00ad9d0c;
    if (param_1 == 0x72) {
      if (iVar2 == 0x24) {
        if (param_4 != (undefined8 *)0x0) {
          *(undefined4 *)(param_4 + 4) = *(undefined4 *)(to + 0x20);
          uVar4 = *(undefined8 *)(to + 0x10);
          sVar3 = 0x24;
          param_4[3] = *(undefined8 *)(to + 0x18);
          param_4[2] = uVar4;
          uVar6 = *(undefined8 *)(to + 8);
          uVar4 = *(undefined8 *)to;
LAB_00ad99d8:
          param_4[1] = uVar6;
          *param_4 = uVar4;
          *param_5 = sVar3;
          uVar4 = 1;
          sVar5 = 0;
          goto switchD_00ad9b08_default;
        }
        if (param_3 != 0x24) {
          ERR_new();
          uVar4 = 0x176;
LAB_00ad9c10:
          ERR_set_debug("crypto/rsa/rsa_sign.c",uVar4,"ossl_rsa_verify");
          uVar4 = 0x83;
          goto LAB_00ad9d04;
        }
        iVar2 = memcmp(to,param_2,0x24);
        if (iVar2 == 0) {
LAB_00ad9cc8:
          uVar4 = 1;
          sVar5 = 0;
          goto switchD_00ad9b08_default;
        }
        ERR_new();
        uVar4 = 0x17b;
      }
      else {
        ERR_new();
        uVar4 = 0x16d;
      }
LAB_00ad9ad4:
      ERR_set_debug("crypto/rsa/rsa_sign.c",uVar4,"ossl_rsa_verify");
      uVar4 = 0x68;
      goto LAB_00ad9d04;
    }
    if ((((param_1 == 0x5f) && (iVar2 == 0x12)) && (*to == '\x04')) && (to[1] == '\x10')) {
      if (param_4 != (undefined8 *)0x0) {
        uVar6 = *(undefined8 *)(to + 10);
        uVar4 = *(undefined8 *)(to + 2);
        sVar3 = 0x10;
        goto LAB_00ad99d8;
      }
      if (param_3 != 0x10) {
        ERR_new();
        uVar4 = 0x18a;
        goto LAB_00ad9c10;
      }
      iVar2 = memcmp(param_2,to + 2,0x10);
      if (iVar2 == 0) goto LAB_00ad9cc8;
      ERR_new();
      uVar4 = 399;
      goto LAB_00ad9ad4;
    }
    __n = (size_t)iVar2;
    if (param_4 != (undefined8 *)0x0) {
      if (param_1 < 0x446) {
        sVar3 = 0x10;
        if (param_1 < 0x75) {
          if (param_1 != 4) {
            if (param_1 == 0x40) {
LAB_00ad9c80:
              sVar3 = 0x14;
              if (0x13 < __n) goto LAB_00ad9b80;
              goto LAB_00ad9ce0;
            }
            bVar1 = param_1 == 0x5f;
LAB_00ad9c74:
            sVar5 = 0;
            uVar4 = 0;
            if (!bVar1) goto switchD_00ad9b08_default;
          }
        }
        else {
          switch(param_1) {
          case 0x2a0:
            goto switchD_00ad9b70_caseD_2a0;
          case 0x2a1:
            goto switchD_00ad9b70_caseD_2a1;
          case 0x2a2:
            goto switchD_00ad9b70_caseD_2a2;
          case 0x2a3:
            sVar3 = 0x1c;
            break;
          default:
            if (param_1 == 0x75) goto LAB_00ad9c80;
            bVar1 = param_1 == 0x101;
            goto LAB_00ad9c74;
          }
        }
        if (sVar3 <= __n) goto LAB_00ad9b80;
      }
      else {
        sVar5 = 0;
        uVar4 = 0;
        switch(param_1) {
        case 0x446:
        case 0x448:
          sVar3 = 0x1c;
          if (0x1b < __n) goto LAB_00ad9b80;
          break;
        case 0x447:
        case 0x449:
switchD_00ad9b70_caseD_2a0:
          sVar3 = 0x20;
          if (0x1f < __n) {
LAB_00ad9b80:
            param_2 = to + (__n - sVar3);
            goto LAB_00ad9b88;
          }
          break;
        case 0x44a:
switchD_00ad9b70_caseD_2a1:
          sVar3 = 0x30;
          if (0x2f < __n) goto LAB_00ad9b80;
          break;
        case 1099:
switchD_00ad9b70_caseD_2a2:
          sVar3 = 0x40;
          if (0x3f < __n) goto LAB_00ad9b80;
          break;
        default:
          goto switchD_00ad9b08_default;
        }
      }
LAB_00ad9ce0:
      ERR_new();
      ERR_set_debug("crypto/rsa/rsa_sign.c",0x1a2,"ossl_rsa_verify");
      uVar4 = 0x8f;
      goto LAB_00ad9d04;
    }
LAB_00ad9b88:
    iVar2 = FUN_00ad9698(&local_68,&local_58,param_1,param_2,sVar3);
    sVar5 = local_58;
    if (iVar2 != 0) {
      if ((local_58 == __n) && (iVar2 = memcmp(local_68,to,__n), iVar2 == 0)) {
        if (param_4 != (undefined8 *)0x0) {
          memcpy(param_4,param_2,sVar3);
          *param_5 = sVar3;
        }
        uVar4 = 1;
        sVar5 = __n;
        goto switchD_00ad9b08_default;
      }
      ERR_new();
      ERR_set_debug("crypto/rsa/rsa_sign.c",0x1ae,"ossl_rsa_verify");
      ERR_set_error(4,0x68,0);
    }
  }
  uVar4 = 0;
switchD_00ad9b08_default:
  CRYPTO_clear_free(local_68,sVar5,"crypto/rsa/rsa_sign.c",0x1bc);
  CRYPTO_clear_free(to,param_7,"crypto/rsa/rsa_sign.c",0x1bd);
  return uVar4;
}

