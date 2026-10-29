/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d9454..0x9d9504 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d9454_0 {
    unsigned int field_0;
    char padding_4[4];
    long long field_8;
} st_9d9454_0;


st_9d9454_0 * sub_9d9454(long long a0)
{
    st_9d9454_0 *v2;  // x0
    st_9d9454_0 *v3;  // x20
    unsigned int v4;  // w8
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bf4c(16, "crypto/bio/ossl_core_bio.c", 25);
    if (v2)
    {
        v3 = v2;
        /* unsupported instruction */;
        v2->field_0 = 1;
        if (sub_9d3d38(a0))
        {
            v3->field_8 = a0;
            return v3;
        }
        do
        {
            /* unsupported instruction */;
            v4 = /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v5 = arm64g_calculate_condition(19, v4, 1, 0);
        if (!(v5 & 1))
        {
            /* unsupported instruction */;
        }
        else if (1 < (int)v4)
        {
            return 0;
        }
        sub_9d3c28(v3->field_8);
    }
    sub_a6c2e4();
    return 0;
}
