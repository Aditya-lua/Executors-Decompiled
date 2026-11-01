
void FUN_0045c45c(long param_1)

{
  ushort uVar1;
  byte bVar2;
  bool bVar3;
  byte *pbVar4;
  ushort *puVar5;
  long *unaff_x19;
  long unaff_x20;
  ulong uVar6;
  ushort *unaff_x22;
  ushort *unaff_x23;
  long unaff_x24;
  ulong unaff_x25;
  uint uVar7;
  ulong uVar8;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  
  do {
    puVar5 = unaff_x23 + 1;
    uVar1 = *unaff_x23;
    uVar7 = (uint)(uVar1 >> 8) | (uVar1 & 0xff00ff) << 8;
    if ((uVar1 >> 3 & 0x1f) == 0x1b) {
      if ((uVar1 & 0xff00ff) >> 2 < 0x37 && puVar5 != unaff_x22) {
        uVar1 = *puVar5;
        if (0x3e < (((uint)(uVar1 >> 8) | (uVar1 & 0xff00ff) << 8) + 0x2000 >> 10 & 0x3f)) {
          puVar5 = unaff_x23 + 2;
          uVar8 = (((ulong)((uint)(uVar1 >> 8) | (uVar1 & 0xff00ff) << 8) & 0x3ff) << 0x10 |
                  ((ulong)uVar7 & 0x3ff) << 0x1a) + unaff_x24;
          uVar7 = (uint)(uVar8 >> 0x10);
          goto LAB_0045c4f8;
        }
      }
      if (uStack0000000000000008 != 0) {
        func_0x00187bd4(in_stack_00000010,uStack0000000000000008,1);
      }
      goto LAB_0045c5fc;
    }
    uVar8 = (ulong)uVar7 << 0x10;
    if (uVar7 < 0x80) {
      bVar3 = true;
      uVar6 = 1;
    }
    else if (uVar7 < 0x800) {
      bVar3 = false;
      uVar6 = 2;
    }
    else {
LAB_0045c4f8:
      bVar3 = false;
      uVar6 = unaff_x25;
      if (uVar8 >> 0x20 != 0) {
        uVar6 = unaff_x25 + 1;
      }
    }
    bVar2 = (byte)uVar7;
    if ((ulong)(uStack0000000000000008 - unaff_x20) < uVar6) {
      func_0x007a1e50(&uStack0000000000000008,unaff_x20,uVar6);
      pbVar4 = (byte *)(in_stack_00000010 + in_stack_00000018);
      param_1 = in_stack_00000010;
      if (!bVar3) goto LAB_0045c528;
LAB_0045c448:
      *pbVar4 = bVar2;
    }
    else {
      pbVar4 = (byte *)(param_1 + unaff_x20);
      if (bVar3) goto LAB_0045c448;
LAB_0045c528:
      if (uVar8 >> 0x1b == 0) {
        *pbVar4 = (byte)(uVar8 >> 0x16) | 0xc0;
        pbVar4[1] = bVar2 & 0x3f | 0x80;
      }
      else if (uVar8 >> 0x20 == 0) {
        *pbVar4 = (byte)(uVar8 >> 0x1c) | 0xe0;
        pbVar4[1] = (byte)((uint)uVar8 >> 0x16) & 0x3f | 0x80;
        pbVar4[2] = bVar2 & 0x3f | 0x80;
      }
      else {
        *pbVar4 = (byte)(uVar8 >> 0x22) | 0xf0;
        pbVar4[1] = (byte)(uVar8 >> 0x1c) & 0x3f | 0x80;
        pbVar4[2] = (byte)((uint)uVar8 >> 0x16) & 0x3f | 0x80;
        pbVar4[3] = bVar2 & 0x3f | 0x80;
      }
    }
    unaff_x20 = uVar6 + unaff_x20;
    unaff_x23 = puVar5;
    in_stack_00000018 = unaff_x20;
  } while (puVar5 != unaff_x22);
  if (uStack0000000000000008 == -0x8000000000000000) {
LAB_0045c5fc:
    *unaff_x19 = -0x8000000000000000;
  }
  else {
    *unaff_x19 = uStack0000000000000008;
    unaff_x19[1] = in_stack_00000010;
    unaff_x19[2] = unaff_x20;
  }
  return;
}

