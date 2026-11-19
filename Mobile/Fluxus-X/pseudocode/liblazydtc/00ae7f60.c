/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae7f60
 */

undefined *
SRP_create_verifier_ex
          (long param_1,long param_2,long *param_3,undefined8 *param_4,long param_5,
          undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  int iVar1;
  int iVar2;
  int iVar3;
  undefined8 *puVar4;
  void *ptr;
  BIGNUM *a;
  undefined *puVar5;
  BIGNUM *a_00;
  void *pvVar6;
  BIGNUM *pBVar7;
  BIGNUM *local_1410;
  uchar auStack_1400 [2500];
  uchar auStack_a3c [2500];
  BIGNUM *local_78;
  BIGNUM *local_70 [2];
  
  iVar1 = 0;
  a = (BIGNUM *)0x0;
  puVar5 = (undefined *)0x0;
  local_78 = (BIGNUM *)0x0;
  local_70[0] = (BIGNUM *)0x0;
  if (((param_1 == 0) || (param_2 == 0)) || (param_3 == (long *)0x0)) {
    pvVar6 = (void *)0x0;
    a_00 = (BIGNUM *)0x0;
    goto LAB_00ae8198;
  }
  pvVar6 = (void *)0x0;
  a_00 = (BIGNUM *)0x0;
  if (param_4 == (undefined8 *)0x0) goto LAB_00ae8198;
  if (param_5 == 0) {
    puVar4 = (undefined8 *)SRP_get_default_gN(param_6);
    if (puVar4 == (undefined8 *)0x0) goto LAB_00ae8088;
    pBVar7 = (BIGNUM *)puVar4[1];
    local_1410 = (BIGNUM *)puVar4[2];
    puVar5 = (undefined *)*puVar4;
    a = (BIGNUM *)0x0;
    a_00 = (BIGNUM *)0x0;
LAB_00ae8064:
    if (*param_3 == 0) {
      iVar1 = 0x14;
      iVar2 = RAND_bytes_ex(param_7,auStack_1400,0x14,0);
    }
    else {
      iVar1 = FUN_00ae8258(auStack_1400);
      iVar2 = iVar1;
    }
    if (((0 < iVar2) &&
        (local_70[0] = BN_bin2bn(auStack_1400,iVar1,(BIGNUM *)0x0), local_70[0] != (BIGNUM *)0x0))
       && ((iVar1 = SRP_create_verifier_BN_ex
                              (param_1,param_2,local_70,&local_78,local_1410,pBVar7,param_7,param_8)
           , iVar1 != 0 && (iVar1 = BN_bn2bin(local_78,auStack_a3c), -1 < iVar1)))) {
      iVar2 = BN_num_bits(local_78);
      iVar1 = iVar2 + 0xe;
      if (-1 < iVar2 + 7) {
        iVar1 = iVar2 + 7;
      }
      iVar1 = (iVar1 >> 3) << 1;
      pvVar6 = CRYPTO_malloc(iVar1,"crypto/srp/srp_vfy.c",0x29c);
      if (pvVar6 != (void *)0x0) {
        iVar3 = BN_num_bits(local_78);
        iVar2 = iVar3 + 0xe;
        if (-1 < iVar3 + 7) {
          iVar2 = iVar3 + 7;
        }
        iVar2 = FUN_00ae8568(pvVar6,auStack_a3c,iVar2 >> 3);
        if (iVar2 != 0) {
          if (*param_3 == 0) {
            ptr = CRYPTO_malloc(0x28,"crypto/srp/srp_vfy.c",0x2a4);
            if (ptr == (void *)0x0) goto LAB_00ae8234;
            iVar2 = FUN_00ae8568(ptr,auStack_1400,0x14);
            if (iVar2 == 0) {
              CRYPTO_free(ptr);
              puVar5 = (undefined *)0x0;
              goto LAB_00ae8198;
            }
            *param_3 = (long)ptr;
          }
          *param_4 = pvVar6;
          pvVar6 = (void *)0x0;
          goto LAB_00ae8198;
        }
      }
LAB_00ae8234:
      puVar5 = (undefined *)0x0;
      goto LAB_00ae8198;
    }
  }
  else {
    iVar1 = FUN_00ae8258(auStack_a3c,param_5);
    if (iVar1 < 1) {
LAB_00ae8088:
      a = (BIGNUM *)0x0;
    }
    else {
      a = BN_bin2bn(auStack_a3c,iVar1,(BIGNUM *)0x0);
      if (((a != (BIGNUM *)0x0) && (iVar1 = FUN_00ae8258(auStack_a3c,param_6), 0 < iVar1)) &&
         (a_00 = BN_bin2bn(auStack_a3c,iVar1,(BIGNUM *)0x0), a_00 != (BIGNUM *)0x0)) {
        puVar5 = &DAT_002c8dbd;
        pBVar7 = a_00;
        local_1410 = a;
        goto LAB_00ae8064;
      }
    }
    a_00 = (BIGNUM *)0x0;
  }
  pvVar6 = (void *)0x0;
  puVar5 = (undefined *)0x0;
  iVar1 = 0;
LAB_00ae8198:
  BN_free(a);
  BN_free(a_00);
  CRYPTO_clear_free(pvVar6,(long)iVar1,"crypto/srp/srp_vfy.c",0x2b5);
  BN_clear_free(local_70[0]);
  BN_clear_free(local_78);
  return puVar5;
}

