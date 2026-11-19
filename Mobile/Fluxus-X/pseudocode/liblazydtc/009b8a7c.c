/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b8a7c
 */

undefined8
SSL_client_hello_get0_ext(long param_1,int param_2,undefined8 *param_3,undefined8 *param_4)

{
  long lVar1;
  int *piVar2;
  ulong uVar3;
  
  lVar1 = *(long *)(param_1 + 0xb58);
  if ((lVar1 != 0) && (*(ulong *)(lVar1 + 0x280) != 0)) {
    uVar3 = 0;
    piVar2 = (int *)(*(long *)(lVar1 + 0x288) + 0x10);
    do {
      if ((*piVar2 != 0) && (piVar2[2] == param_2)) {
        if (param_3 != (undefined8 *)0x0) {
          *param_3 = *(undefined8 *)(piVar2 + -4);
        }
        if (param_4 == (undefined8 *)0x0) {
          return 1;
        }
        *param_4 = *(undefined8 *)(piVar2 + -2);
        return 1;
      }
      uVar3 = uVar3 + 1;
      piVar2 = piVar2 + 10;
    } while (uVar3 < *(ulong *)(lVar1 + 0x280));
  }
  return 0;
}

