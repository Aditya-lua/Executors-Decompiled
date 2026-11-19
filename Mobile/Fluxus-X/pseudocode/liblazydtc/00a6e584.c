/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6e584
 */

undefined4
EVP_PKEY_print_params_fp(FILE *param_1,long param_2,undefined4 param_3,undefined8 param_4)

{
  undefined4 uVar1;
  BIO *a;
  undefined8 uVar2;
  
  a = BIO_new_fp(param_1,0);
  uVar1 = 0;
  if (a != (BIO *)0x0) {
    if (*(long *)(param_2 + 8) == 0) {
      uVar2 = 0;
    }
    else {
      uVar2 = *(undefined8 *)(*(long *)(param_2 + 8) + 0x98);
    }
    uVar1 = FUN_00a6e250(param_2,a,param_3,0x84,uVar2,param_4);
    BIO_free(a);
  }
  return uVar1;
}

