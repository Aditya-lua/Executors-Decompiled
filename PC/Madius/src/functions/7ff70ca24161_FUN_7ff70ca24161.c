/* 7ff70ca24161 FUN_7ff70ca24161 */

/* WARNING: Control flow encountered bad instruction data */
/* WARNING: Instruction at (ram,0x7ff70d7675d4) overlaps instruction at (ram,0x7ff70d7675d3)
    */
/* WARNING: Removing unreachable block (ram,0x7ff70d675f00) */
/* WARNING: Removing unreachable block (ram,0x7ff70d675f06) */
/* WARNING: Removing unreachable block (ram,0x7ff70d76759a) */
/* WARNING: Removing unreachable block (ram,0x0ba37e56) */
/* WARNING: Removing unreachable block (ram,0x7ff70d7675b7) */
/* WARNING: Removing unreachable block (ram,0x7ff70d8e410a) */
/* WARNING: Removing unreachable block (ram,0x7ff70d7675e5) */
/* WARNING: Removing unreachable block (ram,0x7ff70d64a43e) */
/* WARNING: Removing unreachable block (ram,0x7ff70d64a454) */
/* WARNING: Removing unreachable block (ram,0x7ff70d63602f) */
/* WARNING: Removing unreachable block (ram,0x7ff70d636035) */
/* WARNING: Removing unreachable block (ram,0x7ff70d7905c1) */
/* WARNING: Removing unreachable block (ram,0x7ff70d636042) */
/* WARNING: Removing unreachable block (ram,0x7ff70d636055) */
/* WARNING: Removing unreachable block (ram,0x7ff70d63603a) */
/* WARNING: Removing unreachable block (ram,0x7ff70da3e6b8) */
/* WARNING: Removing unreachable block (ram,0x7ff70da3e6c6) */
/* WARNING: Removing unreachable block (ram,0x7ff70d5c0a1e) */
/* WARNING: Removing unreachable block (ram,0x7ff70d5c0a41) */
/* WARNING: Removing unreachable block (ram,0x7ff70cc49569) */
/* WARNING: Removing unreachable block (ram,0x7ff70cc495a3) */
/* WARNING: Removing unreachable block (ram,0x7ff70d65350c) */
/* WARNING: Removing unreachable block (ram,0x7ff70d7675eb) */
/* WARNING: Removing unreachable block (ram,0x7ff70d767605) */
/* WARNING: Removing unreachable block (ram,0x7ff70d7675d4) */

void FUN_7ff70ca24161(longlong param_1)

{
  code *pcVar1;
  char cVar2;
  
  func_0x7ff70d91aa75();
  cVar2 = '\0';
  func_0x7ff70d720665();
  func_0x7ff70d9a22c2();
  pcVar1 = (code *)swi(3);
  (*pcVar1)(((char)param_1 - *(char *)(param_1 + 0x53)) - cVar2);
  return;
}


