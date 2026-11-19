/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b3edc
 */

undefined8 FUN_008b3edc(undefined8 param_1,code *param_2,undefined8 param_3)

{
                    /* try { // try from 008b3ef4 to 008b3efb has its CatchHandler @ 008b3f10 */
  (*param_2)(param_1,param_3);
  return 0;
}

