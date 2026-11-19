/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00937da0
 */

/* WARNING: Type propagation algorithm not settling */

void FUN_00937da0(long param_1,int param_2,long *param_3)

{
  code *pcVar1;
  long lVar2;
  undefined2 uVar3;
  uint uVar4;
  int iVar5;
  ulong uVar6;
  undefined8 *puVar7;
  fde_table_entry *pfVar8;
  char *pcVar9;
  size_t sVar10;
  ulong uVar11;
  undefined1 uVar12;
  byte bVar13;
  undefined4 uVar14;
  undefined8 *puVar15;
  long *plVar16;
  int *piVar17;
  byte *pbVar18;
  ulong uVar19;
  uint *puVar20;
  ulong *puVar21;
  undefined8 uVar22;
  long lVar23;
  long lVar24;
  char *pcVar25;
  undefined8 local_158;
  long local_150;
  long local_148 [32];
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  uVar11 = 0;
  if (param_2 < 0x2711) {
    uVar6 = 4;
    switch(param_2) {
    case 3:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      if (*puVar21 >> 0x10 != 0) goto LAB_0093ebac;
      *(short *)(param_1 + 0x1e8) = (short)*puVar21;
      uVar11 = 0;
      break;
    default:
      goto switchD_00937e08_caseD_2713;
    case 0xd:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      if (0x20c49b < *puVar21) goto LAB_0093ebac;
      *(int *)(param_1 + 0x2e0) = (int)*puVar21 * 1000;
      uVar11 = 0;
      break;
    case 0xe:
switchD_00938088_caseD_75a3:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      if (*plVar16 < -1) goto LAB_0093ebac;
      *(long *)(param_1 + 0x310) = *plVar16;
      uVar11 = 0;
      break;
    case 0x13:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        lVar23 = *(long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
        lVar23 = *plVar16;
      }
      if (lVar23 < 0) goto LAB_0093ebac;
      *(long *)(param_1 + 0x318) = lVar23;
      uVar11 = 0;
      break;
    case 0x14:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        lVar23 = *(long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
        lVar23 = *plVar16;
      }
      if (lVar23 < 0) goto LAB_0093ebac;
      *(long *)(param_1 + 800) = lVar23;
      uVar11 = 0;
      break;
    case 0x15:
switchD_00938088_caseD_75a4:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      if (*plVar16 < -1) goto LAB_0093ebac;
      *(long *)(param_1 + 0x338) = *plVar16;
      uVar11 = 0;
      break;
    case 0x1b:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xffffffffffffffc0 | uVar11 & 0x1f | (ulong)(*plVar16 != 0) << 5;
      uVar11 = 0;
      break;
    case 0x20:
    case 0xfa:
      iVar5 = (int)param_3[3];
      lVar23 = param_1 + 0x530;
      if (param_2 != 0x20) {
        lVar23 = param_1 + 0x5f8;
      }
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      uVar11 = *puVar21;
      uVar6 = 0x2b;
      if ((((uVar11 >> 0x13 & 0x1fff) != 0) || (7 < (uVar11 & 0xffff))) ||
         ((uVar11 & 0xffff | 1) == 3)) goto switchD_00937ea8_caseD_ef;
      *(char *)(lVar23 + 0x78) = (char)uVar11;
      *(uint *)(lVar23 + 0x74) = (uint)uVar11 & 0xffff0000;
      uVar11 = 0;
      break;
    case 0x21:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      if (3 < *puVar21) goto LAB_0093ebac;
      *(char *)(param_1 + 0x528) = (char)*puVar21;
      uVar11 = 0;
      break;
    case 0x22:
switchD_00937ea8_caseD_22:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar15 = (undefined8 *)*param_3;
        *param_3 = (long)(puVar15 + 1);
      }
      *(undefined8 *)(param_1 + 0x520) = *puVar15;
      uVar11 = 0;
      break;
    case 0x29:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xffffffffe0000000 | uVar11 & 0xfffffff | (ulong)(*plVar16 != 0) << 0x1c;
      uVar11 = 0;
      break;
    case 0x2a:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xfffffffffe000000 | uVar11 & 0xffffff | (ulong)(*plVar16 != 0) << 0x18;
      uVar11 = 0;
      break;
    case 0x2b:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      lVar23 = *plVar16;
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xfffffffffff80000 | uVar11 & 0x3ffff | (ulong)(lVar23 != 0) << 0x12;
      uVar11 = 0;
      if (lVar23 == 0) {
        *(uint *)(param_1 + 0xadc) = *(uint *)(param_1 + 0xadc) & 0xffffffef;
      }
      else {
        *(uint *)(param_1 + 0xadc) = *(uint *)(param_1 + 0xadc) | 0x10;
      }
      break;
    case 0x2c:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      lVar23 = *plVar16;
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xfffffffff0000000 | uVar11 & 0x7ffffff | (ulong)(lVar23 != 0) << 0x1b;
      if (lVar23 == 0) {
        uVar11 = 0;
        if (*(char *)(param_1 + 0x529) == '\x05') goto LAB_0093e118;
      }
      else {
        *(undefined1 *)(param_1 + 0x529) = 5;
        uVar11 = 0;
      }
      break;
    case 0x2d:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xfffffffffff00000 | uVar11 & 0x7ffff | (ulong)(*plVar16 != 0) << 0x13;
      uVar11 = 0;
      break;
    case 0x2e:
    case 0x36:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        lVar23 = *(long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
        lVar23 = *plVar16;
      }
      if (lVar23 != 0) {
        uVar12 = 4;
LAB_00939020:
        *(undefined1 *)(param_1 + 0x529) = uVar12;
        goto LAB_00939348;
      }
      goto LAB_0093e118;
    case 0x2f:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        lVar23 = *(long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
        lVar23 = *plVar16;
      }
      if (lVar23 != 0) {
        uVar12 = 1;
        goto LAB_00939020;
      }
LAB_0093e118:
      *(undefined1 *)(param_1 + 0x529) = 0;
      uVar11 = 0;
      break;
    case 0x30:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xfffffffffffff000 | uVar11 & 0x7ff | (ulong)(*plVar16 != 0) << 0xb;
      uVar11 = 0;
      break;
    case 0x32:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xfffffffffffff800 | uVar11 & 0x3ff | (ulong)(*plVar16 != 0) << 10;
      uVar11 = 0;
      break;
    case 0x33:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      if (2 < *puVar21) goto LAB_0093ebac;
      *(char *)(param_1 + 0x731) = (char)*puVar21;
      uVar11 = 0;
      break;
    case 0x34:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xffffffffffc00000 | uVar11 & 0x1fffff | (ulong)(*plVar16 != 0) << 0x15;
      uVar11 = 0;
      break;
    case 0x35:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xfffffffffffffc00 | uVar11 & 0x1ff | (ulong)(*plVar16 != 0) << 9;
      uVar11 = 0;
      break;
    case 0x3a:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xfffffffff8000000 | uVar11 & 0x3ffffff | (ulong)(*plVar16 != 0) << 0x1a;
      uVar11 = 0;
      break;
    case 0x3b:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      if (*puVar21 >> 0x10 != 0) goto LAB_0093ebac;
      *(short *)(param_1 + 0x6c8) = (short)*puVar21;
      uVar11 = 0;
      break;
    case 0x3c:
switchD_00938088_caseD_75a8:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      lVar23 = *plVar16;
      if (lVar23 < -1) goto LAB_0093ebac;
      if ((*(long *)(param_1 + 0x218) < lVar23) &&
         (*(long *)(param_1 + 0x208) == *(long *)(param_1 + 0x980))) {
        (*(code *)PTR_free_00cc4678)();
        *(undefined8 *)(param_1 + 0x980) = 0;
        *(undefined8 *)(param_1 + 0x208) = 0;
      }
      *(long *)(param_1 + 0x218) = lVar23;
      uVar11 = 0;
      break;
    case 0x3d:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xfffffffffffffe00 | uVar11 & 0xff | (ulong)(*plVar16 != 0) << 8;
      uVar11 = 0;
      break;
    case 0x40:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      bVar13 = *(byte *)(param_1 + 0x5a9) & 0xfe | *plVar16 != 0;
      goto LAB_00939e18;
    case 0x44:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      if (*plVar16 < -1) goto LAB_0093ebac;
      *(long *)(param_1 + 0x200) = *plVar16;
      uVar11 = 0;
      break;
    case 0x45:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xffffffffffffff00 | uVar11 & 0x7f | (ulong)(*plVar16 != 0) << 7;
      uVar11 = 0;
      break;
    case 0x47:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      if (*puVar21 >> 0x20 != 0) goto LAB_0093ebac;
      *(int *)(param_1 + 0xa7c) = (int)*puVar21;
      uVar11 = 0;
      break;
    case 0x4a:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xffffffff80000000 | uVar11 & 0x3fffffff | (ulong)(*plVar16 != 0) << 0x1e;
      uVar11 = 0;
      break;
    case 0x4b:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xffffffffc0000000 | uVar11 & 0x1fffffff | (ulong)(*plVar16 != 0) << 0x1d;
      uVar11 = 0;
      break;
    case 0x4e:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      if (0x20c49b < *puVar21) goto LAB_0093ebac;
      *(int *)(param_1 + 0x2e4) = (int)*puVar21 * 1000;
      uVar11 = 0;
      break;
    case 0x50:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        lVar23 = *(long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
        lVar23 = *plVar16;
      }
      if (lVar23 == 0) goto LAB_0093e8c4;
      *(undefined1 *)(param_1 + 0x529) = 0;
LAB_00939348:
      *(ulong *)(param_1 + 0xa82) = *(ulong *)(param_1 + 0xa82) & 0xfffffffff7ffffff;
      uVar11 = 0;
      break;
    case 0x51:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      bVar13 = *(byte *)(param_1 + 0x5a9) & 0xfd | ((*puVar21 & 3) != 0) << 1;
      goto LAB_00939e18;
    case 0x54:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      uVar11 = *puVar21;
      if (2 < uVar11) {
        uVar4 = 0x2b;
        if (-1 < (long)uVar11) {
          uVar4 = 1;
        }
        uVar6 = (ulong)uVar4;
        goto switchD_00937ea8_caseD_ef;
      }
      *(char *)(param_1 + 0x52a) = (char)uVar11;
      uVar11 = 0;
      break;
    case 0x55:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xffffffffffffc000 | uVar11 & 0x1fff | (ulong)(*plVar16 != 0) << 0xd;
      uVar11 = 0;
      break;
    case 0x5a:
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x898));
      *(undefined8 *)(param_1 + 0x898) = 0;
      uVar11 = thunk_FUN_00970360(param_1);
      uVar11 = uVar11 & 0xffffffff;
      break;
    case 0x5b:
    case 0xe1:
      break;
    case 0x5c:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      lVar23 = *plVar16;
      if (lVar23 < -1) goto LAB_0093ebac;
      if (0x7ffffffe < lVar23) {
        lVar23 = 0x7fffffff;
      }
      *(int *)(param_1 + 0x6e0) = (int)lVar23;
      uVar11 = 0;
      break;
    case 0x60:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xffffffffffffffe0 | uVar11 & 0xf | (ulong)(*plVar16 != 0) << 4;
      uVar11 = 0;
      break;
    case 0x62:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      lVar23 = *plVar16;
      if (lVar23 < 0xa00001) {
        if (lVar23 < 1) {
          uVar14 = 0x4000;
        }
        else {
          uVar14 = (undefined4)lVar23;
          if (lVar23 < 0x401) {
            uVar14 = 0x400;
          }
        }
      }
      else {
        uVar14 = 0xa00000;
      }
      *(undefined4 *)(param_1 + 0x6e4) = uVar14;
      uVar11 = 0;
      break;
    case 99:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xffffffff00000000 | uVar11 & 0x7fffffff | (ulong)(*plVar16 != 0) << 0x1f;
      uVar11 = 0;
      break;
    case 0x65:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      if (7 < *puVar21) goto LAB_0093ebac;
      *(char *)(param_1 + 0x6ca) = (char)*puVar21;
      uVar11 = 0;
      break;
    case 0x69:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xffffffffff000000 | uVar11 & 0x7fffff | (ulong)(*plVar16 != 0) << 0x17;
      uVar11 = 0;
      break;
    case 0x6a:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xffffffffffff8000 | uVar11 & 0x3fff | (ulong)(*plVar16 != 0) << 0xe;
      uVar11 = 0;
      break;
    case 0x6b:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        uVar11 = *(ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
        uVar11 = *puVar21;
      }
      if (uVar11 == 0) {
        *(undefined8 *)(param_1 + 0x1f0) = 0;
        uVar11 = 0;
      }
      else {
        uVar6 = uVar11;
        if ((uVar11 & 0x10) != 0) {
          uVar6 = uVar11 & 0xffffffffffffffe9 | 2;
        }
        uVar19 = 0;
        *(byte *)(param_1 + 0xd68) =
             *(byte *)(param_1 + 0xd68) & 0xfb | (byte)(((uint)uVar11 & 0x10) >> 2);
        do {
          if (0x1e < uVar19) goto LAB_0093dedc;
          uVar11 = uVar19 & 0x3f;
          uVar19 = uVar19 + 1;
        } while ((1L << uVar11 & uVar6 & 0xfffffffffffffffb) == 0);
        *(ulong *)(param_1 + 0x1f0) = uVar6 & 0xfffffffffffffffb;
        uVar11 = 0;
      }
      break;
    case 0x6e:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      if (2 < *puVar21) goto LAB_0093df2c;
      *(char *)(param_1 + 0x730) = (char)*puVar21;
      uVar11 = 0;
      break;
    case 0x6f:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        uVar11 = *(ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
        uVar11 = *puVar21;
      }
      if (uVar11 == 0) {
        *(undefined8 *)(param_1 + 0x1f8) = 0;
        uVar11 = 0;
      }
      else {
        uVar6 = uVar11;
        if ((uVar11 & 0x10) != 0) {
          uVar6 = uVar11 & 0xffffffffffffffe9 | 2;
        }
        uVar19 = 0;
        *(byte *)(param_1 + 0xd88) =
             *(byte *)(param_1 + 0xd88) & 0xfb | (byte)(((uint)uVar11 & 0x10) >> 2);
        do {
          if (0x1e < uVar19) goto LAB_0093dedc;
          uVar11 = uVar19 & 0x3f;
          uVar19 = uVar19 + 1;
        } while ((1L << uVar11 & uVar6 & 0xfffffffffffffffb) == 0);
        *(ulong *)(param_1 + 0x1f8) = uVar6 & 0xfffffffffffffffb;
        uVar11 = 0;
      }
      break;
    case 0x70:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      if (0x20c49b < *puVar21) goto LAB_0093ebac;
      *(int *)(param_1 + 0x2ec) = (int)*puVar21 * 1000;
      uVar11 = 0;
      break;
    case 0x71:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      if (2 < *puVar21) goto LAB_0093ebac;
      *(char *)(param_1 + 0x700) = (char)*puVar21;
      uVar11 = 0;
      break;
    case 0x72:
