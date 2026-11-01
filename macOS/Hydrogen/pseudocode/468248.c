
void FUN_00468248(long param_1,undefined8 *param_2)

{
  ulong unaff_x19;
  undefined8 unaff_x20;
  undefined1 uStack000000000000000c;
  
  if ((unaff_x19 & 1) == 0) {
    _memcpy((long)param_2 + param_1 + 8,&uStack000000000000000c);
    *param_2 = unaff_x20;
  }
  return;
}

