/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b8000
 */

undefined4 SSL_session_reused(long param_1)

{
  return *(undefined4 *)(param_1 + 0x4d0);
}

