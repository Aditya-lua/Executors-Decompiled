/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00873084
 */

void _INIT_136(void)

{
  long lVar1;
  long lVar2;
  ulong auStack_258 [3];
  undefined1 local_240;
  undefined4 local_23f;
  undefined1 local_228;
  undefined4 local_227;
  undefined2 local_223;
  undefined1 local_210;
  undefined2 local_20f;
  undefined1 local_20d;
  undefined1 local_1f8;
  undefined4 local_1f7;
  undefined1 local_1f3;
  undefined1 local_1e0;
  undefined4 local_1df;
  undefined2 local_1db;
  undefined1 local_1d9;
  undefined1 local_1c8;
  undefined2 local_1c7;
  undefined1 local_1c5;
  undefined1 local_1c4;
  undefined1 local_1b0;
  undefined4 local_1af;
  undefined2 local_1ab;
  undefined1 local_198;
  undefined4 local_197;
  undefined1 local_180;
  undefined8 local_17f;
  undefined1 local_177;
  undefined1 local_168;
  undefined2 local_167;
  undefined1 local_165;
  undefined1 local_150;
  undefined2 local_14f;
  undefined1 local_14d;
  undefined1 local_138;
  undefined4 local_137;
  undefined1 local_133;
  undefined1 local_132;
  undefined1 local_120;
  undefined4 local_11f;
  undefined1 local_108;
  undefined4 local_107;
  undefined1 local_f0;
  undefined2 local_ef;
  undefined1 local_ed;
  undefined1 local_d8;
  undefined4 local_d7;
  undefined2 local_d3;
  undefined1 local_d1;
  undefined1 local_c0;
  undefined4 local_bf;
  undefined2 local_bb;
  undefined1 local_b9;
  undefined1 local_a8;
  undefined4 local_a7;
  undefined1 local_a3;
  undefined1 local_90;
  undefined4 local_8f;
  undefined1 local_8b;
  undefined1 local_78;
  undefined4 uStack_77;
  undefined1 uStack_73;
  undefined1 uStack_72;
  undefined1 local_60;
  undefined4 local_5f;
  undefined1 local_5b;
  undefined1 local_5a;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  local_197 = 0x726f66;
  local_180 = 0x10;
  local_1db = 0x6669;
  local_167 = 0x6669;
  local_14f = 0x6e69;
  local_17f = 0x6e6f6974636e7566;
  local_240 = 6;
  local_137 = 0x61636f6c;
  local_11f = 0x6c696e;
  local_1c8 = 6;
  local_198 = 6;
  local_120 = 6;
  local_108 = 6;
  local_210 = 4;
  local_168 = 4;
  local_150 = 4;
  local_107 = 0x746f6e;
  local_f0 = 4;
  local_23f = 0x646e61;
  local_ef = 0x726f;
  local_d3 = 0x7461;
  local_227 = 0x61657262;
  local_1e0 = 0xc;
  local_d8 = 0xc;
  local_c0 = 0xc;
  local_223 = 0x6b;
  local_d7 = 0x65706572;
  local_20f = 0x6f64;
  local_bf = 0x75746572;
  local_1f8 = 8;
  local_bb = 0x6e72;
  local_a8 = 8;
  local_90 = 8;
  local_1f7 = 0x65736c65;
  local_1df = 0x65736c65;
  local_1c7 = 0x6e65;
  local_a7 = 0x6e656874;
  local_8f = 0x65757274;
  local_1c5 = 100;
  uStack_77 = 0x69746e75;
  local_228 = 10;
  local_1b0 = 10;
  local_1af = 0x736c6166;
  local_138 = 10;
  local_78 = 10;
  local_60 = 10;
  local_20d = 0;
  local_1f3 = 0;
  local_1d9 = 0;
  local_1c4 = 0;
  local_1ab = 0x65;
  local_177 = 0;
  local_165 = 0;
  local_14d = 0;
  local_133 = 0x6c;
  local_132 = 0;
  local_ed = 0;
  local_d1 = 0;
  local_b9 = 0;
  local_a3 = 0;
  local_8b = 0;
  uStack_73 = 0x6c;
  uStack_72 = 0;
  local_5f = 0x6c696877;
  local_5b = 0x65;
  local_5a = 0;
  DAT_00d1eed0 = 0;
  DAT_00d1eed8 = 0;
  DAT_00d1eee0 = 0;
                    /* try { // try from 008732a8 to 008732b7 has its CatchHandler @ 0087332c */
  FUN_00872e24(&DAT_00d1eed0,&local_240,&local_48,0x15);
  lVar2 = 0x1f8;
  do {
    if ((*(byte *)((long)auStack_258 + lVar2) & 1) != 0) {
      operator_delete(*(void **)((long)auStack_258 + lVar2 + 0x10),
                      *(ulong *)((long)auStack_258 + lVar2) & 0xfffffffffffffffe);
    }
    lVar2 = lVar2 + -0x18;
  } while (lVar2 != 0);
  __cxa_atexit(FUN_00846474,&DAT_00d1eed0,&PTR_LOOP_00c48880);
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

