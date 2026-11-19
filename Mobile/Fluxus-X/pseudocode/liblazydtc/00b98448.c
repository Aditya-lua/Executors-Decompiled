/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b98448
 */

void mbedtls_psa_aead_update
               (int *param_1,undefined8 param_2,ulong param_3,undefined8 param_4,ulong param_5,
               ulong *param_6)

{
  long lVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  
  lVar1 = tpidr_el0;
  lVar4 = *(long *)(lVar1 + 0x28);
  iVar2 = *param_1;
  if (iVar2 == 0x5100500) {
    if (param_5 < param_3) {
LAB_00b984ec:
      uVar3 = 0xffffff76;
      goto LAB_00b9851c;
    }
    mbedtls_chachapoly_update(param_1 + 2,param_3,param_2);
    uVar3 = mbedtls_to_psa_error();
    iVar2 = (int)uVar3;
  }
  else if (iVar2 == 0x5500100) {
    if (param_5 < param_3) goto LAB_00b984ec;
    mbedtls_ccm_update(param_1 + 2,param_2);
    uVar3 = mbedtls_to_psa_error();
    iVar2 = (int)uVar3;
  }
  else {
    if (iVar2 != 0x5500200) {
      uVar3 = 0xffffff7a;
      goto LAB_00b9851c;
    }
    mbedtls_gcm_update(param_1 + 2,param_2);
    uVar3 = mbedtls_to_psa_error();
    iVar2 = (int)uVar3;
  }
  if (iVar2 == 0) {
    *param_6 = param_3;
  }
LAB_00b9851c:
  if (*(long *)(lVar1 + 0x28) != lVar4) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

