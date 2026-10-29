/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa635e4..0xa6369c (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a635e4_0 {
    char padding_0[8];
    long long field_8;
} st_a635e4_0;

typedef struct st_a635e4_1 {
    char padding_0[40];
    long long field_28;
    long long field_30;
    struct st_a635e4_0 *field_38;
    char padding_40[16];
    struct st_a635e4_1 *field_50;
} st_a635e4_1;


void sub_a635e4(st_a635e4_1 *a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_a635e4_1 *v12;  // w0
    st_a635e4_1 *v13;  // w21
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
    sub_a7bd78(a0->field_28);
    *(unsigned int *)&a0->field_50 = 0;
    v12 = (st_a635e4_1 *)(unsigned int)sub_a634ac(a0);
    v13 = (st_a635e4_1 *)(int)a0->field_50;
    *(unsigned int *)&a0->field_50 = 0;
    sub_a7bd80(a0->field_28);
    if (v13)
        sub_a7bd88(a0->field_28);
    sub_a7c1d0(a0->field_30);
    sub_a7c0a8(a0->field_28);
    if (v12)
    {
        sub_a6c2e4(a0->field_38->field_8, "crypto/hashtable/hashtable.c", 343);
        sub_a6c2e4(a0->field_38, "crypto/hashtable/hashtable.c", 344);
    }
    else
    {
        sub_a6369c(a0->field_38);
    }
    sub_a6c2e4();
    return;
}
