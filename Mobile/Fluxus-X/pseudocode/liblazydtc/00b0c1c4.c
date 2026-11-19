/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0c1c4
 */

int X509_REQ_extension_nid(int nid)

{
  int *piVar1;
  int iVar2;
  
  iVar2 = *(int *)PTR_DAT_00cc9bd8;
  if (iVar2 == 0) {
    return 0;
  }
  piVar1 = (int *)PTR_DAT_00cc9bd8;
  do {
    piVar1 = piVar1 + 1;
    if (iVar2 == nid) {
      return 1;
    }
    iVar2 = *piVar1;
  } while (iVar2 != 0);
  return 0;
}

