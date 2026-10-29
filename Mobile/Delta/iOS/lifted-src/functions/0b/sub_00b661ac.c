/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb661ac..0xb6622c (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b661ac_0 {
    unsigned long long field_0;
    struct st_b661ac_1 *field_8;
    unsigned long long field_10;
} st_b661ac_0;

typedef struct st_b661ac_1 {
    long long field_0;
} st_b661ac_1;


void sub_b661ac(st_b661ac_0 *a0)
{
    unsigned long long v2;  // x22
    unsigned long long v3;  // x22
    unsigned long long v4;  // x22
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 0;
    while (1)
    {
        v3 = v2;
        if (v3 == a0->field_10)
            break;
        v4 = v3 + 1;
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v5 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
        v2 = v4;
        if (!(v5 & 1))
        {
            /* unsupported instruction */;
            sub_b86a90(*(long long *)&a0->field_8[v3]);
            v2 = v4;
        }
    }
    if (!a0->field_0)
        return;
}
