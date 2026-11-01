
void FUN_000b6548(float param_1,undefined8 param_2,undefined1 param_3 [16],long param_4)

{
  undefined8 uVar1;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  float fVar4;
  
  auVar2._0_4_ = (int)param_3._0_4_;
  auVar2._4_4_ = (int)param_3._4_4_;
  auVar2._8_4_ = (int)param_3._8_4_;
  auVar2._12_4_ = (int)param_3._12_4_;
  auVar2 = NEON_scvtf(auVar2,4);
  *(long *)(param_4 + 0x84) = auVar2._8_8_;
  *(long *)(param_4 + 0x7c) = auVar2._0_8_;
  fVar4 = (float)(int)(*(float *)(param_4 + 0x90) * param_1);
  if (*(float *)(param_4 + 0x90) == 3.4028235e+38) {
    fVar4 = 3.4028235e+38;
  }
  *(float *)(param_4 + 0x90) = fVar4;
  auVar3._0_4_ = (int)(*(float *)(param_4 + 0xbc) * param_1);
  auVar3._4_4_ = (int)(*(float *)(param_4 + 0xc0) * param_1);
  auVar3._8_4_ = (int)(*(float *)(param_4 + 0xc4) * param_1);
  auVar3._12_4_ = (int)(*(float *)(param_4 + 200) * param_1);
  auVar2 = NEON_scvtf(auVar3,4);
  *(long *)(param_4 + 0xc4) = auVar2._8_8_;
  *(long *)(param_4 + 0xbc) = auVar2._0_8_;
  uVar1 = NEON_scvtf(CONCAT44((int)((float)((ulong)*(undefined8 *)(param_4 + 0xcc) >> 0x20) *
                                   (float)((ulong)param_2 >> 0x20)),
                              (int)((float)*(undefined8 *)(param_4 + 0xcc) * (float)param_2)),4);
  *(undefined8 *)(param_4 + 0xcc) = uVar1;
  *(float *)(param_4 + 0xd4) = (float)(int)(*(float *)(param_4 + 0xd4) * param_1);
  return;
}

