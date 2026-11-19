/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6ab5c
 */

int mbedtls_cipher_check_tag(long *param_1,undefined8 param_2,ulong param_3)

{
  long lVar1;
  int iVar2;
  int iVar3;
  uint uVar4;
  undefined1 auStack_60 [8];
  undefined1 auStack_58 [16];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  if ((*param_1 == 0) || (*(int *)((long)param_1 + 0xc) != 0)) {
LAB_00b6ab9c:
    iVar2 = -0x6100;
  }
  else {
    uVar4 = *(uint *)(*param_1 + 8);
    if ((uVar4 & 0xf000) == 0x6000) {
      if (0x10 < param_3) goto LAB_00b6ab9c;
      iVar2 = mbedtls_gcm_finish(param_1[10],0,0,auStack_60,auStack_58,param_3);
      if (iVar2 != 0) goto LAB_00b6aba0;
      iVar2 = mbedtls_ct_memcmp(param_2,auStack_58,param_3);
      if (iVar2 == 0) {
        iVar2 = 0;
        uVar4 = *(uint *)(*param_1 + 8);
        goto LAB_00b6ac28;
      }
      iVar2 = -0x6300;
    }
    else {
      iVar2 = -0x6080;
LAB_00b6ac28:
      if ((uVar4 & 0xff0000) == 0x4d0000) {
        if (param_3 != 0x10) goto LAB_00b6ab9c;
        iVar2 = mbedtls_chachapoly_finish(param_1[10],auStack_58);
        if (iVar2 != 0) goto LAB_00b6aba0;
        iVar3 = mbedtls_ct_memcmp(param_2,auStack_58,0x10);
        iVar2 = 0;
        if (iVar3 != 0) {
          iVar2 = -0x6300;
        }
      }
    }
    mbedtls_platform_zeroize(auStack_58,param_3);
  }
LAB_00b6aba0:
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

