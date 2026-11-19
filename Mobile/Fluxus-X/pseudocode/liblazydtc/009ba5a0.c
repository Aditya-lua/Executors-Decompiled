/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ba5a0
 */

bool FUN_009ba5a0(long param_1,void *param_2)

{
  int iVar1;
  long lVar2;
  
  if (*(SSL **)(param_1 + 0x20) == (SSL *)0x0) {
    lVar2 = SSL_CTX_ctrl(*(SSL_CTX **)(param_1 + 0x18),0x5c,0,param_2);
    iVar1 = (int)lVar2;
  }
  else {
    lVar2 = SSL_ctrl(*(SSL **)(param_1 + 0x20),0x5c,0,param_2);
    iVar1 = (int)lVar2;
  }
  return 0 < iVar1;
}

