
void FUN_0019e648(undefined8 param_1)

{
  long lVar1;
  undefined8 *puVar2;
  long unaff_x19;
  
  if (unaff_x19 != 0) {
    func_0x00187bd4();
  }
  __Unwind_Resume(param_1);
  lVar1 = _CFUUIDCreate(*(undefined8 *)PTR__kCFAllocatorDefault_009b0238);
  if (lVar1 == 0) {
    puVar2 = (undefined8 *)func_0x007a11c0(&UNK_0081cb73,0x22,&UNK_009c2120);
                    /* WARNING: Could not recover jumptable at 0x007b2170. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__CFRelease_00a241b0)(*puVar2);
    return;
  }
  return;
}

