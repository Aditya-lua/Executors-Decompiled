/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008de870
 */

void FUN_008de870(long param_1)

{
  undefined8 *puVar1;
  undefined1 (*pauVar2) [16];
  undefined8 *puVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  long lVar8;
  uint3 uVar9;
  uint3 uVar10;
  runtime_error *this;
  long lVar11;
  ulong uVar12;
  ulong uVar13;
  long lVar14;
  long lVar15;
  uint uVar16;
  long lVar17;
  int iVar18;
  undefined8 *puVar19;
  byte bVar20;
  byte bVar23;
  byte bVar24;
  byte bVar25;
  byte bVar26;
  byte bVar27;
  byte bVar28;
  ulong uVar21;
  byte bVar29;
  undefined8 uVar22;
  byte bVar30;
  byte bVar32;
  byte bVar33;
  byte bVar34;
  byte bVar35;
  byte bVar36;
  byte bVar37;
  byte bVar38;
  undefined8 uVar31;
  long lVar39;
  undefined1 auVar40 [16];
  undefined1 auVar41 [16];
  long local_a78;
  long local_a70;
  ulong local_a38 [312];
  ulong local_78;
  long local_70;
  
  lVar8 = tpidr_el0;
  local_70 = *(long *)(lVar8 + 0x28);
  lVar14 = *(long *)(param_1 + 0x860) - *(long *)(param_1 + 0x858);
  uVar13 = lVar14 >> 4;
  if (uVar13 >> 0xe == 0) {
    FUN_008dfd24((long *)(param_1 + 0x858),0x4000 - uVar13);
  }
  else if (lVar14 != 0x40000) {
    *(long *)(param_1 + 0x860) = *(long *)(param_1 + 0x858) + 0x40000;
  }
  lVar14 = 0;
  local_a70 = 8;
  local_a78 = 8;
  do {
    uVar4 = (uint)lVar14 & 7;
    uVar6 = (uint)lVar14 >> 3;
    uVar5 = 1 << (ulong)uVar4;
    lVar17 = (ulong)(uVar5 & 0x80000000 | uVar5 & 0xff | (uVar6 & 0x7fffff) << 8) * 0x10;
    puVar19 = (undefined8 *)(*(long *)(param_1 + 0x10) + lVar17);
    puVar1 = (undefined8 *)(*(long *)(param_1 + 0x28) + lVar17);
    auVar40 = FUN_008dd964(*puVar19,puVar19[1],*puVar1,puVar1[1]);
    pauVar2 = (undefined1 (*) [16])(param_1 + 0x58 + lVar14 * 0x10);
    *pauVar2 = auVar40;
    if (lVar14 != 0) {
      lVar17 = 0;
      lVar15 = local_a70;
      lVar39 = local_a78;
      puVar19 = (undefined8 *)(param_1 + 0x60);
      do {
        uVar16 = (uint)lVar17;
        uVar7 = uVar16 >> 3;
        if (uVar6 == uVar7) {
          lVar11 = (ulong)(1 << (ulong)(uVar16 & 7) | uVar6 << 8 | uVar5) * 0x10;
          puVar1 = (undefined8 *)(*(long *)(param_1 + 0x10) + lVar11);
          puVar3 = (undefined8 *)(*(long *)(param_1 + 0x28) + lVar11);
          auVar40 = FUN_008dd964(*puVar1,puVar1[1],*puVar3,puVar3[1]);
          auVar40 = FUN_008dd964(auVar40._0_8_,auVar40._8_8_,*(undefined8 *)*pauVar2,
                                 *(undefined8 *)(*pauVar2 + 8));
          auVar40 = FUN_008dd964(auVar40._0_8_,auVar40._8_8_,puVar19[-1],*puVar19);
        }
        else {
          auVar40 = *(undefined1 (*) [16])
                     (*(long *)(param_1 + 0x40) +
                     (long)(int)((uVar4 << 8 |
                                  ((uVar6 + 0x1fffff + uVar7 * 0xf) - (uVar7 + uVar7 * uVar7 >> 1))
                                  * 0x800 | 1 << (ulong)(uVar16 & 7)) ^ 0x700) * 0x10);
        }
        lVar11 = *(long *)(param_1 + 0x858);
        lVar17 = lVar17 + 1;
        puVar19 = puVar19 + 2;
        puVar1 = (undefined8 *)(lVar11 + lVar15);
        puVar3 = (undefined8 *)(lVar11 + lVar39);
        lVar39 = lVar39 + 0x800;
        lVar15 = lVar15 + 0x10;
        puVar1[-1] = auVar40._0_8_;
        *puVar1 = auVar40._8_8_;
        puVar3[-1] = auVar40._0_8_;
        *puVar3 = auVar40._8_8_;
      } while (lVar14 != lVar17);
    }
    lVar14 = lVar14 + 1;
    local_a78 = local_a78 + 0x10;
    local_a70 = local_a70 + 0x800;
  } while (lVar14 != 0x80);
  uVar13 = 0xa17e;
  lVar14 = 1;
  local_a38[0] = 0xa17e;
  do {
    uVar13 = lVar14 + (uVar13 ^ uVar13 >> 0x3e) * 0x5851f42d4c957f2d;
    local_a38[lVar14] = uVar13;
    lVar14 = lVar14 + 1;
  } while (lVar14 != 0x138);
  iVar18 = 0x40;
  local_78 = 0;
  lVar14 = 0;
  while( true ) {
    uVar12 = (lVar14 + 1U) % 0x138;
    uVar13 = 0xb5026f5aa96619e9;
    if ((local_a38[uVar12] & 1) == 0) {
      uVar13 = 0;
    }
    lVar17 = uVar12 - 0x137;
    local_a38[lVar14] =
         uVar13 ^ local_a38[(lVar14 + 0x9cU) % 0x138] ^
         (local_a38[uVar12] & 0x7ffffffe | local_a38[lVar14] & 0xffffffff80000000) >> 1;
    if (uVar12 < 0x137) {
      lVar17 = uVar12 + 1;
    }
    lVar14 = -0x9c;
    if (uVar12 < 0x9c) {
      lVar14 = 0x9c;
    }
    uVar21 = local_a38[local_78];
    local_78 = uVar12;
    uVar13 = 0xb5026f5aa96619e9;
    if ((local_a38[lVar17] & 1) == 0) {
      uVar13 = 0;
    }
    uVar13 = uVar13 ^ local_a38[lVar14 + uVar12] ^
             (local_a38[lVar17] & 0x7ffffffe | local_a38[uVar12] & 0xffffffff80000000) >> 1;
    local_78 = lVar17;
    local_a38[uVar12] = uVar13;
    bVar29 = (byte)(uVar21 >> 0x38);
    bVar38 = (byte)(uVar13 >> 0x38);
    bVar20 = (byte)(uVar21 >> 0x1d) & 0x55 ^ (byte)uVar21;
    bVar23 = (byte)(uVar21 >> 0x25) & 0x55 ^ (byte)(uVar21 >> 8);
    bVar24 = (byte)(uVar21 >> 0x2d) & 0x55 ^ (byte)(uVar21 >> 0x10);
    bVar25 = (byte)(uVar21 >> 0x35) & 0x55 ^ (byte)(uVar21 >> 0x18);
    bVar26 = bVar29 >> 5 & 5 ^ (byte)(uVar21 >> 0x20);
    bVar27 = (byte)(uVar21 >> 0x28);
    bVar28 = (byte)(uVar21 >> 0x30);
    bVar30 = (byte)(uVar13 >> 0x1d) & 0x55 ^ (byte)uVar13;
    bVar32 = (byte)(uVar13 >> 0x25) & 0x55 ^ (byte)(uVar13 >> 8);
    bVar33 = (byte)(uVar13 >> 0x2d) & 0x55 ^ (byte)(uVar13 >> 0x10);
    bVar34 = (byte)(uVar13 >> 0x35) & 0x55 ^ (byte)(uVar13 >> 0x18);
    bVar35 = bVar38 >> 5 & 5 ^ (byte)(uVar13 >> 0x20);
    bVar36 = (byte)(uVar13 >> 0x28);
    bVar37 = (byte)(uVar13 >> 0x30);
    lVar14 = CONCAT17(bVar29,CONCAT16(bVar28,CONCAT15(bVar27,CONCAT14(bVar26,CONCAT13(bVar25,
                                                  CONCAT12(bVar24,CONCAT11(bVar23,bVar20))))))) <<
             0x11;
    lVar39 = CONCAT17(bVar38,CONCAT16(bVar37,CONCAT15(bVar36,CONCAT14(bVar35,CONCAT13(bVar34,
                                                  CONCAT12(bVar33,CONCAT11(bVar32,bVar30))))))) <<
             0x11;
    bVar24 = (byte)((ulong)lVar14 >> 0x10) & 0xa6 ^ bVar24;
    bVar25 = (byte)((ulong)lVar14 >> 0x18) & 0xed ^ bVar25;
    bVar26 = (byte)((ulong)lVar14 >> 0x20) ^ bVar26;
    bVar27 = (byte)((ulong)lVar14 >> 0x28) & 0x7f ^ bVar27;
    bVar28 = (byte)((ulong)lVar14 >> 0x30) & 0xd6 ^ bVar28;
    bVar29 = (byte)((ulong)lVar14 >> 0x38) & 0x71 ^ bVar29;
    bVar33 = (byte)((ulong)lVar39 >> 0x10) & 0xa6 ^ bVar33;
    bVar34 = (byte)((ulong)lVar39 >> 0x18) & 0xed ^ bVar34;
    bVar35 = (byte)((ulong)lVar39 >> 0x20) ^ bVar35;
    bVar36 = (byte)((ulong)lVar39 >> 0x28) & 0x7f ^ bVar36;
    bVar37 = (byte)((ulong)lVar39 >> 0x30) & 0xd6 ^ bVar37;
    bVar38 = (byte)((ulong)lVar39 >> 0x38) & 0x71 ^ bVar38;
    lVar14 = CONCAT17(bVar29,CONCAT16(bVar28,CONCAT15(bVar27,CONCAT14(bVar26,CONCAT13(bVar25,
                                                  CONCAT12(bVar24,CONCAT11(bVar23,bVar20))))))) <<
             0x25;
    lVar39 = CONCAT17(bVar38,CONCAT16(bVar37,CONCAT15(bVar36,CONCAT14(bVar35,CONCAT13(bVar34,
                                                  CONCAT12(bVar33,CONCAT11(bVar32,bVar30))))))) <<
             0x25;
    bVar27 = (byte)((ulong)lVar14 >> 0x28) & 0xee ^ bVar27;
    bVar28 = (byte)((ulong)lVar14 >> 0x30) & 0xf7 ^ bVar28;
    bVar29 = (byte)((ulong)lVar14 >> 0x38) ^ bVar29;
    bVar36 = (byte)((ulong)lVar39 >> 0x28) & 0xee ^ bVar36;
    bVar37 = (byte)((ulong)lVar39 >> 0x30) & 0xf7 ^ bVar37;
    bVar38 = (byte)((ulong)lVar39 >> 0x38) ^ bVar38;
    uVar9 = CONCAT12(bVar29,CONCAT11(bVar28,bVar27)) >> 3;
    uVar10 = CONCAT12(bVar38,CONCAT11(bVar37,bVar36)) >> 3;
    uVar22 = CONCAT17(bVar29,CONCAT16(bVar28,CONCAT15(bVar27,CONCAT14((byte)((ulong)lVar14 >> 0x20)
                                                                      ^ bVar26,CONCAT13(bVar25,
                                                  CONCAT12(bVar29 >> 3 ^ bVar24,
                                                           CONCAT11((byte)(uVar9 >> 8) ^ bVar23,
                                                                    (byte)uVar9 ^ bVar20)))))));
    uVar31 = CONCAT17(bVar38,CONCAT16(bVar37,CONCAT15(bVar36,CONCAT14((byte)((ulong)lVar39 >> 0x20)
                                                                      ^ bVar35,CONCAT13(bVar34,
                                                  CONCAT12(bVar38 >> 3 ^ bVar33,
                                                           CONCAT11((byte)(uVar10 >> 8) ^ bVar32,
                                                                    (byte)uVar10 ^ bVar30)))))));
    auVar40 = FUN_008decbc(param_1,uVar22,uVar31);
    auVar41 = FUN_008df008(param_1,uVar22,uVar31);
    if (auVar40 != auVar41) break;
    iVar18 = iVar18 + -1;
    lVar14 = lVar17;
    if (iVar18 == 0) {
      if (*(long *)(lVar8 + 0x28) == local_70) {
        FUN_008df0fc(param_1);
        return;
      }
LAB_008decb8:
                    /* WARNING: Subroutine does not return */
      __stack_chk_fail();
    }
  }
  this = (runtime_error *)__cxa_allocate_exception(0x10);
                    /* try { // try from 008dec58 to 008dec63 has its CatchHandler @ 008dec90 */
  std::runtime_error::runtime_error(this,"tables do not match");
  if (*(long *)(lVar8 + 0x28) == local_70) {
                    /* WARNING: Subroutine does not return */
    __cxa_throw(this,&std::runtime_error::typeinfo,std::underflow_error::~underflow_error);
  }
  goto LAB_008decb8;
}

