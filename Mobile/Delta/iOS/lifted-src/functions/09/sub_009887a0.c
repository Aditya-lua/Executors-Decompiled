/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9887a0..0x988948 (424 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9887a0_0 {
    char padding_0[8];
    long long field_8;
    long long field_10;
    char field_18;
} st_9887a0_0;

extern char g_10002b0;

char sub_9887a0(st_9887a0_0 *a0, unsigned long long a1)
{
    char v5;  // x0
    char i;  // x19
    char v15;  // w0
    char j;  // x22
    unsigned long v8;  // x23
    char v9;  // x0
    char *v10;  // x0
    char v12;  // x0
    char *v13;  // x0
    char v0;  // [bp-0x88]
    unsigned long long v1;  // [bp-0x78]
    unsigned long v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    v1 = a1;
    if (!(a0->field_18 & 1))
    {
        v5 = sub_a66b6c(a0->field_8, &v0);
        if (v5)
        {
            i = v5;
            j = v5;
            do
            {
                v8 = *(long long *)(j + 8);
                if (j != i)
                {
                    v9 = sub_a66b6c(a0->field_10, j);
                    if (v9 != j)
                    {
                        do
                        {
                            v10 = (char *)v9;
                            v9 = *(long long *)v10;
                        } while (*(long long *)v10 != j);
                        *(long long *)v10 = *(long long *)j;
                    }
                    else if (!*(long long *)j)
                    {
                        sub_a66994(a0->field_10, j);
                    }
                    else
                    {
                        sub_a66794(a0->field_10, *(long long *)j);
                        if (sub_a66e38(a0->field_10))
                            a0->field_18 = a0->field_18 | 1;
                    }
                    sub_a6c2e4(j, "ssl/quic/quic_srtm.c", 437);
                }
            } while ((j = v8, j));
            sub_a66994(a0->field_8, i);
            v12 = sub_a66b6c(a0->field_10, i);
            if (v12 != i)
            {
                do
                {
                    v13 = (char *)v12;
                    v12 = *(long long *)v13;
                } while (*(long long *)v13 != i);
                *(long long *)v13 = *(long long *)i;
            }
            else if (*(long long *)i)
            {
                sub_a66794(a0->field_10, *(long long *)i);
                if (sub_a66e38(a0->field_10))
                    a0->field_18 = a0->field_18 | 1;
            }
            else
            {
                sub_a66994(a0->field_10, i);
            }
            sub_a6c2e4(i, "ssl/quic/quic_srtm.c", 443);
        }
        v15 = 1;
    }
    else
    {
        v15 = 0;
    }
    if (*(long long *)&g_10002b0 == v2)
        return v15;
    ___stack_chk_fail();
}
