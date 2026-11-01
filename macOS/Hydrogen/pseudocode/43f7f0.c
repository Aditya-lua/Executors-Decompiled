
void FUN_0043f7f0(undefined8 *param_1,ulong param_2)

{
  long in_x9;
  long in_x10;
  undefined *puVar1;
  long in_x12;
  undefined *in_x13;
  ulong uVar2;
  
  if (((param_2 & 0x8888888888888888) == 0) ||
     (uVar2 = (param_2 & 0x8888888888888888) >> 3,
     uVar2 = (uVar2 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar2 & 0xf0f0f0f0f0f0f0f) << 4,
     uVar2 = (uVar2 & 0xff00ff00ff00ff00) >> 8 | (uVar2 & 0xff00ff00ff00ff) << 8,
     uVar2 = (uVar2 & 0xffff0000ffff0000) >> 0x10 | (uVar2 & 0xffff0000ffff) << 0x10,
     puVar1 = (undefined *)((in_x9 + ((ulong)LZCOUNT(uVar2 >> 0x20 | uVar2 << 0x20) >> 2)) - in_x12)
     , in_x13 <= puVar1)) {
    in_x12 = 0;
    puVar1 = &UNK_00888611;
    uVar2 = 0x22;
  }
  else {
    uVar2 = (ulong)*(uint *)(in_x10 + 4);
  }
  param_1[1] = in_x12;
  param_1[2] = puVar1;
  param_1[3] = uVar2;
  *param_1 = 1;
  return;
}

