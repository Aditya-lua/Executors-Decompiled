/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8c264
 */

int psa_aead_generate_nonce(int *param_1,void *param_2,size_t param_3,size_t *param_4)

{
  ulong uVar1;
  int iVar2;
  long lVar3;
  int iVar4;
  void *__dest;
  uint uVar5;
  uint uVar6;
  ulong __n;
  size_t __n_00;
  ulong uVar7;
  undefined1 *puVar8;
  undefined1 auStack_78 [16];
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  if (param_3 == 0) {
    __n_00 = 0;
    __dest = (void *)0x0;
    param_2 = (void *)0x0;
LAB_00b8c2e0:
    *param_4 = 0;
    if (*param_1 == 0) {
      iVar4 = -0x89;
      goto joined_r0x00b8c5b8;
    }
    if ((*(byte *)(param_1 + 8) & 0x11) == 0x10) {
      if ((*(ushort *)(param_1 + 2) & 0x7700) == 0x2400) {
        uVar5 = param_1[1] & 0xffc07fff;
        if (uVar5 != 0x5400100) {
          uVar6 = 0x5400200;
          goto LAB_00b8c380;
        }
        __n = 0xd;
        if (0xc < param_3) goto LAB_00b8c3a4;
LAB_00b8c394:
        iVar4 = -0x8a;
        iVar2 = *param_1;
      }
      else {
        __n = 0;
        if (*(ushort *)(param_1 + 2) == 0x2004) {
          uVar6 = 0x5000500;
          uVar5 = param_1[1] & 0xffc07fff;
LAB_00b8c380:
          __n = 0xc;
          if (uVar5 != uVar6) {
            __n = 0;
          }
          if (param_3 < __n) goto LAB_00b8c394;
        }
LAB_00b8c3a4:
        iVar4 = -0x89;
        if ((DAT_00d25b11 == '\x02') && (DAT_00d25b10 == '\a')) {
          if (__n != 0) {
            puVar8 = auStack_78;
            uVar7 = __n;
            do {
              uVar1 = uVar7;
              if (0x3ff < uVar7) {
                uVar1 = 0x400;
              }
              iVar4 = mbedtls_ctr_drbg_random(&DAT_00d25e68,puVar8,uVar1);
              if (iVar4 != 0) {
                iVar4 = mbedtls_to_psa_error();
                if (iVar4 != 0) {
                  iVar2 = *param_1;
                  goto joined_r0x00b8c420;
                }
                break;
              }
              uVar7 = uVar7 - uVar1;
              puVar8 = puVar8 + uVar1;
            } while (uVar7 != 0);
          }
          iVar2 = *param_1;
          if (iVar2 == 0) {
            iVar4 = -0x89;
            goto joined_r0x00b8c5b8;
          }
          if ((*(byte *)(param_1 + 8) & 1) == 0) {
            uVar5 = param_1[1] & 0xffc07fff;
            if (uVar5 == 0x5000500) {
              iVar4 = -0x87;
              if (__n == 0xc) goto LAB_00b8c56c;
            }
            else if (uVar5 == 0x5400100) {
              iVar4 = -0x87;
              if (__n - 7 < 7) goto LAB_00b8c56c;
            }
            else {
              iVar4 = -0x87;
              if ((uVar5 == 0x5400200) && (__n != 0)) {
LAB_00b8c56c:
                iVar4 = -0x87;
                if (iVar2 == 1) {
                  iVar4 = mbedtls_psa_aead_set_nonce(param_1 + 10,auStack_78,__n);
                  if (iVar4 == 0) {
                    *(byte *)(param_1 + 8) = *(byte *)(param_1 + 8) | 1;
                    memcpy(__dest,auStack_78,__n);
                    *param_4 = __n;
                    goto joined_r0x00b8c5b8;
                  }
                  iVar2 = *param_1;
                }
              }
            }
          }
          else {
            iVar4 = -0x89;
          }
          if (iVar2 != 0) {
            if (iVar2 == 1) {
              mbedtls_psa_aead_abort(param_1 + 10);
            }
            memset(param_1,0,0x1d8);
          }
        }
        iVar2 = *param_1;
      }
    }
    else {
      iVar4 = -0x89;
      iVar2 = *param_1;
    }
  }
  else {
    __dest = calloc(param_3,1);
    __n_00 = param_3;
    if (__dest != (void *)0x0) goto LAB_00b8c2e0;
    param_2 = (void *)0x0;
    __n_00 = 0;
    iVar4 = -0x8d;
    iVar2 = *param_1;
  }
joined_r0x00b8c420:
  if (iVar2 != 0) {
    if (iVar2 == 1) {
      mbedtls_psa_aead_abort(param_1 + 10);
    }
    memset(param_1,0,0x1d8);
  }
joined_r0x00b8c5b8:
  if (__dest != (void *)0x0) {
    if (param_2 == (void *)0x0) {
      iVar4 = -0x97;
    }
    else {
      if (__n_00 != 0) {
        memcpy(param_2,__dest,__n_00);
      }
      free(__dest);
    }
  }
  if (*(long *)(lVar3 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar4;
}

