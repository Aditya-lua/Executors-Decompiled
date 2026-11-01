
/* WARNING: Possible PIC construction at 0x00182f8c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00182fa8: Changing call to branch */

void FUN_00183c2c(undefined8 param_1,long param_2)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  undefined1 *puVar4;
  long lVar5;
  long lVar6;
  long unaff_x19;
  ulong uVar7;
  long unaff_x20;
  long lVar8;
  undefined8 *puVar9;
  ulong unaff_x21;
  ulong uVar10;
  long unaff_x22;
  ulong unaff_x23;
  ulong uVar11;
  long unaff_x24;
  undefined8 *unaff_x25;
  
  do {
    func_0x00187bd4(param_1,param_2,1);
    puVar9 = unaff_x25;
    do {
      unaff_x25 = puVar9 + 3;
      unaff_x24 = unaff_x24 + -1;
      if (unaff_x24 == 0) {
        if (unaff_x23 < unaff_x21) {
          puVar9 = (undefined8 *)(unaff_x22 + 8);
          do {
            if (puVar9[-1] != 0) {
              func_0x00187bd4(*puVar9,puVar9[-1],1);
            }
            puVar9 = puVar9 + 3;
            unaff_x20 = unaff_x20 + -1;
          } while (unaff_x20 != 0);
        }
        if (*(long *)(unaff_x19 + 0x98) != 0) {
          func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0xa0),*(long *)(unaff_x19 + 0x98) * 0x18,8);
        }
        lVar5 = *(long *)(unaff_x19 + 0x308);
        if (lVar5 != -0x8000000000000000 && lVar5 != 0) {
          func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x310),lVar5,1);
        }
        lVar5 = *(long *)(unaff_x19 + 0x130);
        if (lVar5 == -0x8000000000000000 || lVar5 == 0) {
          uVar10 = *(ulong *)(unaff_x19 + 0x128);
          uVar7 = *(ulong *)(unaff_x19 + 0x110);
        }
        else {
          func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x138),lVar5,1);
          uVar10 = *(ulong *)(unaff_x19 + 0x128);
          uVar7 = *(ulong *)(unaff_x19 + 0x110);
        }
        if (uVar10 != 0) {
          lVar5 = *(long *)(unaff_x19 + 0x118);
          uVar3 = *(ulong *)(unaff_x19 + 0x120);
          uVar1 = 0;
          if (uVar7 <= uVar3) {
            uVar1 = uVar7;
          }
          lVar6 = uVar3 - uVar1;
          uVar11 = uVar7 - lVar6;
          lVar8 = 0;
          if (uVar11 <= uVar10) {
            lVar8 = uVar10 - uVar11;
          }
          uVar2 = uVar7;
          if (uVar10 <= uVar11) {
            uVar2 = lVar6 + uVar10;
          }
          lVar6 = uVar2 - lVar6;
          if (lVar6 != 0) {
            puVar9 = (undefined8 *)(lVar5 + uVar1 * -0x20 + uVar3 * 0x20 + 0x10);
            do {
              if (puVar9[-1] != 0) {
                func_0x00187bd4(*puVar9,puVar9[-1],1);
              }
              puVar9 = puVar9 + 4;
              lVar6 = lVar6 + -1;
            } while (lVar6 != 0);
          }
          if (uVar11 < uVar10) {
            puVar9 = (undefined8 *)(lVar5 + 0x10);
            do {
              if (puVar9[-1] != 0) {
                func_0x00187bd4(*puVar9,puVar9[-1],1);
              }
              puVar9 = puVar9 + 4;
              lVar8 = lVar8 + -1;
            } while (lVar8 != 0);
          }
        }
        if (uVar7 != 0) {
          func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x118),uVar7 << 5,8);
        }
        if (*(long *)(unaff_x19 + 0xc0) == 0) {
          if (*(char *)(unaff_x19 + 0x1f1) == '\x02') {
            if (*(char *)(unaff_x19 + 0x2a1) == '\x02') {
              return;
            }
            func_0x00252db4(unaff_x19 + 0x208);
            puVar4 = (undefined1 *)(unaff_x19 + 0x250);
          }
          else {
            func_0x00252db4(unaff_x19 + 0x158);
            puVar4 = (undefined1 *)(unaff_x19 + 0x1a0);
          }
        }
        else {
          puVar4 = (undefined1 *)(unaff_x19 + 200);
        }
        *puVar4 = 0;
        puVar4[1] = 0;
        puVar4[2] = 0;
        puVar4[3] = 0;
        puVar4[4] = 0;
        puVar4[5] = 0;
        puVar4[6] = 0;
        puVar4[7] = 0;
        puVar4[8] = 0;
        puVar4[9] = 0;
        puVar4[10] = 0;
        puVar4[0xb] = 0;
        puVar4[0xc] = 0;
        puVar4[0xd] = 0;
        puVar4[0xe] = 0;
        puVar4[0xf] = 0;
        puVar4[0x10] = 0;
        puVar4[0x11] = 0;
        puVar4[0x12] = 0;
        puVar4[0x13] = 0;
        puVar4[0x14] = 0;
        puVar4[0x15] = 0;
        puVar4[0x16] = 0;
        puVar4[0x17] = 0;
        puVar4[0x18] = 0;
        puVar4[0x19] = 0;
        puVar4[0x1a] = 0;
        puVar4[0x1b] = 0;
        puVar4[0x1c] = 0;
        puVar4[0x1d] = 0;
        puVar4[0x1e] = 0;
        puVar4[0x1f] = 0;
        puVar4[0x20] = 0;
        puVar4[0x21] = 0;
        puVar4[0x22] = 0;
        puVar4[0x23] = 0;
        puVar4[0x24] = 0;
        puVar4[0x25] = 0;
        puVar4[0x26] = 0;
        puVar4[0x27] = 0;
        puVar4[0x28] = 0;
        puVar4[0x29] = 0;
        puVar4[0x2a] = 0;
        puVar4[0x2b] = 0;
        puVar4[0x2c] = 0;
        puVar4[0x2d] = 0;
        puVar4[0x2e] = 0;
        puVar4[0x2f] = 0;
        puVar4[0x30] = 0;
        puVar4[0x31] = 0;
        puVar4[0x32] = 0;
        puVar4[0x33] = 0;
        puVar4[0x34] = 0;
        puVar4[0x35] = 0;
        puVar4[0x36] = 0;
        puVar4[0x37] = 0;
        puVar4[0x38] = 0;
        puVar4[0x39] = 0;
        puVar4[0x3a] = 0;
        puVar4[0x3b] = 0;
        puVar4[0x3c] = 0;
        puVar4[0x3d] = 0;
        puVar4[0x3e] = 0;
        puVar4[0x3f] = 0;
        return;
      }
      param_2 = puVar9[2];
      puVar9 = unaff_x25;
    } while (param_2 == 0);
    param_1 = *unaff_x25;
  } while( true );
}

