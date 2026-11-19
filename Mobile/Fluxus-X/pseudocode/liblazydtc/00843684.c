/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00843684
 */

void FUN_00843684(locale *param_1)

{
  undefined8 uVar1;
  
  std::__ndk1::locale::locale(param_1);
                    /* try { // try from 00843698 to 008436bb has its CatchHandler @ 008436dc */
  uVar1 = std::__ndk1::locale::use_facet(param_1,(id *)&std::__ndk1::ctype<char>::id);
  *(undefined8 *)(param_1 + 8) = uVar1;
  uVar1 = std::__ndk1::locale::use_facet(param_1,(id *)&std::__ndk1::collate<char>::id);
  *(undefined8 *)(param_1 + 0x10) = uVar1;
  *(undefined8 *)(param_1 + 0x20) = 0;
  *(undefined8 *)(param_1 + 0x18) = 0;
  *(undefined8 *)(param_1 + 0x30) = 0;
  *(undefined8 *)(param_1 + 0x28) = 0;
  *(undefined8 *)(param_1 + 0x38) = 0;
  return;
}

