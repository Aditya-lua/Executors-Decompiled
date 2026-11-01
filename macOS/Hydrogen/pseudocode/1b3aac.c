
/* WARNING: Possible PIC construction at 0x001b3cf4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x001b4788: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x001b3cf8) */
/* WARNING: Removing unreachable block (ram,0x001b478c) */
/* WARNING: Removing unreachable block (ram,0x001b46a4) */
/* WARNING: Removing unreachable block (ram,0x001b48a4) */
/* WARNING: Removing unreachable block (ram,0x001b46b8) */
/* WARNING: Removing unreachable block (ram,0x001b46e0) */
/* WARNING: Removing unreachable block (ram,0x001b4724) */
/* WARNING: Removing unreachable block (ram,0x001b4730) */
/* WARNING: Removing unreachable block (ram,0x001b473c) */
/* WARNING: Removing unreachable block (ram,0x001b4740) */
/* WARNING: Removing unreachable block (ram,0x001b474c) */
/* WARNING: Removing unreachable block (ram,0x001b4760) */
/* WARNING: Removing unreachable block (ram,0x001b48c4) */
/* WARNING: Removing unreachable block (ram,0x001b4710) */
/* WARNING: Removing unreachable block (ram,0x001b4798) */
/* WARNING: Removing unreachable block (ram,0x001b47c0) */
/* WARNING: Removing unreachable block (ram,0x001b47e4) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_001b3aac(void)

{
  long lVar1;
  ushort uVar2;
  undefined2 uVar3;
  undefined2 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  code *pcVar8;
  bool in_ZR;
  uint uVar9;
  ulong uVar10;
  long lVar11;
  long *plVar12;
  long lVar13;
  uint uVar14;
  short in_w10;
  undefined8 *puVar15;
  ulong *unaff_x19;
  ulong unaff_x20;
  ulong uVar16;
  ulong uVar17;
  ulong unaff_x24;
  ulong unaff_x25;
  undefined1 auVar18 [16];
  ulong in_stack_00000010;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  ulong in_stack_00000030;
  undefined8 in_stack_00000038;
  
  if (in_ZR) {
    if (in_w10 == 0) {
      uVar17 = 0;
      uVar10 = 1;
    }
    else {
      uVar10 = func_0x00187bd0();
      if (uVar10 == 0) {
        func_0x007a1f00(1);
        goto LAB_001b3dcc;
      }
      uVar17 = unaff_x20;
    }
    _memcpy(uVar10);
    uStack0000000000000028._4_4_ = 0;
    uStack0000000000000028._2_2_ = 0;
    uVar16 = unaff_x24 - 1;
    unaff_x25 = unaff_x20;
  }
  else {
    if (in_w10 == 0) {
      uVar17 = 1;
    }
    else {
      uVar17 = func_0x00187bd0();
      if (uVar17 == 0) {
LAB_001b3dcc:
        auVar18 = func_0x007a1f00(1);
        plVar12 = auVar18._8_8_;
        lVar11 = auVar18._0_8_;
        uVar2 = *(ushort *)(lVar11 + 0x40);
        if (uVar2 < 5) {
          uVar14 = 0x302;
          if (uVar2 != 3) {
            uVar14 = 0x303;
          }
          uVar9 = 0x301;
          if (uVar2 != 2) {
            uVar9 = uVar14;
          }
          uVar14 = 2;
          if (uVar2 != 0) {
            uVar14 = 0x300;
          }
          if (uVar2 < 2) {
            uVar9 = uVar14;
          }
        }
        else if (uVar2 < 7) {
          uVar9 = 0x304;
          if (uVar2 != 5) {
            uVar9 = 0xfeff;
          }
        }
        else if (uVar2 == 7) {
          uVar9 = 0xfefd;
        }
        else if (uVar2 == 8) {
          uVar9 = 0xfefc;
        }
        else {
          uVar9 = (uint)*(ushort *)(lVar11 + 0x42);
        }
        lVar13 = plVar12[2];
        if ((ulong)(*plVar12 - lVar13) < 2) {
          func_0x0079b61c(plVar12,lVar13,2,1,1);
          lVar13 = plVar12[2];
        }
        *(ushort *)(plVar12[1] + lVar13) = (ushort)(uVar9 >> 8) | (ushort)((uVar9 & 0xff00ff) << 8);
        lVar13 = lVar13 + 2;
        plVar12[2] = lVar13;
        if ((ulong)(*plVar12 - lVar13) < 0x20) {
          func_0x0079b61c(plVar12,lVar13,0x20,1,1);
          lVar13 = plVar12[2];
        }
        uVar7 = _UNK_0081ddb8;
        uVar6 = _UNK_0081ddb0;
        uVar5 = _UNK_0081dda0;
        puVar15 = (undefined8 *)(plVar12[1] + lVar13);
        puVar15[1] = _UNK_0081dda8;
        *puVar15 = uVar5;
        puVar15[3] = uVar7;
        puVar15[2] = uVar6;
        lVar1 = lVar13 + 0x20;
        plVar12[2] = lVar1;
        uVar17 = *(ulong *)(lVar11 + 0x38);
        if (lVar1 == *plVar12) {
          func_0x00458a18(plVar12,&UNK_009c25a8);
        }
        *(char *)(plVar12[1] + lVar1) = (char)uVar17;
        lVar13 = lVar13 + 0x21;
        plVar12[2] = lVar13;
        if (0x20 < uVar17) {
          func_0x007a28b0(uVar17,0x20,&UNK_009c25c0);
                    /* WARNING: Does not return */
          pcVar8 = (code *)SoftwareBreakpoint(1,0x1b48dc);
          (*pcVar8)();
        }
        if ((ulong)(*plVar12 - lVar13) < uVar17) {
          func_0x0079b61c(plVar12,lVar13,uVar17,1,1);
          lVar13 = plVar12[2];
        }
        _memcpy(plVar12[1] + lVar13,lVar11 + 0x18,uVar17);
        lVar13 = lVar13 + uVar17;
        plVar12[2] = lVar13;
        uVar3 = *(undefined2 *)(lVar11 + 0x44);
        uVar4 = *(undefined2 *)(lVar11 + 0x46);
        if ((ulong)(*plVar12 - lVar13) < 2) {
          func_0x0079b61c(plVar12,lVar13,2,1,1);
          lVar13 = plVar12[2];
        }
        uVar9 = func_0x001f5ae0(uVar3,uVar4);
        *(ushort *)(plVar12[1] + lVar13) =
             (ushort)(uVar9 >> 8) & 0xff | (ushort)((uVar9 & 0xff00ff) << 8);
        lVar1 = lVar13 + 2;
        plVar12[2] = lVar1;
        if (lVar1 == *plVar12) {
          func_0x00458a18(plVar12,&UNK_009c9a90);
        }
        *(undefined1 *)(plVar12[1] + lVar1) = 0;
        plVar12[2] = lVar13 + 3;
        func_0x001a777c(lVar11,plVar12);
        return;
      }
    }
    _memcpy(uVar17);
    uStack0000000000000028._2_2_ = (undefined2)(uVar17 >> 0x10);
    uStack0000000000000028._4_4_ = (undefined4)(uVar17 >> 0x20);
    uVar16 = unaff_x20;
    uVar10 = unaff_x20;
  }
  uStack0000000000000028._0_2_ = (undefined2)uVar17;
  if (in_stack_00000010 <= unaff_x20) {
    unaff_x19[1] = CONCAT44(uStack0000000000000028._4_4_,
                            CONCAT22(uStack0000000000000028._2_2_,(undefined2)uStack0000000000000028
                                    ));
    *unaff_x19 = uVar16;
    unaff_x19[3] = unaff_x25;
    unaff_x19[2] = uVar10;
    return;
  }
  puVar15 = &uStack0000000000000020;
  in_stack_00000030 = uVar10;
  *(undefined1 *)(unaff_x19 + 1) = 0xf;
  unaff_x19[2] = (ulong)&UNK_0081deac;
  unaff_x19[3] = 0x13;
  uVar17 = uVar16 + 0x7fffffffffffffff;
  if (3 < uVar17) {
    uVar17 = 4;
  }
  *unaff_x19 = unaff_x24;
  if ((long)uVar17 < 2) {
    if (uVar17 == 0) {
      return;
    }
    if (uVar17 != 1) goto LAB_001b3ce4;
  }
  else {
    if (uVar17 == 2) {
      return;
    }
    if (uVar17 != 3) goto LAB_001b3ce4;
  }
  puVar15 = &uStack0000000000000028;
  uVar16 = CONCAT44(uStack0000000000000028._4_4_,
                    CONCAT22(uStack0000000000000028._2_2_,(undefined2)uStack0000000000000028));
LAB_001b3ce4:
  if (uVar16 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(puVar15[1],uVar16,1);
  return;
}

