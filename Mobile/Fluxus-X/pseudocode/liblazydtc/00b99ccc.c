/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b99ccc
 */

int mbedtls_psa_rsa_verify_hash
              (undefined2 *param_1,undefined8 param_2,undefined8 param_3,uint param_4,
              undefined8 param_5,ulong param_6,undefined8 param_7,long param_8)

{
  uint uVar1;
  long lVar2;
  void *pvVar3;
  int iVar4;
  ulong uVar5;
  long lVar6;
  int iVar7;
  uint uVar8;
  int iVar9;
  void *local_60;
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  local_60 = (void *)0x0;
  iVar4 = mbedtls_psa_rsa_load_representation(*param_1,param_2,param_3,&local_60);
  if (iVar4 != 0) goto LAB_00b99ed0;
  uVar1 = param_4 & 0xffffff00;
  if ((int)uVar1 < 0x6000900) {
    if (uVar1 != 0x6000200) {
      uVar8 = 0x300;
      goto LAB_00b99d60;
    }
LAB_00b99d80:
    uVar8 = param_4 & 0xff;
  }
  else {
    if (uVar1 == 0x6000900) goto LAB_00b99d80;
    uVar8 = 0x1300;
LAB_00b99d60:
    if ((uVar1 == (uVar8 | 0x6000000)) || ((param_4 >> 9 | 1) == 0x30003)) goto LAB_00b99d80;
    uVar8 = 0;
  }
  if (param_6 >> 0x20 == 0) {
    if (param_4 != 0x6000200) {
      if (uVar8 == 0) {
        iVar4 = -0x86;
        goto LAB_00b99ed0;
      }
      mbedtls_md_info_from_type(uVar8);
      uVar5 = mbedtls_md_get_size();
      if ((uVar5 & 0xff) != param_6) goto LAB_00b99d8c;
    }
    pvVar3 = local_60;
    lVar6 = mbedtls_rsa_get_len(local_60);
    if (lVar6 == param_8) {
      if ((uVar1 == 0x6001300) || (uVar1 == 0x6000300)) {
        iVar4 = mbedtls_rsa_set_padding(pvVar3,1,uVar8);
        if (iVar4 == 0) {
          if (uVar1 == 0x6001300) {
            iVar7 = -1;
          }
          else {
            iVar4 = mbedtls_rsa_get_len(pvVar3);
            iVar9 = (int)param_6;
            iVar4 = (-2 - iVar9) + iVar4;
            if (iVar4 <= iVar9) {
              iVar9 = iVar4;
            }
            iVar7 = 0;
            if (-1 < iVar4) {
              iVar7 = iVar9;
            }
          }
          iVar4 = mbedtls_rsa_rsassa_pss_verify_ext
                            (pvVar3,uVar8,param_6 & 0xffffffff,param_5,uVar8,iVar7,param_7);
        }
      }
      else {
        if (uVar1 != 0x6000200) goto LAB_00b99d8c;
        iVar4 = mbedtls_rsa_set_padding(pvVar3,0,0);
        if (iVar4 == 0) {
          iVar4 = mbedtls_rsa_pkcs1_verify(pvVar3,uVar8,param_6 & 0xffffffff,param_5,param_7);
        }
      }
      if (iVar4 != -0x4100) {
        iVar4 = mbedtls_to_psa_error();
        goto LAB_00b99ed0;
      }
    }
    iVar4 = -0x95;
  }
  else {
LAB_00b99d8c:
    iVar4 = -0x87;
  }
LAB_00b99ed0:
  pvVar3 = local_60;
  mbedtls_rsa_free(local_60);
  free(pvVar3);
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar4;
}

