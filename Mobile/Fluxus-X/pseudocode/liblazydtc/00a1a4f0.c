/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1a4f0
 */

undefined4
BN_generate_prime_ex2
          (BIGNUM *param_1,int param_2,int param_3,BIGNUM *param_4,BIGNUM *param_5,int *param_6,
          BN_CTX *param_7)

{
  uint uVar1;
  long lVar2;
  ulong uVar3;
  ulong w;
  ushort uVar4;
  ulong uVar5;
  bool bVar6;
  int iVar7;
  void *ptr;
  BIGNUM *r;
  BIGNUM *rem;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  undefined8 uVar11;
  uint uVar12;
  uint uVar13;
  uint uVar14;
  ulong uVar15;
  ulong uVar16;
  undefined4 uVar17;
  ulong uVar18;
  int local_78;
  
  uVar12 = 0x80;
  if (param_2 < 0x801) {
    uVar12 = 0x40;
  }
  if (param_2 < 2) {
    ERR_new();
    uVar11 = 0x87;
  }
  else {
    if ((((param_2 == 3) || (5 < param_2)) || (param_3 == 0)) || (param_4 != (BIGNUM *)0x0)) {
      ptr = (void *)CRYPTO_zalloc(0x1000,"crypto/bn/bn_prime.c",0x93);
      if (ptr != (void *)0x0) {
        BN_CTX_start(param_7);
        r = BN_CTX_get(param_7);
        if (r == (BIGNUM *)0x0) {
LAB_00a1ab8c:
          uVar17 = 0;
LAB_00a1ab90:
          CRYPTO_free(ptr);
          BN_CTX_end(param_7);
          return uVar17;
        }
        uVar13 = 0x400;
        if (0x1000 < param_2) {
          uVar13 = 0x800;
        }
        bVar6 = param_3 == 0;
        lVar2 = 4;
        if (bVar6) {
          lVar2 = 2;
        }
        uVar3 = 3;
        if (!bVar6) {
          uVar3 = 5;
        }
        w = 3;
        if (bVar6) {
          w = 1;
        }
        uVar14 = 0x40;
        if (0x200 < param_2) {
          uVar14 = 0x80;
        }
        uVar1 = 0x180;
        if (0x800 < param_2) {
          uVar1 = uVar13;
        }
        if (0x400 < param_2) {
          uVar14 = uVar1;
        }
        uVar16 = (ulong)uVar14;
        local_78 = 0;
        do {
          if (param_4 == (BIGNUM *)0x0) {
            iVar7 = BN_priv_rand_ex(param_1,param_2,1,1,0,param_7);
            if (iVar7 != 0) {
              uVar4 = *(ushort *)(&UNK_00753948 + (uVar16 - 1) * 2);
              do {
                if ((param_3 != 0) && (iVar7 = BN_set_bit(param_1,1), iVar7 == 0))
                goto LAB_00a1ab8c;
                uVar8 = 1;
                do {
                  uVar18 = BN_mod_word(param_1,(ulong)*(ushort *)(&UNK_00753948 + uVar8 * 2));
                  if (uVar18 == 0xffffffffffffffff) goto LAB_00a1ab8c;
                  *(short *)((long)ptr + uVar8 * 2) = (short)uVar18;
                  uVar8 = uVar8 + 1;
                } while (uVar8 < uVar16);
                uVar8 = 0;
                do {
                  uVar18 = 1;
                  while( true ) {
                    uVar9 = (ulong)*(ushort *)(&UNK_00753948 + uVar18 * 2);
                    if ((param_2 < 0x20 && uVar8 >> 0x1f == 0) &&
                       (uVar15 = BN_get_word(param_1), uVar15 + uVar8 < uVar9 * uVar9))
                    goto LAB_00a1a9b8;
                    uVar15 = uVar8 + *(ushort *)((long)ptr + uVar18 * 2);
                    uVar10 = 0;
                    if (uVar9 != 0) {
                      uVar10 = uVar15 / uVar9;
                    }
                    if (param_3 == 0) break;
                    if (uVar15 - uVar10 * uVar9 < 2) goto LAB_00a1a9a0;
LAB_00a1a990:
                    uVar18 = uVar18 + 1;
                    if (uVar16 <= uVar18) {
LAB_00a1a9b8:
                      iVar7 = BN_add_word(param_1,uVar8);
                      if (iVar7 == 0) goto LAB_00a1ab8c;
                      iVar7 = BN_num_bits(param_1);
                      if (iVar7 == param_2) goto LAB_00a1aa24;
                      goto LAB_00a1a9dc;
                    }
                  }
                  if (uVar15 != uVar10 * uVar9) goto LAB_00a1a990;
LAB_00a1a9a0:
                  uVar8 = uVar8 + lVar2;
                } while (uVar8 <= ~(ulong)uVar4);
LAB_00a1a9dc:
                iVar7 = BN_priv_rand_ex(param_1,param_2,1,1,0,param_7);
                uVar17 = 0;
              } while (iVar7 != 0);
              goto LAB_00a1ab90;
            }
            goto LAB_00a1ab8c;
          }
          BN_CTX_start(param_7);
          rem = BN_CTX_get(param_7);
          if (rem == (BIGNUM *)0x0) {
LAB_00a1ab84:
            BN_CTX_end(param_7);
            goto LAB_00a1ab8c;
          }
          uVar18 = (ulong)*(ushort *)(&UNK_00753948 + (uVar16 - 1) * 2);
          uVar8 = BN_get_word(param_4);
          if (uVar18 < uVar8) {
            uVar18 = BN_get_word(param_4);
          }
          iVar7 = BN_rand_ex(param_1,param_2,0,1,0,param_7);
          if (iVar7 == 0) goto LAB_00a1ab84;
LAB_00a1a71c:
          iVar7 = BN_div((BIGNUM *)0x0,rem,param_1,param_4,param_7);
          if ((iVar7 == 0) || (iVar7 = BN_sub(param_1,param_1,rem), iVar7 == 0)) goto LAB_00a1ab84;
          if (param_5 == (BIGNUM *)0x0) {
            iVar7 = BN_add_word(param_1,w);
          }
          else {
            iVar7 = BN_add(param_1,param_1,param_5);
          }
          if ((iVar7 == 0) ||
             (((iVar7 = BN_num_bits(param_1), iVar7 < param_2 ||
               (uVar8 = BN_get_word(param_1), uVar8 < uVar3)) &&
              (iVar7 = BN_add(param_1,param_1,param_4), iVar7 == 0)))) goto LAB_00a1ab84;
          uVar8 = 1;
          do {
            uVar9 = BN_mod_word(param_1,(ulong)*(ushort *)(&UNK_00753948 + uVar8 * 2));
            if (uVar9 == 0xffffffffffffffff) goto LAB_00a1ab84;
            *(short *)((long)ptr + uVar8 * 2) = (short)uVar9;
            uVar8 = uVar8 + 1;
          } while (uVar8 < uVar16);
          uVar8 = 0;
LAB_00a1a7e4:
          uVar9 = 1;
LAB_00a1a800:
          uVar15 = (ulong)*(ushort *)(&UNK_00753948 + uVar9 * 2);
          if ((param_2 < 0x20 && uVar8 >> 0x1f == 0) &&
             (uVar10 = BN_get_word(param_1), uVar10 + uVar8 < uVar15 * uVar15)) goto LAB_00a1aa04;
          uVar10 = uVar8 + *(ushort *)((long)ptr + uVar9 * 2);
          uVar5 = 0;
          if (uVar15 != 0) {
            uVar5 = uVar10 / uVar15;
          }
          if (param_3 == 0) goto LAB_00a1a848;
          if (uVar10 - uVar5 * uVar15 < 2) goto LAB_00a1a85c;
LAB_00a1a84c:
          uVar9 = uVar9 + 1;
          if (uVar9 < uVar16) goto LAB_00a1a800;
LAB_00a1aa04:
          iVar7 = BN_add_word(param_1,uVar8);
          BN_CTX_end(param_7);
          uVar17 = 0;
          if (iVar7 == 0) goto LAB_00a1ab90;
LAB_00a1aa24:
          if (param_6 != (int *)0x0) {
            if (*param_6 == 2) {
              iVar7 = (**(code **)(param_6 + 4))(0,local_78,param_6);
              if (iVar7 != 0) goto LAB_00a1aa7c;
            }
            else if (*param_6 == 1) {
              if (*(code **)(param_6 + 4) != (code *)0x0) {
                (**(code **)(param_6 + 4))(0,local_78,*(undefined8 *)(param_6 + 2));
              }
              goto LAB_00a1aa7c;
            }
            goto LAB_00a1ab8c;
          }
LAB_00a1aa7c:
          if (param_3 == 0) {
            iVar7 = FUN_00a1abb8(param_1,uVar12,param_7,0,param_6);
            local_78 = local_78 + 1;
            if (iVar7 != 0) {
              uVar17 = 0;
              if (iVar7 != -1) {
                uVar17 = 1;
              }
              goto LAB_00a1ab90;
            }
          }
          else {
            iVar7 = BN_rshift1(r,param_1);
            if (iVar7 == 0) goto LAB_00a1ab8c;
            uVar13 = 0;
            while( true ) {
              iVar7 = FUN_00a1abb8(param_1,1,param_7,0,param_6);
              if (iVar7 == -1) goto LAB_00a1ab8c;
              if (iVar7 == 0) break;
              iVar7 = FUN_00a1abb8(r,1,param_7,0,param_6);
              if (iVar7 == -1) goto LAB_00a1ab8c;
              if (iVar7 == 0) break;
              if (param_6 != (int *)0x0) {
                if (*param_6 == 2) {
                  iVar7 = (**(code **)(param_6 + 4))(2,local_78,param_6);
                  if (iVar7 != 0) goto LAB_00a1ab3c;
                }
                else if (*param_6 == 1) {
                  if (*(code **)(param_6 + 4) != (code *)0x0) {
                    (**(code **)(param_6 + 4))(2,local_78,*(undefined8 *)(param_6 + 2));
                  }
                  goto LAB_00a1ab3c;
                }
                goto LAB_00a1ab8c;
              }
LAB_00a1ab3c:
              uVar13 = uVar13 + 1;
              uVar17 = 1;
              if (uVar12 <= uVar13) goto LAB_00a1ab90;
            }
            local_78 = local_78 + 1;
          }
        } while( true );
      }
      ERR_new();
      ERR_set_debug("crypto/bn/bn_prime.c",0x95,"BN_generate_prime_ex2");
      uVar11 = 0xc0100;
      goto LAB_00a1a59c;
    }
    ERR_new();
    uVar11 = 0x8f;
  }
  ERR_set_debug("crypto/bn/bn_prime.c",uVar11,"BN_generate_prime_ex2");
  uVar11 = 0x76;
LAB_00a1a59c:
  ERR_set_error(3,uVar11,0);
  return 0;
LAB_00a1a848:
  if (uVar10 != uVar5 * uVar15) goto LAB_00a1a84c;
LAB_00a1a85c:
  uVar9 = BN_get_word(param_4);
  uVar8 = uVar9 + uVar8;
  if (~uVar18 < uVar8) goto code_r0x00a1a874;
  goto LAB_00a1a7e4;
code_r0x00a1a874:
  iVar7 = BN_rand_ex(param_1,param_2,0,1,0,param_7);
  if (iVar7 == 0) goto LAB_00a1ab84;
  goto LAB_00a1a71c;
}

