/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb56e0
 */

ulong HUF_decompress1X_DCtx_wksp
                (undefined8 param_1,void *param_2,ulong param_3,byte *param_4,ulong param_5,
                undefined8 param_6,undefined8 param_7,undefined4 param_8)

{
  long lVar1;
  uint uVar2;
  ulong uVar3;
  int iVar4;
  
  if (param_3 == 0) {
    param_3 = 0xffffffffffffffba;
  }
  else if (param_3 < param_5) {
    param_3 = 0xffffffffffffffec;
  }
  else if (param_5 == param_3) {
    memcpy(param_2,param_4,param_3);
  }
  else {
    if (param_5 != 1) {
      if (param_5 < param_3) {
        uVar3 = 0;
        if (param_3 != 0) {
          uVar3 = (param_5 << 4) / param_3;
        }
        uVar3 = uVar3 & 0xffffffff;
      }
      else {
        uVar3 = 0xf;
      }
      lVar1 = uVar3 * 0x10;
      iVar4 = (int)(param_3 >> 8);
      uVar2 = *(int *)(&DAT_007891b4 + lVar1) + *(int *)(&DAT_007891b8 + lVar1) * iVar4;
      if (uVar2 + (uVar2 >> 5) <
          (uint)(*(int *)(&DAT_007891ac + lVar1) + *(int *)(&DAT_007891b0 + lVar1) * iVar4)) {
        uVar3 = HUF_readDTableX2_wksp();
        if (0xffffffffffffff88 < uVar3) {
          return uVar3;
        }
        if (uVar3 <= param_5 && param_5 - uVar3 != 0) {
          uVar3 = FUN_00bb519c(param_2,param_3,param_4 + uVar3,param_5 - uVar3,param_1);
          return uVar3;
        }
      }
      else {
        uVar3 = HUF_readDTableX1_wksp(param_1,param_4,param_5,param_6,param_7,param_8);
        if (0xffffffffffffff88 < uVar3) {
          return uVar3;
        }
        if (uVar3 <= param_5 && param_5 - uVar3 != 0) {
          uVar3 = FUN_00bb58e0(param_2,param_3,param_4 + uVar3,param_5 - uVar3,param_1);
          return uVar3;
        }
      }
      return 0xffffffffffffffb8;
    }
    memset(param_2,(uint)*param_4,param_3);
  }
  return param_3;
}

