/* 7ff70c7b54d0 FUN_7ff70c7b54d0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong FUN_7ff70c7b54d0(longlong param_1)

{
  float fVar1;
  float fVar2;
  code *pcVar3;
  code *unaff_RBX;
  longlong lVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  float fVar7;
  
  lVar4 = 0;
  FUN_7ff70cb12b80(param_1,0,0x238);
  *(undefined4 *)(param_1 + 0x30) = 0x3f800000;
  fVar2 = _DAT_7ff70cb1ba24;
  fVar1 = _DAT_7ff70cb1ba20;
  func_0x7ff70d747e8f();
  pcVar3 = _DAT_7ff70cb965c8;
  do {
    fVar7 = (float)(int)lVar4;
    fVar7 = ((fVar7 + fVar7) * fVar1) / fVar2;
    uVar5 = (*unaff_RBX)(fVar7);
    uVar6 = (*pcVar3)(fVar7);
    *(undefined4 *)(param_1 + 0x70 + lVar4 * 8) = uVar6;
    fVar7 = (float)((int)lVar4 + 1);
    *(undefined4 *)(param_1 + 0x74 + lVar4 * 8) = uVar5;
    fVar7 = ((fVar7 + fVar7) * fVar1) / fVar2;
    uVar5 = (*unaff_RBX)(fVar7);
    uVar6 = (*pcVar3)(fVar7);
    *(undefined4 *)(param_1 + 0x78 + lVar4 * 8) = uVar6;
    *(undefined4 *)(param_1 + 0x7c + lVar4 * 8) = uVar5;
    lVar4 = lVar4 + 2;
  } while (lVar4 != 0x30);
  *(float *)(param_1 + 0x1f0) = *(float *)(param_1 + 0x2c) / _DAT_7ff70cb1ba28;
  return param_1;
}


