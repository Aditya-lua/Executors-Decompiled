
undefined8 FUN_00091da0(long param_1,undefined8 param_2)

{
  long *plVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 *puVar5;
  float fVar6;
  float fVar7;
  double dVar8;
  float fVar9;
  
  lVar3 = func_0x006e33ec(param_2,1);
  uVar4 = func_0x006e67c8();
  iVar2 = _strcmp(uVar4,"Text");
  if (iVar2 == 0) {
    func_0x006e3964();
    return 1;
  }
  iVar2 = _strcmp(uVar4,"OutlineColor");
  if (iVar2 == 0) {
    fVar6 = *(float *)(lVar3 + 0x4c);
    fVar7 = *(float *)(lVar3 + 0x50);
    fVar9 = *(float *)(lVar3 + 0x54);
    func_0x006e3d18();
    func_0x006e3d18();
    func_0x006e3850((double)fVar6);
    func_0x006e3850((double)fVar7);
    func_0x006e3850((double)fVar9);
  }
  else {
    iVar2 = _strcmp(uVar4,"Center");
    if ((iVar2 == 0) || (iVar2 = _strcmp(uVar4,"Outline"), iVar2 == 0)) {
      func_0x006e3c24();
      return 1;
    }
    iVar2 = _strcmp(uVar4,"Position");
    if (iVar2 == 0) {
      fVar7 = *(float *)(lVar3 + 0x68);
      fVar6 = *(float *)(lVar3 + 0x6c);
      func_0x006e3d18();
      func_0x006e3d18();
      func_0x006e3850((double)fVar7);
    }
    else {
      iVar2 = _strcmp(uVar4,"Size");
      if (iVar2 == 0) {
        uVar4 = *(undefined8 *)(lVar3 + 0x40);
code_r0x00091fe8:
        func_0x006e3850(uVar4);
        return 1;
      }
      iVar2 = _strcmp(uVar4,"TextBounds");
      if (iVar2 != 0) {
        iVar2 = _strcmp(uVar4,"OutlineOpacity");
        if (iVar2 != 0) {
          iVar2 = _strcmp(uVar4,"Font");
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
              fVar6 = *(float *)(lVar3 + 0x18);
              fVar7 = *(float *)(lVar3 + 0x1c);
              fVar9 = *(float *)(lVar3 + 0x20);
              func_0x006e3d18();
              func_0x006e3d18();
              func_0x006e3850((double)fVar6);
              func_0x006e3850((double)fVar7);
              func_0x006e3850((double)fVar9);
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
        uVar4 = *(undefined8 *)(lVar3 + 0x60);
        goto code_r0x00091fe8;
      }
      puVar5 = (undefined8 *)(param_1 + 0x28);
      if (*(char *)(param_1 + 0x3f) < '\0') {
        puVar5 = (undefined8 *)*puVar5;
      }
      fVar6 = (float)*(double *)(param_1 + 0x40);
      if (fVar6 == 0.0) {
        fVar6 = *(float *)(&UNK_00003d38 + lRam0000000000a334c0);
      }
      if (puVar5 == (undefined8 *)0x0) {
        dVar8 = 0.0;
      }
      else {
        fVar7 = 3.4028235e+38;
        fVar6 = (float)func_0x00106300(fVar6,0x7f7fffff,0,
                                       *(undefined8 *)(&UNK_00003d30 + lRam0000000000a334c0),puVar5,
                                       0,0);
        dVar8 = (double)(int)(fVar6 + 0.99999);
        fVar6 = fVar7;
      }
      func_0x006e3d18();
      func_0x006e3d18();
      func_0x006e3850(dVar8);
    }
    func_0x006e3850((double)fVar6);
  }
  func_0x006e4c80();
  return 1;
}

