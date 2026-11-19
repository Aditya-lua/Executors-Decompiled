/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b87024
 */

undefined8
psa_export_key_internal
          (ushort *param_1,void *param_2,ulong param_3,void *param_4,ulong param_5,ulong *param_6)

{
  ushort uVar1;
  undefined8 uVar2;
  
  uVar1 = *param_1;
  if (((((uVar1 & 0xcfff) == 0x4001) || ((uVar1 & 0x7000) == 0x1000)) ||
      ((uVar1 & 0x7000) == 0x2000)) ||
     (((uVar1 & 0xcf00) == 0x4200 || ((uVar1 & 0xcf00) == 0x4100)))) {
    if (param_5 < param_3) {
      uVar2 = 0xffffff76;
    }
    else {
      memcpy(param_4,param_2,param_3);
      memset((void *)((long)param_4 + param_3),0,param_5 - param_3);
      uVar2 = 0;
      *param_6 = param_3;
    }
  }
  else {
    uVar2 = 0xffffff7a;
  }
  return uVar2;
}

