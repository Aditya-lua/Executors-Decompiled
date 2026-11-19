/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba0b44
 */

int FUN_00ba0b44(undefined4 param_1,undefined8 param_2,undefined4 param_3,undefined8 param_4,
                undefined8 param_5,undefined8 param_6,ulong *param_7,byte *param_8)

{
  byte *pbVar1;
  long lVar2;
  int iVar3;
  int iVar4;
  byte *pbVar5;
  ulong uVar6;
  undefined1 auStack_e8 [16];
  undefined1 auStack_d8 [16];
  undefined1 auStack_c8 [48];
  undefined1 auStack_98 [48];
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  if (param_8 < (byte *)*param_7) {
LAB_00ba0b9c:
    iVar3 = -0x4f80;
    goto LAB_00ba0c5c;
  }
  iVar3 = mbedtls_ecp_tls_read_point(param_2,param_5,param_7,(long)param_8 - (long)*param_7);
  if (iVar3 != 0) goto LAB_00ba0c5c;
  iVar3 = mbedtls_ecp_is_zero(param_5);
  if (iVar3 != 0) {
    iVar3 = -0x4c80;
    goto LAB_00ba0c5c;
  }
  mbedtls_ecp_point_init(auStack_98);
  mbedtls_ecp_point_init(auStack_c8);
  mbedtls_mpi_init(auStack_d8);
  mbedtls_mpi_init(auStack_e8);
  if (param_8 < (byte *)*param_7) goto LAB_00ba0b9c;
  iVar3 = mbedtls_ecp_tls_read_point(param_2,auStack_98,param_7,(long)param_8 - (long)*param_7);
  if (iVar3 == 0) {
    pbVar5 = (byte *)*param_7;
    if (pbVar5 < param_8) {
      pbVar1 = pbVar5 + 1;
      *param_7 = (ulong)pbVar1;
      if (pbVar1 <= param_8) {
        uVar6 = (ulong)*pbVar5;
        iVar3 = -0x4f80;
        if (((*pbVar5 != 0) && (uVar6 <= (ulong)((long)param_8 - (long)pbVar1))) &&
           (iVar3 = mbedtls_mpi_read_binary(auStack_d8,pbVar1,uVar6), iVar3 == 0)) {
          *param_7 = *param_7 + uVar6;
          iVar3 = FUN_00ba2054(param_1,param_2,param_3,param_4,auStack_98,param_5,param_6,auStack_e8
                              );
          if ((iVar3 == 0) &&
             (iVar3 = mbedtls_ecp_muladd(param_2,auStack_c8,auStack_e8,param_5,auStack_d8,param_4),
             iVar3 == 0)) {
            iVar4 = mbedtls_ecp_point_cmp(auStack_c8,auStack_98);
            iVar3 = 0;
            if (iVar4 != 0) {
              iVar3 = -0x4e00;
            }
          }
        }
        goto LAB_00ba0c3c;
      }
    }
    iVar3 = -0x4f80;
  }
LAB_00ba0c3c:
  mbedtls_ecp_point_free(auStack_98);
  mbedtls_ecp_point_free(auStack_c8);
  mbedtls_mpi_free(auStack_d8);
  mbedtls_mpi_free(auStack_e8);
LAB_00ba0c5c:
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

