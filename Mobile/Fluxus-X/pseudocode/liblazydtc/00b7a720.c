/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7a720
 */

int mbedtls_nist_kw_wrap
              (undefined8 param_1,int param_2,void *param_3,ulong param_4,byte *param_5,
              long *param_6,ulong param_7)

{
  ulong uVar1;
  uint uVar2;
  long lVar3;
  int iVar4;
  ulong uVar5;
  size_t __n;
  ulong uVar6;
  byte *pbVar7;
  byte *pbVar8;
  undefined1 auStack_98 [8];
  undefined8 local_90;
  undefined8 uStack_88;
  undefined1 local_78 [8];
  undefined8 local_70;
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  *param_6 = 0;
  if (param_2 == 0) {
    if (param_7 < param_4 + 8) {
      iVar4 = -0x6100;
      goto LAB_00b7a9a0;
    }
    iVar4 = -0x6100;
    if ((0x1ffffffffffffe8 < param_4 - 0x10) || ((param_4 & 7) != 0)) goto LAB_00b7a9a0;
    param_5[0] = 0xa6;
    param_5[1] = 0xa6;
    param_5[2] = 0xa6;
    param_5[3] = 0xa6;
    param_5[4] = 0xa6;
    param_5[5] = 0xa6;
    param_5[6] = 0xa6;
    param_5[7] = 0xa6;
    memmove(param_5 + 8,param_3,param_4);
    __n = 0;
  }
  else {
    __n = 0;
    if ((param_4 & 7) != 0) {
      __n = 8 - (param_4 & 7);
    }
    iVar4 = -0x6100;
    if ((0xfffffffe < param_4 - 1) || (param_7 < param_4 + __n + 8)) goto LAB_00b7a9a0;
    uVar2 = ((uint)param_4 & 0xff00ff00) >> 8 | ((uint)param_4 & 0xff00ff) << 8;
    param_5[0] = 0xa6;
    param_5[1] = 0x59;
    param_5[2] = 0x59;
    param_5[3] = 0xa6;
    *(uint *)(param_5 + 4) = uVar2 >> 0x10 | uVar2 << 0x10;
    memcpy(param_5 + 8,param_3,param_4);
    memset(param_5 + 8 + param_4,0,__n);
  }
  uVar5 = __n + param_4 >> 3;
  uVar1 = uVar5 + 1;
  if ((param_2 == 1) && (param_4 < 9)) {
    uStack_88 = *(undefined8 *)(param_5 + 8);
    local_90 = *(undefined8 *)param_5;
    iVar4 = mbedtls_cipher_update(param_1,&local_90,0x10,param_5,auStack_98);
    if (iVar4 != 0) goto LAB_00b7a974;
LAB_00b7a960:
    iVar4 = 0;
    *param_6 = uVar1 * 8;
  }
  else {
    if (2 < uVar1) {
      if (uVar5 * 3 != 0) {
        uVar6 = 0;
        pbVar7 = param_5 + 8;
        do {
          local_90 = *(undefined8 *)param_5;
          uStack_88 = *(undefined8 *)pbVar7;
          iVar4 = mbedtls_cipher_update(param_1,&local_90,0x10,local_78,auStack_98);
          if (iVar4 != 0) goto LAB_00b7a974;
          uVar6 = uVar6 + 1;
          *param_5 = local_78[0] ^ (byte)(uVar6 >> 0x38);
          param_5[1] = (byte)(uVar6 >> 0x30) ^ local_78[1];
          param_5[2] = (byte)(uVar6 >> 0x28) ^ local_78[2];
          param_5[3] = (byte)(uVar6 >> 0x20) ^ local_78[3];
          param_5[4] = local_78[4] ^ (byte)(uVar6 >> 0x18);
          param_5[5] = local_78[5] ^ (byte)(uVar6 >> 0x10);
          param_5[6] = local_78[6] ^ (byte)(uVar6 >> 8);
          param_5[7] = local_78[7] ^ (byte)uVar6;
          pbVar8 = pbVar7 + 8;
          *(undefined8 *)pbVar7 = local_70;
          pbVar7 = pbVar8;
          if (param_5 + uVar1 * 8 <= pbVar8) {
            pbVar7 = param_5 + 8;
          }
        } while (uVar6 < uVar5 * 6);
      }
      goto LAB_00b7a960;
    }
    iVar4 = -0x6100;
LAB_00b7a974:
    memset(param_5,0,uVar1 * 8);
  }
  mbedtls_platform_zeroize(&local_90,0x10);
  mbedtls_platform_zeroize(local_78,0x10);
LAB_00b7a9a0:
  if (*(long *)(lVar3 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar4;
}

