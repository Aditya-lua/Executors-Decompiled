/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a242d0
 */

int ECParameters_print(BIO *bp,EC_KEY *key)

{
  int iVar1;
  
  iVar1 = FUN_00a24044((int)bp,key,4,2);
  return iVar1;
}

