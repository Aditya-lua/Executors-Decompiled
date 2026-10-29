/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf8188..0xaf8298 (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af8188_2 {
    char padding_0[148];
    unsigned int field_94;
    long long field_98;
    char padding_a0[80];
    struct st_af8188_1 *field_f0;
    int field_f8;
} st_af8188_2;

typedef struct st_af8188_0 {
    char field_0;
    char field_1;
    char field_2;
    char padding_3[21];
    unsigned long long field_18;
} st_af8188_0;

typedef struct st_af8188_3 {
    char field_0;
    int field_1;
    unsigned long long field_2;
    char padding_a[14];
    long long field_18;
} st_af8188_3;

typedef struct st_af8188_1 {
    char padding_0[8];
    long long field_8;
    char padding_10[8];
    struct st_af8188_0 *field_18;
    long long field_20;
    char padding_28[4];
    unsigned int field_2c;
} st_af8188_1;


int sub_af8188(st_af8188_2 *a0)
{
    st_af8188_1 *v2;  // x24
    unsigned long v3;  // x20
    long long v4;  // x0
    int v5;  // w0
    long long v6;  // x23
    st_af8188_3 *v7;  // x0
    unsigned int v8;  // w0
    unsigned int i;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_f0;
    v3 = a0->field_94 - 1;
    v4 = sub_ad69f8(a0->field_98, v3);
    v5 = sub_ad69e4(v2->field_8);
    if (v5 < 1)
        return 3;
    v6 = 0;
    do
    {
        v7 = sub_ad69f8(v2->field_8, v6);
        if (v7->field_0 == 2 && (&v7->field_0)[1] == 1 && !(&v7->field_0)[2] && (int)sub_af9264(v4, *(long long *)&v7->padding_a[8]) >= 1)
        {
            sub_afc404(v2->field_20);
            a0->field_f8 = 1;
            v2->field_2c = v3;
            v2->field_18 = v7;
            v2->field_20 = 0;
            v8 = sub_ad69e4(a0->field_98);
            for (i = a0->field_94; (int)v8 > (int)i; i = a0->field_94)
            {
                sub_afc404(sub_ad692c(a0->field_98));
                v8 -= 1;
            }
            return 1;
        }
    } while ((v6 = (int)v6 + 1, v5 != (int)v6));
    return 3;
}
