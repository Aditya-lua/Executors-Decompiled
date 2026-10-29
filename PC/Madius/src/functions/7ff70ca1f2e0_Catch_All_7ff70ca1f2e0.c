/* 7ff70ca1f2e0 Catch_All@7ff70ca1f2e0 */

undefined * Catch_All_7ff70ca1f2e0(undefined8 param_1,longlong param_2)

{
  *(undefined8 *)(param_2 + 0x210) = 0xa707652bd7b4f415;
  *(undefined8 *)(param_2 + 0x218) = 0xb0ce6b2983d991d7;
  *(undefined8 *)(param_2 + 0x220) = 0xba77d073072634;
  *(undefined8 *)(param_2 + 0x228) = 0xcf1dfdda62a1d8ac;
  *(undefined8 *)(param_2 + 0x2c0) = 0xd327014ebbdd9573;
  *(undefined8 *)(param_2 + 0x2c8) = 0x90ab185be2a9b1b8;
  *(undefined8 *)(param_2 + 0x2d0) = 0x61d757a416745555;
  *(undefined8 *)(param_2 + 0x2d8) = 0xcf1d89a907c7b1c2;
  *(uint *)(param_2 + 0x210) = *(uint *)(param_2 + 0x210) ^ *(uint *)(param_2 + 0x2c0);
  *(uint *)(param_2 + 0x214) = *(uint *)(param_2 + 0x214) ^ *(uint *)(param_2 + 0x2c4);
  *(uint *)(param_2 + 0x218) = *(uint *)(param_2 + 0x218) ^ *(uint *)(param_2 + 0x2c8);
  *(uint *)(param_2 + 0x21c) = *(uint *)(param_2 + 0x21c) ^ *(uint *)(param_2 + 0x2cc);
  *(ulonglong *)(param_2 + 0x220) =
       *(ulonglong *)(param_2 + 0x220) ^ *(ulonglong *)(param_2 + 0x2d0);
  *(ulonglong *)(param_2 + 0x228) =
       *(ulonglong *)(param_2 + 0x228) ^ *(ulonglong *)(param_2 + 0x2d8);
  func_0x7ff70ca05eb0(param_2 + 0x2c0,param_2 + 0x210);
  func_0x7ff70ca19f60(*(undefined8 *)(param_2 + 0xa8),3,param_2 + 0x2c0);
  func_0x7ff70c8e9fd0(param_2 + 0x2c0);
  *(undefined1 *)(*(longlong *)(param_2 + 0xe8) + 0x18) = 0;
  return &UNK_7ff70ca1d5af;
}


