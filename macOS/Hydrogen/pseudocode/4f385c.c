
void FUN_004f385c(void)

{
  long lVar1;
  ushort uVar2;
  code *pcVar3;
  long *plVar4;
  undefined8 *puVar5;
  long *plVar6;
  long lVar7;
  long *plVar8;
  long lVar9;
  ulong unaff_x22;
  long lVar10;
  ulong uVar11;
  long lVar12;
  long lVar13;
  undefined1 auVar14 [16];
  
  auVar14 = __Unwind_Resume();
  plVar6 = auVar14._8_8_;
  plVar4 = auVar14._0_8_;
  puVar5 = (undefined8 *)func_0x00187bd0(0x170,8);
  if (puVar5 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x170);
  }
  else {
    *puVar5 = 0;
    lVar10 = *plVar6;
    uVar11 = plVar6[2];
    uVar2 = *(ushort *)(lVar10 + 0x16a);
    unaff_x22 = (ulong)uVar2 + ~uVar11;
    *(short *)((long)puVar5 + 0x16a) = (short)unaff_x22;
    plVar8 = (long *)(lVar10 + 8 + uVar11 * 0x18);
    lVar13 = plVar8[1];
    lVar7 = *plVar8;
    lVar9 = plVar8[2];
    if (unaff_x22 < 0xc) {
      lVar1 = uVar11 + 1;
      if ((ulong)uVar2 - lVar1 == unaff_x22) {
        lVar12 = *(long *)(lVar10 + 0x110 + uVar11 * 8);
        _memcpy(puVar5 + 1,lVar10 + 8 + lVar1 * 0x18,unaff_x22 * 0x18);
        _memcpy(puVar5 + 0x22,lVar10 + 0x110 + lVar1 * 8,unaff_x22 * 8);
        *(short *)(lVar10 + 0x16a) = (short)uVar11;
        plVar4[5] = lVar13;
        plVar4[4] = lVar7;
        lVar7 = plVar6[1];
        *plVar4 = lVar10;
        plVar4[1] = lVar7;
        plVar4[6] = lVar9;
        plVar4[7] = lVar12;
        plVar4[2] = (long)puVar5;
        plVar4[3] = 0;
        return;
      }
      func_0x007a247c(&UNK_008a3c4b,0x28,&UNK_009e8388);
      goto code_r0x004f39a8;
    }
  }
  func_0x007a28b0(unaff_x22,0xb,&UNK_009e83a0);
code_r0x004f39a8:
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x4f39ac);
  (*pcVar3)();
}

