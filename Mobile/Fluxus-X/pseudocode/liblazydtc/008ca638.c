/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ca638
 */

void FUN_008ca638(long param_1)

{
  if (*(long *)(param_1 + 0x20) != 0) {
                    /* try { // try from 008ca654 to 008ca65b has its CatchHandler @ 008ca664 */
    FUN_008b7a9c(*(undefined8 *)(param_1 + 0x18),*(long *)(param_1 + 0x20),
                 *(long *)(param_1 + 0x28) << 3,0);
  }
  return;
}

