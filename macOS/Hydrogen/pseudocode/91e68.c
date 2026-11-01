
undefined8 FUN_00091e68(void)

{
  long *plVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  float fVar5;
  float fVar6;
  float fVar7;
  
  iVar2 = _strcmp();
  if (iVar2 == 0) {
    return 1;
  }
  lVar3 = func_0x006e33ec();
  uVar4 = func_0x006e67c8();
  iVar2 = _strcmp(uVar4,"ZIndex");
  if (iVar2 == 0) {
    func_0x006e3870();
    return 1;
  }
  iVar2 = _strcmp(uVar4,"Visible");
  if (iVar2 != 0) {
    iVar2 = _strcmp(uVar4,"Transparency");
    if (iVar2 == 0) {
      func_0x006e3850(*(undefined8 *)(lVar3 + 0x10));
      return 1;
    }
    iVar2 = _strcmp(uVar4,"Color");
    if (iVar2 == 0) {
      fVar5 = *(float *)(lVar3 + 0x18);
      fVar6 = *(float *)(lVar3 + 0x1c);
      fVar7 = *(float *)(lVar3 + 0x20);
      func_0x006e3d18();
      func_0x006e3d18();
      func_0x006e3850((double)fVar5);
      func_0x006e3850((double)fVar6);
      func_0x006e3850((double)fVar7);
      func_0x006e4c80();
      return 1;
    }
    iVar2 = _strcmp(uVar4,"Remove");
    if ((iVar2 == 0) || (iVar2 = _strcmp(uVar4,"Destroy"), iVar2 == 0)) {
      func_0x006e3af8();
      return 1;
    }
    iVar2 = _strcmp(uVar4,"__OBJECT_EXISTS");
    plVar1 = plRam0000000000a334a0;
    if (iVar2 != 0) {
      iVar2 = _strcmp(uVar4,"__OBJECT");
      if (iVar2 == 0) {
        func_0x006e3c4c();
        return 1;
      }
      _printf("invalid index field %s\n");
      return 0;
    }
    for (; (plVar1 != plRam0000000000a334a8 && (*plVar1 != lVar3)); plVar1 = plVar1 + 1) {
    }
  }
  func_0x006e3c24();
  return 1;
}

