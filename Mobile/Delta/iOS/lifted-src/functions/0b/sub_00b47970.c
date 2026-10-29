/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb47970..0xb47a4c (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b47970_1 {
    char padding_0[240];
    struct st_b47970_0 *field_f0;
} st_b47970_1;

typedef struct st_b47970_0 {
    char padding_0[84];
    char field_54;
    char field_55;
    char field_56;
    char field_57;
    char field_58;
    char field_59;
    char field_5a;
    char field_5b;
    char field_5c;
    char field_5d;
    char field_5e;
    char field_5f;
    char field_60;
    char field_61;
    char field_62;
    char field_63;
} st_b47970_0;


int sub_b47970(st_b47970_1 *a0, unsigned long a1)
{
    st_b47970_0 *v0;  // x8
    unsigned int v1;  // w9
    unsigned int v10;  // w9
    unsigned int v11;  // w9
    unsigned int v12;  // w9
    unsigned int v13;  // w9
    unsigned int v14;  // w9
    unsigned int v15;  // w9
    unsigned int v2;  // w9
    unsigned int v3;  // w9
    unsigned int v4;  // w9
    unsigned int v5;  // w9
    unsigned int v6;  // w9
    unsigned int v7;  // w9
    unsigned int v8;  // w9
    unsigned int v9;  // w9

    if (!a1)
        return 0;
    v0 = a0->field_f0;
    v1 = v0->field_63 + 1;
    v0->field_63 = v1;
    v2 = v0->field_62 + (v1 >> 8);
    v0->field_62 = v2;
    v3 = v0->field_61 + (v2 >> 8);
    v0->field_61 = v3;
    v4 = v0->field_60 + (v3 >> 8);
    v0->field_60 = v4;
    v5 = v0->field_5f + (v4 >> 8);
    v0->field_5f = v5;
    v6 = v0->field_5e + (v5 >> 8);
    v0->field_5e = v6;
    v7 = v0->field_5d + (v6 >> 8);
    v0->field_5d = v7;
    v8 = v0->field_5c + (v7 >> 8);
    v0->field_5c = v8;
    v9 = v0->field_5b + (v8 >> 8);
    v0->field_5b = v9;
    v10 = v0->field_5a + (v9 >> 8);
    v0->field_5a = v10;
    v11 = v0->field_59 + (v10 >> 8);
    v0->field_59 = v11;
    v12 = v0->field_58 + (v11 >> 8);
    v0->field_58 = v12;
    v13 = v0->field_57 + (v12 >> 8);
    v0->field_57 = v13;
    v14 = v0->field_56 + (v13 >> 8);
    v0->field_56 = v14;
    v15 = v0->field_55 + (v14 >> 8);
    v0->field_55 = v15;
    v0->field_54 = v0->field_54 + (char)(v15 >> 8);
}
