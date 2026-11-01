
void FUN_006185c4(long param_1)

{
  long unaff_x19;
  long unaff_x20;
  long unaff_x22;
  
  do {
    *(int *)(unaff_x20 + (ulong)*(byte *)(unaff_x19 + param_1) * 4) = (int)param_1;
    param_1 = param_1 + 1;
  } while (unaff_x22 != param_1);
  return;
}

