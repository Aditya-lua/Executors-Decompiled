/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa5558
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

__pid_t openssl_get_fork_id(void)

{
  __pid_t _Var1;
  
  _Var1 = getpid();
  return _Var1;
}

