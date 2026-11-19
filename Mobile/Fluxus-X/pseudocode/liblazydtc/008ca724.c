/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ca724
 */

void FUN_008ca724(undefined8 *param_1)

{
  if (param_1[1] != 0) {
                    /* try { // try from 008ca740 to 008ca747 has its CatchHandler @ 008ca750 */
    FUN_008b7a9c(*param_1,param_1[1],param_1[2] << 2,0);
  }
  return;
}

