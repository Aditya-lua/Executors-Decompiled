/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9790e4..0x979174 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9790e4_0 {
    char padding_0[1048];
    long long field_418;
    char padding_420[512];
    unsigned long long field_620;
} st_9790e4_0;


unsigned long long sub_9790e4(st_9790e4_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // x8
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0->field_620 >> 10 & 1)
        return 1;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (a0->field_620 >> 9 & 1)
    {
        sub_c61a4c();
        v8 = a0->field_620;
        a0->field_620 = v8 | 0x400;
        sub_978b1c(a0, (unsigned int)v8 & 7);
        sub_97559c(a0->field_418);
        return 1;
    }
    sub_979174();
    return 0;
}
