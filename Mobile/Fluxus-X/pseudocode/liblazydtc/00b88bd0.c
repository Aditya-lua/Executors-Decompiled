/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b88bd0
 */

int psa_mac_verify(undefined4 param_1,undefined4 param_2,void *param_3,size_t param_4,void *param_5,
                  size_t param_6)

{
  long lVar1;
  int iVar2;
  int iVar3;
  void *__dest;
  void *__dest_00;
  size_t local_a0;
  undefined1 auStack_98 [64];
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  if (param_4 == 0) {
    __dest = (void *)0x0;
LAB_00b88c40:
    iVar2 = FUN_00b88a80(param_1,param_2,__dest,param_4,auStack_98,0x40,&local_a0,0);
    if (iVar2 != 0) {
      __dest_00 = (void *)0x0;
      goto LAB_00b88ce4;
    }
    if (local_a0 != param_6) {
      __dest_00 = (void *)0x0;
      iVar2 = -0x95;
      goto LAB_00b88ce4;
    }
    if (param_6 == 0) {
      __dest_00 = (void *)0x0;
    }
    else {
      __dest_00 = calloc(param_6,1);
      if (__dest_00 == (void *)0x0) goto LAB_00b88cb0;
      memcpy(__dest_00,param_5,param_6);
    }
    iVar3 = mbedtls_ct_memcmp(__dest_00,auStack_98,param_6);
    iVar2 = 0;
    if (iVar3 != 0) {
      iVar2 = -0x95;
    }
  }
  else {
    __dest = calloc(param_4,1);
    if (__dest != (void *)0x0) {
      memcpy(__dest,param_3,param_4);
      goto LAB_00b88c40;
    }
    __dest_00 = (void *)0x0;
LAB_00b88cb0:
    iVar2 = -0x8d;
  }
LAB_00b88ce4:
  mbedtls_platform_zeroize(auStack_98,0x40);
  free(__dest);
  free(__dest_00);
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

