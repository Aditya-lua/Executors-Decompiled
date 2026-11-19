/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aef184
 */

int * FUN_00aef184(long param_1,int param_2,int param_3,int param_4,long param_5)

{
  int *piVar1;
  undefined8 uVar2;
  
  if (param_1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/ui/ui_lib.c",0x69,"general_allocate_prompt");
    uVar2 = 0xc0102;
  }
  else {
    if ((2 < param_3 - 1U) || (param_5 != 0)) {
      piVar1 = (int *)CRYPTO_zalloc(0x48,"crypto/ui/ui_lib.c",0x6d);
      if (piVar1 == (int *)0x0) {
        return (int *)0x0;
      }
      *(long *)(piVar1 + 2) = param_1;
      piVar1[4] = param_4;
      *piVar1 = param_3;
      piVar1[0x10] = (uint)(param_2 != 0);
      *(long *)(piVar1 + 6) = param_5;
      return piVar1;
    }
    ERR_new();
    ERR_set_debug("crypto/ui/ui_lib.c",0x6c,"general_allocate_prompt");
    uVar2 = 0x69;
  }
  ERR_set_error(0x28,uVar2,0);
  return (int *)0x0;
}

