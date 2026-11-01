
/* WARNING: Possible PIC construction at 0x005b569c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005b572c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005ae3b0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005ae858: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005ae1ec: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005ae85c) */
/* WARNING: Removing unreachable block (ram,0x005ae864) */
/* WARNING: Removing unreachable block (ram,0x005ae870) */
/* WARNING: Removing unreachable block (ram,0x005ae87c) */
/* WARNING: Removing unreachable block (ram,0x005ae894) */
/* WARNING: Removing unreachable block (ram,0x005ae8bc) */
/* WARNING: Removing unreachable block (ram,0x005ae89c) */
/* WARNING: Removing unreachable block (ram,0x005ae884) */
/* WARNING: Removing unreachable block (ram,0x005b5730) */
/* WARNING: Removing unreachable block (ram,0x005b5768) */
/* WARNING: Removing unreachable block (ram,0x005b5a18) */
/* WARNING: Removing unreachable block (ram,0x005b5a38) */
/* WARNING: Removing unreachable block (ram,0x005b5c18) */
/* WARNING: Removing unreachable block (ram,0x005b5ad0) */
/* WARNING: Removing unreachable block (ram,0x005b5af0) */
/* WARNING: Removing unreachable block (ram,0x005b5b14) */
/* WARNING: Removing unreachable block (ram,0x005b5b24) */
/* WARNING: Removing unreachable block (ram,0x005b5b04) */
/* WARNING: Removing unreachable block (ram,0x005b5c5c) */
/* WARNING: Removing unreachable block (ram,0x005b5c64) */
/* WARNING: Removing unreachable block (ram,0x005b59fc) */
/* WARNING: Removing unreachable block (ram,0x005b5794) */
/* WARNING: Removing unreachable block (ram,0x005b5910) */
/* WARNING: Removing unreachable block (ram,0x005b5934) */
/* WARNING: Removing unreachable block (ram,0x005b5c6c) */
/* WARNING: Removing unreachable block (ram,0x005b5c74) */
/* WARNING: Removing unreachable block (ram,0x005b5c78) */
/* WARNING: Removing unreachable block (ram,0x005b593c) */
/* WARNING: Removing unreachable block (ram,0x005b57a4) */
/* WARNING: Removing unreachable block (ram,0x005b5a68) */
/* WARNING: Removing unreachable block (ram,0x005b5878) */
/* WARNING: Removing unreachable block (ram,0x005b57e0) */
/* WARNING: Removing unreachable block (ram,0x005b5b38) */
/* WARNING: Removing unreachable block (ram,0x005b5888) */
/* WARNING: Removing unreachable block (ram,0x005b5bb4) */
/* WARNING: Removing unreachable block (ram,0x005b5984) */
/* WARNING: Removing unreachable block (ram,0x005b5bf0) */
/* WARNING: Removing unreachable block (ram,0x005b5c04) */
/* WARNING: Removing unreachable block (ram,0x005b5abc) */
/* WARNING: Removing unreachable block (ram,0x005b5a3c) */
/* WARNING: Removing unreachable block (ram,0x005b5a5c) */
/* WARNING: Removing unreachable block (ram,0x005b5c80) */
/* WARNING: Removing unreachable block (ram,0x005b583c) */
/* WARNING: Removing unreachable block (ram,0x005b594c) */
/* WARNING: Removing unreachable block (ram,0x005b5958) */
/* WARNING: Removing unreachable block (ram,0x005ae35c) */
/* WARNING: Removing unreachable block (ram,0x005ae380) */
/* WARNING: Removing unreachable block (ram,0x005ae398) */
/* WARNING: Removing unreachable block (ram,0x005ae3b4) */
/* WARNING: Removing unreachable block (ram,0x005ae3c0) */
/* WARNING: Removing unreachable block (ram,0x005ae3d8) */
/* WARNING: Removing unreachable block (ram,0x005ae400) */
/* WARNING: Removing unreachable block (ram,0x005ae3e0) */
/* WARNING: Removing unreachable block (ram,0x005ae3c8) */
/* WARNING: Removing unreachable block (ram,0x005ae3a0) */
/* WARNING: Removing unreachable block (ram,0x005ae388) */
/* WARNING: Removing unreachable block (ram,0x005b58d8) */
/* WARNING: Removing unreachable block (ram,0x005ae828) */
/* WARNING: Removing unreachable block (ram,0x005b59c4) */
/* WARNING: Removing unreachable block (ram,0x005ae1bc) */
/* WARNING: Removing unreachable block (ram,0x005b5788) */
/* WARNING: Removing unreachable block (ram,0x005b5a04) */
/* WARNING: Removing unreachable block (ram,0x005b5a08) */
/* WARNING: Removing unreachable block (ram,0x005b5c9c) */
/* WARNING: Removing unreachable block (ram,0x005b56a0) */
/* WARNING: Removing unreachable block (ram,0x005ae1f0) */
/* WARNING: Removing unreachable block (ram,0x005ae1fc) */
/* WARNING: Removing unreachable block (ram,0x005ae214) */
/* WARNING: Removing unreachable block (ram,0x005ae23c) */
/* WARNING: Removing unreachable block (ram,0x005ae21c) */
/* WARNING: Removing unreachable block (ram,0x005ae204) */
/* WARNING: Recovered jumptable eliminated as dead code */

void FUN_005b56e4(undefined8 *param_1)

{
  long lVar1;
  long *unaff_x19;
  undefined8 *unaff_x22;
  long unaff_x23;
  long unaff_x24;
  
  do {
    func_0x005d2ac4(param_1);
    param_1 = unaff_x22;
    do {
      param_1 = param_1 + 1;
      unaff_x23 = unaff_x23 + -1;
      if (unaff_x23 == 0) {
        if (*unaff_x19 == 0) {
          __Unwind_Resume();
        }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR__free_00a24e58)();
        return;
      }
      lVar1 = *(long *)*param_1;
      *(long *)*param_1 = lVar1 + unaff_x24;
      LORelease();
    } while (lVar1 != 1);
    unaff_x22 = param_1;
  } while( true );
}

