/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7a2c
 */

size_t SSL_SESSION_get_master_key(long param_1,void *param_2,ulong param_3)

{
  size_t __n;
  
  __n = *(ulong *)(param_1 + 8);
  if (param_3 != 0) {
    if (param_3 <= __n) {
      __n = param_3;
    }
    memcpy(param_2,(void *)(param_1 + 0x50),__n);
  }
  return __n;
}

