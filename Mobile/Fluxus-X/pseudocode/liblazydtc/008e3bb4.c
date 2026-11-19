/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e3bb4
 */

void FUN_008e3bb4(long param_1,long param_2,undefined8 param_3)

{
  int iVar1;
  int iVar2;
  undefined4 uVar3;
  ulong uVar4;
  undefined ***pppuVar5;
  long lVar6;
  undefined **local_50;
  undefined4 local_48;
  undefined8 local_44;
  undefined **local_38;
  undefined4 local_30;
  undefined8 local_2c;
  
  pppuVar5 = &local_50;
  uVar4 = FUN_008e4750(param_3);
  if ((uVar4 & 1) == 0) {
    uVar3 = (**(code **)(**(long **)(param_1 + 8) + 0x20))();
    FUN_008e403c(param_3,uVar3,0);
    local_48 = *(undefined4 *)(param_2 + 8);
    local_50 = &PTR_LAB_00c4e320;
    local_44 = *(undefined8 *)(param_2 + 0xc);
    lVar6 = 0;
  }
  else {
    iVar1 = FUN_008e475c(param_3);
    iVar2 = (**(code **)(**(long **)(param_1 + 8) + 0x20))(*(long **)(param_1 + 8));
    local_30 = *(undefined4 *)(param_2 + 8);
    local_38 = &PTR_LAB_00c4e320;
    local_2c = *(undefined8 *)(param_2 + 0xc);
    lVar6 = (long)(iVar1 - iVar2);
    pppuVar5 = &local_38;
  }
  FUN_008e3f9c(param_1,pppuVar5,lVar6);
  return;
}

