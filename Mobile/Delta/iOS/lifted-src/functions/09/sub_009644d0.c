/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9644d0..0x96466c (412 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9644d0_0 {
    struct st_9644d0_1 *field_0;
    char padding_8[24];
    struct st_9644d0_1 *field_20;
} st_9644d0_0;

typedef struct st_9644d0_1 {
    unsigned long long field_0;
} st_9644d0_1;


unsigned long long sub_9644d0(st_9644d0_0 *a0, long long a1, unsigned long a2)
{
    unsigned long long v3;  // x0
    unsigned long long v4;  // x21
    unsigned long long v5;  // x8
    long long v6;  // x1
    long long v8;  // x0
    unsigned long long v9;  // x0
    long long *v10;  // x8
    unsigned long long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_af1e94(a1);
    if (v3)
    {
        v4 = v3;
        if (sub_959f90())
        {
            v5 = v0;
            if (v5 != 3)
            {
LABEL_96452c:
                if (*(long long *)&a0->field_20[1 + 5 * v5])
                {
                    sub_a35af4(sub_a59d8c(v4));
                    if (!sub_af1ea4(a1, *(long long *)&a0->field_20[1 + 5 * v0]))
                    {
                        v8 = sub_a5a4c8(*(long long *)&a0->field_20[1 + 5 * v0]);
                        *(unsigned long long *)&a0->field_20[1 + 5 * v0] = 0;
                        sub_a35af4(v8);
                    }
                }
                v9 = sub_af3b1c(a1);
                if (!(unsigned int)v9)
                    return v9;
                sub_afc404(*(long long *)&a0->field_20[5 * v0]);
                v10 = &a0->field_20[5 * v0];
                *v10 = a1;
                a0->field_0 = v10;
                return 1;
            }
            else if (sub_a5b3fc(v4))
            {
                v5 = v0;
                goto LABEL_96452c;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("ssl/ssl_rsa.c", 275, "ssl_set_cert");
                v6 = 318;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("ssl/ssl_rsa.c", 270, "ssl_set_cert");
            v6 = 247;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_rsa.c", 265, "ssl_set_cert");
        v6 = 268;
    }
    sub_a36abc(20, v6, 0);
    return 0;
}
