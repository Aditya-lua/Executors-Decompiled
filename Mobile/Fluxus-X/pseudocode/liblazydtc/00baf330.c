/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00baf330
 */

undefined4
mbedtls_sha3(int param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,undefined8 param_5
            )

{
  long lVar1;
  undefined4 uVar2;
  ulong uVar3;
  undefined1 auStack_128 [204];
  undefined2 local_5c;
  undefined2 local_5a;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  memset(auStack_128,0,0xd0);
  if (param_1 - 1U < 4) {
    uVar3 = (ulong)(param_1 - 1U) << 4;
    local_5c = (undefined2)(0x4000300020001c >> (uVar3 & 0x3f));
    local_5a = (undefined2)(0x48006800880090 >> (uVar3 & 0x3f));
    memset(auStack_128,0,0xcc);
    mbedtls_sha3_update(auStack_128,param_2,param_3);
    uVar2 = mbedtls_sha3_finish(auStack_128,param_4,param_5);
  }
  else {
    uVar2 = 0xffffff8a;
  }
  mbedtls_platform_zeroize(auStack_128,0xd0);
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar2;
}

