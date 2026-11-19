/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ba964
 */

bool FUN_009ba964(void)

{
  int iVar1;
  
  iVar1 = SSL_CTX_use_serverinfo_file();
  return 0 < iVar1;
}

