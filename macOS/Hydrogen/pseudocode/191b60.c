
void FUN_00191b60(void)

{
  long lVar1;
  uint *unaff_x19;
  
  lVar1 = _SecPolicyCreateRevocation();
  if (lVar1 == 0) {
    unaff_x19[1] = 0xffffffce;
  }
  else {
    *(long *)(unaff_x19 + 2) = lVar1;
  }
  *unaff_x19 = (uint)(lVar1 == 0);
  return;
}

