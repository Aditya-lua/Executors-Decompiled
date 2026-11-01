longlong FUN_180e3b430(uint param_1,undefined8 param_2,uint *param_3,uint *param_4)

{
  longlong *plVar1;
  undefined8 uVar2;
  code *pcVar3;
  int iVar4;
  longlong lVar5;
  longlong lVar6;
  ulonglong uVar7;
  undefined4 auStackX_18 [2];
  
  do {
    if (param_3 == param_4) {
      lVar6 = 0;
code_r0x000180e3b522:
      func_0x000180e35d14(0xe);
      auStackX_18[0] = 0;
      iVar4 = VirtualProtect(&DAT_181110000,0x100,4,auStackX_18);
      if (iVar4 != 0) {
        lVar5 = lVar6;
        if (lVar6 == 0) {
          lVar5 = -1;
        }
        LOCK();
        *(longlong *)(&DAT_181110000 + (ulonglong)param_1 * 8) = lVar5;
        UNLOCK();
        iVar4 = VirtualProtect(&DAT_181110000,0x100,2,auStackX_18);
        if (iVar4 != 0) {
          func_0x000180e35d68(0xe);
          return lVar6;
        }
      }
      FUN_180e36488();
      pcVar3 = (code *)swi(3);
      lVar6 = (*pcVar3)();
      return lVar6;
    }
    uVar7 = (ulonglong)*param_3;
    lVar6 = *(longlong *)(uVar7 * 8 + 0x1810d4930);
    if (lVar6 == 0) {
      uVar2 = *(undefined8 *)(&UNK_181037fd0 + uVar7 * 8);
      lVar6 = LoadLibraryExW(uVar2,0,0x800);
      if ((lVar6 != 0) ||
         ((((iVar4 = GetLastError(), iVar4 == 0x57 &&
            (iVar4 = func_0x000180e49360(uVar2,&UNK_181038610,7), iVar4 != 0)) &&
           (iVar4 = func_0x000180e49360(uVar2,&UNK_181038620,7), iVar4 != 0)) &&
          (lVar6 = LoadLibraryExW(uVar2,0,0), lVar6 != 0)))) {
        LOCK();
        plVar1 = (longlong *)(uVar7 * 8 + 0x1810d4930);
        lVar5 = *plVar1;
        *plVar1 = lVar6;
        UNLOCK();
        if (lVar5 != 0) {
          FreeLibrary(lVar6);
        }
        goto LAB_180e3b5c8;
      }
      LOCK();
      *(undefined8 *)(uVar7 * 8 + 0x1810d4930) = 0xffffffffffffffff;
      UNLOCK();
    }
    else if (lVar6 != -1) {
LAB_180e3b5c8:
      lVar6 = GetProcAddress(lVar6,param_2);
      goto code_r0x000180e3b522;
    }
    param_3 = param_3 + 1;
  } while( true );
}

