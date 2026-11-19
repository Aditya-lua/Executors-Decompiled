/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b91d70
 */

undefined8
mbedtls_ecp_point_write_binary
          (long param_1,long param_2,uint param_3,ulong *param_4,char *param_5,ulong param_6)

{
  ulong uVar1;
  char cVar2;
  int iVar3;
  ulong uVar4;
  char *pcVar5;
  undefined8 uVar6;
  
  if (1 < param_3) {
    return 0xffffb080;
  }
  uVar4 = mbedtls_mpi_size(param_1 + 8);
  if (*(long *)(param_1 + 0x38) == 0) {
    return 0xffffb180;
  }
  if (*(long *)(param_1 + 0x48) == 0) {
    *param_4 = uVar4;
    if (param_6 < uVar4) {
      return 0xffffb100;
    }
    uVar6 = mbedtls_mpi_write_binary_le(param_2,param_5,uVar4);
    if ((int)uVar6 != 0) {
      return uVar6;
    }
    if (*(long *)(param_1 + 0x38) == 0) {
      return 0;
    }
    uVar6 = 0;
    if (*(long *)(param_1 + 0x48) == 0) {
      return 0;
    }
  }
  else {
    uVar6 = 0xffffb180;
  }
  iVar3 = mbedtls_mpi_cmp_int(param_2 + 0x20,0);
  if (iVar3 == 0) {
    if (param_6 != 0) {
      *param_5 = '\0';
      *param_4 = 1;
      return 0;
    }
  }
  else if (param_3 == 1) {
    *param_4 = uVar4 + 1;
    if (uVar4 + 1 <= param_6) {
      cVar2 = mbedtls_mpi_get_bit(param_2 + 0x10,0);
      pcVar5 = param_5 + 1;
      *param_5 = cVar2 + '\x02';
      goto LAB_00b91ed0;
    }
  }
  else {
    if (param_3 != 0) {
      return uVar6;
    }
    uVar1 = uVar4 << 1 | 1;
    *param_4 = uVar1;
    if (uVar1 <= param_6) {
      *param_5 = '\x04';
      uVar6 = mbedtls_mpi_write_binary(param_2,param_5 + 1,uVar4);
      if ((int)uVar6 != 0) {
        return uVar6;
      }
      param_2 = param_2 + 0x10;
      pcVar5 = param_5 + 1 + uVar4;
LAB_00b91ed0:
      uVar6 = mbedtls_mpi_write_binary(param_2,pcVar5,uVar4);
      return uVar6;
    }
  }
  return 0xffffb100;
}

