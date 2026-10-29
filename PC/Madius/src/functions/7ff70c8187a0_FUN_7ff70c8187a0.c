/* 7ff70c8187a0 FUN_7ff70c8187a0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

byte FUN_7ff70c8187a0(float *param_1,int param_2,ushort param_3)

{
  longlong lVar1;
  code *pcVar2;
  longlong lVar3;
  longlong lVar4;
  char cVar5;
  byte bVar6;
  undefined8 uVar7;
  longlong lVar8;
  float fVar9;
  undefined1 auVar10 [16];
  undefined1 auStack_78 [32];
  undefined4 uStack_58;
  undefined4 uStack_50;
  undefined4 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  ulonglong uStack_30;
  
  lVar3 = _DAT_7ff70cc1a3c0;
  uStack_30 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_78;
  lVar8 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  if ((((param_2 != 0) && ((param_3 & 0x20) == 0)) &&
      (*(int *)(_DAT_7ff70cc1a3c0 + 0x14a0) == param_2)) &&
     (*(int *)(_DAT_7ff70cc1a3c0 + 0x14a4) = *(int *)(_DAT_7ff70cc1a3c0 + 0x14a4) + 1,
     *(int *)(lVar3 + 0x1494) == param_2)) {
    uStack_38 = CONCAT44((float)((ulonglong)*(undefined8 *)(param_1 + 2) >> 0x20) +
                         _UNK_7ff70cb1bb64,(float)*(undefined8 *)(param_1 + 2) + _DAT_7ff70cb1bb60);
    uStack_40 = CONCAT44((float)((ulonglong)*(undefined8 *)param_1 >> 0x20) + _UNK_7ff70cb1d554,
                         (float)*(undefined8 *)param_1 + _DAT_7ff70cb1d550);
    uStack_48 = 0x40000000;
    uStack_50 = 0;
    uStack_58 = 0;
    FUN_7ff70c7bd870(*(undefined8 *)(lVar8 + 0x2c8),&uStack_40,&uStack_38,0xff0000ff);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  if (*(longlong *)(lVar3 + 0x1448) == lVar8) {
    lVar1 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
    auVar10 = blendvps(ZEXT416((uint)*(float *)(lVar1 + 0x260)),ZEXT416((uint)*param_1),
                       ZEXT416(-(uint)(*(float *)(lVar1 + 0x260) <= *param_1)));
    if (auVar10._0_4_ - *(float *)(_DAT_7ff70cc1a3c0 + 0xcb4) <=
        *(float *)(_DAT_7ff70cc1a3c0 + 0xe0)) {
      auVar10 = blendvps(ZEXT416((uint)*(float *)(lVar1 + 0x264)),ZEXT416((uint)param_1[1]),
                         ZEXT416(-(uint)(*(float *)(lVar1 + 0x264) <= param_1[1])));
      bVar6 = 0;
      if (*(float *)(_DAT_7ff70cc1a3c0 + 0xe4) <
          auVar10._0_4_ - *(float *)(_DAT_7ff70cc1a3c0 + 0xcb8)) goto LAB_7ff70c8188ab;
      fVar9 = param_1[2];
      if (*(float *)(lVar1 + 0x268) <= param_1[2]) {
        fVar9 = *(float *)(lVar1 + 0x268);
      }
      if (*(float *)(_DAT_7ff70cc1a3c0 + 0xcb4) + fVar9 <= *(float *)(_DAT_7ff70cc1a3c0 + 0xe0))
      goto LAB_7ff70c8188ab;
      fVar9 = param_1[3];
      if (*(float *)(lVar1 + 0x26c) <= param_1[3]) {
        fVar9 = *(float *)(lVar1 + 0x26c);
      }
      if (fVar9 + *(float *)(_DAT_7ff70cc1a3c0 + 0xcb8) <= *(float *)(_DAT_7ff70cc1a3c0 + 0xe4))
      goto LAB_7ff70c8188ab;
      if (((*(int *)(lVar3 + 0x149c) == 0) || (*(int *)(lVar3 + 0x149c) == param_2)) ||
         (*(char *)(lVar3 + 0x14b0) == '\x01')) {
        if (((*(int *)(lVar3 + 0x14b4) == 0) || (*(int *)(lVar3 + 0x14b4) == param_2)) ||
           ((*(char *)(lVar3 + 0x14c1) != '\0' || (*(char *)(lVar3 + 0x14c6) == '\x01')))) {
          if ((param_3 & 0x2000) == 0) {
            if (((((*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f98) == 0) ||
                  (lVar1 = *(longlong *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f98) + 0x3c0),
                  lVar1 == 0)) || (*(char *)(lVar1 + 0xcd) != '\x01')) ||
                ((lVar8 = *(longlong *)(lVar8 + 0x3c0), lVar1 == lVar8 ||
                 ((*(byte *)(lVar1 + 0x17) & 0xc) == 0)))) ||
               (*(longlong *)(lVar8 + 0x3c0) == lVar1)) goto LAB_7ff70c8189d2;
            do {
              if (lVar8 == lVar1) goto LAB_7ff70c8189d2;
              lVar8 = *(longlong *)(lVar8 + 0x3b8);
            } while (lVar8 != 0);
          }
          else {
LAB_7ff70c8189d2:
            if (param_2 != 0) {
              if (((*(char *)(lVar3 + 0x21b0) != '\x01') || (*(int *)(lVar3 + 0x21cc) != param_2))
                 || ((*(byte *)(lVar3 + 0x21b4) & 2) != 0)) {
                *(int *)(_DAT_7ff70cc1a3c0 + 0x149c) = param_2;
                *(undefined1 *)(lVar4 + 0x14b0) = 0;
                if (*(int *)(lVar4 + 0x14a0) != param_2) {
                  *(undefined8 *)(lVar4 + 0x14a8) = 0;
                }
                if (((param_3 & 0x4000) == 0) ||
                   (*(undefined1 *)(lVar3 + 0x14b0) = 1, *(int *)(lVar3 + 0x14a0) == param_2)) {
                  if ((param_2 == *(int *)(lVar3 + 0x1e20)) &&
                     ((((*(byte *)(lVar3 + 0x1e29) & 4) != 0 &&
                       (*(int *)(lVar3 + 0x14b4) != param_2)) &&
                      (cVar5 = FUN_7ff70c8183c0(0x11000), cVar5 != '\0')))) {
                    uVar7 = FUN_7ff70c818e20(*(undefined4 *)(lVar3 + 0x1e6c));
                    FUN_7ff70c818c30(&UNK_7ff70cb8320d,uVar7);
                  }
                  if ((param_3 & 0x400) == 0) {
                    if ((*(char *)(lVar3 + 0x27f1) == '\x01') &&
                       (*(int *)(lVar3 + 0x14a0) == param_2)) {
                      uVar7 = FUN_7ff70c818fa0();
                      uStack_48 = 0x3f800000;
                      uStack_50 = 0;
                      uStack_58 = 0;
                      FUN_7ff70c7bd870(uVar7,param_1,param_1 + 2,0xff00ffff);
                    }
                    if (*(int *)(lVar3 + 0x27f4) == param_2) {
                      pcVar2 = (code *)swi(3);
                      bVar6 = (*pcVar2)();
                      return bVar6;
                    }
                    goto LAB_7ff70c818b06;
                  }
                  if (*(int *)(lVar3 + 0x14b4) == param_2) {
                    FUN_7ff70c817fe0();
                  }
                  goto LAB_7ff70c818b2b;
                }
              }
              goto LAB_7ff70c8188a9;
            }
            if ((param_3 & 0x400) == 0) {
LAB_7ff70c818b06:
              bVar6 = (short)param_3 < 0 | *(byte *)(lVar3 + 0x1f91) ^ 1;
              goto LAB_7ff70c8188ab;
            }
          }
LAB_7ff70c818b2b:
          *(undefined1 *)(lVar3 + 0x14b1) = 1;
        }
      }
    }
  }
LAB_7ff70c8188a9:
  bVar6 = 0;
LAB_7ff70c8188ab:
  if (_DAT_7ff70cbebd80 != (uStack_30 ^ (ulonglong)auStack_78)) {
    FUN_7ff70caa97e0(uStack_30 ^ (ulonglong)auStack_78);
    pcVar2 = (code *)swi(3);
    bVar6 = (*pcVar2)();
    return bVar6;
  }
  return bVar6;
}


