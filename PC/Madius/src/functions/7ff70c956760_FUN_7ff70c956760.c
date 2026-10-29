/* 7ff70c956760 FUN_7ff70c956760 */

void FUN_7ff70c956760(longlong param_1,int param_2)

{
  byte bVar1;
  
  bVar1 = FUN_7ff70c9551d0((char)param_1,0);
  if (((param_2 == 2 & bVar1) == 0) &&
     (bVar1 = param_2 == 1 | param_2 == 2 & (bVar1 ^ 1), *(byte *)(param_1 + 0x2ce) != bVar1)) {
    *(byte *)(param_1 + 0x2ce) = bVar1;
  }
  return;
}


