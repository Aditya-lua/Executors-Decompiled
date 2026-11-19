/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b130d0
 */

int X509_policy_tree_level_count(X509_POLICY_TREE *tree)

{
  int iVar1;
  
  iVar1 = 0;
  if (tree != (X509_POLICY_TREE *)0x0) {
    iVar1 = *(int *)(tree + 0x18);
  }
  return iVar1;
}

