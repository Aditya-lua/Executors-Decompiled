/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b00b8..0x9b02fc (580 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b00b8_1 {
    char padding_0[24];
    void* field_18;
} st_9b00b8_1;


char sub_9b00b8(st_9b00b8_1 *a0, long long a1, char a2)
{
    char v3;  // x21
    unsigned long long v4;  // x0
    long long v5;  // x1
    char v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if (a2)
    {
        v3 = *(long long *)a2;
        if (!v3)
        {
            if (!*(long long *)(a2 + 8))
                goto LABEL_9b01e4;
            v4 = sub_afb6e8(*(long long *)(a2 + 8), &v0);
            if (0 < (int)v4)
                goto LABEL_9b0100;
LABEL_9b01c8:
            sub_a368c8();
            v5 = 1362;
        }
        else if (sub_a19700(v3))
        {
            v4 = sub_afb038();
            if ((int)v4 <= 0)
                goto LABEL_9b01c8;
LABEL_9b0100:
            if ((char)(*(char *)((long long)a0->field_18[216] + 80)) >> 3 & 1 || *(int *)a0->field_18 < 772 || *(int *)a0->field_18 == 0x10000 || (v4 = v4, sub_c6876c(a1, 3)))
            {
                if (!sub_a6ec4c(a1, v0, v4 & 0xffffffff, 3))
                {
                    sub_a368c8();
                    v5 = 1378;
                }
                else if ((char)(*(char *)((long long)a0->field_18[216] + 80)) >> 3 & 1)
                {
                    sub_a6c2e4(v0, "ssl/statem/statem_lib.c", 1401);
                    return 1;
                }
                else if (*(int *)a0->field_18 < 772)
                {
                    sub_a6c2e4(v0, "ssl/statem/statem_lib.c", 1401);
                    return 1;
                }
                else if (*(int *)a0->field_18 == 0x10000)
                {
                    sub_a6c2e4(v0, "ssl/statem/statem_lib.c", 1401);
                    return 1;
                }
                else if (sub_99b1e4(a0, a1, 0x10000, v3, 0))
                {
                    if (sub_a6e970(a1))
                    {
                        sub_a6c2e4(v0, "ssl/statem/statem_lib.c", 1401);
                        return 1;
                    }
                    sub_a368c8();
                    v5 = 1394;
                }
                else
                {
                    sub_a6c2e4(v0, "ssl/statem/statem_lib.c", 1401);
                    return 0;
                }
            }
            else
            {
                sub_a368c8(v4);
                v5 = 1372;
            }
        }
        else
        {
            sub_a368c8();
            v5 = 1340;
        }
    }
    else
    {
LABEL_9b01e4:
        if ((int)a0[3].field_18)
        {
            sub_a368c8();
            v5 = 1350;
        }
        else
        {
            if (sub_a6ec4c(a1, 0, 0, 3))
                return 1;
            sub_a368c8();
            v5 = 1355;
        }
    }
    sub_a369bc("ssl/statem/statem_lib.c", v5, "tls_output_rpk");
    sub_9a58a4(a0, 80, 0xc0103, 0);
    sub_a6c2e4(v0, "ssl/statem/statem_lib.c", 1401);
    return 0;
}
