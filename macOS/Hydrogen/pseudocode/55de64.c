
void FUN_0055de64(long param_1)

{
  undefined4 *puVar1;
  undefined4 uVar2;
  ushort uVar3;
  ushort uVar4;
  code *pcVar5;
  undefined8 uVar6;
  undefined8 *puVar7;
  long lVar8;
  long *plVar9;
  long lVar10;
  undefined8 *puVar11;
  long lVar12;
  ulong unaff_x22;
  long lVar13;
  undefined8 uVar14;
  ulong uVar15;
  ulong uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined1 auVar19 [16];
  undefined1 uStack00000000000000a0;
  
  uVar6 = func_0x007a247c(param_1 + 0x894,0x30,&UNK_009ee068);
  func_0x007a200c(&uStack00000000000000a0);
  __Unwind_Resume(uVar6);
  auVar19 = func_0x007a2668();
  plVar9 = auVar19._8_8_;
  puVar7 = auVar19._0_8_;
  lVar13 = *plVar9;
  uVar3 = *(ushort *)(lVar13 + 0x1c2);
  lVar8 = func_0x00187bd0(0x228,8);
  if (lVar8 == 0) {
    func_0x007a1f18(8,0x228);
  }
  else {
    *(undefined8 *)(lVar8 + 0xb0) = 0;
    uVar15 = plVar9[2];
    uVar4 = *(ushort *)(lVar13 + 0x1c2);
    unaff_x22 = (ulong)uVar4 + ~uVar15;
    *(short *)(lVar8 + 0x1c2) = (short)unaff_x22;
    puVar11 = (undefined8 *)(lVar13 + 0xb8 + uVar15 * 0x18);
    uVar18 = puVar11[1];
    uVar17 = *puVar11;
    uVar6 = puVar11[2];
    if (unaff_x22 < 0xc) {
      lVar10 = uVar15 + 1;
      if ((ulong)uVar4 - lVar10 == unaff_x22) {
        puVar1 = (undefined4 *)(lVar13 + uVar15 * 0x10);
        uVar2 = *puVar1;
        uVar14 = *(undefined8 *)(puVar1 + 2);
        _memcpy(lVar8 + 0xb8,lVar13 + 0xb8 + lVar10 * 0x18,unaff_x22 * 0x18);
        _memcpy(lVar8,lVar13 + lVar10 * 0x10,unaff_x22 * 0x10);
        *(short *)(lVar13 + 0x1c2) = (short)uVar15;
        uVar16 = (ulong)*(ushort *)(lVar8 + 0x1c2);
        lVar10 = uVar16 + 1;
        if (uVar16 < 0xc) {
          if (uVar3 - uVar15 == lVar10) {
            _memcpy(lVar8 + 0x1c8,lVar13 + uVar15 * 8 + 0x1d0,lVar10 * 8);
            uVar15 = 0;
            lVar10 = plVar9[1];
            do {
              lVar12 = *(long *)(lVar8 + 0x1c8 + uVar15 * 8);
              *(long *)(lVar12 + 0xb0) = lVar8;
              *(short *)(lVar12 + 0x1c0) = (short)uVar15;
              if (uVar16 <= uVar15) break;
              uVar15 = uVar15 + 1;
            } while (uVar15 <= uVar16);
            puVar7[1] = uVar18;
            *puVar7 = uVar17;
            puVar7[2] = uVar6;
            *(undefined4 *)(puVar7 + 3) = uVar2;
            puVar7[4] = uVar14;
            puVar7[5] = lVar13;
            puVar7[6] = lVar10;
            puVar7[7] = lVar8;
            puVar7[8] = lVar10;
            return;
          }
          func_0x007a247c(&UNK_008ab922,0x28,&UNK_009ee0c0);
        }
        else {
          func_0x007a28b0(lVar10,0xc,&UNK_009ee0f0);
        }
      }
      else {
        func_0x007a247c(&UNK_008ab922,0x28,&UNK_009ee0c0);
      }
      goto LAB_0055e080;
    }
  }
  func_0x007a28b0(unaff_x22,0xb,&UNK_009ee0d8);
LAB_0055e080:
                    /* WARNING: Does not return */
  pcVar5 = (code *)SoftwareBreakpoint(1,0x55e084);
  (*pcVar5)();
}

