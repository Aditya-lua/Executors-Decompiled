/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5c5bc..0xb5c62c (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5c5bc_0 {
    char padding_0[64];
    unsigned int field_40;
    char padding_44[4];
    unsigned long long field_48;
    unsigned long long field_50;
    unsigned long long field_58;
    char padding_60[12];
    char field_6c;
    char padding_6d[59];
    unsigned long long field_a8;
    char padding_b0[8];
    struct st_b5c5bc_0 *field_b8;
} st_b5c5bc_0;


st_b5c5bc_0 * sub_b5c5bc(st_b5c5bc_0 *a0, unsigned long long a1, unsigned long long a2, unsigned long long a3, unsigned int a4, unsigned long long a5, unsigned long a6, unsigned long long a7)
{
    st_b5c5bc_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a5 >> 9 & 1)
        a0->field_6c = a0->field_6c | 64;
    a0->field_6c = a0->field_6c | ((char)a5 * 0 | (char)(a5 >> 3)) & 32 | 1;
    a0->field_48 = a1 >> 3;
    a0->field_50 = a3 >> 3;
    a0->field_a8 = a6;
    a0->field_40 = a4;
    a0->field_58 = a2 >> 3;
    if (!a7)
        return a0;
    v2 = sub_9f2aec(a7);
    a0->field_b8 = v2;
    return v2;
}
