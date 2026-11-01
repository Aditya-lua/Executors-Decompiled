
/* WARNING: Possible PIC construction at 0x002ffd14: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002ffd90: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002ffd58: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x002ffd18) */
/* WARNING: Removing unreachable block (ram,0x002ffd5c) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined1 (*) [16] FUN_002ffca4(uint *param_1,undefined1 (*param_2) [16])

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined1 (*pauVar18) [16];
  undefined1 (*pauVar21) [16];
  undefined1 (*pauVar20) [16];
  undefined1 (*pauVar19) [16];
  undefined1 (*pauVar22) [16];
  long lVar23;
  uint uVar24;
  uint uVar25;
  uint uVar26;
  uint uVar27;
  uint uVar28;
  uint uVar29;
  uint uVar30;
  ulong uVar31;
  uint uVar32;
  uint uVar33;
  uint uVar34;
  uint uVar35;
  uint uVar36;
  uint uVar37;
  uint uVar38;
  uint uVar39;
  uint uVar40;
  uint uVar41;
  uint uVar42;
  uint uVar43;
  uint uVar44;
  undefined1 auVar45 [16];
  undefined1 auVar46 [16];
  undefined1 auVar47 [16];
  int iVar48;
  undefined1 auVar49 [16];
  undefined1 auVar50 [16];
  undefined1 auVar51 [16];
  undefined1 auVar52 [16];
  undefined1 auVar53 [16];
  undefined1 auVar54 [16];
  undefined8 uVar55;
  undefined1 auVar56 [16];
  
  uVar44 = *(uint *)(param_2[5] + 0xc);
  uVar31 = (ulong)uVar44;
  if (uVar44 < 0x40) {
    pauVar22 = (undefined1 (*) [16])(param_2[1] + 0xc);
    uVar55 = *(undefined8 *)(param_2[1] + 4);
    (*pauVar22)[uVar31] = 0x80;
    lVar23 = uVar31 + 1;
    if (uVar44 < 0x38) {
      if (lVar23 == 0x38) {
        uVar55 = NEON_rev32(uVar55,1);
        uVar55 = NEON_rev64(uVar55,4);
        *(undefined8 *)(param_2[5] + 4) = uVar55;
      }
      else {
        _bzero(*pauVar22 + lVar23,0x38 - lVar23);
        uVar55 = NEON_rev32(uVar55,1);
        uVar55 = NEON_rev64(uVar55,4);
        *(undefined8 *)(param_2[5] + 4) = uVar55;
      }
      if ((bRam0000000000a334f8 >> 3 & 1) == 0) {
        func_0x00386540(param_2,pauVar22,1);
        *(undefined4 *)(param_2[5] + 0xc) = 0;
        *(undefined8 *)(param_2[2] + 4) = 0;
        *(undefined8 *)*pauVar22 = 0;
        *(undefined8 *)(param_2[3] + 4) = 0;
        *(undefined8 *)(param_2[2] + 0xc) = 0;
        *(undefined8 *)(param_2[4] + 4) = 0;
        *(undefined8 *)(param_2[3] + 0xc) = 0;
        *(undefined8 *)(param_2[5] + 4) = 0;
        *(undefined8 *)(param_2[4] + 0xc) = 0;
        uVar44 = (*(uint *)*param_2 & 0xff00ff00) >> 8 | (*(uint *)*param_2 & 0xff00ff) << 8;
        *param_1 = uVar44 >> 0x10 | uVar44 << 0x10;
        uVar44 = (*(uint *)(*param_2 + 4) & 0xff00ff00) >> 8 |
                 (*(uint *)(*param_2 + 4) & 0xff00ff) << 8;
        param_1[1] = uVar44 >> 0x10 | uVar44 << 0x10;
        uVar44 = (*(uint *)(*param_2 + 8) & 0xff00ff00) >> 8 |
                 (*(uint *)(*param_2 + 8) & 0xff00ff) << 8;
        param_1[2] = uVar44 >> 0x10 | uVar44 << 0x10;
        uVar44 = (*(uint *)(*param_2 + 0xc) & 0xff00ff00) >> 8 |
                 (*(uint *)(*param_2 + 0xc) & 0xff00ff) << 8;
        param_1[3] = uVar44 >> 0x10 | uVar44 << 0x10;
        uVar44 = (*(uint *)param_2[1] & 0xff00ff00) >> 8 | (*(uint *)param_2[1] & 0xff00ff) << 8;
        param_1[4] = uVar44 >> 0x10 | uVar44 << 0x10;
        return (undefined1 (*) [16])((long)&MACH_HEADER.magic + 1);
      }
    }
    else {
      if (uVar44 != 0x3f) {
        _bzero(*pauVar22 + lVar23,0x3f - uVar31);
      }
      if ((bRam0000000000a334f8 >> 3 & 1) == 0) goto code_r0x00386540;
    }
  }
  else {
    auVar56 = func_0x0079ec18();
    pauVar22 = auVar56._8_8_;
    param_2 = auVar56._0_8_;
    if ((bRam0000000000a334f8 >> 3 & 1) == 0) {
code_r0x00386540:
      lVar23 = 1;
      uVar41 = *(uint *)*param_2;
      uVar44 = *(uint *)(*param_2 + 4);
      uVar42 = *(uint *)(*param_2 + 8);
      uVar43 = *(uint *)(*param_2 + 0xc);
      iVar48 = *(int *)param_2[1];
      do {
        lVar23 = lVar23 + -1;
        uVar31 = (*(ulong *)*pauVar22 & 0xff00ff00ff00ff00) >> 8 |
                 (*(ulong *)*pauVar22 & 0xff00ff00ff00ff) << 8;
        uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10;
        uVar24 = (uint)uVar31;
        uVar1 = uVar44 >> 2 | uVar44 << 0x1e;
        uVar25 = (uint)(uVar31 >> 0x20);
        uVar44 = iVar48 + 0x5a827999 + uVar24 + (uVar41 >> 0x1b | uVar41 << 5) +
                 (uVar43 & (uVar44 ^ 0xffffffff) | uVar42 & uVar44);
        uVar31 = (*(ulong *)(*pauVar22 + 8) & 0xff00ff00ff00ff00) >> 8 |
                 (*(ulong *)(*pauVar22 + 8) & 0xff00ff00ff00ff) << 8;
        uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10;
        uVar2 = uVar41 >> 2 | uVar41 << 0x1e;
        uVar26 = (uint)uVar31;
        uVar41 = uVar43 + 0x5a827999 + uVar25 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 (uVar42 & (uVar41 ^ 0xffffffff) | uVar1 & uVar41);
        uVar43 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar27 = (uint)(uVar31 >> 0x20);
        uVar44 = uVar42 + 0x5a827999 + uVar26 + (uVar41 >> 0x1b | uVar41 * 0x20) +
                 (uVar1 & (uVar44 ^ 0xffffffff) | uVar2 & uVar44);
        uVar31 = (*(ulong *)pauVar22[1] & 0xff00ff00ff00ff00) >> 8 |
                 (*(ulong *)pauVar22[1] & 0xff00ff00ff00ff) << 8;
        uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10;
        uVar3 = uVar41 >> 2 | uVar41 * 0x40000000;
        uVar28 = (uint)uVar31;
        uVar42 = uVar1 + 0x5a827999 + uVar27 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 (uVar2 & (uVar41 ^ 0xffffffff) | uVar43 & uVar41);
        uVar41 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar29 = (uint)(uVar31 >> 0x20);
        uVar44 = uVar2 + 0x5a827999 + uVar28 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 (uVar43 & (uVar44 ^ 0xffffffff) | uVar3 & uVar44);
        uVar31 = (*(ulong *)(pauVar22[1] + 8) & 0xff00ff00ff00ff00) >> 8 |
                 (*(ulong *)(pauVar22[1] + 8) & 0xff00ff00ff00ff) << 8;
        uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10;
        uVar1 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar30 = (uint)uVar31;
        uVar42 = uVar43 + 0x5a827999 + uVar29 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 (uVar3 & (uVar42 ^ 0xffffffff) | uVar41 & uVar42);
        uVar43 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar32 = (uint)(uVar31 >> 0x20);
        uVar44 = uVar3 + 0x5a827999 + uVar30 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 (uVar41 & (uVar44 ^ 0xffffffff) | uVar1 & uVar44);
        uVar31 = (*(ulong *)pauVar22[2] & 0xff00ff00ff00ff00) >> 8 |
                 (*(ulong *)pauVar22[2] & 0xff00ff00ff00ff) << 8;
        uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10;
        uVar2 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar33 = (uint)uVar31;
        uVar42 = uVar41 + 0x5a827999 + uVar32 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 (uVar1 & (uVar42 ^ 0xffffffff) | uVar43 & uVar42);
        uVar41 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar34 = (uint)(uVar31 >> 0x20);
        uVar44 = uVar1 + 0x5a827999 + uVar33 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 (uVar43 & (uVar44 ^ 0xffffffff) | uVar2 & uVar44);
        uVar31 = (*(ulong *)(pauVar22[2] + 8) & 0xff00ff00ff00ff00) >> 8 |
                 (*(ulong *)(pauVar22[2] + 8) & 0xff00ff00ff00ff) << 8;
        uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10;
        uVar1 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar35 = (uint)uVar31;
        uVar42 = uVar43 + 0x5a827999 + uVar34 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 (uVar2 & (uVar42 ^ 0xffffffff) | uVar41 & uVar42);
        uVar43 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar36 = (uint)(uVar31 >> 0x20);
        uVar44 = uVar2 + 0x5a827999 + uVar35 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 (uVar41 & (uVar44 ^ 0xffffffff) | uVar1 & uVar44);
        uVar31 = (*(ulong *)pauVar22[3] & 0xff00ff00ff00ff00) >> 8 |
                 (*(ulong *)pauVar22[3] & 0xff00ff00ff00ff) << 8;
        uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10;
        uVar2 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar37 = (uint)uVar31;
        uVar42 = uVar41 + 0x5a827999 + uVar36 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 (uVar1 & (uVar42 ^ 0xffffffff) | uVar43 & uVar42);
        uVar3 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar38 = (uint)(uVar31 >> 0x20);
        uVar44 = uVar1 + 0x5a827999 + uVar37 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 (uVar43 & (uVar44 ^ 0xffffffff) | uVar2 & uVar44);
        uVar31 = (*(ulong *)(pauVar22[3] + 8) & 0xff00ff00ff00ff00) >> 8 |
                 (*(ulong *)(pauVar22[3] + 8) & 0xff00ff00ff00ff) << 8;
        uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10;
        uVar1 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar39 = (uint)uVar31;
        uVar42 = uVar43 + 0x5a827999 + uVar38 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 (uVar2 & (uVar42 ^ 0xffffffff) | uVar3 & uVar42);
        uVar41 = uVar24 ^ uVar26 ^ uVar33 ^ uVar38;
        uVar43 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar40 = (uint)(uVar31 >> 0x20);
        uVar44 = uVar2 + 0x5a827999 + uVar39 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 (uVar3 & (uVar44 ^ 0xffffffff) | uVar1 & uVar44);
        uVar2 = uVar41 >> 0x1f | uVar41 << 1;
        uVar41 = uVar25 ^ uVar27 ^ uVar34 ^ uVar39;
        uVar24 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar42 = uVar3 + 0x5a827999 + uVar40 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 (uVar1 & (uVar42 ^ 0xffffffff) | uVar43 & uVar42);
        uVar3 = uVar41 >> 0x1f | uVar41 << 1;
        uVar41 = uVar26 ^ uVar28 ^ uVar35 ^ uVar40;
        uVar25 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar44 = uVar1 + 0x5a827999 + uVar2 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 (uVar43 & (uVar44 ^ 0xffffffff) | uVar24 & uVar44);
        uVar1 = uVar41 >> 0x1f | uVar41 << 1;
        uVar41 = uVar27 ^ uVar29 ^ uVar36 ^ uVar2;
        uVar26 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar42 = uVar43 + 0x5a827999 + uVar3 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 (uVar24 & (uVar42 ^ 0xffffffff) | uVar25 & uVar42);
        uVar43 = uVar41 >> 0x1f | uVar41 << 1;
        uVar41 = uVar28 ^ uVar30 ^ uVar37 ^ uVar3;
        uVar27 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar44 = uVar24 + 0x5a827999 + uVar1 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 (uVar25 & (uVar44 ^ 0xffffffff) | uVar26 & uVar44);
        uVar24 = uVar41 >> 0x1f | uVar41 << 1;
        uVar41 = uVar29 ^ uVar32 ^ uVar38 ^ uVar1;
        uVar28 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar42 = uVar25 + 0x5a827999 + uVar43 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 (uVar26 & (uVar42 ^ 0xffffffff) | uVar27 & uVar42);
        uVar25 = uVar41 >> 0x1f | uVar41 << 1;
        uVar29 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar41 = uVar30 ^ uVar33 ^ uVar39 ^ uVar43;
        uVar44 = uVar26 + 0x6ed9eba1 + uVar24 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 (uVar27 ^ uVar44 ^ uVar28);
        uVar26 = uVar41 >> 0x1f | uVar41 << 1;
        uVar30 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar41 = uVar32 ^ uVar34 ^ uVar40 ^ uVar24;
        uVar42 = uVar27 + 0x6ed9eba1 + uVar25 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 (uVar28 ^ uVar42 ^ uVar29);
        uVar27 = uVar41 >> 0x1f | uVar41 << 1;
        uVar32 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar41 = uVar33 ^ uVar35 ^ uVar2 ^ uVar25;
        uVar44 = uVar28 + 0x6ed9eba1 + uVar26 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 (uVar29 ^ uVar44 ^ uVar30);
        uVar28 = uVar41 >> 0x1f | uVar41 << 1;
        uVar33 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar41 = uVar34 ^ uVar36 ^ uVar3 ^ uVar26;
        uVar42 = uVar29 + 0x6ed9eba1 + uVar27 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 (uVar30 ^ uVar42 ^ uVar32);
        uVar29 = uVar41 >> 0x1f | uVar41 << 1;
        uVar34 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar41 = uVar35 ^ uVar37 ^ uVar1 ^ uVar27;
        uVar44 = uVar30 + 0x6ed9eba1 + uVar28 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 (uVar32 ^ uVar44 ^ uVar33);
        uVar30 = uVar41 >> 0x1f | uVar41 << 1;
        uVar35 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar41 = uVar36 ^ uVar38 ^ uVar43 ^ uVar28;
        uVar42 = uVar32 + 0x6ed9eba1 + uVar29 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 (uVar33 ^ uVar42 ^ uVar34);
        uVar32 = uVar41 >> 0x1f | uVar41 << 1;
        uVar36 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar41 = uVar37 ^ uVar39 ^ uVar24 ^ uVar29;
        uVar44 = uVar33 + 0x6ed9eba1 + uVar30 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 (uVar34 ^ uVar44 ^ uVar35);
        uVar33 = uVar41 >> 0x1f | uVar41 << 1;
        uVar37 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar41 = uVar38 ^ uVar40 ^ uVar25 ^ uVar30;
        uVar42 = uVar34 + 0x6ed9eba1 + uVar32 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 (uVar35 ^ uVar42 ^ uVar36);
        uVar34 = uVar41 >> 0x1f | uVar41 << 1;
        uVar38 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar41 = uVar39 ^ uVar2 ^ uVar26 ^ uVar32;
        uVar44 = uVar35 + 0x6ed9eba1 + uVar33 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 (uVar36 ^ uVar44 ^ uVar37);
        uVar35 = uVar41 >> 0x1f | uVar41 << 1;
        uVar39 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar41 = uVar40 ^ uVar3 ^ uVar27 ^ uVar33;
        uVar42 = uVar36 + 0x6ed9eba1 + uVar34 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 (uVar37 ^ uVar42 ^ uVar38);
        uVar36 = uVar41 >> 0x1f | uVar41 << 1;
        uVar40 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar41 = uVar2 ^ uVar1 ^ uVar28 ^ uVar34;
        uVar44 = uVar37 + 0x6ed9eba1 + uVar35 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 (uVar38 ^ uVar44 ^ uVar39);
        uVar2 = uVar41 >> 0x1f | uVar41 << 1;
        uVar37 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar41 = uVar3 ^ uVar43 ^ uVar29 ^ uVar35;
        uVar42 = uVar38 + 0x6ed9eba1 + uVar36 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 (uVar39 ^ uVar42 ^ uVar40);
        uVar3 = uVar41 >> 0x1f | uVar41 << 1;
        uVar38 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar41 = uVar1 ^ uVar24 ^ uVar30 ^ uVar36;
        uVar44 = uVar39 + 0x6ed9eba1 + uVar2 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 (uVar40 ^ uVar44 ^ uVar37);
        uVar1 = uVar41 >> 0x1f | uVar41 << 1;
        uVar39 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar41 = uVar43 ^ uVar25 ^ uVar32 ^ uVar2;
        uVar42 = uVar40 + 0x6ed9eba1 + uVar3 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 (uVar37 ^ uVar42 ^ uVar38);
        uVar43 = uVar41 >> 0x1f | uVar41 << 1;
        uVar40 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar41 = uVar24 ^ uVar26 ^ uVar33 ^ uVar3;
        uVar44 = uVar37 + 0x6ed9eba1 + uVar1 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 (uVar38 ^ uVar44 ^ uVar39);
        uVar24 = uVar41 >> 0x1f | uVar41 << 1;
        uVar37 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar41 = uVar25 ^ uVar27 ^ uVar34 ^ uVar1;
        uVar42 = uVar38 + 0x6ed9eba1 + uVar43 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 (uVar39 ^ uVar42 ^ uVar40);
        uVar25 = uVar41 >> 0x1f | uVar41 << 1;
        uVar38 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar41 = uVar26 ^ uVar28 ^ uVar35 ^ uVar43;
        uVar44 = uVar39 + 0x6ed9eba1 + uVar24 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 (uVar40 ^ uVar44 ^ uVar37);
        uVar26 = uVar41 >> 0x1f | uVar41 << 1;
        uVar39 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar41 = uVar27 ^ uVar29 ^ uVar36 ^ uVar24;
        uVar42 = uVar40 + 0x6ed9eba1 + uVar25 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 (uVar37 ^ uVar42 ^ uVar38);
        uVar27 = uVar41 >> 0x1f | uVar41 << 1;
        uVar40 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar41 = uVar28 ^ uVar30 ^ uVar2 ^ uVar25;
        uVar44 = uVar37 + 0x6ed9eba1 + uVar26 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 (uVar38 ^ uVar44 ^ uVar39);
        uVar28 = uVar41 >> 0x1f | uVar41 << 1;
        uVar37 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar41 = uVar29 ^ uVar32 ^ uVar3 ^ uVar26;
        uVar42 = uVar38 + 0x6ed9eba1 + uVar27 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 (uVar39 ^ uVar42 ^ uVar40);
        uVar29 = uVar41 >> 0x1f | uVar41 << 1;
        uVar38 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar41 = uVar30 ^ uVar33 ^ uVar1 ^ uVar27;
        uVar44 = uVar39 + 0x8f1bbcdc + uVar28 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 ((uVar44 | uVar37) & uVar40 | uVar44 & uVar37);
        uVar30 = uVar41 >> 0x1f | uVar41 << 1;
        uVar39 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar41 = uVar32 ^ uVar34 ^ uVar43 ^ uVar28;
        uVar42 = uVar40 + 0x8f1bbcdc + uVar29 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 ((uVar42 | uVar38) & uVar37 | uVar42 & uVar38);
        uVar32 = uVar41 >> 0x1f | uVar41 << 1;
        uVar40 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar41 = uVar33 ^ uVar35 ^ uVar24 ^ uVar29;
        uVar44 = uVar37 + 0x8f1bbcdc + uVar30 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 ((uVar44 | uVar39) & uVar38 | uVar44 & uVar39);
        uVar33 = uVar41 >> 0x1f | uVar41 << 1;
        uVar37 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar41 = uVar34 ^ uVar36 ^ uVar25 ^ uVar30;
        uVar42 = uVar38 + 0x8f1bbcdc + uVar32 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 ((uVar42 | uVar40) & uVar39 | uVar42 & uVar40);
        uVar34 = uVar41 >> 0x1f | uVar41 << 1;
        uVar38 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar41 = uVar35 ^ uVar2 ^ uVar26 ^ uVar32;
        uVar44 = uVar39 + 0x8f1bbcdc + uVar33 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 ((uVar44 | uVar37) & uVar40 | uVar44 & uVar37);
        uVar35 = uVar41 >> 0x1f | uVar41 << 1;
        uVar39 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar41 = uVar36 ^ uVar3 ^ uVar27 ^ uVar33;
        uVar42 = uVar40 + 0x8f1bbcdc + uVar34 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 ((uVar42 | uVar38) & uVar37 | uVar42 & uVar38);
        uVar36 = uVar41 >> 0x1f | uVar41 << 1;
        uVar40 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar41 = uVar2 ^ uVar1 ^ uVar28 ^ uVar34;
        uVar44 = uVar37 + 0x8f1bbcdc + uVar35 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 ((uVar44 | uVar39) & uVar38 | uVar44 & uVar39);
        uVar2 = uVar41 >> 0x1f | uVar41 << 1;
        uVar37 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar41 = uVar3 ^ uVar43 ^ uVar29 ^ uVar35;
        uVar42 = uVar38 + 0x8f1bbcdc + uVar36 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 ((uVar42 | uVar40) & uVar39 | uVar42 & uVar40);
        uVar3 = uVar41 >> 0x1f | uVar41 << 1;
        uVar38 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar41 = uVar1 ^ uVar24 ^ uVar30 ^ uVar36;
        uVar44 = uVar39 + 0x8f1bbcdc + uVar2 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 ((uVar44 | uVar37) & uVar40 | uVar44 & uVar37);
        uVar1 = uVar41 >> 0x1f | uVar41 << 1;
        uVar39 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar41 = uVar43 ^ uVar25 ^ uVar32 ^ uVar2;
        uVar42 = uVar40 + 0x8f1bbcdc + uVar3 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 ((uVar42 | uVar38) & uVar37 | uVar42 & uVar38);
        uVar43 = uVar41 >> 0x1f | uVar41 << 1;
        uVar40 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar41 = uVar24 ^ uVar26 ^ uVar33 ^ uVar3;
        uVar44 = uVar37 + 0x8f1bbcdc + uVar1 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 ((uVar44 | uVar39) & uVar38 | uVar44 & uVar39);
        uVar24 = uVar41 >> 0x1f | uVar41 << 1;
        uVar37 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar41 = uVar25 ^ uVar27 ^ uVar34 ^ uVar1;
        uVar42 = uVar38 + 0x8f1bbcdc + uVar43 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 ((uVar42 | uVar40) & uVar39 | uVar42 & uVar40);
        uVar25 = uVar41 >> 0x1f | uVar41 << 1;
        uVar38 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar41 = uVar26 ^ uVar28 ^ uVar35 ^ uVar43;
        uVar44 = uVar39 + 0x8f1bbcdc + uVar24 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 ((uVar44 | uVar37) & uVar40 | uVar44 & uVar37);
        uVar26 = uVar41 >> 0x1f | uVar41 << 1;
        uVar39 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar41 = uVar27 ^ uVar29 ^ uVar36 ^ uVar24;
        uVar42 = uVar40 + 0x8f1bbcdc + uVar25 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 ((uVar42 | uVar38) & uVar37 | uVar42 & uVar38);
        uVar27 = uVar41 >> 0x1f | uVar41 << 1;
        uVar40 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar41 = uVar28 ^ uVar30 ^ uVar2 ^ uVar25;
        uVar44 = uVar37 + 0x8f1bbcdc + uVar26 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 ((uVar44 | uVar39) & uVar38 | uVar44 & uVar39);
        uVar28 = uVar41 >> 0x1f | uVar41 << 1;
        uVar37 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar41 = uVar29 ^ uVar32 ^ uVar3 ^ uVar26;
        uVar42 = uVar38 + 0x8f1bbcdc + uVar27 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 ((uVar42 | uVar40) & uVar39 | uVar42 & uVar40);
        uVar29 = uVar41 >> 0x1f | uVar41 << 1;
        uVar38 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar41 = uVar30 ^ uVar33 ^ uVar1 ^ uVar27;
        uVar44 = uVar39 + 0x8f1bbcdc + uVar28 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 ((uVar44 | uVar37) & uVar40 | uVar44 & uVar37);
        uVar30 = uVar41 >> 0x1f | uVar41 << 1;
        uVar39 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar41 = uVar32 ^ uVar34 ^ uVar43 ^ uVar28;
        uVar42 = uVar40 + 0x8f1bbcdc + uVar29 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 ((uVar42 | uVar38) & uVar37 | uVar42 & uVar38);
        uVar32 = uVar41 >> 0x1f | uVar41 << 1;
        uVar40 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar41 = uVar33 ^ uVar35 ^ uVar24 ^ uVar29;
        uVar44 = uVar37 + 0x8f1bbcdc + uVar30 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 ((uVar44 | uVar39) & uVar38 | uVar44 & uVar39);
        uVar33 = uVar41 >> 0x1f | uVar41 << 1;
        uVar37 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar41 = uVar34 ^ uVar36 ^ uVar25 ^ uVar30;
        uVar42 = uVar38 + 0x8f1bbcdc + uVar32 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 ((uVar42 | uVar40) & uVar39 | uVar42 & uVar40);
        uVar34 = uVar41 >> 0x1f | uVar41 << 1;
        uVar38 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar41 = uVar35 ^ uVar2 ^ uVar26 ^ uVar32;
        uVar44 = uVar39 + 0xca62c1d6 + uVar33 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 (uVar40 ^ uVar44 ^ uVar37);
        uVar35 = uVar41 >> 0x1f | uVar41 << 1;
        uVar39 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar41 = uVar36 ^ uVar3 ^ uVar27 ^ uVar33;
        uVar42 = uVar40 + 0xca62c1d6 + uVar34 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 (uVar37 ^ uVar42 ^ uVar38);
        uVar36 = uVar41 >> 0x1f | uVar41 << 1;
        uVar40 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar41 = uVar2 ^ uVar1 ^ uVar28 ^ uVar34;
        uVar44 = uVar37 + 0xca62c1d6 + uVar35 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 (uVar38 ^ uVar44 ^ uVar39);
        uVar37 = uVar41 >> 0x1f | uVar41 << 1;
        uVar2 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar41 = uVar3 ^ uVar43 ^ uVar29 ^ uVar35;
        uVar42 = uVar38 + 0xca62c1d6 + uVar36 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 (uVar39 ^ uVar42 ^ uVar40);
        uVar38 = uVar41 >> 0x1f | uVar41 << 1;
        uVar3 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar41 = uVar1 ^ uVar24 ^ uVar30 ^ uVar36;
        uVar44 = uVar39 + 0xca62c1d6 + uVar37 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 (uVar40 ^ uVar44 ^ uVar2);
        uVar39 = uVar41 >> 0x1f | uVar41 << 1;
        uVar1 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar41 = uVar43 ^ uVar25 ^ uVar32 ^ uVar37;
        uVar42 = uVar40 + 0xca62c1d6 + uVar38 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 (uVar2 ^ uVar42 ^ uVar3);
        uVar40 = uVar41 >> 0x1f | uVar41 << 1;
        uVar43 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar41 = uVar24 ^ uVar26 ^ uVar33 ^ uVar38;
        uVar44 = uVar2 + 0xca62c1d6 + uVar39 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 (uVar3 ^ uVar44 ^ uVar1);
        uVar24 = uVar41 >> 0x1f | uVar41 << 1;
        uVar2 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar41 = uVar25 ^ uVar27 ^ uVar34 ^ uVar39;
        uVar42 = uVar3 + 0xca62c1d6 + uVar40 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 (uVar1 ^ uVar42 ^ uVar43);
        uVar25 = uVar41 >> 0x1f | uVar41 << 1;
        uVar3 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar41 = uVar26 ^ uVar28 ^ uVar35 ^ uVar40;
        uVar44 = uVar1 + 0xca62c1d6 + uVar24 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 (uVar43 ^ uVar44 ^ uVar2);
        uVar26 = uVar41 >> 0x1f | uVar41 << 1;
        uVar4 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar41 = uVar27 ^ uVar29 ^ uVar36 ^ uVar24;
        uVar42 = uVar43 + 0xca62c1d6 + uVar25 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 (uVar2 ^ uVar42 ^ uVar3);
        uVar27 = uVar41 >> 0x1f | uVar41 << 1;
        uVar5 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar41 = uVar28 ^ uVar30 ^ uVar37 ^ uVar25;
        uVar44 = uVar2 + 0xca62c1d6 + uVar26 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 (uVar3 ^ uVar44 ^ uVar4);
        uVar43 = uVar41 >> 0x1f | uVar41 << 1;
        uVar28 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar41 = uVar29 ^ uVar32 ^ uVar38 ^ uVar26;
        uVar42 = uVar3 + 0xca62c1d6 + uVar27 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 (uVar4 ^ uVar42 ^ uVar5);
        uVar1 = uVar41 >> 0x1f | uVar41 << 1;
        uVar29 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar41 = uVar30 ^ uVar33 ^ uVar39 ^ uVar27;
        uVar44 = uVar4 + 0xca62c1d6 + uVar43 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 (uVar5 ^ uVar44 ^ uVar28);
        uVar41 = uVar41 >> 0x1f | uVar41 << 1;
        uVar30 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar43 = uVar32 ^ uVar34 ^ uVar40 ^ uVar43;
        uVar42 = uVar5 + 0xca62c1d6 + uVar1 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 (uVar28 ^ uVar42 ^ uVar29);
        uVar2 = uVar43 >> 0x1f | uVar43 << 1;
        uVar43 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar1 = uVar33 ^ uVar35 ^ uVar24 ^ uVar1;
        uVar44 = uVar28 + 0xca62c1d6 + uVar41 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 (uVar29 ^ uVar44 ^ uVar30);
        uVar3 = uVar1 >> 0x1f | uVar1 << 1;
        uVar1 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar41 = uVar34 ^ uVar36 ^ uVar25 ^ uVar41;
        uVar42 = uVar29 + 0xca62c1d6 + uVar2 + (uVar44 >> 0x1b | uVar44 * 0x20) +
                 (uVar30 ^ uVar42 ^ uVar43);
        uVar24 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar2 = uVar35 ^ uVar37 ^ uVar26 ^ uVar2;
        uVar44 = uVar30 + 0xca62c1d6 + uVar3 + (uVar42 >> 0x1b | uVar42 * 0x20) +
                 (uVar43 ^ uVar44 ^ uVar1);
        uVar25 = uVar42 >> 2 | uVar42 * 0x40000000;
        uVar3 = uVar36 ^ uVar38 ^ uVar27 ^ uVar3;
        uVar41 = uVar43 + 0xca62c1d6 + (uVar41 >> 0x1f | uVar41 << 1) +
                 (uVar44 >> 0x1b | uVar44 * 0x20) + (uVar1 ^ uVar42 ^ uVar24);
        uVar43 = uVar44 >> 2 | uVar44 * 0x40000000;
        uVar1 = uVar1 + 0xca62c1d6 + (uVar2 >> 0x1f | uVar2 << 1) + (uVar41 >> 0x1b | uVar41 * 0x20)
                + (uVar24 ^ uVar44 ^ uVar25);
        uVar44 = uVar1 + *(int *)(*param_2 + 4);
        uVar42 = (uVar41 >> 2 | uVar41 * 0x40000000) + *(int *)(*param_2 + 8);
        uVar41 = uVar24 + 0xca62c1d6 + (uVar3 >> 0x1f | uVar3 << 1) + (uVar1 >> 0x1b | uVar1 * 0x20)
                 + (uVar25 ^ uVar41 ^ uVar43) + *(int *)*param_2;
        uVar43 = uVar43 + *(int *)(*param_2 + 0xc);
        iVar48 = uVar25 + *(int *)param_2[1];
        *(uint *)*param_2 = uVar41;
        *(uint *)(*param_2 + 4) = uVar44;
        *(uint *)(*param_2 + 8) = uVar42;
        *(uint *)(*param_2 + 0xc) = uVar43;
        *(int *)param_2[1] = iVar48;
        pauVar22 = pauVar22 + 4;
      } while (lVar23 != 0);
      return param_2;
    }
  }
  lVar23 = 1;
  pauVar18 = param_2 + 1;
  iVar48 = *(int *)*pauVar18;
  auVar56 = *param_2;
  do {
    auVar45 = *pauVar22;
    pauVar19 = pauVar22 + 1;
    pauVar20 = pauVar22 + 2;
    pauVar21 = pauVar22 + 3;
    pauVar22 = pauVar22 + 4;
    lVar23 = lVar23 + -1;
    auVar49 = NEON_rev32(auVar45,1);
    auVar51 = NEON_rev32(*pauVar19,1);
    auVar52 = NEON_rev32(*pauVar20,1);
    auVar53 = NEON_rev32(*pauVar21,1);
    uVar44 = auVar56._0_4_;
    auVar45._4_4_ = _UNK_00883884 + auVar49._4_4_;
    auVar45._0_4_ = _UNK_00883880 + auVar49._0_4_;
    auVar45._8_4_ = _UNK_00883888 + auVar49._8_4_;
    auVar45._12_4_ = _UNK_0088388c + auVar49._12_4_;
    auVar45 = NEON_sha1c(auVar56,iVar48,auVar45,4);
    auVar49 = NEON_sha1su0(auVar49,auVar51,auVar52,4);
    auVar8._4_4_ = _UNK_00883884 + auVar51._4_4_;
    auVar8._0_4_ = _UNK_00883880 + auVar51._0_4_;
    auVar8._8_4_ = _UNK_00883888 + auVar51._8_4_;
    auVar8._12_4_ = _UNK_0088388c + auVar51._12_4_;
    auVar46 = NEON_sha1c(auVar45,uVar44 << 0x1e | uVar44 >> 2,auVar8,4);
    auVar50 = NEON_sha1su1(auVar49,auVar53,4);
    auVar51 = NEON_sha1su0(auVar51,auVar52,auVar53,4);
    auVar49._4_4_ = _UNK_00883884 + auVar52._4_4_;
    auVar49._0_4_ = _UNK_00883880 + auVar52._0_4_;
    auVar49._8_4_ = _UNK_00883888 + auVar52._8_4_;
    auVar49._12_4_ = _UNK_0088388c + auVar52._12_4_;
    auVar45 = NEON_sha1c(auVar46,auVar45._0_4_ << 0x1e | auVar45._0_4_ >> 2,auVar49,4);
    auVar51 = NEON_sha1su1(auVar51,auVar50,4);
    auVar52 = NEON_sha1su0(auVar52,auVar53,auVar50,4);
    auVar9._4_4_ = _UNK_00883884 + auVar53._4_4_;
    auVar9._0_4_ = _UNK_00883880 + auVar53._0_4_;
    auVar9._8_4_ = _UNK_00883888 + auVar53._8_4_;
    auVar9._12_4_ = _UNK_0088388c + auVar53._12_4_;
    auVar49 = NEON_sha1c(auVar45,auVar46._0_4_ << 0x1e | auVar46._0_4_ >> 2,auVar9,4);
    auVar52 = NEON_sha1su1(auVar52,auVar51,4);
    auVar53 = NEON_sha1su0(auVar53,auVar50,auVar51,4);
    auVar46._4_4_ = _UNK_00883884 + auVar50._4_4_;
    auVar46._0_4_ = _UNK_00883880 + auVar50._0_4_;
    auVar46._8_4_ = _UNK_00883888 + auVar50._8_4_;
    auVar46._12_4_ = _UNK_0088388c + auVar50._12_4_;
    auVar45 = NEON_sha1c(auVar49,auVar45._0_4_ << 0x1e | auVar45._0_4_ >> 2,auVar46,4);
    auVar54 = NEON_sha1su1(auVar53,auVar52,4);
    auVar46 = NEON_sha1su0(auVar50,auVar51,auVar52,4);
    auVar10._4_4_ = _UNK_00883894 + auVar51._4_4_;
    auVar10._0_4_ = _UNK_00883890 + auVar51._0_4_;
    auVar10._8_4_ = _UNK_00883898 + auVar51._8_4_;
    auVar10._12_4_ = _UNK_0088389c + auVar51._12_4_;
    auVar49 = NEON_sha1p(auVar45,auVar49._0_4_ << 0x1e | auVar49._0_4_ >> 2,auVar10,4);
    auVar46 = NEON_sha1su1(auVar46,auVar54,4);
    auVar51 = NEON_sha1su0(auVar51,auVar52,auVar54,4);
    auVar50._4_4_ = _UNK_00883894 + auVar52._4_4_;
    auVar50._0_4_ = _UNK_00883890 + auVar52._0_4_;
    auVar50._8_4_ = _UNK_00883898 + auVar52._8_4_;
    auVar50._12_4_ = _UNK_0088389c + auVar52._12_4_;
    auVar45 = NEON_sha1p(auVar49,auVar45._0_4_ << 0x1e | auVar45._0_4_ >> 2,auVar50,4);
    auVar50 = NEON_sha1su1(auVar51,auVar46,4);
    auVar51 = NEON_sha1su0(auVar52,auVar54,auVar46,4);
    auVar11._4_4_ = _UNK_00883894 + auVar54._4_4_;
    auVar11._0_4_ = _UNK_00883890 + auVar54._0_4_;
    auVar11._8_4_ = _UNK_00883898 + auVar54._8_4_;
    auVar11._12_4_ = _UNK_0088389c + auVar54._12_4_;
    auVar49 = NEON_sha1p(auVar45,auVar49._0_4_ << 0x1e | auVar49._0_4_ >> 2,auVar11,4);
    auVar53 = NEON_sha1su1(auVar51,auVar50,4);
    auVar52 = NEON_sha1su0(auVar54,auVar46,auVar50,4);
    auVar51._4_4_ = _UNK_00883894 + auVar46._4_4_;
    auVar51._0_4_ = _UNK_00883890 + auVar46._0_4_;
    auVar51._8_4_ = _UNK_00883898 + auVar46._8_4_;
    auVar51._12_4_ = _UNK_0088389c + auVar46._12_4_;
    auVar45 = NEON_sha1p(auVar49,auVar45._0_4_ << 0x1e | auVar45._0_4_ >> 2,auVar51,4);
    auVar54 = NEON_sha1su1(auVar52,auVar53,4);
    auVar46 = NEON_sha1su0(auVar46,auVar50,auVar53,4);
    auVar12._4_4_ = _UNK_00883894 + auVar50._4_4_;
    auVar12._0_4_ = _UNK_00883890 + auVar50._0_4_;
    auVar12._8_4_ = _UNK_00883898 + auVar50._8_4_;
    auVar12._12_4_ = _UNK_0088389c + auVar50._12_4_;
    auVar49 = NEON_sha1p(auVar45,auVar49._0_4_ << 0x1e | auVar49._0_4_ >> 2,auVar12,4);
    auVar46 = NEON_sha1su1(auVar46,auVar54,4);
    auVar50 = NEON_sha1su0(auVar50,auVar53,auVar54,4);
    auVar52._4_4_ = _UNK_008838a4 + auVar53._4_4_;
    auVar52._0_4_ = _UNK_008838a0 + auVar53._0_4_;
    auVar52._8_4_ = _UNK_008838a8 + auVar53._8_4_;
    auVar52._12_4_ = _UNK_008838ac + auVar53._12_4_;
    auVar45 = NEON_sha1m(auVar49,auVar45._0_4_ << 0x1e | auVar45._0_4_ >> 2,auVar52,4);
    auVar50 = NEON_sha1su1(auVar50,auVar46,4);
    auVar51 = NEON_sha1su0(auVar53,auVar54,auVar46,4);
    auVar13._4_4_ = _UNK_008838a4 + auVar54._4_4_;
    auVar13._0_4_ = _UNK_008838a0 + auVar54._0_4_;
    auVar13._8_4_ = _UNK_008838a8 + auVar54._8_4_;
    auVar13._12_4_ = _UNK_008838ac + auVar54._12_4_;
    auVar49 = NEON_sha1m(auVar45,auVar49._0_4_ << 0x1e | auVar49._0_4_ >> 2,auVar13,4);
    auVar51 = NEON_sha1su1(auVar51,auVar50,4);
    auVar52 = NEON_sha1su0(auVar54,auVar46,auVar50,4);
    auVar53._4_4_ = _UNK_008838a4 + auVar46._4_4_;
    auVar53._0_4_ = _UNK_008838a0 + auVar46._0_4_;
    auVar53._8_4_ = _UNK_008838a8 + auVar46._8_4_;
    auVar53._12_4_ = _UNK_008838ac + auVar46._12_4_;
    auVar45 = NEON_sha1m(auVar49,auVar45._0_4_ << 0x1e | auVar45._0_4_ >> 2,auVar53,4);
    auVar52 = NEON_sha1su1(auVar52,auVar51,4);
    auVar46 = NEON_sha1su0(auVar46,auVar50,auVar51,4);
    auVar14._4_4_ = _UNK_008838a4 + auVar50._4_4_;
    auVar14._0_4_ = _UNK_008838a0 + auVar50._0_4_;
    auVar14._8_4_ = _UNK_008838a8 + auVar50._8_4_;
    auVar14._12_4_ = _UNK_008838ac + auVar50._12_4_;
    auVar49 = NEON_sha1m(auVar45,auVar49._0_4_ << 0x1e | auVar49._0_4_ >> 2,auVar14,4);
    auVar46 = NEON_sha1su1(auVar46,auVar52,4);
    auVar50 = NEON_sha1su0(auVar50,auVar51,auVar52,4);
    auVar54._4_4_ = _UNK_008838a4 + auVar51._4_4_;
    auVar54._0_4_ = _UNK_008838a0 + auVar51._0_4_;
    auVar54._8_4_ = _UNK_008838a8 + auVar51._8_4_;
    auVar54._12_4_ = _UNK_008838ac + auVar51._12_4_;
    auVar45 = NEON_sha1m(auVar49,auVar45._0_4_ << 0x1e | auVar45._0_4_ >> 2,auVar54,4);
    auVar50 = NEON_sha1su1(auVar50,auVar46,4);
    auVar51 = NEON_sha1su0(auVar51,auVar52,auVar46,4);
    auVar15._4_4_ = _UNK_008838b4 + auVar52._4_4_;
    auVar15._0_4_ = _UNK_008838b0 + auVar52._0_4_;
    auVar15._8_4_ = _UNK_008838b8 + auVar52._8_4_;
    auVar15._12_4_ = _UNK_008838bc + auVar52._12_4_;
    auVar49 = NEON_sha1p(auVar45,auVar49._0_4_ << 0x1e | auVar49._0_4_ >> 2,auVar15,4);
    auVar51 = NEON_sha1su1(auVar51,auVar50,4);
    auVar52 = NEON_sha1su0(auVar52,auVar46,auVar50,4);
    auVar6._4_4_ = _UNK_008838b4 + auVar46._4_4_;
    auVar6._0_4_ = _UNK_008838b0 + auVar46._0_4_;
    auVar6._8_4_ = _UNK_008838b8 + auVar46._8_4_;
    auVar6._12_4_ = _UNK_008838bc + auVar46._12_4_;
    auVar45 = NEON_sha1p(auVar49,auVar45._0_4_ << 0x1e | auVar45._0_4_ >> 2,auVar6,4);
    auVar46 = NEON_sha1su1(auVar52,auVar51,4);
    auVar16._4_4_ = _UNK_008838b4 + auVar50._4_4_;
    auVar16._0_4_ = _UNK_008838b0 + auVar50._0_4_;
    auVar16._8_4_ = _UNK_008838b8 + auVar50._8_4_;
    auVar16._12_4_ = _UNK_008838bc + auVar50._12_4_;
    auVar49 = NEON_sha1p(auVar45,auVar49._0_4_ << 0x1e | auVar49._0_4_ >> 2,auVar16,4);
    auVar7._4_4_ = _UNK_008838b4 + auVar51._4_4_;
    auVar7._0_4_ = _UNK_008838b0 + auVar51._0_4_;
    auVar7._8_4_ = _UNK_008838b8 + auVar51._8_4_;
    auVar7._12_4_ = _UNK_008838bc + auVar51._12_4_;
    auVar45 = NEON_sha1p(auVar49,auVar45._0_4_ << 0x1e | auVar45._0_4_ >> 2,auVar7,4);
    auVar17._4_4_ = _UNK_008838b4 + auVar46._4_4_;
    auVar17._0_4_ = _UNK_008838b0 + auVar46._0_4_;
    auVar17._8_4_ = _UNK_008838b8 + auVar46._8_4_;
    auVar17._12_4_ = _UNK_008838bc + auVar46._12_4_;
    auVar49 = NEON_sha1p(auVar45,auVar49._0_4_ << 0x1e | auVar49._0_4_ >> 2,auVar17,4);
    iVar48 = iVar48 + (auVar45._0_4_ << 0x1e | auVar45._0_4_ >> 2);
    auVar47._0_4_ = auVar49._0_4_ + uVar44;
    auVar47._4_4_ = auVar49._4_4_ + auVar56._4_4_;
    auVar47._8_4_ = auVar49._8_4_ + auVar56._8_4_;
    auVar47._12_4_ = auVar49._12_4_ + auVar56._12_4_;
    auVar56 = auVar47;
  } while (lVar23 != 0);
  *(int *)*param_2 = auVar47._0_4_;
  *(int *)(*param_2 + 4) = auVar47._4_4_;
  *(int *)(*param_2 + 8) = auVar47._8_4_;
  *(int *)(*param_2 + 0xc) = auVar47._12_4_;
  *(int *)*pauVar18 = iVar48;
  return pauVar18;
}

