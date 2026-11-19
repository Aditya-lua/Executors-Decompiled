/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008bc688
 */

long FUN_008bc688(undefined8 param_1,long param_2,undefined8 *param_3,uint *param_4)

{
  int *piVar1;
  int iVar2;
  long lVar3;
  uint uVar4;
  ulong uVar5;
  ulong uVar6;
  int *piVar7;
  ulong uVar8;
  byte bVar10;
  byte bVar11;
  byte bVar12;
  undefined8 uVar9;
  byte bVar13;
  int iVar14;
  int iVar15;
  
  do {
    uVar9 = *(undefined8 *)(param_4 + 1);
    iVar14 = -(uint)((int)uVar9 == -0x80000000);
    iVar15 = -(uint)((int)((ulong)uVar9 >> 0x20) == -0x80000000);
    uVar4 = 0;
    if (*param_4 != 0x80000000) {
      uVar4 = *param_4;
    }
    bVar10 = (byte)((ulong)uVar9 >> 0x10) & ~(byte)((uint)iVar14 >> 0x10);
    bVar11 = (byte)((ulong)uVar9 >> 0x18) & ~(byte)((uint)iVar14 >> 0x18);
    bVar12 = (byte)((ulong)uVar9 >> 0x30) & ~(byte)((uint)iVar15 >> 0x10);
    bVar13 = (byte)((ulong)uVar9 >> 0x38) & ~(byte)((uint)iVar15 >> 0x18);
    iVar14 = CONCAT13(bVar11,CONCAT12(bVar10,CONCAT11(bVar11 >> 1 ^
                                                      (byte)((ulong)uVar9 >> 8) &
                                                      ~(byte)((uint)iVar14 >> 8),
                                                      (byte)(CONCAT11(bVar11,bVar10) >> 1) ^
                                                      (byte)uVar9 & ~(byte)iVar14)));
    lVar3 = *(long *)(param_2 + 0x28) +
            (ulong)((iVar14 * 0x127409f ^ (uVar4 ^ uVar4 >> 0x11) * 0x466f45d ^
                    (int)(CONCAT17(bVar13,CONCAT16(bVar12,CONCAT15(bVar13 >> 1 ^
                                                                   (byte)((ulong)uVar9 >> 0x28) &
                                                                   ~(byte)((uint)iVar15 >> 8),
                                                                   CONCAT14((byte)(((ulong)CONCAT11(
                                                  bVar13,bVar12) << 0x30) >> 0x31) ^
                                                  (byte)((ulong)uVar9 >> 0x20) & ~(byte)iVar15,
                                                  iVar14)))) >> 0x20) * 0x4f9ffb7) &
                   (-1 << (ulong)(*(byte *)(param_2 + 5) & 0x1f) ^ 0xffffffffU)) * 0x20;
    if (*(int *)(lVar3 + 0xc) == 0) {
      if (((DAT_00d1fc90 & 1) == 0) && (iVar14 = __cxa_guard_acquire(&DAT_00d1fc90), iVar14 != 0)) {
                    /* try { // try from 008bc848 to 008bc84b has its CatchHandler @ 008bc8b8 */
        DAT_00d1fc88 = FUN_007fe1ec(DAT_00cca8c8);
        __cxa_guard_release(&DAT_00d1fc90);
      }
      if (lVar3 != (long)&DWORD_007f3700 + DAT_00d1fc88) {
LAB_008bc870:
        *(undefined8 *)(lVar3 + 0x10) = *param_3;
        *(undefined4 *)(lVar3 + 0x18) = *(undefined4 *)(param_3 + 1);
        *(uint *)(lVar3 + 0x1c) =
             *(uint *)(lVar3 + 0x1c) & 0xfffffff0 | *(uint *)((long)param_3 + 0xc) & 0xf;
        return lVar3;
      }
    }
    uVar4 = *(uint *)(param_2 + 0xc);
    while (0 < (int)uVar4) {
      uVar4 = uVar4 - 1;
      *(uint *)(param_2 + 0xc) = uVar4;
      if ((*(byte *)(*(long *)(param_2 + 0x28) + (ulong)uVar4 * 0x20 + 0x1c) & 0xf) == 0) {
        lVar3 = FUN_008bda50(param_2);
        goto LAB_008bc870;
      }
    }
    iVar14 = 0;
    uVar6 = (ulong)(1 << (ulong)(*(byte *)(param_2 + 5) & 0x1f));
    if (*(byte *)(param_2 + 5) == 0) {
      uVar5 = 1;
LAB_008bc7f8:
      piVar7 = (int *)(*(long *)(param_2 + 0x28) + uVar5 * 0x20 + -0x14);
      do {
        uVar5 = uVar5 - 1;
        if (*piVar7 != 0) {
          iVar14 = iVar14 + 1;
        }
        piVar7 = piVar7 + -8;
      } while (uVar5 != 0);
    }
    else {
      iVar15 = 0;
      uVar5 = uVar6 & 1;
      piVar7 = (int *)(*(long *)(param_2 + 0x28) + uVar6 * 0x20 + -0x14);
      uVar8 = uVar6 & 0xfffffffffffffffe;
      do {
        iVar2 = *piVar7;
        piVar1 = piVar7 + -8;
        uVar8 = uVar8 - 2;
        piVar7 = piVar7 + -0x10;
        if (iVar2 != 0) {
          iVar14 = iVar14 + 1;
        }
        if (*piVar1 != 0) {
          iVar15 = iVar15 + 1;
        }
      } while (uVar8 != 0);
      iVar14 = iVar15 + iVar14;
      if ((uVar6 & 0xfffffffffffffffe) != uVar6) goto LAB_008bc7f8;
    }
    FUN_008ba968(param_1,param_2,*(undefined4 *)(param_2 + 8),iVar14 + 1);
  } while( true );
}

