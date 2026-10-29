/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa786e8..0xa787f8 (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a786e8_0 {
    long long field_0;
    char field_1;
    char padding_2[6];
    long long field_8;
    long long field_10;
    long long field_18;
    long long field_20;
    long long field_28;
    long long field_30;
    struct st_a786e8_0 *field_38;
    char padding_40[8];
    char field_48;
} st_a786e8_0;

extern long long g_a78698;
extern long long g_a787f8;
extern long long g_a78844;

void sub_a786e8(st_a786e8_0 *a0)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    st_a786e8_0 *v16;  // x22
    st_a786e8_0 *i;  // x23
    st_a786e8_0 *v18;  // x24
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (!a0)
        return;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    a0->padding_40[0] = a0->padding_40[0] | 2;
    sub_a6c2e4(a0->field_20, "crypto/provider_core.c", 295);
    sub_ad6958(*(long long *)&a0->field_1, &g_a787f8);
    sub_ad6958(a0->field_8, &g_a78844);
    sub_a7c1d0(a0->field_10);
    sub_a7c1d0(a0->field_18);
    if (a0->field_30)
    {
        v16 = 0;
        i = 0;
        do
        {
            v18 = a0->field_28 + (char *)v16;
            sub_a6c2e4(v18->field_0, "crypto/provider_core.c", 282);
            sub_a6c2e4(*(long long *)&v18->field_1, "crypto/provider_core.c", 283);
            sub_ad6958(v18->field_10, &g_a78698);
            i = (char *)&i->field_0 + 1;
            v16 = &v16->field_20;
        } while (i < (unsigned long long)a0->field_30);
    }
    sub_a6c2e4(a0->field_28, "crypto/provider_core.c", 305);
    sub_a6c2e4();
    return;
}
