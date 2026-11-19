/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: libtrampoline.so; entry: 001047a8
 */

/* WARNING: Removing unreachable block (ram,0x001047f8) */

void entry(void)

{
  code *UNRECOVERED_JUMPTABLE;
  
  UNRECOVERED_JUMPTABLE = (code *)__libc_init();
  if (UNRECOVERED_JUMPTABLE == (code *)0x0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00104820. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)();
  return;
}

