/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bac5a0
 */

undefined8 mbedtls_sha1(void *param_1,size_t param_2,undefined8 param_3)

{
  ulong uVar1;
  long lVar2;
  void *pvVar3;
  ulong uVar4;
  undefined4 local_b8 [2];
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined4 local_a0;
  undefined1 auStack_9c [68];
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  memset(local_b8,0,0x5c);
  local_a0 = 0xc3d2e1f0;
  uStack_a8 = 0x1032547698badcfe;
  local_b0 = 0xefcdab8967452301;
  if (param_2 != 0) {
    uVar1 = param_2 - 0x40;
    local_b8[0] = (undefined4)param_2;
    if (0x3f < param_2) {
      uVar4 = uVar1 & 0xffffffffffffffc0;
      pvVar3 = param_1;
      do {
        mbedtls_internal_sha1_process(local_b8,pvVar3);
        param_2 = param_2 - 0x40;
        pvVar3 = (void *)((long)pvVar3 + 0x40);
      } while (0x3f < param_2);
      param_2 = uVar1 - uVar4;
      if (param_2 == 0) goto LAB_00bac654;
      param_1 = (void *)((long)param_1 + uVar4 + 0x40);
    }
    memcpy(auStack_9c,param_1,param_2);
  }
LAB_00bac654:
  mbedtls_sha1_finish(local_b8,param_3);
  mbedtls_platform_zeroize(local_b8,0x5c);
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return 0;
}

