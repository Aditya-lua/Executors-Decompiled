
ulong FUN_0069f27c(long param_1,undefined1 (*param_2) [16])

{
  ulong in_x5;
  long in_x9;
  byte *in_x10;
  undefined1 (*in_x11) [16];
  long in_x14;
  long in_x15;
  undefined1 auVar1 [16];
  undefined8 uVar2;
  undefined8 uVar3;
  
  for (; 0xf < in_x5; in_x5 = in_x5 - 0x10) {
    auVar1 = *in_x11;
    (*in_x11)[0xf] = auVar1[0xf] + '\x01';
    auVar1 = NEON_aesd(auVar1,*param_2);
    auVar1 = NEON_aesimc(auVar1,auVar1);
    uVar3 = *(undefined8 *)((long)(*param_2 + in_x15) + 8);
    uVar2 = *(undefined8 *)(*param_2 + in_x15);
    auVar1 = NEON_aesd(auVar1,*(undefined1 (*) [16])(*param_2 + in_x14));
    in_x10[8] = (byte)uVar3 ^ auVar1[8];
    in_x10[9] = (byte)((ulong)uVar3 >> 8) ^ auVar1[9];
    in_x10[10] = (byte)((ulong)uVar3 >> 0x10) ^ auVar1[10];
    in_x10[0xb] = (byte)((ulong)uVar3 >> 0x18) ^ auVar1[0xb];
    in_x10[0xc] = (byte)((ulong)uVar3 >> 0x20) ^ auVar1[0xc];
    in_x10[0xd] = (byte)((ulong)uVar3 >> 0x28) ^ auVar1[0xd];
    in_x10[0xe] = (byte)((ulong)uVar3 >> 0x30) ^ auVar1[0xe];
    in_x10[0xf] = (byte)((ulong)uVar3 >> 0x38) ^ auVar1[0xf];
    *in_x10 = (byte)uVar2 ^ auVar1[0];
    in_x10[1] = (byte)((ulong)uVar2 >> 8) ^ auVar1[1];
    in_x10[2] = (byte)((ulong)uVar2 >> 0x10) ^ auVar1[2];
    in_x10[3] = (byte)((ulong)uVar2 >> 0x18) ^ auVar1[3];
    in_x10[4] = (byte)((ulong)uVar2 >> 0x20) ^ auVar1[4];
    in_x10[5] = (byte)((ulong)uVar2 >> 0x28) ^ auVar1[5];
    in_x10[6] = (byte)((ulong)uVar2 >> 0x30) ^ auVar1[6];
    in_x10[7] = (byte)((ulong)uVar2 >> 0x38) ^ auVar1[7];
    in_x11 = (undefined1 (*) [16])(*in_x11 + in_x9);
    in_x10 = in_x10 + param_1;
  }
  return in_x5;
}

