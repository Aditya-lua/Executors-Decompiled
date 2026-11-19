/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1fbdc
 */

undefined8 ossl_prov_bio_gets(void)

{
  undefined8 uVar1;
  
  if (DAT_00d237d8 == (code *)0x0) {
    return 0xffffffff;
  }
                    /* WARNING: Could not recover jumptable at 0x00b1fbe8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (*DAT_00d237d8)();
  return uVar1;
}

