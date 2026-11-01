
undefined8 FUN_00090c18(void)

{
  long *plVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  long unaff_x20;
  float fVar5;
  float fVar6;
  float fVar7;
  
  uVar3 = func_0x006e67c8();
  iVar2 = _strcmp(uVar3,"Position");
  if (iVar2 == 0) {
    fVar5 = *(float *)(unaff_x20 + 0x40);
    fVar6 = *(float *)(unaff_x20 + 0x44);
    func_0x006e3d18();
    func_0x006e3d18();
    func_0x006e3850((double)fVar5);
    func_0x006e3850((double)fVar6);
    func_0x006e4c80();
    return 1;
  }
  iVar2 = _strcmp(uVar3,"Radius");
  if (iVar2 == 0) {
    uVar3 = *(undefined8 *)(unaff_x20 + 0x38);
  }
  else {
    iVar2 = _strcmp(uVar3,"NumSides");
    if (iVar2 == 0) {
      uVar3 = *(undefined8 *)(unaff_x20 + 0x30);
    }
    else {
      iVar2 = _strcmp(uVar3,"Thickness");
      if (iVar2 != 0) {
        iVar2 = _strcmp(uVar3,"Filled");
        if (iVar2 == 0) {
          func_0x006e3c24();
          return 1;
        }
        lVar4 = func_0x006e33ec();
        uVar3 = func_0x006e67c8();
        iVar2 = _strcmp(uVar3,"ZIndex");
        if (iVar2 == 0) {
          func_0x006e3870();
          return 1;
        }
        iVar2 = _strcmp(uVar3,"Visible");
        if (iVar2 != 0) {
          iVar2 = _strcmp(uVar3,"Transparency");
          if (iVar2 == 0) {
            func_0x006e3850(*(undefined8 *)(lVar4 + 0x10));
            return 1;
          }
          iVar2 = _strcmp(uVar3,"Color");
          if (iVar2 == 0) {
            fVar5 = *(float *)(lVar4 + 0x18);
            fVar6 = *(float *)(lVar4 + 0x1c);
            fVar7 = *(float *)(lVar4 + 0x20);
            func_0x006e3d18();
            func_0x006e3d18();
            func_0x006e3850((double)fVar5);
            func_0x006e3850((double)fVar6);
            func_0x006e3850((double)fVar7);
            func_0x006e4c80();
            return 1;
          }
          iVar2 = _strcmp(uVar3,"Remove");
          if ((iVar2 == 0) || (iVar2 = _strcmp(uVar3,"Destroy"), iVar2 == 0)) {
            func_0x006e3af8();
            return 1;
          }
          iVar2 = _strcmp(uVar3,"__OBJECT_EXISTS");
          plVar1 = plRam0000000000a334a0;
          if (iVar2 != 0) {
            iVar2 = _strcmp(uVar3,"__OBJECT");
            if (iVar2 == 0) {
              func_0x006e3c4c();
              return 1;
            }
            _printf("invalid index field %s\n");
            return 0;
          }
          for (; (plVar1 != plRam0000000000a334a8 && (*plVar1 != lVar4)); plVar1 = plVar1 + 1) {
          }
        }
        func_0x006e3c24();
        return 1;
      }
      uVar3 = *(undefined8 *)(unaff_x20 + 0x28);
    }
  }
  func_0x006e3850(uVar3);
  return 1;
}

