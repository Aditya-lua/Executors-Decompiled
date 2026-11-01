
ulong FUN_00017f08(void)

{
  long *plVar1;
  byte *pbVar2;
  byte *pbVar3;
  ulong uVar4;
  long in_x9;
  long in_x10;
  long *unaff_x19;
  byte unaff_w20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  
  if ((char)*(byte *)((long)unaff_x19 + 0x57) < '\0') {
    unaff_x21 = unaff_x19[8];
    uVar4 = unaff_x19[9];
  }
  else {
    uVar4 = (ulong)*(byte *)((long)unaff_x19 + 0x57);
  }
  pbVar2 = (byte *)(unaff_x21 + in_x10);
  unaff_x19[5] = unaff_x21;
  unaff_x19[6] = (long)pbVar2;
  unaff_x19[7] = (long)(unaff_x21 + uVar4);
  pbVar3 = (byte *)(unaff_x21 + in_x9);
  if (pbVar3 <= pbVar2 + 1) {
    pbVar3 = pbVar2 + 1;
  }
  unaff_x19[0xb] = (long)pbVar3;
  if ((*(byte *)(unaff_x19 + 0xc) >> 3 & 1) != 0) {
    plVar1 = unaff_x19 + 8;
    if (*(char *)((long)unaff_x19 + 0x57) < '\0') {
      unaff_x19[2] = *plVar1;
      unaff_x19[3] = *plVar1 + (unaff_x22 - unaff_x23);
      unaff_x19[4] = (long)pbVar3;
    }
    else {
      unaff_x19[2] = (long)plVar1;
      unaff_x19[3] = (long)plVar1 + (unaff_x22 - unaff_x23);
      unaff_x19[4] = (long)pbVar3;
    }
  }
  if (pbVar2 == (byte *)(unaff_x21 + uVar4)) {
                    /* WARNING: Could not recover jumptable at 0x00017ed4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar4 = (**(code **)(*unaff_x19 + 0x68))();
    return uVar4;
  }
  unaff_x19[6] = (long)(pbVar2 + 1);
  *pbVar2 = unaff_w20;
  return (ulong)unaff_w20;
}

