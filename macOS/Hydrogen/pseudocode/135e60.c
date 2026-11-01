
void FUN_00135e60(ulong param_1)

{
  ulong uVar1;
  bool bVar2;
  int iVar3;
  undefined8 uVar4;
  undefined1 uVar5;
  long lVar6;
  long lVar7;
  uint uVar8;
  undefined4 *puVar9;
  ulong uVar10;
  ulong uVar11;
  long unaff_x21;
  uint *unaff_x22;
  long *unaff_x23;
  uint unaff_w24;
  long unaff_x25;
  uint uVar12;
  ulong unaff_x26;
  long unaff_x27;
  uint unaff_w28;
  float fVar13;
  float fVar14;
  undefined4 unaff_s9;
  undefined4 unaff_s10;
  float unaff_s11;
  float unaff_s12;
  float unaff_s13;
  undefined4 *in_stack_00000000;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined4 uStack0000000000000020;
  float in_stack_00000028;
  
  do {
    uVar4 = func_0x000bba44(0x3f800000,param_1);
    uStack0000000000000008._4_4_ = (float)(int)unaff_s13;
    uStack0000000000000010._0_4_ = unaff_s9;
    uStack0000000000000010._4_4_ = uStack0000000000000008._4_4_;
    uStack0000000000000018._0_4_ = unaff_s10;
    func_0x000f397c(0x3f800000,*(undefined8 *)(unaff_x21 + 0x2a8),(long)&uStack0000000000000010 + 4,
                    (long)&uStack0000000000000008 + 4,uVar4);
    do {
      unaff_x27 = unaff_x27 + 1;
      uVar8 = unaff_x22[4];
      unaff_x25 = unaff_x25 + 0x1c;
      uVar12 = (uint)unaff_x26;
      if ((int)uVar8 <= unaff_x27) {
        if (uVar12 == 0xffffffff) {
          uVar5 = 0;
          goto LAB_00135fb0;
        }
        if ((*(char *)((long)unaff_x22 + 9) != '\0') || ((int)uVar8 < 0)) goto LAB_00136084;
        lVar6 = *(long *)(unaff_x22 + 0x1a);
        uVar1 = (ulong)uVar8 + 1;
        if (uVar8 < 3) {
          uVar10 = 0;
          goto LAB_00136064;
        }
        uVar10 = uVar1 & 0xfffffffc;
        puVar9 = (undefined4 *)(lVar6 + 0x38);
        uVar11 = uVar10;
        do {
          puVar9[-0xd] = puVar9[-0xe];
          puVar9[-6] = puVar9[-7];
          puVar9[1] = *puVar9;
          puVar9[8] = puVar9[7];
          puVar9 = puVar9 + 0x1c;
          uVar11 = uVar11 - 4;
        } while (uVar11 != 0);
        if (uVar10 != uVar1) {
LAB_00136064:
          lVar7 = uVar1 - uVar10;
          puVar9 = (undefined4 *)(lVar6 + uVar10 * 0x1c + 4);
          do {
            *puVar9 = puVar9[-1];
            lVar7 = lVar7 + -1;
            puVar9 = puVar9 + 7;
          } while (lVar7 != 0);
        }
LAB_00136084:
        *(undefined1 *)((long)unaff_x22 + 9) = 1;
        lVar7 = *unaff_x23;
        fVar13 = ((*(float *)(lVar7 + 0xe40) - *(float *)(&UNK_00004078 + lVar7)) + 4.0) -
                 *(float *)(*(long *)(lVar7 + 0x4000) + 0x28);
        lVar6 = *(long *)(*(long *)(lVar7 + 0x4000) + 0x1b8);
        if (lVar6 == 0) {
          fVar14 = 0.0;
        }
        else {
          if ((int)uVar12 < 1) {
            iVar3 = *(int *)(lVar6 + 0xc);
          }
          else {
            iVar3 = uVar12 - 1;
          }
          fVar14 = *(float *)(lVar6 + 0x14) +
                   *(float *)(*(long *)(lVar6 + 0x68) + (long)iVar3 * 0x1c) *
                   (*(float *)(lVar6 + 0x18) - *(float *)(lVar6 + 0x14));
        }
        fVar14 = fVar14 + *(float *)(&UNK_00003958 + lVar7);
        if (fVar13 < fVar14) {
          fVar13 = fVar14;
        }
        if (((byte)unaff_x22[1] >> 2 & 1) != 0) {
          if (lVar6 == 0) {
            fVar14 = 0.0;
          }
          else {
            if ((int)uVar12 < -1) {
              iVar3 = *(int *)(lVar6 + 0xc);
            }
            else {
              iVar3 = uVar12 + 1;
            }
            fVar14 = *(float *)(lVar6 + 0x14) +
                     *(float *)(*(long *)(lVar6 + 0x68) + (long)iVar3 * 0x1c) *
                     (*(float *)(lVar6 + 0x18) - *(float *)(lVar6 + 0x14));
          }
          fVar14 = fVar14 - *(float *)(&UNK_00003958 + lVar7);
          if (fVar14 <= fVar13) {
            fVar13 = fVar14;
          }
        }
        func_0x001350bc(fVar13,unaff_x26);
        uVar5 = 1;
LAB_00135fb0:
        *(undefined1 *)((long)unaff_x22 + 9) = uVar5;
        *(undefined8 *)(unaff_x21 + 0x230) = *(undefined8 *)(unaff_x21 + 0x240);
        *(undefined8 *)(unaff_x21 + 0x228) = *(undefined8 *)(unaff_x21 + 0x238);
        uVar4 = *(undefined8 *)(unaff_x22 + 0x13);
        *(undefined8 *)(unaff_x21 + 0x240) = *(undefined8 *)(unaff_x22 + 0x15);
        *(undefined8 *)(unaff_x21 + 0x238) = uVar4;
        *(undefined8 *)(unaff_x21 + 0x1b8) = 0;
        *(undefined4 *)(unaff_x21 + 0x158) = 0;
        *(float *)(unaff_x21 + 0x110) =
             (float)(int)(*(float *)(unaff_x21 + 0x28) + *(float *)(unaff_x21 + 0x154) + 0.0);
        func_0x000daf00();
        return;
      }
      lVar6 = *(long *)(*(long *)(*unaff_x23 + 0x4000) + 0x1b8);
      if (lVar6 == 0) {
        fVar13 = 0.0;
      }
      else {
        fVar13 = *(float *)(lVar6 + 0x14) +
                 *(float *)(*(long *)(lVar6 + 0x68) + unaff_x25 + 0x1c) *
                 (*(float *)(lVar6 + 0x18) - *(float *)(lVar6 + 0x14));
      }
      lVar6 = *(long *)(unaff_x22 + 0x1a);
      unaff_s13 = *(float *)(unaff_x21 + 0x28) + fVar13;
      uVar8 = *unaff_x22;
      uStack0000000000000020 = unaff_s13 + unaff_s11;
      in_stack_00000028 = unaff_s13 + unaff_s12;
      iVar3 = func_0x000d0e24(&uStack0000000000000020,unaff_x27 + (ulong)uVar8,0,8);
    } while (iVar3 == 0);
    uStack0000000000000018._6_2_ = 0;
    if ((unaff_w24 >> 1 & 1) == 0) {
      func_0x0010b53c(&uStack0000000000000020,unaff_x27 + (ulong)uVar8,
                      (long)&uStack0000000000000018 + 7,(long)&uStack0000000000000018 + 6,0);
      bVar2 = uStack0000000000000018._6_1_ == '\0';
      if (uStack0000000000000018._7_1_ == '\0' && uStack0000000000000018._6_1_ == '\0')
      goto LAB_00135f48;
      *in_stack_00000000 = 4;
      if (uStack0000000000000018._6_1_ != '\0') {
        uVar8 = (uint)unaff_x27;
        if ((*(byte *)(lVar6 + unaff_x25 + 0x24) & 2) != 0) {
          uVar8 = uVar12;
        }
        unaff_x26 = (ulong)uVar8;
      }
      if (uStack0000000000000018._7_1_ == '\0') goto LAB_00135f4c;
      uVar8 = 0x1c;
    }
    else {
LAB_00135f48:
      bVar2 = true;
LAB_00135f4c:
      uVar8 = 0x1b;
    }
    if (!bVar2) {
      uVar8 = unaff_w28;
    }
    param_1 = (ulong)uVar8;
  } while( true );
}

