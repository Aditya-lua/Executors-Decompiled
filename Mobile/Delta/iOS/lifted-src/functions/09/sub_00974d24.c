/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x974d24..0x974dcc (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_974d24_0 {
    char padding_0[24];
    long long field_18;
    char padding_20[16];
    char field_30;
    char padding_31[23];
    long long field_48;
    char padding_50[16];
    char field_60;
    char padding_61[23];
    long long field_78;
    char padding_80[16];
    char field_90;
    char padding_91[31];
    char field_b0;
    char padding_b1[31];
    char field_d0;
    char padding_d1[250];
    struct st_974d24_0 *field_1cb;
    struct st_974d24_0 *field_1cc;
    struct st_974d24_0 *field_1cd;
} st_974d24_0;


void sub_974d24(st_974d24_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if ((a0->padding_d1)[1])
    {
        if (!(a0->padding_d1)[1 + 1])
            goto LABEL_974d90;
LABEL_974d48:
        if (!(a0->padding_d1)[1 + 2])
            goto LABEL_974db0;
    }
    else
    {
        sub_a66664(a0->field_18);
        memset(a0, 0, 32);
        sub_991a44(&a0->field_90);
        if ((a0->padding_d1)[1 + 1])
            goto LABEL_974d48;
LABEL_974d90:
        sub_a66664(a0->field_48);
        memset(&a0->field_30, 0, 32);
        sub_991a44(&a0->field_b0);
        if (!(a0->padding_d1)[1 + 2])
        {
LABEL_974db0:
            sub_a66664(a0->field_78);
            memset(&a0->field_60, 0, 32);
            sub_991a44(&a0->field_d0);
        }
    }
}
