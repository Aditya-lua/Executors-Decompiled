/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00991738
 */

/* ix::calculateRetryWaitMilliseconds(unsigned int, unsigned int, unsigned int) */

uint ix::calculateRetryWaitMilliseconds(uint param_1,uint param_2,uint param_3)

{
  uint uVar1;
  double dVar2;
  
  uVar1 = 0;
  if (param_1 < 0x1a) {
    dVar2 = exp2((double)param_1);
    uVar1 = (uint)(dVar2 * 100.0);
  }
  if (param_3 <= uVar1) {
    param_3 = uVar1;
  }
  if (param_3 <= param_2 && param_1 < 0x1a) {
    param_2 = param_3;
  }
  return param_2;
}

