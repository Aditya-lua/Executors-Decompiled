/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0099a008
 */

/* ix::WebSocketTransport::getRandomUnsigned() */

int ix::WebSocketTransport::getRandomUnsigned(void)

{
  long lVar1;
  
  lVar1 = std::__ndk1::chrono::system_clock::now();
  return (int)(SUB168(SEXT816(lVar1) * SEXT816(0x431bde82d7b634db),8) >> 0x12) -
         (SUB164(SEXT816(lVar1) * SEXT816(0x431bde82d7b634db),0xc) >> 0x1f);
}

