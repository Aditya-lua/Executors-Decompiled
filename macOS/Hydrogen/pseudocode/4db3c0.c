
void FUN_004db3c0(void)

{
  long *plVar1;
  long lVar2;
  
  plVar1 = (long *)func_0x007a2668();
  lVar2 = *plVar1;
  if (lVar2 == -0x8000000000000000 || lVar2 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(plVar1[1],lVar2,1);
  return;
}

