/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ddc70
 */

void FUN_008ddc70(undefined8 *param_1)

{
  void *__s;
  
  __s = operator_new(0x888);
  memset(__s,0,0x888);
                    /* try { // try from 008ddc98 to 008ddc9f has its CatchHandler @ 008ddcb0 */
  FUN_008df570(__s);
  *param_1 = __s;
  return;
}

