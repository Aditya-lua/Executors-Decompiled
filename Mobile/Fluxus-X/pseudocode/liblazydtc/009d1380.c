/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d1380
 */

undefined8 FUN_009d1380(long param_1,undefined8 param_2,int param_3)

{
  undefined8 uVar1;
  uint uVar2;
  
  if (*(int *)(param_1 + 0x38) == 0) {
    uVar2 = (uint)*(undefined8 *)(param_1 + 0x9e8);
    if ((uVar2 >> 2 & 1) != 0) {
      return 1;
    }
    if (param_3 != 0) {
      return 1;
    }
    if ((uVar2 >> 0x12 & 1) != 0) {
      return 1;
    }
    ERR_new(1);
    uVar1 = 0x37e;
  }
  else {
    if (*(int *)(param_1 + 0xba0) == 0) {
      return 1;
    }
    if (param_3 != 0) {
      return 1;
    }
    if (((uint)*(undefined8 *)(param_1 + 0x9e8) >> 0x12 & 1) != 0) {
      return 1;
    }
    ERR_new(1);
    uVar1 = 0x38a;
  }
  ERR_set_debug("ssl/statem/extensions.c",uVar1,"final_renegotiate");
  ossl_statem_fatal(param_1,0x28,0x152,0);
  return 0;
}

