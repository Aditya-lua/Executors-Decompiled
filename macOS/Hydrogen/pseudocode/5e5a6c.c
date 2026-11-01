
void FUN_005e5a6c(long *param_1)

{
  undefined1 uStack0000000000000000;
  long lStack0000000000000008;
  long lStack0000000000000010;
  long lStack0000000000000018;
  long lStack0000000000000020;
  long lStack0000000000000028;
  long lStack0000000000000030;
  long lStack0000000000000038;
  long lStack0000000000000040;
  undefined1 uStack0000000000000048;
  long lStack0000000000000050;
  long lStack0000000000000058;
  
  lStack0000000000000028 = param_1[5];
  lStack0000000000000020 = param_1[4];
  lStack0000000000000038 = param_1[7];
  lStack0000000000000030 = param_1[6];
  _uStack0000000000000048 = param_1[9];
  lStack0000000000000040 = param_1[8];
  lStack0000000000000058 = param_1[0xb];
  lStack0000000000000050 = param_1[10];
  lStack0000000000000008 = param_1[1];
  _uStack0000000000000000 = *param_1;
  lStack0000000000000018 = param_1[3];
  lStack0000000000000010 = param_1[2];
  *param_1 = 2;
  if (_uStack0000000000000000 == 1) {
    _pthread_mutex_destroy((ulong)&uStack0000000000000000 | 8);
    _pthread_cond_destroy(&uStack0000000000000048);
  }
  return;
}

