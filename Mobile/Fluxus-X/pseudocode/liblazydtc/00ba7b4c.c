/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba7b4c
 */

int mbedtls_rsa_rsaes_oaep_decrypt
              (long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
              undefined8 param_5,size_t *param_6,undefined8 param_7,void *param_8,byte *param_9)

{
  long lVar1;
  byte bVar2;
  int iVar3;
  ulong uVar4;
  byte *__src;
  ulong uVar5;
  long lVar6;
  byte *pbVar7;
  ulong uVar8;
  ulong uVar9;
  long lVar10;
  undefined1 auStack_4b0 [64];
  byte local_470 [1024];
  long local_70;
  
  lVar1 = tpidr_el0;
  local_70 = *(long *)(lVar1 + 0x28);
  if (*(int *)(param_1 + 0xe0) == 1) {
    uVar8 = *(ulong *)(param_1 + 8);
    if (uVar8 - 0x10 < 0x3f1) {
      mbedtls_md_info_from_type(*(undefined4 *)(param_1 + 0xe4));
      bVar2 = mbedtls_md_get_size();
      if (bVar2 != 0) {
        if ((uint)bVar2 * 2 + 2 <= uVar8) {
          iVar3 = mbedtls_rsa_private(param_1,param_2,param_3,param_7,local_470);
          if (iVar3 == 0) {
            uVar9 = (ulong)bVar2;
            uVar4 = (ulong)local_470 | 1;
            lVar10 = (uVar8 - uVar9) + -1;
            iVar3 = FUN_00ba76c0(uVar4,uVar9,local_470 + uVar9 + 1,lVar10,
                                 *(undefined4 *)(param_1 + 0xe4));
            if (iVar3 == 0) {
              iVar3 = FUN_00ba76c0(local_470 + uVar9 + 1,lVar10,uVar4,uVar9,
                                   *(undefined4 *)(param_1 + 0xe4));
              if (iVar3 == 0) {
                lVar10 = mbedtls_md_info_from_type(*(undefined4 *)(param_1 + 0xe4));
                if (lVar10 == 0) {
                  iVar3 = -0x4080;
                }
                else {
                  iVar3 = mbedtls_md(lVar10,param_4,param_5,auStack_4b0);
                  if (iVar3 == 0) {
                    iVar3 = mbedtls_ct_memcmp(auStack_4b0,uVar4 + uVar9,uVar9);
                    uVar5 = 0xffffffffffffffff;
                    lVar6 = (uVar8 - 2) - (ulong)((uint)bVar2 * 2);
                    lVar10 = 0;
                    if (lVar6 != 0) {
                      pbVar7 = (byte *)((ulong)(local_470 + uVar9 * 2) | 1);
                      do {
                        lVar6 = lVar6 + -1;
                        uVar5 = uVar5 & ((long)(-(ulong)*pbVar7 | (ulong)*pbVar7) >> 0x3f ^
                                        0xffffffffffffffffU);
                        lVar10 = (uVar5 & 1) + lVar10;
                        pbVar7 = pbVar7 + 1;
                      } while (lVar6 != 0);
                    }
                    pbVar7 = (byte *)(uVar4 + uVar9 + uVar9 + lVar10);
                    __src = pbVar7 + 1;
                    uVar4 = (ulong)*pbVar7 ^ 1;
                    if ((long)(-(long)iVar3 | (long)iVar3 |
                               -(ulong)local_470[0] | (ulong)local_470[0] | -uVar4 | uVar4) < 0) {
                      iVar3 = -0x4100;
                    }
                    else {
                      pbVar7 = local_470 + (uVar8 - (long)__src);
                      if (param_9 < pbVar7) {
                        iVar3 = -0x4400;
                      }
                      else {
                        *param_6 = (size_t)pbVar7;
                        if (pbVar7 != (byte *)0x0) {
                          memcpy(param_8,__src,(size_t)pbVar7);
                        }
                        iVar3 = 0;
                      }
                    }
                  }
                }
              }
            }
          }
          mbedtls_platform_zeroize(local_470,0x400);
          mbedtls_platform_zeroize(auStack_4b0,0x40);
          goto LAB_00ba7be0;
        }
      }
    }
  }
  iVar3 = -0x4080;
LAB_00ba7be0:
  if (*(long *)(lVar1 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

