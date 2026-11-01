
/* WARNING: Possible PIC construction at 0x00619338: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0061935c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00619384: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006193ac: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006193d4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00619404: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x006193d8) */
/* WARNING: Removing unreachable block (ram,0x006193b0) */
/* WARNING: Removing unreachable block (ram,0x00619388) */
/* WARNING: Removing unreachable block (ram,0x00619360) */
/* WARNING: Removing unreachable block (ram,0x0061933c) */
/* WARNING: Removing unreachable block (ram,0x00619408) */
/* WARNING: Removing unreachable block (ram,0x006193f4) */
/* WARNING: Removing unreachable block (ram,0x00619418) */
/* WARNING: Removing unreachable block (ram,0x0061942c) */
/* WARNING: Removing unreachable block (ram,0x00619474) */
/* WARNING: Removing unreachable block (ram,0x006194a0) */
/* WARNING: Removing unreachable block (ram,0x0061948c) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00619260(long param_1,long param_2,uint param_3)

{
  int iVar1;
  int iVar2;
  int iVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  uint *puVar11;
  uint uVar12;
  long lVar13;
  uint *puVar14;
  undefined8 *puVar15;
  uint uStack0000000000000000;
  uint uStack0000000000000004;
  undefined8 uStack0000000000000008;
  
  uStack0000000000000008 = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
  _uStack0000000000000000 = 0;
  puVar15 = *(undefined8 **)(param_1 + 0x70);
  puVar15[8] = _UNK_008bbb84;
  uVar10 = _UNK_008bbb7c;
  uVar9 = _UNK_008bbb74;
  uVar8 = _UNK_008bbb64;
  puVar15[5] = _UNK_008bbb6c;
  puVar15[4] = uVar8;
  puVar15[7] = uVar10;
  puVar15[6] = uVar9;
  uVar10 = _UNK_008bbb5c;
  uVar9 = _UNK_008bbb54;
  uVar8 = _UNK_008bbb44;
  puVar15[1] = _UNK_008bbb4c;
  *puVar15 = uVar8;
  puVar15[3] = uVar10;
  puVar15[2] = uVar9;
  _memcpy(*(undefined8 *)
           ("/System/Library/Frameworks/LDAP.framework/Versions/A/LDAP" + param_1 + 0x38),
          &UNK_008bbb8c,0x1000);
  lVar13 = 0;
  puVar11 = *(uint **)(param_1 + 0x70);
  do {
    uVar12 = (uint)lVar13;
    uVar4 = 0;
    if (param_3 != 0) {
      uVar4 = uVar12 / param_3;
    }
    uVar5 = 0;
    if (param_3 != 0) {
      uVar5 = (uVar12 + 1) / param_3;
    }
    uVar6 = 0;
    if (param_3 != 0) {
      uVar6 = (uVar12 + 2) / param_3;
    }
    uVar7 = 0;
    if (param_3 != 0) {
      uVar7 = (uVar12 + 3) / param_3;
    }
    *(uint *)((long)puVar11 + lVar13) =
         *(uint *)((long)puVar11 + lVar13) ^
         ((uint)*(byte *)(param_2 + (ulong)((uVar12 + 3) - uVar7 * param_3)) |
         ((uint)*(byte *)(param_2 + (ulong)((uVar12 + 1) - uVar5 * param_3)) << 8 |
          (uint)*(byte *)(param_2 + (ulong)(uVar12 - uVar4 * param_3)) << 0x10 |
         (uint)*(byte *)(param_2 + (ulong)((uVar12 + 2) - uVar6 * param_3))) << 8);
    lVar13 = lVar13 + 4;
  } while (lVar13 != 0x48);
  lVar13 = *(long *)("/System/Library/Frameworks/LDAP.framework/Versions/A/LDAP" + param_1 + 0x38);
  puVar14 = *(uint **)(param_1 + 0x70);
  uStack0000000000000000 = *puVar14 ^ uStack0000000000000000;
  uVar4 = puVar14[1] ^ uStack0000000000000004 ^
          (*(int *)(lVar13 + (ulong)(uStack0000000000000000 >> 0x10 & 0xff | 0x100) * 4) +
           *(int *)(lVar13 + (ulong)(uStack0000000000000000 >> 0x18) * 4) ^
          *(uint *)(lVar13 + (ulong)(uStack0000000000000000 >> 8 & 0xff | 0x200) * 4)) +
          *(int *)(lVar13 + (ulong)(uStack0000000000000000 & 0xff | 0x300) * 4);
  uVar12 = puVar14[2] ^ uStack0000000000000000 ^
           (*(int *)(lVar13 + (ulong)(uVar4 >> 0x10 & 0xff | 0x100) * 4) +
            *(int *)(lVar13 + (ulong)(uVar4 >> 0x18) * 4) ^
           *(uint *)(lVar13 + (ulong)(uVar4 >> 8 & 0xff | 0x200) * 4)) +
           *(int *)(lVar13 + (ulong)(uVar4 & 0xff | 0x300) * 4);
  uVar4 = puVar14[3] ^ uVar4 ^
          (*(int *)(lVar13 + (ulong)(uVar12 >> 0x10 & 0xff | 0x100) * 4) +
           *(int *)(lVar13 + (ulong)(uVar12 >> 0x18) * 4) ^
          *(uint *)(lVar13 + (ulong)(uVar12 >> 8 & 0xff | 0x200) * 4)) +
          *(int *)(lVar13 + (ulong)(uVar12 & 0xff | 0x300) * 4);
  uVar12 = puVar14[4] ^ uVar12 ^
           (*(int *)(lVar13 + (ulong)(uVar4 >> 0x10 & 0xff | 0x100) * 4) +
            *(int *)(lVar13 + (ulong)(uVar4 >> 0x18) * 4) ^
           *(uint *)(lVar13 + (ulong)(uVar4 >> 8 & 0xff | 0x200) * 4)) +
           *(int *)(lVar13 + (ulong)(uVar4 & 0xff | 0x300) * 4);
  uVar4 = puVar14[5] ^ uVar4 ^
          (*(int *)(lVar13 + (ulong)(uVar12 >> 0x10 & 0xff | 0x100) * 4) +
           *(int *)(lVar13 + (ulong)(uVar12 >> 0x18) * 4) ^
          *(uint *)(lVar13 + (ulong)(uVar12 >> 8 & 0xff | 0x200) * 4)) +
          *(int *)(lVar13 + (ulong)(uVar12 & 0xff | 0x300) * 4);
  uVar12 = puVar14[6] ^ uVar12 ^
           (*(int *)(lVar13 + (ulong)(uVar4 >> 0x10 & 0xff | 0x100) * 4) +
            *(int *)(lVar13 + (ulong)(uVar4 >> 0x18) * 4) ^
           *(uint *)(lVar13 + (ulong)(uVar4 >> 8 & 0xff | 0x200) * 4)) +
           *(int *)(lVar13 + (ulong)(uVar4 & 0xff | 0x300) * 4);
  uVar4 = puVar14[7] ^ uVar4 ^
          (*(int *)(lVar13 + (ulong)(uVar12 >> 0x10 & 0xff | 0x100) * 4) +
           *(int *)(lVar13 + (ulong)(uVar12 >> 0x18) * 4) ^
          *(uint *)(lVar13 + (ulong)(uVar12 >> 8 & 0xff | 0x200) * 4)) +
          *(int *)(lVar13 + (ulong)(uVar12 & 0xff | 0x300) * 4);
  uVar12 = puVar14[8] ^ uVar12 ^
           (*(int *)(lVar13 + (ulong)(uVar4 >> 0x10 & 0xff | 0x100) * 4) +
            *(int *)(lVar13 + (ulong)(uVar4 >> 0x18) * 4) ^
           *(uint *)(lVar13 + (ulong)(uVar4 >> 8 & 0xff | 0x200) * 4)) +
           *(int *)(lVar13 + (ulong)(uVar4 & 0xff | 0x300) * 4);
  uVar4 = puVar14[9] ^ uVar4 ^
          (*(int *)(lVar13 + (ulong)(uVar12 >> 0x10 & 0xff | 0x100) * 4) +
           *(int *)(lVar13 + (ulong)(uVar12 >> 0x18) * 4) ^
          *(uint *)(lVar13 + (ulong)(uVar12 >> 8 & 0xff | 0x200) * 4)) +
          *(int *)(lVar13 + (ulong)(uVar12 & 0xff | 0x300) * 4);
  uVar12 = puVar14[10] ^ uVar12 ^
           (*(int *)(lVar13 + (ulong)(uVar4 >> 0x10 & 0xff | 0x100) * 4) +
            *(int *)(lVar13 + (ulong)(uVar4 >> 0x18) * 4) ^
           *(uint *)(lVar13 + (ulong)(uVar4 >> 8 & 0xff | 0x200) * 4)) +
           *(int *)(lVar13 + (ulong)(uVar4 & 0xff | 0x300) * 4);
  uVar4 = puVar14[0xb] ^ uVar4 ^
          (*(int *)(lVar13 + (ulong)(uVar12 >> 0x10 & 0xff | 0x100) * 4) +
           *(int *)(lVar13 + (ulong)(uVar12 >> 0x18) * 4) ^
          *(uint *)(lVar13 + (ulong)(uVar12 >> 8 & 0xff | 0x200) * 4)) +
          *(int *)(lVar13 + (ulong)(uVar12 & 0xff | 0x300) * 4);
  uVar12 = puVar14[0xc] ^ uVar12 ^
           (*(int *)(lVar13 + (ulong)(uVar4 >> 0x10 & 0xff | 0x100) * 4) +
            *(int *)(lVar13 + (ulong)(uVar4 >> 0x18) * 4) ^
           *(uint *)(lVar13 + (ulong)(uVar4 >> 8 & 0xff | 0x200) * 4)) +
           *(int *)(lVar13 + (ulong)(uVar4 & 0xff | 0x300) * 4);
  uVar4 = puVar14[0xd] ^ uVar4 ^
          (*(int *)(lVar13 + (ulong)(uVar12 >> 0x10 & 0xff | 0x100) * 4) +
           *(int *)(lVar13 + (ulong)(uVar12 >> 0x18) * 4) ^
          *(uint *)(lVar13 + (ulong)(uVar12 >> 8 & 0xff | 0x200) * 4)) +
          *(int *)(lVar13 + (ulong)(uVar12 & 0xff | 0x300) * 4);
  uVar12 = puVar14[0xe] ^ uVar12 ^
           (*(int *)(lVar13 + (ulong)(uVar4 >> 0x10 & 0xff | 0x100) * 4) +
            *(int *)(lVar13 + (ulong)(uVar4 >> 0x18) * 4) ^
           *(uint *)(lVar13 + (ulong)(uVar4 >> 8 & 0xff | 0x200) * 4)) +
           *(int *)(lVar13 + (ulong)(uVar4 & 0xff | 0x300) * 4);
  uVar4 = puVar14[0xf] ^ uVar4 ^
          (*(int *)(lVar13 + (ulong)(uVar12 >> 0x10 & 0xff | 0x100) * 4) +
           *(int *)(lVar13 + (ulong)(uVar12 >> 0x18) * 4) ^
          *(uint *)(lVar13 + (ulong)(uVar12 >> 8 & 0xff | 0x200) * 4)) +
          *(int *)(lVar13 + (ulong)(uVar12 & 0xff | 0x300) * 4);
  iVar1 = *(int *)(lVar13 + (ulong)(uVar4 >> 0x18) * 4);
  iVar2 = *(int *)(lVar13 + (ulong)(uVar4 >> 0x10 & 0xff | 0x100) * 4);
  uVar6 = *(uint *)(lVar13 + (ulong)(uVar4 >> 8 & 0xff | 0x200) * 4);
  iVar3 = *(int *)(lVar13 + (ulong)(uVar4 & 0xff | 0x300) * 4);
  uVar5 = puVar14[0x10];
  *puVar11 = puVar14[0x11] ^ uVar4;
  puVar11[1] = uVar5 ^ uVar12 ^ (iVar2 + iVar1 ^ uVar6) + iVar3;
  return;
}

