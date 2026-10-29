/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9feb80..0x9febfc (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9feb80_0 {
    char padding_0[8];
    struct st_9feb80_0 *field_8;
    struct st_9feb80_0 *field_10;
    struct st_9feb80_0 *field_18;
    char padding_20[28];
    struct st_9feb80_0 *field_3c;
    char padding_44[28];
    unsigned int field_60;
    char padding_64[100];
    unsigned long long field_c8;
} st_9feb80_0;


st_9feb80_0 * sub_9feb80(st_9feb80_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_9feb80_0 *v8;  // x0
    st_9feb80_0 *v9;  // x20
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
    *(unsigned int *)&(a0->padding_20)[1] = 0;
    v8 = a0->field_8;
    if (v8 && a0->field_18)
    {
        v8 = sub_a607a0();
        if (v8)
        {
            v9 = v8;
            if (!a0->field_10)
                a0->field_10 = sub_a2d00c(v9);
            *(unsigned int *)&(a0->padding_20)[1] = sub_a60850(v9);
            v8 = sub_a6085c(v9);
            *(unsigned int *)&a0->padding_44[24] = (unsigned int)v8;
            *(long long *)&a0->padding_64[96] = *(long long *)&a0->padding_64[96] + 1;
        }
    }
    return v8;
}
