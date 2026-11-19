/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b61a8
 */

void SSL_get0_alpn_selected(long param_1,long *param_2,undefined4 *param_3)

{
  undefined4 uVar1;
  long lVar2;
  
  lVar2 = *(long *)(param_1 + 0x488);
  *param_2 = lVar2;
  uVar1 = 0;
  if (lVar2 != 0) {
    uVar1 = *(undefined4 *)(param_1 + 0x490);
  }
  *param_3 = uVar1;
  return;
}

