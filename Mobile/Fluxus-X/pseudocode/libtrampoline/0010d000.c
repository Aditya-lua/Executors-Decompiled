/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: libtrampoline.so; entry: 0010d000
 */

/* WARNING: Control flow encountered bad instruction data */

void __libc_init(void)

{
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

