/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba7de4
 */

int mbedtls_rsa_rsaes_pkcs1_v15_decrypt
              (long param_1,undefined8 param_2,undefined8 param_3,ulong *param_4,undefined8 param_5,
              void *param_6,ulong param_7)

{
  ulong __n;
  long lVar1;
  int iVar2;
  ulong uVar3;
  ulong uVar4;
  byte *pbVar5;
  long lVar6;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  byte local_470 [11];
  undefined1 auStack_465 [1013];
  long local_70;
  
  lVar1 = tpidr_el0;
  local_70 = *(long *)(lVar1 + 0x28);
  iVar2 = -0x4080;
  if ((*(int *)(param_1 + 0xe0) == 0) && (lVar7 = *(long *)(param_1 + 8), lVar7 - 0x10U < 0x3f1)) {
    iVar2 = mbedtls_rsa_private();
    if (iVar2 == 0) {
      uVar4 = 0;
      uVar3 = 0;
      lVar6 = lVar7 + -2;
      pbVar5 = (byte *)((ulong)local_470 | 2);
      do {
        lVar6 = lVar6 + -1;
        uVar4 = uVar4 | (long)(-(ulong)*pbVar5 | (ulong)*pbVar5) >> 0x3f ^ 0xffffffffffffffffU;
        uVar3 = ((ulong)~(uint)uVar4 & 1) + uVar3;
        pbVar5 = pbVar5 + 1;
      } while (lVar6 != 0);
      __n = lVar7 - 0xbU;
      if (param_7 <= lVar7 - 0xbU) {
        __n = param_7;
      }
      uVar4 = (long)(-((ulong)local_470[1] ^ 2) | (ulong)local_470[1] ^ 2 |
                    -(ulong)local_470[0] | (ulong)local_470[0]) >> 0x3f | uVar4 ^ 0xffffffffffffffff
              | (long)(uVar3 - 8 & (uVar3 ^ 0xfffffffffffffff7) | (uVar3 ^ 8) & 8) >> 0x3f;
      uVar3 = __n & 0xffffffff & uVar4 | ~uVar4 & (ulong)(uint)(((int)lVar7 + -3) - (int)uVar3);
      uVar8 = __n - uVar3 & (uVar3 ^ __n ^ 0xffffffffffffffff);
      uVar9 = (long)(uVar8 | (uVar3 ^ __n) & uVar3) >> 0x3f;
      iVar2 = -((uint)uVar4 & 0x4100 | ~(uint)uVar4 & (uint)((long)uVar8 >> 0x3f) & 0x4400);
      mbedtls_ct_zeroize_if(uVar9 | uVar4,auStack_465);
      uVar3 = __n & 0xffffffff & uVar9 | ~uVar9 & uVar3;
      mbedtls_ct_memmove_left(local_470 + (lVar7 - __n),__n,__n - uVar3);
      if (param_7 != 0) {
        memcpy(param_6,local_470 + (lVar7 - __n),__n);
      }
      *param_4 = uVar3;
    }
    mbedtls_platform_zeroize(local_470,0x400);
  }
  if (*(long *)(lVar1 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

