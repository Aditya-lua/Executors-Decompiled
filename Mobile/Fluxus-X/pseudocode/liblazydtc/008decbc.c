/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008decbc
 */

/* WARNING: Type propagation algorithm not settling */

void FUN_008decbc(undefined8 *param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  byte bVar3;
  byte bVar4;
  int iVar5;
  long lVar6;
  int iVar7;
  long lVar8;
  int iVar9;
  ulong uVar10;
  long lVar11;
  long lVar12;
  uint uVar13;
  int iVar14;
  int iVar15;
  uint uVar16;
  undefined1 auVar17 [16];
  undefined8 local_90;
  undefined8 uStack_88;
  byte local_78 [4];
  undefined1 local_74;
  undefined1 local_73;
  undefined1 local_72;
  undefined1 local_71;
  undefined1 local_70;
  undefined1 local_6f;
  undefined1 local_6e;
  undefined1 local_6d;
  undefined1 local_6c;
  undefined1 local_6b;
  undefined1 local_6a;
  undefined1 local_69;
  long local_68;
  
  lVar6 = tpidr_el0;
  lVar12 = 0;
  uVar10 = 0;
  local_68 = *(long *)(lVar6 + 0x28);
  local_78[1] = (char)((ulong)param_2 >> 8);
  uStack_88 = param_1[1];
  local_90 = *param_1;
  local_78[2] = (char)((ulong)param_2 >> 0x10);
  local_78[3] = (char)((ulong)param_2 >> 0x18);
  local_74 = (char)((ulong)param_2 >> 0x20);
  local_73 = (char)((ulong)param_2 >> 0x28);
  local_72 = (char)((ulong)param_2 >> 0x30);
  local_71 = (char)((ulong)param_2 >> 0x38);
  local_6f = (char)((ulong)param_3 >> 8);
  local_6e = (char)((ulong)param_3 >> 0x10);
  local_6d = (char)((ulong)param_3 >> 0x18);
  local_6c = (char)((ulong)param_3 >> 0x20);
  local_6b = (char)((ulong)param_3 >> 0x28);
  local_78[0] = (byte)param_2;
  local_69 = (char)((ulong)param_3 >> 0x38);
  local_70 = (char)param_3;
  local_6a = (char)((ulong)param_3 >> 0x30);
  iVar7 = -0x800;
  do {
    bVar3 = local_78[uVar10];
    if ((ulong)bVar3 == 0) {
      auVar17 = ZEXT816(0);
    }
    else {
      lVar8 = ((ulong)bVar3 | (uVar10 & 0xffffff) << 8) * 0x10;
      puVar1 = (undefined8 *)(param_1[2] + lVar8);
      puVar2 = (undefined8 *)(param_1[5] + lVar8);
      auVar17 = FUN_008dd964(*puVar1,puVar1[1],*puVar2,puVar2[1]);
    }
    FUN_008dd950(&local_90,auVar17._0_8_,auVar17._8_8_);
    if (uVar10 != 0) {
      uVar16 = 0;
      lVar8 = 0;
      lVar11 = 0;
      iVar15 = 2;
      iVar14 = iVar7 + 0x100;
      do {
        bVar4 = local_78[lVar8];
        if (bVar4 != 0) {
          iVar5 = (uVar16 >> 1) * -0x800;
          iVar9 = (int)lVar11;
          uVar13 = (uint)bVar4;
          if ((char)bVar3 < '\0') {
            puVar1 = (undefined8 *)
                     (param_1[8] + (long)(int)(iVar7 + iVar9 + (uint)bVar4 + iVar5) * 0x10);
            FUN_008dd950(&local_90,*puVar1,puVar1[1]);
          }
          if ((bVar3 >> 6 & 1) != 0) {
            puVar1 = (undefined8 *)
                     (param_1[8] + (long)(int)(iVar14 + iVar9 + uVar13 + iVar5) * 0x10);
            FUN_008dd950(&local_90,*puVar1,puVar1[1]);
          }
          if ((bVar3 >> 5 & 1) != 0) {
            puVar1 = (undefined8 *)
                     (param_1[8] + (long)(int)(iVar14 + iVar9 + uVar13 + iVar5 + 0x100) * 0x10);
            FUN_008dd950(&local_90,*puVar1,puVar1[1]);
          }
          if ((bVar3 >> 4 & 1) != 0) {
            puVar1 = (undefined8 *)
                     (param_1[8] + (long)(int)(iVar14 + iVar9 + uVar13 + iVar5 + 0x200) * 0x10);
            FUN_008dd950(&local_90,*puVar1,puVar1[1]);
          }
          if ((bVar3 >> 3 & 1) != 0) {
            puVar1 = (undefined8 *)
                     (param_1[8] + (long)(int)(iVar14 + iVar9 + uVar13 + iVar5 + 0x300) * 0x10);
            FUN_008dd950(&local_90,*puVar1,puVar1[1]);
          }
          if ((bVar3 >> 2 & 1) != 0) {
            puVar1 = (undefined8 *)
                     (param_1[8] + (long)(int)(iVar7 + 0x500 + iVar9 + uVar13 + iVar5) * 0x10);
            FUN_008dd950(&local_90,*puVar1,puVar1[1]);
          }
          if ((bVar3 >> 1 & 1) != 0) {
            puVar1 = (undefined8 *)
                     (param_1[8] + (long)(int)(iVar14 + iVar9 + uVar13 + iVar5 + 0x500) * 0x10);
            FUN_008dd950(&local_90,*puVar1,puVar1[1]);
          }
          if ((bVar3 & 1) != 0) {
            puVar1 = (undefined8 *)
                     (param_1[8] + (long)(int)(iVar14 + iVar9 + uVar13 + iVar5 + 0x600) * 0x10);
            FUN_008dd950(&local_90,*puVar1,puVar1[1]);
          }
        }
        uVar16 = uVar16 + iVar15;
        lVar8 = lVar8 + 1;
        lVar11 = lVar11 + 0x7800;
        iVar15 = iVar15 + 2;
      } while (lVar12 != lVar11);
    }
    lVar12 = lVar12 + 0x7800;
    uVar10 = uVar10 + 1;
    iVar7 = iVar7 + 0x800;
  } while (uVar10 != 0x10);
  if (*(long *)(lVar6 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(local_90,uStack_88);
  }
  return;
}

