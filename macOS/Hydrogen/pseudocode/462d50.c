
void FUN_00462d50(long param_1,undefined8 *param_2)

{
  ulong unaff_x19;
  undefined8 unaff_x20;
  
  if ((unaff_x19 & 1) == 0) {
    _memcpy((long)param_2 + param_1 + 8);
    *param_2 = unaff_x20;
  }
  return;
}

