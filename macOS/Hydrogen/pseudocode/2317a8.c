
void FUN_002317a8(void)

{
  ulong uVar1;
  undefined8 in_x4;
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined1 uStack0000000000000060;
  
  uVar1 = func_0x003f0e88(&uStack0000000000000060,in_x4);
  if ((uVar1 & 1) == 0) {
    func_0x001bf1c4();
    *unaff_x19 = 0x8000000000000000;
  }
  else {
    uVar2 = unaff_x20[0xc];
    uVar4 = unaff_x20[0xf];
    uVar3 = unaff_x20[0xe];
    unaff_x19[0xd] = unaff_x20[0xd];
    unaff_x19[0xc] = uVar2;
    unaff_x19[0xf] = uVar4;
    unaff_x19[0xe] = uVar3;
    uVar2 = unaff_x20[0x10];
    unaff_x19[0x11] = unaff_x20[0x11];
    unaff_x19[0x10] = uVar2;
    uVar2 = unaff_x20[4];
    uVar4 = unaff_x20[7];
    uVar3 = unaff_x20[6];
    unaff_x19[5] = unaff_x20[5];
    unaff_x19[4] = uVar2;
    unaff_x19[7] = uVar4;
    unaff_x19[6] = uVar3;
    uVar4 = unaff_x20[8];
    uVar3 = unaff_x20[0xb];
    uVar2 = unaff_x20[10];
    unaff_x19[9] = unaff_x20[9];
    unaff_x19[8] = uVar4;
    unaff_x19[0xb] = uVar3;
    unaff_x19[10] = uVar2;
    uVar4 = *unaff_x20;
    uVar3 = unaff_x20[3];
    uVar2 = unaff_x20[2];
    unaff_x19[1] = unaff_x20[1];
    *unaff_x19 = uVar4;
    unaff_x19[3] = uVar3;
    unaff_x19[2] = uVar2;
  }
  return;
}

