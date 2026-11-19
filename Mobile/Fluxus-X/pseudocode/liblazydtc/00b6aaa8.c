/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6aaa8
 */

void mbedtls_cipher_write_tag(long *param_1,undefined8 param_2,long param_3)

{
  uint uVar1;
  long lVar2;
  undefined8 uVar3;
  undefined1 auStack_30 [8];
  long local_28;
  
  lVar2 = tpidr_el0;
  local_28 = *(long *)(lVar2 + 0x28);
  if ((*param_1 != 0) && (*(int *)((long)param_1 + 0xc) == 1)) {
    uVar1 = *(uint *)(*param_1 + 8);
    if ((uVar1 & 0xf000) == 0x6000) {
      uVar3 = mbedtls_gcm_finish(param_1[10],0,0,auStack_30);
      goto LAB_00b6ab30;
    }
    if ((uVar1 & 0xff0000) != 0x4d0000) {
      uVar3 = 0xffff9f80;
      goto LAB_00b6ab30;
    }
    if (param_3 == 0x10) {
      uVar3 = mbedtls_chachapoly_finish(param_1[10],param_2);
      goto LAB_00b6ab30;
    }
  }
  uVar3 = 0xffff9f00;
LAB_00b6ab30:
  if (*(long *)(lVar2 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

