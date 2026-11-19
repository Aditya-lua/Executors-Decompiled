/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aef738
 */

void ERR_print_errors_fp(FILE *fp)

{
  BIO *a;
  
  a = BIO_new_fp(fp,0);
  if (a == (BIO *)0x0) {
    return;
  }
  ERR_print_errors_cb((cb *)&LAB_00aef724,a);
  BIO_free(a);
  return;
}

