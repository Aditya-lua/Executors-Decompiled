/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aca494
 */

bool FUN_00aca494(void)

{
  bool bVar1;
  int iVar2;
  long lVar3;
  
  lVar3 = RAND_get0_primary(0);
  bVar1 = false;
  if (lVar3 != 0) {
    iVar2 = EVP_RAND_get_state();
    bVar1 = iVar2 == 1;
  }
  return bVar1;
}

