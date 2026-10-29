/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa40db0..0xa40e40 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a40db0_0 {
    unsigned int field_0;
    char padding_4[4];
    struct st_a40db0_0 *field_8;
    char padding_10[24];
    struct st_a40db0_0 *field_28;
    struct st_a40db0_0 *field_30;
    char padding_38[184];
    struct st_a40db0_0 *field_f0;
    char padding_f8[16];
    struct st_a40db0_0 *field_108;
} st_a40db0_0;


st_a40db0_0 * sub_a40db0(st_a40db0_0 *a0)
{
    st_a40db0_0 *v5;  // x8
    st_a40db0_0 *v6;  // x9
    st_a40db0_0 *v7;  // x8
    unsigned long long v8;  // x20
    unsigned long long v9;  // x19
    unsigned long long v10;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return 0;
    v5 = a0->field_28;
    if (v5 && (v5->field_0 == 0x100 || v5->field_0 == 128))
    {
        v6 = v5->field_28;
        if (v6 && v6->field_108 && v5->field_30)
            goto *((void *)(v6->field_108));
    }
    v7 = a0->field_8;
    if (!v7)
    {
        return 0;
    }
    else if (v7->field_f0)
    {
        v0 = v8;
        v1 = v9;
        v2 = &v4;
        v3 = v10;
        sub_a79f54(sub_9ffde0(v7));
        goto *((void *)(a0->field_8->field_f0));
    }
    else
    {
        return 0;
    }
}
