/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1a47c
 */

int BN_GENCB_call(BN_GENCB *cb,int a,int b)

{
  int iVar1;
  
  if (cb == (BN_GENCB *)0x0) {
    return 1;
  }
  if (cb->ver == 2) {
                    /* WARNING: Could not recover jumptable at 0x00a1a4e4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    iVar1 = (*(cb->cb).cb_1)(a,b,cb);
    return iVar1;
  }
  iVar1 = 0;
  if (cb->ver == 1) {
    if ((cb->cb).cb_1 == (_func_414 *)0x0) {
      return 1;
    }
    (*(cb->cb).cb_1)(a,b,cb->arg);
    iVar1 = 1;
  }
  return iVar1;
}

