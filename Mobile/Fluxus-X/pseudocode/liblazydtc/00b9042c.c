/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9042c
 */

int FUN_00b9042c(undefined4 *param_1)

{
  long lVar1;
  int iVar2;
  undefined8 local_90;
  long local_88;
  void *local_80;
  long local_78;
  void *local_70;
  long local_68;
  uint local_5c;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  memcpy(&local_90,param_1 + 8,0x58);
  if ((local_88 == 0) || ((param_1[1] == 0xa000100 && ((local_78 == 0 || (local_68 == 0)))))) {
    iVar2 = -0x89;
  }
  else {
    mbedtls_platform_zeroize(param_1 + 8,0x370);
    if (local_5c < 0x100) {
      iVar2 = mbedtls_psa_pake_setup(param_1 + 8,&local_90);
      if (iVar2 == 0) {
        *param_1 = 1;
      }
    }
    else {
      iVar2 = -0x87;
    }
    mbedtls_zeroize_and_free(local_90,local_88);
    free(local_80);
    free(local_70);
    if (iVar2 == 0) {
      if (param_1[1] == 0xa000100) {
        iVar2 = 0;
        *(undefined1 *)(param_1 + 3) = 2;
      }
      else {
        iVar2 = -0x86;
      }
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

