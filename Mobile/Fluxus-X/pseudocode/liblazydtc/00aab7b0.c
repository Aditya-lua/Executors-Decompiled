/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aab7b0
 */

undefined8 CRYPTO_ocb128_setiv(undefined8 *param_1,void *param_2,size_t param_3,long param_4)

{
  undefined8 uVar1;
  uint uVar2;
  ulong uVar3;
  byte local_80 [15];
  byte abStack_71 [17];
  byte local_60;
  byte local_5f;
  byte local_5e;
  byte local_5d;
  byte local_5c;
  byte local_5b;
  byte local_5a;
  byte local_59;
  ulong local_50;
  long lStack_48;
  byte local_40;
  byte bStack_3f;
  byte bStack_3e;
  byte bStack_3d;
  byte bStack_3c;
  byte bStack_3b;
  byte bStack_3a;
  byte bStack_39;
  byte bStack_38;
  
  uVar1 = 0xffffffff;
  if ((param_3 - 1 < 0xf) && (param_4 - 1U < 0x10)) {
    memset(param_1 + 0xc,0,0x50);
    abStack_71[0] = 0;
    memcpy(abStack_71 + (1 - param_3),param_2,param_3);
    abStack_71[-param_3] = abStack_71[-param_3] | 1;
    local_50 = (ulong)(byte)((int)param_4 << 4);
    lStack_48 = ((ulong)abStack_71[0] & 0xc0) << 0x38;
    (*(code *)*param_1)(&local_50,&local_40,param_1[2]);
    local_60 = bStack_3f ^ local_40;
    uVar2 = (uint)abStack_71[0];
    uVar3 = (ulong)(abStack_71 + 1) | (ulong)(abStack_71[0] >> 3) & 7;
    local_5f = bStack_3e ^ bStack_3f;
    local_5e = bStack_3d ^ bStack_3e;
    local_5d = bStack_3c ^ bStack_3d;
    local_5c = bStack_3b ^ bStack_3c;
    local_5b = bStack_3a ^ bStack_3b;
    local_5a = bStack_39 ^ bStack_3a;
    local_59 = bStack_38 ^ bStack_39;
    FUN_00aab930(uVar3,uVar2 & 7,param_1 + 0x12);
    uVar2 = 8 - (uVar2 & 7);
    uVar1 = 1;
    *(byte *)((long)param_1 + 0x9f) =
         *(byte *)((long)param_1 + 0x9f) |
         (byte)((0xff << (ulong)(uVar2 & 0x1f) & (uint)*(byte *)(uVar3 + 0x10)) >>
               (ulong)(uVar2 & 0x1f));
  }
  return uVar1;
}

