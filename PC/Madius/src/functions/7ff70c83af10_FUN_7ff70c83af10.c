/* 7ff70c83af10 FUN_7ff70c83af10 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c83af10(undefined8 param_1,ulonglong param_2)

{
  int *piVar1;
  code *pcVar2;
  uint uVar3;
  longlong lVar4;
  longlong lVar5;
  uint uVar6;
  short sVar7;
  longlong lVar8;
  ulonglong *puVar9;
  int iVar10;
  longlong lVar11;
  ulonglong uStack_40;
  undefined1 auStack_38 [40];
  ulonglong uStack_10;
  
  lVar4 = _DAT_7ff70cc1a3c0;
  puVar9 = (ulonglong *)auStack_38;
  uStack_10 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_38;
  if (*(char *)(_DAT_7ff70cc1a3c0 + 0x2720) == '\x01') {
    uStack_40 = 0x7ff70c83af44;
    FUN_7ff70c856f00(&UNK_7ff70cb922d3);
    uVar6 = *(uint *)(lVar4 + 0x2724) & 0xf;
    puVar9 = (ulonglong *)auStack_38;
    if (POPCOUNT(uVar6) == 1) {
      uVar3 = 0;
      for (; (uVar6 & 1) == 0; uVar6 = uVar6 >> 1 | 0x80000000) {
        uVar3 = uVar3 + 1;
      }
      if (uVar3 == 3) {
        puVar9 = (ulonglong *)auStack_38;
        if (1 < *(int *)(lVar4 + 0x2738)) {
          puVar9 = (ulonglong *)auStack_38;
          if (*(code **)(_DAT_7ff70cc1a3c0 + 0xbe8) != (code *)0x0) {
            lVar8 = 0x7ff70cc1a3c8;
            if (*(longlong *)(lVar4 + 0x2740) != 0) {
              lVar8 = *(longlong *)(lVar4 + 0x2740);
            }
            uStack_40 = 0x7ff70c83afbb;
            (**(code **)(_DAT_7ff70cc1a3c0 + 0xbe8))(_DAT_7ff70cc1a3c0,lVar8);
            puVar9 = (ulonglong *)auStack_38;
          }
        }
      }
      else if (uVar3 == 1) {
        uStack_40 = 0x7ff70c83af85;
        func_0x7ff70d8a263e(*(undefined8 *)(lVar4 + 0x2730));
        puVar9 = &uStack_40;
        uStack_40 = param_2;
      }
      else {
        puVar9 = (ulonglong *)auStack_38;
        if (uVar3 == 0) {
          uStack_40 = (ulonglong)uVar3;
          func_0x7ff70d6c2d60(*(undefined8 *)(lVar4 + 0x2730));
          puVar9 = &uStack_40;
        }
      }
    }
    *(undefined1 *)(lVar4 + 0x14b2) = 0;
    *(undefined1 *)(lVar4 + 0x2720) = 0;
    *(undefined4 *)(lVar4 + 0x2724) = 0;
    *(undefined8 *)(lVar4 + 0x2730) = 0;
    lVar8 = *(longlong *)(lVar4 + 0x2740);
    if (lVar8 != 0) {
      *(undefined8 *)(lVar4 + 0x2738) = 0;
      lVar5 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar11 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar11 * 8) == *piVar1) {
          sVar7 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar11 * 8) + 1;
        }
        else {
          iVar10 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar10;
          lVar11 = (longlong)iVar10;
          *(int *)(lVar5 + 0x2874 + lVar11 * 8) = *piVar1;
          *(undefined4 *)(lVar5 + 0x2878 + lVar11 * 8) = 0;
          sVar7 = 1;
        }
        *(short *)(lVar5 + 0x287a + lVar11 * 8) = sVar7;
        *(int *)(lVar5 + 0x286c) = *(int *)(lVar5 + 0x286c) + 1;
      }
      *(undefined8 *)((longlong)puVar9 + -8) = 0x7ff70c83b08e;
      (*_DAT_7ff70cbe9468)(lVar8,_DAT_7ff70cc1a3d0);
      *(undefined8 *)(lVar4 + 0x2740) = 0;
    }
  }
  if (_DAT_7ff70cbebd80 == (*(ulonglong *)((longlong)puVar9 + 0x28) ^ (ulonglong)puVar9)) {
    return;
  }
  *(undefined8 *)((longlong)puVar9 + -8) = 0x7ff70c83b0c0;
  FUN_7ff70caa97e0(*(ulonglong *)((longlong)puVar9 + 0x28) ^ (ulonglong)puVar9);
  pcVar2 = (code *)swi(3);
  (*pcVar2)();
  return;
}


