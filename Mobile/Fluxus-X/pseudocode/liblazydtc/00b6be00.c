/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6be00
 */

void mbedtls_ccm_star_encrypt_and_tag
               (long param_1,undefined8 param_2,void *param_3,size_t param_4,undefined8 param_5,
               ulong param_6,undefined8 param_7,undefined8 param_8,undefined8 param_9,ulong param_10
               )

{
  long lVar1;
  undefined8 uVar2;
  undefined1 auStack_70 [8];
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  if (param_4 - 7 < 7) {
    *(undefined8 *)(param_1 + 0x10) = 0;
    *(undefined8 *)(param_1 + 0x18) = 0;
    *(uint *)(param_1 + 0x40) = 0xf - ((uint)param_4 & 0xff);
    *(undefined4 *)(param_1 + 0x44) = 3;
    *(char *)(param_1 + 0x10) = '\x0e' - (char)param_4;
    memcpy((void *)(param_1 + 0x11),param_3,param_4);
    memset((void *)(param_1 + 0x11 + param_4),0,(ulong)*(uint *)(param_1 + 0x40));
    *(undefined1 *)(param_1 + 0x1f) = 1;
    memcpy((void *)(param_1 + 1),param_3,param_4);
    *(uint *)(param_1 + 0xa8) = *(uint *)(param_1 + 0xa8) | 1;
    uVar2 = FUN_00b6b1c8(param_1);
    if (((((int)uVar2 == 0) && (uVar2 = 0xfffffff3, param_6 >> 8 < 0xff)) && (param_10 != 2)) &&
       ((param_10 < 0x11 && ((param_10 & 1) == 0)))) {
      *(undefined8 *)(param_1 + 0x20) = param_2;
      *(ulong *)(param_1 + 0x28) = param_6;
      *(ulong *)(param_1 + 0x30) = param_10;
      *(undefined8 *)(param_1 + 0x38) = 0;
      *(uint *)(param_1 + 0xa8) = *(uint *)(param_1 + 0xa8) | 2;
      uVar2 = FUN_00b6b1c8(param_1);
      if (((int)uVar2 == 0) &&
         ((uVar2 = mbedtls_ccm_update_ad(param_1,param_5,param_6), (int)uVar2 == 0 &&
          (uVar2 = mbedtls_ccm_update(param_1,param_7,param_2,param_8,param_2,auStack_70),
          (int)uVar2 == 0)))) {
        uVar2 = mbedtls_ccm_finish(param_1,param_9,param_10);
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

