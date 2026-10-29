/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a7a40..0x9a7c1c (476 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a7a40_2 {
    int field_0;
    char padding_4[212];
    struct st_9a7a40_0 *field_d8;
} st_9a7a40_2;

typedef struct st_9a7a40_3 {
    char padding_0[24];
    struct st_9a7a40_2 *field_18;
    char padding_20[208];
    unsigned int field_f0;
    char padding_f4[109];
    char field_161;
    char padding_162[2128];
    char field_9b2;
    char padding_9b3[413];
    char field_b50;
    char padding_b51[103];
    long long field_bb8;
} st_9a7a40_3;

typedef struct st_9a7a40_0 {
    char padding_0[16];
    struct st_9a7a40_1 *field_10;
    char padding_18[56];
    char field_50;
} st_9a7a40_0;

typedef struct st_9a7a40_1 {
    unsigned long long field_0;
} st_9a7a40_1;


long long sub_9a7a40(st_9a7a40_3 *a0, long long a1)
{
    long long v2;  // x1
    char v3;  // w8
    char v4;  // x0
    char v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_18->field_d8->field_50 >> 3 & 1 || a0->field_18->field_0 < 772 || a0->field_18->field_0 == 0x10000)
    {
LABEL_9a7ad4:
        if (*(int *)&a0->padding_162[478] == 2)
        {
            v3 = a0->field_b50;
            if (!v3)
                goto LABEL_9a7b14;
        }
        else
        {
            v3 = a0->field_b50;
            if (!v3)
            {
LABEL_9a7b14:
                v5 = sub_9b02fc(a0);
                if (!v5)
                    return v5;
LABEL_9a7b24:
                if (a0->field_18->field_d8->field_50 >> 3 & 1)
                    return 1;
                if (a0->field_18->field_0 >= 772)
                {
                    if (a0->field_18->field_0 != 0x10000)
                    {
                        if (!(a0->field_161 >> 5 & 1))
                        {
                            if (*(long long *)&a0->padding_162[254] && *(long long *)&a0->padding_162[390])
                                return 1;
                            if (!a0->field_f0 && !(a0->field_9b2 >> 4 & 1))
                                return 1;
                            a0->field_18->field_d8->field_10();
                        }
                        else
                        {
                            return 1;
                        }
                    }
                    else
                    {
                        return 1;
                    }
                }
                else
                {
                    return 1;
                }
            }
        }
        if (v3 == 2)
        {
            v4 = sub_9b00b8(a0);
            if (!v4)
                return v4;
            goto LABEL_9a7b24;
        }
        else
        {
            sub_a368c8();
            v2 = 3845;
        }
    }
    else if (*(long long *)&a0->padding_b51[95])
    {
        if (sub_a6ec4c(a1, *(long long *)&a0->padding_b51[95], a0->field_bb8, 1))
            goto LABEL_9a7ad4;
        sub_a368c8();
        v2 = 3825;
    }
    else
    {
        if (sub_c68d5c(a1, 0, 1))
            goto LABEL_9a7ad4;
        sub_a368c8();
        v2 = 3821;
    }
    sub_a369bc("ssl/statem/statem_clnt.c", v2, "tls_construct_client_certificate");
    sub_9a58a4(a0, 80, 0xc0103, 0);
    return 0;
}
