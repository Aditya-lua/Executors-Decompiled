
void FUN_00458774(long param_1)

{
  ulong uVar1;
  byte bVar2;
  long lVar3;
  bool bVar4;
  byte *pbVar5;
  long in_x9;
  ulong uVar6;
  ulong in_x10;
  ulong uVar7;
  ushort *unaff_x22;
  ushort *puVar8;
  ushort *puVar9;
  ushort *unaff_x23;
  ulong unaff_x24;
  uint unaff_w25;
  byte unaff_w26;
  uint uVar10;
  long *in_stack_00000000;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  
  param_1 = in_x9 + (in_x10 >> 2) + param_1;
  if (param_1 != 0) {
    func_0x007a1e50(&uStack0000000000000008,0,param_1);
  }
  do {
    lVar3 = in_stack_00000018;
    if ((unaff_w26 & 1) == 0) {
      if (unaff_x22 == unaff_x23) {
        in_stack_00000000[1] = in_stack_00000010;
        *in_stack_00000000 = uStack0000000000000008;
        in_stack_00000000[2] = in_stack_00000018;
        return;
      }
      puVar9 = unaff_x22 + 1;
      uVar7 = (ulong)*unaff_x22;
      puVar8 = puVar9;
      if ((*unaff_x22 & 0xf800) != unaff_w25) goto LAB_0045883c;
LAB_004587a8:
      bVar4 = ((uint)(uVar7 >> 10) & 0x3fffff) < 0x37;
      unaff_w26 = bVar4 && puVar8 != unaff_x23;
      puVar9 = puVar8;
      uVar6 = unaff_x24;
      if (bVar4 && puVar8 != unaff_x23) {
        puVar9 = puVar8 + 1;
        uVar6 = (ulong)*puVar8;
        if (0xfffffbff < *puVar8 - 0xe000) {
          uVar7 = uVar6 & 0x3ff | (ulong)((uint)uVar7 & 0x3ff) * 0x4000000 + 0x100000000 >> 0x10;
          goto LAB_00458840;
        }
      }
      bVar4 = false;
      uVar10 = 0xfffd;
      uVar7 = 3;
      unaff_x24 = uVar6;
      if (2 < (ulong)(uStack0000000000000008 - in_stack_00000018)) goto LAB_004587f4;
LAB_00458880:
      func_0x007a1e50(&uStack0000000000000008,in_stack_00000018,uVar7);
      pbVar5 = (byte *)(in_stack_00000010 + in_stack_00000018);
      if (bVar4) goto LAB_00458788;
LAB_00458800:
      bVar2 = (byte)uVar10;
      if (uVar10 < 0x800) {
        *pbVar5 = (byte)(uVar10 >> 6) | 0xc0;
        pbVar5[1] = bVar2 & 0x3f | 0x80;
      }
      else if (uVar10 < 0x10000) {
        *pbVar5 = (byte)(uVar10 >> 0xc) | 0xe0;
        pbVar5[1] = (byte)(uVar10 >> 6) & 0x3f | 0x80;
        pbVar5[2] = bVar2 & 0x3f | 0x80;
      }
      else {
        *pbVar5 = (byte)(uVar10 >> 0x12) | 0xf0;
        pbVar5[1] = (byte)(uVar10 >> 0xc) & 0x3f | 0x80;
        pbVar5[2] = (byte)(uVar10 >> 6) & 0x3f | 0x80;
        pbVar5[3] = bVar2 & 0x3f | 0x80;
      }
    }
    else {
      uVar7 = unaff_x24;
      puVar9 = unaff_x22;
      puVar8 = unaff_x22;
      if (((uint)unaff_x24 & 0xf800) == unaff_w25) goto LAB_004587a8;
LAB_0045883c:
      uVar7 = uVar7 & 0xffffffff;
LAB_00458840:
      uVar10 = (uint)uVar7;
      uVar6 = 3;
      if (0xffff < uVar7) {
        uVar6 = 4;
      }
      uVar1 = 2;
      if (0x7ff < uVar7) {
        uVar1 = uVar6;
      }
      bVar4 = uVar7 < 0x80;
      uVar7 = 1;
      if (!bVar4) {
        uVar7 = uVar1;
      }
      unaff_w26 = false;
      if ((ulong)(uStack0000000000000008 - in_stack_00000018) < uVar7) goto LAB_00458880;
LAB_004587f4:
      pbVar5 = (byte *)(in_stack_00000010 + in_stack_00000018);
      if (!bVar4) goto LAB_00458800;
LAB_00458788:
      *pbVar5 = (byte)uVar10;
    }
    in_stack_00000018 = uVar7 + lVar3;
    unaff_x22 = puVar9;
  } while( true );
}

