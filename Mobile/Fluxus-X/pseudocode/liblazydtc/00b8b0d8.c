/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8b0d8
 */

int psa_cipher_encrypt(undefined8 param_1,uint param_2,void *param_3,size_t param_4,void *param_5,
                      ulong param_6,long *param_7)

{
  ulong uVar1;
  ushort uVar2;
  uint uVar3;
  long lVar4;
  void *pvVar5;
  int iVar6;
  int iVar7;
  long lVar8;
  void *__dest;
  undefined1 *puVar9;
  void *__dest_00;
  ulong uVar10;
  size_t local_88;
  ushort *local_80;
  undefined1 auStack_78 [16];
  long local_68;
  
  lVar4 = tpidr_el0;
  local_68 = *(long *)(lVar4 + 0x28);
  local_80 = (ushort *)0x0;
  if ((param_2 & 0x7f000000) == 0x4000000) {
    iVar6 = FUN_00b86e5c(param_1,&local_80,0x100,param_2);
    if (iVar6 == 0) {
      uVar2 = *local_80;
      if (((uVar2 & 0x7000) == 0x2000) && ((uVar2 & 0x700) != 0)) {
        if ((int)param_2 < 0x4c01000) {
          if (((param_2 != 0x4404000) && (param_2 != 0x4404100)) && (param_2 != 0x440ff00))
          goto LAB_00b8b2a0;
        }
        else if (((param_2 != 0x4c01000) && (param_2 != 0x4c01100)) && (param_2 != 0x4c01200))
        goto LAB_00b8b2a0;
        uVar3 = uVar2 >> 8 & 7;
        if (uVar3 < 5) {
          local_88 = (size_t)(uint)(1 << (ulong)uVar3);
          if (local_88 <= param_6) goto LAB_00b8b314;
          goto LAB_00b8b2c8;
        }
        __dest = (void *)0x0;
        uVar10 = 0;
        __dest_00 = (void *)0x0;
        iVar6 = -0x84;
        pvVar5 = (void *)0x0;
      }
      else {
LAB_00b8b2a0:
        if ((param_2 == 0x4800100) && (uVar2 == 0x2004)) {
          local_88 = 0xc;
          if (0xb < param_6) {
LAB_00b8b314:
            iVar6 = -0x89;
            if (DAT_00d25b11 != '\x02') goto LAB_00b8b148;
            __dest = (void *)0x0;
            __dest_00 = (void *)0x0;
            pvVar5 = (void *)0x0;
            uVar10 = 0;
            if (DAT_00d25b10 == '\a') {
              puVar9 = auStack_78;
              uVar10 = local_88;
              do {
                uVar1 = uVar10;
                if (0x3ff < uVar10) {
                  uVar1 = 0x400;
                }
                iVar6 = mbedtls_ctr_drbg_random(&DAT_00d25e68,puVar9,uVar1);
                if (iVar6 != 0) {
                  iVar6 = mbedtls_to_psa_error();
                  if (iVar6 == 0) goto LAB_00b8b3b0;
                  goto LAB_00b8b148;
                }
                uVar10 = uVar10 - uVar1;
                puVar9 = puVar9 + uVar1;
              } while (uVar10 != 0);
              if (param_4 != 0) goto LAB_00b8b3b8;
              goto LAB_00b8b3e4;
            }
            goto LAB_00b8b170;
          }
        }
        else {
          local_88 = 0;
          if (param_2 != 0x4c01300) {
LAB_00b8b3b0:
            if (param_4 == 0) {
LAB_00b8b3e4:
              __dest = (void *)0x0;
joined_r0x00b8b3dc:
              if (param_6 == 0) {
                __dest_00 = (void *)0x0;
                param_5 = (void *)0x0;
              }
              else {
                __dest_00 = calloc(param_6,1);
                if (__dest_00 == (void *)0x0) goto LAB_00b8b494;
              }
              if (*(uint *)(local_80 + 2) < 0x100) {
                lVar8 = 0;
                if (__dest_00 != (void *)0x0) {
                  lVar8 = (long)__dest_00 + local_88;
                }
                iVar7 = mbedtls_psa_cipher_encrypt
                                  (local_80,*(undefined8 *)(local_80 + 0x14),
                                   *(undefined8 *)(local_80 + 0x18),param_2,auStack_78,local_88,
                                   __dest,param_4,lVar8,param_6 - local_88,param_7);
                iVar6 = psa_unregister_read_under_mutex(local_80);
                if (iVar7 == 0) {
                  if (iVar6 == 0) {
                    if (local_88 != 0) {
                      memcpy(__dest_00,auStack_78,local_88);
                    }
                    iVar6 = 0;
                    lVar8 = *param_7 + local_88;
                  }
                  else {
                    lVar8 = 0;
                  }
                }
                else {
                  lVar8 = 0;
                  iVar6 = iVar7;
                }
                goto LAB_00b8b180;
              }
              iVar6 = -0x87;
              pvVar5 = param_5;
              uVar10 = param_6;
            }
            else {
LAB_00b8b3b8:
              __dest = calloc(param_4,1);
              if (__dest != (void *)0x0) {
                memcpy(__dest,param_3,param_4);
                goto joined_r0x00b8b3dc;
              }
              __dest_00 = (void *)0x0;
LAB_00b8b494:
              iVar6 = -0x8d;
              pvVar5 = (void *)0x0;
              uVar10 = 0;
            }
            goto LAB_00b8b170;
          }
          local_88 = 0xd;
          if (0xc < param_6) goto LAB_00b8b314;
        }
LAB_00b8b2c8:
        __dest = (void *)0x0;
        __dest_00 = (void *)0x0;
        iVar6 = -0x8a;
        pvVar5 = (void *)0x0;
        uVar10 = 0;
      }
    }
    else {
LAB_00b8b148:
      __dest = (void *)0x0;
      __dest_00 = (void *)0x0;
      pvVar5 = (void *)0x0;
      uVar10 = 0;
    }
  }
  else {
    __dest = (void *)0x0;
    uVar10 = 0;
    __dest_00 = (void *)0x0;
    iVar6 = -0x87;
    pvVar5 = (void *)0x0;
  }
LAB_00b8b170:
  param_5 = pvVar5;
  psa_unregister_read_under_mutex(local_80);
  lVar8 = 0;
  param_6 = uVar10;
LAB_00b8b180:
  *param_7 = lVar8;
  free(__dest);
  if (__dest_00 != (void *)0x0) {
    if (param_5 == (void *)0x0) {
      iVar6 = -0x97;
    }
    else {
      if (param_6 != 0) {
        memcpy(param_5,__dest_00,param_6);
      }
      free(__dest_00);
    }
  }
  if (*(long *)(lVar4 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar6;
}

