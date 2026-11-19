/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad6f60
 */

ulong FUN_00ad6f60(byte *param_1,int param_2,int param_3,long *param_4)

{
  byte bVar1;
  int iVar2;
  int iVar3;
  ulong uVar4;
  EVP_MD *pEVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  long lVar8;
  int *piVar9;
  int *piVar10;
  
  piVar10 = *(int **)(param_1 + 0x98);
  switch(param_2) {
  case 0x1001:
    if (param_3 - 1U < 6) {
      uVar4 = FUN_00ad7924(*(undefined8 *)(piVar10 + 8),param_3);
      if ((int)uVar4 == 0) {
        return uVar4;
      }
      if (param_3 == 6) {
        bVar1 = *param_1 & 0x30;
      }
      else {
        if (**(int **)(param_1 + 0x78) == 0x390) goto LAB_00ad73f8;
        if (param_3 != 4) goto LAB_00ad7464;
        bVar1 = param_1[1] & 6;
      }
      if (bVar1 != 0) {
        if (*(long *)(piVar10 + 8) == 0) {
          pEVar5 = EVP_sha1();
          *(EVP_MD **)(piVar10 + 8) = pEVar5;
        }
LAB_00ad7464:
        piVar10[7] = param_3;
        return 1;
      }
    }
LAB_00ad73f8:
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_pmeth.c",0x1c8,"pkey_rsa_ctrl");
    uVar6 = 0x90;
    break;
  case 0x1002:
  case 0x1007:
    if (piVar10[7] == 6) {
      if (param_2 == 0x1007) {
        iVar2 = piVar10[0xc];
        goto LAB_00ad718c;
      }
      if (param_3 < -3) {
        return 0xfffffffe;
      }
      iVar2 = piVar10[0xd];
      if (iVar2 == -1) goto LAB_00ad74c4;
      if (param_3 == -1) {
        iVar3 = EVP_MD_get_size(*(undefined8 *)(piVar10 + 8));
      }
      else {
        if (param_3 == -2) {
          if (*(int *)param_1 != 0x20) goto LAB_00ad74c4;
          ERR_new();
          uVar6 = 0x1dd;
          goto LAB_00ad7244;
        }
        iVar3 = param_3;
        if (param_3 < 0) goto LAB_00ad74c4;
      }
      if (iVar2 <= iVar3) {
LAB_00ad74c4:
        piVar10[0xc] = param_3;
        return 1;
      }
      ERR_new();
      ERR_set_debug("crypto/rsa/rsa_pmeth.c",0x1e3,"pkey_rsa_ctrl");
      uVar6 = 4;
      uVar7 = 0xa4;
LAB_00ad74b4:
      ERR_set_error(uVar6,uVar7,0);
      return 0;
    }
    ERR_new();
    uVar6 = 0x1d2;
LAB_00ad7244:
    ERR_set_debug("crypto/rsa/rsa_pmeth.c",uVar6,"pkey_rsa_ctrl");
    uVar6 = 0x92;
    break;
  case 0x1003:
    if (0x1ff < param_3) {
      *piVar10 = param_3;
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_pmeth.c",0x1ed,"pkey_rsa_ctrl");
    uVar6 = 0x78;
    break;
  case 0x1004:
    if (((param_4 != (long *)0x0) && (iVar2 = BN_is_odd(param_4), iVar2 != 0)) &&
       (iVar2 = BN_is_one(param_4), iVar2 == 0)) {
      BN_free(*(BIGNUM **)(piVar10 + 2));
      *(long **)(piVar10 + 2) = param_4;
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_pmeth.c",0x1f5,"pkey_rsa_ctrl");
    uVar6 = 0x65;
    break;
  case 0x1005:
  case 0x1008:
    if ((piVar10[7] | 2U) == 6) {
      if (param_2 != 0x1008) {
        if (piVar10[0xd] == -1) {
          *(long **)(piVar10 + 10) = param_4;
          return 1;
        }
        iVar2 = EVP_MD_get_type(*(undefined8 *)(piVar10 + 10));
        iVar3 = EVP_MD_get_type(param_4);
        if (iVar2 == iVar3) {
          return 1;
        }
        ERR_new();
        ERR_set_debug("crypto/rsa/rsa_pmeth.c",0x230,"pkey_rsa_ctrl");
        uVar6 = 4;
        uVar7 = 0x98;
        goto LAB_00ad74b4;
      }
      lVar8 = *(long *)(piVar10 + 10);
      if (lVar8 != 0) goto LAB_00ad7064;
switchD_00ad6fe4_caseD_d:
      lVar8 = *(long *)(piVar10 + 8);
LAB_00ad7064:
      *param_4 = lVar8;
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_pmeth.c",0x224,"pkey_rsa_ctrl");
    uVar6 = 0x9c;
    break;
  case 0x1006:
    iVar2 = piVar10[7];
LAB_00ad718c:
    *(int *)param_4 = iVar2;
    return 1;
  case 0x1009:
  case 0x100b:
    if (piVar10[7] == 4) {
      if (param_2 != 0x100b) {
LAB_00ad7270:
        *(long **)(piVar10 + 8) = param_4;
        return 1;
      }
      goto switchD_00ad6fe4_caseD_d;
    }
    ERR_new();
    uVar6 = 0x207;
    goto LAB_00ad7360;
  case 0x100a:
    if (piVar10[7] == 4) {
      piVar9 = piVar10 + 0x10;
      CRYPTO_free(*(void **)piVar9);
      if ((param_3 < 1) || (param_4 == (long *)0x0)) {
        piVar9[0] = 0;
        piVar9[1] = 0;
        piVar10[0x12] = 0;
        piVar10[0x13] = 0;
        return 1;
      }
      *(long **)(piVar10 + 0x10) = param_4;
      *(long *)(piVar10 + 0x12) = (long)param_3;
      return 1;
    }
    ERR_new();
    uVar6 = 0x239;
    goto LAB_00ad7360;
  case 0x100c:
    if (piVar10[7] == 4) {
      if (param_4 != (long *)0x0) {
        *param_4 = *(long *)(piVar10 + 0x10);
        return (ulong)(uint)piVar10[0x12];
      }
      ERR_new();
      ERR_set_debug("crypto/rsa/rsa_pmeth.c",0x24c,"pkey_rsa_ctrl");
      uVar6 = 6;
      uVar7 = 0xc0102;
      goto LAB_00ad74b4;
    }
    ERR_new();
    uVar6 = 0x248;
LAB_00ad7360:
    ERR_set_debug("crypto/rsa/rsa_pmeth.c",uVar6,"pkey_rsa_ctrl");
    uVar6 = 0x8d;
    break;
  case 0x100d:
    if (param_3 - 2U < 4) {
      piVar10[4] = param_3;
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_pmeth.c",0x1fe,"pkey_rsa_ctrl");
    uVar6 = 0xa5;
    break;
  default:
    switch(param_2) {
    case 1:
      uVar4 = FUN_00ad7924(param_4,piVar10[7]);
      if ((int)uVar4 == 0) {
        return uVar4;
      }
      if (piVar10[0xd] == -1) goto LAB_00ad7270;
      iVar2 = EVP_MD_get_type(*(undefined8 *)(piVar10 + 8));
      iVar3 = EVP_MD_get_type(param_4);
      if (iVar2 == iVar3) {
        return 1;
      }
      ERR_new();
      ERR_set_debug("crypto/rsa/rsa_pmeth.c",0x216,"pkey_rsa_ctrl");
      uVar6 = 4;
      uVar7 = 0x91;
      goto LAB_00ad74b4;
    case 3:
    case 4:
    case 9:
    case 10:
      if (**(int **)(param_1 + 0x78) != 0x390) {
        return 1;
      }
    case 2:
      ERR_new(1);
      ERR_set_debug("crypto/rsa/rsa_pmeth.c",0x263,"pkey_rsa_ctrl");
      uVar6 = 0x94;
      break;
    case 5:
    case 7:
    case 0xb:
      return 1;
    default:
      goto switchD_00ad6fe4_caseD_5;
    case 0xd:
      goto switchD_00ad6fe4_caseD_d;
    }
  }
  ERR_set_error(4,uVar6,0);
switchD_00ad6fe4_caseD_5:
  return 0xfffffffe;
}

