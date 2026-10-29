/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99cd9c..0x99d03c (672 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99cd9c_1 {
    char padding_0[216];
    struct st_99cd9c_0 *field_d8;
} st_99cd9c_1;

typedef struct st_99cd9c_2 {
    char padding_0[24];
    struct st_99cd9c_1 *field_18;
} st_99cd9c_2;

typedef struct st_99cd9c_0 {
    char padding_0[80];
    char field_50;
} st_99cd9c_0;


long long sub_99cd9c(st_99cd9c_2 *a0, long long a1)
{
    char v7;  // x23
    char v8;  // x22
    unsigned long long v13;  // 4112
    unsigned long long v14;  // 4106
    unsigned long v15;  // cc_op
    unsigned long v16;  // cc_dep1
    unsigned long v17;  // cc_dep2
    unsigned long v18;  // cc_ndep
    unsigned long long v19;  // 4112
    unsigned long long v20;  // 4106
    char v9;  // x24
    unsigned long v10;  // x21
    char v21;  // w21
    char v22;  // w22
    long long v23;  // x1
    unsigned int v12;  // w8
    char v0;  // [bp-0x6c]
    unsigned int v1;  // [bp-0x68]
    unsigned int v2;  // [bp-0x64]
    char v3;  // [bp-0x60]
    char v4;  // [bp-0x58]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v3 = 0;
    v4 = 0;
    if (sub_9ae540())
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_clnt.c", 224, "tls_construct_ctos_supported_groups");
        goto LABEL_99cf4c;
    }
    if (!sub_99cc60(a0, v2, v1))
    {
        if (a0->field_18->field_d8->field_50 >> 3 & 1)
        {
            return 2;
        }
        else if ((int)v1 < 772)
        {
            return 2;
        }
    }
    sub_967f90(a0, &v4, &v3);
    if (!sub_c68d5c(a1, 10, 2) || !sub_c6876c(a1, 2) || !sub_c6876c(a1, 2) || !sub_c689f4(a1, 1))
    {
        sub_a368c8();
        v23 = 246;
        goto LABEL_99cf38;
    }
    if (v3)
    {
        v7 = 0;
        v8 = 0;
        v9 = 0;
        do
        {
            v10 = *(short *)(v4 + v7 * 2);
            if (!sub_968084(a0, v10, v2, v1, 0, &v0) || !sub_968218(a0, v10, 0x20004))
                continue;
            if (!sub_c68d5c(a1, v10, 2))
            {
                sub_a368c8();
                v23 = 0x101;
                goto LABEL_99cf38;
            }
            v12 = v1;
            if (v0)
            {
                v13 = arm64g_calculate_condition(v15 | 16, v16, v17, v18);
                v14 = arm64g_calculate_condition(19, (v13 & 1 ? v12 : 0), (v13 & 1 ? 772 : 0), 0);
                if (!(v14 & 1))
                    goto LABEL_99cf16;
                goto LABEL_99cf15;
            }
            else
            {
                v19 = arm64g_calculate_condition(v15 | 16, v16, v17, v18);
                v20 = arm64g_calculate_condition(16, (v19 & 1 ? v12 : 0), (v19 & 1 ? 772 : 0), 0);
                if (v20 & 1)
                {
LABEL_99cf15:
                    goto LABEL_99cf18;
                }
                else
                {
LABEL_99cf16:
                    v9 += 1;
LABEL_99cf18:
                    v8 += 1;
                }
            }
        } while ((v7 += 1, v3 > v7));
        v21 = !v9;
        v22 = !v8;
    }
    else
    {
        v21 = 1;
        v22 = 1;
    }
    if (sub_a6e970(a1) && sub_a6e970(a1))
    {
        if (v1 != 772)
            v21 = 0;
        if (v21 != 1)
            return 1;
        sub_a368c8();
        goto LABEL_99cff4;
    }
    else
    {
        sub_a368c8();
        if (v22)
        {
LABEL_99cff4:
            sub_a369bc();
        }
        else
        {
            v23 = 270;
LABEL_99cf38:
            sub_a369bc("ssl/statem/extensions_clnt.c", v23, "tls_construct_ctos_supported_groups");
LABEL_99cf4c:
        }
        sub_9a58a4();
        return 0;
    }
}
