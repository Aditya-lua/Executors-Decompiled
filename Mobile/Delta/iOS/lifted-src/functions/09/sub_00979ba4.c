/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x979ba4..0x979bf8 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_979ba4_0 {
    char padding_0[216];
    long long field_d8;
    char padding_e0[832];
    long long field_420;
    char padding_428[16];
    long long field_438;
    char padding_440[485];
    char field_625;
} st_979ba4_0;


unsigned long long sub_979ba4(st_979ba4_0 *a0, long long a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a0->field_438 = a1;
    sub_985868(a0->field_420);
    v2 = sub_98d8b4(a0->field_d8, a1);
    if (a0->field_625 >> 2 & 1)
        return v2;
}
