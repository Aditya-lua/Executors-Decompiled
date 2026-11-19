/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008bae54
 */

undefined1 * FUN_008bae54(long param_1,uint param_2,int param_3)

{
  uint uVar1;
  undefined1 uVar2;
  byte bVar3;
  uint uVar4;
  int iVar5;
  undefined1 *puVar6;
  long lVar7;
  undefined8 uVar8;
  long lVar9;
  long lVar10;
  ulong uVar11;
  undefined4 *puVar12;
  ulong uVar13;
  ulong uVar14;
  
  puVar6 = (undefined1 *)FUN_008b78d0(param_1,0x30,*(undefined1 *)(param_1 + 4),6,0);
  lVar9 = *(long *)(param_1 + 0x60);
  uVar2 = *(undefined1 *)(param_1 + 4);
  *puVar6 = 6;
  bVar3 = *(byte *)(lVar9 + 2);
  *(undefined8 *)(puVar6 + 0x10) = 0;
  *(undefined8 *)(puVar6 + 0x20) = 0;
  puVar6[1] = uVar2;
  *(undefined4 *)(puVar6 + 3) = 0xff000000;
  puVar6[2] = bVar3 & 3;
  puVar6[0xf] = 0;
  *(undefined8 *)(puVar6 + 7) = 0;
  if (((DAT_00d1fc90 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1fc90), iVar5 != 0)) {
                    /* try { // try from 008bb03c to 008bb03f has its CatchHandler @ 008bb05c */
    DAT_00d1fc88 = FUN_007fe1ec(DAT_00cca8c8);
    __cxa_guard_release(&DAT_00d1fc90);
  }
  *(long *)(puVar6 + 0x28) = (long)&DWORD_007f3700 + DAT_00d1fc88;
  if (0 < (int)param_2) {
    if (0x4000000 < param_2) goto LAB_008bb010;
    lVar7 = FUN_008b8498(param_1,*(undefined8 *)(puVar6 + 0x20),(long)*(int *)(puVar6 + 8) << 4,
                         param_2 << 4,puVar6[1]);
    lVar9 = (long)*(int *)(puVar6 + 8);
    *(long *)(puVar6 + 0x20) = lVar7;
    if (*(int *)(puVar6 + 8) < (int)param_2) {
      uVar11 = (ulong)param_2 - lVar9;
      if (1 < uVar11) {
        lVar10 = lVar9 * 0x10;
        uVar13 = uVar11 & 0xfffffffffffffffe;
        lVar9 = uVar13 + lVar9;
        puVar12 = (undefined4 *)(lVar7 + lVar10 + 0x1c);
        uVar14 = uVar13;
        do {
          uVar14 = uVar14 - 2;
          puVar12[-4] = 0;
          *puVar12 = 0;
          puVar12 = puVar12 + 8;
        } while (uVar14 != 0);
        if (uVar11 == uVar13) goto LAB_008baf84;
      }
      lVar10 = (ulong)param_2 - lVar9;
      puVar12 = (undefined4 *)(lVar7 + lVar9 * 0x10 + 0xc);
      do {
        lVar10 = lVar10 + -1;
        *puVar12 = 0;
        puVar12 = puVar12 + 4;
      } while (lVar10 != 0);
    }
LAB_008baf84:
    *(uint *)(puVar6 + 8) = param_2;
  }
  if (0 < param_3) {
    iVar5 = FUN_008b91dc(param_3 + -1);
    if (0x19 < iVar5) {
LAB_008bb010:
                    /* WARNING: Subroutine does not return */
      FUN_008b39cc(param_1,"table overflow");
    }
    uVar1 = iVar5 + 1;
    uVar4 = 1 << (ulong)(uVar1 & 0x1f);
    uVar11 = (ulong)uVar4;
    uVar8 = FUN_008b7610(param_1,uVar11 << 5,puVar6[1]);
    lVar9 = 0;
    *(undefined8 *)(puVar6 + 0x28) = uVar8;
    do {
      uVar11 = uVar11 - 1;
      lVar7 = *(long *)(puVar6 + 0x28) + lVar9;
      lVar9 = lVar9 + 0x20;
      *(undefined4 *)(lVar7 + 0x1c) = 0;
      *(undefined4 *)(lVar7 + 0xc) = 0;
    } while (uVar11 != 0);
    puVar6[5] = (char)uVar1;
    *(uint *)(puVar6 + 0xc) = uVar4;
    puVar6[4] = ~(byte)(-1 << (ulong)(uVar1 & 0x1f));
  }
  return puVar6;
}

