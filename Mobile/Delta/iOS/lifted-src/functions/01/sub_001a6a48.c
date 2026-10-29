/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a6a48..0x1a6c18 (464 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a6a48_1 {
    char padding_0[28];
    unsigned int field_1c;
    char padding_20[24];
    long long field_38;
} st_1a6a48_1;

typedef struct st_1a6a48_0 {
    char field_0;
} st_1a6a48_0;

extern unsigned long long g_e719f0;

char * sub_1a6a48(st_1a6a48_1 *a0, char *a1, char *a2)
{
    char *v4;  // x23
    unsigned int v5;  // w8
    unsigned long v6;  // x9
    unsigned long v7;  // x8
    st_1a6a48_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_1a6a48_0 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_1c6b84();
    if (v4 == a1 && v4 != a2)
    {
        v5 = *v4;
        v6 = 64;
        if (v5 == 94)
            v6 = 40;
        if (v5 == 36)
            v6 = 24;
        v7 = 72;
        if (v5 == 40)
            v6 = v7;
        goto *((void *)(*(long long *)((char *)&g_e719f0 + v6)));
    }
    if (v4 == a1)
        return v4;
    return sub_1c3e08(a0, v4, a2, a0->field_38, a0->field_1c + 1, a0->field_1c + 1);
}
