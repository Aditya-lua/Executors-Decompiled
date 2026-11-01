
undefined8 FUN_00090dc8(void)

{
  long *plVar1;
  int iVar2;
  long unaff_x20;
  undefined8 uVar3;
  float fVar4;
  float fVar5;
  float fVar6;
  
  iVar2 = _strcmp();
  if (iVar2 == 0) {
    func_0x006e3850(*(undefined8 *)(unaff_x20 + 0x10));
    uVar3 = 1;
  }
  else {
    iVar2 = _strcmp();
    if (iVar2 == 0) {
      fVar4 = *(float *)(unaff_x20 + 0x18);
      fVar5 = *(float *)(unaff_x20 + 0x1c);
      fVar6 = *(float *)(unaff_x20 + 0x20);
      func_0x006e3d18();
      func_0x006e3d18();
      func_0x006e3850((double)fVar4);
      func_0x006e3850((double)fVar5);
      func_0x006e3850((double)fVar6);
      uVar3 = 1;
      func_0x006e4c80();
    }
    else {
      iVar2 = _strcmp();
      if ((iVar2 == 0) || (iVar2 = _strcmp(), iVar2 == 0)) {
        func_0x006e3af8();
        uVar3 = 1;
      }
      else {
        iVar2 = _strcmp();
        plVar1 = plRam0000000000a334a0;
        if (iVar2 == 0) {
          for (; (plVar1 != plRam0000000000a334a8 && (*plVar1 != unaff_x20)); plVar1 = plVar1 + 1) {
          }
          func_0x006e3c24();
          uVar3 = 1;
        }
        else {
          iVar2 = _strcmp();
          if (iVar2 == 0) {
            func_0x006e3c4c();
            uVar3 = 1;
          }
          else {
            _printf("invalid index field %s\n");
            uVar3 = 0;
          }
        }
      }
    }
  }
  return uVar3;
}

