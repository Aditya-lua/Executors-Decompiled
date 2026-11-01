
void FUN_00224f2c(void)

{
  undefined1 uVar1;
  ushort uVar2;
  undefined2 uVar3;
  undefined2 uVar4;
  uint uVar5;
  long lVar6;
  undefined8 uVar7;
  long lVar8;
  long lVar9;
  long *unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  ulong uVar10;
  long unaff_x22;
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  
  *(char *)(unaff_x19[1] + unaff_x22) = (char)unaff_x21;
  lVar6 = unaff_x22 + 1;
  unaff_x19[2] = lVar6;
  if ((ulong)(*unaff_x19 - lVar6) < unaff_x21) {
    func_0x0079b61c();
    lVar6 = unaff_x19[2];
  }
  _memcpy(unaff_x19[1] + lVar6,in_stack_00000010);
  unaff_x19[2] = lVar6 + unaff_x21;
  if (in_stack_00000008 != 0) {
    func_0x00187bd4(in_stack_00000010,in_stack_00000008,1);
  }
  uVar2 = *(ushort *)(unaff_x20 + 0x80);
  if (uVar2 < 5) {
    if (uVar2 < 2) {
      if (uVar2 == 0) {
        uVar5 = 2;
      }
      else {
        uVar5 = 0x300;
      }
    }
    else if (uVar2 == 2) {
      uVar5 = 0x301;
    }
    else if (uVar2 == 3) {
      uVar5 = 0x302;
    }
    else {
      uVar5 = 0x303;
    }
  }
  else if (uVar2 < 7) {
    if (uVar2 == 5) {
      uVar5 = 0x304;
    }
    else {
      uVar5 = 0xfeff;
    }
  }
  else if (uVar2 == 7) {
    uVar5 = 0xfefd;
  }
  else if (uVar2 == 8) {
    uVar5 = 0xfefc;
  }
  else {
    uVar5 = (uint)*(ushort *)(unaff_x20 + 0x82);
  }
  lVar6 = unaff_x19[2];
  if ((ulong)(*unaff_x19 - lVar6) < 2) {
    func_0x0079b61c();
    lVar6 = unaff_x19[2];
  }
  *(ushort *)(unaff_x19[1] + lVar6) = (ushort)(uVar5 >> 8) | (ushort)((uVar5 & 0xff00ff) << 8);
  lVar6 = lVar6 + 2;
  unaff_x19[2] = lVar6;
  uVar3 = *(undefined2 *)(unaff_x20 + 0x84);
  uVar4 = *(undefined2 *)(unaff_x20 + 0x86);
  if ((ulong)(*unaff_x19 - lVar6) < 2) {
    func_0x0079b61c();
    lVar6 = unaff_x19[2];
  }
  uVar5 = func_0x001f5ae0(uVar3,uVar4);
  *(ushort *)(unaff_x19[1] + lVar6) =
       (ushort)(uVar5 >> 8) & 0xff | (ushort)((uVar5 & 0xff00ff) << 8);
  lVar8 = lVar6 + 2;
  unaff_x19[2] = lVar8;
  uVar10 = *(ulong *)(unaff_x20 + 0x10);
  if (lVar8 == *unaff_x19) {
    func_0x00458a18();
  }
  *(char *)(unaff_x19[1] + lVar8) = (char)uVar10;
  lVar6 = lVar6 + 3;
  unaff_x19[2] = lVar6;
  uVar7 = *(undefined8 *)(unaff_x20 + 8);
  if ((ulong)(*unaff_x19 - lVar6) < uVar10) {
    func_0x0079b61c();
    lVar6 = unaff_x19[2];
  }
  _memcpy(unaff_x19[1] + lVar6,uVar7,uVar10);
  lVar6 = lVar6 + uVar10;
  unaff_x19[2] = lVar6;
  uVar1 = *(undefined1 *)(unaff_x20 + 0x8c);
  if (lVar6 == *unaff_x19) {
    func_0x00458a18();
  }
  *(undefined1 *)(unaff_x19[1] + lVar6) = uVar1;
  lVar8 = lVar6 + 1;
  unaff_x19[2] = lVar8;
  if (*(long *)(unaff_x20 + 0x30) == -0x8000000000000000) {
    if (lVar8 == *unaff_x19) {
      func_0x00458a18();
    }
    *(undefined1 *)(unaff_x19[1] + lVar8) = 0;
    lVar6 = lVar6 + 2;
    unaff_x19[2] = lVar6;
    lVar9 = *(long *)(unaff_x20 + 0x48);
    lVar8 = *unaff_x19;
  }
  else {
    if (lVar8 == *unaff_x19) {
      func_0x00458a18();
    }
    *(undefined1 *)(unaff_x19[1] + lVar8) = 1;
    unaff_x19[2] = lVar6 + 2;
    func_0x001a5e70((long *)(unaff_x20 + 0x30));
    lVar9 = *(long *)(unaff_x20 + 0x48);
    lVar6 = unaff_x19[2];
    lVar8 = *unaff_x19;
  }
  if (lVar9 == -0x8000000000000000) {
    if (lVar6 == lVar8) {
      func_0x00458a18();
    }
    *(undefined1 *)(unaff_x19[1] + lVar6) = 0;
    lVar6 = lVar6 + 1;
  }
  else {
    if (lVar6 == lVar8) {
      func_0x00458a18();
    }
    *(undefined1 *)(unaff_x19[1] + lVar6) = 1;
    lVar8 = lVar6 + 1;
    unaff_x19[2] = lVar8;
    uVar10 = *(ulong *)(unaff_x20 + 0x58);
    if (lVar8 == *unaff_x19) {
      func_0x00458a18();
    }
    *(char *)(unaff_x19[1] + lVar8) = (char)uVar10;
    lVar6 = lVar6 + 2;
    unaff_x19[2] = lVar6;
    uVar7 = *(undefined8 *)(unaff_x20 + 0x50);
    if ((ulong)(*unaff_x19 - lVar6) < uVar10) {
      func_0x0079b61c();
      lVar6 = unaff_x19[2];
    }
    _memcpy(unaff_x19[1] + lVar6,uVar7,uVar10);
    lVar6 = lVar6 + uVar10;
  }
  unaff_x19[2] = lVar6;
  uVar7 = *(undefined8 *)(unaff_x20 + 0x20);
  uVar10 = *(ulong *)(unaff_x20 + 0x28);
  if ((ulong)(*unaff_x19 - lVar6) < 2) {
    func_0x0079b61c();
    lVar6 = unaff_x19[2];
  }
  *(ushort *)(unaff_x19[1] + lVar6) =
       (ushort)(uVar10 >> 8) & 0xff | (ushort)(((uint)uVar10 & 0xff00ff) << 8);
  lVar6 = lVar6 + 2;
  unaff_x19[2] = lVar6;
  if ((ulong)(*unaff_x19 - lVar6) < uVar10) {
    func_0x0079b61c();
    lVar6 = unaff_x19[2];
  }
  _memcpy(unaff_x19[1] + lVar6,uVar7,uVar10);
  lVar6 = lVar6 + uVar10;
  unaff_x19[2] = lVar6;
  uVar10 = *(ulong *)(unaff_x20 + 0x78);
  if ((ulong)(*unaff_x19 - lVar6) < 8) {
    func_0x0079b61c();
    lVar6 = unaff_x19[2];
  }
  uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
  uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
  *(ulong *)(unaff_x19[1] + lVar6) = uVar10 >> 0x20 | uVar10 << 0x20;
  lVar6 = lVar6 + 8;
  unaff_x19[2] = lVar6;
  uVar5 = *(uint *)(unaff_x20 + 0x88);
  if ((ulong)(*unaff_x19 - lVar6) < 4) {
    func_0x0079b61c();
    lVar6 = unaff_x19[2];
  }
  uVar5 = (uVar5 & 0xff00ff00) >> 8 | (uVar5 & 0xff00ff) << 8;
  *(uint *)(unaff_x19[1] + lVar6) = uVar5 >> 0x10 | uVar5 << 0x10;
  unaff_x19[2] = lVar6 + 4;
  return;
}

