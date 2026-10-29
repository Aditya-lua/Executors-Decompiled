/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9de3c..0xb9dec8 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b9de3c_0 {
    unsigned long long field_0;
    struct st_b9de3c_1 *field_8;
    unsigned long long field_10;
} st_b9de3c_0;

typedef struct st_b9de3c_1 {
    unsigned long long field_0;
} st_b9de3c_1;


void sub_b9de3c(st_b9de3c_0 *a0)
{
    unsigned long long v2;  // x21
    unsigned long long v3;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_10)
    {
        v2 = 0;
        do
        {
            if (*(long long *)&a0->field_8[v2])
            {
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v3 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                if (!(v3 & 1))
                {
                    /* unsupported instruction */;
                    sub_b86a90(*(long long *)&a0->field_8[v2]);
                }
            }
        } while ((v2 += 1, v2 != a0->field_10));
    }
    if (!a0->field_0)
        return;
}
