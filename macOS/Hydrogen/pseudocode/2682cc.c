
void FUN_002682cc(long param_1,long param_2)

{
  undefined8 *puVar1;
  long lVar2;
  long *unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x22;
  long lVar3;
  long unaff_x29;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined1 uStack0000000000000008;
  long lStack0000000000000010;
  long lStack0000000000000018;
  undefined1 uStack0000000000000050;
  undefined8 uStack0000000000000058;
  undefined8 uStack0000000000000060;
  undefined8 uStack0000000000000068;
  
  lStack0000000000000018 = 1;
  uStack0000000000000058 = unaff_x22[1];
  _uStack0000000000000050 = *unaff_x22;
  uStack0000000000000068 = unaff_x22[3];
  uStack0000000000000060 = unaff_x22[2];
  lVar3 = 0x30;
  _uStack0000000000000008 = param_1;
  lStack0000000000000010 = param_2;
  while (lVar2 = lStack0000000000000018, func_0x0026bfa4(unaff_x29 + -0x50,&uStack0000000000000050),
        *(long *)(unaff_x29 + -0x50) != 2) {
    if (lVar2 == _uStack0000000000000008) {
      func_0x0079ce18(&uStack0000000000000008,lVar2,1,8,0x30);
      unaff_x20 = lStack0000000000000010;
    }
    puVar1 = (undefined8 *)(unaff_x20 + lVar3);
    uVar6 = *(undefined8 *)(unaff_x29 + -0x40);
    uVar5 = *(undefined8 *)(unaff_x29 + -0x28);
    uVar4 = *(undefined8 *)(unaff_x29 + -0x30);
    uVar8 = *(undefined8 *)(unaff_x29 + -0x48);
    uVar7 = *(undefined8 *)(unaff_x29 + -0x50);
    puVar1[3] = *(undefined8 *)(unaff_x29 + -0x38);
    puVar1[2] = uVar6;
    puVar1[5] = uVar5;
    puVar1[4] = uVar4;
    puVar1[1] = uVar8;
    *puVar1 = uVar7;
    lStack0000000000000018 = lVar2 + 1;
    lVar3 = lVar3 + 0x30;
  }
  unaff_x19[1] = lStack0000000000000010;
  *unaff_x19 = _uStack0000000000000008;
  unaff_x19[2] = lStack0000000000000018;
  return;
}

