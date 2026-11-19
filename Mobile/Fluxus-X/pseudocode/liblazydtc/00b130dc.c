/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b130dc
 */

X509_POLICY_LEVEL * X509_policy_tree_get0_level(X509_POLICY_TREE *tree,int i)

{
  X509_POLICY_LEVEL *pXVar1;
  
  pXVar1 = (X509_POLICY_LEVEL *)0x0;
  if (((tree != (X509_POLICY_TREE *)0x0) && (-1 < i)) &&
     (pXVar1 = (X509_POLICY_LEVEL *)0x0, i < *(int *)(tree + 0x18))) {
    pXVar1 = (X509_POLICY_LEVEL *)(*(long *)(tree + 0x10) + (long)i * 0x20);
  }
  return pXVar1;
}

