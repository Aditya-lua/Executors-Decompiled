/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x982ad4..0x982bf4 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_982ad4_0 {
    struct st_982ad4_1 *field_0;
    char padding_8[152];
    long long field_a0;
} st_982ad4_0;

typedef struct st_982ad4_1 {
    long long field_0;
} st_982ad4_1;


unsigned long long sub_982ad4(st_982ad4_0 *a0, long long a1, long long a2, unsigned long long a3, unsigned long long *a4)
{
    unsigned long long v3;  // x0
    unsigned long long v4;  // w0
    unsigned long v5;  // x21
    unsigned long v6;  // x24
    unsigned long long v7;  // x0
    unsigned long long v8;  // x0
    long long v9;  // x23
    unsigned long long v10;  // x0
    unsigned long long v11;  // x0
    char v0;  // [bp-0x54]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_a50734(a0->field_a0);
    if (!(unsigned int)v3)
        return v3;
    v4 = (unsigned int)sub_a4fbf0(a0->field_a0);
    if (v4 < 1)
        return 0;
    v5 = (int)v3;
    v6 = v4;
    *a4 = a2 + v5 + v6 + 16;
    if (!a3)
        return 1;
    v7 = sub_aa8658(*(long long *)a0->field_0, a3, v6, 0);
    if (!(unsigned int)v7)
        return v7;
    v8 = sub_a4d02c(a0->field_a0, 0, 0, 0, a3);
    if (!(unsigned int)v8)
        return v8;
    v9 = a3 + v6;
    v10 = sub_c672c8(a0->field_a0, v9, &v0, a1, a2);
    if (!(unsigned int)v10)
        return v10;
    v11 = sub_a4ca24(a0->field_a0, v9 + a2, &v0);
    if (!(unsigned int)v11)
        return v11;
    return sub_a4d5dc(a0->field_a0, 16, v5, v9 + a2) != 0;
}
