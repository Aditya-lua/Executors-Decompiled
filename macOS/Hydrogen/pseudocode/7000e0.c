
undefined8 FUN_007000e0(float param_1,float param_2,long param_3)

{
  bool in_ZR;
  bool in_CY;
  int iVar1;
  undefined8 uVar2;
  ulong *puVar3;
  float *unaff_x20;
  int iVar4;
  long unaff_x21;
  ulong uVar5;
  float fVar6;
  ulong uVar7;
  float fVar8;
  float fVar9;
  float fVar10;
  
  if (in_CY && !in_ZR) {
    func_0x006e63b0();
  }
  else {
    fVar8 = *(float *)(unaff_x21 + 4);
    fVar6 = *(float *)(param_3 + 4);
    if (fVar8 <= fVar6) {
      fVar10 = *(float *)(unaff_x21 + 8);
      fVar9 = *(float *)(param_3 + 8);
      if (fVar10 <= fVar9) {
        if (param_1 <= *unaff_x20) {
          param_1 = *unaff_x20;
        }
        if (param_1 <= param_2) {
          param_2 = param_1;
        }
        if (fVar8 <= unaff_x20[1]) {
          fVar8 = unaff_x20[1];
        }
        if (fVar8 <= fVar6) {
          fVar6 = fVar8;
        }
        if (fVar10 <= unaff_x20[2]) {
          fVar10 = unaff_x20[2];
        }
        if (fVar10 <= fVar9) {
          fVar9 = fVar10;
        }
        func_0x006e38b8(param_2,fVar6,fVar9);
        return 1;
      }
      goto LAB_00700180;
    }
  }
  func_0x006e63b0();
LAB_00700180:
  uVar2 = func_0x006e63b0();
  iVar1 = func_0x006e1e34();
  puVar3 = (ulong *)func_0x006e6d30(uVar2,1);
  uVar5 = *puVar3;
  fVar6 = *(float *)(puVar3 + 1);
  if (1 < iVar1) {
    iVar4 = 1;
    do {
      iVar4 = iVar4 + 1;
      puVar3 = (ulong *)func_0x006e6d30(uVar2,iVar4);
      uVar7 = *puVar3;
      uVar5 = uVar5 ^ (uVar5 ^ uVar7) &
                      CONCAT44(-(uint)((float)(uVar5 >> 0x20) < (float)(uVar7 >> 0x20)),
                               -(uint)((float)uVar5 < (float)uVar7));
      fVar8 = *(float *)(puVar3 + 1);
      if (*(float *)(puVar3 + 1) <= fVar6) {
        fVar8 = fVar6;
      }
      fVar6 = fVar8;
    } while (iVar1 != iVar4);
  }
  func_0x006e38b8(uVar5,(int)(uVar5 >> 0x20),fVar6,uVar2);
  return 1;
}

