
void FUN_004f373c(long param_1)

{
  ulong uVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  ushort uVar4;
  code *pcVar5;
  undefined8 uVar6;
  long lVar7;
  long unaff_x19;
  undefined8 *unaff_x21;
  long *unaff_x22;
  undefined8 uVar8;
  long lVar9;
  ulong uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  
  *(undefined8 *)(param_1 + 0x160) = 0;
  lVar9 = *unaff_x22;
  uVar10 = unaff_x22[2];
  uVar4 = *(ushort *)(lVar9 + 0x1c2);
  uVar1 = (ulong)uVar4 + ~uVar10;
  *(short *)(param_1 + 0x1c2) = (short)uVar1;
  puVar2 = (undefined8 *)(lVar9 + uVar10 * 0x20);
  uVar3 = puVar2[2];
  if (uVar1 < 0xc) {
    if ((ulong)uVar4 - (uVar10 + 1) == uVar1) {
      uVar12 = puVar2[1];
      uVar11 = *puVar2;
      uVar6 = puVar2[3];
      uVar8 = *(undefined8 *)(lVar9 + 0x168 + uVar10 * 8);
      _memcpy();
      _memcpy(unaff_x19 + 0x168,lVar9 + 0x168 + (uVar10 + 1) * 8,uVar1 * 8);
      *(short *)(lVar9 + 0x1c2) = (short)uVar10;
      unaff_x21[1] = uVar12;
      *unaff_x21 = uVar11;
      unaff_x21[2] = uVar3;
      unaff_x21[3] = uVar6;
      lVar7 = unaff_x22[1];
      unaff_x21[4] = uVar8;
      unaff_x21[5] = lVar9;
      unaff_x21[6] = lVar7;
      unaff_x21[7] = unaff_x19;
      unaff_x21[8] = 0;
      return;
    }
    func_0x007a247c(&UNK_008a3c4b,0x28,&UNK_009e8388);
  }
  else {
    func_0x007a28b0(uVar1,0xb,&UNK_009e83a0);
  }
                    /* WARNING: Does not return */
  pcVar5 = (code *)SoftwareBreakpoint(1,0x4f3834);
  (*pcVar5)();
}

