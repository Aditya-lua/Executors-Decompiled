/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aca318
 */

undefined4 EVP_RAND_verify_zeroization(long *param_1)

{
  int iVar1;
  undefined4 uVar2;
  long lVar3;
  code *pcVar4;
  
  lVar3 = *param_1;
  if (*(code **)(lVar3 + 0x78) != (code *)0x0) {
    iVar1 = (**(code **)(lVar3 + 0x78))(param_1[1]);
    if (iVar1 == 0) {
      return 0;
    }
    lVar3 = *param_1;
  }
  if (*(code **)(lVar3 + 0xb8) == (code *)0x0) {
    uVar2 = 0;
    pcVar4 = *(code **)(lVar3 + 0x80);
  }
  else {
    uVar2 = (**(code **)(lVar3 + 0xb8))(param_1[1]);
    pcVar4 = *(code **)(*param_1 + 0x80);
  }
  if (pcVar4 != (code *)0x0) {
    (*pcVar4)(param_1[1]);
  }
  return uVar2;
}