switchD_00938088_caseD_75a5:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        lVar23 = *(long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
        lVar23 = *plVar16;
      }
      if (lVar23 < 0) goto LAB_0093ebac;
      *(long *)(param_1 + 0x708) = lVar23;
      uVar11 = 0;
      break;
    case 0x77:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      if (3 < *puVar21) goto LAB_0093ebac;
      *(char *)(param_1 + 0xa80) = (char)*puVar21;
      uVar11 = 0;
      break;
    case 0x79:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xfffffffe00000000 | uVar11 & 0xffffffff | (ulong)(*plVar16 != 0) << 0x20;
      uVar11 = 0;
      break;
    case 0x81:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      if (2 < *puVar21) goto LAB_0093ebac;
      *(char *)(param_1 + 0x711) = (char)*puVar21;
      uVar11 = 0;
      break;
    case 0x88:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xfffffffc00000000 | uVar11 & 0x1ffffffff | (ulong)(*plVar16 != 0) << 0x21;
      uVar11 = 0;
      break;
    case 0x89:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xfffffffffffe0000 | uVar11 & 0xffff | (ulong)(*plVar16 != 0) << 0x10;
      uVar11 = 0;
      break;
    case 0x8a:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      if (3 < *puVar21) goto LAB_0093ebac;
      *(char *)(param_1 + 0x710) = (char)*puVar21;
      uVar11 = 0;
      break;
    case 0x8b:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      if (*puVar21 >> 0x10 != 0) goto LAB_0093ebac;
      uVar3 = FUN_00963a70();
      *(undefined2 *)(param_1 + 0x220) = uVar3;
      uVar11 = 0;
      break;
    case 0x8c:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      if (*puVar21 >> 0x10 != 0) goto LAB_0093ebac;
      uVar3 = FUN_00963a70();
      *(undefined2 *)(param_1 + 0x222) = uVar3;
      uVar11 = 0;
      break;
    case 0x8d:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      if (2 < *plVar16) goto LAB_0093ebac;
      *(char *)(param_1 + 0xa81) = (char)*plVar16;
      uVar11 = 0;
      break;
    case 0x96:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      bVar13 = (*plVar16 != 0) << 3;
      *(byte *)(param_1 + 0x5a9) = bVar13 | *(byte *)(param_1 + 0x5a9) & 0xf7;
      *(byte *)(param_1 + 0x671) = *(byte *)(param_1 + 0x671) & 0xf7 | bVar13;
      uVar11 = 0;
      break;
    case 0x9a:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      if (2 < *puVar21) goto LAB_0093ebac;
      *(char *)(param_1 + 0x712) = (char)*puVar21;
      uVar11 = 0;
      break;
    case 0x9b:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      uVar11 = *puVar21;
      if (0xfffffffe < uVar11) {
        uVar11 = 0xffffffff;
      }
      *(int *)(param_1 + 0x2e0) = (int)uVar11;
      uVar11 = 0;
      break;
    case 0x9c:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      uVar11 = *puVar21;
      if (0xfffffffe < uVar11) {
        uVar11 = 0xffffffff;
      }
      *(int *)(param_1 + 0x2e4) = (int)uVar11;
      uVar11 = 0;
      break;
    case 0x9d:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xfffffff800000000 | uVar11 & 0x3ffffffff | (ulong)(*plVar16 == 0) << 0x22;
      uVar11 = 0;
      break;
    case 0x9e:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xfffffff000000000 | uVar11 & 0x7ffffffff | (ulong)(*plVar16 == 0) << 0x23;
      uVar11 = 0;
      break;
    case 0x9f:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      if (0x1ff < *puVar21) goto LAB_0093ebac;
      *(int *)(param_1 + 0x734) = (int)*puVar21;
      uVar11 = 0;
      break;
    case 0xa1:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        lVar23 = *(long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
        lVar23 = *plVar16;
      }
      if (lVar23 < 0) goto LAB_0093ebac;
      *(byte *)(param_1 + 0xa68) = (byte)lVar23 & 7;
      uVar11 = 0;
      break;
    case 0xa6:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      if (*plVar16 == 1) {
        *(ulong *)(param_1 + 0xa82) = *(ulong *)(param_1 + 0xa82) | 0x1000000000;
        uVar11 = 0;
      }
      else {
        if (*plVar16 != 0) goto LAB_0093df2c;
        *(ulong *)(param_1 + 0xa82) = *(ulong *)(param_1 + 0xa82) & 0xffffffefffffffff;
        uVar11 = 0;
      }
      break;
    case 0xab:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      if (*puVar21 >> 0x20 != 0) goto LAB_0093ebac;
      *(int *)(param_1 + 0x9c8) = (int)*puVar21;
      uVar11 = 0;
      break;
    case 0xac:
      uVar11 = FUN_0096a5f4(param_1,2);
      if ((uVar11 & 1) == 0) {
LAB_0093d99c:
        uVar11 = 4;
      }
      else {
        iVar5 = (int)param_3[3];
        if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
          plVar16 = (long *)(param_3[1] + (long)iVar5);
        }
        else {
          plVar16 = (long *)*param_3;
          *param_3 = (long)(plVar16 + 1);
        }
        *(byte *)(param_1 + 0x5f0) = *(byte *)(param_1 + 0x5f0) & 0xfe | *plVar16 != 0;
        uVar11 = 0;
      }
      break;
    case 0xb2:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      if (0xffb0 < *plVar16 - 8U) goto LAB_0093ebac;
      *(long *)(param_1 + 0x308) = *plVar16;
      uVar11 = 0;
      break;
    case 0xb5:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar15 = (undefined8 *)*param_3;
        *param_3 = (long)(puVar15 + 1);
      }
      *(int *)(param_1 + 0x9cc) = (int)*puVar15;
      uVar11 = 0;
      break;
    case 0xb6:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar15 = (undefined8 *)*param_3;
        *param_3 = (long)(puVar15 + 1);
      }
      *(int *)(param_1 + 0x9d0) = (int)*puVar15;
      uVar11 = 0;
      break;
    case 0xbc:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xffffffffffff0000 | uVar11 & 0x7fff | (ulong)(*plVar16 != 0) << 0xf;
      uVar11 = 0;
      break;
    case 0xbd:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      iVar5 = 0;
      if (*plVar16 - 1U < 0xb) {
        iVar5 = (int)(*plVar16 - 1U) + 1;
      }
      *(int *)(param_1 + 0x9e0) = iVar5;
      uVar11 = 0;
      break;
    case 0xc1:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar15 = (undefined8 *)*param_3;
        *param_3 = (long)(puVar15 + 1);
      }
      *(undefined8 *)(param_1 + 0x1120) = *puVar15;
      uVar11 = 0;
      break;
    case 0xc2:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar15 = (undefined8 *)*param_3;
        *param_3 = (long)(puVar15 + 1);
      }
      *(undefined8 *)(param_1 + 0x1128) = *puVar15;
      uVar11 = 0;
      break;
    case 0xc5:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xfffffffffffc0000 | uVar11 & 0x1ffff | (ulong)(*plVar16 != 0) << 0x11;
      uVar11 = 0;
      break;
    case 0xcf:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xffffffffff800000 | uVar11 & 0x3fffff | (ulong)(*plVar16 != 0) << 0x16;
      uVar11 = 0;
      break;
    case 0xd2:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        pbVar18 = (byte *)(param_3[1] + (long)iVar5);
      }
      else {
        pbVar18 = (byte *)*param_3;
        *param_3 = (long)(pbVar18 + 8);
      }
      *(byte *)(param_1 + 0xa10) = *pbVar18 & 3;
      uVar11 = 0;
      break;
    case 0xd4:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      uVar11 = *puVar21;
      if (0xfffffffe < uVar11) {
        uVar11 = 0xffffffff;
      }
      *(int *)(param_1 + 0x714) = (int)uVar11;
      uVar11 = 0;
      break;
    case 0xd5:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xffffff8000000000 | uVar11 & 0x3fffffffff | (ulong)(*plVar16 != 0) << 0x26;
      uVar11 = 0;
      break;
    case 0xd6:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        lVar23 = *(long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
        lVar23 = *plVar16;
      }
      if (lVar23 < 0) goto LAB_0093ebac;
      if (0x7ffffffe < lVar23) {
        lVar23 = 0x7fffffff;
      }
      *(int *)(param_1 + 0xa14) = (int)lVar23;
      uVar11 = 0;
      break;
    case 0xd7:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        lVar23 = *(long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
        lVar23 = *plVar16;
      }
      if (lVar23 < 0) goto LAB_0093ebac;
      if (0x7ffffffe < lVar23) {
        lVar23 = 0x7fffffff;
      }
      *(int *)(param_1 + 0xa18) = (int)lVar23;
      uVar11 = 0;
      break;
    case 0xd8:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar20 = (uint *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar20 = (uint *)*param_3;
        *param_3 = (long)(puVar20 + 2);
      }
      uVar4 = *puVar20;
      *(char *)(param_1 + 0x5a0) = (char)uVar4;
      *(byte *)(param_1 + 0x5f0) =
           (byte)((uVar4 & 0x3fffffe0) << 2) |
           *(byte *)(param_1 + 0x5f0) & 3 | (byte)((uVar4 & 1) << 2) | (byte)((uVar4 >> 1 & 1) << 3)
           | (byte)((uVar4 >> 2 & 1) << 4) | (byte)((uVar4 >> 3 & 1) << 5) |
           (byte)((uVar4 >> 4 & 1) << 6);
      uVar11 = 0;
      break;
    case 0xda:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xffffffc000000000 | uVar11 & 0x1fffffffff | (ulong)(*plVar16 != 0) << 0x25;
      uVar11 = 0;
      break;
    case 0xe2:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xfffffe0000000000 | uVar11 & 0xffffffffff | (ulong)(*plVar16 != 0) << 0x28;
      uVar11 = 0;
      break;
    case 0xe3:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        lVar23 = *(long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
        lVar23 = *plVar16;
      }
      if (lVar23 < 0) goto LAB_0093ebac;
      *(long *)(param_1 + 0xa20) = lVar23;
      uVar11 = 0;
      break;
    case 0xe5:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) = uVar11 & 0xfffffffffffffff0 | uVar11 & 7 | (*puVar21 & 1) << 3;
      uVar11 = 0;
      break;
    case 0xe8:
      uVar11 = thunk_FUN_009700bc(4);
      if ((uVar11 & 1) == 0) goto LAB_0093d99c;
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      bVar13 = *(byte *)(param_1 + 0x5a9) & 0xfb | (*plVar16 != 0) << 2;
LAB_00939e18:
      uVar22 = 0;
      *(byte *)(param_1 + 0x5a9) = bVar13;
LAB_00939e24:
      FUN_00968260(param_1,uVar22);
      uVar11 = 0;
      break;
    case 0xe9:
      uVar11 = thunk_FUN_009695d0(param_1);
      if ((uVar11 & 1) == 0) goto LAB_0093d99c;
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      *(byte *)(param_1 + 0x5f0) = *(byte *)(param_1 + 0x5f0) & 0xfd | (*plVar16 != 0) << 1;
      uVar11 = 0;
      break;
    case 0xea:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xfffffc0000000000 | uVar11 & 0x1ffffffffff | (ulong)(*plVar16 != 0) << 0x29;
      uVar11 = 0;
      break;
    case 0xed:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xfffff80000000000 | uVar11 & 0x3ffffffffff | (ulong)(*plVar16 != 0) << 0x2a;
      uVar11 = 0;
      break;
    case 0xef:
      goto switchD_00937ea8_caseD_ef;
    case 0xf2:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xfffffffffffffff8 | uVar11 & 3 | (ulong)(*plVar16 != 0) << 2;
      uVar11 = 0;
      break;
    case 0xf4:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xffffff0000000000 | uVar11 & 0x7fffffffff | (ulong)(*plVar16 != 0) << 0x27;
      uVar11 = 0;
      break;
    case 0xf5:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xffffffffffe00000 | uVar11 & 0xfffff | (ulong)(*plVar16 != 0) << 0x14;
      uVar11 = 0;
      break;
    case 0xf8:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      bVar13 = *(byte *)(param_1 + 0x671) & 0xfe | *plVar16 != 0;
      goto LAB_00939b88;
    case 0xf9:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      bVar13 = *(byte *)(param_1 + 0x671) & 0xfd | ((*puVar21 & 3) != 0) << 1;
LAB_00939b88:
      *(byte *)(param_1 + 0x671) = bVar13;
      uVar22 = 1;
      goto LAB_00939e24;
    case 0x105:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar20 = (uint *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar20 = (uint *)*param_3;
        *param_3 = (long)(puVar20 + 2);
      }
      uVar4 = *puVar20;
      *(char *)(param_1 + 0x668) = (char)uVar4;
      *(byte *)(param_1 + 0x6b8) =
           (byte)((uVar4 & 0x3fffffe0) << 2) |
           *(byte *)(param_1 + 0x6b8) & 3 | (byte)((uVar4 & 1) << 2) | (byte)((uVar4 >> 1 & 1) << 3)
           | (byte)((uVar4 >> 2 & 1) << 4) | (byte)((uVar4 >> 3 & 1) << 5) |
           (byte)((uVar4 >> 4 & 1) << 6);
      uVar11 = 0;
      break;
    case 0x109:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xfffff00000000000 | uVar11 & 0x7ffffffffff | (ulong)(*plVar16 != 0) << 0x2b;
      uVar11 = 0;
      break;
    case 0x10b:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      uVar11 = *puVar21;
      *(char *)(param_1 + 0x6cb) = (char)uVar11;
      uVar4 = 0;
      if ((uVar11 & 0xfa) != 0) {
        uVar4 = 4;
      }
      uVar11 = (ulong)uVar4;
      break;
    case 0x10f:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      uVar11 = *puVar21;
      if (0xfffffffe < uVar11) {
        uVar11 = 0xffffffff;
      }
      *(int *)(param_1 + 0x2e8) = (int)uVar11;
      uVar11 = 0;
      break;
    case 0x112:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xffffc00000000000 | uVar11 & 0x1fffffffffff | (ulong)(*plVar16 != 0) << 0x2d;
      uVar11 = 0;
      break;
    case 0x113:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xffffe00000000000 | uVar11 & 0xfffffffffff | (ulong)(*plVar16 != 0) << 0x2c;
      uVar11 = 0;
      break;
    case 0x116:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xffff000000000000 | uVar11 & 0x7fffffffffff | (ulong)(*plVar16 != 0) << 0x2f;
      uVar11 = 0;
      break;
    case 0x118:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      lVar23 = *plVar16;
      if (lVar23 < 0x4001) {
        lVar23 = 0x4000;
      }
      if (0x1fffff < lVar23) {
        lVar23 = 0x200000;
      }
      *(int *)(param_1 + 0x6e8) = (int)lVar23;
      uVar11 = 0;
      break;
    case 0x119:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        lVar23 = *(long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
        lVar23 = *plVar16;
      }
      if (lVar23 < 0) goto LAB_0093ebac;
      *(long *)(param_1 + 0xa38) = lVar23;
      uVar11 = 0;
      break;
    case 0x11d:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      if (1 < *plVar16) goto LAB_0093ebac;
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xffe0000000000000 | uVar11 & 0xfffffffffffff | (ulong)(*plVar16 != 0) << 0x34;
      uVar11 = 0;
      break;
    case 0x11e:
      if (*(long *)(param_1 + 0xaa0) == 0) {
        lVar23 = FUN_00903270();
        *(long *)(param_1 + 0xaa0) = lVar23;
        if (lVar23 == 0) goto LAB_0093d8c4;
      }
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        lVar23 = *(long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
        lVar23 = *plVar16;
      }
      if (lVar23 != 0) {
        uVar6 = FUN_00903544(*(undefined8 *)(param_1 + 0xaa0));
        if ((int)uVar6 != 0) goto switchD_00937ea8_caseD_ef;
        goto LAB_0093eb04;
      }
