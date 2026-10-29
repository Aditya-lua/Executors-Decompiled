/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5ebac..0xb5ec78 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5ebac_0 {
    char padding_0[32];
    char field_20;
    char padding_21[15];
    long long field_30;
    char padding_38[104];
    unsigned int field_a0;
    char padding_a4[12];
    long long field_b0;
} st_b5ebac_0;


int sub_b5ebac(st_b5ebac_0 *a0, long long a1, long long a2, long long a3)
{
    long long i;  // x20
    long long v5;  // x22
    long long v6;  // x21
    unsigned int v7;  // w8
    unsigned int v0;  // [bp-0x48]
    unsigned int v1;  // [bp-0x44]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    i = a3;
    v5 = a2;
    v6 = a1;
    if ((unsigned long long)a3 > 0x3fffffff)
    {
        v7 = a0->field_a0;
        do
        {
            v0 = v7;
            sub_a97754(v5, v6, 0x40000000, a0->field_b0, &a0->field_20, &v0, a0->field_30);
            v7 = v0;
            a0->field_a0 = v7;
            i += 0xffffffffc0000000;
            v5 += 0x40000000;
            v6 += 0x40000000;
        } while ((unsigned long long)i > 0x3fffffff);
    }
    if (!i)
        return 1;
    v1 = a0->field_a0;
    sub_a97754(v5, v6, i, a0->field_b0, &a0->field_20, &v1, a0->field_30);
    a0->field_a0 = v1;
    return 1;
}
