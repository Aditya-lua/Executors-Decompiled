/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bf6dcc
 */

void FUN_00bf6dcc(moneypunct_byname<wchar_t,false> *param_1,byte *param_2,long param_3)

{
  byte *pbVar1;
  
  *(undefined ***)param_1 = &PTR_FUN_00caf380;
  *(long *)(param_1 + 8) = param_3 + -1;
  *(undefined8 *)(param_1 + 0x20) = 0;
  *(undefined8 *)(param_1 + 0x18) = 0;
  *(undefined8 *)(param_1 + 0x30) = 0;
  *(undefined8 *)(param_1 + 0x28) = 0;
  *(undefined8 *)(param_1 + 0x40) = 0;
  *(undefined8 *)(param_1 + 0x38) = 0;
  *(undefined8 *)(param_1 + 0x50) = 0;
  *(undefined8 *)(param_1 + 0x48) = 0;
  *(undefined8 *)(param_1 + 0x60) = 0;
  *(undefined8 *)(param_1 + 0x58) = 0;
  *(undefined8 *)(param_1 + 0x70) = 0;
  *(undefined8 *)(param_1 + 0x68) = 0;
  pbVar1 = *(byte **)(param_2 + 0x10);
  if ((*param_2 & 1) == 0) {
    pbVar1 = param_2 + 1;
  }
                    /* try { // try from 00bf6e20 to 00bf6e23 has its CatchHandler @ 00bf6e34 */
  std::__ndk1::moneypunct_byname<wchar_t,false>::init(param_1,(char *)pbVar1);
  return;
}

