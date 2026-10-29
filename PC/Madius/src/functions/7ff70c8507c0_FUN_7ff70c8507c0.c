/* 7ff70c8507c0 FUN_7ff70c8507c0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c8507c0(int param_1,uint param_2)

{
  undefined4 uVar1;
  longlong lVar2;
  code *pcVar3;
  longlong lVar4;
  ulonglong uVar5;
  uint uVar6;
  undefined1 auStack_58 [32];
  undefined1 auStack_38 [24];
  ulonglong uStack_20;
  
  uStack_20 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_58;
  if ((*(int *)(_DAT_7ff70cc1a3c0 + 0x1f60) < *(int *)(_DAT_7ff70cc1a3c0 + 0x1f50)) &&
     (*(int *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f58) +
              (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1f60) * 0x38) == param_1)) {
    FUN_7ff70c802a20(auStack_38,0x14,&UNK_7ff70cb803de);
    uVar5 = FUN_7ff70c826d00(auStack_38,0,param_2 | 0x4000000);
    lVar4 = _DAT_7ff70cc1a3c0;
    if ((char)uVar5 == '\0') {
      lVar2 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
      uVar6 = *(uint *)(lVar2 + 0x14);
      if (((uVar6 & 0x4000000) == 0) || (*(int *)(_DAT_7ff70cc1a3c0 + 0x1f60) == 0)) {
        uVar5 = uVar5 & 0xffffffff;
        FUN_7ff70c80af70(&UNK_7ff70cb8fed7);
      }
      else {
        if (((*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f98) == lVar2) &&
            (*(char *)(_DAT_7ff70cc1a3c0 + 0x2029) == '\x01')) &&
           (*(int *)(_DAT_7ff70cc1a3c0 + 0x1fa4) == 0)) {
          *(uint *)(_DAT_7ff70cc1a3c0 + 0x202c) =
               *(uint *)(_DAT_7ff70cc1a3c0 + 0x202c) & 0xfffffff0 | 2;
          uVar6 = *(uint *)(lVar2 + 0x14);
        }
        uVar5 = uVar5 & 0xffffffff;
        uVar1 = *(undefined4 *)(lVar4 + 0x1394);
        if ((uVar6 & 0x1000000) != 0) {
          *(undefined4 *)(lVar4 + 0x1394) = *(undefined4 *)(lVar2 + 0x10);
        }
        FUN_7ff70c833070();
        *(undefined4 *)(lVar4 + 0x1394) = uVar1;
      }
    }
  }
  else {
    *(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x1e70) = 0;
    uVar5 = 0;
  }
  if (_DAT_7ff70cbebd80 == (uStack_20 ^ (ulonglong)auStack_58)) {
    return uVar5;
  }
  FUN_7ff70caa97e0(uStack_20 ^ (ulonglong)auStack_58);
  pcVar3 = (code *)swi(3);
  uVar5 = (*pcVar3)();
  return uVar5;
}


