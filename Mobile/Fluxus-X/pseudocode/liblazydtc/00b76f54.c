/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b76f54
 */

void mbedtls_gcm_setkey(long param_1,undefined4 param_2,undefined8 param_3,int param_4)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  byte bVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  undefined8 local_60;
  ulong local_58;
  ulong uStack_50;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  if ((((param_4 == 0x80) || (param_4 == 0x100)) || (param_4 == 0xc0)) &&
     ((lVar3 = mbedtls_cipher_info_from_values(param_2,param_4,1), lVar3 != 0 &&
      ((*(uint *)(lVar3 + 8) & 0x1f) == 0x10)))) {
    mbedtls_cipher_free(param_1);
    uVar4 = mbedtls_cipher_setup(param_1,lVar3);
    if (((int)uVar4 == 0) &&
       (uVar4 = mbedtls_cipher_setkey(param_1,param_3,param_4,1), (int)uVar4 == 0)) {
      local_58 = 0;
      uStack_50 = 0;
      local_60 = 0;
      uVar4 = mbedtls_cipher_update(param_1,&local_58,0x10,&local_58,&local_60);
      if ((int)uVar4 == 0) {
        *(undefined1 *)(param_1 + 0x1a1) = 0;
        *(undefined8 *)(param_1 + 0x60) = 0;
        *(undefined8 *)(param_1 + 0x68) = 0;
        uVar11 = (uStack_50 & 0xff00ff00ff00ff00) >> 8 | (uStack_50 & 0xff00ff00ff00ff) << 8;
        uVar11 = (uVar11 & 0xffff0000ffff0000) >> 0x10 | (uVar11 & 0xffff0000ffff) << 0x10;
        uVar10 = uVar11 >> 0x20 | uVar11 << 0x20;
        uVar11 = (local_58 & 0xff00ff00ff00ff00) >> 8 | (local_58 & 0xff00ff00ff00ff) << 8;
        uVar11 = (uVar11 & 0xffff0000ffff0000) >> 0x10 | (uVar11 & 0xffff0000ffff) << 0x10;
        uVar11 = uVar11 >> 0x20 | uVar11 << 0x20;
        uVar12 = uVar10 >> 1;
        uVar13 = uVar11 >> 1;
        bVar9 = 0;
        if ((uStack_50 & 0x100000000000000) != 0) {
          bVar9 = 0xe1;
        }
        *(ulong *)(param_1 + 0xe0) = uVar11;
        *(ulong *)(param_1 + 0xe8) = uVar10;
        uVar11 = (uVar12 & 0xff00ff00ff00ff00) >> 8 | (uVar12 & 0xff00ff00ff00ff) << 8;
        uVar14 = uVar11 & 0xffff0000ffff0000;
        uVar8 = (uVar11 & 0xffff0000ffff) << 0x10;
        uVar11 = uVar14 >> 0x10 | uVar8;
        uVar10 = (uVar13 & 0xff00ff00ff00ff00) >> 8 | (uVar13 & 0xff00ff00ff00ff) << 8;
        uVar13 = uVar10 & 0xffff0000ffff0000;
        uVar12 = uVar13 >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
        *(ulong *)(param_1 + 0xa0) = uVar12 >> 0x20 | uVar12 << 0x20;
        *(ulong *)(param_1 + 0xa8) = uVar11 >> 0x20 | uVar11 << 0x20;
        *(byte *)(param_1 + 0xa8) = (byte)(local_58 >> 0x31) & 0x80 | (byte)(uVar14 >> 0x30);
        *(byte *)(param_1 + 0xa0) = bVar9 ^ (byte)(uVar13 >> 0x30);
        uVar11 = *(ulong *)(param_1 + 0xa0);
        uVar10 = *(ulong *)(param_1 + 0xa8);
        bVar9 = 0;
        if ((uVar8 & 0x1000000) != 0) {
          bVar9 = 0xe1;
        }
        uVar13 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
        uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
        uVar14 = uVar13 >> 0x20 | uVar13 << 0x20;
        uVar13 = (uVar11 & 0xff00ff00ff00ff00) >> 8 | (uVar11 & 0xff00ff00ff00ff) << 8;
        uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
        uVar13 = uVar13 >> 0x20 | uVar13 << 0x20;
        uVar5 = uVar14 >> 1;
        uVar6 = uVar13 >> 1;
        *(ulong *)(param_1 + 0xa0) = uVar13;
        *(ulong *)(param_1 + 0xa8) = uVar14;
        uVar13 = ((local_58 ^ uVar11) & 0xff00ff00ff00ff00) >> 8 |
                 ((local_58 ^ uVar11) & 0xff00ff00ff00ff) << 8;
        uVar14 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
        uVar13 = ((uStack_50 ^ uVar10) & 0xff00ff00ff00ff00) >> 8 |
                 ((uStack_50 ^ uVar10) & 0xff00ff00ff00ff) << 8;
        uVar8 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
        uVar13 = (uVar5 & 0xff00ff00ff00ff00) >> 8 | (uVar5 & 0xff00ff00ff00ff) << 8;
        uVar15 = uVar13 & 0xffff0000ffff0000;
        uVar1 = (uVar13 & 0xffff0000ffff) << 0x10;
        uVar13 = uVar15 >> 0x10 | uVar1;
        uVar5 = (uVar6 & 0xff00ff00ff00ff00) >> 8 | (uVar6 & 0xff00ff00ff00ff) << 8;
        uVar6 = uVar5 & 0xffff0000ffff0000;
        uVar5 = uVar6 >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
        *(ulong *)(param_1 + 0x80) = uVar5 >> 0x20 | uVar5 << 0x20;
        *(ulong *)(param_1 + 0x88) = uVar13 >> 0x20 | uVar13 << 0x20;
        *(byte *)(param_1 + 0x88) =
             (byte)((uVar12 & 0xffffffff) >> 0x11) & 0x80 | (byte)(uVar15 >> 0x30);
        *(byte *)(param_1 + 0x80) = bVar9 ^ (byte)(uVar6 >> 0x30);
        uVar12 = *(ulong *)(param_1 + 0x80);
        uVar13 = *(ulong *)(param_1 + 0x88);
        *(ulong *)(param_1 + 0x120) = uVar14 >> 0x20 | uVar14 << 0x20;
        *(ulong *)(param_1 + 0x128) = uVar8 >> 0x20 | uVar8 << 0x20;
        uVar14 = (uVar13 & 0xff00ff00ff00ff00) >> 8 | (uVar13 & 0xff00ff00ff00ff) << 8;
        uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10;
        uVar15 = uVar14 >> 0x20 | uVar14 << 0x20;
        uVar14 = (uVar12 & 0xff00ff00ff00ff00) >> 8 | (uVar12 & 0xff00ff00ff00ff) << 8;
        uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10;
        uVar6 = uVar14 >> 0x20 | uVar14 << 0x20;
        uVar14 = uVar15 >> 1;
        uVar8 = uVar6 >> 1;
        bVar9 = 0;
        if ((uVar1 & 0x1000000) != 0) {
          bVar9 = 0xe1;
        }
        uVar14 = (uVar14 & 0xff00ff00ff00ff00) >> 8 | (uVar14 & 0xff00ff00ff00ff) << 8;
        uVar1 = uVar14 & 0xffff0000ffff0000;
        uVar14 = uVar1 >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10;
        uVar8 = (uVar8 & 0xff00ff00ff00ff00) >> 8 | (uVar8 & 0xff00ff00ff00ff) << 8;
        uVar7 = uVar8 & 0xffff0000ffff0000;
        uVar8 = uVar7 >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
        *(ulong *)(param_1 + 0x70) = uVar8 >> 0x20 | uVar8 << 0x20;
        *(ulong *)(param_1 + 0x78) = uVar14 >> 0x20 | uVar14 << 0x20;
        *(byte *)(param_1 + 0x78) =
             (byte)((uVar5 & 0xffffffff) >> 0x11) & 0x80 | (byte)(uVar1 >> 0x30);
        *(byte *)(param_1 + 0x70) = bVar9 ^ (byte)(uVar7 >> 0x30);
        uVar14 = *(ulong *)(param_1 + 0x70);
        uVar8 = *(ulong *)(param_1 + 0x78);
        uVar16 = uVar10 ^ uVar13;
        uVar7 = uVar11 ^ uVar12;
        *(ulong *)(param_1 + 0x80) = uVar6;
        *(ulong *)(param_1 + 0x88) = uVar15;
        uVar5 = (uVar7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 & 0xff00ff00ff00ff) << 8;
        uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
        uVar15 = (uVar16 & 0xff00ff00ff00ff00) >> 8 | (uVar16 & 0xff00ff00ff00ff) << 8;
        uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
        uVar6 = ((local_58 ^ uVar12) & 0xff00ff00ff00ff00) >> 8 |
                ((local_58 ^ uVar12) & 0xff00ff00ff00ff) << 8;
        uVar6 = (uVar6 & 0xffff0000ffff0000) >> 0x10 | (uVar6 & 0xffff0000ffff) << 0x10;
        uVar1 = ((uStack_50 ^ uVar13) & 0xff00ff00ff00ff00) >> 8 |
                ((uStack_50 ^ uVar13) & 0xff00ff00ff00ff) << 8;
        uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
        uVar7 = ((local_58 ^ uVar7) & 0xff00ff00ff00ff00) >> 8 |
                ((local_58 ^ uVar7) & 0xff00ff00ff00ff) << 8;
        uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
        uVar16 = ((uStack_50 ^ uVar16) & 0xff00ff00ff00ff00) >> 8 |
                 ((uStack_50 ^ uVar16) & 0xff00ff00ff00ff) << 8;
        uVar16 = (uVar16 & 0xffff0000ffff0000) >> 0x10 | (uVar16 & 0xffff0000ffff) << 0x10;
        uVar13 = uVar8 ^ uVar13;
        uVar12 = uVar14 ^ uVar12;
        *(ulong *)(param_1 + 0xc0) = uVar5 >> 0x20 | uVar5 << 0x20;
        *(ulong *)(param_1 + 200) = uVar15 >> 0x20 | uVar15 << 0x20;
        *(ulong *)(param_1 + 0x100) = uVar6 >> 0x20 | uVar6 << 0x20;
        *(ulong *)(param_1 + 0x108) = uVar1 >> 0x20 | uVar1 << 0x20;
        *(ulong *)(param_1 + 0x140) = uVar7 >> 0x20 | uVar7 << 0x20;
        *(ulong *)(param_1 + 0x148) = uVar16 >> 0x20 | uVar16 << 0x20;
        uVar5 = (uVar14 & 0xff00ff00ff00ff00) >> 8 | (uVar14 & 0xff00ff00ff00ff) << 8;
        uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
        uVar16 = uVar10 ^ uVar8;
        uVar7 = uVar11 ^ uVar14;
        uVar15 = (uVar8 & 0xff00ff00ff00ff00) >> 8 | (uVar8 & 0xff00ff00ff00ff) << 8;
        uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
        uVar10 = uVar10 ^ uVar13;
        uVar11 = uVar11 ^ uVar12;
        *(ulong *)(param_1 + 0x70) = uVar5 >> 0x20 | uVar5 << 0x20;
        *(ulong *)(param_1 + 0x78) = uVar15 >> 0x20 | uVar15 << 0x20;
        uVar5 = (uVar12 & 0xff00ff00ff00ff00) >> 8 | (uVar12 & 0xff00ff00ff00ff) << 8;
        uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
        uVar15 = (uVar13 & 0xff00ff00ff00ff00) >> 8 | (uVar13 & 0xff00ff00ff00ff) << 8;
        uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
        uVar6 = (uVar7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 & 0xff00ff00ff00ff) << 8;
        uVar6 = (uVar6 & 0xffff0000ffff0000) >> 0x10 | (uVar6 & 0xffff0000ffff) << 0x10;
        uVar1 = (uVar16 & 0xff00ff00ff00ff00) >> 8 | (uVar16 & 0xff00ff00ff00ff) << 8;
        uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
        uVar14 = ((local_58 ^ uVar14) & 0xff00ff00ff00ff00) >> 8 |
                 ((local_58 ^ uVar14) & 0xff00ff00ff00ff) << 8;
        uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10;
        uVar8 = ((uStack_50 ^ uVar8) & 0xff00ff00ff00ff00) >> 8 |
                ((uStack_50 ^ uVar8) & 0xff00ff00ff00ff) << 8;
        uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
        *(ulong *)(param_1 + 0x90) = uVar5 >> 0x20 | uVar5 << 0x20;
        *(ulong *)(param_1 + 0x98) = uVar15 >> 0x20 | uVar15 << 0x20;
        *(ulong *)(param_1 + 0xb0) = uVar6 >> 0x20 | uVar6 << 0x20;
        *(ulong *)(param_1 + 0xb8) = uVar1 >> 0x20 | uVar1 << 0x20;
        uVar5 = (uVar11 & 0xff00ff00ff00ff00) >> 8 | (uVar11 & 0xff00ff00ff00ff) << 8;
        uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
        uVar15 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
        uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
        *(ulong *)(param_1 + 0xf0) = uVar14 >> 0x20 | uVar14 << 0x20;
        *(ulong *)(param_1 + 0xf8) = uVar8 >> 0x20 | uVar8 << 0x20;
        uVar12 = ((local_58 ^ uVar12) & 0xff00ff00ff00ff00) >> 8 |
                 ((local_58 ^ uVar12) & 0xff00ff00ff00ff) << 8;
        uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
        uVar13 = ((uStack_50 ^ uVar13) & 0xff00ff00ff00ff00) >> 8 |
                 ((uStack_50 ^ uVar13) & 0xff00ff00ff00ff) << 8;
        uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
        uVar14 = ((local_58 ^ uVar7) & 0xff00ff00ff00ff00) >> 8 |
                 ((local_58 ^ uVar7) & 0xff00ff00ff00ff) << 8;
        uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10;
        uVar8 = ((uStack_50 ^ uVar16) & 0xff00ff00ff00ff00) >> 8 |
                ((uStack_50 ^ uVar16) & 0xff00ff00ff00ff) << 8;
        uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
        uVar11 = ((local_58 ^ uVar11) & 0xff00ff00ff00ff00) >> 8 |
                 ((local_58 ^ uVar11) & 0xff00ff00ff00ff) << 8;
        uVar11 = (uVar11 & 0xffff0000ffff0000) >> 0x10 | (uVar11 & 0xffff0000ffff) << 0x10;
        uVar10 = ((uStack_50 ^ uVar10) & 0xff00ff00ff00ff00) >> 8 |
                 ((uStack_50 ^ uVar10) & 0xff00ff00ff00ff) << 8;
        uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
        *(ulong *)(param_1 + 0xd0) = uVar5 >> 0x20 | uVar5 << 0x20;
        *(ulong *)(param_1 + 0xd8) = uVar15 >> 0x20 | uVar15 << 0x20;
        *(ulong *)(param_1 + 0x110) = uVar12 >> 0x20 | uVar12 << 0x20;
        *(ulong *)(param_1 + 0x118) = uVar13 >> 0x20 | uVar13 << 0x20;
        *(ulong *)(param_1 + 0x130) = uVar14 >> 0x20 | uVar14 << 0x20;
        *(ulong *)(param_1 + 0x138) = uVar8 >> 0x20 | uVar8 << 0x20;
        *(ulong *)(param_1 + 0x150) = uVar11 >> 0x20 | uVar11 << 0x20;
        *(ulong *)(param_1 + 0x158) = uVar10 >> 0x20 | uVar10 << 0x20;
      }
    }
  }
  else {
    uVar4 = 0xffffffec;
  }
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

