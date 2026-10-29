/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5b058..0xb5b0e4 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5b058_0 {
    long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_b5b058_0;

extern st_b5b058_0 g_ef6c70;

unsigned long long sub_b5b058(long long a0, long long a1, long long a2)
{
    unsigned int v2;  // w8
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_ac4058(a2) - 1460;
    if (11 < v2)
        return 0;
    v3 = sub_c68640(a0, a1);
    if (!(unsigned int)v3)
        return v3;
    v4 = sub_c68354(a0, 0xffffffff, (&g_ef6c70.field_0)[v2], 11);
    if (!(unsigned int)v4)
        return v4;
    return sub_a69b58(a0, a1) != 0;
}
