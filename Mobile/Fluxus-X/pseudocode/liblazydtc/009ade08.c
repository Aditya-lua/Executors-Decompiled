/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ade08
 */

int * ssl_cert_lookup_by_pkey(undefined8 param_1,ulong *param_2)

{
  int iVar1;
  int iVar2;
  char *pcVar3;
  int *piVar4;
  ulong uVar5;
  
  uVar5 = 0;
  piVar4 = &DAT_0074b35c;
  while( true ) {
    iVar2 = *piVar4;
    pcVar3 = OBJ_nid2sn(iVar2);
    iVar1 = EVP_PKEY_is_a(param_1,pcVar3);
    if (iVar1 != 0) break;
    pcVar3 = OBJ_nid2ln(iVar2);
    iVar2 = EVP_PKEY_is_a(param_1,pcVar3);
    if (iVar2 != 0) break;
    uVar5 = uVar5 + 1;
    piVar4 = piVar4 + 2;
    if (8 < uVar5) {
      return (int *)0x0;
    }
  }
  if (param_2 == (ulong *)0x0) {
    return piVar4;
  }
  *param_2 = uVar5;
  return piVar4;
}

