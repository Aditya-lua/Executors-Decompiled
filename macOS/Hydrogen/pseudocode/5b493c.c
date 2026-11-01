
/* WARNING: Possible PIC construction at 0x005b496c: Changing call to branch */
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
/* WARNING: Removing unreachable block (ram,0x005b4970) */
/* WARNING: Removing unreachable block (ram,0x005b49a8) */
/* WARNING: Removing unreachable block (ram,0x005b4c38) */
/* WARNING: Removing unreachable block (ram,0x005b4c58) */
/* WARNING: Removing unreachable block (ram,0x005b4e48) */
/* WARNING: Removing unreachable block (ram,0x005b4d00) */
/* WARNING: Removing unreachable block (ram,0x005b4d20) */
/* WARNING: Removing unreachable block (ram,0x005b4d44) */
/* WARNING: Removing unreachable block (ram,0x005b4d54) */
/* WARNING: Removing unreachable block (ram,0x005b4d34) */
/* WARNING: Removing unreachable block (ram,0x005b4e8c) */
/* WARNING: Removing unreachable block (ram,0x005b4e94) */
/* WARNING: Removing unreachable block (ram,0x005b4c1c) */
/* WARNING: Removing unreachable block (ram,0x005b49d4) */
/* WARNING: Removing unreachable block (ram,0x005b4b30) */
/* WARNING: Removing unreachable block (ram,0x005b4b54) */
/* WARNING: Removing unreachable block (ram,0x005b4e9c) */
/* WARNING: Removing unreachable block (ram,0x005b4ea4) */
/* WARNING: Removing unreachable block (ram,0x005b4ea8) */
/* WARNING: Removing unreachable block (ram,0x005b4b5c) */
/* WARNING: Removing unreachable block (ram,0x005b49e4) */
/* WARNING: Removing unreachable block (ram,0x005b4c80) */
/* WARNING: Removing unreachable block (ram,0x005b4a98) */
/* WARNING: Removing unreachable block (ram,0x005b4a20) */
/* WARNING: Removing unreachable block (ram,0x005b4d68) */
/* WARNING: Removing unreachable block (ram,0x005b4aa8) */
/* WARNING: Removing unreachable block (ram,0x005b4de4) */
/* WARNING: Removing unreachable block (ram,0x005b4ba4) */
/* WARNING: Removing unreachable block (ram,0x005b4e20) */
/* WARNING: Removing unreachable block (ram,0x005b4e34) */
/* WARNING: Removing unreachable block (ram,0x005b4cd4) */
/* WARNING: Removing unreachable block (ram,0x005b4c5c) */
/* WARNING: Removing unreachable block (ram,0x005b4cf4) */
/* WARNING: Removing unreachable block (ram,0x005b4eb0) */
/* WARNING: Removing unreachable block (ram,0x005b4c7c) */
/* WARNING: Removing unreachable block (ram,0x005b4a7c) */
/* WARNING: Removing unreachable block (ram,0x005b4b6c) */
/* WARNING: Removing unreachable block (ram,0x005b4b78) */
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
/* WARNING: Removing unreachable block (ram,0x005b4af8) */
/* WARNING: Removing unreachable block (ram,0x005ae828) */
/* WARNING: Removing unreachable block (ram,0x005b4be4) */
/* WARNING: Removing unreachable block (ram,0x005ae1bc) */
/* WARNING: Removing unreachable block (ram,0x005b49c8) */
/* WARNING: Removing unreachable block (ram,0x005b4c24) */
/* WARNING: Removing unreachable block (ram,0x005b4c28) */
/* WARNING: Removing unreachable block (ram,0x005b4ecc) */
/* WARNING: Removing unreachable block (ram,0x005ae1f0) */
/* WARNING: Removing unreachable block (ram,0x005ae1fc) */
/* WARNING: Removing unreachable block (ram,0x005ae214) */
/* WARNING: Removing unreachable block (ram,0x005ae23c) */
/* WARNING: Removing unreachable block (ram,0x005ae21c) */
/* WARNING: Removing unreachable block (ram,0x005ae204) */
/* WARNING: Recovered jumptable eliminated as dead code */

void FUN_005b493c(void)

{
  long *unaff_x19;
  long unaff_x22;
  long unaff_x23;
  
  do {
    func_0x0059ce88(unaff_x22);
    unaff_x23 = unaff_x23 + -1;
    unaff_x22 = unaff_x22 + 0x40;
  } while (unaff_x23 != 0);
  if (*unaff_x19 == 0) {
    __Unwind_Resume();
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

