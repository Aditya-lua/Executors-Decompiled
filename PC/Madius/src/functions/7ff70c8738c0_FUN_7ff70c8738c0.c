/* 7ff70c8738c0 FUN_7ff70c8738c0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong FUN_7ff70c8738c0(void)

{
  int *piVar1;
  longlong lVar2;
  longlong lVar3;
  longlong lVar4;
  longlong lVar5;
  short sVar6;
  int iVar7;
  longlong lVar8;
  undefined8 uStack_30;
  undefined4 uStack_28;
  undefined4 uStack_24;
  undefined4 uStack_20;
  undefined4 uStack_1c;
  
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar2 = **(longlong **)(_DAT_7ff70cc1a3c0 + 0x1f88);
  lVar5 = *(longlong *)(lVar2 + 0x50);
  if (lVar5 == 0) {
    lVar5 = (*_DAT_7ff70cbe9460)(0xe0,_DAT_7ff70cc1a3d0);
    lVar3 = _DAT_7ff70cc1a3c0;
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar8 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar8 * 8) == *piVar1) {
        sVar6 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar8 * 8) + 1;
      }
      else {
        iVar7 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar7;
        lVar8 = (longlong)iVar7;
        *(int *)(lVar3 + 0x2874 + lVar8 * 8) = *piVar1;
        *(undefined4 *)(lVar3 + 0x2878 + lVar8 * 8) = 0;
        sVar6 = 1;
      }
      *(short *)(lVar3 + 0x2878 + lVar8 * 8) = sVar6;
      *(int *)(lVar3 + 0x2868) = *(int *)(lVar3 + 0x2868) + 1;
    }
    FUN_7ff70c7b5780(lVar5,lVar4 + 0x1148);
    *(undefined **)(lVar5 + 0xd8) = &UNK_7ff70cb875f7;
    *(longlong *)(lVar2 + 0x50) = lVar5;
    if (*(int *)(lVar2 + 0x44) == *(int *)(lVar4 + 5000)) {
      return lVar5;
    }
  }
  else if (*(int *)(lVar2 + 0x44) == *(int *)(_DAT_7ff70cc1a3c0 + 5000)) {
    return lVar5;
  }
  FUN_7ff70c7b6160(lVar5);
  lVar3 = *(longlong *)(lVar4 + 0x40);
  uStack_28 = *(undefined4 *)(lVar3 + 0x28);
  uStack_24 = *(undefined4 *)(lVar3 + 0x2c);
  uStack_20 = *(undefined4 *)(lVar3 + 0x30);
  uStack_1c = *(undefined4 *)(lVar3 + 0x34);
  FUN_7ff70c7b8300(lVar5,&uStack_28);
  uStack_30 = CONCAT44((float)((ulonglong)*(undefined8 *)(lVar2 + 0x10) >> 0x20) +
                       (float)((ulonglong)*(undefined8 *)(lVar2 + 8) >> 0x20),
                       (float)*(undefined8 *)(lVar2 + 0x10) + (float)*(undefined8 *)(lVar2 + 8));
  FUN_7ff70c7b7c50(lVar5,lVar2 + 8,&uStack_30,0);
  *(undefined4 *)(lVar2 + 0x44) = *(undefined4 *)(lVar4 + 5000);
  return lVar5;
}


