/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b011f4
 */

undefined8 FUN_00b011f4(undefined8 param_1,long *param_2,BIO *param_3,ulong param_4)

{
  long lVar1;
  
  BIO_printf(param_3,"%*s",param_4 & 0xffffffff,&DAT_002ab32c);
  if (*param_2 == 0) {
    lVar1 = param_2[1];
  }
  else {
    BIO_write(param_3,"Not Before: ",0xc);
    ASN1_GENERALIZEDTIME_print(param_3,(ASN1_GENERALIZEDTIME *)*param_2);
    if (param_2[1] == 0) {
      return 1;
    }
    BIO_write(param_3,&DAT_002a715d,2);
    lVar1 = param_2[1];
  }
  if (lVar1 != 0) {
    BIO_write(param_3,"Not After: ",0xb);
    ASN1_GENERALIZEDTIME_print(param_3,(ASN1_GENERALIZEDTIME *)param_2[1]);
  }
  return 1;
}

