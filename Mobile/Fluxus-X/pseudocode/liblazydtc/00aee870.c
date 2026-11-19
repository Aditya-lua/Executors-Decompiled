/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aee870
 */

int UI_get_result_length(long param_1,int param_2)

{
  int iVar1;
  int *piVar2;
  undefined8 uVar3;
  
  if (param_2 < 0) {
    ERR_new();
    ERR_set_debug("crypto/ui/ui_lib.c",0x1bf,"UI_get_result_length");
    uVar3 = 0x67;
  }
  else {
    iVar1 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 8));
    if (param_2 < iVar1) {
      piVar2 = (int *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 8),param_2);
      if (*piVar2 - 1U < 2) {
        return piVar2[8];
      }
      return -1;
    }
    ERR_new();
    ERR_set_debug("crypto/ui/ui_lib.c",0x1c3,"UI_get_result_length");
    uVar3 = 0x66;
  }
  ERR_set_error(0x28,uVar3,0);
  return -1;
}

