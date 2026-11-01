
void FUN_0056f3ec(undefined8 *param_1,undefined8 param_2,long param_3)

{
  bool in_ZR;
  undefined8 uStack_98;
  long lStack_90;
  long lStack_88;
  undefined8 uStack_70;
  long lStack_50;
  long lStack_48;
  long lStack_40;
  long lStack_38;
  undefined8 uStack_30;
  long lStack_28;
  
  if (in_ZR) {
    func_0x005d0ee4(&uStack_98,*(undefined8 *)(param_3 + 0x28));
    lStack_40 = lStack_90;
    uStack_30 = uStack_98;
    lStack_28 = lStack_90 + lStack_88 * 8;
    lStack_50 = *(long *)(param_3 + 0x18);
    lStack_48 = lStack_50 + *(long *)(param_3 + 0x20) * 0x40;
    uStack_98 = 1;
    lStack_90 = 0;
    uStack_70 = 0;
    lStack_38 = lStack_40;
    func_0x0059fe44(param_1,&uStack_98,&UNK_009f2b18);
    return;
  }
  *param_1 = 0;
  param_1[1] = 8;
  param_1[2] = 0;
  return;
}

