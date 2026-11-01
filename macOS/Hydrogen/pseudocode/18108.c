
/* WARNING: Removing unreachable block (ram,0x000181e0) */
/* WARNING: Removing unreachable block (ram,0x000181a8) */
/* WARNING: Removing unreachable block (ram,0x000181f0) */

void FUN_00018108(void)

{
  undefined8 *unaff_x19;
  long unaff_x29;
  undefined8 uVar1;
  
  __ZNSt3__14__fs10filesystem20__create_directoriesERKNS1_4pathEPNS_10error_codeE
            (unaff_x29 + -0x30,0);
  *(undefined8 *)(unaff_x29 + -0x50) = 0;
  *(undefined8 *)(unaff_x29 + -0x48) = 0;
  *(undefined8 *)(unaff_x29 + -0x40) = 0;
  func_0x00017184(unaff_x29 + -0x50,"key.txt","");
  uVar1 = *(undefined8 *)(unaff_x29 + -0x30);
  unaff_x19[1] = *(undefined8 *)(unaff_x29 + -0x28);
  *unaff_x19 = uVar1;
  unaff_x19[2] = *(undefined8 *)(unaff_x29 + -0x20);
  func_0x0001754c();
  return;
}

