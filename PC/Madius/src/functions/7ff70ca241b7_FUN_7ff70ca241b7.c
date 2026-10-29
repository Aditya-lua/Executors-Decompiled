/* 7ff70ca241b7 FUN_7ff70ca241b7 */

void FUN_7ff70ca241b7(undefined8 param_1)

{
  code *pcVar1;
  char cVar2;
  undefined7 uVar3;
  char in_CF;
  
  uVar3 = (undefined7)((ulonglong)param_1 >> 8);
  cVar2 = (char)param_1;
  func_0x7ff70d720665();
  func_0x7ff70d9a22c2();
  pcVar1 = (code *)swi(3);
  (*pcVar1)((cVar2 - *(char *)(CONCAT71(uVar3,cVar2) + 0x53)) - in_CF);
  return;
}


