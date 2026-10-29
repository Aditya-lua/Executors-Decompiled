/* 7ff70c86a980 Unwind@7ff70c86a980 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void Unwind_7ff70c86a980(undefined8 param_1,longlong param_2)

{
  float fVar1;
  longlong lVar2;
  longlong lVar3;
  longlong lVar4;
  longlong lVar5;
  float fVar6;
  float fVar7;
  undefined1 auVar8 [16];
  float fVar9;
  
  lVar5 = *(longlong *)(param_2 + 0x218);
  if (lVar5 != 0) {
    lVar2 = *(longlong *)(param_2 + 0x1f0);
    if ((*(byte *)(lVar2 + 0x27b4) & 0x20) != 0) {
      func_0x7ff70c800cf0(&UNK_7ff70cb91c43,*(undefined8 *)(*(longlong *)(lVar2 + 0x1440) + 8));
    }
    lVar4 = _DAT_7ff70cc1a3c0;
    if ((*(uint *)(param_2 + 0x200) < 0x7fffffff) && (-1 < *(int *)(param_2 + 0x1f8))) {
      fVar9 = *(float *)(param_2 + 0x204);
      fVar6 = (float)((double)fVar9 * (double)(int)*(uint *)(param_2 + 0x200) +
                     *(double *)(param_2 + 0x208) + *(double *)(param_2 + 0x210));
      lVar3 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
      fVar1 = *(float *)(lVar3 + 0x11c);
      *(float *)(lVar3 + 0x11c) = fVar6;
      fVar7 = fVar6 - *(float *)(lVar4 + 0xca0);
      auVar8 = blendvps(ZEXT416((uint)fVar7),ZEXT416((uint)*(float *)(lVar3 + 0x134)),
                        ZEXT416(-(uint)(fVar7 <= *(float *)(lVar3 + 0x134))));
      *(int *)(lVar3 + 0x134) = auVar8._0_4_;
      *(float *)(lVar3 + 0x124) = fVar6 - fVar9;
      *(float *)(lVar3 + 0x14c) = fVar9 - *(float *)(lVar4 + 0xca0);
      if (*(longlong *)(lVar3 + 0x1c8) != 0) {
        *(float *)(*(longlong *)(lVar3 + 0x1c8) + 0x1c) = fVar6;
      }
      lVar4 = *(longlong *)(lVar4 + 0x2278);
      if (lVar4 != 0) {
        if (*(char *)(lVar4 + 0x238) == '\x01') {
          func_0x7ff70c908ca0(lVar4);
        }
        fVar9 = (fVar6 - fVar1) / fVar9 + _DAT_7ff70cb1ba70;
        *(undefined4 *)(lVar4 + 0x80) = *(undefined4 *)(lVar3 + 0x11c);
        *(int *)(lVar4 + 0x98) = *(int *)(lVar4 + 0x98) + (int)fVar9;
      }
    }
    *(undefined4 *)(lVar5 + 0xc) = *(undefined4 *)(lVar5 + 0x18);
    lVar5 = (longlong)*(int *)(lVar2 + 0x2260);
    *(int *)(lVar2 + 0x2260) = *(int *)(lVar2 + 0x2260) + -1;
    if (1 < lVar5) {
      *(longlong *)(*(longlong *)(*(longlong *)(lVar2 + 0x2270) + -0x50 + lVar5 * 0x28) + 0x28) =
           *(longlong *)(lVar2 + 0x2270) + lVar5 * 0x28 + -0x50;
    }
  }
  return;
}


