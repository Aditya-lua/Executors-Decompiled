/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b13118
 */

stack_st_X509_POLICY_NODE * X509_policy_tree_get0_user_policies(X509_POLICY_TREE *tree)

{
  long lVar1;
  stack_st_X509_POLICY_NODE *psVar2;
  
  psVar2 = (stack_st_X509_POLICY_NODE *)0x0;
  if (tree != (X509_POLICY_TREE *)0x0) {
    lVar1 = 0x30;
    if (((byte)tree[0x38] & 2) != 0) {
      lVar1 = 0x28;
    }
    psVar2 = *(stack_st_X509_POLICY_NODE **)(tree + lVar1);
  }
  return psVar2;
}

