/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b892b4
 */

void psa_verify_message_builtin
               (ushort *param_1,undefined8 param_2,undefined8 param_3,uint param_4,
               undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8)

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
    if (uVar1 == 0x6001300) goto LAB_00b89374;
    if (uVar1 != 0x6000900) goto LAB_00b89360;
    goto LAB_00b893d8;
  }
  if ((uVar1 == 0x6000200) || (uVar1 == 0x6000300)) {
LAB_00b89374:
    if ((int)uVar1 < 0x6000900) {
      if (uVar1 == 0x6000200) goto LAB_00b893d8;
      uVar4 = 0x300;
LAB_00b893b4:
      if ((uVar1 == (uVar4 | 0x6000000)) || ((param_4 >> 9 | 1) == 0x30003)) goto LAB_00b893d8;
      uVar4 = 0;
    }
    else {
      if (uVar1 != 0x6000900) {
        uVar4 = 0x1300;
        goto LAB_00b893b4;
      }
LAB_00b893d8:
      uVar4 = 0;
      if ((param_4 & 0xff) != 0) {
        uVar4 = param_4 & 0xff | 0x2000000;
      }
    }
    uVar3 = mbedtls_psa_hash_compute(uVar4,param_5,param_6,auStack_a8,0x40,&local_b0);
    if ((int)uVar3 != 0) goto LAB_00b894d0;
    if (*(uint *)(param_1 + 2) < 0x100) {
      if ((*param_1 & 0xcfff) == 0x4001) {
        if (((uVar1 == 0x6000200) || (uVar1 == 0x6001300)) || (uVar1 == 0x6000300)) {
          uVar3 = mbedtls_psa_rsa_verify_hash
                            (param_1,param_2,param_3,param_4,auStack_a8,local_b0,param_7,param_8);
          goto LAB_00b894d0;
        }
      }
      else {
        if ((*param_1 & 0xcf00) != 0x4100) goto LAB_00b894cc;
        if (param_4 >> 9 == 0x30003) {
          uVar3 = mbedtls_psa_ecdsa_verify_hash
                            (param_1,param_2,param_3,param_4,auStack_a8,local_b0,param_7,param_8);
          goto LAB_00b894d0;
        }
      }
    }
    uVar3 = 0xffffff79;
  }
  else {
LAB_00b89360:
    if ((param_4 >> 9 | 1) == 0x30003) goto LAB_00b89374;
LAB_00b894cc:
    uVar3 = 0xffffff7a;
  }
LAB_00b894d0:
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

