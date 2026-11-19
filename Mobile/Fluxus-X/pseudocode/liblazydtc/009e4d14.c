/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e4d14
 */

int ssl_x509err2alert(int param_1)

{
  int *piVar1;
  int *piVar2;
  
  piVar1 = &DAT_0074d6d0;
  do {
    piVar2 = piVar1;
    if (*piVar2 == 0) break;
    piVar1 = piVar2 + 2;
  } while (*piVar2 != param_1);
  return piVar2[1];
}

