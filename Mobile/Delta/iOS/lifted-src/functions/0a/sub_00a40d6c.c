/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa40d6c..0xa40db0 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a40d6c_0 {
    char padding_0[240];
    struct st_a40d6c_0 *field_f0;
} st_a40d6c_0;


st_a40d6c_0 * sub_a40d6c(st_a40d6c_0 *a0)
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
    {
        return 0;
    }
    else if (a0->field_f0)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        sub_a79f54(sub_9ffde0());
        goto *((void *)(a0->field_f0));
    }
    else
    {
        return 0;
    }
}
