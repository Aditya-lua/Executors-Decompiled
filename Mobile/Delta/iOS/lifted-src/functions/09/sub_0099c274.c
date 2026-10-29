/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99c274..0x99c46c (504 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99c274_1 {
    int field_0;
    char padding_4[212];
    struct st_99c274_0 *field_d8;
} st_99c274_1;

typedef struct st_99c274_2 {
    char padding_0[24];
    struct st_99c274_1 *field_18;
    char padding_20[321];
    char field_161;
    char padding_162[892];
    unsigned short field_4de;
    char padding_4e0[8];
    unsigned short field_4e8;
    char padding_4ea[1574];
    char field_b10;
} st_99c274_2;

typedef struct st_99c274_0 {
    char padding_0[80];
    char field_50;
} st_99c274_0;


unsigned long long sub_99c274(st_99c274_2 *a0, unsigned long long a1, unsigned long long a2)
{
    long long v2;  // x1
    long long v3;  // x2
    unsigned int v4;  // w10
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_18->field_d8->field_50 >> 3 & 1)
    {
        return 1;
    }
    else if (a1 >> 11 & 1)
    {
        return 1;
    }
    else if (a0->field_18->field_0 < 772)
    {
        return 1;
    }
    else if (a0->field_18->field_0 != 0x10000)
    {
        if (!*(int *)&a0->padding_20[88] && !a2)
        {
            if (!(a0->field_b10 & 1))
            {
                sub_a368c8();
                sub_a369bc("ssl/statem/extensions.c", 1335, "final_key_share");
                v2 = 47;
                v3 = 101;
                goto LABEL_99c418;
            }
            else
            {
                if (*(int *)&a0->padding_4ea[30])
                    goto LABEL_99c2b8;
                sub_a368c8();
                sub_a369bc("ssl/statem/extensions.c", 1339, "final_key_share");
                v2 = 109;
                v3 = 101;
                goto LABEL_99c418;
            }
        }
LABEL_99c2b8:
        if (*(int *)&a0->padding_20[88])
        {
            if (a0->padding_4e0)
            {
                if (!(a0->field_161 >> 3 & 1) || *(int *)((char *)&a0[1].field_18 + 7))
                    goto LABEL_99c438;
                if (!*(int *)&a0->padding_4ea[998])
                {
                    *(unsigned int *)&a0->padding_4ea[998] = 1;
                    return 1;
                }
                sub_c651bc();
            }
            else
            {
                if (a2 && !*(int *)&a0->padding_4ea[998])
                {
                    if (*(int *)&a0->padding_4ea[30] && !(a0->field_b10 >> 1 & 1))
                        goto LABEL_99c3d4;
                    v4 = a0->field_4e8;
                    if (v4)
                    {
                        a0->field_4de = v4;
                        *(unsigned int *)&a0->padding_4ea[998] = 1;
                        return 1;
                    }
                }
                if (!*(int *)&a0->padding_4ea[30])
                    goto LABEL_99c3dc;
LABEL_99c3d4:
                if (!(a0->field_b10 & 1))
                {
LABEL_99c3dc:
                    sub_a368c8();
                    sub_a369bc("ssl/statem/extensions.c", 1412, "final_key_share");
                    if (a2)
                        v2 = 40;
                    else
                        v2 = 109;
                    v3 = 101;
LABEL_99c418:
                    sub_9a58a4(a0, v2, v3, 0);
                }
                else
                {
                    if (!(a0->field_161 >> 3 & 1) || *(int *)((char *)&a0[1].field_18 + 7))
                    {
LABEL_99c438:
                        if (*(int *)&a0->padding_4ea[998] != 1)
                            return 1;
                        *(unsigned int *)&a0->padding_4ea[998] = 2;
                        return 1;
                    }
                    if (!*(int *)&a0->padding_4ea[998])
                    {
                        *(unsigned int *)&a0->padding_4ea[998] = 1;
                        return 1;
                    }
                    sub_c651f0();
                }
            }
            return 0;
        }
        if (a2)
        {
            return 1;
        }
        else if (!sub_96f1fc())
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/extensions.c", 1445, "final_key_share");
            v2 = 80;
            v3 = 786691;
            goto LABEL_99c418;
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
