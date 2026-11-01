
/* WARNING: Possible PIC construction at 0x00134de8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00134e28: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00134dec) */
/* WARNING: Removing unreachable block (ram,0x00134e34) */
/* WARNING: Removing unreachable block (ram,0x00134e04) */
/* WARNING: Removing unreachable block (ram,0x00134e2c) */
/* WARNING: Removing unreachable block (ram,0x00134e30) */

void FUN_00134c9c(char *param_1,double param_2,double param_3,double param_4,double param_5,
                 double param_6,double param_7,double param_8,double param_9,undefined8 param_10,
                 long param_11)

{
  int *piVar1;
  undefined4 *puVar2;
  byte bVar3;
  char *pcVar4;
  uint uVar5;
  int iVar6;
  int iVar7;
  undefined8 uVar8;
  uint uVar9;
  long lVar10;
  long in_x9;
  char *in_x10;
  ulong in_x11;
  ulong in_x12;
  ulong in_x13;
  ulong in_x14;
  ulong in_x15;
  ulong in_x16;
  ulong in_x17;
  long lVar11;
  long unaff_x19;
  uint *unaff_x20;
  long lVar12;
  char *unaff_x24;
  long unaff_x25;
  long unaff_x26;
  float fVar13;
  float fVar14;
  float fVar15;
  float fVar16;
  float unaff_s8;
  double in_d16;
  double in_d17;
  double in_d18;
  double in_d19;
  double in_d20;
  double in_d21;
  double in_d22;
  double in_d23;
  double in_d24;
  long lStack0000000000000000;
  long lStack0000000000000008;
  char *pcStack0000000000000010;
  double dStack0000000000000018;
  double dStack0000000000000020;
  char *pcStack0000000000000028;
  ulong uStack0000000000000030;
  ulong uStack0000000000000038;
  ulong uStack0000000000000040;
  ulong uStack0000000000000048;
  ulong uStack0000000000000050;
  ulong uStack0000000000000058;
  ulong uStack0000000000000060;
  double dStack0000000000000068;
  double dStack0000000000000070;
  double dStack0000000000000078;
  double dStack0000000000000080;
  double dStack0000000000000088;
  double dStack0000000000000090;
  double dStack0000000000000098;
  double dStack00000000000000a0;
  double dStack00000000000000a8;
  double dStack00000000000000b0;
  double dStack00000000000000b8;
  double dStack00000000000000c0;
  double dStack00000000000000c8;
  double dStack00000000000000d0;
  double dStack00000000000000d8;
  long lStack00000000000000e0;
  char *pcStack00000000000000e8;
  ulong uStack00000000000000f0;
  ulong uStack00000000000000f8;
  undefined8 in_stack_00000118;
  undefined8 uStack0000000000000120;
  uint uStack0000000000000128;
  undefined4 uStack000000000000012c;
  undefined1 uStack0000000000000130;
  
  while( true ) {
    bVar3 = *(byte *)((long)unaff_x20 + 0x6d) & 3;
    pcVar4 = " (Des)";
    if (bVar3 != 2) {
      pcVar4 = unaff_x24;
    }
    pcStack00000000000000e8 = " (Asc)";
    if (bVar3 != 1) {
      pcStack00000000000000e8 = pcVar4;
    }
    uStack00000000000000f8 = (ulong)*unaff_x20;
    uStack00000000000000f0 = (ulong)unaff_x20[0xc];
    lStack0000000000000000 = unaff_x26;
    lStack0000000000000008 = in_x9;
    pcStack0000000000000010 = param_1;
    dStack0000000000000018 = param_2;
    dStack0000000000000020 = param_3;
    pcStack0000000000000028 = in_x10;
    uStack0000000000000030 = in_x11;
    uStack0000000000000038 = in_x12;
    uStack0000000000000040 = in_x13;
    uStack0000000000000048 = in_x14;
    uStack0000000000000050 = in_x15;
    uStack0000000000000058 = in_x16;
    uStack0000000000000060 = in_x17;
    dStack0000000000000068 = param_4;
    dStack0000000000000070 = in_d16;
    dStack0000000000000078 = param_8;
    dStack0000000000000080 = param_7;
    dStack0000000000000088 = param_9;
    dStack0000000000000090 = in_d17;
    dStack0000000000000098 = in_d18;
    dStack00000000000000a0 = param_5;
    dStack00000000000000a8 = in_d19;
    dStack00000000000000b0 = in_d21;
    dStack00000000000000b8 = param_6;
    dStack00000000000000c0 = in_d22;
    dStack00000000000000c8 = in_d23;
    dStack00000000000000d0 = in_d24;
    dStack00000000000000d8 = in_d20;
    lStack00000000000000e0 = param_11;
    func_0x000b875c(&uStack0000000000000130,0x200);
    func_0x0010da88();
    uStack0000000000000120 = 0;
    func_0x0010f27c(&uStack0000000000000130,0,0,&uStack0000000000000120);
    iVar7 = func_0x000c2648(0);
    if (iVar7 != 0) {
      uStack0000000000000128 = unaff_x20[3];
      uStack000000000000012c = *(undefined4 *)(unaff_x19 + 0xfc);
      uStack0000000000000120 = CONCAT44(*(undefined4 *)(unaff_x19 + 0xf4),unaff_x20[2]);
      uVar8 = func_0x000c2b9c();
      func_0x000f3af4(0,0x3f800000,uVar8,&uStack0000000000000120);
    }
    unaff_x26 = unaff_x26 + 1;
    unaff_x25 = unaff_x25 + 0x70;
    if (*(int *)(unaff_x19 + 0x6c) <= unaff_x26) break;
    param_1 = unaff_x24;
    if (((*(char *)(unaff_x19 + 0x236) != '\0') || (unaff_x26 < *(short *)(unaff_x19 + 0x206))) &&
       (lVar10 = (long)*(short *)(*(long *)(unaff_x19 + 0x18) + unaff_x25 + 0x50), lVar10 != -1)) {
      param_1 = (char *)(*(long *)(unaff_x19 + 0x198) + lVar10);
    }
    unaff_x20 = (uint *)(*(long *)(unaff_x19 + 0x18) + unaff_x25);
    in_x9 = (long)*(short *)((long)unaff_x20 + 0x52);
    in_x10 = " (Frozen)";
    if (*(short *)(unaff_x19 + 0x22a) <= unaff_x26) {
      in_x10 = unaff_x24;
    }
    in_x11 = (ulong)*(byte *)((long)unaff_x20 + 0x62);
    in_x12 = (ulong)*(byte *)((long)unaff_x20 + 0x65);
    in_x13 = (ulong)*(byte *)((long)unaff_x20 + 0x66);
    in_x14 = (ulong)*(byte *)((long)unaff_x20 + 0x67);
    in_x15 = (ulong)(byte)unaff_x20[0x1a];
    in_x16 = (ulong)*(ushort *)((long)unaff_x20 + 0x5e);
    in_x17 = (ulong)(ushort)unaff_x20[0x18];
    fVar13 = (float)unaff_x20[2];
    fVar15 = (float)unaff_x20[6];
    fVar16 = 0.0;
    fVar14 = (float)unaff_x20[3];
    if (0.0 < fVar15) {
      fVar16 = (fVar15 / unaff_s8) * 100.0;
    }
    param_2 = (double)(fVar13 - *(float *)(unaff_x19 + 0x110));
    param_3 = (double)(fVar14 - *(float *)(unaff_x19 + 0x110));
    param_4 = (double)(float)unaff_x20[1];
    in_d16 = (double)(float)unaff_x20[4];
    param_8 = (double)(float)unaff_x20[5];
    param_7 = (double)fVar15;
    param_9 = (double)fVar16;
    in_d17 = (double)fVar13;
    in_d18 = (double)fVar14;
    param_5 = (double)(fVar14 - fVar13);
    in_d19 = (double)(float)unaff_x20[8];
    in_d21 = (double)(float)unaff_x20[10];
    param_6 = (double)((float)unaff_x20[10] - (float)unaff_x20[8]);
    fVar13 = (float)unaff_x20[0xd];
    in_d22 = (double)((float)unaff_x20[0x10] - fVar13);
    in_d23 = (double)((float)unaff_x20[0x11] - fVar13);
    in_d24 = (double)((float)unaff_x20[0x12] - fVar13);
    in_d20 = (double)((float)unaff_x20[0x13] - fVar13);
    param_11 = (long)*(short *)((long)unaff_x20 + 0x5a);
  }
  if (*(int *)(unaff_x19 + 100) != -1) {
    puVar2 = (undefined4 *)
             (*(long *)(&UNK_00005f98 + lRam0000000000a334c0) + (long)*(int *)(unaff_x19 + 100));
    if (*(int *)(unaff_x19 + 0x6c) <= (int)*(short *)((long)puVar2 + 0xe)) {
      iVar7 = func_0x001227f4(*puVar2,"Settings 0x%08X (%d columns)");
      if (iVar7 == 0) {
        return;
      }
      func_0x0010b3a8("SaveFlags: 0x%08X");
      func_0x0010b3a8("ColumnsCount: %d (max %d)");
      if (0 < *(short *)(puVar2 + 3)) {
        lVar10 = 0;
        do {
          func_0x0010b3a8("Column %d Order %d SortOrder %d %s Vis %d %s %7.3f UserID 0x%08X");
          lVar10 = lVar10 + 1;
        } while (lVar10 < *(short *)(puVar2 + 3));
      }
      goto code_r0x00123710;
    }
    *puVar2 = 0;
  }
  if (in_stack_00000118._4_4_ != 0) {
    *(undefined1 *)(unaff_x19 + 0x240) = 1;
  }
code_r0x00123710:
  lVar10 = lRam0000000000a334c0;
  lVar11 = *(long *)(lRam0000000000a334c0 + 0x4000);
  func_0x000d8674(0);
  uVar9 = *(int *)(lVar11 + 0x198) - 1;
  *(uint *)(lVar11 + 0x198) = uVar9;
  uVar5 = 1 << (ulong)(uVar9 & 0x1f);
  uVar9 = *(uint *)(lVar11 + 0x19c);
  if ((uVar9 & uVar5) != 0) {
    piVar1 = (int *)(&UNK_00004af0 + lVar10);
    if ((((&UNK_00004b78)[lVar10] != '\0') && (*(int *)(&UNK_00004bd0 + lVar10) == 0)) &&
       (*(long *)(&UNK_00004b18 + lVar10) == lVar11)) {
      lVar12 = *(long *)(&UNK_00004af8 + lVar10);
      iVar7 = *piVar1;
      iVar6 = func_0x000daf30();
      if (iVar6 != 0) {
        func_0x000daf68(&UNK_00004c08 + lVar10,lVar12 + (long)iVar7 * 0x18 + -0x18);
      }
    }
    *piVar1 = *piVar1 + -1;
    uVar9 = *(uint *)(lVar11 + 0x19c);
  }
  *(uint *)(lVar11 + 0x19c) = uVar9 & uVar5 - 1;
  *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) =
       *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) + -1;
  return;
}

