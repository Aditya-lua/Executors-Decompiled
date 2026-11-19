/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e1ca4
 */

int dtls1_get_queue_priority(uint param_1,int param_2)

{
  return (param_1 & 0xffff) * 2 - param_2;
}

