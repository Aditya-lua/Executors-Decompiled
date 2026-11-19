/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bd6c0
 */

void ssl_session_dup(void)

{
  long lVar1;
  
  lVar1 = FUN_009bd478();
  if (lVar1 != 0) {
    *(undefined4 *)(lVar1 + 0x2b0) = 0;
  }
  return;
}

