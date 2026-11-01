
undefined8 thunk_FUN_006791f0(void)

{
  long lVar1;
  ulong uVar2;
  long lVar3;
  uint uVar4;
  uint uVar5;
  undefined8 uVar6;
  uint in_w8;
  long in_x9;
  uint in_w10;
  int iVar7;
  int iVar8;
  uint in_w13;
  uint uVar9;
  long lVar10;
  ulong uVar11;
  uint uVar12;
  uint uVar13;
  long unaff_x20;
  undefined1 *puVar14;
  long unaff_x21;
  long unaff_x22;
  uint unaff_w24;
  ulong unaff_x25;
  int unaff_w26;
  ulong unaff_x27;
  uint unaff_w28;
  undefined1 uStack000000000000002f;
  
  do {
    in_w13 = in_w13 | in_w10 << 3;
code_r0x006791f4:
    do {
      do {
        *(undefined1 *)(unaff_x22 + (ulong)in_w8) = *(undefined1 *)(in_x9 + (ulong)in_w13);
        in_w8 = in_w8 + 1;
        unaff_w28 = unaff_w28 + 1;
        lVar10 = 0;
        uVar5 = in_w8 * unaff_w26;
        uVar2 = *(ulong *)(unaff_x20 + 0x10);
        lVar3 = *(long *)(unaff_x20 + 0x18);
        iVar7 = (int)uVar2;
        iVar8 = iVar7 * -0x40;
        do {
          if (uVar2 + lVar10 == 0) goto code_r0x00679208;
          lVar1 = lVar10 * 8;
          iVar8 = iVar8 + 0x40;
          lVar10 = lVar10 + -1;
        } while (*(long *)(lVar3 + uVar2 * 8 + -8 + lVar1) == 0);
        if (iVar7 + (int)lVar10 == -1) {
code_r0x00679208:
          if (in_w8 != 0) {
            puVar14 = (undefined1 *)(unaff_x22 + (ulong)unaff_w28);
            do {
              uStack000000000000002f = *puVar14;
              func_0x00086db4();
              if ((unaff_w28 != 0) && ((unaff_w24 & unaff_w28) == 0)) {
                uStack000000000000002f = 0x2c;
                func_0x00086db4();
              }
              unaff_w28 = unaff_w28 - 1;
              puVar14 = puVar14 + -1;
            } while (unaff_w28 != 0xffffffff);
          }
          uVar6 = func_0x00086db4();
          if (unaff_x22 != 0) {
            if ((int)unaff_x21 != 0) {
              do {
                *(undefined1 *)(unaff_x22 + -1 + unaff_x21) = 0;
                unaff_x21 = unaff_x21 + -1;
              } while (unaff_x21 != 0);
            }
            func_0x00611644();
          }
          return uVar6;
        }
        uVar11 = *(ulong *)(lVar3 + (ulong)(uint)(iVar7 + (int)lVar10) * 8);
        if (uVar11 == 0) {
          uVar9 = -iVar8;
        }
        else {
          uVar13 = 0;
          uVar12 = 0x40;
          do {
            uVar4 = uVar13 + uVar12 >> 1;
            uVar9 = uVar4;
            if (uVar11 >> ((ulong)uVar4 & 0x3f) != 0) {
              uVar9 = uVar12;
              uVar13 = uVar4;
            }
            uVar12 = uVar9;
          } while (1 < uVar9 - uVar13);
          uVar9 = uVar9 - iVar8;
        }
        if (uVar9 <= uVar5) goto code_r0x00679208;
        if (uVar5 >> 6 < uVar2) {
          in_w13 = (uint)(*(ulong *)(lVar3 + (ulong)(uVar5 >> 6) * 8) >> ((ulong)uVar5 & 0x3f)) & 1;
        }
        else {
          in_w13 = 0;
        }
      } while ((unaff_x25 & 1) != 0);
      uVar11 = (ulong)(uVar5 + 1 >> 6);
      if (uVar11 < uVar2) {
        uVar9 = (uint)(*(ulong *)(lVar3 + uVar11 * 8) >> ((ulong)(uVar5 + 1) & 0x3f)) & 1;
      }
      else {
        uVar9 = 0;
      }
      uVar11 = (ulong)(uVar5 + 2 >> 6);
      if (uVar2 <= uVar11) {
        in_w13 = in_w13 | uVar9 << 1;
        if ((unaff_x27 & 1) == 0) break;
        goto code_r0x006791f4;
      }
      in_w13 = in_w13 | uVar9 << 1 |
               ((uint)(*(ulong *)(lVar3 + uVar11 * 8) >> ((ulong)(uVar5 + 2) & 0x3f)) & 1) << 2;
    } while ((unaff_x27 & 1) != 0);
    uVar11 = (ulong)(uVar5 + 3 >> 6);
    if (uVar11 < uVar2) {
      in_w10 = (uint)(*(ulong *)(lVar3 + uVar11 * 8) >> ((ulong)(uVar5 + 3) & 0x3f)) & 1;
    }
    else {
      in_w10 = 0;
    }
  } while( true );
}

