
void FUN_0019e674(long param_1)

{
  long lVar1;
  undefined8 *puVar2;
  
  lVar1 = _CFUUIDCreate(**(undefined8 **)(param_1 + 0x238));
  if (lVar1 == 0) {
    puVar2 = (undefined8 *)func_0x007a11c0(&UNK_0081cb73,0x22,&UNK_009c2120);
                    /* WARNING: Could not recover jumptable at 0x007b2170. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__CFRelease_00a241b0)(*puVar2);
    return;
  }
  return;
}

