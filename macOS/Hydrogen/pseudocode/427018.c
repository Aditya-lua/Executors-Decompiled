
void FUN_00427018(undefined8 *param_1,undefined8 param_2)

{
  undefined8 uStack0000000000000008;
  undefined4 uStack0000000000000010;
  undefined4 uStack0000000000000014;
  undefined4 uStack0000000000000018;
  undefined4 uStack000000000000001c;
  
  func_0x00436720(&uStack0000000000000008,param_2,0,1);
  if ((int)uStack0000000000000008 == 2) {
    param_1[1] = CONCAT44(uStack0000000000000014,uStack0000000000000010);
    *(undefined4 *)param_1 = 2;
  }
  else {
    *param_1 = CONCAT44(uStack0000000000000008._4_4_,(int)uStack0000000000000008);
    *(undefined4 *)(param_1 + 1) = uStack0000000000000010;
    *(ulong *)((long)param_1 + 0xc) = CONCAT44(uStack0000000000000018,uStack0000000000000014);
    *(undefined4 *)((long)param_1 + 0x14) = uStack000000000000001c;
  }
  return;
}

