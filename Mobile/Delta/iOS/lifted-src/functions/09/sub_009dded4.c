/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9dded4..0x9de064 (400 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9dded4_0 {
    struct st_9dded4_0 *field_0;
    struct st_9dded4_0 *field_8;
    char padding_10[8];
    struct st_9dded4_0 *field_18;
    struct st_9dded4_0 *field_20;
    char padding_28[8];
    struct st_9dded4_0 *field_30;
    char padding_38[16];
    struct st_9dded4_0 *field_48;
    char padding_50[16];
    struct st_9dded4_0 *field_60;
    char padding_68[16];
    struct st_9dded4_0 *field_78;
    char padding_80[16];
    struct st_9dded4_0 *field_90;
    char padding_98[16];
    struct st_9dded4_0 *field_a8;
    char padding_b0[16];
    struct st_9dded4_0 *field_c0;
    char padding_c8[16];
    struct st_9dded4_0 *field_d8;
    char padding_e0[16];
    struct st_9dded4_0 *field_f0;
    char padding_f8[16];
    struct st_9dded4_0 *field_108;
    char padding_110[16];
    struct st_9dded4_0 *field_120;
    char padding_128[16];
    struct st_9dded4_0 *field_138;
    char padding_140[16];
    struct st_9dded4_0 *field_150;
    char padding_158[16];
    struct st_9dded4_0 *field_168;
    char padding_170[24];
    unsigned long long field_188;
} st_9dded4_0;


void sub_9dded4(st_9dded4_0 *a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    st_9dded4_0 *v17;  // x0
    st_9dded4_0 *v18;  // x0
    st_9dded4_0 *v19;  // x0
    st_9dded4_0 *v20;  // x0
    st_9dded4_0 *v21;  // x0
    st_9dded4_0 *v22;  // x0
    st_9dded4_0 *v23;  // x0
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_9dded4_0 *i;  // x21
    st_9dded4_0 *v13;  // x0
    st_9dded4_0 *v14;  // x0
    st_9dded4_0 *v15;  // x0
    st_9dded4_0 *v16;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    sub_a6c2e4(a0->field_20, "crypto/bn/bn_ctx.c", 262);
    a0->field_20 = 0;
    i = a0->field_0;
    if (i)
    {
        do
        {
            if (i->field_0)
                sub_9e4838(i);
            v13 = i;
            if (v13->field_18)
                sub_9e4838(&v13->field_18);
            v14 = i;
            if (v14->field_30)
                sub_9e4838(&v14->field_30);
            v15 = i;
            if (v15->field_48)
                sub_9e4838(&v15->field_48);
            v16 = i;
            if (v16->field_60)
                sub_9e4838(&v16->field_60);
            v17 = i;
            if (v17->field_78)
                sub_9e4838(&v17->field_78);
            v18 = i;
            if (v18->field_90)
                sub_9e4838(&v18->field_90);
            v19 = i;
            if (v19->field_a8)
                sub_9e4838(&v19->field_a8);
            v20 = i;
            if (v20->field_c0)
                sub_9e4838(&v20->field_c0);
            v21 = i;
            if (v21->field_d8)
                sub_9e4838(&v21->field_d8);
            v22 = i;
            if (v22->field_f0)
                sub_9e4838(&v22->field_f0);
            if (i->field_108)
                sub_9e4838(&i->field_108);
            if (i->field_120)
                sub_9e4838(&i->field_120);
            if (i->field_138)
                sub_9e4838(&i->field_138);
            if (i->field_150)
                sub_9e4838(&i->field_150);
            if (i->field_168)
                sub_9e4838(&i->field_168);
            v23 = a0->field_0;
            a0->field_8 = v23->field_188;
            sub_a6c2e4(v23, "crypto/bn/bn_ctx.c", 310);
            i = a0->field_8;
            a0->field_0 = i;
        } while (i);
    }
    sub_a6c2e4();
    return;
}