LAB_0093ebac:
      uVar6 = 0x2b;
      goto switchD_00937ea8_caseD_ef;
    case 0x120:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        lVar23 = *(long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
        lVar23 = *plVar16;
      }
      if (lVar23 < 0) goto LAB_0093ebac;
      *(long *)(param_1 + 0x2f8) = lVar23;
      uVar11 = 0;
      break;
    case 0x122:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      *(byte *)(param_1 + 0xa78) = *(byte *)(param_1 + 0xa78) & 0xfe | *plVar16 != 0;
      uVar11 = 0;
      break;
    case 299:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        pbVar18 = (byte *)(param_3[1] + (long)iVar5);
      }
      else {
        pbVar18 = (byte *)*param_3;
        *param_3 = (long)(pbVar18 + 8);
      }
      if ((*pbVar18 & 1) == 0) {
LAB_0093ebe8:
        FUN_0091839c(param_1 + 0xa98);
        uVar11 = 0;
      }
      else {
        uVar11 = 0;
        if (*(long *)(param_1 + 0xa98) == 0) {
          lVar23 = FUN_00918354();
          *(long *)(param_1 + 0xa98) = lVar23;
          uVar11 = 0;
          if (lVar23 == 0) goto LAB_0093d8c4;
        }
      }
      break;
    case 0x132:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xfffc000000000000 | uVar11 & 0x1ffffffffffff | (ulong)(*plVar16 != 0) << 0x31;
      uVar11 = 0;
      break;
    case 0x133:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xfff8000000000000 |
           uVar11 & 0x3ffffffffffff | (ulong)((*puVar21 & 3) != 0) << 0x32;
      uVar11 = 0;
      break;
    case 0x134:
      uVar11 = thunk_FUN_009700bc(4);
      if ((uVar11 & 1) == 0) goto LAB_0093d99c;
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xfff0000000000000 | uVar11 & 0x7ffffffffffff | (ulong)(*plVar16 != 0) << 0x33;
      uVar11 = 0;
      break;
    case 0x13a:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        lVar23 = *(long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
        lVar23 = *plVar16;
      }
      if (lVar23 < 0) goto LAB_0093ebac;
      *(long *)(param_1 + 0x300) = lVar23;
      uVar11 = 0;
      break;
    case 0x13b:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      *(ulong *)(param_1 + 0xa82) = *(ulong *)(param_1 + 0xa82) & 0xfffffffffffffffe | *puVar21 & 1;
      uVar11 = 0;
      break;
    case 0x141:
      uVar11 = FUN_0096a5f4(param_1,0x100);
      if ((uVar11 & 1) == 0) goto LAB_0093dedc;
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      lVar23 = *plVar16;
      if (lVar23 < -1) goto LAB_0093ebac;
      if (0x7ffffffe < lVar23) {
        lVar23 = 0x7fffffff;
      }
      *(int *)(param_1 + 0x6d8) = (int)lVar23;
      uVar11 = 0;
      break;
    case 0x142:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      uVar11 = *(ulong *)(param_1 + 0xa82);
      *(ulong *)(param_1 + 0xa82) =
           uVar11 & 0xffffffffffffff80 | uVar11 & 0x3f | (ulong)(*plVar16 != 0) << 6;
      uVar11 = 0;
      break;
    case 0x144:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar21 = (ulong *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar21 = (ulong *)*param_3;
        *param_3 = (long)(puVar21 + 1);
      }
      if (*puVar21 >> 0x1f != 0) goto LAB_0093ebac;
      *(int *)(param_1 + 0x2ec) = (int)*puVar21;
      uVar11 = 0;
      break;
    case 0x146:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        lVar23 = *(long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
        lVar23 = *plVar16;
      }
      if (lVar23 < 0) goto LAB_0093ebac;
      if (0x7ffffffe < lVar23) {
        lVar23 = 0x7fffffff;
      }
      *(int *)(param_1 + 0xa1c) = (int)lVar23;
      uVar11 = 0;
    }
    goto switchD_00937e08_caseD_275c;
  }
  if (0x4e57 < param_2) {
    if (param_2 < 0x75a3) {
      if (param_2 < 0x4e8c) {
        if (param_2 == 0x4e58) {
          iVar5 = (int)param_3[3];
          if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
            plVar16 = (long *)(param_3[1] + (long)iVar5);
          }
          else {
            plVar16 = (long *)*param_3;
            *param_3 = (long)(plVar16 + 1);
          }
          lVar23 = *plVar16;
          bVar13 = *(byte *)(param_1 + 0xc34);
          *(long *)(param_1 + 0x248) = lVar23;
          goto joined_r0x0093db80;
        }
        if (param_2 == 0x4e6f) {
          iVar5 = (int)param_3[3];
          if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
            puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
          }
          else {
            puVar15 = (undefined8 *)*param_3;
            *param_3 = (long)(puVar15 + 1);
          }
          *(undefined8 *)(param_1 + 0x230) = *puVar15;
          uVar11 = 0;
        }
        else {
          if (param_2 != 0x4e7e) goto switchD_00937e08_caseD_2713;
          iVar5 = (int)param_3[3];
          if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
            puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
          }
          else {
            puVar15 = (undefined8 *)*param_3;
            *param_3 = (long)(puVar15 + 1);
          }
          *(undefined8 *)(param_1 + 600) = *puVar15;
          uVar11 = 0;
        }
      }
      else {
        switch(param_2) {
        case 0x4ea2:
          iVar5 = (int)param_3[3];
          if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
            puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
          }
          else {
            puVar15 = (undefined8 *)*param_3;
            *param_3 = (long)(puVar15 + 1);
          }
          *(undefined8 *)(param_1 + 0x260) = *puVar15;
          uVar11 = 0;
          break;
        case 0x4ea3:
        case 0x4ea4:
        case 0x4ea5:
        case 0x4ea6:
        case 0x4ea7:
        case 0x4ea8:
        case 0x4ea9:
        case 0x4eaa:
        case 0x4eab:
        case 0x4eac:
        case 0x4ead:
        case 0x4eae:
        case 0x4eaf:
        case 0x4eb0:
        case 0x4eb1:
        case 0x4eb2:
        case 0x4eb3:
        case 0x4eb5:
        case 0x4eb6:
        case 0x4eb7:
        case 0x4eb8:
        case 0x4eb9:
        case 0x4eba:
        case 0x4ebb:
        case 0x4ebc:
        case 0x4ebd:
        case 0x4ebe:
        case 0x4ebf:
        case 0x4ec0:
        case 0x4ec1:
        case 0x4ec2:
        case 0x4ec4:
        case 0x4ec5:
        case 0x4ec6:
        case 0x4ec8:
        case 0x4ec9:
        case 0x4eca:
        case 0x4ecb:
        case 0x4ecc:
        case 0x4ecd:
        case 0x4ece:
        case 0x4ecf:
        case 0x4ed0:
        case 0x4ed1:
        case 0x4ed2:
        case 0x4ed3:
        case 0x4ed4:
        case 0x4ed5:
        case 0x4ed6:
        case 0x4ed7:
        case 0x4ed8:
        case 0x4ed9:
        case 0x4eda:
        case 0x4edb:
        case 0x4edc:
        case 0x4edd:
        case 0x4ede:
        case 0x4edf:
        case 0x4ee0:
        case 0x4ee1:
        case 0x4ee2:
        case 0x4ee3:
        case 0x4ee5:
        case 0x4ee9:
        case 0x4eea:
        case 0x4eeb:
        case 0x4eec:
        case 0x4eed:
        case 0x4eee:
        case 0x4eef:
        case 0x4ef1:
        case 0x4ef2:
        case 0x4ef3:
        case 0x4ef4:
        case 0x4ef5:
        case 0x4ef6:
        case 0x4ef7:
        case 0x4ef8:
        case 0x4ef9:
        case 0x4efa:
          goto switchD_00937e08_caseD_2713;
        case 0x4eb4:
          iVar5 = (int)param_3[3];
          if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
            puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
          }
          else {
            puVar15 = (undefined8 *)*param_3;
            *param_3 = (long)(puVar15 + 1);
          }
          *(undefined8 *)(param_1 + 0x268) = *puVar15;
          uVar11 = 0;
          break;
        case 0x4ec3:
          iVar5 = (int)param_3[3];
          if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
            puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
          }
          else {
            puVar15 = (undefined8 *)*param_3;
            *param_3 = (long)(puVar15 + 1);
          }
          *(undefined8 *)(param_1 + 0x278) = *puVar15;
          uVar11 = 0;
          break;
        case 0x4ec7:
          iVar5 = (int)param_3[3];
          if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
            puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
          }
          else {
            puVar15 = (undefined8 *)*param_3;
            *param_3 = (long)(puVar15 + 1);
          }
          *(undefined8 *)(param_1 + 0x210) = *puVar15;
          uVar11 = 0;
          break;
        case 0x4ee4:
          iVar5 = (int)param_3[3];
          if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
            puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
          }
          else {
            puVar15 = (undefined8 *)*param_3;
            *param_3 = (long)(puVar15 + 1);
          }
          *(undefined8 *)(param_1 + 0x238) = *puVar15;
          uVar11 = 0;
          break;
        case 0x4ee6:
          iVar5 = (int)param_3[3];
          if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
            puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
          }
          else {
            puVar15 = (undefined8 *)*param_3;
            *param_3 = (long)(puVar15 + 1);
          }
          *(undefined8 *)(param_1 + 0x9e8) = *puVar15;
          uVar11 = 0;
          break;
        case 0x4ee7:
          iVar5 = (int)param_3[3];
          if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
            puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
          }
          else {
            puVar15 = (undefined8 *)*param_3;
            *param_3 = (long)(puVar15 + 1);
          }
          *(undefined8 *)(param_1 + 0x9f0) = *puVar15;
          uVar11 = 0;
          break;
        case 0x4ee8:
          iVar5 = (int)param_3[3];
          if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
            puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
          }
          else {
            puVar15 = (undefined8 *)*param_3;
            *param_3 = (long)(puVar15 + 1);
          }
          *(undefined8 *)(param_1 + 0x9f8) = *puVar15;
          uVar11 = 0;
          break;
        case 0x4ef0:
          iVar5 = (int)param_3[3];
          if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
            puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
          }
          else {
            puVar15 = (undefined8 *)*param_3;
            *param_3 = (long)(puVar15 + 1);
          }
          *(undefined8 *)(param_1 + 0x288) = *puVar15;
          uVar11 = 0;
          break;
        case 0x4efb:
          iVar5 = (int)param_3[3];
          if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
            plVar16 = (long *)(param_3[1] + (long)iVar5);
          }
          else {
            plVar16 = (long *)*param_3;
            *param_3 = (long)(plVar16 + 1);
          }
          lVar23 = *plVar16;
          bVar13 = *(byte *)(param_1 + 0xc34);
          *(long *)(param_1 + 0x250) = lVar23;
