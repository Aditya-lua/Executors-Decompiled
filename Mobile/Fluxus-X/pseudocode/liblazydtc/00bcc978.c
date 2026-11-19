/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcc978
 */

/* std::__ndk1::promise<void>::get_future() */

void std::__ndk1::promise<void>::get_future(void)

{
  undefined8 *in_x0;
  future<void> *in_x8;
  
  if ((__assoc_sub_state *)*in_x0 == (__assoc_sub_state *)0x0) {
                    /* WARNING: Subroutine does not return */
    FUN_00bcc1b4(3);
  }
  future<void>::future(in_x8,(__assoc_sub_state *)*in_x0);
  return;
}

