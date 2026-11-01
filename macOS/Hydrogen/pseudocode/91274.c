
undefined8 FUN_00091274(undefined8 param_1,undefined8 param_2)

{
  undefined1 uVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  long *plVar5;
  float fVar6;
  float fVar7;
  float fVar8;
  
  lVar3 = func_0x006e33ec(param_2,1);
  uVar4 = func_0x006e67c8(param_2,2,0);
  iVar2 = _strcmp(uVar4,"Position");
  if (iVar2 == 0) {
    fVar6 = *(float *)(lVar3 + 0x38);
    fVar7 = *(float *)(lVar3 + 0x3c);
  }
  else {
    iVar2 = _strcmp(uVar4,"Size");
    if (iVar2 != 0) {
      iVar2 = _strcmp(uVar4,"Thickness");
      if (iVar2 == 0) {
        func_0x006e3850(*(undefined8 *)(lVar3 + 0x28),param_2);
        return 1;
      }
      iVar2 = _strcmp(uVar4,"Filled");
      if (iVar2 == 0) {
        func_0x006e3c24(param_2,*(undefined1 *)(lVar3 + 0x40));
        return 1;
      }
      lVar3 = func_0x006e33ec(param_2,1);
      uVar4 = func_0x006e67c8(param_2,2,0);
      iVar2 = _strcmp(uVar4,"ZIndex");
      if (iVar2 == 0) {
        func_0x006e3870(param_2,*(undefined4 *)(lVar3 + 8));
        return 1;
      }
      iVar2 = _strcmp(uVar4,"Visible");
      if (iVar2 == 0) {
        uVar1 = *(undefined1 *)(lVar3 + 0xc);
      }
      else {
        iVar2 = _strcmp(uVar4,"Transparency");
        if (iVar2 == 0) {
          func_0x006e3850(*(undefined8 *)(lVar3 + 0x10),param_2);
          return 1;
        }
        iVar2 = _strcmp(uVar4,"Color");
        if (iVar2 == 0) {
          fVar6 = *(float *)(lVar3 + 0x18);
          fVar7 = *(float *)(lVar3 + 0x1c);
          fVar8 = *(float *)(lVar3 + 0x20);
          func_0x006e3d18(param_2,0xffffd8ee,"Color3");
          func_0x006e3d18(param_2,0xffffffff,"new");
          func_0x006e3850((double)fVar6,param_2);
          func_0x006e3850((double)fVar7,param_2);
          func_0x006e3850((double)fVar8,param_2);
          func_0x006e4c80(param_2,3,1);
          return 1;
        }
        iVar2 = _strcmp(uVar4,"Remove");
        if ((iVar2 == 0) || (iVar2 = _strcmp(uVar4,"Destroy"), iVar2 == 0)) {
          func_0x006e3af8(param_2,&DAT_00090414,0,0,0);
          return 1;
        }
        iVar2 = _strcmp(uVar4,"__OBJECT_EXISTS");
        plVar5 = plRam0000000000a334a0;
        if (iVar2 != 0) {
          iVar2 = _strcmp(uVar4,"__OBJECT");
          if (iVar2 == 0) {
            func_0x006e3c4c(param_2,lVar3,0);
            return 1;
          }
          _printf("invalid index field %s\n");
          return 0;
        }
        for (; plVar5 != plRam0000000000a334a8; plVar5 = plVar5 + 1) {
          if (*plVar5 == lVar3) goto code_r0x00090f6c;
        }
        plVar5 = plRam0000000000a334a8;
code_r0x00090f6c:
        uVar1 = plRam0000000000a334a8 != plVar5;
      }
      func_0x006e3c24(param_2,uVar1);
      return 1;
    }
    fVar6 = *(float *)(lVar3 + 0x30);
    fVar7 = *(float *)(lVar3 + 0x34);
  }
  func_0x006e3d18(param_2,0xffffd8ee,"Vector2");
  func_0x006e3d18(param_2,0xffffffff,"new");
  func_0x006e3850((double)fVar6,param_2);
  func_0x006e3850((double)fVar7,param_2);
  func_0x006e4c80(param_2,2,1);
  return 1;
}

