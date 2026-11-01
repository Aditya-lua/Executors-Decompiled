
/* WARNING: Removing unreachable block (ram,0x000fdd44) */

undefined8
FUN_000fdb3c(long param_1,float param_2,undefined1 param_3 [16],float param_4,
            undefined1 param_5 [16],undefined1 param_6 [16],float param_7,float param_8,
            float param_9,float *param_10,undefined8 param_11,long param_12)

{
  int iVar1;
  undefined8 *puVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  uint uVar7;
  bool bVar8;
  long lVar9;
  undefined8 *extraout_x1;
  uint *puVar10;
  uint uVar11;
  float *in_x11;
  int in_w12;
  float *in_x16;
  char *in_x17;
  long lVar12;
  ulong uVar13;
  long unaff_x20;
  long *plVar14;
  long lVar15;
  undefined8 *unaff_x23;
  long unaff_x24;
  long *unaff_x26;
  int *unaff_x27;
  long *unaff_x28;
  long unaff_x29;
  float fVar16;
  undefined4 extraout_s0;
  float fVar17;
  float fVar18;
  float fVar19;
  undefined4 uVar20;
  ulong uVar21;
  float fVar22;
  undefined8 uVar23;
  undefined1 auVar24 [16];
  float fVar25;
  float fVar26;
  float fVar27;
  undefined8 uVar28;
  float unaff_s12;
  float in_s17;
  undefined1 auVar29 [12];
  long in_stack_00000098;
  ulong in_stack_00000148;
  long in_stack_00000150;
  ulong in_stack_00000158;
  undefined8 in_stack_00000160;
  float *in_stack_00000168;
  char *in_stack_00000170;
  float *in_stack_00000178;
  float *in_stack_00000180;
  undefined8 *in_stack_00000198;
  undefined8 in_stack_000001b0;
  undefined1 uStack00000000000001c0;
  long in_stack_000001c8;
  undefined1 uStack00000000000001d0;
  undefined1 uStack00000000000001e0;
  long in_stack_000001e8;
  undefined1 uStack00000000000001f0;
  
  uVar28 = param_3._8_8_;
  uVar23 = param_3._0_8_;
  do {
    fVar18 = (float)((ulong)uVar28 >> 0x20) - (float)((ulong)uVar23 >> 0x20);
    uVar21 = (ulong)(uint)fVar18;
    *(int *)(unaff_x23 + 0xe) =
         *(int *)(unaff_x23 + 0xe) +
         (int)(param_2 + (float)*(int *)(param_1 + 0x44) * fVar18) *
         (int)(param_2 + (float)*(int *)(param_1 + 0x40) * param_4);
    unaff_x24 = unaff_x24 + 1;
    unaff_x20 = unaff_x20 + 0x1c;
    if (*unaff_x27 <= unaff_x24) {
      do {
        while( true ) {
          in_stack_00000158 = in_stack_00000158 + 1;
          if (in_stack_00000148 <= in_stack_00000158) {
            uVar13 = 0;
            plVar14 = (long *)(in_stack_00000150 + 0x108);
            do {
              if (*plVar14 != 0) {
                func_0x000b83d4();
              }
              if (plVar14[-2] != 0) {
                func_0x000b83d4();
              }
              uVar20 = (undefined4)uVar21;
              uVar13 = uVar13 + 1;
              plVar14 = plVar14 + 0x22;
            } while (uVar13 < in_stack_00000148);
            func_0x000b83d4(in_stack_00000150);
            func_0x000ff328(in_stack_00000098);
            if (in_stack_000001c8 != 0) {
              func_0x000b83d4();
            }
            if (in_stack_000001e8 != 0) {
              func_0x000b83d4();
            }
            if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0xa0)) {
              return 1;
            }
            auVar29 = ___stack_chk_fail();
            uVar23 = auVar29._0_8_;
            if (auVar29._8_4_ != 0) {
              uVar23 = func_0x0001753c(uVar23);
              func_0x00107f38(&uStack00000000000001c0);
              func_0x000fe6a4(&uStack00000000000001d0);
              func_0x00107f68(&uStack00000000000001e0);
              func_0x00107f98(&uStack00000000000001f0);
            }
            uVar23 = __Unwind_Resume(uVar23);
            if (*(char *)(param_12 + 0x48) != '\0') {
              return uVar23;
            }
            extraout_x1[2] = 0;
            if (extraout_x1[6] != 0) {
              extraout_x1[5] = 0;
              func_0x000b83d4();
              extraout_x1[6] = 0;
            }
            if (extraout_x1[1] != 0) {
              *extraout_x1 = 0;
              func_0x000b83d4();
              extraout_x1[1] = 0;
            }
            uVar28 = 0;
            if (extraout_x1[4] != 0) {
              extraout_x1[3] = 0;
              uVar28 = func_0x000b83d4();
              extraout_x1[4] = 0;
            }
            extraout_x1[7] = 0;
            extraout_x1[8] = 0;
            *(undefined1 *)(extraout_x1 + 0xc) = 1;
            *(undefined4 *)(extraout_x1 + 0xe) = 0;
            *(undefined4 *)((long)extraout_x1 + 0x14) = *(undefined4 *)(param_12 + 0x14);
            extraout_x1[8] = uVar23;
            *(undefined4 *)(extraout_x1 + 0xd) = extraout_s0;
            *(undefined4 *)((long)extraout_x1 + 0x6c) = uVar20;
            return uVar28;
          }
          lVar9 = in_stack_00000150 + in_stack_00000158 * 0x110;
          lVar15 = *(long *)(in_stack_00000098 + 0x80);
          lVar12 = lVar15 + in_stack_00000158 * 0x90;
          fVar18 = *(float *)(lVar12 + 0x14);
          unaff_x23 = *(undefined8 **)(lVar12 + 0x88);
          lVar9 = *(long *)(lVar9 + 8) + (long)*(int *)(lVar9 + 0x24);
          uVar7 = (int)(short)((ushort)*(byte *)(lVar9 + 4) << 8) | (uint)*(byte *)(lVar9 + 5);
          uVar11 = (int)(short)((ushort)*(byte *)(lVar9 + 6) << 8) | (uint)*(byte *)(lVar9 + 7);
          uVar21 = 0xbf800000;
          fVar19 = -1.0;
          if (0 < (int)uVar7) {
            fVar19 = 1.0;
          }
          fVar26 = -1.0;
          if (0 < (int)uVar11) {
            fVar26 = 1.0;
          }
          if (*(char *)(lVar12 + 0x48) == '\0') break;
          fVar19 = *(float *)(unaff_x23 + 0xd);
          unaff_x27 = (int *)(in_stack_00000150 + in_stack_00000158 * 0x110 + 0xe8);
          if (0 < *unaff_x27) goto code_r0x000fda44;
        }
        unaff_x23[2] = 0;
        if (unaff_x23[6] != 0) {
          unaff_x23[5] = 0;
          func_0x000b83d4();
          unaff_x23[6] = 0;
          param_7 = 0.5;
          param_8 = 0.0;
        }
        if (unaff_x23[1] != 0) {
          *unaff_x23 = 0;
          func_0x000b83d4();
          unaff_x23[1] = 0;
          param_7 = 0.5;
          param_8 = 0.0;
        }
        if (unaff_x23[4] != 0) {
          unaff_x23[3] = 0;
          func_0x000b83d4();
          unaff_x23[4] = 0;
          param_7 = 0.5;
          param_8 = 0.0;
        }
        fVar18 = fVar18 / (float)(int)(uVar7 - uVar11);
        fVar19 = (float)(int)(fVar19 + fVar18 * (float)(int)uVar7);
        unaff_x23[7] = 0;
        unaff_x23[8] = 0;
        *(undefined1 *)(unaff_x23 + 0xc) = 1;
        *(undefined4 *)(unaff_x23 + 0xe) = 0;
        *(float *)((long)unaff_x23 + 0x14) = *(float *)(lVar12 + 0x14);
        unaff_x23[8] = in_stack_00000098;
        fVar18 = (float)(int)(fVar26 + fVar18 * (float)(int)uVar11);
        uVar21 = (ulong)(uint)fVar18;
        *(float *)(unaff_x23 + 0xd) = fVar19;
        *(float *)((long)unaff_x23 + 0x6c) = fVar18;
        in_w12 = 0x28;
        unaff_x27 = (int *)(in_stack_00000150 + in_stack_00000158 * 0x110 + 0xe8);
      } while (*unaff_x27 < 1);
code_r0x000fda44:
      unaff_x20 = 0;
      unaff_x24 = 0;
      lVar9 = lVar15 + in_stack_00000158 * 0x90;
      param_9 = *(float *)(lVar9 + 0x2c);
      unaff_s12 = *(float *)(lVar9 + 0x30) + (float)(int)(fVar19 + param_7);
      lVar12 = in_stack_00000150 + in_stack_00000158 * 0x110;
      unaff_x26 = (long *)(lVar12 + 0x108);
      unaff_x28 = (long *)(lVar12 + 0xd0);
      lVar15 = lVar15 + in_stack_00000158 * 0x90;
      in_s17 = 1.0 / *(float *)(lVar9 + 0x54);
      in_x11 = (float *)(lVar15 + 0x40);
      in_x16 = (float *)(lVar15 + 0x44);
      in_x17 = (char *)(lVar15 + 0x20);
      param_10 = (float *)(lVar15 + 0x24);
      in_stack_00000160._4_4_ = in_s17;
      in_stack_00000168 = param_10;
      in_stack_00000170 = in_x17;
      in_stack_00000178 = in_x16;
      in_stack_00000180 = in_x11;
    }
    puVar2 = (undefined8 *)(*unaff_x28 + unaff_x20);
    fVar27 = param_9 + in_s17 * (*(float *)(puVar2 + 1) + param_8);
    fVar26 = param_9 + in_s17 * (*(float *)((long)puVar2 + 0x14) + param_8);
    fVar19 = in_s17 * *(float *)(puVar2 + 2);
    fVar18 = *in_x16;
    if (fVar19 <= *in_x16) {
      fVar18 = fVar19;
    }
    fVar16 = *in_x11;
    if (*in_x11 <= fVar19) {
      fVar16 = fVar18;
    }
    if (fVar16 != fVar19) {
      fVar18 = (fVar16 - fVar19) * param_7;
      if (*in_x17 != '\0') {
        fVar18 = (float)(int)fVar18;
      }
      fVar27 = fVar27 + fVar18;
      fVar26 = fVar26 + fVar18;
    }
    uVar7 = *(uint *)(*unaff_x26 + unaff_x24 * 4);
    fVar19 = *(float *)((long)puVar2 + 0xc);
    fVar18 = *(float *)(puVar2 + 3);
    uVar23 = *in_stack_00000198;
    uVar28 = *puVar2;
    if (*in_x17 != '\0') {
      fVar16 = (float)(int)(fVar16 + param_7);
    }
    fVar25 = *param_10;
    iVar5 = *(int *)(unaff_x23 + 5);
    iVar6 = *(int *)((long)unaff_x23 + 0x2c);
    iVar1 = iVar5 + 1;
    if (iVar5 < iVar6) {
      lVar9 = unaff_x23[6];
    }
    else {
      iVar3 = iVar6;
      if (iVar6 < 0) {
        iVar3 = iVar6 + 1;
      }
      iVar4 = 8;
      if (iVar6 != 0) {
        iVar4 = iVar6 + (iVar3 >> 1);
      }
      if (iVar4 <= iVar1) {
        iVar4 = iVar1;
      }
      lVar9 = func_0x000b810c((long)iVar4 * 0x28);
      if (unaff_x23[6] != 0) {
        param_12 = (long)*(int *)(unaff_x23 + 5) * 0x28;
        _memcpy(lVar9);
        func_0x000b83d4(unaff_x23[6]);
      }
      unaff_x23[6] = lVar9;
      *(int *)((long)unaff_x23 + 0x2c) = iVar4;
      param_7 = 0.5;
      param_8 = 0.0;
      in_w12 = 0x28;
      param_10 = in_stack_00000168;
      in_x11 = in_stack_00000180;
      in_x16 = in_stack_00000178;
      in_x17 = in_stack_00000170;
      in_s17 = in_stack_00000160._4_4_;
    }
    uVar23 = NEON_scvtf(uVar23,4);
    param_4 = (float)in_stack_000001b0 / (float)uVar23;
    fVar22 = (float)((ulong)in_stack_000001b0 >> 0x20) / (float)((ulong)uVar23 >> 0x20);
    auVar24._2_2_ = 0;
    auVar24._0_2_ = (ushort)uVar28;
    auVar24._4_2_ = (short)((ulong)uVar28 >> 0x10);
    auVar24._6_2_ = 0;
    auVar24._8_2_ = (short)((ulong)uVar28 >> 0x20);
    auVar24._10_2_ = 0;
    auVar24._12_2_ = (short)((ulong)uVar28 >> 0x30);
    auVar24._14_2_ = 0;
    auVar24 = NEON_ucvtf(auVar24,4);
    fVar17 = param_4 * auVar24._0_4_;
    uVar23 = CONCAT44(fVar22 * auVar24._4_4_,fVar17);
    param_4 = param_4 * auVar24._8_4_;
    uVar28 = CONCAT44(fVar22 * auVar24._12_4_,param_4);
    fVar19 = unaff_s12 + in_s17 * (fVar19 + param_8);
    fVar18 = unaff_s12 + in_s17 * (fVar18 + param_8);
    *(int *)(unaff_x23 + 5) = iVar1;
    puVar10 = (uint *)(lVar9 + (long)iVar5 * (long)in_w12);
    bVar8 = true;
    if ((fVar27 != fVar26) && (bVar8 = false, !NAN(fVar19) && !NAN(fVar18))) {
      bVar8 = fVar19 == fVar18;
    }
    uVar11 = 2;
    if (bVar8) {
      uVar11 = 0;
    }
    *puVar10 = uVar11 | (uVar7 & 0xffff) << 2;
    puVar10[3] = (uint)fVar19;
    puVar10[4] = (uint)fVar26;
    puVar10[5] = (uint)fVar18;
    *(undefined8 *)(puVar10 + 8) = uVar28;
    *(undefined8 *)(puVar10 + 6) = uVar23;
    puVar10[1] = (uint)(fVar16 + fVar25);
    puVar10[2] = (uint)fVar27;
    param_1 = unaff_x23[8];
    param_2 = (float)*(int *)(param_1 + 0x14) + 0.99;
    *(undefined1 *)(unaff_x23 + 0xc) = 1;
    param_4 = param_4 - fVar17;
  } while( true );
}

