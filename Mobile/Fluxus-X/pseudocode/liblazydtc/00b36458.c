/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b36458
 */

/* WARNING: Type propagation algorithm not settling */

int FUN_00b36458(long *param_1,undefined8 param_2,int param_3)

{
  undefined1 *puVar1;
  undefined8 *puVar2;
  bool bVar3;
  char cVar4;
  int iVar5;
  uint uVar6;
  int iVar7;
  int iVar8;
  RSA *pRVar9;
  undefined8 uVar10;
  BIGNUM *pBVar11;
  ulong uVar12;
  undefined1 uVar13;
  uint uVar14;
  ulong uVar15;
  undefined1 *puVar16;
  undefined4 uVar17;
  undefined8 local_98;
  BIGNUM *local_90;
  BIGNUM *local_88;
  BIGNUM *local_80;
  BIGNUM *local_78;
  BIGNUM *local_70;
  BIGNUM *local_68;
  BIGNUM *local_58;
  
  iVar5 = EVP_PKEY_is_a(param_2,&DAT_002db996);
  if (iVar5 == 0) {
    iVar5 = EVP_PKEY_is_a(param_2,&DAT_002c74e5);
    if (iVar5 == 0) {
      return -1;
    }
    uVar10 = EVP_PKEY_get0_DSA(param_2);
    local_58 = (BIGNUM *)0x0;
    local_70 = (BIGNUM *)0x0;
    local_68 = (BIGNUM *)0x0;
    local_80 = (BIGNUM *)0x0;
    local_78 = (BIGNUM *)0x0;
    DSA_get0_pqg(uVar10,&local_58,&local_68,&local_70);
    DSA_get0_key(uVar10,&local_78,&local_80);
    uVar6 = BN_num_bits(local_58);
    if ((((uVar6 & 7) != 0) || (iVar5 = BN_num_bits(local_68), iVar5 != 0xa0)) ||
       (iVar5 = BN_num_bits(local_70), (int)uVar6 < iVar5)) {
LAB_00b36710:
      ERR_new();
      ERR_set_debug("crypto/pem/pvkfmt.c",0x2c7,"check_bitlen_dsa");
      ERR_set_error(9,0x7e,0);
      return -1;
    }
    if (param_3 == 0) {
      iVar5 = BN_num_bits(local_80);
      if (0xa0 < iVar5) goto LAB_00b36710;
      uVar17 = 0x32535344;
      cVar4 = '\"';
    }
    else {
      iVar5 = BN_num_bits(local_78);
      if ((int)uVar6 < iVar5) goto LAB_00b36710;
      uVar17 = 0x31535344;
      cVar4 = '\"';
    }
    goto joined_r0x00b36a94;
  }
  pRVar9 = (RSA *)EVP_PKEY_get0_RSA(param_2);
  RSA_get0_key(pRVar9,0,&local_58,0);
  iVar5 = BN_num_bits(local_58);
  uVar17 = 0;
  if (iVar5 < 0x21) {
    uVar6 = RSA_bits(pRVar9);
    iVar5 = RSA_size(pRVar9);
    if (param_3 == 0) {
      uVar17 = 0x32415352;
      RSA_get0_key(pRVar9,0,0,&local_68);
      iVar8 = BN_num_bits(local_68);
      iVar7 = iVar8 + 0xe;
      if (-1 < iVar8 + 7) {
        iVar7 = iVar8 + 7;
      }
      if (iVar7 >> 3 <= iVar5) {
        iVar5 = (int)(uVar6 + 0xf) >> 4;
        RSA_get0_factors(pRVar9,&local_70,&local_78);
        RSA_get0_crt_params(pRVar9,&local_88,&local_90,&local_80);
        iVar8 = BN_num_bits(local_80);
        iVar7 = iVar8 + 0xe;
        if (-1 < iVar8 + 7) {
          iVar7 = iVar8 + 7;
        }
        if (iVar7 >> 3 <= iVar5) {
          iVar8 = BN_num_bits(local_70);
          iVar7 = iVar8 + 0xe;
          if (-1 < iVar8 + 7) {
            iVar7 = iVar8 + 7;
          }
          if (iVar7 >> 3 <= iVar5) {
            iVar8 = BN_num_bits(local_78);
            iVar7 = iVar8 + 0xe;
            if (-1 < iVar8 + 7) {
              iVar7 = iVar8 + 7;
            }
            if (iVar7 >> 3 <= iVar5) {
              iVar8 = BN_num_bits(local_88);
              iVar7 = iVar8 + 0xe;
              if (-1 < iVar8 + 7) {
                iVar7 = iVar8 + 7;
              }
              if (iVar7 >> 3 <= iVar5) {
                iVar8 = BN_num_bits(local_90);
                iVar7 = iVar8 + 0xe;
                if (-1 < iVar8 + 7) {
                  iVar7 = iVar8 + 7;
                }
                if (iVar7 >> 3 <= iVar5) goto joined_r0x00b365d0;
              }
            }
          }
        }
      }
      goto LAB_00b364c8;
    }
    uVar17 = 0x31415352;
  }
  else {
LAB_00b364c8:
    ERR_new();
    ERR_set_debug("crypto/pem/pvkfmt.c",0x294,"check_bitlen_rsa");
    ERR_set_error(9,0x7e,0);
    uVar6 = 0;
  }
joined_r0x00b365d0:
  cVar4 = -0x5c;
joined_r0x00b36a94:
  if (uVar6 == 0) {
    return -1;
  }
  uVar14 = uVar6 + 7 >> 3;
  if (cVar4 == '\"') {
    if (param_3 == 0) {
      iVar5 = uVar14 * 2 + 0x50;
    }
    else {
      iVar5 = uVar14 * 3 + 0x3c;
    }
  }
  else {
    if (param_3 == 0) {
      uVar14 = (uVar6 + 0xf >> 4) * 5 + uVar14 * 2;
    }
    iVar5 = uVar14 + 0x14;
  }
  if (param_1 == (long *)0x0) {
    return iVar5;
  }
  puVar16 = (undefined1 *)*param_1;
  if (puVar16 == (undefined1 *)0x0) {
    puVar16 = CRYPTO_malloc(iVar5,"crypto/pem/pvkfmt.c",0x243);
    if (puVar16 == (undefined1 *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/pem/pvkfmt.c",0x244,"do_i2b");
      ERR_set_error(9,0xc0100,0);
      return -1;
    }
    bVar3 = true;
    *param_1 = (long)puVar16;
  }
  else {
    bVar3 = false;
  }
  *(undefined4 *)(puVar16 + 1) = 2;
  uVar13 = 6;
  if (param_3 == 0) {
    uVar13 = 7;
  }
  puVar16[5] = cVar4;
  puVar16[9] = (char)((uint)uVar17 >> 8);
  puVar16[0xc] = (char)uVar6;
  puVar16[10] = (char)((uint)uVar17 >> 0x10);
  puVar16[0xb] = (char)((uint)uVar17 >> 0x18);
  puVar1 = puVar16 + 0x10;
  *(undefined2 *)(puVar16 + 6) = 0;
  puVar16[8] = (char)uVar17;
  puVar16[0xd] = (char)(uVar6 >> 8);
  puVar16[0xe] = (char)(uVar6 >> 0x10);
  *puVar16 = uVar13;
  puVar16[0xf] = (char)(uVar6 >> 0x18);
  if (cVar4 == -0x5c) {
    pRVar9 = (RSA *)EVP_PKEY_get0_RSA();
    iVar7 = RSA_size(pRVar9);
    iVar8 = RSA_bits(pRVar9);
    RSA_get0_key(pRVar9,&local_58,&local_70,&local_68);
    BN_bn2lebinpad(local_70,puVar1,4);
    puVar16 = puVar16 + 0x14;
    BN_bn2lebinpad(local_58,puVar16,iVar7);
    if (param_3 == 0) {
      iVar8 = iVar8 + 0xf >> 4;
      puVar16 = puVar16 + iVar7;
      RSA_get0_factors(pRVar9,&local_78,&local_80);
      RSA_get0_crt_params(pRVar9,&local_90,&local_98,&local_88);
      BN_bn2lebinpad(local_78,puVar16,iVar8);
      puVar16 = puVar16 + iVar8;
      BN_bn2lebinpad(local_80,puVar16,iVar8);
      puVar16 = puVar16 + iVar8;
      BN_bn2lebinpad(local_90,puVar16,iVar8);
      puVar16 = puVar16 + iVar8;
      BN_bn2lebinpad(local_98,puVar16,iVar8);
      BN_bn2lebinpad(local_88,puVar16 + iVar8,iVar8);
      BN_bn2lebinpad(local_68,puVar16 + iVar8 + iVar8,iVar7);
    }
  }
  else {
    uVar10 = EVP_PKEY_get0_DSA(param_2);
    local_58 = (BIGNUM *)0x0;
    local_70 = (BIGNUM *)0x0;
    local_68 = (BIGNUM *)0x0;
    local_80 = (BIGNUM *)0x0;
    local_78 = (BIGNUM *)0x0;
    DSA_get0_pqg(uVar10,&local_58,&local_68,&local_70);
    DSA_get0_key(uVar10,&local_78,&local_80);
    iVar7 = BN_num_bits(local_58);
    uVar6 = iVar7 + 0xe;
    if (-1 < (int)(iVar7 + 7U)) {
      uVar6 = iVar7 + 7U;
    }
    BN_bn2lebinpad(local_58,puVar1,(int)uVar6 >> 3);
    uVar15 = (long)((ulong)uVar6 << 0x20) >> 0x23;
    puVar1 = puVar1 + uVar15;
    BN_bn2lebinpad(local_68,puVar1,0x14);
    puVar1 = puVar1 + 0x14;
    BN_bn2lebinpad(local_70,puVar1,(int)uVar6 >> 3);
    puVar1 = puVar1 + uVar15;
    if (param_3 == 0) {
      uVar12 = 0x14;
      uVar15 = 0x14;
      pBVar11 = local_80;
    }
    else {
      uVar12 = uVar15 & 0xffffffff;
      pBVar11 = local_78;
    }
    BN_bn2lebinpad(pBVar11,puVar1,uVar12);
    puVar2 = (undefined8 *)(puVar1 + uVar15);
    puVar2[1] = 0xffffffffffffffff;
    puVar2[2] = 0xffffffffffffffff;
    *puVar2 = 0xffffffffffffffff;
  }
  if (bVar3) {
    return iVar5;
  }
  *param_1 = *param_1 + (long)iVar5;
  return iVar5;
}

