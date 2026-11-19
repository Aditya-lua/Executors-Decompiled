/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8d10c
 */

/* WARNING: Removing unreachable block (ram,0x00b8d3bc) */
/* WARNING: Removing unreachable block (ram,0x00b8d370) */
/* WARNING: Type propagation algorithm not settling */

void psa_key_derivation_output_bytes(uint *param_1,void *param_2,size_t param_3)

{
  uint *puVar1;
  uint *puVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  long lVar6;
  int iVar7;
  int iVar8;
  void *__src;
  undefined1 *__ptr;
  char cVar9;
  long lVar10;
  void *__dest;
  ulong uVar11;
  byte bVar12;
  size_t __n;
  ulong __n_00;
  ulong local_250;
  void *local_240;
  ulong local_208;
  ulong local_200;
  undefined1 auStack_1f8 [392];
  long local_70;
  
  lVar6 = tpidr_el0;
  local_70 = *(long *)(lVar6 + 0x28);
  uVar3 = *param_1;
  uVar4 = uVar3 & 0xfe00ffff | 0x8000000;
  if ((uVar3 & 0x7f000000) != 0x9000000) {
    uVar4 = uVar3;
  }
  if (uVar3 == 0) {
LAB_00b8d328:
    iVar7 = -0x89;
    goto LAB_00b8d8fc;
  }
  if (param_3 == 0) {
    lVar10 = *(long *)(param_1 + 2);
    if (lVar10 == 0) {
      iVar7 = -0x8f;
      goto LAB_00b8d8fc;
    }
    __n = 0;
    __src = (void *)0x0;
    param_2 = (void *)0x0;
LAB_00b8d1bc:
    uVar3 = uVar4 & 0xffffff00;
    uVar5 = uVar3 + 0xf7ffff00 >> 8;
    *(long *)(param_1 + 2) = lVar10;
    if (uVar5 < 5) {
      if ((1 << (ulong)(uVar5 & 0x1f) & 0x19U) != 0) {
        uVar5 = uVar4 & 0xff | 0x2000000;
        iVar8 = 0x10;
        switch(uVar4 & 0xff) {
        case 4:
        case 5:
          iVar8 = 0x14;
          bVar12 = *(byte *)((long)param_1 + 0x22);
          break;
        default:
          iVar8 = (uint)(uVar5 == 0x2000013) << 6;
        case 3:
          bVar12 = *(byte *)((long)param_1 + 0x22);
          break;
        case 8:
        case 0xc:
        case 0x10:
          iVar8 = 0x1c;
          bVar12 = *(byte *)((long)param_1 + 0x22);
          break;
        case 9:
        case 0xd:
        case 0x11:
          iVar8 = 0x20;
          bVar12 = *(byte *)((long)param_1 + 0x22);
          break;
        case 10:
        case 0x12:
          iVar8 = 0x30;
          bVar12 = *(byte *)((long)param_1 + 0x22);
          break;
        case 0xb:
          iVar8 = 0x40;
          bVar12 = *(byte *)((long)param_1 + 0x22);
        }
        if (((bVar12 >> 1 & 1) != 0) && ((uVar3 == 0x8000400 || ((bVar12 >> 2 & 1) != 0)))) {
          cVar9 = '\0';
          if (uVar3 != 0x8000400) {
            cVar9 = -1;
          }
          puVar1 = param_1 + 0x2a;
          *(byte *)((long)param_1 + 0x22) = bVar12 | 3;
          __dest = __src;
          uVar11 = param_3;
          do {
            if (uVar11 == 0) goto LAB_00b8d828;
            uVar3 = iVar8 - (uint)(byte)param_1[8];
            uVar4 = (uint)uVar11;
            if ((byte)uVar3 <= uVar11) {
              uVar4 = uVar3;
            }
            __n_00 = (ulong)uVar4 & 0xff;
            memcpy(__dest,(void *)((long)param_1 + (ulong)(byte)param_1[8] + 0x23),__n_00);
            uVar11 = uVar11 - __n_00;
            *(char *)(param_1 + 8) = (char)uVar4 + (char)param_1[8];
            if (uVar11 == 0) goto LAB_00b8d828;
            if (cVar9 == *(char *)((long)param_1 + 0x21)) goto LAB_00b8d3b4;
            *(char *)((long)param_1 + 0x21) = *(char *)((long)param_1 + 0x21) + '\x01';
            *(undefined1 *)(param_1 + 8) = 0;
            iVar7 = FUN_00b914d0(puVar1,uVar5,(long)param_1 + 99,iVar8);
            if ((iVar7 != 0) ||
               (((*(char *)((long)param_1 + 0x21) != '\x01' &&
                 (iVar7 = psa_mac_update(puVar1,(long)param_1 + 0x23,iVar8), iVar7 != 0)) ||
                (iVar7 = psa_mac_update(puVar1,*(undefined8 *)(param_1 + 4),
                                        *(undefined8 *)(param_1 + 6)), iVar7 != 0)))) break;
            uVar4 = *puVar1;
            if (uVar4 == 0) {
              iVar7 = -0x89;
              goto LAB_00b8d8c8;
            }
            __ptr = calloc(1,1);
            if (__ptr == (undefined1 *)0x0) {
              iVar7 = -0x8d;
LAB_00b8d8b8:
              free(__ptr);
              break;
            }
            *__ptr = *(undefined1 *)((long)param_1 + 0x21);
            if (uVar4 != 1) {
              iVar7 = -0x87;
joined_r0x00b8d874:
              if (uVar4 != 0) {
                if (uVar4 == 1) {
                  mbedtls_psa_mac_abort(param_1 + 0x2c);
                }
                *(undefined1 *)(param_1 + 0x2b) = 0;
                param_1[0x2a] = 0;
                *(byte *)((long)param_1 + 0xad) = *(byte *)((long)param_1 + 0xad) & 0xfe;
              }
              goto LAB_00b8d8b8;
            }
            iVar7 = mbedtls_psa_mac_update(param_1 + 0x2c,__ptr,1);
            if (iVar7 != 0) {
              uVar4 = *puVar1;
              goto joined_r0x00b8d874;
            }
            __dest = (void *)((long)__dest + __n_00);
            free(__ptr);
            iVar7 = psa_mac_sign_finish(puVar1,(long)param_1 + 0x23,0x40,&local_200);
          } while (iVar7 == 0);
          goto joined_r0x00b8d2e4;
        }
LAB_00b8d3b4:
        iVar7 = -0x89;
        goto LAB_00b8d8c8;
      }
      puVar1 = param_1 + 4;
      uVar3 = uVar4 & 0xff | 0x2000000;
      cVar9 = '\x10';
      switch(uVar4 & 0xff) {
      case 3:
        break;
      case 4:
      case 5:
        cVar9 = '\x14';
        break;
      default:
        cVar9 = (uVar3 == 0x2000013) << 6;
        break;
      case 8:
      case 0xc:
      case 0x10:
        cVar9 = '\x1c';
        break;
      case 9:
      case 0xd:
      case 0x11:
        cVar9 = ' ';
        break;
      case 10:
      case 0x12:
        cVar9 = '0';
        break;
      case 0xb:
        cVar9 = '@';
      }
      if (param_1[5] != 5) {
        if (param_1[5] != 4) {
          iVar7 = -0x89;
          goto LAB_00b8d8c8;
        }
        param_1[5] = 5;
      }
      if (param_3 != 0) {
        puVar2 = param_1 + 0x16;
        local_250 = param_3;
        local_240 = __src;
        do {
          while( true ) {
            bVar12 = (byte)*puVar1;
            if ((ulong)bVar12 != 0) break;
            bVar12 = 0x10;
            switch(uVar4 & 0xff) {
            case 4:
            case 5:
              bVar12 = 0x14;
              break;
            case 6:
            case 7:
            case 0xe:
            case 0xf:
              bVar12 = (uVar3 == 0x2000013) << 6;
              break;
            case 8:
            case 0xc:
            case 0x10:
              bVar12 = 0x1c;
              break;
            case 9:
            case 0xd:
            case 0x11:
              bVar12 = 0x20;
              break;
            case 10:
            case 0x12:
              bVar12 = 0x30;
              break;
            case 0xb:
              bVar12 = 0x40;
            }
            memset(&local_200,0,400);
            if (*(char *)((long)param_1 + 0x11) == -1) {
              iVar7 = -0x97;
              goto LAB_00b8d8c8;
            }
            *(char *)((long)param_1 + 0x11) = *(char *)((long)param_1 + 0x11) + '\x01';
            *(byte *)(param_1 + 4) = bVar12;
            iVar8 = FUN_00b914d0(&local_200,uVar3,*(undefined8 *)(param_1 + 6),
                                 *(undefined8 *)(param_1 + 8));
            if (iVar8 == 0) {
              if (*(char *)((long)param_1 + 0x11) != '\x01') {
                iVar8 = psa_mac_update(&local_200,puVar2,bVar12);
                if (iVar8 == 0) goto LAB_00b8d708;
                goto LAB_00b8d668;
              }
              iVar8 = psa_mac_update(&local_200,*(undefined8 *)(param_1 + 0xe),
                                     *(undefined8 *)(param_1 + 0x10));
              if ((iVar8 != 0) ||
                 (iVar8 = psa_mac_update(&local_200,*(undefined8 *)(param_1 + 10),
                                         *(undefined8 *)(param_1 + 0xc)), iVar8 != 0))
              goto LAB_00b8d668;
LAB_00b8d708:
              uVar11 = (ulong)bVar12;
              iVar8 = psa_mac_sign_finish(&local_200,puVar2,uVar11,&local_208);
              if (local_208 != uVar11) {
                iVar8 = -0x97;
              }
              if (((iVar8 != 0) ||
                  (iVar8 = FUN_00b914d0(&local_200,uVar3,*(undefined8 *)(param_1 + 6),
                                        *(undefined8 *)(param_1 + 8)), iVar8 != 0)) ||
                 ((iVar8 = psa_mac_update(&local_200,puVar2,uVar11), iVar8 != 0 ||
                  ((iVar8 = psa_mac_update(&local_200,*(undefined8 *)(param_1 + 0xe),
                                           *(undefined8 *)(param_1 + 0x10)), iVar8 != 0 ||
                   (iVar8 = psa_mac_update(&local_200,*(undefined8 *)(param_1 + 10),
                                           *(undefined8 *)(param_1 + 0xc)), iVar8 != 0))))))
              goto LAB_00b8d668;
              iVar8 = psa_mac_sign_finish(&local_200,param_1 + 0x26,uVar11,&local_208);
              if ((int)local_200 != 0) goto LAB_00b8d670;
              iVar7 = 0;
            }
            else {
LAB_00b8d668:
              iVar7 = 0;
              if ((int)local_200 != 0) {
LAB_00b8d670:
                if ((int)local_200 == 1) {
                  iVar7 = mbedtls_psa_mac_abort(auStack_1f8);
                }
                else {
                  iVar7 = -0x87;
                }
                local_200 = (local_200 >> 0x28 & 0xfffffe) << 0x28;
              }
            }
            if (iVar7 == 0 || iVar8 != 0) {
              iVar7 = iVar8;
            }
            if (iVar7 != 0) goto LAB_00b8d8c8;
          }
          uVar5 = (uint)local_250;
          if (bVar12 <= local_250) {
            uVar5 = (uint)bVar12;
          }
          uVar11 = (ulong)uVar5 & 0xff;
          memcpy(local_240,(void *)((long)puVar1 + (ulong)(byte)(cVar9 - bVar12) + 0x88),uVar11);
          local_240 = (void *)((long)local_240 + uVar11);
          local_250 = local_250 - uVar11;
          *(char *)puVar1 = (char)*puVar1 - (char)uVar5;
        } while (local_250 != 0);
      }
LAB_00b8d828:
      iVar7 = 0;
      iVar8 = 0;
      if (__src == (void *)0x0) goto LAB_00b8d8fc;
      goto joined_r0x00b8d838;
    }
    if (uVar4 == 0x8000609) {
      local_200 = 0;
      if (param_3 == 0x20) {
        iVar7 = psa_hash_compute(0x2000009,param_1 + 4,0x20,__src,0x20,&local_200);
        if ((iVar7 == 0) && (iVar7 = 0, local_200 != 0x20)) {
          iVar7 = -0x84;
        }
joined_r0x00b8d2e4:
        if (iVar7 == 0) goto LAB_00b8d828;
      }
      else {
        iVar7 = -0x87;
      }
      goto LAB_00b8d8c8;
    }
    if (__src == (void *)0x0) goto LAB_00b8d328;
    if (param_2 != (void *)0x0) {
      if (__n != 0) {
        memcpy(param_2,__src,__n);
      }
      free(__src);
      iVar7 = -0x89;
      goto LAB_00b8d8fc;
    }
  }
  else {
    __src = calloc(param_3,1);
    if (__src == (void *)0x0) {
      __n = 0;
      param_2 = (void *)0x0;
      iVar7 = -0x8d;
    }
    else {
      lVar10 = *(ulong *)(param_1 + 2) - param_3;
      __n = param_3;
      if (param_3 <= *(ulong *)(param_1 + 2)) goto LAB_00b8d1bc;
      iVar7 = -0x8f;
      param_1[2] = 0;
      param_1[3] = 0;
    }
LAB_00b8d8c8:
    uVar4 = *param_1;
    psa_key_derivation_abort(param_1);
    *param_1 = uVar4;
    if (__src == (void *)0x0) goto LAB_00b8d8fc;
    memset(__src,0x21,param_3);
    iVar8 = iVar7;
joined_r0x00b8d838:
    iVar7 = iVar8;
    if (param_2 != (void *)0x0) {
      if (__n != 0) {
        memcpy(param_2,__src,__n);
      }
      free(__src);
      goto LAB_00b8d8fc;
    }
  }
  iVar7 = -0x97;
LAB_00b8d8fc:
  if (*(long *)(lVar6 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(iVar7);
  }
  return;
}

