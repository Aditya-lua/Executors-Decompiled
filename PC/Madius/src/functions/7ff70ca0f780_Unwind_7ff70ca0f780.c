/* 7ff70ca0f780 Unwind@7ff70ca0f780 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void Unwind_7ff70ca0f780(undefined8 param_1,longlong param_2)

{
  int *piVar1;
  
  piVar1 = *(int **)(param_2 + 0xb88);
  LOCK();
  *piVar1 = *piVar1 + -1;
  UNLOCK();
  if (*piVar1 == 0) {
    (*_DAT_7ff70cb74468)(*(undefined8 *)(param_2 + 0xbe8));
    piVar1 = *(int **)(param_2 + 0xb70);
    LOCK();
    *piVar1 = *piVar1 + -1;
    UNLOCK();
    if (*piVar1 == 0) {
      (*_DAT_7ff70cb74470)(*(undefined8 *)(param_2 + 0xbe8));
    }
  }
  return;
}


