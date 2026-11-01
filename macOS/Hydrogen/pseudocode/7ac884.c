
/* WARNING: Removing unreachable block (ram,0x007acb5c) */

undefined8
FUN_007ac884(undefined8 param_1,undefined8 param_2,long param_3,ulong param_4,undefined8 param_5)

{
  ulong *puVar1;
  byte bVar2;
  code *pcVar3;
  bool bVar4;
  long *plVar5;
  long lVar6;
  ulong uVar7;
  undefined8 uVar8;
  long lVar9;
  ulong uVar10;
  ulong uVar11;
  long lVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  undefined1 auVar16 [16];
  undefined1 uStack0000000000000020;
  long lStack_98;
  ulong uStack_90;
  long *plStack_88;
  ulong *puStack_80;
  ulong uStack_78;
  long lStack_70;
  ulong uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  
  func_0x00593904(&uStack0000000000000020);
  auVar16 = __Unwind_Resume();
  plVar5 = auVar16._0_8_;
  plStack_88 = &lStack_98;
  uVar14 = plVar5[3];
  lStack_98 = param_3;
  uStack_90 = param_4;
  if (CARRY8(uVar14,auVar16._8_8_)) {
code_r0x007acb60:
    uVar8 = func_0x005e3258(param_5);
  }
  else {
    uVar10 = uVar14 + auVar16._8_8_;
    uVar13 = plVar5[1];
    uVar7 = uVar13;
    if (7 < uVar13) {
      uVar7 = (uVar13 + 1 >> 3) * 7;
    }
    if (uVar7 >> 1 < uVar10) {
      if (uVar10 < uVar7 + 1) {
        uVar10 = uVar7 + 1;
      }
      if (uVar10 < 8) {
        uVar7 = 4;
        if (3 < uVar10) {
          uVar7 = 8;
        }
      }
      else {
        if ((uVar10 >> 0x3d != 0) ||
           (uVar7 = 0xffffffffffffffff >> (LZCOUNT((uVar10 * 8) / 7 - 1) & 0x3fU),
           0x1ffffffffffffffe < uVar7)) goto code_r0x007acb60;
        uVar7 = uVar7 + 1;
      }
      uVar15 = uVar7 * 8;
      uVar10 = uVar7 + 8;
      if (CARRY8(uVar15,uVar10)) goto code_r0x007acb60;
      lVar6 = func_0x00187bd0(uVar15 + uVar10,8);
      if (lVar6 == 0) {
        uVar8 = func_0x005e329c(param_5,8,uVar15 + uVar10);
        return uVar8;
      }
      puVar1 = (ulong *)(lVar6 + uVar15);
      _memset(puVar1,0xff,uVar10);
      uStack_78 = uVar7 - 1;
      uVar10 = uStack_78;
      if (8 < uVar7) {
        uVar10 = (uVar7 >> 3) * 7;
      }
      lStack_70 = uVar10 - uVar14;
      uStack_58 = 8;
      uStack_60 = 8;
      puStack_80 = puVar1;
      uStack_68 = uVar14;
      if (uVar13 == 0xffffffffffffffff) {
        lVar6 = *plVar5;
        lVar12 = -1;
        *plVar5 = (long)puVar1;
        plVar5[1] = uStack_78;
        plVar5[2] = lStack_70;
        plVar5[3] = uVar14;
      }
      else {
        lVar6 = *plVar5;
        uVar10 = 0;
        do {
          if (-1 < *(char *)(lVar6 + uVar10)) {
            uVar7 = *(ulong *)(lVar6 + uVar10 * -8 + -8);
            if (uStack_90 <= uVar7) {
              func_0x007a2570(uVar7,uStack_90,&UNK_009f1438);
                    /* WARNING: Does not return */
              pcVar3 = (code *)SoftwareBreakpoint(1,0x7acb7c);
              (*pcVar3)();
            }
            uVar15 = *(ulong *)(lStack_98 + uVar7 * 0x10);
            uVar11 = uStack_78 & uVar15;
            uVar7 = *(ulong *)((long)puVar1 + uVar11) & 0x8080808080808080;
            if (uVar7 == 0) {
              lVar6 = 8;
              do {
                uVar11 = uVar11 + lVar6 & uStack_78;
                lVar6 = lVar6 + 8;
                uVar7 = *(ulong *)((long)puVar1 + uVar11) & 0x8080808080808080;
              } while (uVar7 == 0);
            }
            uVar7 = (uVar7 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 >> 7 & 0xff00ff00ff00ff) << 8;
            uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
            uVar7 = uVar11 + ((ulong)LZCOUNT(uVar7 >> 0x20 | uVar7 << 0x20) >> 3) & uStack_78;
            if (-1 < *(char *)((long)puVar1 + uVar7)) {
              uVar7 = (*puVar1 & 0x8080808080808080) >> 7;
              uVar7 = (uVar7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 & 0xff00ff00ff00ff) << 8;
              uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
              uVar7 = (ulong)LZCOUNT(uVar7 >> 0x20 | uVar7 << 0x20) >> 3;
            }
            bVar2 = (byte)(uVar15 >> 0x38);
            *(byte *)((long)puVar1 + uVar7) = bVar2 >> 1;
            *(byte *)((long)puVar1 + (uVar7 - 8 & uStack_78) + 8) = bVar2 >> 1;
            lVar6 = *plVar5;
            puVar1[-1 - uVar7] = *(ulong *)(lVar6 + ~uVar10 * 8);
          }
          bVar4 = uVar10 != uVar13;
          uVar10 = uVar10 + 1;
        } while (bVar4);
        lVar12 = plVar5[1];
        *plVar5 = (long)puVar1;
        plVar5[1] = uStack_78;
        plVar5[2] = lStack_70;
        plVar5[3] = uVar14;
        if (lVar12 == 0) goto LAB_007acb14;
      }
      lVar9 = lVar12 * 8 + 8;
      func_0x00187bd4(lVar6 - lVar9,lVar12 + lVar9 + 9);
    }
    else {
      func_0x00595948(plVar5,&plStack_88,&DAT_0059501c);
    }
LAB_007acb14:
    uVar8 = 0x8000000000000001;
  }
  return uVar8;
}

