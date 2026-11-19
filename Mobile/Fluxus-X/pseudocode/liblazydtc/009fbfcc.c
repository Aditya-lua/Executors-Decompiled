/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fbfcc
 */

long BIO_get_callback(bio_st *param_1,int param_2,char *param_3,int param_4,long param_5,
                     long param_6)

{
  return (long)param_1->cb_arg;
}

