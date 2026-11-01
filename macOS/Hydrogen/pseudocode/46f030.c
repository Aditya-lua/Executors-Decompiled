
bool __ZN4core5alloc6layout6Layout19is_size_align_valid17hc809a0998595a196E
               (ulong param_1,ulong param_2)

{
  return param_2 - 1 < (param_2 ^ param_2 - 1) && param_1 <= 0x8000000000000000 - param_2;
}

