
void FUN_00519e44(void)

{
  int iVar1;
  undefined8 *puVar2;
  
  func_0x00187bd4();
  puVar2 = (undefined8 *)__Unwind_Resume();
  puVar2 = (undefined8 *)*puVar2;
  iVar1 = *(int *)(puVar2 + 2);
  *(int *)(puVar2 + 2) = iVar1 + -1;
  if (iVar1 + -1 == 0) {
    puVar2[1] = 0;
                    /* WARNING: Could not recover jumptable at 0x007b3b50. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__pthread_mutex_unlock_00a252d0)(*puVar2);
    return;
  }
  return;
}