joined_r0x0093db80:
          if (lVar23 == 0) {
            *(byte *)(param_1 + 0xc34) = bVar13 & 0xfe;
            uVar11 = 0;
          }
          else {
            *(byte *)(param_1 + 0xc34) = bVar13 | 1;
            uVar11 = 0;
          }
          break;
        default:
          switch(param_2) {
          case 0x4f30:
            iVar5 = (int)param_3[3];
            if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
              puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
            }
            else {
              puVar15 = (undefined8 *)*param_3;
              *param_3 = (long)(puVar15 + 1);
            }
            *(undefined8 *)(param_1 + 0xa28) = *puVar15;
            uVar11 = 0;
            break;
          case 0x4f31:
          case 0x4f32:
          case 0x4f33:
          case 0x4f34:
          case 0x4f35:
          case 0x4f36:
          case 0x4f37:
          case 0x4f38:
          case 0x4f39:
          case 0x4f3a:
          case 0x4f3c:
          case 0x4f3d:
          case 0x4f3e:
          case 0x4f3f:
          case 0x4f40:
          case 0x4f41:
          case 0x4f42:
          case 0x4f43:
          case 0x4f44:
          case 0x4f45:
          case 0x4f46:
          case 0x4f47:
          case 0x4f48:
          case 0x4f49:
          case 0x4f4a:
          case 0x4f4b:
          case 0x4f4c:
          case 0x4f4e:
          case 0x4f50:
          case 0x4f51:
          case 0x4f52:
          case 0x4f53:
          case 0x4f54:
          case 0x4f55:
          case 0x4f56:
          case 0x4f57:
            goto switchD_00937e08_caseD_2713;
          case 0x4f3b:
            iVar5 = (int)param_3[3];
            if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
              puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
            }
            else {
              puVar15 = (undefined8 *)*param_3;
              *param_3 = (long)(puVar15 + 1);
            }
            *(undefined8 *)(param_1 + 0xa60) = *puVar15;
            uVar11 = 0;
            break;
          case 0x4f4d:
            iVar5 = (int)param_3[3];
            if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
              puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
            }
            else {
              puVar15 = (undefined8 *)*param_3;
              *param_3 = (long)(puVar15 + 1);
            }
            *(undefined8 *)(param_1 + 0x2b0) = *puVar15;
            uVar11 = 0;
            break;
          case 0x4f4f:
            iVar5 = (int)param_3[3];
            if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
              puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
            }
            else {
              puVar15 = (undefined8 *)*param_3;
              *param_3 = (long)(puVar15 + 1);
            }
            *(undefined8 *)(param_1 + 0x2c0) = *puVar15;
            uVar11 = 0;
            break;
          case 0x4f58:
            iVar5 = (int)param_3[3];
            if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
              puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
            }
            else {
              puVar15 = (undefined8 *)*param_3;
              *param_3 = (long)(puVar15 + 1);
            }
            *(undefined8 *)(param_1 + 0x298) = *puVar15;
            uVar11 = 0;
            break;
          default:
            if (param_2 != 0x4e8c) goto switchD_00937e08_caseD_2713;
            uVar11 = FUN_0096a5f4(param_1,8);
            if ((uVar11 & 1) == 0) goto LAB_0093d99c;
            iVar5 = (int)param_3[3];
            if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
              puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
            }
            else {
              puVar15 = (undefined8 *)*param_3;
              *param_3 = (long)(puVar15 + 1);
            }
            *(undefined8 *)(param_1 + 0x5b8) = *puVar15;
            uVar11 = 0;
          }
        }
      }
    }
    else {
      switch(param_2) {
      case 0x9d63:
        iVar5 = (int)param_3[3];
        if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
          puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
        }
        else {
          puVar15 = (undefined8 *)*param_3;
          *param_3 = (long)(puVar15 + 1);
        }
        puVar15 = (undefined8 *)*puVar15;
        (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x988));
        *(undefined8 *)(param_1 + 0x988) = 0;
        uVar11 = 0;
        if (puVar15 != (undefined8 *)0x0) {
          if (&fde_table_entry_007a1200 < (fde_table_entry *)puVar15[1]) goto LAB_0093df2c;
          pfVar8 = (fde_table_entry *)0x18;
          if ((*(uint *)(puVar15 + 2) & 1) != 0) {
            pfVar8 = (fde_table_entry *)puVar15[1] + 3;
          }
          puVar7 = (undefined8 *)(*(code *)PTR_malloc_00cc4670)(pfVar8);
          if (puVar7 == (undefined8 *)0x0) goto LAB_0093d6ec;
          puVar7[2] = puVar15[2];
          uVar22 = *puVar15;
          puVar7[1] = puVar15[1];
          *puVar7 = uVar22;
          if ((*(byte *)(puVar15 + 2) & 1) != 0) {
            *puVar7 = puVar7 + 3;
            memcpy(puVar7 + 3,(void *)*puVar15,puVar15[1]);
          }
          *(undefined8 **)(param_1 + 0x988) = puVar7;
          uVar11 = 0;
        }
        break;
      case 0x9d64:
        iVar5 = (int)param_3[3];
        if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
          puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
        }
        else {
          puVar15 = (undefined8 *)*param_3;
          *param_3 = (long)(puVar15 + 1);
        }
        puVar15 = (undefined8 *)*puVar15;
        (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x990));
        *(undefined8 *)(param_1 + 0x990) = 0;
        uVar11 = 0;
        if (puVar15 != (undefined8 *)0x0) {
          if (&fde_table_entry_007a1200 < (fde_table_entry *)puVar15[1]) goto LAB_0093df2c;
          pfVar8 = (fde_table_entry *)0x18;
          if ((*(uint *)(puVar15 + 2) & 1) != 0) {
            pfVar8 = (fde_table_entry *)puVar15[1] + 3;
          }
          puVar7 = (undefined8 *)(*(code *)PTR_malloc_00cc4670)(pfVar8);
          if (puVar7 == (undefined8 *)0x0) goto LAB_0093d6ec;
          puVar7[2] = puVar15[2];
          uVar22 = *puVar15;
          puVar7[1] = puVar15[1];
          *puVar7 = uVar22;
          if ((*(byte *)(puVar15 + 2) & 1) != 0) {
            *puVar7 = puVar7 + 3;
            memcpy(puVar7 + 3,(void *)*puVar15,puVar15[1]);
          }
          *(undefined8 **)(param_1 + 0x990) = puVar7;
          uVar11 = 0;
        }
        break;
      case 0x9d65:
        iVar5 = (int)param_3[3];
        if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
          puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
        }
        else {
          puVar15 = (undefined8 *)*param_3;
          *param_3 = (long)(puVar15 + 1);
        }
        puVar15 = (undefined8 *)*puVar15;
        (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x9a8));
        *(undefined8 *)(param_1 + 0x9a8) = 0;
        uVar11 = 0;
        if (puVar15 != (undefined8 *)0x0) {
          if (&fde_table_entry_007a1200 < (fde_table_entry *)puVar15[1]) goto LAB_0093df2c;
          pfVar8 = (fde_table_entry *)0x18;
          if ((*(uint *)(puVar15 + 2) & 1) != 0) {
            pfVar8 = (fde_table_entry *)puVar15[1] + 3;
          }
          puVar7 = (undefined8 *)(*(code *)PTR_malloc_00cc4670)(pfVar8);
          if (puVar7 == (undefined8 *)0x0) goto LAB_0093d6ec;
          puVar7[2] = puVar15[2];
          uVar22 = *puVar15;
          puVar7[1] = puVar15[1];
          *puVar7 = uVar22;
          if ((*(byte *)(puVar15 + 2) & 1) != 0) {
            *puVar7 = puVar7 + 3;
            memcpy(puVar7 + 3,(void *)*puVar15,puVar15[1]);
          }
          *(undefined8 **)(param_1 + 0x9a8) = puVar7;
          uVar11 = 0;
        }
        break;
      case 0x9d66:
        iVar5 = (int)param_3[3];
        if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
          puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
        }
        else {
          puVar15 = (undefined8 *)*param_3;
          *param_3 = (long)(puVar15 + 1);
        }
        puVar15 = (undefined8 *)*puVar15;
        (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x9b0));
        *(undefined8 *)(param_1 + 0x9b0) = 0;
        uVar11 = 0;
        if (puVar15 != (undefined8 *)0x0) {
          if (&fde_table_entry_007a1200 < (fde_table_entry *)puVar15[1]) goto LAB_0093df2c;
          pfVar8 = (fde_table_entry *)0x18;
          if ((*(uint *)(puVar15 + 2) & 1) != 0) {
            pfVar8 = (fde_table_entry *)puVar15[1] + 3;
          }
          puVar7 = (undefined8 *)(*(code *)PTR_malloc_00cc4670)(pfVar8);
          if (puVar7 == (undefined8 *)0x0) goto LAB_0093d6ec;
          puVar7[2] = puVar15[2];
          uVar22 = *puVar15;
          puVar7[1] = puVar15[1];
          *puVar7 = uVar22;
          if ((*(byte *)(puVar15 + 2) & 1) != 0) {
            *puVar7 = puVar7 + 3;
            memcpy(puVar7 + 3,(void *)*puVar15,puVar15[1]);
          }
          *(undefined8 **)(param_1 + 0x9b0) = puVar7;
          uVar11 = 0;
        }
        break;
      case 0x9d67:
        iVar5 = (int)param_3[3];
        if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
          puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
        }
        else {
          puVar15 = (undefined8 *)*param_3;
          *param_3 = (long)(puVar15 + 1);
        }
        puVar15 = (undefined8 *)*puVar15;
        (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x998));
        *(undefined8 *)(param_1 + 0x998) = 0;
        uVar11 = 0;
        if (puVar15 != (undefined8 *)0x0) {
          if (&fde_table_entry_007a1200 < (fde_table_entry *)puVar15[1]) goto LAB_0093df2c;
          pfVar8 = (fde_table_entry *)0x18;
          if ((*(uint *)(puVar15 + 2) & 1) != 0) {
            pfVar8 = (fde_table_entry *)puVar15[1] + 3;
          }
          puVar7 = (undefined8 *)(*(code *)PTR_malloc_00cc4670)(pfVar8);
          if (puVar7 == (undefined8 *)0x0) goto LAB_0093d6ec;
          puVar7[2] = puVar15[2];
          uVar22 = *puVar15;
          puVar7[1] = puVar15[1];
          *puVar7 = uVar22;
          if ((*(byte *)(puVar15 + 2) & 1) != 0) {
            *puVar7 = puVar7 + 3;
            memcpy(puVar7 + 3,(void *)*puVar15,puVar15[1]);
          }
          *(undefined8 **)(param_1 + 0x998) = puVar7;
          uVar11 = 0;
        }
        break;
      case 0x9d68:
      case 0x9d6a:
      case 0x9d6b:
      case 0x9d6c:
      case 0x9d6d:
      case 0x9d6e:
      case 0x9d6f:
      case 0x9d70:
      case 0x9d71:
      case 0x9d72:
      case 0x9d73:
      case 0x9d74:
        goto switchD_00937e08_caseD_2713;
      case 0x9d69:
        iVar5 = (int)param_3[3];
        if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
          puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
        }
        else {
          puVar15 = (undefined8 *)*param_3;
          *param_3 = (long)(puVar15 + 1);
        }
        puVar15 = (undefined8 *)*puVar15;
        (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x9b8));
        *(undefined8 *)(param_1 + 0x9b8) = 0;
        uVar11 = 0;
        if (puVar15 != (undefined8 *)0x0) {
          if (&fde_table_entry_007a1200 < (fde_table_entry *)puVar15[1]) goto LAB_0093df2c;
          pfVar8 = (fde_table_entry *)0x18;
          if ((*(uint *)(puVar15 + 2) & 1) != 0) {
            pfVar8 = (fde_table_entry *)puVar15[1] + 3;
          }
          puVar7 = (undefined8 *)(*(code *)PTR_malloc_00cc4670)(pfVar8);
          if (puVar7 == (undefined8 *)0x0) goto LAB_0093d6ec;
          puVar7[2] = puVar15[2];
          uVar22 = *puVar15;
          puVar7[1] = puVar15[1];
          *puVar7 = uVar22;
          if ((*(byte *)(puVar15 + 2) & 1) != 0) {
            *puVar7 = puVar7 + 3;
            memcpy(puVar7 + 3,(void *)*puVar15,puVar15[1]);
          }
          *(undefined8 **)(param_1 + 0x9b8) = puVar7;
          uVar11 = 0;
        }
        break;
      case 0x9d75:
        uVar11 = FUN_0096a5f4(param_1,0x40);
        if ((uVar11 & 1) == 0) goto LAB_0093dedc;
        iVar5 = (int)param_3[3];
        if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
          puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
        }
        else {
          puVar15 = (undefined8 *)*param_3;
          *param_3 = (long)(puVar15 + 1);
        }
        puVar15 = (undefined8 *)*puVar15;
        (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x9a0));
        *(undefined8 *)(param_1 + 0x9a0) = 0;
        uVar11 = 0;
        if (puVar15 != (undefined8 *)0x0) {
          if (&fde_table_entry_007a1200 < (fde_table_entry *)puVar15[1]) goto LAB_0093df2c;
          pfVar8 = (fde_table_entry *)0x18;
          if ((*(uint *)(puVar15 + 2) & 1) != 0) {
            pfVar8 = (fde_table_entry *)puVar15[1] + 3;
          }
          puVar7 = (undefined8 *)(*(code *)PTR_malloc_00cc4670)(pfVar8);
          if (puVar7 == (undefined8 *)0x0) goto LAB_0093d6ec;
          puVar7[2] = puVar15[2];
          uVar22 = *puVar15;
          puVar7[1] = puVar15[1];
          *puVar7 = uVar22;
          if ((*(byte *)(puVar15 + 2) & 1) != 0) {
            *puVar7 = puVar7 + 3;
            memcpy(puVar7 + 3,(void *)*puVar15,puVar15[1]);
          }
          *(undefined8 **)(param_1 + 0x9a0) = puVar7;
          uVar11 = 0;
        }
        break;
      case 0x9d76:
        uVar11 = FUN_0096a5f4(param_1,0x40);
        if ((uVar11 & 1) == 0) goto LAB_0093dedc;
        iVar5 = (int)param_3[3];
        if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
          puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
        }
        else {
          puVar15 = (undefined8 *)*param_3;
          *param_3 = (long)(puVar15 + 1);
        }
        puVar15 = (undefined8 *)*puVar15;
        (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x9c0));
        *(undefined8 *)(param_1 + 0x9c0) = 0;
        uVar11 = 0;
        if (puVar15 != (undefined8 *)0x0) {
          if (&fde_table_entry_007a1200 < (fde_table_entry *)puVar15[1]) goto LAB_0093df2c;
          pfVar8 = (fde_table_entry *)0x18;
          if ((*(uint *)(puVar15 + 2) & 1) != 0) {
            pfVar8 = (fde_table_entry *)puVar15[1] + 3;
          }
          puVar7 = (undefined8 *)(*(code *)PTR_malloc_00cc4670)(pfVar8);
          if (puVar7 == (undefined8 *)0x0) goto LAB_0093d6ec;
          puVar7[2] = puVar15[2];
          uVar22 = *puVar15;
          puVar7[1] = puVar15[1];
          *puVar7 = uVar22;
          if ((*(byte *)(puVar15 + 2) & 1) != 0) {
            *puVar7 = puVar7 + 3;
            memcpy(puVar7 + 3,(void *)*puVar15,puVar15[1]);
          }
          *(undefined8 **)(param_1 + 0x9c0) = puVar7;
          uVar11 = 0;
        }
        break;
      default:
        switch(param_2) {
        case 0x75a3:
          goto switchD_00938088_caseD_75a3;
        case 0x75a4:
          goto switchD_00938088_caseD_75a4;
        case 0x75a5:
          goto switchD_00938088_caseD_75a5;
        case 0x75a8:
          goto switchD_00938088_caseD_75a8;
        case 0x75c1:
          iVar5 = (int)param_3[3];
          if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
            lVar23 = *(long *)(param_3[1] + (long)iVar5);
          }
          else {
            plVar16 = (long *)*param_3;
            *param_3 = (long)(plVar16 + 1);
            lVar23 = *plVar16;
          }
          if (lVar23 < 0) goto LAB_0093ebac;
          *(long *)(param_1 + 0x328) = lVar23;
          uVar11 = 0;
          break;
        case 0x75c2:
          iVar5 = (int)param_3[3];
          if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
            lVar23 = *(long *)(param_3[1] + (long)iVar5);
          }
          else {
            plVar16 = (long *)*param_3;
            *param_3 = (long)(plVar16 + 1);
            lVar23 = *plVar16;
          }
          if (lVar23 < 0) goto LAB_0093ebac;
          *(long *)(param_1 + 0x330) = lVar23;
          uVar11 = 0;
          break;
        default:
          if (param_2 == 0x763e) goto switchD_00937ea8_caseD_22;
        case 0x75a6:
        case 0x75a7:
        case 0x75a9:
        case 0x75aa:
        case 0x75ab:
        case 0x75ac:
        case 0x75ad:
        case 0x75ae:
        case 0x75af:
        case 0x75b0:
        case 0x75b1:
        case 0x75b2:
        case 0x75b3:
        case 0x75b4:
        case 0x75b5:
        case 0x75b6:
        case 0x75b7:
        case 0x75b8:
        case 0x75b9:
        case 0x75ba:
        case 0x75bb:
        case 0x75bc:
        case 0x75bd:
        case 0x75be:
        case 0x75bf:
        case 0x75c0:
