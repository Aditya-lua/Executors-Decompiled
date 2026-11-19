/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b890b4
 */

void FUN_00b890b4(undefined4 param_1,int param_2,uint param_3,undefined8 param_4,undefined8 param_5,
                 long param_6,long param_7,long *param_8)

{
  ushort uVar1;
  long lVar2;
  uint uVar3;
  uint uVar4;
  ulong uVar5;
  undefined4 uVar6;
  long lVar7;
  ushort *local_70;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  *param_8 = 0;
  uVar5 = FUN_00b8a264(param_2,param_3);
  if ((int)uVar5 != 0) goto LAB_00b89274;
  if (param_7 == 0) {
    uVar5 = 0xffffff76;
    goto LAB_00b89274;
  }
  uVar6 = 0x400;
  if (param_2 == 0) {
    uVar6 = 0x1000;
  }
  uVar3 = FUN_00b86e5c(param_1,&local_70,uVar6,param_3);
  if (uVar3 == 0) {
    uVar1 = *local_70;
    if ((~uVar1 & 0x7000) == 0) {
      if (param_2 != 0) {
        uVar3 = psa_sign_message_builtin();
LAB_00b89188:
        lVar7 = *param_8;
        if (uVar3 != 0) {
          lVar7 = 0;
        }
        goto LAB_00b89254;
      }
      if (*(uint *)(local_70 + 2) < 0x100) {
        if (uVar1 == 0x7001) {
          param_3 = param_3 & 0xffffff00;
          if (((param_3 == 0x6000200) || (param_3 == 0x6001300)) || (param_3 == 0x6000300)) {
            uVar3 = mbedtls_psa_rsa_sign_hash();
            goto LAB_00b89188;
          }
        }
        else {
          if ((uVar1 & 0xcf00) != 0x4100) {
            lVar7 = 0;
            uVar3 = 0xffffff7a;
            goto LAB_00b89254;
          }
          if (param_3 >> 9 == 0x30003) {
            uVar3 = mbedtls_psa_ecdsa_sign_hash
                              (local_70,*(undefined8 *)(local_70 + 0x14),
                               *(undefined8 *)(local_70 + 0x18),param_3,param_4,param_5,param_6,
                               param_7,param_8);
            goto LAB_00b89188;
          }
        }
      }
    }
    lVar7 = 0;
    uVar3 = 0xffffff79;
  }
  else {
    lVar7 = 0;
  }
LAB_00b89254:
  memset((void *)(param_6 + lVar7),0x21,param_7 - lVar7);
  uVar4 = psa_unregister_read_under_mutex(local_70);
  if (uVar3 != 0) {
    uVar4 = uVar3;
  }
  uVar5 = (ulong)uVar4;
LAB_00b89274:
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar5);
  }
  return;
}

