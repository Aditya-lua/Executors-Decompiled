/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5e7d4..0xb5e8cc (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5e7d4_1 {
    char padding_0[16];
    unsigned long long field_10;
    char padding_18[52];
    char field_4c;
    char padding_4d[51];
    unsigned int field_80;
    char padding_84[12];
    unsigned long long field_90;
} st_b5e7d4_1;

typedef struct st_b5e7d4_0 {
    char padding_0[32];
    char field_20;
    char padding_21[15];
    unsigned long long field_30;
    char padding_38[52];
    char field_6c;
    char padding_6d[51];
    unsigned int field_a0;
    char padding_a4[12];
    unsigned long long field_b0;
} st_b5e7d4_0;


int sub_b5e7d4(st_b5e7d4_0 *a0, long long a1, long long a2, unsigned long long a3)
{
    unsigned long long i;  // x22
    long long v4;  // x21
    long long v5;  // x20
    unsigned long v6;  // x8
    unsigned long v7;  // x3
    long long v8;  // x6
    unsigned long v9;  // x7
    st_b5e7d4_1 *v10;  // x4
    unsigned int v0;  // [bp-0x44]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    i = a3;
    v4 = a2;
    v5 = a1;
    v0 = a0->field_a0;
    v6 = a0->field_6c;
    if (!(v6 >> 7 & 1))
    {
        if (i > 0xfffffffffffffff)
        {
            do
            {
                sub_a94388(v4, v5, -0x8000000000000000, a0->field_b0, &a0->field_20, &v0, __ROL__(a0->field_6c, 31) & 0x80000001 & 1, a0->field_30);
                i += 0xf000000000000000;
                v5 += 0x1000000000000000;
                v4 += 0x1000000000000000;
            } while (i > 0xfffffffffffffff);
        }
        if (!i)
        {
            a0->field_a0 = v0;
            return 1;
        }
        i *= 8;
        v7 = a0->field_b0;
        v8 = __ROL__(a0->field_6c, 31) & 0x80000001 & 1;
        v9 = a0->field_30;
        v10 = &a0->field_20;
    }
    else
    {
        v7 = a0->field_b0;
        v8 = __ROL__((unsigned int)v6, 31) & 0x80000001 & 1;
        v9 = a0->field_30;
        v10 = &a0->field_20;
    }
    sub_a94388(v4, v5, i, v7, v10, &v0, v8, v9);
    a0->field_a0 = v0;
    return 1;
}
