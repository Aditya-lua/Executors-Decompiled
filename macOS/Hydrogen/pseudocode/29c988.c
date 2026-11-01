
void FUN_0029c988(long param_1,undefined1 param_2 [16],undefined1 param_3 [16],
                 undefined1 param_4 [16],undefined1 param_5 [16],undefined1 param_6 [16],
                 undefined1 param_7 [16],undefined1 param_8 [16],undefined1 param_9 [16],
                 ulong *param_10)

{
  ulong *puVar1;
  ulong uVar2;
  ulong in_x9;
  long in_x10;
  long in_x11;
  undefined8 *in_x12;
  undefined1 (*in_x13) [16];
  byte *unaff_x20;
  long lVar3;
  ulong uVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  long lVar12;
  long lVar13;
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  undefined1 in_q16 [16];
  undefined1 auVar16 [16];
  
  lVar13 = param_6._8_8_;
  lVar12 = param_6._0_8_;
  lVar11 = param_5._8_8_;
  lVar10 = param_5._0_8_;
  lVar9 = param_4._8_8_;
  lVar8 = param_4._0_8_;
  lVar7 = param_3._8_8_;
  lVar6 = param_3._0_8_;
  lVar5 = param_2._8_8_;
  lVar3 = param_2._0_8_;
  while( true ) {
    auVar14 = NEON_rev64(param_8,1);
    auVar15 = NEON_rev64(param_9,1);
    auVar16 = NEON_rev64(in_q16,1);
    in_x12[-3] = param_7._8_8_;
    in_x12[-4] = param_7._0_8_;
    in_x12[-1] = auVar14._8_8_;
    in_x12[-2] = auVar14._0_8_;
    in_x12[1] = auVar15._8_8_;
    *in_x12 = auVar15._0_8_;
    in_x12[3] = auVar16._8_8_;
    in_x12[2] = auVar16._0_8_;
    lVar6 = lVar6 + lVar8;
    lVar7 = lVar7 + lVar9;
    lVar3 = lVar3 + lVar8;
    lVar5 = lVar5 + lVar9;
    lVar10 = lVar10 + lVar8;
    lVar11 = lVar11 + lVar9;
    lVar12 = lVar12 + lVar8;
    lVar13 = lVar13 + lVar9;
    param_1 = param_1 + -8;
    if (param_1 == 0) break;
    auVar14 = in_x13[-4];
    auVar15 = NEON_ext(in_x13[-3],in_x13[-3],8,1);
    param_8 = NEON_ext(auVar14,auVar14,8,1);
    param_9 = NEON_ext(in_x13[-5],in_x13[-5],8,1);
    in_q16 = NEON_ext(in_x13[-6],in_x13[-6],8,1);
    param_7 = NEON_rev64(auVar15,1);
    in_x12 = in_x12 + 8;
    in_x13 = in_x13 + -4;
  }
  uVar4 = lVar11 + lVar10 + lVar6 + lVar7 + lVar13 + lVar12 + lVar3 + lVar5;
  if (in_x10 != in_x11) {
    puVar1 = param_10;
    uVar2 = in_x9;
    do {
      in_x9 = uVar2 - 8;
      uVar2 = (*(ulong *)(unaff_x20 + (uVar2 - 8)) & 0xff00ff00ff00ff00) >> 8 |
              (*(ulong *)(unaff_x20 + (uVar2 - 8)) & 0xff00ff00ff00ff) << 8;
      uVar2 = (uVar2 & 0xffff0000ffff0000) >> 0x10 | (uVar2 & 0xffff0000ffff) << 0x10;
      param_10 = puVar1 + 1;
      *puVar1 = uVar2 >> 0x20 | uVar2 << 0x20;
      uVar4 = uVar4 - 1;
      puVar1 = param_10;
      uVar2 = in_x9;
    } while (7 < in_x9);
  }
  puVar1 = param_10;
  if (in_x9 != 0) {
    uVar2 = 0;
    do {
      uVar2 = (ulong)*unaff_x20 | uVar2 << 8;
      in_x9 = in_x9 - 1;
      unaff_x20 = unaff_x20 + 1;
    } while (in_x9 != 0);
    puVar1 = param_10 + 1;
    *param_10 = uVar2;
    uVar4 = uVar4 - 1;
  }
  if ((uVar4 & 0x1fffffffffffffff) != 0) {
    _bzero(puVar1);
  }
  return;
}

