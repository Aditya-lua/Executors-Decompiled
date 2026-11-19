/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0d6e8
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */
/* std::terminate() */

void std::terminate(void)

{
  long *plVar1;
  ulong uVar2;
  long unaff_x19;
  
                    /* try { // try from 00c0d6f0 to 00c0d717 has its CatchHandler @ 00c0d724 */
  plVar1 = (long *)__cxa_get_globals_fast();
  if ((plVar1 != (long *)0x0) && (unaff_x19 = *plVar1, unaff_x19 != 0)) goto LAB_00c0d710;
  do {
    FUN_00c0d774(__cxa_terminate_handler);
LAB_00c0d710:
    uVar2 = FUN_00c29308(unaff_x19 + 0x60);
  } while ((uVar2 & 1) == 0);
  FUN_00c0d774(*(undefined8 *)(unaff_x19 + 0x28));
                    /* WARNING: Subroutine does not return */
                    /* catch(type#1 @ 00000000) { ... } // from try @ 00c0d6f0 with catch @ 00c0d724
                        */
  FUN_007fe114();
}

