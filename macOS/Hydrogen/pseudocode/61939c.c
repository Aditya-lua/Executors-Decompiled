
/* WARNING: Possible PIC construction at 0x006193ac: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006193d4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00619404: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x006193d8) */
/* WARNING: Removing unreachable block (ram,0x006193b0) */
/* WARNING: Removing unreachable block (ram,0x00619408) */
/* WARNING: Removing unreachable block (ram,0x006193f4) */
/* WARNING: Removing unreachable block (ram,0x00619418) */
/* WARNING: Removing unreachable block (ram,0x0061942c) */
/* WARNING: Removing unreachable block (ram,0x00619474) */
/* WARNING: Removing unreachable block (ram,0x006194a0) */
/* WARNING: Removing unreachable block (ram,0x0061948c) */

void FUN_0061939c(void)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  int iVar4;
  int iVar5;
  uint uVar6;
  int iVar7;
  long lVar8;
  uint *puVar9;
  long lVar10;
  long unaff_x19;
  
  lVar8 = *(long *)(unaff_x19 + 0x70);
  lVar10 = *(long *)("/System/Library/Frameworks/LDAP.framework/Versions/A/LDAP" + unaff_x19 + 0x38)
  ;
  puVar9 = *(uint **)(unaff_x19 + 0x70);
  uVar1 = *puVar9 ^ *(uint *)(lVar8 + 0x28);
  uVar2 = puVar9[1] ^ *(uint *)(lVar8 + 0x2c) ^
          (*(int *)(lVar10 + (ulong)(uVar1 >> 0x10 & 0xff | 0x100) * 4) +
           *(int *)(lVar10 + (ulong)(uVar1 >> 0x18) * 4) ^
          *(uint *)(lVar10 + (ulong)(uVar1 >> 8 & 0xff | 0x200) * 4)) +
          *(int *)(lVar10 + (ulong)(uVar1 & 0xff | 0x300) * 4);
  uVar1 = puVar9[2] ^ uVar1 ^
          (*(int *)(lVar10 + (ulong)(uVar2 >> 0x10 & 0xff | 0x100) * 4) +
           *(int *)(lVar10 + (ulong)(uVar2 >> 0x18) * 4) ^
          *(uint *)(lVar10 + (ulong)(uVar2 >> 8 & 0xff | 0x200) * 4)) +
          *(int *)(lVar10 + (ulong)(uVar2 & 0xff | 0x300) * 4);
  uVar2 = puVar9[3] ^ uVar2 ^
          (*(int *)(lVar10 + (ulong)(uVar1 >> 0x10 & 0xff | 0x100) * 4) +
           *(int *)(lVar10 + (ulong)(uVar1 >> 0x18) * 4) ^
          *(uint *)(lVar10 + (ulong)(uVar1 >> 8 & 0xff | 0x200) * 4)) +
          *(int *)(lVar10 + (ulong)(uVar1 & 0xff | 0x300) * 4);
  uVar1 = puVar9[4] ^ uVar1 ^
          (*(int *)(lVar10 + (ulong)(uVar2 >> 0x10 & 0xff | 0x100) * 4) +
           *(int *)(lVar10 + (ulong)(uVar2 >> 0x18) * 4) ^
          *(uint *)(lVar10 + (ulong)(uVar2 >> 8 & 0xff | 0x200) * 4)) +
          *(int *)(lVar10 + (ulong)(uVar2 & 0xff | 0x300) * 4);
  uVar2 = puVar9[5] ^ uVar2 ^
          (*(int *)(lVar10 + (ulong)(uVar1 >> 0x10 & 0xff | 0x100) * 4) +
           *(int *)(lVar10 + (ulong)(uVar1 >> 0x18) * 4) ^
          *(uint *)(lVar10 + (ulong)(uVar1 >> 8 & 0xff | 0x200) * 4)) +
          *(int *)(lVar10 + (ulong)(uVar1 & 0xff | 0x300) * 4);
  uVar1 = puVar9[6] ^ uVar1 ^
          (*(int *)(lVar10 + (ulong)(uVar2 >> 0x10 & 0xff | 0x100) * 4) +
           *(int *)(lVar10 + (ulong)(uVar2 >> 0x18) * 4) ^
          *(uint *)(lVar10 + (ulong)(uVar2 >> 8 & 0xff | 0x200) * 4)) +
          *(int *)(lVar10 + (ulong)(uVar2 & 0xff | 0x300) * 4);
  uVar2 = puVar9[7] ^ uVar2 ^
          (*(int *)(lVar10 + (ulong)(uVar1 >> 0x10 & 0xff | 0x100) * 4) +
           *(int *)(lVar10 + (ulong)(uVar1 >> 0x18) * 4) ^
          *(uint *)(lVar10 + (ulong)(uVar1 >> 8 & 0xff | 0x200) * 4)) +
          *(int *)(lVar10 + (ulong)(uVar1 & 0xff | 0x300) * 4);
  uVar1 = puVar9[8] ^ uVar1 ^
          (*(int *)(lVar10 + (ulong)(uVar2 >> 0x10 & 0xff | 0x100) * 4) +
           *(int *)(lVar10 + (ulong)(uVar2 >> 0x18) * 4) ^
          *(uint *)(lVar10 + (ulong)(uVar2 >> 8 & 0xff | 0x200) * 4)) +
          *(int *)(lVar10 + (ulong)(uVar2 & 0xff | 0x300) * 4);
  uVar2 = puVar9[9] ^ uVar2 ^
          (*(int *)(lVar10 + (ulong)(uVar1 >> 0x10 & 0xff | 0x100) * 4) +
           *(int *)(lVar10 + (ulong)(uVar1 >> 0x18) * 4) ^
          *(uint *)(lVar10 + (ulong)(uVar1 >> 8 & 0xff | 0x200) * 4)) +
          *(int *)(lVar10 + (ulong)(uVar1 & 0xff | 0x300) * 4);
  uVar1 = puVar9[10] ^ uVar1 ^
          (*(int *)(lVar10 + (ulong)(uVar2 >> 0x10 & 0xff | 0x100) * 4) +
           *(int *)(lVar10 + (ulong)(uVar2 >> 0x18) * 4) ^
          *(uint *)(lVar10 + (ulong)(uVar2 >> 8 & 0xff | 0x200) * 4)) +
          *(int *)(lVar10 + (ulong)(uVar2 & 0xff | 0x300) * 4);
  uVar2 = puVar9[0xb] ^ uVar2 ^
          (*(int *)(lVar10 + (ulong)(uVar1 >> 0x10 & 0xff | 0x100) * 4) +
           *(int *)(lVar10 + (ulong)(uVar1 >> 0x18) * 4) ^
          *(uint *)(lVar10 + (ulong)(uVar1 >> 8 & 0xff | 0x200) * 4)) +
          *(int *)(lVar10 + (ulong)(uVar1 & 0xff | 0x300) * 4);
  uVar1 = puVar9[0xc] ^ uVar1 ^
          (*(int *)(lVar10 + (ulong)(uVar2 >> 0x10 & 0xff | 0x100) * 4) +
           *(int *)(lVar10 + (ulong)(uVar2 >> 0x18) * 4) ^
          *(uint *)(lVar10 + (ulong)(uVar2 >> 8 & 0xff | 0x200) * 4)) +
          *(int *)(lVar10 + (ulong)(uVar2 & 0xff | 0x300) * 4);
  uVar2 = puVar9[0xd] ^ uVar2 ^
          (*(int *)(lVar10 + (ulong)(uVar1 >> 0x10 & 0xff | 0x100) * 4) +
           *(int *)(lVar10 + (ulong)(uVar1 >> 0x18) * 4) ^
          *(uint *)(lVar10 + (ulong)(uVar1 >> 8 & 0xff | 0x200) * 4)) +
          *(int *)(lVar10 + (ulong)(uVar1 & 0xff | 0x300) * 4);
  uVar1 = puVar9[0xe] ^ uVar1 ^
          (*(int *)(lVar10 + (ulong)(uVar2 >> 0x10 & 0xff | 0x100) * 4) +
           *(int *)(lVar10 + (ulong)(uVar2 >> 0x18) * 4) ^
          *(uint *)(lVar10 + (ulong)(uVar2 >> 8 & 0xff | 0x200) * 4)) +
          *(int *)(lVar10 + (ulong)(uVar2 & 0xff | 0x300) * 4);
  uVar2 = puVar9[0xf] ^ uVar2 ^
          (*(int *)(lVar10 + (ulong)(uVar1 >> 0x10 & 0xff | 0x100) * 4) +
           *(int *)(lVar10 + (ulong)(uVar1 >> 0x18) * 4) ^
          *(uint *)(lVar10 + (ulong)(uVar1 >> 8 & 0xff | 0x200) * 4)) +
          *(int *)(lVar10 + (ulong)(uVar1 & 0xff | 0x300) * 4);
  iVar4 = *(int *)(lVar10 + (ulong)(uVar2 >> 0x18) * 4);
  iVar5 = *(int *)(lVar10 + (ulong)(uVar2 >> 0x10 & 0xff | 0x100) * 4);
  uVar6 = *(uint *)(lVar10 + (ulong)(uVar2 >> 8 & 0xff | 0x200) * 4);
  iVar7 = *(int *)(lVar10 + (ulong)(uVar2 & 0xff | 0x300) * 4);
  uVar3 = puVar9[0x10];
  *(uint *)(lVar8 + 0x30) = puVar9[0x11] ^ uVar2;
  *(uint *)(lVar8 + 0x34) = uVar3 ^ uVar1 ^ (iVar5 + iVar4 ^ uVar6) + iVar7;
  return;
}

