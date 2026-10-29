/* 7ff70ca172e9 FUN_7ff70ca172e9 */

/* WARNING: Control flow encountered bad instruction data */
/* WARNING: Instruction at (ram,0x7ff70d63603a) overlaps instruction at (ram,0x7ff70d636035)
    */
/* WARNING: Removing unreachable block (ram,0x7ff70da3e6b8) */
/* WARNING: Removing unreachable block (ram,0x7ff70d5c0a1e) */
/* WARNING: Removing unreachable block (ram,0x7ff70d5c0a41) */
/* WARNING: Removing unreachable block (ram,0x7ff70cc49569) */
/* WARNING: Removing unreachable block (ram,0x7ff70cc495a3) */
/* WARNING: Removing unreachable block (ram,0x7ff70d65350c) */
/* WARNING: Removing unreachable block (ram,0x7ff70da3e6c6) */
/* WARNING: Removing unreachable block (ram,0x7ff70d636028) */
/* WARNING: Removing unreachable block (ram,0x7ff70d636035) */
/* WARNING: Removing unreachable block (ram,0x7ff70d7905c1) */
/* WARNING: Removing unreachable block (ram,0x7ff70d636042) */
/* WARNING: Removing unreachable block (ram,0x7ff70d636055) */
/* WARNING: Removing unreachable block (ram,0x7ff70d63603a) */

void FUN_7ff70ca172e9(void)

{
  undefined8 in_RAX;
  longlong unaff_R15;
  undefined8 auStack_cc31 [6533];
  code *pcStack_8;
  
  LOCK();
  *(undefined8 *)((longlong)auStack_cc31 + unaff_R15) = in_RAX;
  UNLOCK();
  pcStack_8 = FUN_7ff70ca172fe;
  FUN_7ff70d67f7bf();
  LOCK();
  UNLOCK();
  return;
}


