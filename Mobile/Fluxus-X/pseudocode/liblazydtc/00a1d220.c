/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1d220
 */

void BN_RECP_CTX_init(BN_RECP_CTX *recp)

{
  (recp->Nr).neg = 0;
  (recp->Nr).flags = 0;
  (recp->Nr).top = 0;
  (recp->Nr).dmax = 0;
  *(undefined8 *)&recp->flags = 0;
  recp->num_bits = 0;
  recp->shift = 0;
  (recp->N).top = 0;
  (recp->N).dmax = 0;
  (recp->N).d = (ulong *)0x0;
  (recp->Nr).d = (ulong *)0x0;
  (recp->N).neg = 0;
  (recp->N).flags = 0;
  bn_init();
  bn_init(&recp->Nr);
  return;
}

