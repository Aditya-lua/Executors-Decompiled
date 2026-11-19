/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00baa758
 */

int mbedtls_rsa_deduce_primes
              (undefined8 *param_1,undefined8 param_2,undefined8 param_3,long *param_4,long *param_5
              )

{
  long lVar1;
  ushort uVar2;
  int iVar3;
  ulong uVar4;
  ushort uVar5;
  undefined1 auStack_88 [16];
  undefined1 auStack_78 [16];
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  iVar3 = -4;
  if ((param_4 != (long *)0x0) && (param_5 != (long *)0x0)) {
    if (((*param_4 == 0) &&
        ((((*param_5 == 0 && (iVar3 = mbedtls_mpi_cmp_int(param_1,0), 0 < iVar3)) &&
          (iVar3 = mbedtls_mpi_cmp_int(param_3,1), 0 < iVar3)) &&
         ((iVar3 = mbedtls_mpi_cmp_mpi(param_3,param_1), iVar3 < 0 &&
          (iVar3 = mbedtls_mpi_cmp_int(param_2,1), 0 < iVar3)))))) &&
       (iVar3 = mbedtls_mpi_cmp_mpi(param_2,param_1), iVar3 < 0)) {
      mbedtls_mpi_init(auStack_88);
      mbedtls_mpi_init(auStack_78);
      iVar3 = mbedtls_mpi_mul_mpi(auStack_78,param_3,param_2);
      if (iVar3 == 0) {
        iVar3 = mbedtls_mpi_sub_int(auStack_78,auStack_78,1);
        if (iVar3 == 0) {
          uVar2 = mbedtls_mpi_lsb(auStack_78);
          if (uVar2 == 0) {
LAB_00baaa1c:
            iVar3 = -4;
          }
          else {
            iVar3 = mbedtls_mpi_shift_r(auStack_78,uVar2);
            if (iVar3 == 0) {
              uVar4 = (ulong)((*(ulong *)*param_1 & 7) == 1);
              do {
                iVar3 = mbedtls_mpi_lset(auStack_88,(&DAT_007883a1)[uVar4]);
                if (iVar3 != 0) break;
                iVar3 = mbedtls_mpi_gcd(param_4,auStack_88,param_1);
                if (iVar3 != 0) break;
                iVar3 = mbedtls_mpi_cmp_int(param_4,1);
                if (iVar3 == 0) {
                  iVar3 = mbedtls_mpi_exp_mod(auStack_88,auStack_88,auStack_78,param_1,param_5);
                  if (iVar3 != 0) break;
                  uVar5 = 1;
                  do {
                    iVar3 = mbedtls_mpi_cmp_int(auStack_88,1);
                    if (iVar3 == 0) break;
                    iVar3 = mbedtls_mpi_add_int(auStack_88,auStack_88,1);
                    if (iVar3 != 0) goto LAB_00baa888;
                    iVar3 = mbedtls_mpi_gcd(param_4,auStack_88,param_1);
                    if (iVar3 != 0) goto LAB_00baa888;
                    iVar3 = mbedtls_mpi_cmp_int(param_4,1);
                    if ((iVar3 == 1) && (iVar3 = mbedtls_mpi_cmp_mpi(param_4,param_1), iVar3 == -1))
                    {
                      iVar3 = mbedtls_mpi_div_mpi(param_5,0,param_1,param_4);
                      goto LAB_00baa888;
                    }
                    iVar3 = mbedtls_mpi_sub_int(auStack_88,auStack_88,1);
                    if (iVar3 != 0) goto LAB_00baa888;
                    iVar3 = mbedtls_mpi_mul_mpi(auStack_88,auStack_88,auStack_88);
                    if (iVar3 != 0) goto LAB_00baa888;
                    iVar3 = mbedtls_mpi_mod_mpi(auStack_88,auStack_88,param_1);
                    if (iVar3 != 0) goto LAB_00baa888;
                    uVar5 = uVar5 + 1;
                  } while (uVar5 <= uVar2);
                  iVar3 = mbedtls_mpi_cmp_int(auStack_88,1);
                  if (iVar3 != 0) goto LAB_00baaa1c;
                }
                uVar4 = uVar4 + 1;
                iVar3 = -4;
              } while (uVar4 < 0x36);
            }
          }
        }
      }
LAB_00baa888:
      mbedtls_mpi_free(auStack_88);
      mbedtls_mpi_free(auStack_78);
    }
    else {
      iVar3 = -4;
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

