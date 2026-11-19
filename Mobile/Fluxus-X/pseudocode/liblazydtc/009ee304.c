/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ee304
 */

undefined8 FUN_009ee304(byte *param_1,int param_2,int param_3,code *param_4,undefined8 param_5)

{
  byte *pbVar1;
  byte bVar2;
  int iVar3;
  undefined8 uVar4;
  ulong local_58;
  
  if (param_2 != 0) {
    do {
      if (param_3 == 0x1004) {
        param_2 = param_2 + -4;
        local_58 = (ulong)*param_1 << 0x18 | (ulong)param_1[1] << 0x10 | (ulong)param_1[2] << 8 |
                   (ulong)param_1[3];
        param_1 = param_1 + 4;
      }
      else if (param_3 == 0x1002) {
        bVar2 = *param_1;
        param_2 = param_2 + -2;
        pbVar1 = param_1 + 1;
        param_1 = param_1 + 2;
        local_58 = (ulong)CONCAT11(bVar2,*pbVar1);
      }
      else if (param_3 == 0x1001) {
        local_58 = (ulong)*param_1;
        param_2 = param_2 + -1;
        param_1 = param_1 + 1;
      }
      else {
        iVar3 = UTF8_getc(param_1,param_2,&local_58);
        if (iVar3 < 0) {
          return 0xffffffff;
        }
        param_2 = param_2 - iVar3;
        param_1 = param_1 + iVar3;
      }
      if ((param_4 != (code *)0x0) && (uVar4 = (*param_4)(local_58,param_5), (int)uVar4 < 1)) {
        return uVar4;
      }
    } while (param_2 != 0);
  }
  return 1;
}

