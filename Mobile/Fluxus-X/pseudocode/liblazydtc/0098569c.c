/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098569c
 */

/* ix::createSelectInterrupt() */

void __thiscall ix::createSelectInterrupt(ix *this)

{
  SelectInterruptPipe *this_00;
  undefined8 *in_x8;
  
  this_00 = operator_new(0x38);
                    /* try { // try from 009856b8 to 009856bb has its CatchHandler @ 009856cc */
  SelectInterruptPipe::SelectInterruptPipe(this_00);
  *in_x8 = this_00;
  return;
}

