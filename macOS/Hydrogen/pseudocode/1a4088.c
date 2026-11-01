
void FUN_001a4088(long param_1,long param_2)

{
  undefined8 *puVar1;
  short *psVar2;
  undefined8 uVar3;
  short sVar4;
  int iVar5;
  short extraout_w1;
  long lVar6;
  long unaff_x20;
  long lVar7;
  undefined8 *unaff_x24;
  undefined8 *unaff_x25;
  long unaff_x26;
  undefined2 *puVar8;
  code *pcVar9;
  long *in_stack_00000000;
  undefined1 uStack0000000000000008;
  long lStack0000000000000010;
  long lStack0000000000000018;
  
  lStack0000000000000018 = 1;
  _uStack0000000000000008 = param_1;
  lStack0000000000000010 = param_2;
  if (unaff_x25 != unaff_x24) {
    lVar7 = 1;
    do {
      puVar1 = unaff_x25 + 2;
      puVar8 = *(undefined2 **)(unaff_x26 + 8);
      uVar3 = *unaff_x25;
      pcVar9 = *(code **)(unaff_x25[1] + 0x48);
      lVar6 = *(long *)(unaff_x26 + 0x10) << 2;
      do {
        if (lVar6 == 0) goto LAB_001a40b8;
        iVar5 = (*pcVar9)(uVar3,*puVar8,puVar8[1]);
        puVar8 = puVar8 + 2;
        lVar6 = lVar6 + -4;
      } while (iVar5 == 0);
      sVar4 = (**(code **)(unaff_x25[1] + 0x38))(*unaff_x25);
      if (sVar4 == 0x10) break;
      if (lVar7 == _uStack0000000000000008) {
        func_0x0079b61c(&uStack0000000000000008,lVar7,1,2,4);
        unaff_x20 = lStack0000000000000010;
      }
      psVar2 = (short *)(unaff_x20 + lVar7 * 4);
      *psVar2 = sVar4;
      psVar2[1] = extraout_w1;
      lVar7 = lVar7 + 1;
      lStack0000000000000018 = lVar7;
LAB_001a40b8:
      unaff_x25 = puVar1;
    } while (puVar1 != unaff_x24);
  }
  in_stack_00000000[1] = lStack0000000000000010;
  *in_stack_00000000 = _uStack0000000000000008;
  in_stack_00000000[2] = lStack0000000000000018;
  return;
}

