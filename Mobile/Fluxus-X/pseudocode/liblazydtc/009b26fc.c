/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b26fc
 */

void SSL_set1_host(long param_1,long param_2)

{
  int iVar1;
  
  if ((param_2 == 0) ||
     (iVar1 = X509_VERIFY_PARAM_set1_ip_asc(*(undefined8 *)(param_1 + 0x4d8),param_2), iVar1 != 1))
  {
    X509_VERIFY_PARAM_set1_host(*(undefined8 *)(param_1 + 0x4d8),param_2,0);
    return;
  }
  return;
}

