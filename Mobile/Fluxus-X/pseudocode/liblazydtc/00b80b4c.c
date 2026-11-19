/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b80b4c
 */

int mbedtls_mpi_gcd(undefined8 param_1,byte **param_2,undefined8 param_3)

{
  long lVar1;
  int iVar2;
  byte *pbVar3;
  byte *__dest;
  ushort uVar4;
  ulong uVar5;
  long lVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  byte *local_78;
  short local_70;
  ushort uStack_6e;
  byte *local_68;
  undefined4 local_60;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  local_60 = 1;
  local_68 = (byte *)0x0;
  local_70 = 1;
  uStack_6e = 0;
  local_78 = (byte *)0x0;
  iVar2 = mbedtls_mpi_copy(&local_68);
  if ((iVar2 == 0) && (iVar2 = mbedtls_mpi_copy(&local_78,param_3), iVar2 == 0)) {
    uVar5 = (ulong)local_60._2_2_;
    if (uVar5 != 0) {
      lVar6 = 0;
      uVar7 = 0;
      do {
        uVar8 = *(ulong *)(local_68 + uVar7 * 8);
        if (uVar8 != 0) {
          uVar7 = (uVar8 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar8 & 0x5555555555555555) << 1;
          uVar7 = (uVar7 & 0xcccccccccccccccc) >> 2 | (uVar7 & 0x3333333333333333) << 2;
          uVar7 = (uVar7 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar7 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar7 = (uVar7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 & 0xff00ff00ff00ff) << 8;
          uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
          uVar7 = LZCOUNT(uVar7 >> 0x20 | uVar7 << 0x20) + lVar6;
          if (uStack_6e != 0) goto LAB_00b80c08;
          goto LAB_00b80f08;
        }
        uVar7 = uVar7 + 1;
        lVar6 = lVar6 + 0x40;
      } while (uVar7 < uVar5);
    }
    uVar7 = 0;
    if (uStack_6e != 0) {
LAB_00b80c08:
      lVar6 = 0;
      uVar8 = 0;
      do {
        uVar9 = *(ulong *)(local_78 + uVar8 * 8);
        if (uVar9 != 0) {
          uVar8 = (uVar9 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar9 & 0x5555555555555555) << 1;
          uVar8 = (uVar8 & 0xcccccccccccccccc) >> 2 | (uVar8 & 0x3333333333333333) << 2;
          uVar8 = (uVar8 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar8 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar8 = (uVar8 & 0xff00ff00ff00ff00) >> 8 | (uVar8 & 0xff00ff00ff00ff) << 8;
          uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
          uVar8 = LZCOUNT(uVar8 >> 0x20 | uVar8 << 0x20) - lVar6;
          if (uVar8 != 0) goto LAB_00b80c58;
          break;
        }
        uVar8 = uVar8 + 1;
        lVar6 = lVar6 + -0x40;
      } while (uVar8 < uStack_6e);
      uVar8 = 0;
      if ((*local_78 & 1) != 0) {
LAB_00b80c58:
        if (uVar7 <= uVar8) {
          uVar8 = uVar7;
        }
        local_70 = 1;
        local_60 = CONCAT22(local_60._2_2_,1);
        do {
          uVar7 = uVar5;
          do {
            if (uVar7 == 0) goto LAB_00b80e58;
            lVar6 = uVar7 * 8;
            uVar7 = uVar7 - 1;
          } while (*(long *)(local_68 + lVar6 + -8) == 0);
          if ((short)local_60 == 0) {
LAB_00b80e58:
            lVar6 = mbedtls_mpi_core_bitlen(local_78,uStack_6e);
            uVar7 = (ulong)uStack_6e;
            uVar5 = lVar6 + uVar8;
            if (uVar7 << 6 < uVar5) {
              uVar9 = uVar5 >> 6;
              if ((uVar5 & 0x3f) != 0) {
                uVar9 = uVar9 + 1;
              }
              if (10000 < uVar9) {
LAB_00b80e90:
                iVar2 = -0x10;
                if (local_68 != (byte *)0x0) goto LAB_00b80f18;
                goto LAB_00b80f24;
              }
              if (uVar7 < uVar9) {
                __dest = calloc(uVar9,8);
                pbVar3 = local_78;
                if (__dest == (byte *)0x0) goto LAB_00b80e90;
                if (local_78 != (byte *)0x0) {
                  memcpy(__dest,local_78,uVar7 << 3);
                  mbedtls_zeroize_and_free(pbVar3,uVar7 << 3);
                }
                uVar7 = uVar9 & 0xffff;
                uStack_6e = (ushort)uVar9;
                local_78 = __dest;
              }
            }
            mbedtls_mpi_core_shift_l(local_78,uVar7,uVar8);
            param_2 = &local_78;
            break;
          }
          if ((int)uVar5 != 0) {
            lVar6 = 0;
            uVar7 = 0;
            do {
              uVar9 = *(ulong *)(local_68 + uVar7 * 8);
              if (uVar9 != 0) {
                uVar7 = (uVar9 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar9 & 0x5555555555555555) << 1;
                uVar7 = (uVar7 & 0xcccccccccccccccc) >> 2 | (uVar7 & 0x3333333333333333) << 2;
                uVar7 = (uVar7 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar7 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar7 = (uVar7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 & 0xff00ff00ff00ff) << 8;
                uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
                lVar6 = LZCOUNT(uVar7 >> 0x20 | uVar7 << 0x20) + lVar6;
                goto LAB_00b80cd4;
              }
              uVar7 = uVar7 + 1;
              lVar6 = lVar6 + 0x40;
            } while (uVar7 < uVar5);
            lVar6 = 0;
LAB_00b80cd4:
            mbedtls_mpi_core_shift_r(local_68,uVar5,lVar6);
          }
          uVar5 = (ulong)uStack_6e;
          if (uVar5 != 0) {
            lVar6 = 0;
            uVar7 = 0;
            do {
              uVar9 = *(ulong *)(local_78 + uVar7 * 8);
              if (uVar9 != 0) {
                uVar7 = (uVar9 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar9 & 0x5555555555555555) << 1;
                uVar7 = (uVar7 & 0xcccccccccccccccc) >> 2 | (uVar7 & 0x3333333333333333) << 2;
                uVar7 = (uVar7 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar7 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar7 = (uVar7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 & 0xff00ff00ff00ff) << 8;
                uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
                lVar6 = LZCOUNT(uVar7 >> 0x20 | uVar7 << 0x20) + lVar6;
                goto LAB_00b80d18;
              }
              uVar7 = uVar7 + 1;
              lVar6 = lVar6 + 0x40;
            } while (uVar7 < uVar5);
            lVar6 = 0;
LAB_00b80d18:
            mbedtls_mpi_core_shift_r(local_78,uVar5,lVar6);
          }
          uVar5 = (ulong)local_60._2_2_;
          do {
            uVar7 = uVar5;
            uVar5 = uVar7 - 1;
            if (uVar5 == 0xffffffffffffffff) {
              uVar7 = 0;
              break;
            }
          } while (*(long *)(local_68 + uVar5 * 8) == 0);
          uVar5 = (ulong)uStack_6e;
          do {
            uVar9 = uVar5;
            uVar5 = uVar9 - 1;
            if (uVar5 == 0xffffffffffffffff) {
              uVar9 = 0;
              if (uVar7 != 0) goto LAB_00b80d84;
              goto LAB_00b80dac;
            }
          } while (*(long *)(local_78 + uVar5 * 8) == 0);
          if (uVar9 == 0 && uVar7 == 0) {
LAB_00b80dac:
            iVar2 = mbedtls_mpi_sub_abs(&local_68,&local_68,&local_78);
            if (iVar2 != 0) goto LAB_00b80f10;
            if (local_60._2_2_ != 0) {
              pbVar3 = local_68;
              uVar4 = local_60._2_2_;
LAB_00b80e4c:
              mbedtls_mpi_core_shift_r(pbVar3,uVar4,1);
            }
          }
          else {
LAB_00b80d84:
            if (uVar9 < uVar7) {
              if ((short)local_60 < 0) goto LAB_00b80e28;
              goto LAB_00b80dac;
            }
            if (uVar7 < uVar9) {
              iVar2 = -(int)local_70;
LAB_00b80da8:
              if (-1 < iVar2) goto LAB_00b80dac;
            }
            else {
              iVar2 = (int)(short)local_60;
              if (iVar2 < 1) {
                if ((iVar2 != 0) && (0 < local_70)) goto LAB_00b80e28;
              }
              else if (local_70 < 0) goto LAB_00b80dac;
              do {
                if (uVar7 == 0) goto LAB_00b80dac;
                lVar6 = uVar7 * 8;
                uVar7 = uVar7 - 1;
                if (*(ulong *)(local_78 + lVar6 + -8) < *(ulong *)(local_68 + lVar6 + -8))
                goto LAB_00b80da8;
              } while (*(ulong *)(local_78 + lVar6 + -8) <= *(ulong *)(local_68 + lVar6 + -8));
              if (-1 < -iVar2) goto LAB_00b80dac;
            }
LAB_00b80e28:
            iVar2 = mbedtls_mpi_sub_abs(&local_78,&local_78,&local_68);
            if (iVar2 != 0) goto LAB_00b80f10;
            if (uStack_6e != 0) {
              pbVar3 = local_78;
              uVar4 = uStack_6e;
              goto LAB_00b80e4c;
            }
          }
          uVar5 = (ulong)local_60._2_2_;
        } while( true );
      }
    }
LAB_00b80f08:
    iVar2 = mbedtls_mpi_copy(param_1,param_2);
  }
LAB_00b80f10:
  if (local_68 != (byte *)0x0) {
LAB_00b80f18:
    mbedtls_zeroize_and_free(local_68,(ulong)local_60._2_2_ << 3);
  }
LAB_00b80f24:
  local_60 = 1;
  local_68 = (byte *)0x0;
  if (local_78 != (byte *)0x0) {
    mbedtls_zeroize_and_free(local_78,(ulong)uStack_6e << 3);
  }
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

