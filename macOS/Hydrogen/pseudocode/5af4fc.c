
void FUN_005af4fc(ulong param_1)

{
  bool in_ZR;
  bool in_CY;
  
  if (in_CY && !in_ZR || (1L << (param_1 & 0x3f) & 0x760U) == 0) goto LAB_005af51c;
  do {
    __Unwind_Resume();
LAB_005af51c:
    func_0x005adc80();
  } while( true );
}

