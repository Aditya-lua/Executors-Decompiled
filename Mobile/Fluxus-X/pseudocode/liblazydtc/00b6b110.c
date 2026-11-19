/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6b110
 */

undefined8 mbedtls_ccm_starts(long param_1,undefined4 param_2,void *param_3,size_t param_4)

{
  undefined8 uVar1;
  
  if (param_4 - 7 < 7) {
    *(uint *)(param_1 + 0x40) = 0xf - ((uint)param_4 & 0xff);
    *(undefined4 *)(param_1 + 0x44) = param_2;
    *(undefined8 *)(param_1 + 0x10) = 0;
    *(undefined8 *)(param_1 + 0x18) = 0;
    *(char *)(param_1 + 0x10) = '\x0e' - (char)param_4;
    memcpy((void *)(param_1 + 0x11),param_3,param_4);
    memset((void *)(param_1 + 0x11 + param_4),0,(ulong)*(uint *)(param_1 + 0x40));
    *(undefined1 *)(param_1 + 0x1f) = 1;
    memcpy((void *)(param_1 + 1),param_3,param_4);
    *(uint *)(param_1 + 0xa8) = *(uint *)(param_1 + 0xa8) | 1;
    uVar1 = FUN_00b6b1c8(param_1);
    return uVar1;
  }
  return 0xfffffff3;
}

