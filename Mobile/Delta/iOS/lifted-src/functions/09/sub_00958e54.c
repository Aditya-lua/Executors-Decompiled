/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x958e54..0x958ea4 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_958e54_0 {
    unsigned int field_0;
    char padding_4[2460];
    long long field_9a0;
} st_958e54_0;

extern long long g_afa390;

st_958e54_0 * sub_958e54(st_958e54_0 *a0, long long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long v8;  // x8
    st_958e54_0 *v9;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = a0->field_0;
    if (!(unsigned int)v8 || v8 >> 7 & 1 && !(a0 = sub_980dc8(), !a0))
    {
        v9 = sub_ad6958(a0->field_9a0, &g_afa390);
        a0->field_9a0 = a1;
        a0 = v9;
    }
    return a0;
}
