
void FUN_000f328c(float param_1,float param_2,float param_3)

{
  float *pfVar1;
  int iVar2;
  uint uVar3;
  long lVar4;
  int iVar5;
  int *unaff_x19;
  int unaff_w20;
  int unaff_w21;
  float fVar6;
  float fVar7;
  float unaff_s8;
  float unaff_s9;
  float unaff_s10;
  float unaff_s11;
  float unaff_s12;
  float unaff_s13;
  float unaff_s14;
  float unaff_s15;
  
  while( true ) {
    fVar6 = -((unaff_s11 - unaff_s8) * param_1) + param_2 * param_3;
    if (fVar6 * fVar6 * 4.0 < (param_2 * param_2 + param_1 * param_1) * unaff_s10) {
      iVar5 = *unaff_x19;
      if (iVar5 == unaff_x19[1]) {
        iVar2 = iVar5;
        if (iVar5 < 0) {
          iVar2 = iVar5 + 1;
        }
        uVar3 = 8;
        if (iVar5 != 0) {
          uVar3 = iVar5 + (iVar2 >> 1);
        }
        if ((int)uVar3 <= (int)(iVar5 + 1U)) {
          uVar3 = iVar5 + 1U;
        }
        lVar4 = func_0x000b810c(-(ulong)(uVar3 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar3 << 3);
        if (*(long *)(unaff_x19 + 2) != 0) {
          _memcpy(lVar4,*(long *)(unaff_x19 + 2),(long)*unaff_x19 << 3);
          func_0x000b83d4(*(undefined8 *)(unaff_x19 + 2));
        }
        *(long *)(unaff_x19 + 2) = lVar4;
        unaff_x19[1] = uVar3;
        iVar5 = *unaff_x19;
      }
      else {
        lVar4 = *(long *)(unaff_x19 + 2);
      }
      pfVar1 = (float *)(lVar4 + (long)iVar5 * 8);
      *pfVar1 = unaff_s9;
      pfVar1[1] = unaff_s8;
      *unaff_x19 = *unaff_x19 + 1;
      return;
    }
    if (unaff_w21 == unaff_w20) break;
    fVar6 = unaff_s13 + unaff_s12;
    fVar7 = unaff_s14 + unaff_s11;
    unaff_s12 = (unaff_s12 + unaff_s9) * unaff_s15;
    unaff_s11 = (unaff_s11 + unaff_s8) * unaff_s15;
    unaff_s13 = (fVar6 * unaff_s15 + unaff_s12) * unaff_s15;
    unaff_s14 = (fVar7 * unaff_s15 + unaff_s11) * unaff_s15;
    unaff_w20 = unaff_w20 + 1;
    func_0x000f31a8();
    param_1 = unaff_s9 - unaff_s13;
    param_2 = unaff_s8 - unaff_s14;
    param_3 = unaff_s12 - unaff_s9;
  }
  return;
}

