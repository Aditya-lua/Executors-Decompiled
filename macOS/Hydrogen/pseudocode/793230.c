
undefined8 FUN_00793230(long param_1,undefined1 param_2 [16],long param_3)

{
  undefined1 auVar1 [16];
  
  *(long *)(param_3 + 0x5f0) = param_2._8_8_;
  *(long *)(param_3 + 0x5e8) = param_2._0_8_;
  *(undefined8 *)(param_3 + 0x5f8) = *(undefined8 *)(param_3 + 0x780);
  *(undefined8 *)(param_3 + 0x608) = *(undefined8 *)(param_3 + 0x930);
  *(undefined8 *)(param_3 + 0x610) = *(undefined8 *)(param_3 + 0x948);
  *(undefined8 *)(param_3 + 0x5d8) = *(undefined8 *)(param_3 + 0x7a0);
  *(undefined8 *)(param_3 + 0x618) = *(undefined8 *)(param_3 + 0x940);
  *(undefined8 *)(param_3 + 0x600) = *(undefined8 *)(param_3 + 0x798);
  *(undefined8 *)(param_3 + 0x658) = *(undefined8 *)(param_3 + 0x758);
  *(undefined8 *)(param_3 + 0x650) = *(undefined8 *)(param_3 + 0x750);
  auVar1 = NEON_ext(*(undefined1 (*) [16])(param_3 + 0x760),*(undefined1 (*) [16])(param_3 + 0x760),
                    8,1);
  *(long *)(param_1 + 0x118) = auVar1._8_8_;
  *(long *)(param_1 + 0x110) = auVar1._0_8_;
  *(undefined8 *)(param_3 + 0x5e0) = *(undefined8 *)(param_3 + 0x748);
  *(undefined8 *)(param_3 + 0x660) = *(undefined8 *)(param_3 + 0x938);
  return 0;
}

