/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba8898
 */

int FUN_00ba8898(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                undefined8 param_5,undefined4 param_6)

{
  long lVar1;
  int iVar2;
  long lVar3;
  undefined1 auStack_78 [24];
  undefined8 local_60;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  local_60 = 0;
  lVar3 = mbedtls_md_info_from_type(param_6);
  if (lVar3 == 0) {
    iVar2 = -0x4080;
  }
  else {
    mbedtls_md_init(auStack_78);
    iVar2 = mbedtls_md_setup(auStack_78,lVar3,0);
    if (iVar2 == 0) {
      iVar2 = mbedtls_md_starts(auStack_78);
      if (iVar2 == 0) {
        iVar2 = mbedtls_md_update(auStack_78,&local_60,8);
        if (iVar2 == 0) {
          iVar2 = mbedtls_md_update(auStack_78,param_1,param_2);
          if (iVar2 == 0) {
            iVar2 = mbedtls_md_update(auStack_78,param_3,param_4);
            if (iVar2 == 0) {
              iVar2 = mbedtls_md_finish(auStack_78,param_5);
            }
          }
        }
      }
    }
    mbedtls_md_free(auStack_78);
  }
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

