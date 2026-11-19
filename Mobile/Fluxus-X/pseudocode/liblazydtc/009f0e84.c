/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f0e84
 */

int ASN1_object_size(int constructed,int length,int tag)

{
  bool bVar1;
  int iVar2;
  int iVar3;
  uint uVar4;
  
  if (length < 0) {
    return -1;
  }
  iVar3 = 1;
  if (0x1e < tag) {
    do {
      iVar3 = iVar3 + 1;
      bVar1 = 0x7f < tag;
      tag = tag >> 7;
    } while (bVar1);
  }
  if (constructed == 2) {
    iVar3 = iVar3 + 3;
  }
  else {
    iVar3 = iVar3 + 1;
    if (0x7f < length) {
      uVar4 = length;
      do {
        uVar4 = uVar4 >> 8;
        iVar3 = iVar3 + 1;
      } while (uVar4 != 0);
    }
  }
  iVar2 = iVar3 + length;
  if (0x7fffffff - length <= iVar3) {
    iVar2 = -1;
  }
  return iVar2;
}

