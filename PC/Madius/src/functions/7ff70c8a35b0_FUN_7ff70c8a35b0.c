/* 7ff70c8a35b0 FUN_7ff70c8a35b0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c8a35b0(void)

{
  longlong lVar1;
  longlong lVar2;
  undefined8 uVar3;
  code *pcVar4;
  char cVar5;
  longlong lVar6;
  longlong lVar7;
  float fVar8;
  undefined1 auVar9 [16];
  undefined1 auStack_38 [32];
  ulonglong uStack_18;
  
  lVar7 = _DAT_7ff70cc1a3c0;
  uStack_18 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_38;
  *(undefined1 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0xce) = 1;
  lVar1 = *(longlong *)(lVar7 + 0x1440);
  if (*(char *)(lVar1 + 0xd1) == '\0') {
    cVar5 = FUN_7ff70c854790();
    if (((cVar5 != '\0') && (*(uint *)(lVar7 + 0x2038) < 2)) &&
       (lVar2 = *(longlong *)(lVar7 + 0x1f98),
       (*(byte *)(*(longlong *)(lVar7 + 0x1f98) + 0x17) & 0x10) != 0)) {
      do {
        lVar6 = lVar2;
        lVar2 = *(longlong *)(lVar6 + 0x3b0);
        if (lVar2 == 0) break;
      } while ((*(byte *)(lVar2 + 0x17) & 0x10) != 0);
      if (((lVar2 == lVar1) && (*(int *)(lVar6 + 0x1d8) == 0)) &&
         ((*(byte *)(lVar7 + 0x202c) & 0x80) == 0)) {
        FUN_7ff70c819c70(lVar1,0);
        FUN_7ff70c8544b0(*(undefined4 *)(lVar1 + 0x3f4),1,0,lVar1 + 0x408);
        if (*(char *)(lVar7 + 0x1f90) == '\x01') {
          *(undefined1 *)(lVar7 + 0x1f90) = 0;
          *(undefined1 *)(lVar7 + 0x1fe8) = 2;
        }
        *(undefined2 *)(lVar7 + 0x1f91) = 0x101;
        FUN_7ff70c854910(*(undefined4 *)(lVar7 + 0x2038),*(undefined4 *)(lVar7 + 0x2040),
                         *(undefined4 *)(lVar7 + 0x202c),*(undefined4 *)(lVar7 + 0x2030));
      }
    }
    FUN_7ff70c830dc0();
    FUN_7ff70c844300();
    *(float *)(lVar1 + 0x17c) = *(float *)(lVar1 + 0x118) - *(float *)(lVar1 + 0x28);
    lVar2 = *(longlong *)(lVar7 + 0x1f48);
    lVar7 = (longlong)*(int *)(lVar7 + 8000) * 0x38;
    *(undefined1 *)(lVar2 + -1 + lVar7) = 0;
    uVar3 = *(undefined8 *)(lVar2 + -0x2c + lVar7);
    fVar8 = *(float *)(lVar1 + 0x130) - *(float *)(lVar1 + 0x98);
    auVar9 = blendvps(ZEXT416((uint)fVar8),ZEXT416((uint)*(float *)(lVar1 + 0x138)),
                      ZEXT416(-(uint)(fVar8 <= *(float *)(lVar1 + 0x138))));
    *(int *)(lVar1 + 0x138) = auVar9._0_4_;
    FUN_7ff70c849270();
    *(undefined4 *)(lVar1 + 0x1d4) = 1;
    *(undefined1 *)(lVar1 + 0x158) = 0;
    *(undefined4 *)(lVar1 + 0x170) = 0;
    *(undefined1 *)(lVar1 + 0x17b) = 0;
    *(undefined8 *)(lVar1 + 0x130) = uVar3;
  }
  if (_DAT_7ff70cbebd80 == (uStack_18 ^ (ulonglong)auStack_38)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_18 ^ (ulonglong)auStack_38);
  pcVar4 = (code *)swi(3);
  (*pcVar4)();
  return;
}


