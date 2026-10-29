/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x989488..0x98952c (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_989488_0 {
    struct st_989488_0 *field_0;
    struct st_989488_0 *field_8;
    struct st_989488_0 *field_10;
    struct st_989488_0 *field_18;
    struct st_989488_0 *field_20;
    struct st_989488_0 *field_28;
    char padding_30[64];
    struct st_989488_0 *field_70;
    struct st_989488_0 *field_78;
} st_989488_0;


void sub_989488(long long *a0, st_989488_0 *a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_989488_0 *v8;  // x8
    st_989488_0 *v9;  // x9
    st_989488_0 *v10;  // x8
    st_989488_0 *v11;  // x9
    st_989488_0 *v12;  // x8
    st_989488_0 *v13;  // x9
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a1)
        return;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = a1->field_8;
    if (v8)
    {
        v9 = a1->field_0;
        v9->field_8 = v8;
        v8->field_0 = v9;
        a1->field_0 = 0;
        a1->field_8 = 0;
    }
    v10 = a1->field_18;
    if (v10)
    {
        v11 = a1->field_10;
        v11->field_8 = v10;
        v10->field_0 = v11;
        a1->field_10 = 0;
        a1->field_18 = 0;
    }
    v12 = a1->field_28;
    if (v12)
    {
        v13 = a1->field_20;
        v13->field_8 = v12;
        v12->field_0 = v13;
        a1->field_20 = 0;
        a1->field_28 = 0;
    }
    sub_988ae8(a1->field_70);
    a1->field_70 = 0;
    sub_9860e8(a1->field_78);
    a1->field_78 = 0;
    sub_a66994(*a0, a1);
}