switchD_00937e08_caseD_2713:
          uVar11 = 0x30;
        }
      }
    }
    goto switchD_00937e08_caseD_275c;
  }
  switch(param_2) {
  case 0x2711:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0x1d0) = *puVar15;
    uVar11 = 0;
    break;
  case 0x2712:
    if ((*(byte *)(param_1 + 0x131d) >> 6 & 1) != 0) {
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x11b8));
      *(undefined8 *)(param_1 + 0x11b8) = 0;
      *(uint *)(param_1 + 0x131c) = *(uint *)(param_1 + 0x131c) & 0xffffbfff;
    }
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x888));
    *(undefined8 *)(param_1 + 0x888) = 0;
    if (pcVar25 == (char *)0x0) {
      lVar23 = 0;
LAB_0093dc94:
      *(long *)(param_1 + 0x11b8) = lVar23;
      uVar11 = 0;
    }
    else {
      sVar10 = strlen(pcVar25);
      if (sVar10 < 0x7a1201) {
        lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
        *(long *)(param_1 + 0x888) = lVar23;
        if (lVar23 != 0) goto LAB_0093dc94;
        *(undefined8 *)(param_1 + 0x11b8) = 0;
        uVar11 = 0x1b;
      }
      else {
        *(undefined8 *)(param_1 + 0x11b8) = 0;
        uVar11 = 0x2b;
      }
    }
    break;
  case 0x2713:
  case 0x2718:
  case 0x271b:
  case 0x271c:
  case 0x271d:
  case 0x271e:
  case 0x2723:
  case 0x2724:
  case 0x2725:
  case 0x272b:
  case 0x272e:
  case 0x2730:
  case 0x2731:
  case 0x2732:
  case 0x2733:
  case 0x2736:
  case 0x2738:
  case 0x2739:
  case 0x273a:
  case 0x273b:
  case 0x273c:
  case 0x273d:
  case 0x273e:
  case 0x273f:
  case 0x2740:
  case 0x2741:
  case 0x2742:
  case 0x2743:
  case 0x2744:
  case 0x2745:
  case 0x2746:
  case 0x2747:
  case 0x2748:
  case 0x274a:
  case 0x274b:
  case 0x274c:
  case 0x274d:
  case 0x274f:
  case 0x2750:
  case 0x2752:
  case 0x2753:
  case 0x2754:
  case 0x2755:
  case 0x2757:
  case 0x2758:
  case 0x2759:
  case 0x275a:
  case 0x275b:
  case 0x275e:
  case 0x275f:
  case 0x2760:
  case 0x2761:
  case 0x2764:
  case 0x2765:
  case 0x276a:
  case 0x276b:
  case 0x276c:
  case 0x276e:
  case 0x2770:
  case 0x2772:
  case 0x2773:
  case 0x2775:
  case 0x2779:
  case 0x277a:
  case 0x277b:
  case 0x277c:
  case 0x277e:
  case 0x277f:
  case 0x2780:
  case 0x2781:
  case 0x2782:
  case 0x2783:
  case 0x2784:
  case 0x2785:
  case 0x2787:
  case 0x2788:
  case 0x2789:
  case 0x278a:
  case 0x278b:
  case 0x278c:
  case 0x278d:
  case 0x278e:
  case 0x278f:
  case 0x2790:
  case 0x2791:
  case 0x2792:
  case 0x2794:
  case 0x2795:
  case 0x2798:
  case 0x2799:
  case 0x279a:
  case 0x279b:
  case 0x279c:
  case 0x279d:
  case 0x279e:
  case 0x279f:
  case 0x27a0:
  case 0x27a1:
  case 0x27a2:
  case 0x27a4:
  case 0x27a6:
  case 0x27a7:
  case 0x27a8:
  case 0x27a9:
  case 0x27aa:
  case 0x27ab:
  case 0x27ac:
  case 0x27ad:
  case 0x27ae:
  case 0x27af:
  case 0x27b0:
  case 0x27b1:
  case 0x27b2:
  case 0x27b3:
  case 0x27b6:
  case 0x27b7:
  case 0x27bb:
  case 0x27bc:
  case 0x27c2:
  case 0x27c4:
  case 0x27c5:
  case 0x27c6:
  case 0x27c7:
  case 0x27c8:
  case 0x27c9:
  case 0x27cc:
  case 0x27cd:
  case 0x27d1:
  case 0x27d2:
  case 0x27d4:
  case 0x27d5:
  case 0x27d6:
  case 0x27d7:
  case 0x27d8:
  case 0x27df:
  case 0x27e0:
  case 0x27e2:
  case 0x27e3:
  case 0x27e4:
  case 0x27e5:
  case 0x27e6:
  case 0x27e7:
  case 0x27e8:
  case 0x27ea:
  case 0x27eb:
  case 0x27ed:
  case 0x27ee:
  case 0x27ef:
  case 0x27f1:
  case 0x27f2:
  case 0x27f3:
  case 0x27f5:
  case 0x27f8:
  case 0x27f9:
  case 0x27fa:
  case 0x27fd:
  case 0x27ff:
  case 0x2802:
  case 0x2804:
  case 0x2805:
  case 0x2808:
  case 0x2809:
  case 0x280a:
  case 0x2815:
  case 0x2819:
  case 0x281b:
  case 0x281c:
  case 0x281e:
  case 0x281f:
  case 0x2820:
  case 0x2822:
  case 0x2823:
  case 0x2826:
  case 0x2828:
  case 0x2829:
  case 0x282b:
  case 0x282d:
  case 0x282e:
  case 0x2830:
  case 0x2832:
  case 0x2833:
  case 0x2834:
  case 0x2835:
  case 0x2836:
  case 0x2837:
  case 0x2839:
  case 0x283b:
  case 0x283d:
  case 0x283f:
  case 0x2842:
  case 0x2843:
  case 0x2844:
  case 0x2845:
  case 0x2846:
  case 0x2847:
  case 0x2848:
  case 0x284a:
  case 0x284b:
  case 0x284c:
  case 0x284d:
  case 0x2850:
  case 0x2851:
  case 0x2852:
    goto switchD_00937e08_caseD_2713;
  case 0x2714:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x868));
    *(undefined8 *)(param_1 + 0x868) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093e8c4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (&fde_table_entry_007a1200 < pfVar8) goto LAB_0093df2c;
    lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
    *(long *)(param_1 + 0x868) = lVar23;
    if (lVar23 != 0) goto LAB_0093e8c4;
    goto LAB_0093d6ec;
  case 0x2715:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    local_150 = 0;
    local_148[0] = 0;
    if (pcVar25 != (char *)0x0) {
      pfVar8 = (fde_table_entry *)strlen(pcVar25);
      if (&fde_table_entry_007a1200 < pfVar8) goto LAB_0093df2c;
      uVar4 = FUN_00946fb0(pcVar25,pfVar8,local_148,&local_150,0);
      uVar11 = (ulong)uVar4;
      if (uVar4 != 0) break;
    }
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x8a0));
    *(long *)(param_1 + 0x8a0) = local_148[0];
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x8a8));
    *(long *)(param_1 + 0x8a8) = local_150;
    uVar11 = 0;
    break;
  case 0x2716:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    local_150 = 0;
    local_148[0] = 0;
    if (pcVar25 == (char *)0x0) {
LAB_0093dccc:
      (*(code *)PTR_free_00cc4678)(0);
      lVar24 = local_148[0];
      (*(code *)PTR_free_00cc4678)(0);
      lVar23 = local_150;
      uVar11 = 0;
      if (lVar24 != 0) {
        uVar11 = FUN_0091583c(lVar24,0,param_1 + 0x8b8,0,4);
        uVar11 = uVar11 & 0xffffffff;
      }
    }
    else {
      sVar10 = strlen(pcVar25);
      if (sVar10 < 0x7a1201) {
        uVar4 = FUN_00946fb0(pcVar25,sVar10,local_148,&local_150,0);
        uVar11 = (ulong)uVar4;
        if (uVar4 == 0) goto LAB_0093dccc;
        lVar24 = 0;
        lVar23 = 0;
      }
      else {
        lVar24 = 0;
        lVar23 = 0;
        uVar11 = 0x2b;
      }
    }
    if ((lVar23 != 0) && ((int)uVar11 == 0)) {
      uVar11 = FUN_0091583c(lVar23,0,param_1 + 0x8c0,0,4);
      uVar11 = uVar11 & 0xffffffff;
    }
    (*(code *)PTR_free_00cc4678)(lVar24);
    (*(code *)PTR_free_00cc4678)(lVar23);
    break;
  case 0x2717:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x878));
    *(undefined8 *)(param_1 + 0x878) = 0;
    if (pcVar25 != (char *)0x0) {
      pfVar8 = (fde_table_entry *)strlen(pcVar25);
      if (&fde_table_entry_007a1200 < pfVar8) goto LAB_0093df2c;
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x878) = lVar23;
joined_r0x0093d450:
      if (lVar23 == 0) goto LAB_0093d6ec;
    }
    goto LAB_0093e8c4;
  case 0x2719:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0x1d8) = *puVar15;
    uVar11 = 0;
    break;
  case 0x271a:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0x1c8) = *puVar15;
    uVar11 = 0;
    break;
  case 0x271f:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0x208) = *puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x980));
    *(undefined8 *)(param_1 + 0x980) = 0;
    *(undefined1 *)(param_1 + 0x529) = 1;
    uVar11 = 0;
    break;
  case 0x2720:
    if (*(char *)(param_1 + 0x131d) < '\0') {
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x11c0));
      *(undefined8 *)(param_1 + 0x11c0) = 0;
      *(uint *)(param_1 + 0x131c) = *(uint *)(param_1 + 0x131c) & 0xffff7fff;
    }
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x880));
    *(undefined8 *)(param_1 + 0x880) = 0;
    if (pcVar25 == (char *)0x0) {
      lVar23 = 0;
LAB_0093dd80:
      *(long *)(param_1 + 0x11c0) = lVar23;
      uVar11 = 0;
    }
    else {
      sVar10 = strlen(pcVar25);
      if (sVar10 < 0x7a1201) {
        lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
        *(long *)(param_1 + 0x880) = lVar23;
        if (lVar23 != 0) goto LAB_0093dd80;
        *(undefined8 *)(param_1 + 0x11c0) = 0;
        uVar11 = 0x1b;
      }
      else {
        *(undefined8 *)(param_1 + 0x11c0) = 0;
        uVar11 = 0x2b;
      }
    }
    break;
  case 0x2721:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x858));
    *(undefined8 *)(param_1 + 0x858) = 0;
    if (pcVar25 == (char *)0x0) {
      lVar23 = 0;
LAB_0093dda8:
      uVar11 = 0;
    }
    else {
      sVar10 = strlen(pcVar25);
      if (sVar10 < 0x7a1201) {
        lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
        *(long *)(param_1 + 0x858) = lVar23;
        if (lVar23 != 0) goto LAB_0093dda8;
        uVar11 = 0x1b;
      }
      else {
        lVar23 = 0;
        uVar11 = 0x2b;
      }
    }
    uVar6 = *(ulong *)(param_1 + 0xa82);
    *(ulong *)(param_1 + 0xa82) =
         uVar6 & 0xffffffffffffe000 | uVar6 & 0xfff | (ulong)(lVar23 != 0) << 0xc;
    break;
  case 0x2722:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x890));
    *(undefined8 *)(param_1 + 0x890) = 0;
    if (pcVar25 != (char *)0x0) {
      pfVar8 = (fde_table_entry *)strlen(pcVar25);
      if (&fde_table_entry_007a1200 < pfVar8) goto LAB_0093d3d4;
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x890) = lVar23;
joined_r0x0093ae74:
      if (lVar23 == 0) {
LAB_0093de20:
        uVar11 = 0x1b;
        break;
      }
    }
    goto LAB_0093e8c4;
  case 0x2726:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x808));
    *(undefined8 *)(param_1 + 0x808) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093e8c4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (pfVar8 <= &fde_table_entry_007a1200) {
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x808) = lVar23;
      goto joined_r0x0093ae74;
    }
LAB_0093d3d4:
    uVar11 = 0x2b;
    break;
  case 0x2727:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0x340) = *puVar15;
    uVar11 = 0;
    break;
  case 0x2728:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    uVar22 = *puVar15;
    *(undefined1 *)(param_1 + 0x529) = 2;
    *(undefined8 *)(param_1 + 0x348) = uVar22;
    *(ulong *)(param_1 + 0xa82) = *(ulong *)(param_1 + 0xa82) & 0xfffffffff7ffffff;
    FUN_00925eb8(*(undefined8 *)(param_1 + 0x11d8));
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x11d8));
    uVar11 = 0;
