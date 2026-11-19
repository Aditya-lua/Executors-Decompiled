/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b13178
 */

X509_POLICY_NODE * X509_policy_level_get0_node(X509_POLICY_LEVEL *level,int i)

{
  X509_POLICY_NODE *pXVar1;
  
  if (level == (X509_POLICY_LEVEL *)0x0) {
    return (X509_POLICY_NODE *)0x0;
  }
  if (*(X509_POLICY_NODE **)(level + 0x10) != (X509_POLICY_NODE *)0x0) {
    if (i == 0) {
      return *(X509_POLICY_NODE **)(level + 0x10);
    }
    i = i + -1;
  }
  pXVar1 = (X509_POLICY_NODE *)OPENSSL_sk_value(*(undefined8 *)(level + 8),i);
  return pXVar1;
}

