/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6c17c
 */

void FUN_00b6c17c(long param_1,undefined4 param_2,undefined8 param_3,void *param_4,size_t param_5,
                 undefined8 param_6,ulong param_7,undefined8 param_8,undefined8 param_9,
                 undefined8 param_10,ulong param_11)

{
  long lVar1;
  undefined8 uVar2;
  undefined1 auStack_80 [8];
  undefined1 auStack_78 [16];
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  if (param_5 - 7 < 7) {
    *(uint *)(param_1 + 0x40) = 0xf - ((uint)param_5 & 0xff);
    *(undefined4 *)(param_1 + 0x44) = param_2;
    *(undefined8 *)(param_1 + 0x10) = 0;
    *(undefined8 *)(param_1 + 0x18) = 0;
    *(char *)(param_1 + 0x10) = '\x0e' - (char)param_5;
    memcpy((void *)(param_1 + 0x11),param_4,param_5);
    memset((void *)(param_1 + 0x11 + param_5),0,(ulong)*(uint *)(param_1 + 0x40));
    *(undefined1 *)(param_1 + 0x1f) = 1;
    memcpy((void *)(param_1 + 1),param_4,param_5);
    *(uint *)(param_1 + 0xa8) = *(uint *)(param_1 + 0xa8) | 1;
    uVar2 = FUN_00b6b1c8(param_1);
    if (((((int)uVar2 == 0) && (uVar2 = 0xfffffff3, param_7 >> 8 < 0xff)) && (param_11 != 2)) &&
       ((param_11 < 0x11 && ((param_11 & 1) == 0)))) {
      *(undefined8 *)(param_1 + 0x20) = param_3;
      *(ulong *)(param_1 + 0x28) = param_7;
      *(ulong *)(param_1 + 0x30) = param_11;
      *(undefined8 *)(param_1 + 0x38) = 0;
      *(uint *)(param_1 + 0xa8) = *(uint *)(param_1 + 0xa8) | 2;
      uVar2 = FUN_00b6b1c8(param_1);
      if (((int)uVar2 == 0) &&
         (uVar2 = mbedtls_ccm_update_ad(param_1,param_6,param_7), (int)uVar2 == 0)) {
        uVar2 = mbedtls_ccm_update(param_1,param_8,param_3,param_9,param_3,auStack_80);
        if ((((int)uVar2 == 0) &&
            (uVar2 = mbedtls_ccm_finish(param_1,auStack_78,param_11), (int)uVar2 == 0)) &&
           (uVar2 = mbedtls_ct_memcmp(param_10,auStack_78,param_11), (int)uVar2 != 0)) {
          mbedtls_platform_zeroize(param_9,param_3);
          uVar2 = 0xfffffff1;
        }
      }
    }
  }
  else {
    uVar2 = 0xfffffff3;
  }
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar2);
  }
  return;
}

