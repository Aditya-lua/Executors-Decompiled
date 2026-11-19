/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b124b4
 */

void X509_policy_tree_free(X509_POLICY_TREE *tree)

{
  int iVar1;
  undefined8 *puVar2;
  
  if (tree == (X509_POLICY_TREE *)0x0) {
    return;
  }
  OPENSSL_sk_free(*(undefined8 *)(tree + 0x28));
  OPENSSL_sk_pop_free(*(undefined8 *)(tree + 0x30),&LAB_00b12578);
  if (0 < *(int *)(tree + 0x18)) {
    puVar2 = *(undefined8 **)(tree + 0x10);
    iVar1 = 0;
    do {
      X509_free((X509 *)*puVar2);
      OPENSSL_sk_pop_free(puVar2[1],ossl_policy_node_free);
      ossl_policy_node_free(puVar2[2]);
      iVar1 = iVar1 + 1;
      puVar2 = puVar2 + 4;
    } while (iVar1 < *(int *)(tree + 0x18));
  }
  OPENSSL_sk_pop_free(*(undefined8 *)(tree + 0x20),ossl_policy_data_free);
  CRYPTO_free(*(void **)(tree + 0x10));
  CRYPTO_free(tree);
  return;
}

