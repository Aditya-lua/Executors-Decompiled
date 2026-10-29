/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4c6c0..0xb4c7a8 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4c6c0_0 {
    long long field_0;
    long long field_8;
    long long field_10;
    char padding_18[8];
    unsigned int field_20;
    char padding_24[268];
    char field_130;
    char padding_131[55];
    long long field_168;
} st_b4c6c0_0;


unsigned long long sub_b4c6c0(st_b4c6c0_0 *a0, long long a1, unsigned long long *a2, unsigned long a3, long long a4, long long a5)
{
    unsigned int v3;  // w0
    unsigned long long v4;  // x0
    long long v5;  // x26
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    unsigned long v8;  // x8
    char v0;  // [bp-0x54]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_a03744(a0->field_10);
    if (a0->field_168)
    {
        v4 = sub_a50ac8(a0->field_168);
        v5 = (unsigned int)v4 & ~((int)((unsigned int)v4) >> 31);
        v6 = sub_a2f9e0(v4);
        if (!(unsigned int)v6)
            return v6;
    }
    else
    {
        v5 = 0;
        v7 = sub_a2f9e0(0);
        if (!(unsigned int)v7)
            return v7;
    }
    v8 = v3;
    if (a1)
    {
        if (a3 >= v8 && (!v5 || v5 == a5) && (int)sub_a03780(0, a4, a5, a1, &v0, a0->field_10, a0->field_20, &a0->field_130, a0->field_0, a0->field_8) >= 1)
            v8 = v0;
        else
            return 0;
    }
    *a2 = v8;
    return 1;
}
