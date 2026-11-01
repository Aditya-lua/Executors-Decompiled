
undefined8 * FUN_00660d68(void)

{
  undefined8 *puVar1;
  long unaff_x20;
  
  puVar1 = (undefined8 *)__Znwm(8);
  *puVar1 = &UNK_00a0b7c0;
  DataMemoryBarrier(2,3);
  *(undefined8 **)(unaff_x20 + 0xcf0) = puVar1;
  __ZNSt3__15mutex6unlockEv(0xa2aca8);
  return puVar1;
}

