/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9e1e0
 */

int FUN_00b9e1e0(uint *param_1,void *param_2,size_t param_3)

{
  uint *puVar1;
  uint uVar2;
  uint uVar3;
  long lVar4;
  int iVar5;
  undefined8 uVar6;
  undefined8 local_a0;
  undefined1 auStack_98 [64];
  long local_58;
  
  lVar4 = tpidr_el0;
  local_58 = *(long *)(lVar4 + 0x28);
  if ((*param_1 & 0xffc07fff) == 0x3c00200) {
    iVar5 = mbedtls_cipher_cmac_finish(param_1 + 2,auStack_98);
    if (iVar5 == 0) {
      memcpy(param_2,auStack_98,param_3);
    }
    mbedtls_platform_zeroize(auStack_98,0x10);
    iVar5 = mbedtls_to_psa_error(iVar5);
  }
  else if ((*param_1 & 0x7fc00000) == 0x3800000) {
    uVar2 = param_1[2];
    local_a0 = 0;
    uVar3 = uVar2 - 3;
    if (((uVar3 & 0xff) < 0x10) && ((0xe7e7U >> (ulong)(uVar3 & 0x1f) & 1) != 0)) {
      uVar6 = *(undefined8 *)(&DAT_00787790 + (long)(char)uVar3 * 8);
    }
    else {
      uVar6 = 0x48;
      if ((uVar2 & 0xff | 0x2000000) != 0x2000013) {
        uVar6 = 0;
      }
    }
    puVar1 = param_1 + 4;
    iVar5 = psa_hash_finish(puVar1,auStack_98,0x40,&local_a0);
    if (iVar5 == 0) {
      iVar5 = psa_hash_setup(puVar1,uVar2);
      if ((((iVar5 == 0) && (iVar5 = psa_hash_update(puVar1,param_1 + 0x3e,uVar6), iVar5 == 0)) &&
          (iVar5 = psa_hash_update(puVar1,auStack_98,local_a0), iVar5 == 0)) &&
         (iVar5 = psa_hash_finish(puVar1,auStack_98,0x40,&local_a0), iVar5 == 0)) {
        memcpy(param_2,auStack_98,param_3);
      }
      mbedtls_platform_zeroize(auStack_98,local_a0);
    }
  }
  else {
    iVar5 = -0x89;
  }
  if (*(long *)(lVar4 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar5;
}

