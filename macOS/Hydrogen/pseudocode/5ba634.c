
/* WARNING: Possible PIC construction at 0x005ba624: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005ba6b4: Changing call to branch */
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
/* WARNING: Removing unreachable block (ram,0x005ba6b8) */
/* WARNING: Removing unreachable block (ram,0x005ba6f0) */
/* WARNING: Removing unreachable block (ram,0x005ba9a0) */
/* WARNING: Removing unreachable block (ram,0x005ba9c0) */
/* WARNING: Removing unreachable block (ram,0x005bab5c) */
/* WARNING: Removing unreachable block (ram,0x005baa68) */
/* WARNING: Removing unreachable block (ram,0x005ba984) */
/* WARNING: Removing unreachable block (ram,0x005ba71c) */
/* WARNING: Removing unreachable block (ram,0x005ba898) */
/* WARNING: Removing unreachable block (ram,0x005ba8bc) */
/* WARNING: Removing unreachable block (ram,0x005baba0) */
/* WARNING: Removing unreachable block (ram,0x005baba8) */
/* WARNING: Removing unreachable block (ram,0x005ba8c4) */
/* WARNING: Removing unreachable block (ram,0x005ba72c) */
/* WARNING: Removing unreachable block (ram,0x005ba9e8) */
/* WARNING: Removing unreachable block (ram,0x005ba800) */
/* WARNING: Removing unreachable block (ram,0x005ba768) */
/* WARNING: Removing unreachable block (ram,0x005baa7c) */
/* WARNING: Removing unreachable block (ram,0x005ba810) */
/* WARNING: Removing unreachable block (ram,0x005baaf8) */
/* WARNING: Removing unreachable block (ram,0x005ba90c) */
/* WARNING: Removing unreachable block (ram,0x005bab34) */
/* WARNING: Removing unreachable block (ram,0x005bab48) */
/* WARNING: Removing unreachable block (ram,0x005baa3c) */
/* WARNING: Removing unreachable block (ram,0x005ba9c4) */
/* WARNING: Removing unreachable block (ram,0x005baa5c) */
/* WARNING: Removing unreachable block (ram,0x005babb4) */
/* WARNING: Removing unreachable block (ram,0x005ba9e4) */
/* WARNING: Removing unreachable block (ram,0x005ba7c4) */
/* WARNING: Removing unreachable block (ram,0x005ba8d4) */
/* WARNING: Removing unreachable block (ram,0x005ba8e0) */
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
/* WARNING: Removing unreachable block (ram,0x005ba860) */
/* WARNING: Removing unreachable block (ram,0x005ae828) */
/* WARNING: Removing unreachable block (ram,0x005ba94c) */
/* WARNING: Removing unreachable block (ram,0x005ae1bc) */
/* WARNING: Removing unreachable block (ram,0x005ba710) */
/* WARNING: Removing unreachable block (ram,0x005ba98c) */
/* WARNING: Removing unreachable block (ram,0x005ba990) */
/* WARNING: Removing unreachable block (ram,0x005babd0) */
/* WARNING: Removing unreachable block (ram,0x005ba628) */
/* WARNING: Removing unreachable block (ram,0x005ae1f0) */
/* WARNING: Removing unreachable block (ram,0x005ae1fc) */
/* WARNING: Removing unreachable block (ram,0x005ae214) */
/* WARNING: Removing unreachable block (ram,0x005ae23c) */
/* WARNING: Removing unreachable block (ram,0x005ae21c) */
/* WARNING: Removing unreachable block (ram,0x005ae204) */
/* WARNING: Recovered jumptable eliminated as dead code */

void FUN_005ba634(undefined8 *param_1)

{
  long lVar1;
  long *unaff_x19;
  long unaff_x23;
  long lVar2;
  
  lVar2 = -unaff_x23;
  do {
    param_1 = param_1 + 1;
    lVar1 = *(long *)*param_1;
    *(long *)*param_1 = lVar1 + -1;
    LORelease();
    if (lVar1 == 1) {
      func_0x005d2ac4(param_1);
    }
    lVar2 = lVar2 + -1;
  } while (lVar2 != 0);
  if (*unaff_x19 == 0) {
    __Unwind_Resume();
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

