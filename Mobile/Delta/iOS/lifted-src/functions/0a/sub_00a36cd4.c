/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa36cd4..0xa36e0c (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a36cd4_1 {
    char padding_0[128];
    unsigned int field_80;
    char padding_84[60];
    unsigned long long field_c0;
    char padding_c8[184];
    unsigned long long field_180;
    char padding_188[120];
    unsigned int field_200;
    unsigned int field_204;
} st_a36cd4_1;

typedef struct st_a36cd4_0 {
    char padding_0[64];
    unsigned int field_40;
    char padding_44[188];
    unsigned long long field_100;
    char padding_108[120];
    char field_180;
    char padding_181[127];
    unsigned int field_200;
    char padding_204[60];
    long long field_240;
    char padding_248[184];
    long long field_300;
    char padding_308[120];
    int field_380;
    int field_384;
} st_a36cd4_0;


int sub_a36cd4(void)
{
    st_a36cd4_0 *v3;  // x0
    st_a36cd4_0 *v4;  // x19
    unsigned int i;  // w21
    unsigned int *v6;  // x22
    unsigned int *v7;  // x23
    unsigned long long *v8;  // x24
    unsigned long long *v9;  // x28
    unsigned long long *v10;  // x25
    unsigned int v11;  // w8
    st_a36cd4_1 *v0;  // [bp-0x68]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_a35bc0();
    if (!v3)
        return (unsigned int)v3;
    v4 = v3;
    i = v3->field_380;
    if (v3->field_384 == i)
        return 0;
    v6 = &v4->field_40;
    v7 = &v4->field_200;
    v8 = &v4->field_100;
    v0 = &v4->field_180;
    v9 = &v4->field_240;
    v10 = &v4->field_300;
    do
    {
        if (v6[i])
        {
            v6[i] = v6[i] - 1;
            return 1;
        }
        if (!(v7[i] & 1))
        {
            v11 = 0;
            v8[i] = 0;
            *(unsigned long long *)&v0->padding_0[8 * i] = 0;
        }
        else
        {
            if (!v8[i])
                continue;
            *(char *)v8[i] = 0;
            v11 = 1;
        }
        v7[i] = v11;
        v6[i] = 0;
        *(unsigned int *)&v4->padding_0[4 * i] = 0;
        *(unsigned long long *)&v4->padding_44[60 + 8 * i] = 0;
        *(unsigned int *)&v4->padding_248[120 + 4 * i] = 0xffffffff;
        sub_a6c2e4(v9[i], "crypto/err/err_local.h", 92);
        v9[i] = 0;
        sub_a6c2e4(v10[i], "crypto/err/err_local.h", 94);
        v10[i] = 0;
        if (0 < v4->field_380)
            i = v4->field_380 - 1;
        else
            i = 15;
        v4->field_380 = i;
    } while (v4->field_384 != i);
    return 0;
}
