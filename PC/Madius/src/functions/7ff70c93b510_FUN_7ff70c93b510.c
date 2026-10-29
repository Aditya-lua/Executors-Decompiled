/* 7ff70c93b510 FUN_7ff70c93b510 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c93b510(longlong param_1,longlong param_2,uint param_3)

{
  code *pcVar1;
  longlong lVar2;
  int iVar3;
  undefined8 unaff_RBP;
  undefined4 uStack_5c;
  undefined8 uStack_58;
  undefined8 uStack_50;
  longlong lStack_48;
  longlong lStack_40;
  ulonglong uStack_38;
  ulonglong uStack_30;
  
  if (param_3 != 0 && (param_2 != 0 && param_1 != 0)) {
    uStack_50 = 0;
    lStack_48 = 0;
    uStack_58 = 0x25;
    uStack_5c = 0;
    lStack_40 = param_1;
    iVar3 = (*_DAT_7ff70cb95730)(_DAT_7ff70cc1ab40,0x80862007,&uStack_58,0x20,0,0,&uStack_5c,0);
    uStack_38 = lStack_48;
    if ((iVar3 != 0) && (lStack_48 != 0)) {
      lStack_40 = 0;
      uStack_50 = 0;
      lStack_48 = 0;
      uStack_58 = 0x19;
      uStack_30 = (ulonglong)param_3;
      uStack_5c = 0;
      iVar3 = (*_DAT_7ff70cb95730)(_DAT_7ff70cc1ab40,0x80862007,&uStack_58,0x30,0,0,&uStack_5c,0);
      lVar2 = lStack_40;
      pcVar1 = _DAT_7ff70cb95730;
      if (iVar3 == 0) {
        return 0;
      }
      if (lStack_40 == 0) {
        return 0;
      }
      uStack_38 = (ulonglong)param_3;
      uStack_50 = 0;
      uStack_58 = 0x33;
      uStack_5c = 0;
      lStack_48 = param_2;
      iVar3 = (*_DAT_7ff70cb95730)(_DAT_7ff70cc1ab40,0x80862007,&uStack_58,0x28,0,0,&uStack_5c,0);
      uStack_38 = 0;
      uStack_50 = 0;
      lStack_48 = 0;
      uStack_58 = 0x1a;
      uStack_30 = (ulonglong)param_3;
      uStack_5c = 0;
      lStack_40 = lVar2;
      (*pcVar1)(_DAT_7ff70cc1ab40,0x80862007,&uStack_58,0x30,0,0,&uStack_5c,0);
      return CONCAT71((int7)((ulonglong)unaff_RBP >> 8),iVar3 != 0) & 0xffffffff;
    }
  }
  return 0;
}


