/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fc9fc..0x9fcb74 (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9fc9fc_1 {
    char padding_0[8];
    unsigned long long field_8;
} st_9fc9fc_1;

typedef struct st_9fc9fc_2 {
    char padding_0[8];
    struct st_9fc9fc_3 *field_8;
} st_9fc9fc_2;

typedef struct st_9fc9fc_3 {
    unsigned int field_0;
} st_9fc9fc_3;

typedef struct st_9fc9fc_0 {
    char padding_0[112];
    struct st_9fc9fc_0 *field_70;
} st_9fc9fc_0;

extern unsigned int g_e8d220;

st_9fc9fc_0 * sub_9fc9fc(st_9fc9fc_2 *a0, long long a1)
{
    st_9fc9fc_0 *v8;  // w0
    st_9fc9fc_0 *v9;  // x19
    st_9fc9fc_0 *v10;  // x21
    st_9fc9fc_0 *v11;  // x0
    long long v12;  // x20
    long long v13;  // x22
    char v0;  // [bp-0x58]
    st_9fc9fc_1 *v1;  // [bp-0x50]
    char v2;  // [bp-0x48], Other Possible Types: unsigned int
    char v3;  // [bp-0x44]
    unsigned long v4;  // [bp-0x40]
    char v5;  // [bp-0x38]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = (st_9fc9fc_0 *)(unsigned int)sub_afbf08(0, &v5, &v3, &v0, a1);
    if (!v8)
        return v8;
    sub_9cf830(0, &v2, &v1, v0);
    if (v2 == 16)
    {
        v4 = v1->field_8;
        if (a0->field_8 != &g_e8d220)
        {
            v9 = sub_9fd45c(0);
            if (!v9)
                goto LABEL_9fcafc;
LABEL_9fca88:
            v10 = sub_9cf104(0, &v5, v3);
            if (v10)
            {
                v11 = sub_9c1c08(v10, 0);
                v9->field_70 = v11;
                if (v11)
                {
                    sub_9cf124(v10);
                    sub_a5ab14(a0, *(int *)a0->field_8, v9);
                    return 1;
                }
                v12 = 109;
                v13 = 97;
            }
            else
            {
                v12 = 104;
                v13 = 91;
            }
        }
        else
        {
            v9 = sub_9fd474(0);
            if (v9)
                goto LABEL_9fca88;
LABEL_9fcafc:
            v10 = 0;
            v12 = 104;
            v13 = 86;
        }
    }
    else
    {
        v10 = 0;
        v9 = 0;
        v12 = 105;
        v13 = 77;
    }
    sub_a368c8();
    sub_a369bc("crypto/dh/dh_ameth.c", v13, "dh_pub_decode");
    sub_a36abc(5, v12, 0);
    sub_9cf124(v10);
    sub_9ffb3c(v9);
    return 0;
}
