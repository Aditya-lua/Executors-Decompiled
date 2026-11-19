/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b131b4
 */

ASN1_OBJECT * X509_policy_node_get0_policy(X509_POLICY_NODE *node)

{
  ASN1_OBJECT *pAVar1;
  
  pAVar1 = (ASN1_OBJECT *)0x0;
  if (node != (X509_POLICY_NODE *)0x0) {
    pAVar1 = *(ASN1_OBJECT **)(*(long *)node + 8);
  }
  return pAVar1;
}

