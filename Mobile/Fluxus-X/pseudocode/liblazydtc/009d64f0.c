/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d64f0
 */

undefined8
FUN_009d64f0(undefined8 param_1,undefined4 param_2,undefined4 param_3,undefined8 param_4,
            undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  undefined8 *ptr;
  undefined8 *ptr_00;
  undefined8 uVar1;
  
  ptr = CRYPTO_malloc(0x18,"ssl/statem/extensions_cust.c",0x1a5);
  ptr_00 = CRYPTO_malloc(0x10,"ssl/statem/extensions_cust.c",0x1a7);
  if ((ptr == (undefined8 *)0x0) || (ptr_00 == (undefined8 *)0x0)) {
    CRYPTO_free(ptr);
  }
  else {
    *ptr = param_6;
    ptr[1] = param_4;
    ptr[2] = param_5;
    *ptr_00 = param_8;
    ptr_00[1] = param_7;
    uVar1 = FUN_009d6678(param_1,param_2,param_3,0x1d0,&LAB_009d63b4,&LAB_009d6848,ptr,&LAB_009d6864
                         ,ptr_00);
    if ((int)uVar1 != 0) {
      return uVar1;
    }
    CRYPTO_free(ptr);
  }
  CRYPTO_free(ptr_00);
  return 0;
}

