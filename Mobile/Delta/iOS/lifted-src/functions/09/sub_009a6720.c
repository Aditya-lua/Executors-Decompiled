/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a6720..0x9a6b28 (1032 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a6720_1 {
    int field_0;
    char padding_4[212];
    struct st_9a6720_0 *field_d8;
} st_9a6720_1;

typedef struct st_9a6720_3 {
    char padding_0[24];
    struct st_9a6720_1 *field_18;
    char padding_20[40];
    int field_48;
    char padding_4c[96];
    char field_ac;
    char padding_ad[180];
    char field_161;
    char padding_162[414];
    struct st_9a6720_2 *field_300;
    char padding_308[512];
    unsigned int field_508;
    char padding_50c[1012];
    unsigned long long field_900;
} st_9a6720_3;

typedef struct st_9a6720_2 {
    char padding_0[28];
    unsigned int field_1c;
    unsigned int field_20;
} st_9a6720_2;

typedef struct st_9a6720_0 {
    char padding_0[80];
    unsigned int field_50;
} st_9a6720_0;


char sub_9a6720(st_9a6720_3 *a0, char a1)
{
    unsigned long v2;  // x8
    char v3;  // w8
    char v4;  // w8
    char v5;  // w9
    unsigned int v6;  // w8
    char v7;  // x9
    unsigned int v8;  // w10
    char v9;  // x8
    long long v10;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_18->field_d8->field_50;
    if (!(v2 >> 3 & 1) && a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000)
    {
        v3 = *(int *)&a0->field_ac;
        if (7 >= v3)
        {
            if (v3 - 4 >= 2)
            {
                switch (v3)
                {
                case 1:
                    switch (a1)
                    {
                    case 4:
LABEL_9a6878:
                        v4 = 10;
                        break;
                    case 13:
                        if (*(int *)&a0[1].padding_162[318] != 1)
                            goto LABEL_9a6ad8;
                        *(unsigned int *)&a0[1].padding_162[318] = 4;
                        if (!sub_9b2334())
                            goto LABEL_9a6ad8;
LABEL_9a6ac8:
                        v4 = 8;
                        break;
                    case 24:
                        if (a0->field_161 >> 5 & 1)
                            goto LABEL_9a6ad8;
                        v4 = 49;
                        break;
                    default:
LABEL_9a6ad8:
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_clnt.c", 423, "ossl_statem_client_read_transition");
                        sub_9a58a4(a0, 10, 244, 0);
                        return 0;
                    }
                    break;
                case 3:
                    if (a1 != 8)
                        goto LABEL_9a6ad8;
                    v4 = 42;
                    break;
                default:
LABEL_9a6ad8:
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_clnt.c", 423, "ossl_statem_client_read_transition");
                    sub_9a58a4(a0, 10, 244, 0);
                    return 0;
                }
            }
            else
            {
                if (a1 != 15)
                    goto LABEL_9a6ad8;
                v4 = 43;
            }
        }
        else
        {
            if (41 >= v3)
            {
                switch (v3)
                {
                case 8:
LABEL_9a6a28:
                    if (a1 == 11)
                        goto LABEL_9a6a30;
                    goto LABEL_9a6ad8;
                case 13:
                    if (a1 != 2)
                        goto LABEL_9a6ad8;
                    else
                        goto LABEL_9a6918;
                default:
LABEL_9a6ad8:
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_clnt.c", 423, "ossl_statem_client_read_transition");
                    sub_9a58a4(a0, 10, 244, 0);
                    return 0;
                }
LABEL_9a6918:
                v4 = 3;
            }
            else
            {
                if (v3 != 42)
                {
                    if (v3 == 43)
                        goto LABEL_9a6994;
                    goto LABEL_9a6ad8;
                }
                if (a0->field_508)
                {
LABEL_9a6994:
                    if (a1 != 20)
                        goto LABEL_9a6ad8;
LABEL_9a699c:
                    v4 = 12;
                }
                else
                {
                    if (a1 == 13)
                        goto LABEL_9a6ac8;
                    goto LABEL_9a6a28;
                }
            }
        }
    }
    else if (7 >= *(int *)&a0->field_ac)
    {
        switch (v5)
        {
        case 4: case 5:
            if (a1 != 22 || !*(int *)&a0[1].padding_ad[135])
                goto LABEL_9a68bc;
            v4 = 6;
            break;
        case 1:
            if (a1)
                goto LABEL_9a6924;
            v4 = 45;
            break;
        case 6:
LABEL_9a68bc:
            if (a0->field_300->field_1c & 422)
                goto LABEL_9a68d0;
            if (a1 != 12 || !(a0->field_300->field_1c & 72))
                goto LABEL_9a67b8;
            goto LABEL_9a6984;
        case 3:
            if (a0->field_508)
                goto LABEL_9a6868;
            if (a1 == 3 && v2 >> 3 & 1)
            {
LABEL_9a69d8:
                v4 = 2;
                break;
            }
            else if (a0->field_48 >= 769 && *(long long *)&a0[1].padding_162[118] && a1 == 0x101 && *(long long *)(a0->field_900 + 808))
            {
                a0->field_508 = 1;
                v4 = 11;
                break;
            }
            else
            {
                v8 = a0->field_300->field_20;
                if (v8 & 84)
                {
                    if (a0->field_300->field_1c & 422)
                    {
LABEL_9a68d0:
                        if (a1 == 12)
                            goto LABEL_9a6984;
                        goto LABEL_9a6924;
                    }
                    if (a1 == 12 && a0->field_300->field_1c & 72)
                    {
LABEL_9a6984:
                        v4 = 7;
                        break;
                    }
                    else if (a1 == 14)
                    {
LABEL_9a6908:
                        v4 = 9;
                        break;
                    }
                    else
                    {
                        if (a1 != 13)
                            goto LABEL_9a6924;
                        if (a0->field_48 <= 0x300)
                            v9 = 0;
                        else
                            v9 = (v8 * 0x40000000 | v8 >> 2) & 0xc0000001 & 1;
                        if (v8 & 80)
                            goto LABEL_9a6ad8;
                        if (!(v9 & 1))
                            goto LABEL_9a6ac8;
                        goto LABEL_9a6ad8;
                    }
                }
                else
                {
                    if (a1 != 11)
                        goto LABEL_9a6924;
LABEL_9a6a30:
                    v4 = 4;
                    break;
                }
            }
        case 7:
LABEL_9a67b8:
            if (a1 == 14)
                goto LABEL_9a6908;
            if (a1 != 13)
                goto LABEL_9a6924;
            v6 = a0->field_300->field_20;
            if (a0->field_48 <= 0x300)
                v7 = 0;
            else
                v7 = (v6 * 0x40000000 | v6 >> 2) & 0xc0000001 & 1;
            if (v7 & 1)
                goto LABEL_9a6ad8;
            if (!(v6 & 80))
                goto LABEL_9a6ac8;
            goto LABEL_9a6ad8;
        default:
LABEL_9a6924:
            if (a1 != 0x101)
                goto LABEL_9a6ad8;
LABEL_9a692c:
            if (!(v2 >> 3 & 1))
                goto LABEL_9a6ad8;
            *(unsigned long long *)&a0->padding_ad[91] = 0;
            *(unsigned int *)&a0->padding_4c[28] = 3;
            v10 = sub_95f850();
            sub_9d3d58(v10, 15);
            sub_9d3d74(v10, 9);
            return 0;
        }
    }
    else
    {
        if (12 < *(int *)&a0->field_ac)
        {
            switch (v5)
            {
            case 50:
                if (a1 != 2)
                    goto LABEL_9a6924;
                else
                    goto LABEL_9a6918;
            case 20:
LABEL_9a6868:
                if (!*(int *)&a0[1].padding_ad[171])
                    goto LABEL_9a68dc;
                if (a1 == 4)
                    goto LABEL_9a6878;
                goto LABEL_9a6924;
            case 13:
                if (a1 != 2)
                {
                    if (a1 != 3)
                        goto LABEL_9a6924;
                    if (v2 >> 3 & 1)
                        goto LABEL_9a69d8;
                    goto LABEL_9a6924;
                }
                break;
            default:
LABEL_9a6924:
                if (a1 == 0x101)
                    goto LABEL_9a692c;
                goto LABEL_9a6ad8;
            }
            goto LABEL_9a6918;
        }
        switch (v5)
        {
        case 8:
            if (a1 == 14)
                goto LABEL_9a6908;
            goto LABEL_9a6924;
        case 10:
LABEL_9a68dc:
            if (a1 != 0x101)
                goto LABEL_9a6ad8;
            v4 = 11;
            break;
        case 11:
            if (a1 == 20)
                goto LABEL_9a699c;
            goto LABEL_9a6924;
        default:
LABEL_9a6924:
            if (a1 == 0x101)
                goto LABEL_9a692c;
            goto LABEL_9a6ad8;
        }
    }
    *(unsigned int *)&a0->field_ac = v4;
    return 1;
}
