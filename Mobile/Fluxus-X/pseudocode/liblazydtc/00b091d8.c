/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b091d8
 */

X509_NAME * X509_get_subject_name(X509 *a)

{
  return (X509_NAME *)a->ex_flags;
}

