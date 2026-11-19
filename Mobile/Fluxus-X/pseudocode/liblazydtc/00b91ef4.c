/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b91ef4
 */

ulong mbedtls_ecp_point_read_binary(int *param_1,long param_2,byte *param_3,ulong param_4)

{
  int *piVar1;
  long lVar2;
  byte bVar3;
  long lVar4;
  uint uVar5;
  int iVar6;
  ulong uVar7;
  ulong uVar8;
  undefined1 auStack_78 [16];
  long local_68;
  
  lVar4 = tpidr_el0;
  local_68 = *(long *)(lVar4 + 0x28);
  if (param_4 == 0) goto LAB_00b92180;
  piVar1 = param_1 + 2;
  uVar7 = mbedtls_mpi_size(piVar1);
  if (*(long *)(param_1 + 0xe) == 0) {
LAB_00b92080:
    uVar8 = 0xffffb180;
  }
  else if (*(long *)(param_1 + 0x12) == 0) {
    if (uVar7 != param_4) goto LAB_00b92180;
    uVar5 = mbedtls_mpi_read_binary_le(param_2,param_3,param_4);
    uVar8 = (ulong)uVar5;
    if (uVar5 == 0) {
      mbedtls_mpi_free(param_2 + 0x10);
      if (*param_1 == 9) {
        uVar5 = mbedtls_mpi_set_bit(param_2,param_4 * 8 + -1,0);
        uVar8 = (ulong)uVar5;
        if (uVar5 != 0) goto LAB_00b92184;
      }
      uVar5 = mbedtls_mpi_lset(param_2 + 0x20,1);
      uVar8 = (ulong)uVar5;
      if (uVar5 == 0) {
        if ((*(long *)(param_1 + 0xe) != 0) && (*(long *)(param_1 + 0x12) != 0)) goto LAB_00b91f54;
        uVar8 = 0;
      }
    }
  }
  else {
LAB_00b91f54:
    if (*param_3 == 0) {
      if (param_4 != 1) goto LAB_00b92180;
      uVar5 = mbedtls_mpi_lset(param_2,1);
      uVar8 = (ulong)uVar5;
      if (uVar5 == 0) {
        uVar5 = mbedtls_mpi_lset(param_2 + 0x10,1);
        uVar8 = (ulong)uVar5;
        if (uVar5 == 0) {
          uVar7 = mbedtls_mpi_lset(param_2 + 0x20,0);
LAB_00b92140:
          if (*(long *)(lVar4 + 0x28) == local_68) {
            return uVar7;
          }
          goto LAB_00b921b8;
        }
      }
    }
    else if (param_4 < uVar7 + 1) {
LAB_00b92180:
      uVar8 = 0xffffb080;
    }
    else {
      uVar5 = mbedtls_mpi_read_binary(param_2,param_3 + 1,uVar7);
      uVar8 = (ulong)uVar5;
      if (uVar5 == 0) {
        uVar5 = mbedtls_mpi_lset(param_2 + 0x20,1);
        uVar8 = (ulong)uVar5;
        if (uVar5 == 0) {
          bVar3 = *param_3;
          if (bVar3 - 2 < 2) {
            if (uVar7 + 1 == param_4) {
              iVar6 = mbedtls_mpi_get_bit(piVar1,0);
              if ((iVar6 != 1) || (iVar6 = mbedtls_mpi_get_bit(piVar1,1), iVar6 != 1))
              goto LAB_00b92080;
              lVar2 = param_2 + 0x10;
              mbedtls_mpi_init(auStack_78);
              uVar5 = FUN_00b952ac(param_1,lVar2,param_2);
              uVar8 = (ulong)uVar5;
              if (uVar5 == 0) {
                uVar5 = mbedtls_mpi_add_int(auStack_78,piVar1,1);
                uVar8 = (ulong)uVar5;
                if (uVar5 == 0) {
                  uVar5 = mbedtls_mpi_shift_r(auStack_78,2);
                  uVar8 = (ulong)uVar5;
                  if (uVar5 == 0) {
                    uVar5 = mbedtls_mpi_exp_mod(lVar2,lVar2,auStack_78,piVar1,0);
                    uVar8 = (ulong)uVar5;
                    if ((uVar5 == 0) && (uVar5 = mbedtls_mpi_get_bit(lVar2,0), uVar5 != (bVar3 & 1))
                       ) {
                      uVar8 = mbedtls_mpi_sub_mpi(lVar2,piVar1,lVar2);
                      uVar8 = uVar8 & 0xffffffff;
                    }
                  }
                }
              }
              mbedtls_mpi_free(auStack_78);
              goto LAB_00b92184;
            }
          }
          else if ((bVar3 == 4) && ((uVar7 << 1 | 1) == param_4)) {
            uVar7 = mbedtls_mpi_read_binary(param_2 + 0x10,param_3 + 1 + uVar7,uVar7);
            goto LAB_00b92140;
          }
          goto LAB_00b92180;
        }
      }
    }
  }
LAB_00b92184:
  if (*(long *)(lVar4 + 0x28) == local_68) {
    return uVar8;
  }
LAB_00b921b8:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

