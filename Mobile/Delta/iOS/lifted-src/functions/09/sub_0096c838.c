/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96c838..0x96ca2c (500 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96c838_0 {
    char padding_0[8];
    long long field_8;
} st_96c838_0;

typedef struct st_96c838_3 {
    char padding_0[8];
    struct st_96c838_4 *field_8;
    char padding_10[752];
    struct st_96c838_1 *field_300;
    char padding_308[208];
    struct st_96c838_0 *field_3d8;
    char padding_3e0[1184];
    struct st_96c838_2 *field_880;
} st_96c838_3;

typedef struct st_96c838_2 {
    char padding_0[24];
    long long field_18;
} st_96c838_2;

typedef struct st_96c838_1 {
    char padding_0[32];
    char field_20;
    char padding_21[35];
    unsigned int field_44;
} st_96c838_1;

typedef struct st_96c838_4 {
    long long field_0;
    char padding_8[1128];
    long long field_470;
} st_96c838_4;


char sub_96c838(st_96c838_3 *a0)
{
    int v3;  // w19
    int v4;  // w0
    char v5;  // x19
    char v6;  // x20
    char v7;  // x21
    char v8;  // x0
    char v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if ((int)a0->field_880->field_18 == 2)
    {
        v3 = 80;
    }
    else if (a0->field_300->field_20 & 20)
    {
        if (a0->field_300->field_44 == 0x100)
            v3 = 128;
        else
            v3 = 80;
    }
    else if (a0->field_3d8)
    {
        v3 = sub_a59d18(a0->field_3d8->field_8);
    }
    else
    {
        return 0;
    }
    v4 = sub_959e00();
    if (v4 >= v3)
        v3 = v4;
    if (v3 >= 192)
    {
        v5 = sub_9dd558(0);
        if (!v5)
            goto LABEL_96c990;
        goto LABEL_96c8e4;
    }
    if (v3 >= 152)
    {
        v5 = sub_9dd53c(0);
        if (!v5)
            goto LABEL_96c990;
        goto LABEL_96c8e4;
    }
    if (v3 >= 128)
    {
        v5 = sub_9dd520(0);
        if (!v5)
            goto LABEL_96c990;
        goto LABEL_96c8e4;
    }
    else if (v3 >= 112)
    {
        v5 = sub_9dd504(0);
        if (!v5)
            goto LABEL_96c990;
LABEL_96c8e4:
        v6 = sub_a5d168(a0->field_8->field_0, "DH", a0->field_8->field_470);
        if (v6)
        {
            if (sub_a5cf34(v6) != 1)
                goto LABEL_96c994;
            v7 = sub_a6ee78();
            if (v7)
            {
                if (!sub_a6f188(v7, "p", v5) || !sub_a6f0b0(v7, "g", 2))
                    goto LABEL_96c998;
                v8 = sub_a6f570(v7);
                if (v8)
                    sub_a5cfb0(v6, &v0, 132, v8);
            }
        }
        else
        {
            v7 = 0;
        }
    }
    else
    {
        v5 = sub_9dd4f0(0);
        if (v5)
            goto LABEL_96c8e4;
LABEL_96c990:
        v6 = 0;
LABEL_96c994:
        v7 = 0;
LABEL_96c998:
    }
    sub_a71e38();
    sub_a6eed4(v7);
    sub_a5d6b0(v6);
    sub_9e48d4(v5);
    return v0;
}
