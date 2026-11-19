/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9f1cc
 */

int mbedtls_aes_cmac_prf_128
              (undefined8 *param_1,long param_2,long param_3,undefined8 param_4,long param_5)

{
  long lVar1;
  int iVar2;
  long lVar3;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 local_68;
  undefined8 uStack_60;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  iVar2 = -0x6100;
  if (((param_1 == (undefined8 *)0x0) || (param_3 == 0)) || (param_5 == 0)) goto LAB_00b9f298;
  lVar3 = mbedtls_cipher_info_from_type(2);
  if (lVar3 == 0) {
    iVar2 = -0x6080;
  }
  else {
    if (param_2 == 0x10) {
      uStack_78 = param_1[1];
      local_80 = *param_1;
    }
    else {
      local_68 = 0;
      uStack_60 = 0;
      iVar2 = mbedtls_cipher_cmac(lVar3,&local_68,0x80,param_1,param_2,&local_80);
      if (iVar2 != 0) goto LAB_00b9f28c;
    }
    iVar2 = mbedtls_cipher_cmac(lVar3,&local_80,0x80,param_3,param_4,param_5);
  }
LAB_00b9f28c:
  mbedtls_platform_zeroize(&local_80,0x10);
LAB_00b9f298:
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

