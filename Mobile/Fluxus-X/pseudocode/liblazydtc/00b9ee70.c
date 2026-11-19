/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9ee70
 */

int FUN_00b9ee70(long *param_1,byte *param_2,long param_3)

{
  uint uVar1;
  long lVar2;
  uint uVar3;
  long lVar4;
  int iVar5;
  long lVar6;
  uint uVar7;
  long lVar8;
  byte bVar9;
  ulong uVar10;
  undefined1 auStack_60 [8];
  uint local_58 [4];
  long local_48;
  
  lVar4 = tpidr_el0;
  local_48 = *(long *)(lVar4 + 0x28);
  mbedtls_platform_zeroize(local_58,0x10);
  if (*param_1 == 0) {
    uVar10 = 0;
  }
  else {
    uVar10 = (ulong)*(uint *)(*param_1 + 8) & 0x1f;
  }
  iVar5 = mbedtls_cipher_update(param_1,local_58,uVar10,local_58,auStack_60);
  if (iVar5 != 0) goto LAB_00b9efe8;
  iVar5 = (int)uVar10;
  if (iVar5 == 0x10) {
    bVar9 = 0x87;
LAB_00b9ef00:
    lVar8 = uVar10 - 4;
    uVar7 = 0;
    do {
      lVar6 = lVar8 + 4;
      uVar3 = (*(uint *)((long)local_58 + lVar8) & 0xff00ff00) >> 8 |
              (*(uint *)((long)local_58 + lVar8) & 0xff00ff) << 8;
      uVar1 = (uVar3 >> 0x10 | uVar3 << 0x10) << 1;
      uVar7 = (uVar1 & 0xff00ff00) >> 8 | (uVar7 | uVar1 & 0xff00ff) << 8;
      *(uint *)(param_2 + lVar8) = uVar7 >> 0x10 | uVar7 << 0x10;
      lVar8 = lVar8 + -4;
      uVar7 = (uVar3 & 0xffff) >> 0xf;
    } while (7 < lVar6);
    lVar8 = uVar10 - 1;
    param_2[lVar8] = bVar9 & (byte)((long)-(ulong)((byte)local_58[0] >> 7) >> 0x3f) ^ param_2[lVar8]
    ;
    if (iVar5 == 0x10) {
      bVar9 = 0x87;
    }
    else {
      if (iVar5 != 8) goto LAB_00b9ef80;
      bVar9 = 0x1b;
    }
    lVar6 = uVar10 - 4;
    uVar7 = 0;
    do {
      lVar2 = lVar6 + 4;
      uVar3 = (*(uint *)(param_2 + lVar6) & 0xff00ff00) >> 8 |
              (*(uint *)(param_2 + lVar6) & 0xff00ff) << 8;
      uVar1 = (uVar3 >> 0x10 | uVar3 << 0x10) << 1;
      uVar7 = (uVar1 & 0xff00ff00) >> 8 | (uVar7 | uVar1 & 0xff00ff) << 8;
      *(uint *)(param_3 + lVar6) = uVar7 >> 0x10 | uVar7 << 0x10;
      lVar6 = lVar6 + -4;
      uVar7 = (uVar3 & 0xffff) >> 0xf;
    } while (7 < lVar2);
    iVar5 = 0;
    *(byte *)(param_3 + lVar8) =
         bVar9 & (byte)((long)-(ulong)(*param_2 >> 7) >> 0x3f) ^ *(byte *)(param_3 + lVar8);
  }
  else {
    if (iVar5 == 8) {
      bVar9 = 0x1b;
      goto LAB_00b9ef00;
    }
LAB_00b9ef80:
    iVar5 = -0x6100;
  }
LAB_00b9efe8:
  mbedtls_platform_zeroize(local_58,0x10);
  if (*(long *)(lVar4 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar5;
}

