/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b655c0
 */

ulong ossl_cipher_generic_block_update
                (long param_1,long param_2,ulong *param_3,ulong param_4,long param_5,ulong param_6)

{
  undefined8 *puVar1;
  byte bVar2;
  ulong uVar3;
  bool bVar4;
  int iVar5;
  undefined8 uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  long *plVar11;
  undefined1 uVar12;
  ulong uVar13;
  ulong local_60;
  long local_58;
  
  bVar2 = *(byte *)(param_1 + 0x6c);
  local_60 = param_6;
  local_58 = param_5;
  if ((bVar2 >> 3 & 1) == 0) {
    ERR_new();
    ERR_set_debug("providers/implementations/ciphers/ciphercommon.c",0x101,
                  "ossl_cipher_generic_block_update");
    uVar6 = 0x72;
    goto LAB_00b657d4;
  }
  uVar10 = *(ulong *)(param_1 + 0x58);
  if (*(int *)(param_1 + 0x70) == 0) {
    plVar11 = (long *)(param_1 + 0x60);
    if (*plVar11 == 0) {
      param_6 = -uVar10 & param_6;
      if (uVar10 == 0) goto LAB_00b65720;
LAB_00b65738:
      uVar3 = 0;
joined_r0x00b6573c:
      if (param_6 == 0) goto joined_r0x00b658dc;
      if ((((*(byte *)(param_1 + 0x6c) & 3) == 1) && (param_6 == local_60)) &&
         (bVar4 = param_6 < uVar10, param_6 = param_6 - uVar10, bVar4)) {
        ERR_new();
        uVar6 = 0x16c;
      }
      else {
        uVar3 = param_6 + uVar3;
        if (uVar3 <= param_4) {
          if (param_6 == 0) {
joined_r0x00b658dc:
            if (local_60 == 0) {
              uVar10 = 1;
            }
            else {
              uVar10 = ossl_cipher_trailingdata(param_1 + 0x10,plVar11,uVar10,&local_58,&local_60);
              if ((int)uVar10 == 0) {
                return uVar10;
              }
              uVar10 = (ulong)(local_60 == 0);
            }
            *param_3 = uVar3;
            return uVar10;
          }
          iVar5 = (**(code **)(*(long *)(param_1 + 0xa8) + 8))(param_1,param_2,local_58,param_6);
          if (iVar5 != 0) {
            local_58 = local_58 + param_6;
            local_60 = local_60 - param_6;
            goto joined_r0x00b658dc;
          }
          ERR_new();
          uVar6 = 0x179;
          goto LAB_00b656cc;
        }
        ERR_new();
        uVar6 = 0x173;
      }
    }
    else {
      param_6 = ossl_cipher_fillblock(param_1 + 0x10,plVar11,uVar10,&local_58,&local_60);
      if (*(ulong *)(param_1 + 0x60) != uVar10) goto LAB_00b65738;
LAB_00b65720:
      if (((*(byte *)(param_1 + 0x6c) & 3) == 1) && (local_60 == 0)) goto LAB_00b65738;
      if (uVar10 <= param_4) {
        iVar5 = (**(code **)(*(long *)(param_1 + 0xa8) + 8))(param_1,param_2,param_1 + 0x10,uVar10);
        if (iVar5 == 0) {
          ERR_new();
          uVar6 = 0x162;
          goto LAB_00b656cc;
        }
        param_2 = param_2 + uVar10;
        *plVar11 = 0;
        uVar3 = uVar10;
        goto joined_r0x00b6573c;
      }
      ERR_new();
      uVar6 = 0x15e;
    }
    ERR_set_debug("providers/implementations/ciphers/ciphercommon.c",uVar6,
                  "ossl_cipher_generic_block_update");
    uVar6 = 0x6a;
  }
  else {
    if ((((param_5 == param_2) && (param_5 != 0)) && (param_6 <= param_4)) && ((bVar2 & 1) != 0)) {
      if ((bVar2 >> 1 & 1) == 0) {
        local_60 = param_6;
LAB_00b65654:
        uVar13 = local_60;
        uVar3 = 0;
        if (uVar10 != 0) {
          uVar3 = local_60 / uVar10;
        }
        if (local_60 == uVar3 * uVar10) {
          iVar5 = (**(code **)(*(long *)(param_1 + 0xa8) + 8))(param_1,param_5,param_5,local_60);
          if (iVar5 == 0) {
            ERR_new();
            uVar6 = 0x13a;
          }
          else {
            if (*(int *)(param_1 + 0x80) != 0) {
              CRYPTO_free(*(void **)(param_1 + 0x78));
              *(undefined4 *)(param_1 + 0x80) = 0;
              *(undefined8 *)(param_1 + 0x78) = 0;
            }
            *param_3 = uVar13;
            if (((*(byte *)(param_1 + 0x6c) >> 1 & 1) != 0) ||
               (iVar5 = ossl_cipher_tlsunpadblock
                                  (*(undefined8 *)(param_1 + 0xb8),*(undefined4 *)(param_1 + 0x70),
                                   param_5,param_3,uVar10,param_1 + 0x78,(int *)(param_1 + 0x80),
                                   *(undefined8 *)(param_1 + 0x88),0), iVar5 != 0)) {
              return 1;
            }
            ERR_new();
            uVar6 = 0x14b;
          }
        }
        else {
          ERR_new();
          uVar6 = 0x133;
        }
      }
      else {
        uVar3 = 0;
        if (uVar10 != 0) {
          uVar3 = param_6 / uVar10;
        }
        uVar13 = uVar10 - (param_6 - uVar3 * uVar10);
        uVar3 = uVar13 + param_6;
        if (param_4 < uVar3) {
          ERR_new();
          uVar6 = 0x11d;
        }
        else {
          if (uVar13 < 0x101) {
            uVar12 = (undefined1)(uVar13 - 1);
            if (*(int *)(param_1 + 0x70) == 0x300) {
              if (1 < uVar13) {
                memset((void *)(param_5 + param_6),0,uVar13 - 1);
              }
              *(undefined1 *)(param_5 + param_6 + uVar13 + -1) = uVar12;
            }
            else if (param_6 < uVar3) {
              if (uVar13 < 0x20) {
                uVar7 = param_6;
              }
              else {
                uVar8 = uVar13 & 0xffffffffffffffe0;
                uVar9 = 0;
                uVar7 = uVar8 + param_6;
                do {
                  puVar1 = (undefined8 *)(param_5 + param_6 + uVar9);
                  uVar9 = uVar9 + 0x20;
                  puVar1[1] = CONCAT17(uVar12,CONCAT16(uVar12,CONCAT15(uVar12,CONCAT14(uVar12,
                                                  CONCAT13(uVar12,CONCAT12(uVar12,CONCAT11(uVar12,
                                                  uVar12)))))));
                  *puVar1 = CONCAT17(uVar12,CONCAT16(uVar12,CONCAT15(uVar12,CONCAT14(uVar12,CONCAT13
                                                  (uVar12,CONCAT12(uVar12,CONCAT11(uVar12,uVar12))))
                                                  )));
                  puVar1[3] = CONCAT17(uVar12,CONCAT16(uVar12,CONCAT15(uVar12,CONCAT14(uVar12,
                                                  CONCAT13(uVar12,CONCAT12(uVar12,CONCAT11(uVar12,
                                                  uVar12)))))));
                  puVar1[2] = CONCAT17(uVar12,CONCAT16(uVar12,CONCAT15(uVar12,CONCAT14(uVar12,
                                                  CONCAT13(uVar12,CONCAT12(uVar12,CONCAT11(uVar12,
                                                  uVar12)))))));
                } while (uVar9 != uVar8);
                if (uVar13 == uVar8) goto LAB_00b65a4c;
              }
              do {
                *(undefined1 *)(param_5 + uVar7) = uVar12;
                uVar7 = uVar7 + 1;
              } while (uVar7 < uVar3);
            }
LAB_00b65a4c:
            local_60 = uVar3;
            goto LAB_00b65654;
          }
          ERR_new();
          uVar6 = 0x122;
        }
      }
    }
    else {
      ERR_new();
      uVar6 = 0x110;
    }
LAB_00b656cc:
    ERR_set_debug("providers/implementations/ciphers/ciphercommon.c",uVar6,
                  "ossl_cipher_generic_block_update");
    uVar6 = 0x66;
  }
LAB_00b657d4:
  ERR_set_error(0x39,uVar6,0);
  return 0;
}

