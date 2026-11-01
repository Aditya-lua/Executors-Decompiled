
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00607a18(void)

{
  long lVar1;
  int iVar2;
  undefined8 *puVar3;
  int in_w8;
  long lVar4;
  long lVar5;
  long unaff_x19;
  long unaff_x21;
  
  if (in_w8 == 1) {
    lVar4 = *(long *)(unaff_x19 + 0x18);
    do {
      if (lVar4 == 0) goto LAB_00607a58;
      lVar5 = lVar4 + -1;
      lVar1 = lVar4 * 8;
      lVar4 = lVar5;
    } while (*(long *)(unaff_x21 + lVar1) == 0);
    if ((int)lVar5 == -1) {
LAB_00607a58:
      if (((bRam0000000000a3c150 & 1) == 0) && (iVar2 = ___cxa_guard_acquire(0xa3c150), iVar2 != 0))
      {
        DataMemoryBarrier(2,3);
        if ((bRam0000000000a3c148 & 1) == 0) {
          puRam0000000000a2ab70 = &DAT_005f6230;
          puRam0000000000a2ab78 = &DAT_005f627c;
          puRam0000000000a2aa98 = &DAT_005f4e6c;
          puRam0000000000a2aaa0 = &DAT_005f4ed4;
          puRam0000000000a2aaa8 = &DAT_005f50a8;
          puRam0000000000a2ab28 = &DAT_005f5e0c;
          puRam0000000000a2ab30 = &DAT_005f5e38;
          puRam0000000000a2ab38 = &DAT_005f5eec;
          puRam0000000000a2aae0 = &DAT_005f57fc;
          puRam0000000000a2aae8 = &DAT_005f5844;
          puRam0000000000a2aaf0 = &DAT_005f5984;
          puRam0000000000a2ab80 = &DAT_005f63c0;
          puRam0000000000a2aab8 = &DAT_005f6838;
          puRam0000000000a2ab48 = &DAT_005f9574;
          puRam0000000000a2ab00 = &DAT_005f850c;
          puRam0000000000a2ab90 = &DAT_005fa300;
          bRam0000000000a3c148 = 1;
          DataMemoryBarrier(2,3);
        }
        puRam0000000000a3c168 = &UNK_009f5d60;
        uRam0000000000a3c180 = _UNK_008baa78;
        uRam0000000000a3c178 = _UNK_008baa70;
        puVar3 = (undefined8 *)func_0x006115d0(0x10);
        uRam0000000000a3c190 = 0;
        puRam0000000000a3c188 = puVar3;
        *puVar3 = 0;
        puVar3[1] = 0;
        ___cxa_atexit(&SUB_00087574,0xa3c168,0);
        ___cxa_guard_release(0xa3c150);
      }
      func_0x005ffccc();
      return;
    }
  }
  return;
}