LAB_0093d558:
    *(undefined8 *)(param_1 + 0x11d8) = 0;
    *(undefined8 *)(param_1 + 0x11d0) = 0;
    break;
  case 0x2729:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x738));
    *(undefined8 *)(param_1 + 0x738) = 0;
    if (pcVar25 != (char *)0x0) {
      pfVar8 = (fde_table_entry *)strlen(pcVar25);
      if (&fde_table_entry_007a1200 < pfVar8) goto LAB_0093df2c;
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x738) = lVar23;
      goto joined_r0x0093ca64;
    }
    goto LAB_0093d6e4;
  case 0x272a:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x750));
    *(undefined8 *)(param_1 + 0x750) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093d6e4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (pfVar8 <= &fde_table_entry_007a1200) {
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x750) = lVar23;
      goto joined_r0x0093ca64;
    }
    goto LAB_0093df2c;
  case 0x272c:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0x718) = *puVar15;
    uVar11 = 0;
    break;
  case 0x272d:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0x1e0) = *puVar15;
    uVar11 = 0;
    break;
  case 0x272f:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      pcVar25 = *(char **)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
      pcVar25 = (char *)*puVar15;
    }
    if (pcVar25 == (char *)0x0) {
      curl_slist_free_all(*(undefined8 *)(param_1 + 0x1298));
      *(undefined8 *)(param_1 + 0x1298) = 0;
      if ((*(long *)(param_1 + 0xd0) == 0) || (*(long *)(*(long *)(param_1 + 0xd0) + 0xe8) == 0)) {
        FUN_00914bcc(*(undefined8 *)(param_1 + 0xa90));
        FUN_00914d68(*(undefined8 *)(param_1 + 0xa90));
      }
      *(undefined8 *)(param_1 + 0xa90) = 0;
      uVar11 = 0;
    }
    else {
      pfVar8 = (fde_table_entry *)strlen(pcVar25);
      if (&fde_table_entry_007a1200 < pfVar8) goto LAB_0093ebac;
      lVar23 = curl_slist_append(*(undefined8 *)(param_1 + 0x1298),pcVar25);
      if (lVar23 == 0) {
        curl_slist_free_all(*(undefined8 *)(param_1 + 0x1298));
        *(undefined8 *)(param_1 + 0x1298) = 0;
        uVar6 = 0x1b;
        goto switchD_00937ea8_caseD_ef;
      }
      *(long *)(param_1 + 0x1298) = lVar23;
      uVar11 = 0;
    }
    break;
  case 0x2734:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x818));
    *(undefined8 *)(param_1 + 0x818) = 0;
    if (pcVar25 != (char *)0x0) {
      pfVar8 = (fde_table_entry *)strlen(pcVar25);
      if (pfVar8 <= &fde_table_entry_007a1200) {
        lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
        *(long *)(param_1 + 0x818) = lVar23;
        goto joined_r0x0093ae74;
      }
      goto LAB_0093d3d4;
    }
    goto LAB_0093e8c4;
  case 0x2735:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar1 = sched_yield;
    if ((code *)*puVar15 != (code *)0x0) {
      pcVar1 = (code *)*puVar15;
    }
    *(code **)(param_1 + 0x1b8) = pcVar1;
    uVar11 = 0;
    break;
  case 0x2737:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0x720) = *puVar15;
    uVar11 = 0;
    break;
  case 0x2749:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0x2d0) = *puVar15;
    uVar11 = 0;
    break;
  case 0x274e:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    local_150 = 0;
    local_148[0] = 0;
    local_158 = 0;
    if (((pcVar25 == (char *)0x0) || (*pcVar25 == '\0')) ||
       (sVar10 = strlen(pcVar25), 0xff < sVar10)) goto LAB_0093df2c;
    uVar4 = FUN_0090c178(pcVar25,sVar10,local_148,&local_150,&local_158);
    uVar11 = (ulong)uVar4;
    if (uVar4 == 0) {
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x828));
      *(long *)(param_1 + 0x828) = local_148[0];
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x830));
      *(long *)(param_1 + 0x830) = local_150;
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x838));
      *(undefined8 *)(param_1 + 0x838) = local_158;
    }
    break;
  case 0x2751:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x768));
    *(undefined8 *)(param_1 + 0x768) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093d6e4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (pfVar8 <= &fde_table_entry_007a1200) {
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x768) = lVar23;
      goto joined_r0x0093ca64;
    }
    goto LAB_0093df2c;
  case 0x2756:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0x508) = *puVar15;
    uVar11 = 0;
    break;
  case 0x275c:
  case 0x275d:
    break;
  case 0x2762:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x810));
    *(undefined8 *)(param_1 + 0x810) = 0;
    if (pcVar25 != (char *)0x0) {
      pfVar8 = (fde_table_entry *)strlen(pcVar25);
      if (&fde_table_entry_007a1200 < pfVar8) goto LAB_0093d3d4;
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x810) = lVar23;
      if (lVar23 == 0) goto LAB_0093de20;
    }
    lVar23 = FUN_00912ca4(param_1,0,*(undefined8 *)(param_1 + 0xa90),
                          *(ulong *)(param_1 + 0xa82) >> 4 & 1);
    uVar4 = 0x1b;
    if (lVar23 != 0) {
      uVar4 = 0;
    }
    *(long *)(param_1 + 0xa90) = lVar23;
    uVar11 = (ulong)uVar4;
    break;
  case 0x2763:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x778));
    *(undefined8 *)(param_1 + 0x778) = 0;
    if (pcVar25 != (char *)0x0) {
      pfVar8 = (fde_table_entry *)strlen(pcVar25);
      if (pfVar8 <= &fde_table_entry_007a1200) {
        lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
        *(long *)(param_1 + 0x778) = lVar23;
        goto joined_r0x0093ae74;
      }
      goto LAB_0093d3d4;
    }
    goto LAB_0093e8c4;
  case 0x2766:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x740));
    *(undefined8 *)(param_1 + 0x740) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093d6e4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (pfVar8 <= &fde_table_entry_007a1200) {
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x740) = lVar23;
      goto joined_r0x0093ca64;
    }
    goto LAB_0093df2c;
  case 0x2767:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x748));
    *(undefined8 *)(param_1 + 0x748) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093d6e4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (pfVar8 <= &fde_table_entry_007a1200) {
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x748) = lVar23;
      goto joined_r0x0093ca64;
    }
    goto LAB_0093df2c;
  case 0x2768:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x758));
    *(undefined8 *)(param_1 + 0x758) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093d6e4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (pfVar8 <= &fde_table_entry_007a1200) {
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x758) = lVar23;
      goto joined_r0x0093ca64;
    }
    goto LAB_0093df2c;
  case 0x2769:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      pcVar25 = *(char **)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
      pcVar25 = (char *)*puVar15;
    }
    if ((pcVar25 == (char *)0x0) || (*pcVar25 == '\0')) goto LAB_0093eb04;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x898));
    *(undefined8 *)(param_1 + 0x898) = 0;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (&fde_table_entry_007a1200 < pfVar8) goto LAB_0093df2c;
    lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
    *(long *)(param_1 + 0x898) = lVar23;
    if (lVar23 == 0) goto LAB_0093d6ec;
    uVar11 = thunk_FUN_009701d0(param_1,pcVar25);
    uVar11 = uVar11 & 0xffffffff;
    break;
  case 0x276d:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0x728) = *puVar15;
    uVar11 = 0;
    break;
  case 0x276f:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0x1c0) = *puVar15;
    uVar11 = 0;
    break;
  case 0x2771:
    uVar11 = FUN_0096a5f4(param_1,1);
    if ((uVar11 & 1) == 0) goto LAB_0093d99c;
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x760));
    *(undefined8 *)(param_1 + 0x760) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093d6e4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (pfVar8 <= &fde_table_entry_007a1200) {
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x760) = lVar23;
      goto joined_r0x0093ca64;
    }
    goto LAB_0093df2c;
  case 0x2774:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    piVar17 = (int *)*puVar15;
    if (*(long *)(param_1 + 0xd0) != 0) {
      FUN_0093f628(param_1,1,2);
      if (*(int *)(param_1 + 0xb8) == 2) {
        *(undefined8 *)(param_1 + 0xb0) = 0;
        *(undefined4 *)(param_1 + 0xb8) = 0;
      }
      lVar23 = *(long *)(param_1 + 0xd0);
      if (*(long *)(lVar23 + 0xe8) == *(long *)(param_1 + 0xa90)) {
        *(undefined8 *)(param_1 + 0xa90) = 0;
      }
      if (*(long *)(lVar23 + 0xf0) == *(long *)(param_1 + 0xa98)) {
        *(undefined8 *)(param_1 + 0xa98) = 0;
      }
      if (*(long *)(lVar23 + 0xf8) == *(long *)(param_1 + 0xca8)) {
        *(undefined8 *)(param_1 + 0xca8) = 0;
      }
      *(int *)(lVar23 + 8) = *(int *)(lVar23 + 8) + -1;
      FUN_0093f680(param_1,1);
      *(undefined8 *)(param_1 + 0xd0) = 0;
    }
    if (piVar17 == (int *)0x0) goto LAB_0093eb04;
    uVar11 = 0;
    if (*piVar17 == 0x7e117a1e) {
      *(int **)(param_1 + 0xd0) = piVar17;
      FUN_0093f628(param_1,1,2);
      lVar23 = *(long *)(param_1 + 0xd0);
      *(int *)(lVar23 + 8) = *(int *)(lVar23 + 8) + 1;
      if ((*(byte *)(lVar23 + 4) >> 3 & 1) != 0) {
        *(long *)(param_1 + 0xb0) = lVar23 + 0xb8;
        *(undefined4 *)(param_1 + 0xb8) = 2;
      }
      if (*(long *)(lVar23 + 0xe8) != 0) {
        FUN_00914d68(*(undefined8 *)(param_1 + 0xa90));
        lVar23 = *(long *)(param_1 + 0xd0);
        *(undefined8 *)(param_1 + 0xa90) = *(undefined8 *)(lVar23 + 0xe8);
      }
      if (*(long *)(lVar23 + 0xf0) != 0) {
        FUN_0091839c(param_1 + 0xa98);
        lVar23 = *(long *)(param_1 + 0xd0);
        *(undefined8 *)(param_1 + 0xa98) = *(undefined8 *)(lVar23 + 0xf0);
      }
      if (*(long *)(lVar23 + 0xf8) != 0) {
        uVar22 = *(undefined8 *)(lVar23 + 0x100);
        *(long *)(param_1 + 0xca8) = *(long *)(lVar23 + 0xf8);
        *(undefined8 *)(param_1 + 0x6d0) = uVar22;
      }
      FUN_0093f680(param_1,1);
      uVar11 = 0;
    }
    break;
  case 0x2776:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      pcVar25 = *(char **)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
      pcVar25 = (char *)*puVar15;
    }
    if ((pcVar25 == (char *)0x0) || (*pcVar25 != '\0')) {
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x840));
      *(undefined8 *)(param_1 + 0x840) = 0;
      if (pcVar25 != (char *)0x0) {
        pfVar8 = (fde_table_entry *)strlen(pcVar25);
        if (pfVar8 <= &fde_table_entry_007a1200) {
          lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
          *(long *)(param_1 + 0x840) = lVar23;
          goto joined_r0x0093ae74;
        }
        goto LAB_0093d3d4;
      }
      goto LAB_0093e8c4;
    }
    FUN_0091ea58(local_148,0x100);
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x840));
    *(undefined8 *)(param_1 + 0x840) = 0;
    pfVar8 = (fde_table_entry *)strlen((char *)local_148);
    if (&fde_table_entry_007a1200 < pfVar8) goto LAB_0093df2c;
    lVar23 = (*(code *)PTR_strdup_00cc4688)(local_148);
    *(long *)(param_1 + 0x840) = lVar23;
    uVar4 = 0x1b;
    if (lVar23 != 0) {
      uVar4 = 0;
    }
    uVar11 = (ulong)uVar4;
    break;
  case 0x2777:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0x6f0) = *puVar15;
    uVar11 = 0;
    break;
  case 0x2778:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0x6f8) = *puVar15;
    uVar11 = 0;
    break;
  case 0x277d:
    uVar11 = FUN_0096a5f4(param_1,8);
    if ((uVar11 & 1) == 0) goto LAB_0093d99c;
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0x5c0) = *puVar15;
    uVar11 = 0;
    break;
  case 0x2786:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x860));
    *(undefined8 *)(param_1 + 0x860) = 0;
    if (pcVar25 != (char *)0x0) {
      pfVar8 = (fde_table_entry *)strlen(pcVar25);
      if (pfVar8 <= &fde_table_entry_007a1200) {
        lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
        *(long *)(param_1 + 0x860) = lVar23;
        goto joined_r0x0093ae74;
      }
      goto LAB_0093d3d4;
    }
    goto LAB_0093e8c4;
  case 0x2793:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0x2d8) = *puVar15;
    uVar11 = 0;
    break;
  case 0x2796:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x848));
    *(undefined8 *)(param_1 + 0x848) = 0;
    if (pcVar25 != (char *)0x0) {
      pfVar8 = (fde_table_entry *)strlen(pcVar25);
      if (pfVar8 <= &fde_table_entry_007a1200) {
        lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
        *(long *)(param_1 + 0x848) = lVar23;
        goto joined_r0x0093d450;
      }
      goto LAB_0093df2c;
    }
    goto LAB_0093e8c4;
  case 0x2797:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      pcVar25 = *(char **)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
      pcVar25 = (char *)*puVar15;
    }
    if (pcVar25 == (char *)0x0) goto LAB_0093e8c4;
    iVar5 = curl_strequal(pcVar25,&DAT_002d4f78);
    if (iVar5 == 0) {
      iVar5 = curl_strequal(pcVar25,&DAT_002b6f5f);
      if (iVar5 == 0) {
        iVar5 = curl_strequal(pcVar25,"FLUSH");
        if (iVar5 == 0) {
          iVar5 = curl_strequal(pcVar25,"RELOAD");
          if (iVar5 == 0) {
            if (*(long *)(param_1 + 0xa90) == 0) {
              uVar22 = FUN_00912ca4(param_1,0,0,1);
              *(undefined8 *)(param_1 + 0xa90) = uVar22;
            }
            pfVar8 = (fde_table_entry *)strlen(pcVar25);
            if (&fde_table_entry_007a1200 < pfVar8) goto LAB_0093ebac;
            lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
            if ((lVar23 == 0) || (*(long *)(param_1 + 0xa90) == 0)) {
              (*(code *)PTR_free_00cc4678)(lVar23);
              uVar11 = 0x1b;
            }
            else {
              FUN_0093f628(param_1,2,2);
              iVar5 = curl_strnequal(lVar23,"Set-Cookie:",0xb);
              if (iVar5 == 0) {
                lVar24 = lVar23;
              }
              else {
                lVar24 = lVar23 + 0xb;
              }
              FUN_00912f88(param_1,*(undefined8 *)(param_1 + 0xa90),iVar5 != 0,0,lVar24,0,0,1);
              FUN_0093f680(param_1,2);
              (*(code *)PTR_free_00cc4678)(lVar23);
              uVar11 = 0;
            }
          }
          else {
            FUN_00912be4(param_1);
            uVar11 = 0;
          }
        }
        else {
          FUN_00914fdc(param_1,0);
          uVar11 = 0;
        }
        break;
      }
      FUN_0093f628(param_1,2,2);
      FUN_00914c78(*(undefined8 *)(param_1 + 0xa90));
    }
    else {
      FUN_0093f628(param_1,2,2);
      FUN_00914bcc(*(undefined8 *)(param_1 + 0xa90));
    }
    FUN_0093f680(param_1,2);
    uVar11 = 0;
    break;
  case 0x27a3:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x850));
    *(undefined8 *)(param_1 + 0x850) = 0;
    if (pcVar25 != (char *)0x0) {
      pfVar8 = (fde_table_entry *)strlen(pcVar25);
      if (pfVar8 <= &fde_table_entry_007a1200) {
        lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
        *(long *)(param_1 + 0x850) = lVar23;
        goto joined_r0x0093d450;
      }
      goto LAB_0093df2c;
    }
    goto LAB_0093e8c4;
  case 0x27a5:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0x270) = *puVar15;
    uVar11 = 0;
    break;
  case 0x27b4:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0x280) = *puVar15;
    uVar11 = 0;
    break;
  case 0x27b5:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      pcVar25 = *(char **)(param_3[1] + (long)iVar5);
      if (pcVar25 != (char *)0x0) goto LAB_0093cd3c;
