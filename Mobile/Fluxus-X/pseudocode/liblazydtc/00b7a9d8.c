/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7a9d8
 */

int mbedtls_nist_kw_unwrap
              (undefined8 param_1,int param_2,undefined8 param_3,ulong param_4,undefined8 *param_5,
              size_t *param_6,ulong param_7)

{
  uint uVar1;
  long lVar2;
  uint uVar3;
  int iVar4;
  ulong uVar5;
  ulong uVar6;
  int local_6c;
  undefined8 local_68;
  undefined1 auStack_60 [8];
  undefined8 local_58;
  undefined8 uStack_50;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  *param_6 = 0;
  if (param_7 < param_4 - 8) {
    iVar4 = -0x6100;
    goto LAB_00b7ab24;
  }
  if (param_2 == 1) {
    iVar4 = -0x6100;
    if ((0xfffffff0 < param_4 - 0x10) || ((param_4 & 7) != 0)) goto LAB_00b7ab24;
    if (param_4 == 0x10) {
      iVar4 = mbedtls_cipher_update(param_1,param_3,0x10,&local_58,auStack_60);
      if (iVar4 == 0) {
        local_68 = local_58;
        *param_5 = uStack_50;
        mbedtls_platform_zeroize(&local_58,0x10);
        *param_6 = 8;
LAB_00b7ab70:
        local_6c = mbedtls_ct_memcmp(&DAT_0077ff80,&local_68,4);
        uVar1 = (local_68._4_4_ & 0xff00ff00) >> 8 | (local_68._4_4_ & 0xff00ff) << 8;
        uVar6 = (ulong)(uVar1 >> 0x10 | uVar1 << 0x10);
        uVar5 = (param_4 - 8) - uVar6;
        uVar1 = 0;
        if (local_6c != 0) {
          uVar1 = 0x6300;
        }
        uVar3 = (uint)(uVar5 >> 0x20);
        uVar3 = (int)((uint)(7 - uVar5 >> 0x20) & (uVar3 ^ 0xffffffff) | uVar3) >> 0x1f;
        local_58 = 0;
        local_6c = mbedtls_ct_memcmp_partial
                             ((long)param_5 + (*param_6 - 8),&local_58,8,8 - (uVar5 & 7),0);
        iVar4 = -0x6300;
        if (local_6c == 0) {
          iVar4 = -(uVar3 & 0x6300 | ~uVar3 & uVar1);
        }
        if (iVar4 == 0) {
          memset((void *)((long)param_5 + uVar6),0,uVar5 & 7);
          *param_6 = uVar6;
          goto LAB_00b7ab0c;
        }
      }
    }
    else {
      iVar4 = FUN_00b7ac30(param_1,param_3,param_4 >> 3,&local_68,param_5,param_6);
      if (iVar4 == 0) goto LAB_00b7ab70;
    }
LAB_00b7aaf8:
    memset(param_5,0,*param_6);
    *param_6 = 0;
  }
  else {
    if (param_2 != 0) {
      iVar4 = -0x6080;
      goto LAB_00b7aaf8;
    }
    iVar4 = -0x6100;
    if ((0x1ffffffffffffe8 < param_4 - 0x18) || ((param_4 & 7) != 0)) goto LAB_00b7ab24;
    iVar4 = FUN_00b7ac30(param_1,param_3,param_4 >> 3,&local_68,param_5,param_6);
    if (iVar4 != 0) goto LAB_00b7aaf8;
    local_6c = mbedtls_ct_memcmp(&DAT_0077ff78,&local_68,8);
    if (local_6c != 0) {
      iVar4 = -0x6300;
      goto LAB_00b7aaf8;
    }
    iVar4 = 0;
  }
LAB_00b7ab0c:
  mbedtls_platform_zeroize(&local_6c,4);
  mbedtls_platform_zeroize(&local_68,8);
LAB_00b7ab24:
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar4;
}

