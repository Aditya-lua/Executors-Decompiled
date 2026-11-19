/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8037c
 */

void OPENSSL_LH_doall_arg(long *param_1,code *param_2,undefined8 param_3)

{
  undefined8 uVar1;
  int iVar2;
  undefined8 *puVar3;
  long lVar4;
  
  if ((param_1 != (long *)0x0) && (iVar2 = (int)param_1[3] + -1, -1 < iVar2)) {
    lVar4 = (long)iVar2;
    do {
      puVar3 = *(undefined8 **)(*param_1 + lVar4 * 8);
      while (puVar3 != (undefined8 *)0x0) {
        uVar1 = *puVar3;
        puVar3 = (undefined8 *)puVar3[1];
        (*param_2)(uVar1,param_3);
      }
      lVar4 = lVar4 + -1;
    } while (-1 < (int)lVar4);
  }
  return;
}

