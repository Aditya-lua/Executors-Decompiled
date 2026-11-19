/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b531c
 */

undefined8 FUN_009b531c(long param_1)

{
  int iVar1;
  undefined8 uVar2;
  
  if ((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0) {
    iVar1 = **(int **)(param_1 + 8);
    if ((0x303 < iVar1) && (iVar1 != 0x10000)) {
      ERR_new();
      ERR_set_debug("ssl/ssl_lib.c",0x913,"can_renegotiate");
      uVar2 = 0x10a;
      goto LAB_009b53a8;
    }
  }
  if ((*(byte *)(param_1 + 0x9eb) >> 6 & 1) == 0) {
    return 1;
  }
  ERR_new();
  ERR_set_debug("ssl/ssl_lib.c",0x918,"can_renegotiate");
  uVar2 = 0x153;
LAB_009b53a8:
  ERR_set_error(0x14,uVar2,0);
  return 0;
}

