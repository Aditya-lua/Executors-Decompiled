/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8ec60
 */

void psa_raw_key_agreement
               (uint param_1,undefined4 param_2,void *param_3,size_t param_4,void *param_5,
               size_t param_6,size_t *param_7)

{
  ulong uVar1;
  long lVar2;
  ushort *puVar3;
  int iVar4;
  int iVar5;
  void *__src;
  ulong uVar6;
  void *__dest;
  void *pvVar7;
  size_t local_80;
  ushort *local_70;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  local_70 = (ushort *)0x0;
  if (param_6 == 0) {
    local_80 = 0;
    __src = (void *)0x0;
    param_5 = (void *)0x0;
LAB_00b8ece8:
    if ((param_1 & 0x7f000000) == 0x9000000) {
      iVar4 = FUN_00b86e5c(param_2,&local_70,0x4000,param_1);
      puVar3 = local_70;
      if (iVar4 != 0) goto joined_r0x00b8ed2c;
      if (*(uint *)(local_70 + 2) < 0x100) {
        if ((((*local_70 & 0xff00) == 0x7200) || ((*local_70 & 0xff00) == 0x7100)) &&
           (param_6 < (ulong)local_70[1] + 7 >> 3)) {
          iVar5 = -0x8a;
          iVar4 = -0x8a;
          goto joined_r0x00b8eea0;
        }
        if (param_4 == 0) {
          __dest = (void *)0x0;
LAB_00b8eed8:
          if (((param_1 & 0xfe00ffff | 0x8000000) == 0x8000000) && (*(uint *)(puVar3 + 2) < 0x100))
          {
            if (param_1 == 0x9010000) {
              iVar4 = mbedtls_psa_ffdh_key_agreement
                                (puVar3,__dest,param_4,*(undefined8 *)(puVar3 + 0x14),
                                 *(undefined8 *)(puVar3 + 0x18),__src,param_6,param_7);
              iVar5 = iVar4;
            }
            else {
              if (param_1 != 0x9020000) goto LAB_00b8ef4c;
              iVar4 = mbedtls_psa_key_agreement_ecdh
                                (puVar3,*(undefined8 *)(puVar3 + 0x14),
                                 *(undefined8 *)(puVar3 + 0x18),0x9020000,__dest,param_4,__src,
                                 param_6,param_7);
              iVar5 = iVar4;
            }
          }
          else {
LAB_00b8ef4c:
            iVar4 = -0x86;
            iVar5 = iVar4;
          }
        }
        else {
          __dest = calloc(param_4,1);
          if (__dest != (void *)0x0) {
            memcpy(__dest,param_3,param_4);
            goto LAB_00b8eed8;
          }
          iVar4 = -0x8d;
          iVar5 = iVar4;
        }
      }
      else {
        psa_unregister_read_under_mutex(local_70);
        local_70 = (ushort *)0x0;
        iVar5 = -0x86;
        iVar4 = -0x86;
joined_r0x00b8eea0:
        __dest = (void *)0x0;
      }
    }
    else {
      iVar4 = -0x87;
joined_r0x00b8ed2c:
      __dest = (void *)0x0;
      iVar5 = iVar4;
    }
    if ((__src != (void *)0x0) && (iVar4 = iVar5, iVar5 != 0)) {
      if ((param_6 != 0) && ((DAT_00d25b11 == '\x02' && (DAT_00d25b10 == '\a')))) {
        uVar6 = param_6;
        pvVar7 = __src;
        do {
          uVar1 = uVar6;
          if (0x3ff < uVar6) {
            uVar1 = 0x400;
          }
          iVar5 = mbedtls_ctr_drbg_random(&DAT_00d25e68,pvVar7,uVar1);
          if (iVar5 != 0) break;
          uVar6 = uVar6 - uVar1;
          pvVar7 = (void *)((long)pvVar7 + uVar1);
        } while (uVar6 != 0);
      }
      *param_7 = param_6;
    }
    if (__src == (void *)0x0) goto LAB_00b8edb4;
  }
  else {
    __src = calloc(param_6,1);
    local_80 = param_6;
    if (__src != (void *)0x0) goto LAB_00b8ece8;
    param_5 = (void *)0x0;
    local_80 = 0;
    __dest = (void *)0x0;
    iVar4 = -0x8d;
LAB_00b8edb4:
    __src = (void *)0x0;
    *param_7 = 0;
  }
  iVar5 = psa_unregister_read_under_mutex(local_70);
  free(__dest);
  if (__src != (void *)0x0) {
    if (param_5 == (void *)0x0) {
      iVar5 = -0x97;
      goto LAB_00b8ee08;
    }
    if (local_80 != 0) {
      memcpy(param_5,__src,local_80);
    }
    free(__src);
  }
  if (iVar4 != 0) {
    iVar5 = iVar4;
  }
LAB_00b8ee08:
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(iVar5);
  }
  return;
}

