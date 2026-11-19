/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b88d34
 */

void psa_sign_message_builtin
               (ushort *param_1,undefined8 param_2,undefined8 param_3,uint param_4,
               undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8,
               undefined8 param_9)

{
  uint uVar1;
  long lVar2;
  undefined8 uVar3;
  uint uVar4;
  undefined8 local_b0;
  undefined1 auStack_a8 [64];
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  uVar1 = param_4 & 0xffffff00;
  if (0x60008ff < (int)uVar1) {
    if (uVar1 == 0x6001300) goto LAB_00b88df4;
    if (uVar1 != 0x6000900) goto LAB_00b88de0;
    goto LAB_00b88e58;
  }
  if ((uVar1 == 0x6000200) || (uVar1 == 0x6000300)) {
LAB_00b88df4:
    if ((int)uVar1 < 0x6000900) {
      if (uVar1 == 0x6000200) goto LAB_00b88e58;
      uVar4 = 0x300;
LAB_00b88e34:
      if ((uVar1 == (uVar4 | 0x6000000)) || ((param_4 >> 9 | 1) == 0x30003)) goto LAB_00b88e58;
      uVar4 = 0;
    }
    else {
      if (uVar1 != 0x6000900) {
        uVar4 = 0x1300;
        goto LAB_00b88e34;
      }
LAB_00b88e58:
      uVar4 = 0;
      if ((param_4 & 0xff) != 0) {
        uVar4 = param_4 & 0xff | 0x2000000;
      }
    }
    uVar3 = mbedtls_psa_hash_compute(uVar4,param_5,param_6,auStack_a8,0x40,&local_b0);
    if ((int)uVar3 != 0) goto LAB_00b88f58;
    if (*(uint *)(param_1 + 2) < 0x100) {
      if (*param_1 == 0x7001) {
        if (((uVar1 == 0x6000200) || (uVar1 == 0x6001300)) || (uVar1 == 0x6000300)) {
          uVar3 = mbedtls_psa_rsa_sign_hash
                            (param_1,param_2,param_3,param_4,auStack_a8,local_b0,param_7,param_8,
                             param_9);
          goto LAB_00b88f58;
        }
      }
      else {
        if ((*param_1 & 0xcf00) != 0x4100) goto LAB_00b88f54;
        if (param_4 >> 9 == 0x30003) {
          uVar3 = mbedtls_psa_ecdsa_sign_hash
                            (param_1,param_2,param_3,param_4,auStack_a8,local_b0,param_7,param_8,
                             param_9);
          goto LAB_00b88f58;
        }
      }
    }
    uVar3 = 0xffffff79;
  }
  else {
LAB_00b88de0:
    if ((param_4 >> 9 | 1) == 0x30003) goto LAB_00b88df4;
LAB_00b88f54:
    uVar3 = 0xffffff7a;
  }
LAB_00b88f58:
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

