
void __ZN6rustls6client11client_conn6danger21DangerousClientConfig24set_certificate_verifier17ha33c8cae3ef6c24bE
               (long *param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  long lVar2;
  
  lVar2 = *param_1;
  lVar1 = **(long **)(lVar2 + 0x128);
  **(long **)(lVar2 + 0x128) = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001f9964(lVar2 + 0x128);
  }
  *(undefined8 *)(lVar2 + 0x128) = param_2;
  *(undefined8 *)(lVar2 + 0x130) = param_3;
  return;
}

