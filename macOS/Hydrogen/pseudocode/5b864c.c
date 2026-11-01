
/* WARNING: Possible PIC construction at 0x005b8678: Changing call to branch */
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
/* WARNING: Removing unreachable block (ram,0x005b867c) */
/* WARNING: Removing unreachable block (ram,0x005b86b4) */
/* WARNING: Removing unreachable block (ram,0x005b8964) */
/* WARNING: Removing unreachable block (ram,0x005b8984) */
/* WARNING: Removing unreachable block (ram,0x005b8b54) */
/* WARNING: Removing unreachable block (ram,0x005b8a0c) */
/* WARNING: Removing unreachable block (ram,0x005b8a2c) */
/* WARNING: Removing unreachable block (ram,0x005b8a50) */
/* WARNING: Removing unreachable block (ram,0x005b8a60) */
/* WARNING: Removing unreachable block (ram,0x005b8a40) */
/* WARNING: Removing unreachable block (ram,0x005b8b98) */
/* WARNING: Removing unreachable block (ram,0x005b8ba0) */
/* WARNING: Removing unreachable block (ram,0x005b8948) */
/* WARNING: Removing unreachable block (ram,0x005b86e0) */
/* WARNING: Removing unreachable block (ram,0x005b885c) */
/* WARNING: Removing unreachable block (ram,0x005b8880) */
/* WARNING: Removing unreachable block (ram,0x005b8ba8) */
/* WARNING: Removing unreachable block (ram,0x005b8bb0) */
/* WARNING: Removing unreachable block (ram,0x005b8bb4) */
/* WARNING: Removing unreachable block (ram,0x005b8888) */
/* WARNING: Removing unreachable block (ram,0x005b86f0) */
/* WARNING: Removing unreachable block (ram,0x005b89ac) */
/* WARNING: Removing unreachable block (ram,0x005b87c4) */
/* WARNING: Removing unreachable block (ram,0x005b872c) */
/* WARNING: Removing unreachable block (ram,0x005b8a74) */
/* WARNING: Removing unreachable block (ram,0x005b87d4) */
/* WARNING: Removing unreachable block (ram,0x005b8af0) */
/* WARNING: Removing unreachable block (ram,0x005b88d0) */
/* WARNING: Removing unreachable block (ram,0x005b8b2c) */
/* WARNING: Removing unreachable block (ram,0x005b8b40) */
/* WARNING: Removing unreachable block (ram,0x005b89e0) */
/* WARNING: Removing unreachable block (ram,0x005b8988) */
/* WARNING: Removing unreachable block (ram,0x005b8a00) */
/* WARNING: Removing unreachable block (ram,0x005b8bbc) */
/* WARNING: Removing unreachable block (ram,0x005b89a8) */
/* WARNING: Removing unreachable block (ram,0x005b8788) */
/* WARNING: Removing unreachable block (ram,0x005b8898) */
/* WARNING: Removing unreachable block (ram,0x005b88a4) */
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
/* WARNING: Removing unreachable block (ram,0x005b8824) */
/* WARNING: Removing unreachable block (ram,0x005ae828) */
/* WARNING: Removing unreachable block (ram,0x005b8910) */
/* WARNING: Removing unreachable block (ram,0x005ae1bc) */
/* WARNING: Removing unreachable block (ram,0x005b86d4) */
/* WARNING: Removing unreachable block (ram,0x005b8950) */
/* WARNING: Removing unreachable block (ram,0x005b8954) */
/* WARNING: Removing unreachable block (ram,0x005b8bd8) */
/* WARNING: Removing unreachable block (ram,0x005ae1f0) */
/* WARNING: Removing unreachable block (ram,0x005ae1fc) */
/* WARNING: Removing unreachable block (ram,0x005ae214) */
/* WARNING: Removing unreachable block (ram,0x005ae23c) */
/* WARNING: Removing unreachable block (ram,0x005ae21c) */
/* WARNING: Removing unreachable block (ram,0x005ae204) */
/* WARNING: Recovered jumptable eliminated as dead code */

void FUN_005b864c(void)

{
  long *unaff_x19;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  
  while( true ) {
    func_0x0059ce88(unaff_x22);
    unaff_x23 = unaff_x23 + -1;
    if (unaff_x23 == 0) break;
    unaff_x22 = unaff_x24;
    unaff_x24 = unaff_x24 + 0x40;
  }
  if (*unaff_x19 == 0) {
    __Unwind_Resume();
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

