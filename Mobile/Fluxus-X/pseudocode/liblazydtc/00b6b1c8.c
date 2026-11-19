/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6b1c8
 */

void FUN_00b6b1c8(byte *param_1)

{
  long lVar1;
  undefined8 uVar2;
  ulong uVar3;
  uint uVar4;
  undefined1 auStack_30 [8];
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  uVar2 = 0;
  if ((~*(uint *)(param_1 + 0xa8) & 3) == 0) {
    if (*(long *)(param_1 + 0x30) == 0) {
      if ((*(uint *)(param_1 + 0x44) & 0xfffffffe) != 2) {
        uVar2 = 0xfffffff3;
        goto LAB_00b6b2c4;
      }
      uVar3 = 0;
      param_1[0x20] = 0;
      param_1[0x21] = 0;
      param_1[0x22] = 0;
      param_1[0x23] = 0;
      param_1[0x24] = 0;
      param_1[0x25] = 0;
      param_1[0x26] = 0;
      param_1[0x27] = 0;
    }
    else {
      uVar3 = *(ulong *)(param_1 + 0x20);
    }
    *param_1 = *param_1 | (char)*(long *)(param_1 + 0x30) * '\x04' - 8U & 0xf8 |
               (*(long *)(param_1 + 0x28) != 0) << 6 | (char)*(int *)(param_1 + 0x40) - 1U;
    if (*(int *)(param_1 + 0x40) != 0) {
      uVar4 = 0;
      do {
        param_1[0xf - (long)(int)uVar4] = (byte)uVar3;
        uVar4 = uVar4 + 1 & 0xff;
        uVar3 = uVar3 >> 8;
      } while (uVar4 < *(uint *)(param_1 + 0x40));
    }
    if (uVar3 == 0) {
      uVar2 = mbedtls_cipher_update(param_1 + 0x48,param_1,0x10,param_1,auStack_30);
      if ((int)uVar2 == 0) goto LAB_00b6b2c4;
      uVar4 = *(uint *)(param_1 + 0xa8);
    }
    else {
      uVar4 = *(uint *)(param_1 + 0xa8);
      uVar2 = 0xfffffff3;
    }
    *(uint *)(param_1 + 0xa8) = uVar4 | 0x10;
  }
LAB_00b6b2c4:
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar2);
  }
  return;
}

