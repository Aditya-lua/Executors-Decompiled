/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009cad04
 */

undefined8 ssl3_write_bytes(long param_1,int param_2,long param_3,ulong param_4,ulong *param_5)

{
  ulong uVar1;
  bool bVar2;
  bool bVar3;
  int iVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  undefined8 uVar8;
  long lVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong *puVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  ulong local_190;
  ulong uStack_188;
  ulong local_170 [32];
  ulong local_70 [2];
  
  uVar16 = *(ulong *)(param_1 + 0x1cb8);
  *(undefined4 *)(param_1 + 0x28) = 1;
  if ((param_4 < uVar16) ||
     ((lVar9 = *(long *)(param_1 + 0xcc8), lVar9 != 0 &&
      (param_4 < *(long *)(param_1 + 0x1cd8) + uVar16)))) {
    ERR_new();
    ERR_set_debug("ssl/record/rec_layer_s3.c",0x185,"ssl3_write_bytes");
    uVar8 = 0x10f;
    goto LAB_009cad88;
  }
  if (*(int *)(param_1 + 0x84) == 4) {
    iVar4 = early_data_count_ok(param_1,param_4,0,1);
    if (iVar4 == 0) {
      return 0xffffffff;
    }
    lVar9 = *(long *)(param_1 + 0xcc8);
  }
  *(undefined8 *)(param_1 + 0x1cb8) = 0;
  if ((lVar9 == 0) && ((*(int *)(param_1 + 0xba4) != -1 || (0 < *(int *)(param_1 + 0xa9c))))) {
    ossl_statem_set_in_init(param_1,1);
  }
  iVar4 = SSL_in_init(param_1);
  if (((iVar4 != 0) && (iVar4 = ossl_statem_get_in_handshake(param_1), iVar4 == 0)) &&
     (*(int *)(param_1 + 0x84) != 6)) {
    uVar8 = (**(code **)(param_1 + 0x30))(param_1);
    if ((int)uVar8 < 0) {
      return uVar8;
    }
    if ((int)uVar8 == 0) {
      return 0xffffffff;
    }
  }
  if (*(long *)(param_1 + 0xcc8) != 0) {
    uVar8 = ssl3_write_pending(param_1,param_2,param_3 + uVar16,*(undefined8 *)(param_1 + 0x1cd8),
                               local_70);
    if ((int)uVar8 < 1) {
LAB_009cb098:
      *(ulong *)(param_1 + 0x1cb8) = uVar16;
      return uVar8;
    }
    uVar16 = local_70[0] + uVar16;
  }
  if (uVar16 == param_4) {
    if (((*(byte *)(param_1 + 0x9f0) >> 4 & 1) != 0) &&
       ((*(byte *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) >> 3 & 1) == 0)) {
      ssl3_release_write_buffer(param_1);
    }
    *param_5 = param_4;
    return 1;
  }
  uVar5 = ssl_get_max_send_fragment(param_1);
  uVar6 = ssl_get_split_send_fragment(param_1);
  uVar17 = *(ulong *)(param_1 + 0xa20);
  if (uVar17 < 0x21) {
    uVar18 = (ulong)uVar6;
    if ((uVar17 == 0) || (*(long *)(param_1 + 0x878) == 0)) {
LAB_009caf10:
      uVar17 = 1;
    }
    else {
      EVP_CIPHER_CTX_get0_cipher();
      uVar7 = EVP_CIPHER_get_flags();
      if (((uVar7 >> 0x17 & 1) == 0) ||
         ((*(byte *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) & 1) == 0)) goto LAB_009caf10;
    }
    if (uVar6 - 1 < uVar5) {
      param_4 = param_4 - uVar16;
      uStack_188 = 1;
      local_190 = 0;
      if (param_4 != 0) goto LAB_009caf88;
LAB_009caf98:
      uVar10 = 1;
      uVar15 = param_4;
      do {
        uVar1 = uVar17;
        if (uVar10 <= uVar17) {
          uVar1 = uVar10;
        }
        uVar10 = 0;
        if (uVar1 != 0) {
          uVar10 = uVar15 / uVar1;
        }
        if (uVar10 < uVar18) {
          if (uVar1 != 0) {
            uVar11 = 0;
            uVar12 = uVar15 - uVar10 * uVar1;
            if (3 < uVar1) {
              uVar11 = uVar1 & 0xfffffffffffffffc;
              uVar14 = uVar11;
              puVar13 = local_170 + 2;
              uVar19 = local_190;
              uVar20 = uStack_188;
              do {
                uVar21 = uVar19 + 2;
                uVar22 = uVar20 + 2;
                bVar2 = uVar19 < uVar12;
                bVar3 = uVar20 < uVar12;
                uVar19 = uVar19 + 4;
                uVar20 = uVar20 + 4;
                uVar14 = uVar14 - 4;
                puVar13[-1] = uVar10 + bVar3;
                puVar13[-2] = uVar10 + bVar2;
                puVar13[1] = uVar10 + (uVar22 < uVar12);
                *puVar13 = uVar10 + (uVar21 < uVar12);
                puVar13 = puVar13 + 4;
              } while (uVar14 != 0);
              if (uVar1 == uVar11) goto LAB_009cb074;
            }
            do {
              uVar14 = uVar10;
              if (uVar11 < uVar12) {
                uVar14 = uVar10 + 1;
              }
              local_170[uVar11] = uVar14;
              uVar11 = uVar11 + 1;
            } while (uVar11 < uVar1);
          }
        }
        else if (uVar1 != 0) {
          uVar10 = 0;
          if (3 < uVar1) {
            uVar10 = uVar1 & 0xfffffffffffffffc;
            uVar11 = uVar10;
            puVar13 = local_170 + 2;
            do {
              puVar13[-1] = uVar18;
              puVar13[-2] = uVar18;
              puVar13[1] = uVar18;
              *puVar13 = uVar18;
              uVar11 = uVar11 - 4;
              puVar13 = puVar13 + 4;
            } while (uVar11 != 0);
            if (uVar1 == uVar10) goto LAB_009cb074;
          }
          do {
            local_170[uVar10] = uVar18;
            uVar10 = uVar10 + 1;
          } while (uVar10 < uVar1);
        }
LAB_009cb074:
        uVar8 = do_ssl3_write(param_1,param_2,param_3 + uVar16,local_170,uVar1,0,local_70);
        if ((int)uVar8 < 1) goto LAB_009cb098;
        param_4 = uVar15 - local_70[0];
        if (param_4 == 0) {
          *(undefined4 *)(param_1 + 0x184) = 0;
          if (((*(byte *)(param_1 + 0x9f0) >> 4 & 1) != 0) &&
             ((*(byte *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) >> 3 & 1) == 0)) {
            ssl3_release_write_buffer(param_1);
          }
LAB_009cb0fc:
          *param_5 = uVar15 + uVar16;
          return 1;
        }
        if ((param_2 == 0x17) && ((*(byte *)(param_1 + 0x9f0) & 1) != 0)) {
          *(undefined4 *)(param_1 + 0x184) = 0;
          uVar15 = local_70[0];
          goto LAB_009cb0fc;
        }
        uVar16 = local_70[0] + uVar16;
        if (param_4 == 0) goto LAB_009caf98;
LAB_009caf88:
        uVar10 = 0;
        if (uVar18 != 0) {
          uVar10 = (param_4 - 1) / uVar18;
        }
        uVar10 = uVar10 + 1;
        uVar15 = param_4;
      } while( true );
    }
    ERR_new();
    uVar8 = 0x267;
  }
  else {
    ERR_new();
    uVar8 = 599;
  }
  ERR_set_debug("ssl/record/rec_layer_s3.c",uVar8,"ssl3_write_bytes");
  uVar8 = 0xc0103;
LAB_009cad88:
  ossl_statem_fatal(param_1,0x50,uVar8,0);
  return 0xffffffff;
}

