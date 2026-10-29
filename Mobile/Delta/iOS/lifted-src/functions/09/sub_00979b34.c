/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x979b34..0x979ba4 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_979b34_0 {
    char padding_0[216];
    long long field_d8;
    char padding_e0[832];
    long long field_420;
    char padding_428[8];
    long long field_430;
    char padding_438[8];
    long long field_440;
    char padding_448[477];
    char field_625;
} st_979b34_0;


unsigned long long sub_979b34(st_979b34_0 *a0, long long a1, long long a2)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a0->field_430 = a1;
    a0->field_440 = a2;
    sub_98585c(a0->field_420);
    v2 = sub_98d8a8(a0->field_d8, a1, a2);
    if (a0->field_625 >> 2 & 1)
        return v2;
}
