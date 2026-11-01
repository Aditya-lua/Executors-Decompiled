
/* WARNING: Possible PIC construction at 0x005d4050: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005d40a0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005d4038: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005d4054) */
/* WARNING: Removing unreachable block (ram,0x005d40a4) */
/* WARNING: Removing unreachable block (ram,0x005d40ac) */
/* WARNING: Removing unreachable block (ram,0x005d40d0) */
/* WARNING: Removing unreachable block (ram,0x005d40e0) */
/* WARNING: Removing unreachable block (ram,0x005d40c0) */
/* WARNING: Removing unreachable block (ram,0x005d40f4) */
/* WARNING: Removing unreachable block (ram,0x005d411c) */
/* WARNING: Removing unreachable block (ram,0x005d40fc) */
/* WARNING: Removing unreachable block (ram,0x005d4080) */
/* WARNING: Removing unreachable block (ram,0x005d403c) */

void FUN_005d3fec(void)

{
  long lVar1;
  long *plVar2;
  long extraout_x9;
  long *unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x22;
  long unaff_x23;
  
  while( true ) {
    do {
      plVar2 = (long *)*unaff_x22;
      if (plVar2 != (long *)0x0) {
        lVar1 = *plVar2;
        *plVar2 = lVar1 + -1;
        LORelease();
        if (lVar1 == 1) {
          func_0x005d2c74(unaff_x22);
        }
      }
      unaff_x22 = unaff_x22 + 3;
      unaff_x23 = unaff_x23 + -1;
    } while (unaff_x23 != 0);
    if ((*unaff_x19 != 0) || (unaff_x19[3] != 0)) break;
    __Unwind_Resume();
    unaff_x22 = (undefined8 *)((long)unaff_x22 + unaff_x20 + 0x18);
    unaff_x23 = -extraout_x9;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

