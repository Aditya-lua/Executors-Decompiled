/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a7d54
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

pqueue pqueue_new(void)

{
  pqueue p_Var1;
  
  p_Var1 = (pqueue)CRYPTO_zalloc(0x10,"ssl/pqueue.c",0x28);
  if (p_Var1 == (pqueue)0x0) {
    ERR_new();
    ERR_set_debug("ssl/pqueue.c",0x2b,"pqueue_new");
    ERR_set_error(0x14,0xc0100,0);
  }
  return p_Var1;
}

