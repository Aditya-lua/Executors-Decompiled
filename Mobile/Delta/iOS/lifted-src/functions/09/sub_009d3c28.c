/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d3c28..0x9d3d24 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d3c28_0 {
    unsigned long long field_0;
    struct st_9d3c28_0 *field_8;
    struct st_9d3c28_0 *field_10;
    struct st_9d3c28_0 *field_18;
    char padding_20[48];
    struct st_9d3c28_0 *field_50;
} st_9d3c28_0;


int sub_9d3c28(st_9d3c28_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_9d3c28_0 *v8;  // w8
    unsigned long long v9;  // 4102
    st_9d3c28_0 *v10;  // x8
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        do
        {
            /* unsupported instruction */;
            v8 = (st_9d3c28_0 *)/* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v9 = arm64g_calculate_condition(19, (unsigned long long)v8, 1, 0);
        if (!(v9 & 1))
        {
            /* unsupported instruction */;
LABEL_9d3c6c:
            v10 = a0->field_18;
            if (a0->field_10)
            {
                if (!v10)
                    a0->field_10();
                v10();
            }
            else
            {
                if (v10)
                    v10();
                if (a0->field_8 && a0->field_8->field_50)
                    a0->field_8->field_50();
                sub_a6a9e8(12, a0, &a0[1].field_18);
                sub_a6c2e4(a0, "crypto/bio/bio_lib.c", 147);
            }
        }
        else if (v8 <= 1)
        {
            goto LABEL_9d3c6c;
        }
        a0 = 1;
    }
    return (unsigned int)a0;
}
