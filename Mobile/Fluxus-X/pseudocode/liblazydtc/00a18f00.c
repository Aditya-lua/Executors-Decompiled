/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a18f00
 */

bool bn_set_words(undefined8 *param_1,void *param_2,uint param_3)

{
  long lVar1;
  
  lVar1 = bn_wexpand(param_1,param_3);
  if (lVar1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_intern.c",0xbf,"bn_set_words");
    ERR_set_error(3,0xc0100,0);
  }
  else {
    memcpy((void *)*param_1,param_2,
           -(ulong)(param_3 >> 0x1f) & 0xfffffff800000000 | (ulong)param_3 << 3);
    *(uint *)(param_1 + 1) = param_3;
    bn_correct_top(param_1);
  }
  return lVar1 != 0;
}

