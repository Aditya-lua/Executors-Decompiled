/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c7e54
 */

int tls_engine_finish(ENGINE *e)

{
  int iVar1;
  
  iVar1 = ENGINE_finish(e);
  return iVar1;
}

