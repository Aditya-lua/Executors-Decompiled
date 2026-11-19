/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae92bc
 */

undefined8 OPENSSL_sk_set(int *param_1,uint param_2,undefined8 param_3)

{
  ulong uVar1;
  
  if (param_1 == (int *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/stack/stack.c",0x1c5,"OPENSSL_sk_set");
    ERR_set_error(0xf,0xc0102,0);
  }
  else {
    if ((-1 < (int)param_2) && ((int)param_2 < *param_1)) {
      uVar1 = -(ulong)(param_2 >> 0x1f) & 0xfffffff800000000 | (ulong)param_2 << 3;
      *(undefined8 *)(*(long *)(param_1 + 2) + uVar1) = param_3;
      param_1[4] = 0;
      return *(undefined8 *)(*(long *)(param_1 + 2) + uVar1);
    }
    ERR_new();
    ERR_set_debug("crypto/stack/stack.c",0x1c9,"OPENSSL_sk_set");
    ERR_set_error(0xf,0x80106,&DAT_002da603,param_2);
  }
  return 0;
}

