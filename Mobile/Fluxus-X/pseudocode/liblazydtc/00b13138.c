/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b13138
 */

int X509_policy_level_node_count(X509_POLICY_LEVEL *level)

{
  int iVar1;
  uint uVar2;
  
  if (level == (X509_POLICY_LEVEL *)0x0) {
    uVar2 = 0;
  }
  else {
    uVar2 = (uint)(*(long *)(level + 0x10) != 0);
    if (*(long *)(level + 8) != 0) {
      iVar1 = OPENSSL_sk_num();
      uVar2 = iVar1 + uVar2;
    }
  }
  return uVar2;
}

