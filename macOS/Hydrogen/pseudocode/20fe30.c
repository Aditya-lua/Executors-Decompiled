
void FUN_0020fe30(ulong *param_1,long *param_2)

{
  ulong *puVar1;
  undefined1 uVar2;
  undefined2 uVar3;
  undefined1 auVar4 [16];
  ulong uVar5;
  code *pcVar6;
  ulong uVar7;
  long lVar8;
  undefined8 uVar9;
  ulong uVar10;
  long lVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong unaff_x24;
  undefined2 uVar15;
  undefined8 uVar16;
  ulong uVar17;
  ulong uVar18;
  long lVar19;
  ulong uVar20;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  long *plStack0000000000000010;
  ulong uStack0000000000000038;
  ulong in_stack_00000040;
  undefined8 in_stack_00000048;
  ulong in_stack_00000050;
  ulong uStack0000000000000058;
  ulong uStack0000000000000060;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined4 uStack0000000000000088;
  undefined4 uStack000000000000008c;
  undefined4 uStack0000000000000090;
  ulong uStack0000000000000094;
  undefined4 uStack00000000000000b8;
  undefined4 uStack00000000000000bc;
  undefined4 uStack00000000000000c0;
  
  uVar9 = 0;
  uStack0000000000000038 = param_2[2];
  uVar5 = uStack0000000000000038 * 0x70;
  auVar4._8_8_ = 0;
  auVar4._0_8_ = uStack0000000000000038;
  plStack0000000000000010 = param_2;
  if ((SUB168(auVar4 * ZEXT816(0x70),8) != 0) || (0x7ffffffffffffff8 < uVar5)) {
LAB_00210204:
    func_0x007a1f00(uVar9,uVar5,&UNK_009c64c0);
code_r0x00210218:
                    /* WARNING: Does not return */
    pcVar6 = (code *)SoftwareBreakpoint(1,0x21021c);
    (*pcVar6)();
  }
  lVar19 = param_2[1];
  if (uVar5 == 0) {
    uStack0000000000000058 = 0;
    uStack0000000000000060 = 8;
  }
  else {
    uVar9 = 8;
    uStack0000000000000060 = func_0x00187bd0(uVar5,8);
    if (uStack0000000000000060 == 0) goto LAB_00210204;
    uStack0000000000000058 = uStack0000000000000038;
    if (uStack0000000000000038 != 0) {
      uVar13 = 0;
      uVar14 = 0;
      uStack0000000000000008 = 1;
      do {
        if (uVar5 == uVar13) break;
        if (*(long *)(lVar19 + uVar13) == -0x8000000000000000) {
          lVar11 = lVar19 + uVar13;
          uVar17 = *(ulong *)(lVar11 + 0x18);
          uVar12 = uVar17;
          if ((long)uVar17 < 0) {
            uStack0000000000000008 = 0;
            goto LAB_002101ec;
          }
          uVar10 = (ulong)*(ushort *)(lVar11 + 0x20);
          uVar15 = *(undefined2 *)(lVar11 + 0x22);
          uVar9 = *(undefined8 *)(lVar11 + 0x10);
          if (uVar17 == 0) {
            uVar7 = 1;
          }
          else {
            uVar7 = func_0x00187bd0(uVar17,1);
            if (uVar7 == 0) goto LAB_002101ec;
          }
          _memcpy(uVar7,uVar9,uVar17);
          uVar12 = 0x8000000000000000;
          uVar18 = uVar17;
        }
        else {
          lVar11 = lVar19 + uVar13;
          uVar12 = *(ulong *)(lVar11 + 0x10);
          if ((long)uVar12 < 0) {
            uStack0000000000000008 = 0;
LAB_002101ec:
            func_0x007a1f00(uStack0000000000000008,uVar12,&UNK_009c24c0);
            goto code_r0x00210218;
          }
          uVar2 = *(undefined1 *)(lVar11 + 0x34);
          uVar15 = *(undefined2 *)(lVar11 + 0x30);
          uVar3 = *(undefined2 *)(lVar11 + 0x32);
          uVar9 = *(undefined8 *)(lVar11 + 8);
          if (uVar12 == 0) {
            uVar17 = 1;
          }
          else {
            uVar17 = func_0x00187bd0(uVar12,1);
            if (uVar17 == 0) goto LAB_002101ec;
          }
          _memcpy(uVar17,uVar9,uVar12);
          uVar9 = 0;
          uVar20 = *(ulong *)(lVar19 + uVar13 + 0x28);
          uVar7 = uVar20 * 8;
          if ((uVar20 >> 0x3d != 0) || (0x7ffffffffffffffe < uVar7)) {
LAB_002101c8:
            func_0x007a1f00(uVar9,uVar7,&UNK_009c24c0);
            goto code_r0x00210218;
          }
          uVar16 = *(undefined8 *)(lVar19 + uVar13 + 0x20);
          if (uVar7 == 0) {
            uVar18 = 0;
            uVar10 = 2;
          }
          else {
            uVar10 = func_0x00187bd0(uVar7,2);
            uVar9 = 2;
            if (uVar10 == 0) goto LAB_002101c8;
            uVar18 = uVar20;
          }
          _memcpy(uVar10,uVar16,uVar7);
          *(undefined1 *)(unaff_x29 + -0x74) = uVar2;
          *(undefined2 *)(unaff_x29 + -0x78) = uVar15;
          *(undefined2 *)(unaff_x29 + -0x76) = uVar3;
          *(ulong *)(unaff_x29 + -0xa8) = uVar12;
          *(ulong *)(unaff_x29 + -0xa0) = uVar17;
          *(ulong *)(unaff_x29 + -0x98) = uVar12;
          *(ulong *)(unaff_x29 + -0x90) = uVar18;
          *(ulong *)(unaff_x29 + -0x88) = uVar10;
          *(ulong *)(unaff_x29 + -0x80) = uVar20;
          lVar11 = lVar19 + uVar13;
          in_stack_00000048._4_1_ = *(undefined1 *)(lVar11 + 0x68);
          if (*(long *)(lVar11 + 0x50) == -0x8000000000000000) {
            in_stack_00000040 = *(ulong *)(lVar11 + 0x58);
            unaff_x24 = *(ulong *)(lVar11 + 0x60);
            in_stack_00000050 = 0x8000000000000000;
          }
          else {
            func_0x0045cd08(unaff_x29 + -0x70);
            in_stack_00000050 = *(ulong *)(unaff_x29 + -0x70);
            in_stack_00000040 = *(ulong *)(unaff_x29 + -0x68);
            unaff_x24 = *(ulong *)(unaff_x29 + -0x60);
          }
          func_0x001a310c(unaff_x29 + -0x70,lVar19 + uVar13 + 0x38,&UNK_009c6958);
          uVar15 = (undefined2)(uVar10 >> 0x10);
          in_stack_00000078 = *(undefined8 *)(unaff_x29 + -0x7c);
          in_stack_00000070 = *(undefined8 *)(unaff_x29 + -0x84);
          in_stack_00000080 = *(undefined8 *)(unaff_x29 + -0x74);
          uStack00000000000000bc = (undefined4)*(undefined8 *)(unaff_x29 + -0x68);
          uStack00000000000000c0 = (undefined4)((ulong)*(undefined8 *)(unaff_x29 + -0x68) >> 0x20);
          uStack00000000000000b8 = (undefined4)((ulong)*(undefined8 *)(unaff_x29 + -0x70) >> 0x20);
          uStack0000000000000094 = *(ulong *)(unaff_x29 + -0x60);
          uStack0000000000000088 = uStack00000000000000b8;
          uStack000000000000008c = uStack00000000000000bc;
          uVar7 = uVar12;
          uStack0000000000000090 = uStack00000000000000c0;
        }
        puVar1 = (ulong *)(uStack0000000000000060 + uVar13);
        *(undefined8 *)((long)puVar1 + 0x2c) = in_stack_00000078;
        *(undefined8 *)((long)puVar1 + 0x24) = in_stack_00000070;
        uVar14 = uVar14 + 1;
        *puVar1 = uVar12;
        puVar1[1] = uVar17;
        puVar1[2] = uVar7;
        puVar1[3] = uVar18;
        *(short *)(puVar1 + 4) = (short)uVar10;
        *(undefined2 *)((long)puVar1 + 0x22) = uVar15;
        *(ulong *)((long)puVar1 + 0x3c) = CONCAT44(uStack000000000000008c,uStack0000000000000088);
        *(undefined8 *)((long)puVar1 + 0x34) = in_stack_00000080;
        puVar1[9] = uStack0000000000000094;
        puVar1[8] = CONCAT44(uStack0000000000000090,uStack000000000000008c);
        puVar1[10] = in_stack_00000050;
        puVar1[0xb] = in_stack_00000040;
        puVar1[0xc] = unaff_x24;
        uVar13 = uVar13 + 0x70;
        *(undefined1 *)(puVar1 + 0xd) = in_stack_00000048._4_1_;
      } while (uStack0000000000000038 != uVar14);
    }
  }
  param_1[1] = uStack0000000000000060;
  *param_1 = uStack0000000000000058;
  param_1[2] = uStack0000000000000038;
  lVar11 = uStack0000000000000038 + 1;
  lVar8 = lVar19;
  while (lVar11 = lVar11 + -1, lVar11 != 0) {
    func_0x0016af10(lVar8);
    lVar8 = lVar8 + 0x70;
  }
  if (*plStack0000000000000010 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar19,*plStack0000000000000010 * 0x70,8);
  return;
}

