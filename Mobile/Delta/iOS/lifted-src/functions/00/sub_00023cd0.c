/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x23cd0..0x23e3c (364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_23cd0_1 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_23cd0_1;

typedef struct st_23cd0_0 {
    char field_0;
} st_23cd0_0;


unsigned long long sub_23cd0(void* a0, void* a1, void* a2)
{
    long long v9;  // w24
    unsigned long v10;  // x25
    void* v11;  // x26
    unsigned long long v12;  // 4107
    unsigned long long v13;  // 4107
    unsigned long long v14;  // x0
    st_23cd0_0 **v0;  // [bp-0x88], Other Possible Types: char
    st_23cd0_0 *v1;  // [bp-0x80]
    long long v2;  // [bp-0x74]
    unsigned long v3;  // [bp-0x70]
    st_23cd0_1 *v4;  // [bp-0x68]
    long long v5;  // [bp-0x60]
    void* v6;  // [bp-0x58]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v1 = &v0;
    v0 = &v1;
    if (a1)
        *(long long *)a1 = (long long)a0[132];
    v9 = (int)a0[128];
    v10 = (long long)a0[132];
    v11 = a0 + 132;
    sub_c048(a0 + 96);
    v4 = a0 + 1088;
    v5 = (long long)a0[1096] - (long long)a0[1088] >> 3;
    v6 = 0;
    if (!a1)
    {
        v12 = arm64g_calculate_condition(4, a1, 0, 0);
        if (!(v12 & 1))
            goto LABEL_23d62;
LABEL_23d61:
    }
    else
    {
        v13 = arm64g_calculate_condition(4, a1, 0, 0);
        if (v13 & 1)
            goto LABEL_23d61;
LABEL_23d62:
    }
    v14 = sub_12b7c();
    if (a1)
    {
        *(unsigned long long *)&a1[16] = sub_ef54(a0, &v4);
        *(st_23cd0_1 ***)&a1[24] = &v4;
        if ((int)a0[128] == 62)
            *(long long *)&a1[40] = *(long long *)v11;
    }
    if (a2)
        *(int128_t *)a2 = *(int128_t *)v11;
    v2 = v9;
    v3 = v10;
    sub_1ef30(a0, 62, &v2, 0);
    sub_dd88(v4, v4->field_0 + v5 * 8, v4->field_8);
    return v14;
}
