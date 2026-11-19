/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b131c4
 */

stack_st_POLICYQUALINFO * X509_policy_node_get0_qualifiers(X509_POLICY_NODE *node)

{
  stack_st_POLICYQUALINFO *psVar1;
  
  psVar1 = (stack_st_POLICYQUALINFO *)0x0;
  if (node != (X509_POLICY_NODE *)0x0) {
    psVar1 = *(stack_st_POLICYQUALINFO **)(*(long *)node + 0x10);
  }
  return psVar1;
}

