/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b43a0
 */

bool SSL_get_async_status(long param_1,undefined4 *param_2)

{
  bool bVar1;
  undefined4 uVar2;
  
  bVar1 = *(long *)(param_1 + 0x1d30) != 0;
  if (bVar1) {
    uVar2 = ASYNC_WAIT_CTX_get_status();
    *param_2 = uVar2;
  }
  return bVar1;
}

