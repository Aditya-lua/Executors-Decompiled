
undefined8 FUN_00090dbc(void)

{
  long *plVar1;
  int iVar2;
  long unaff_x20;
  float fVar3;
  float fVar4;
  float fVar5;
  
  iVar2 = _strcmp();
  if (iVar2 != 0) {
    iVar2 = _strcmp();
    if (iVar2 == 0) {
      func_0x006e3850(*(undefined8 *)(unaff_x20 + 0x10));
      return 1;
    }
    iVar2 = _strcmp();
    if (iVar2 == 0) {
      fVar3 = *(float *)(unaff_x20 + 0x18);
      fVar4 = *(float *)(unaff_x20 + 0x1c);
      fVar5 = *(float *)(unaff_x20 + 0x20);
      func_0x006e3d18();
      func_0x006e3d18();
      func_0x006e3850((double)fVar3);
      func_0x006e3850((double)fVar4);
      func_0x006e3850((double)fVar5);
      func_0x006e4c80();
      return 1;
    }
    iVar2 = _strcmp();
    if ((iVar2 == 0) || (iVar2 = _strcmp(), iVar2 == 0)) {
      func_0x006e3af8();
      return 1;
    }
    iVar2 = _strcmp();
    plVar1 = plRam0000000000a334a0;
    if (iVar2 != 0) {
      iVar2 = _strcmp();
      if (iVar2 == 0) {
        func_0x006e3c4c();
        return 1;
      }
      _printf("invalid index field %s\n");
      return 0;
    }
    for (; (plVar1 != plRam0000000000a334a8 && (*plVar1 != unaff_x20)); plVar1 = plVar1 + 1) {
    }
  }
  func_0x006e3c24();
  return 1;
}

