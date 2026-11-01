
void FUN_00796028(void)

{
  int iVar1;
  undefined8 uVar2;
  long unaff_x23;
  long unaff_x24;
  undefined8 *puVar3;
  
  iVar1 = func_0x0077e6f8();
  puVar3 = (undefined8 *)0xa2b7e0;
  do {
    if (iVar1 != 0) {
      uVar2 = *puVar3;
LAB_00796040:
      *(undefined8 *)(unaff_x23 + 0x7d8) = uVar2;
      (*pcRam0000000000a2b5f0)();
                    /* WARNING: Could not recover jumptable at 0x00796080. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (**(code **)(*(long *)(unaff_x23 + 0x7d8) + 0x68))();
      return;
    }
    if (puVar3[1] == 0) {
      uVar2 = *(undefined8 *)(unaff_x24 + 0x7e0);
      goto LAB_00796040;
    }
    iVar1 = func_0x0077e6f8();
    puVar3 = puVar3 + 1;
  } while( true );
}