LAB_0093ea08:
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x980));
      *(undefined8 *)(param_1 + 0x980) = 0;
      if (pcVar25 == (char *)0x0) {
LAB_0093ea60:
        uVar11 = 0;
      }
      else {
        pfVar8 = (fde_table_entry *)strlen(pcVar25);
        if (&fde_table_entry_007a1200 < pfVar8) {
          uVar11 = 0x2b;
        }
        else {
          lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
          *(long *)(param_1 + 0x980) = lVar23;
          if (lVar23 != 0) goto LAB_0093ea60;
LAB_0093ea68:
          uVar11 = 0x1b;
        }
      }
    }
    else {
      plVar16 = (long *)*param_3;
      *param_3 = (long)(plVar16 + 1);
      pcVar25 = (char *)*plVar16;
      if (pcVar25 == (char *)0x0) goto LAB_0093ea08;
LAB_0093cd3c:
      if (*(long *)(param_1 + 0x218) == -1) goto LAB_0093ea08;
      if ((*(long *)(param_1 + 0x218) < 0) || (lVar23 = FUN_00941948(pcVar25), lVar23 == 0))
      goto LAB_0093ea68;
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x980));
      uVar11 = 0;
      *(long *)(param_1 + 0x980) = lVar23;
    }
    *(undefined1 *)(param_1 + 0x529) = 1;
    *(undefined8 *)(param_1 + 0x208) = *(undefined8 *)(param_1 + 0x980);
    break;
  case 0x27b8:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0x2a8) = *puVar15;
    uVar11 = 0;
    break;
  case 0x27b9:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x788));
    *(undefined8 *)(param_1 + 0x788) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093d6e4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (pfVar8 <= &fde_table_entry_007a1200) {
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x788) = lVar23;
      goto joined_r0x0093ca64;
    }
    goto LAB_0093df2c;
  case 0x27ba:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x790));
    *(undefined8 *)(param_1 + 0x790) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093d6e4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (pfVar8 <= &fde_table_entry_007a1200) {
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x790) = lVar23;
      goto joined_r0x0093ca64;
    }
    goto LAB_0093df2c;
  case 0x27bd:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x8a0));
    *(undefined8 *)(param_1 + 0x8a0) = 0;
    if (pcVar25 != (char *)0x0) {
      pfVar8 = (fde_table_entry *)strlen(pcVar25);
      if (pfVar8 <= &fde_table_entry_007a1200) {
        lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
        *(long *)(param_1 + 0x8a0) = lVar23;
        goto joined_r0x0093d450;
      }
      goto LAB_0093df2c;
    }
    goto LAB_0093e8c4;
  case 0x27be:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x8a8));
    *(undefined8 *)(param_1 + 0x8a8) = 0;
    if (pcVar25 != (char *)0x0) {
      pfVar8 = (fde_table_entry *)strlen(pcVar25);
      if (pfVar8 <= &fde_table_entry_007a1200) {
        lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
        *(long *)(param_1 + 0x8a8) = lVar23;
        goto joined_r0x0093d450;
      }
      goto LAB_0093df2c;
    }
    goto LAB_0093e8c4;
  case 0x27bf:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x8b8));
    *(undefined8 *)(param_1 + 0x8b8) = 0;
    if (pcVar25 != (char *)0x0) {
      pfVar8 = (fde_table_entry *)strlen(pcVar25);
      if (pfVar8 <= &fde_table_entry_007a1200) {
        lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
        *(long *)(param_1 + 0x8b8) = lVar23;
        goto joined_r0x0093d450;
      }
      goto LAB_0093df2c;
    }
    goto LAB_0093e8c4;
  case 0x27c0:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x8c0));
    *(undefined8 *)(param_1 + 0x8c0) = 0;
    if (pcVar25 != (char *)0x0) {
      pfVar8 = (fde_table_entry *)strlen(pcVar25);
      if (pfVar8 <= &fde_table_entry_007a1200) {
        lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
        *(long *)(param_1 + 0x8c0) = lVar23;
        goto joined_r0x0093d450;
      }
      goto LAB_0093df2c;
    }
    goto LAB_0093e8c4;
  case 0x27c1:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x8c8));
    *(undefined8 *)(param_1 + 0x8c8) = 0;
    if (pcVar25 != (char *)0x0) {
      pfVar8 = (fde_table_entry *)strlen(pcVar25);
      if (pfVar8 <= &fde_table_entry_007a1200) {
        lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
        *(long *)(param_1 + 0x8c8) = lVar23;
        goto joined_r0x0093d450;
      }
      goto LAB_0093df2c;
    }
    goto LAB_0093e8c4;
  case 0x27c3:
  case 0x27fb:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x800));
    *(undefined8 *)(param_1 + 0x800) = 0;
    if (pcVar25 != (char *)0x0) {
      pfVar8 = (fde_table_entry *)strlen(pcVar25);
      if (pfVar8 <= &fde_table_entry_007a1200) {
        lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
        *(long *)(param_1 + 0x800) = lVar23;
        goto joined_r0x0093d450;
      }
      goto LAB_0093df2c;
    }
    goto LAB_0093e8c4;
  case 0x27ca:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x8e8));
    *(undefined8 *)(param_1 + 0x8e8) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093d6e4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (pfVar8 <= &fde_table_entry_007a1200) {
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x8e8) = lVar23;
      goto joined_r0x0093ca64;
    }
    goto LAB_0093df2c;
  case 0x27cb:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0xa70) = *puVar15;
    uVar11 = 0;
    break;
  case 0x27ce:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x8d0));
    *(undefined8 *)(param_1 + 0x8d0) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093d6e4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (pfVar8 <= &fde_table_entry_007a1200) {
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x8d0) = lVar23;
      goto joined_r0x0093ca64;
    }
    goto LAB_0093df2c;
  case 0x27cf:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x8d8));
    *(undefined8 *)(param_1 + 0x8d8) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093d6e4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (pfVar8 <= &fde_table_entry_007a1200) {
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x8d8) = lVar23;
      goto joined_r0x0093ca64;
    }
    goto LAB_0093df2c;
  case 0x27d0:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x8e0));
    *(undefined8 *)(param_1 + 0x8e0) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093d6e4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (pfVar8 <= &fde_table_entry_007a1200) {
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x8e0) = lVar23;
      goto joined_r0x0093ca64;
    }
    goto LAB_0093df2c;
  case 0x27d3:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0x9d8) = *puVar15;
    uVar11 = 0;
    break;
  case 0x27d9:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0xa08) = *puVar15;
    uVar11 = 0;
    break;
  case 0x27da:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0xa00) = *puVar15;
    uVar11 = 0;
    break;
  case 0x27db:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    uVar22 = *puVar15;
    *(undefined8 *)(param_1 + 0x510) = uVar22;
    *(undefined8 *)(param_1 + 0x11c8) = uVar22;
    uVar11 = 0;
    break;
  case 0x27dc:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x8f8));
    *(undefined8 *)(param_1 + 0x8f8) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093d6e4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (pfVar8 <= &fde_table_entry_007a1200) {
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x8f8) = lVar23;
      goto joined_r0x0093ca64;
    }
    goto LAB_0093df2c;
  case 0x27dd:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x900));
    *(undefined8 *)(param_1 + 0x900) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093d6e4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (pfVar8 <= &fde_table_entry_007a1200) {
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x900) = lVar23;
      goto joined_r0x0093ca64;
    }
    goto LAB_0093df2c;
  case 0x27de:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      lVar23 = *(long *)(param_3[1] + (long)iVar5);
    }
    else {
      plVar16 = (long *)*param_3;
      *param_3 = (long)(plVar16 + 1);
      lVar23 = *plVar16;
    }
    if (lVar23 == 0) goto LAB_0093eb04;
    iVar5 = curl_strequal(lVar23,&DAT_002ab5ba);
joined_r0x0093d7d4:
    uVar11 = 0;
    if (iVar5 == 0) goto LAB_0093ebac;
    break;
  case 0x27e1:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0x290) = *puVar15;
    uVar11 = 0;
    break;
  case 0x27e9:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x8f0));
    *(undefined8 *)(param_1 + 0x8f0) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093d6e4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (pfVar8 <= &fde_table_entry_007a1200) {
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x8f0) = lVar23;
      goto joined_r0x0093ca64;
    }
    goto LAB_0093df2c;
  case 0x27ec:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x918));
    *(undefined8 *)(param_1 + 0x918) = 0;
    if (pcVar25 != (char *)0x0) {
      pfVar8 = (fde_table_entry *)strlen(pcVar25);
      if (pfVar8 <= &fde_table_entry_007a1200) {
        lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
        *(long *)(param_1 + 0x918) = lVar23;
        goto joined_r0x0093d450;
      }
      goto LAB_0093df2c;
    }
    goto LAB_0093e8c4;
  case 0x27f0:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x8b0));
    *(undefined8 *)(param_1 + 0x8b0) = 0;
    if (pcVar25 != (char *)0x0) {
      pfVar8 = (fde_table_entry *)strlen(pcVar25);
      if (pfVar8 <= &fde_table_entry_007a1200) {
        lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
        *(long *)(param_1 + 0x8b0) = lVar23;
        goto joined_r0x0093d450;
      }
      goto LAB_0093df2c;
    }
    goto LAB_0093e8c4;
  case 0x27f4:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0x6c0) = *puVar15;
    uVar11 = 0;
    break;
  case 0x27f6:
    uVar6 = FUN_0096a5f4(param_1,4);
    uVar11 = 4;
    if ((uVar6 & 1) != 0) {
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar15 = (undefined8 *)*param_3;
        *param_3 = (long)(puVar15 + 1);
      }
      pcVar25 = (char *)*puVar15;
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x770));
      *(undefined8 *)(param_1 + 0x770) = 0;
      if (pcVar25 == (char *)0x0) goto LAB_0093d6e4;
      pfVar8 = (fde_table_entry *)strlen(pcVar25);
      if (pfVar8 <= &fde_table_entry_007a1200) {
        lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
        *(long *)(param_1 + 0x770) = lVar23;
        goto joined_r0x0093ca64;
      }
      goto LAB_0093df2c;
    }
    break;
  case 0x27f7:
    uVar11 = *(ulong *)(param_1 + 0xa82) & 0xffffbfffffffffff;
    goto LAB_0093d1ac;
  case 0x27fc:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x798));
    *(undefined8 *)(param_1 + 0x798) = 0;
    if (pcVar25 != (char *)0x0) {
      pfVar8 = (fde_table_entry *)strlen(pcVar25);
      if (pfVar8 <= &fde_table_entry_007a1200) {
        lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
        *(long *)(param_1 + 0x798) = lVar23;
        goto joined_r0x0093d450;
      }
      goto LAB_0093df2c;
    }
    goto LAB_0093e8c4;
  case 0x27fe:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x820));
    *(undefined8 *)(param_1 + 0x820) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093d6e4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (pfVar8 <= &fde_table_entry_007a1200) {
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x820) = lVar23;
      goto joined_r0x0093ca64;
    }
    goto LAB_0093df2c;
  case 0x2800:
  case 0x2801:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      piVar17 = *(int **)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
      piVar17 = (int *)*puVar15;
    }
    if ((piVar17 == (int *)0x0) || (uVar11 = 0, *piVar17 == -0x3f212453)) {
LAB_0093dedc:
      uVar6 = 4;
      goto switchD_00937ea8_caseD_ef;
    }
    break;
  case 0x2803:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0x518) = *puVar15;
    uVar11 = 0;
    break;
  case 0x2806:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 2000));
    *(undefined8 *)(param_1 + 2000) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093d6e4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (pfVar8 <= &fde_table_entry_007a1200) {
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 2000) = lVar23;
      goto joined_r0x0093ca64;
    }
    goto LAB_0093df2c;
  case 0x2807:
    uVar11 = FUN_0096a5f4(param_1,1);
    if ((uVar11 & 1) == 0) goto LAB_0093d99c;
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x7c8));
    *(undefined8 *)(param_1 + 0x7c8) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093d6e4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (pfVar8 <= &fde_table_entry_007a1200) {
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x7c8) = lVar23;
      goto joined_r0x0093ca64;
    }
    goto LAB_0093df2c;
  case 0x280b:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x908));
    *(undefined8 *)(param_1 + 0x908) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093d6e4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (pfVar8 <= &fde_table_entry_007a1200) {
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x908) = lVar23;
      goto joined_r0x0093ca64;
    }
    goto LAB_0093df2c;
  case 0x280c:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x910));
    *(undefined8 *)(param_1 + 0x910) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093d6e4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (pfVar8 <= &fde_table_entry_007a1200) {
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x910) = lVar23;
      goto joined_r0x0093ca64;
    }
    goto LAB_0093df2c;
  case 0x280d:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      lVar23 = *(long *)(param_3[1] + (long)iVar5);
    }
    else {
      plVar16 = (long *)*param_3;
      *param_3 = (long)(plVar16 + 1);
      lVar23 = *plVar16;
    }
    if (lVar23 != 0) {
      iVar5 = curl_strequal(lVar23,&DAT_002ab5ba);
      goto joined_r0x0093d7d4;
    }
LAB_0093eb04:
    uVar11 = 0;
    break;
  case 0x280e:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x7a0));
    *(undefined8 *)(param_1 + 0x7a0) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093d6e4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (pfVar8 <= &fde_table_entry_007a1200) {
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x7a0) = lVar23;
      goto joined_r0x0093ca64;
    }
    goto LAB_0093df2c;
  case 0x280f:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x7a8));
    *(undefined8 *)(param_1 + 0x7a8) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093d6e4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (pfVar8 <= &fde_table_entry_007a1200) {
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x7a8) = lVar23;
      goto joined_r0x0093ca64;
    }
    goto LAB_0093df2c;
  case 0x2810:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x7b0));
    *(undefined8 *)(param_1 + 0x7b0) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093d6e4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (pfVar8 <= &fde_table_entry_007a1200) {
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x7b0) = lVar23;
      goto joined_r0x0093ca64;
    }
    goto LAB_0093df2c;
  case 0x2811:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x7c0));
    *(undefined8 *)(param_1 + 0x7c0) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093d6e4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (pfVar8 <= &fde_table_entry_007a1200) {
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x7c0) = lVar23;
      goto joined_r0x0093ca64;
    }
    goto LAB_0093df2c;
  case 0x2812:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x7b8));
    *(undefined8 *)(param_1 + 0x7b8) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093d6e4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (pfVar8 <= &fde_table_entry_007a1200) {
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x7b8) = lVar23;
      goto joined_r0x0093ca64;
    }
    goto LAB_0093df2c;
  case 0x2813:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x7e0));
    *(undefined8 *)(param_1 + 0x7e0) = 0;
    if (pcVar25 != (char *)0x0) {
      pfVar8 = (fde_table_entry *)strlen(pcVar25);
      if (pfVar8 <= &fde_table_entry_007a1200) {
        lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
        *(long *)(param_1 + 0x7e0) = lVar23;
        goto joined_r0x0093ae74;
      }
      goto LAB_0093d3d4;
    }
    goto LAB_0093e8c4;
  case 0x2814:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x7f0));
    *(undefined8 *)(param_1 + 0x7f0) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093d6e4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (pfVar8 <= &fde_table_entry_007a1200) {
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x7f0) = lVar23;
      goto joined_r0x0093ca64;
    }
    goto LAB_0093df2c;
  case 0x2816:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x870));
    *(undefined8 *)(param_1 + 0x870) = 0;
    if (pcVar25 != (char *)0x0) {
      pfVar8 = (fde_table_entry *)strlen(pcVar25);
      if (pfVar8 <= &fde_table_entry_007a1200) {
        lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
        *(long *)(param_1 + 0x870) = lVar23;
        goto joined_r0x0093d450;
      }
      goto LAB_0093df2c;
    }
    goto LAB_0093e8c4;
  case 0x2817:
    uVar6 = FUN_0096a5f4(param_1,4);
    uVar11 = 4;
    if ((uVar6 & 1) != 0) {
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar15 = (undefined8 *)*param_3;
        *param_3 = (long)(puVar15 + 1);
      }
      pcVar25 = (char *)*puVar15;
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x7d8));
      *(undefined8 *)(param_1 + 0x7d8) = 0;
      if (pcVar25 == (char *)0x0) goto LAB_0093d6e4;
      pfVar8 = (fde_table_entry *)strlen(pcVar25);
      if (pfVar8 <= &fde_table_entry_007a1200) {
        lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
        *(long *)(param_1 + 0x7d8) = lVar23;
        goto joined_r0x0093ca64;
      }
      goto LAB_0093df2c;
    }
    break;
  case 0x2818:
    uVar11 = *(ulong *)(param_1 + 0xa82) | 0x400000000000;
