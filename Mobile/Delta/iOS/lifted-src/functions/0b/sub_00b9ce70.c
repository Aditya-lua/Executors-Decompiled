/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9ce70..0xb9cf30 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b9ce70_0 {
    long long field_0;
    unsigned long long field_8;
    long long field_10;
} st_b9ce70_0;


void sub_b9ce70(st_b9ce70_0 *a0)
{
    long long i;  // x21
    long long *v3;  // x23
    unsigned long long v4;  // 4102
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_10)
    {
        i = 0;
        do
        {
            v3 = a0->field_8 + i * 16;
            i += 1;
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v4 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
            if (!(v4 & 1))
            {
                /* unsupported instruction */;
                sub_b86a90(*v3);
            }
            if (v3[1])
            {
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v5 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                if (!(v5 & 1))
                {
                    /* unsupported instruction */;
                    sub_b86a90(v3[1]);
                }
            }
        } while (i != a0->field_10);
    }
    if (!a0->field_0)
        return;
}
