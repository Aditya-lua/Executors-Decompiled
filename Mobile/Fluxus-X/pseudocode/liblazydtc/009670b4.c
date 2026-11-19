/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009670b4
 */

undefined8 FUN_009670b4(void)

{
  long lVar1;
  undefined8 uVar2;
  long in_x5;
  undefined8 in_x6;
  
  (*(code *)PTR_free_00cc4678)(*(undefined8 *)(in_x5 + 0x10));
  *(undefined8 *)(in_x5 + 0x10) = 0;
  *(undefined4 *)(in_x5 + 0xc) = 0;
  lVar1 = curl_maprintf(&DAT_002db619,0,0,0,0,6,0x82,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                        &DAT_002ab32c,&DAT_002ab32c);
  if (lVar1 == 0) {
    uVar2 = 0x1b;
  }
  else {
    FUN_0092525c(in_x6,lVar1,0x20,curl_free);
    uVar2 = 0;
  }
  return uVar2;
}

