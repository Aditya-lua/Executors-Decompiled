/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x433eb0..0x433f90 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_433eb0_1 {
    unsigned long long field_0;
    char padding_8[24];
    unsigned long long field_20;
    char padding_28[8];
    unsigned int field_30;
    unsigned int field_34;
} st_433eb0_1;

typedef struct st_433eb0_0 {
    char field_0;
} st_433eb0_0;


unsigned long long sub_433eb0(st_433eb0_1 *a0, long long a1, unsigned long long *a2, unsigned int *a3)
{
    long long v4;  // x0
    unsigned long long v5;  // x0
    unsigned long long v6;  // x8
    unsigned long long v7;  // x8
    unsigned int v8;  // w9
    unsigned long long v9;  // x8
    unsigned long long v10;  // x10
    unsigned long long v11;  // x8
    st_433eb0_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_433eb0_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_a0c8(a1);
    v5 = sub_4a3408(v4, sub_6b08(a1));
    v6 = v5 * a0->field_0;
    v7 = ((v6 >> 33 | v6) ^ -(v6 >> 33 & v6)) + ((v6 >> 33 | v6) & -(v6 >> 33 & v6)) * 2;
    v8 = v7 + (~v7 | 31) + 1 >> ((char)a0->field_34 & 63);
    *a3 = (a0->field_30 | v8) + (a0->field_30 & v8);
    v9 = v7 >> 5;
    v10 = v9 + a0->field_20;
    v11 = -(v9 | a0->field_20);
    *a2 = (v10 ^ v11) + (v10 & v11) * 2;
    return v5;
}
