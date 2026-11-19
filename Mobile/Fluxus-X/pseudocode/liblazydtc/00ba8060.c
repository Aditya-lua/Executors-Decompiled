/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba8060
 */

ulong FUN_00ba8060(long param_1,code *param_2,undefined8 param_3,int param_4,uint param_5,
                  long param_6,int param_7,byte *param_8)

{
  byte *pbVar1;
  bool bVar2;
  byte bVar3;
  int iVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  byte *pbVar9;
  
  if (param_2 == (code *)0x0) {
    return 0xffffbf80;
  }
  if ((param_5 != 0 || param_4 != 0) && param_6 == 0) {
    return 0xffffbf80;
  }
  uVar8 = *(ulong *)(param_1 + 8);
  if (param_4 != 0) {
    mbedtls_md_info_from_type(param_4);
    bVar3 = mbedtls_md_get_size();
    if (bVar3 == 0) {
      return 0xffffbf80;
    }
    if (param_5 != bVar3) {
      return 0xffffbf80;
    }
  }
  if (*(int *)(param_1 + 0xe4) != 0) {
    param_4 = *(int *)(param_1 + 0xe4);
  }
  mbedtls_md_info_from_type(param_4);
  bVar3 = mbedtls_md_get_size();
  if (bVar3 != 0) {
    uVar7 = (ulong)bVar3;
    if (param_7 == -1) {
      if (uVar7 * 2 <= uVar8) {
        uVar6 = uVar7;
        if (uVar8 < uVar7 * 2 + 2) {
          uVar6 = (uVar8 - 2) - uVar7;
        }
        goto LAB_00ba817c;
      }
    }
    else if ((-1 < param_7) && (uVar6 = (long)param_7, (long)param_7 + uVar7 + 2 <= uVar8)) {
LAB_00ba817c:
      memset(param_8,0,uVar8);
      lVar5 = mbedtls_mpi_bitlen();
      pbVar9 = param_8 + (((uVar8 - uVar7) + -2) - uVar6) + 1;
      param_8[((uVar8 - uVar7) + -2) - uVar6] = 1;
      iVar4 = (*param_2)(param_3,pbVar9,uVar6);
      if (iVar4 != 0) {
        return (ulong)(iVar4 - 0x4480);
      }
      pbVar1 = pbVar9 + uVar6;
      uVar6 = FUN_00ba8898(param_6,param_5,pbVar9,uVar6,pbVar1,param_4);
      if ((int)uVar6 != 0) {
        return uVar6;
      }
      bVar2 = (lVar5 + 7U & 7) == 0;
      pbVar9 = param_8;
      if (bVar2) {
        pbVar9 = param_8 + 1;
      }
      uVar6 = FUN_00ba76c0(pbVar9,((uVar8 - uVar7) - (ulong)bVar2) + -1,pbVar1,uVar7,param_4);
      if ((int)uVar6 == 0) {
        iVar4 = mbedtls_mpi_bitlen(param_1 + 0x10);
        *param_8 = *param_8 & (byte)(0xff >> (ulong)(((int)uVar8 << 3 | 1U) - iVar4 & 0x1f));
        pbVar1[uVar7] = 0xbc;
        uVar8 = mbedtls_rsa_private(param_1,param_2,param_3,param_8,param_8);
        return uVar8;
      }
      return uVar6;
    }
  }
  return 0xffffbf80;
}

