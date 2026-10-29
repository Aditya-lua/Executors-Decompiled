/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7da88..0xa7dc14 (396 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7da88_0 {
    char padding_0[12];
    char field_c;
    char field_d;
    char field_e;
    char field_f;
    char field_10;
    char field_11;
    char field_12;
    char field_13;
    char field_14;
    char field_15;
    char field_16;
    char field_17;
    char field_18;
    char field_19;
    char field_1a;
    char field_1b;
} st_a7da88_0;

extern char g_10002b0;

st_a7da88_0 * sub_a7da88(st_a7da88_0 *a0, unsigned long a1, unsigned long long a2)
{
    st_a7da88_0 *v8;  // x0
    unsigned long long i;  // x24
    unsigned int v18;  // w11
    unsigned int v10;  // w9
    char *v11;  // x23
    unsigned int v12;  // w8
    char *v13;  // x23
    unsigned int *v14;  // x10
    unsigned int v15;  // w25
    unsigned int v16;  // w26
    unsigned int v17;  // w10
    char v0;  // [bp-0xe8]
    unsigned int v1;  // [bp-0x68]
    unsigned int v2;  // [bp-0x64]
    unsigned int v3;  // [bp-0x60]
    unsigned int v4;  // [bp-0x5c]
    unsigned long v5;  // [bp-0x58]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v8 = a0;
    if (a2)
    {
        i = 0;
        v10 = a0->field_c;
        v11 = &a0->field_c;
        v12 = v11[8];
        v13 = v11 + 8;
        do
        {
            v14 = a1 + i;
            v15 = *v14;
            v16 = v14[1];
            v1 = v15;
            v2 = v16;
            v3 = v15;
            v4 = v16;
            a0->field_c = (char)v10 & 159 | 64;
            a0->field_14 = (char)v12 & 191 | 32;
            sub_9fc200(v11);
            sub_9fc26c(v11, &v0);
            sub_9f96d4(&v3, &v0, 1);
            sub_9fc200(v13);
            sub_9fc26c(v13, &v0);
            v8 = sub_9f96d4(&v1, &v0, 1);
            v12 = v1 ^ v15;
            v10 = v3 ^ v15;
            v17 = v2 ^ v16;
            v18 = v4 ^ v16;
            a0->field_c = v10;
            a0->field_d = v10 >> 8;
            a0->field_e = v10 >> 16;
            a0->field_f = v10 >> 24;
            a0->field_10 = v17;
            a0->field_11 = v17 >> 8;
            a0->field_12 = v17 >> 16;
            a0->field_13 = v17 >> 24;
            a0->field_14 = v12;
            a0->field_15 = v12 >> 8;
            a0->field_16 = v12 >> 16;
            a0->field_17 = v12 >> 24;
            a0->field_18 = v18;
            a0->field_19 = v18 >> 8;
            a0->field_1a = v18 >> 16;
            i += 8;
            a0->field_1b = v18 >> 24;
        } while (i < a2);
    }
    if (*(long long *)&g_10002b0 == v5)
        return v8;
    ___stack_chk_fail();
}
