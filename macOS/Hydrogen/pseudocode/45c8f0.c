
void FUN_0045c8f0(void)

{
  ushort *puVar1;
  ulong uVar2;
  ushort uVar3;
  byte bVar4;
  long lVar5;
  uint uVar6;
  bool bVar7;
  byte *pbVar8;
  ulong uVar9;
  ulong uVar10;
  ulong unaff_x19;
  uint uVar11;
  ushort *puVar12;
  ushort *unaff_x21;
  ulong uVar13;
  bool bVar14;
  long *in_stack_00000008;
  undefined8 uStack0000000000000010;
  long in_stack_00000018;
  long in_stack_00000020;
  undefined8 uStack0000000000000028;
  long in_stack_00000030;
  long in_stack_00000038;
  
  func_0x007a1e50(&uStack0000000000000028,0);
  bVar14 = false;
  puVar1 = (ushort *)((long)unaff_x21 + (unaff_x19 & 0xfffffffffffffffe));
  uVar10 = unaff_x19;
  do {
    lVar5 = in_stack_00000038;
    if (bVar14) {
      uVar13 = uVar10;
      puVar12 = unaff_x21;
      if (((uint)uVar10 >> 0xb & 0x1f) == 0x1b) goto code_r0x0045c6d4;
code_r0x0045c704:
      uVar13 = uVar13 & 0xffff;
code_r0x0045c708:
      uVar11 = (uint)uVar13;
      uVar9 = 3;
      if (0xffff < uVar13) {
        uVar9 = 4;
      }
      uVar2 = 2;
      if (0x7ff < uVar13) {
        uVar2 = uVar9;
      }
      bVar7 = uVar13 < 0x80;
      uVar13 = 1;
      if (!bVar7) {
        uVar13 = uVar2;
      }
      bVar14 = false;
      uVar6 = uVar11;
      if (uVar13 <= (ulong)(uStack0000000000000028 - in_stack_00000038)) goto code_r0x0045c744;
code_r0x0045c838:
      uVar11 = uVar6;
      func_0x007a1e50(&uStack0000000000000028,in_stack_00000038,uVar13);
      pbVar8 = (byte *)(in_stack_00000030 + in_stack_00000038);
      if (!bVar7) goto code_r0x0045c750;
code_r0x0045c6b4:
      *pbVar8 = (byte)uVar11;
    }
    else {
      if (unaff_x21 == puVar1) {
        in_stack_00000018 = in_stack_00000030;
        uStack0000000000000010 = uStack0000000000000028;
        in_stack_00000020 = in_stack_00000038;
        if ((unaff_x19 & 1) != 0) {
          if ((ulong)(uStack0000000000000028 - in_stack_00000038) < 3) {
            func_0x007a1e50(&uStack0000000000000010,in_stack_00000038,3);
            in_stack_00000038 = in_stack_00000020;
          }
          *(undefined2 *)(in_stack_00000018 + in_stack_00000038) = 0xbfef;
          *(undefined1 *)((undefined2 *)(in_stack_00000018 + in_stack_00000038) + 1) = 0xbd;
          in_stack_00000020 = in_stack_00000038 + 3;
        }
        in_stack_00000008[1] = in_stack_00000018;
        *in_stack_00000008 = uStack0000000000000010;
        in_stack_00000008[2] = in_stack_00000020;
        return;
      }
      puVar12 = unaff_x21 + 1;
      uVar11 = *unaff_x21 & 0xff00ff;
      uVar13 = (ulong)((uint)(*unaff_x21 >> 8) | uVar11 << 8);
      unaff_x21 = puVar12;
      if (uVar11 >> 3 != 0x1b) goto code_r0x0045c704;
code_r0x0045c6d4:
      if (((uint)uVar13 >> 10 & 0x3f) < 0x37) {
        if (unaff_x21 == puVar1) {
          bVar14 = false;
          puVar12 = puVar1;
        }
        else {
          puVar12 = unaff_x21 + 1;
          uVar3 = *unaff_x21;
          uVar9 = (ulong)((uint)(uVar3 >> 8) | (uVar3 & 0xff00ff) << 8);
          if (0x3e < (((uint)(uVar3 >> 8) | (uVar3 & 0xff00ff) << 8) + 0x2000 >> 10 & 0x3f)) {
            uVar13 = uVar9 & 0x3ff | (uVar13 & 0x3ff) * 0x4000000 + 0x100000000 >> 0x10;
            goto code_r0x0045c708;
          }
          bVar14 = true;
          uVar10 = uVar9;
        }
      }
      else {
        bVar14 = false;
        puVar12 = unaff_x21;
      }
      bVar7 = false;
      uVar11 = 0xfffd;
      uVar13 = 3;
      uVar6 = 0xfffd;
      if ((ulong)(uStack0000000000000028 - in_stack_00000038) < 3) goto code_r0x0045c838;
code_r0x0045c744:
      pbVar8 = (byte *)(in_stack_00000030 + in_stack_00000038);
      if (bVar7) goto code_r0x0045c6b4;
code_r0x0045c750:
      bVar4 = (byte)uVar11;
      if (uVar11 < 0x800) {
        *pbVar8 = (byte)(uVar11 >> 6) | 0xc0;
        pbVar8[1] = bVar4 & 0x3f | 0x80;
      }
      else if (uVar11 < 0x10000) {
        *pbVar8 = (byte)(uVar11 >> 0xc) | 0xe0;
        pbVar8[1] = (byte)(uVar11 >> 6) & 0x3f | 0x80;
        pbVar8[2] = bVar4 & 0x3f | 0x80;
      }
      else {
        *pbVar8 = (byte)(uVar11 >> 0x12) | 0xf0;
        pbVar8[1] = (byte)(uVar11 >> 0xc) & 0x3f | 0x80;
        pbVar8[2] = (byte)(uVar11 >> 6) & 0x3f | 0x80;
        pbVar8[3] = bVar4 & 0x3f | 0x80;
      }
    }
    in_stack_00000038 = uVar13 + lVar5;
    unaff_x21 = puVar12;
  } while( true );
}

