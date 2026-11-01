
void FUN_001aed90(long param_1)

{
  char cVar1;
  undefined1 uVar2;
  undefined8 uVar3;
  long in_x9;
  long lVar4;
  long lVar5;
  long *unaff_x19;
  long unaff_x20;
  ulong uVar6;
  long lVar7;
  
  if (param_1 == in_x9) {
    cVar1 = *(char *)(unaff_x20 + 8);
    uVar2 = *(undefined1 *)(unaff_x20 + 9);
    lVar7 = unaff_x19[2];
    if (lVar7 == *unaff_x19) {
      func_0x00458a18();
    }
    if (cVar1 == '\0') {
      uVar2 = 1;
    }
    *(undefined1 *)(unaff_x19[1] + lVar7) = uVar2;
    lVar7 = lVar7 + 1;
    unaff_x19[2] = lVar7;
    uVar3 = *(undefined8 *)(unaff_x20 + 0x18);
    uVar6 = *(ulong *)(unaff_x20 + 0x20);
    if ((ulong)(*unaff_x19 - lVar7) < uVar6) {
      func_0x0079b61c();
      lVar7 = unaff_x19[2];
    }
    lVar5 = unaff_x19[1] + lVar7;
  }
  else {
    lVar7 = unaff_x19[2];
    if (lVar7 == *unaff_x19) {
      func_0x00458a18();
    }
    *(undefined1 *)(unaff_x19[1] + lVar7) = 1;
    unaff_x19[2] = lVar7 + 1;
    func_0x001a69c4();
    uVar3 = *(undefined8 *)(unaff_x20 + 0x20);
    uVar6 = *(ulong *)(unaff_x20 + 0x28);
    lVar7 = unaff_x19[2];
    lVar4 = *unaff_x19;
    if ((ulong)(lVar4 - lVar7) < 2) {
      func_0x0079b61c();
      lVar7 = unaff_x19[2];
      lVar4 = *unaff_x19;
    }
    lVar5 = unaff_x19[1];
    *(ushort *)(lVar5 + lVar7) =
         (ushort)(uVar6 >> 8) & 0xff | (ushort)(((uint)uVar6 & 0xff00ff) << 8);
    lVar7 = lVar7 + 2;
    unaff_x19[2] = lVar7;
    if ((ulong)(lVar4 - lVar7) < uVar6) {
      func_0x0079b61c();
      lVar5 = unaff_x19[1];
      lVar7 = unaff_x19[2];
    }
    lVar5 = lVar5 + lVar7;
  }
  _memcpy(lVar5,uVar3,uVar6);
  unaff_x19[2] = lVar7 + uVar6;
  return;
}