LAB_0093d1ac:
    *(ulong *)(param_1 + 0xa82) = uVar11;
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x920));
    *(undefined8 *)(param_1 + 0x920) = 0;
    if (pcVar25 != (char *)0x0) {
      pfVar8 = (fde_table_entry *)strlen(pcVar25);
      if (&fde_table_entry_007a1200 < pfVar8) goto LAB_0093df2c;
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x920) = lVar23;
joined_r0x0093ca64:
      if (lVar23 == 0) {
LAB_0093d6ec:
        uVar11 = 0x1b;
        break;
      }
    }
LAB_0093d6e4:
    uVar11 = 0;
    break;
  case 0x281a:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x928));
    *(undefined8 *)(param_1 + 0x928) = 0;
    if (pcVar25 != (char *)0x0) {
      pfVar8 = (fde_table_entry *)strlen(pcVar25);
      if (pfVar8 <= &fde_table_entry_007a1200) {
        lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
        *(long *)(param_1 + 0x928) = lVar23;
        goto joined_r0x0093ae74;
      }
      goto LAB_0093d3d4;
    }
    goto LAB_0093e8c4;
  case 0x281d:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    uVar4 = FUN_00926fcc(param_1 + 0x350,*puVar15,0);
    uVar11 = (ulong)uVar4;
    if (uVar4 == 0) {
      *(undefined1 *)(param_1 + 0x529) = 3;
      *(ulong *)(param_1 + 0xa82) = *(ulong *)(param_1 + 0xa82) & 0xfffffffff7ffffff;
      FUN_00925eb8(*(undefined8 *)(param_1 + 0x11d8));
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x11d8));
      goto LAB_0093d558;
    }
    break;
  case 0x2821:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0xa30) = *puVar15;
    uVar11 = 0;
    break;
  case 0x2824:
    uVar11 = FUN_0096a5f4(param_1,0x20);
    if ((uVar11 & 1) == 0) goto LAB_0093dedc;
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x780));
    *(undefined8 *)(param_1 + 0x780) = 0;
    if (pcVar25 != (char *)0x0) {
      pfVar8 = (fde_table_entry *)strlen(pcVar25);
      if (pfVar8 <= &fde_table_entry_007a1200) {
        lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
        *(long *)(param_1 + 0x780) = lVar23;
        goto joined_r0x0093ae74;
      }
      goto LAB_0093d3d4;
    }
    goto LAB_0093e8c4;
  case 0x2825:
    uVar11 = FUN_0096a5f4(param_1,0x20);
    if ((uVar11 & 1) == 0) goto LAB_0093dedc;
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x7e8));
    *(undefined8 *)(param_1 + 0x7e8) = 0;
    if (pcVar25 != (char *)0x0) {
      pfVar8 = (fde_table_entry *)strlen(pcVar25);
      if (pfVar8 <= &fde_table_entry_007a1200) {
        lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
        *(long *)(param_1 + 0x7e8) = lVar23;
        goto joined_r0x0093ae74;
      }
      goto LAB_0093d3d4;
    }
LAB_0093e8c4:
    uVar11 = 0;
    break;
  case 0x2827:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x930));
    *(undefined8 *)(param_1 + 0x930) = 0;
    if (pcVar25 == (char *)0x0) {
      lVar23 = 0;
LAB_0093dde4:
      uVar11 = 0;
    }
    else {
      sVar10 = strlen(pcVar25);
      if (sVar10 < 0x7a1201) {
        lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
        *(long *)(param_1 + 0x930) = lVar23;
        if (lVar23 != 0) goto LAB_0093dde4;
        uVar11 = 0x1b;
      }
      else {
        lVar23 = 0;
        uVar11 = 0x2b;
      }
    }
    uVar6 = *(ulong *)(param_1 + 0xa82);
    *(ulong *)(param_1 + 0xa82) =
         uVar6 & 0xfffe000000000000 | uVar6 & 0xffffffffffff | (ulong)(lVar23 != 0) << 0x30;
    break;
  case 0x282a:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0xa50) = *puVar15;
    uVar11 = 0;
    break;
  case 0x282c:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0xa58) = *puVar15;
    uVar11 = 0;
    break;
  case 0x282f:
    if (*(long *)(param_1 + 0xaa0) == 0) {
      lVar23 = FUN_00903270();
      *(long *)(param_1 + 0xaa0) = lVar23;
      if (lVar23 != 0) goto LAB_0093d5e0;
    }
    else {
LAB_0093d5e0:
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
      }
      else {
        puVar15 = (undefined8 *)*param_3;
        *param_3 = (long)(puVar15 + 1);
      }
      pcVar25 = (char *)*puVar15;
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x938));
      *(undefined8 *)(param_1 + 0x938) = 0;
      if (pcVar25 == (char *)0x0) goto LAB_0093eb04;
      pfVar8 = (fde_table_entry *)strlen(pcVar25);
      if (&fde_table_entry_007a1200 < pfVar8) goto LAB_0093ebac;
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x938) = lVar23;
      if (lVar23 != 0) {
        FUN_009032c0(*(undefined8 *)(param_1 + 0xaa0),pcVar25);
        uVar11 = 0;
        break;
      }
    }
LAB_0093d8c4:
    uVar6 = 0x1b;
    goto switchD_00937ea8_caseD_ef;
  case 0x2831:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x948));
    *(undefined8 *)(param_1 + 0x948) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093d6e4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (pfVar8 <= &fde_table_entry_007a1200) {
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x948) = lVar23;
      goto joined_r0x0093ca64;
    }
    goto LAB_0093df2c;
  case 0x2838:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x7f8));
    *(undefined8 *)(param_1 + 0x7f8) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093d6e4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (pfVar8 <= &fde_table_entry_007a1200) {
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x7f8) = lVar23;
      goto joined_r0x0093ca64;
    }
    goto LAB_0093df2c;
  case 0x283a:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x950));
    *(undefined8 *)(param_1 + 0x950) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093d6e4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (pfVar8 <= &fde_table_entry_007a1200) {
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x950) = lVar23;
      goto joined_r0x0093ca64;
    }
LAB_0093df2c:
    uVar11 = 0x2b;
    break;
  case 0x283c:
    if (*(long *)(param_1 + 0xa98) == 0) {
      lVar23 = FUN_00918354();
      *(long *)(param_1 + 0xa98) = lVar23;
      if (lVar23 == 0) goto LAB_0093d8c4;
    }
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      pcVar25 = *(char **)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
      pcVar25 = (char *)*puVar15;
    }
    if (pcVar25 == (char *)0x0) {
      curl_slist_free_all(*(undefined8 *)(param_1 + 0xc80));
      *(undefined8 *)(param_1 + 0xc80) = 0;
      if ((*(long *)(param_1 + 0xd0) == 0) ||
         (uVar11 = 0, *(long *)(*(long *)(param_1 + 0xd0) + 0xf0) == 0)) goto LAB_0093ebe8;
    }
    else {
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x940));
      *(undefined8 *)(param_1 + 0x940) = 0;
      pfVar8 = (fde_table_entry *)strlen(pcVar25);
      if (&fde_table_entry_007a1200 < pfVar8) goto LAB_0093ebac;
      lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
      *(long *)(param_1 + 0x940) = lVar23;
      if (lVar23 == 0) goto LAB_0093d8c4;
      lVar23 = curl_slist_append(*(undefined8 *)(param_1 + 0xc80),pcVar25);
      if (lVar23 == 0) {
        curl_slist_free_all(*(undefined8 *)(param_1 + 0xc80));
        *(undefined8 *)(param_1 + 0xc80) = 0;
        uVar6 = 0x1b;
        goto switchD_00937ea8_caseD_ef;
      }
      *(long *)(param_1 + 0xc80) = lVar23;
      uVar11 = 0;
    }
    break;
  case 0x283e:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0x2b8) = *puVar15;
    uVar11 = 0;
    break;
  case 0x2840:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0x2c8) = *puVar15;
    uVar11 = 0;
    break;
  case 0x2841:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x958));
    *(undefined8 *)(param_1 + 0x958) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093e8c4;
    pfVar8 = (fde_table_entry *)strlen(pcVar25);
    if (&fde_table_entry_007a1200 < pfVar8) goto LAB_0093d3d4;
    lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
    *(long *)(param_1 + 0x958) = lVar23;
    if (lVar23 == 0) goto LAB_0093de20;
    *(undefined8 *)(param_1 + 0x1f0) = 0x80;
    uVar11 = 0;
    break;
  case 0x2849:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    *(undefined8 *)(param_1 + 0x2a0) = *puVar15;
    uVar11 = 0;
    break;
  case 0x284e:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      plVar16 = (long *)(param_3[1] + (long)iVar5);
    }
    else {
      plVar16 = (long *)*param_3;
      *param_3 = (long)(plVar16 + 1);
    }
    pcVar25 = (char *)*plVar16;
    *(undefined4 *)(param_1 + 0x9cc) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093ebac;
    iVar5 = curl_strequal(pcVar25,&DAT_002d8fd5);
    if (iVar5 == 0) {
      do {
        pcVar9 = strchr(pcVar25,0x2c);
        if (pcVar9 == (char *)0x0) {
          sVar10 = strlen(pcVar25);
          if (sVar10 != 0) goto LAB_0093cb24;
        }
        else if (pcVar9 != pcVar25) {
LAB_0093cb24:
          lVar23 = FUN_00946ee0(pcVar25);
          if (lVar23 == 0) goto LAB_0093df84;
          *(uint *)(param_1 + 0x9cc) = *(uint *)(param_1 + 0x9cc) | *(uint *)(lVar23 + 0x8c);
        }
        pcVar25 = pcVar9 + 1;
      } while (pcVar9 != (char *)0x0);
      iVar5 = *(int *)(param_1 + 0x9cc);
      goto joined_r0x0093d7d4;
    }
    *(undefined4 *)(param_1 + 0x9cc) = 0xffffffff;
    uVar11 = 0;
    break;
  case 0x284f:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      plVar16 = (long *)(param_3[1] + (long)iVar5);
    }
    else {
      plVar16 = (long *)*param_3;
      *param_3 = (long)(plVar16 + 1);
    }
    pcVar25 = (char *)*plVar16;
    *(undefined4 *)(param_1 + 0x9d0) = 0;
    if (pcVar25 == (char *)0x0) goto LAB_0093ebac;
    iVar5 = curl_strequal(pcVar25,&DAT_002d8fd5);
    if (iVar5 == 0) {
      do {
        pcVar9 = strchr(pcVar25,0x2c);
        if (pcVar9 == (char *)0x0) {
          sVar10 = strlen(pcVar25);
          if (sVar10 != 0) goto LAB_0093d7ac;
        }
        else if (pcVar9 != pcVar25) {
LAB_0093d7ac:
          lVar23 = FUN_00946ee0(pcVar25);
          if (lVar23 == 0) goto LAB_0093df84;
          *(uint *)(param_1 + 0x9d0) = *(uint *)(param_1 + 0x9d0) | *(uint *)(lVar23 + 0x8c);
        }
        pcVar25 = pcVar9 + 1;
      } while (pcVar9 != (char *)0x0);
      iVar5 = *(int *)(param_1 + 0x9d0);
      goto joined_r0x0093d7d4;
    }
    *(undefined4 *)(param_1 + 0x9d0) = 0xffffffff;
    uVar11 = 0;
    break;
  case 0x2853:
    iVar5 = (int)param_3[3];
    if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
      puVar15 = (undefined8 *)(param_3[1] + (long)iVar5);
    }
    else {
      puVar15 = (undefined8 *)*param_3;
      *param_3 = (long)(puVar15 + 1);
    }
    pcVar25 = (char *)*puVar15;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x960));
    *(undefined8 *)(param_1 + 0x960) = 0;
    if (pcVar25 == (char *)0x0) {
LAB_0093de44:
      uVar11 = 0;
    }
    else {
      sVar10 = strlen(pcVar25);
      if (sVar10 < 0x7a1201) {
        lVar23 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
        *(long *)(param_1 + 0x960) = lVar23;
        if (lVar23 != 0) goto LAB_0093de44;
        uVar11 = 0x1b;
      }
      else {
        uVar11 = 0x2b;
      }
    }
    *(ulong *)(param_1 + 0xa82) = *(ulong *)(param_1 + 0xa82) | 0x200000000000;
    break;
  default:
    if (param_2 == 0x4e2b) {
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      pcVar1 = fwrite;
      if ((code *)*plVar16 != (code *)0x0) {
        pcVar1 = (code *)*plVar16;
      }
      *(code **)(param_1 + 0x228) = pcVar1;
      uVar11 = 0;
    }
    else {
      if (param_2 != 0x4e2c) goto switchD_00937e08_caseD_2713;
      iVar5 = (int)param_3[3];
      if ((iVar5 < 0) && (*(int *)(param_3 + 3) = iVar5 + 8, iVar5 + 8 < 1)) {
        plVar16 = (long *)(param_3[1] + (long)iVar5);
      }
      else {
        plVar16 = (long *)*param_3;
        *param_3 = (long)(plVar16 + 1);
      }
      lVar23 = *plVar16;
      puVar21 = (ulong *)(param_1 + 0xa82);
      *(long *)(param_1 + 0x240) = lVar23;
      uVar11 = 0;
      if (lVar23 == 0) {
        *puVar21 = *puVar21 & 0xfffffffffffffffd;
        *(code **)(param_1 + 0x240) = fread;
      }
      else {
        *puVar21 = *puVar21 | 2;
      }
    }
  }
switchD_00937e08_caseD_275c:
  uVar6 = uVar11;
switchD_00937ea8_caseD_ef:
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar6);
  }
  return;
LAB_0093df84:
  uVar6 = 1;
  goto switchD_00937ea8_caseD_ef;
}

