
/* WARNING: Possible PIC construction at 0x0022b164: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0022b1bc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0022b5ac: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0022b564: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0022b1c0) */
/* WARNING: Removing unreachable block (ram,0x0022b2ac) */
/* WARNING: Removing unreachable block (ram,0x0022b2cc) */
/* WARNING: Removing unreachable block (ram,0x0022b2f0) */
/* WARNING: Removing unreachable block (ram,0x0022b304) */
/* WARNING: Removing unreachable block (ram,0x0022b30c) */
/* WARNING: Removing unreachable block (ram,0x0022b20c) */
/* WARNING: Removing unreachable block (ram,0x0022b314) */
/* WARNING: Removing unreachable block (ram,0x0022b5dc) */
/* WARNING: Removing unreachable block (ram,0x0022b330) */
/* WARNING: Removing unreachable block (ram,0x0022b34c) */
/* WARNING: Removing unreachable block (ram,0x0022b21c) */
/* WARNING: Removing unreachable block (ram,0x0022b3a8) */
/* WARNING: Removing unreachable block (ram,0x0022b5cc) */
/* WARNING: Removing unreachable block (ram,0x0022b5f0) */
/* WARNING: Removing unreachable block (ram,0x0022b508) */
/* WARNING: Removing unreachable block (ram,0x0022b558) */
/* WARNING: Removing unreachable block (ram,0x0022b568) */
/* WARNING: Removing unreachable block (ram,0x0022b570) */
/* WARNING: Removing unreachable block (ram,0x0022b57c) */
/* WARNING: Removing unreachable block (ram,0x0022b55c) */
/* WARNING: Removing unreachable block (ram,0x0022b544) */
/* WARNING: Removing unreachable block (ram,0x0022b58c) */
/* WARNING: Removing unreachable block (ram,0x0022b554) */
/* WARNING: Removing unreachable block (ram,0x0022b598) */
/* WARNING: Removing unreachable block (ram,0x0022b250) */
/* WARNING: Removing unreachable block (ram,0x0022b370) */
/* WARNING: Removing unreachable block (ram,0x0022b5b0) */

void FUN_0022b148(void)

{
  long lVar1;
  ulong unaff_x21;
  long *unaff_x24;
  undefined1 uStack0000000000000198;
  undefined8 uStack00000000000001a0;
  
  if ((unaff_x21 | 0x8000000000000000) == 0x8000000000000000) {
    if (uStack00000000000001a0 != -0x8000000000000000) {
      func_0x00222b5c(&uStack00000000000001a0);
    }
    lVar1 = *unaff_x24;
    *unaff_x24 = lVar1 + -1;
    LORelease();
    if (lVar1 == 1) {
      DataMemoryBarrier(2,1);
      func_0x001f9b44(&uStack0000000000000198);
    }
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

