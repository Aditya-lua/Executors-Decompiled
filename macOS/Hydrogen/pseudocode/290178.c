
void FUN_00290178(void)

{
  long unaff_x19;
  
  _free();
  *(undefined8 *)(unaff_x19 + 0x150) = 0;
  *(undefined8 *)(unaff_x19 + 0x158) = 0;
  *(undefined8 *)(unaff_x19 + 0x160) = 0;
  _free(*(undefined8 *)(unaff_x19 + 0x170));
  *(undefined8 *)(unaff_x19 + 0x168) = 0;
  *(undefined8 *)(unaff_x19 + 0x170) = 0;
  *(undefined8 *)(unaff_x19 + 0x178) = 0;
  _free(*(undefined8 *)(unaff_x19 + 0x188));
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

