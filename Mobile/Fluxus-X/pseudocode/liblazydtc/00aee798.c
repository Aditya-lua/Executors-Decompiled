/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aee798
 */

char * UI_get0_result(UI *ui,int i)

{
  int iVar1;
  int *piVar2;
  undefined8 uVar3;
  
  if (i < 0) {
    ERR_new();
    ERR_set_debug("crypto/ui/ui_lib.c",0x1b2,"UI_get0_result");
    uVar3 = 0x67;
  }
  else {
    iVar1 = OPENSSL_sk_num(*(undefined8 *)(ui + 8));
    if (i < iVar1) {
      piVar2 = (int *)OPENSSL_sk_value(*(undefined8 *)(ui + 8),i);
      if (*piVar2 - 1U < 2) {
        return *(char **)(piVar2 + 6);
      }
      return (char *)0x0;
    }
    ERR_new();
    ERR_set_debug("crypto/ui/ui_lib.c",0x1b6,"UI_get0_result");
    uVar3 = 0x66;
  }
  ERR_set_error(0x28,uVar3,0);
  return (char *)0x0;
}

