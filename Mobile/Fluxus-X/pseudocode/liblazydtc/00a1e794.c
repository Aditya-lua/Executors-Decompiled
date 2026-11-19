/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1e794
 */

int DH_generate_key(DH *dh)

{
  int iVar1;
  
                    /* WARNING: Could not recover jumptable at 0x00a1e79c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = (**(code **)&(dh[1].priv_key)->top)();
  return iVar1;
}

