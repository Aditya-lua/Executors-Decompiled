/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9f558..0xa9f8e8 (912 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a9f558_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
    char field_c;
    char padding_d[3];
    char field_10;
    char padding_11[3];
    char field_14;
    char field_15;
    char field_16;
    char field_17;
} st_a9f558_0;

extern char g_10002b0;

unsigned long long sub_a9f558(long long a0, long long a1, unsigned long long a2, unsigned long long a3, long long a4, long long a5, long long a6)
{
    long long v11;  // x19
    unsigned long long v12;  // x0
    unsigned long long v21;  // x22
    unsigned int v22;  // w0
    unsigned int v13;  // w23
    unsigned long long v14;  // x8
    unsigned long long v15;  // x20
    st_a9f558_0 *v16;  // x21
    unsigned long long v17;  // x0
    char v18;  // x19
    unsigned long long v19;  // x8
    unsigned long long v20;  // x25
    long long v0;  // [bp-0x4a8]
    unsigned long long v1;  // [bp-0x4a0]
    unsigned int v2;  // [bp-0x494]
    unsigned long long v3;  // [bp-0x490], Other Possible Types: unsigned long
    char v4;  // [bp-0x484]
    unsigned long long v5;  // [bp-0x47f]
    unsigned long long v6;  // [bp-0x478]
    char v7;  // [bp-0x470]
    unsigned long v8;  // [bp-0x70]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = a0;
    v8 = *(long long *)&g_10002b0;
    v12 = sub_a9f8e8(0);
    if (!(v12 >> 31 & 1))
    {
        v13 = v12;
        if (a2)
            v14 = 40;
        else
            v14 = 24;
        v15 = v12 + v14;
        v3 = sub_a6bf4c();
        if (v3)
        {
            v16 = v3;
            v17 = sub_a4bc70();
            if (!v17)
            {
                v20 = 0;
                goto LABEL_a9f814;
            }
            v0 = v11;
            v1 = v17;
            v18 = a2 != 0;
            v16->field_0 = (unsigned int)(1.4647632176e-314 >> 0);
            *(unsigned int *)v16->padding_4 = 0;
            if (sub_9c7b68(a1) == 6)
                v19 = 1;
            else
                v19 = 2;
            *(char *)&v16->field_8 = v19;
            *(unsigned short *)((char *)&v16->field_8 + 1) = 0;
            *((char *)&v16->field_8 + 3) = 0;
            *((char *)&v16->field_8 + 4) = v18;
            *(unsigned short *)((char *)&v16->field_8 + 5) = 0;
            *((char *)&v16->field_8 + 7) = 0;
            v16->field_c = v18 * 16;
            *(unsigned short *)&v16->padding_d[0] = 0;
            v16->padding_d[2] = 0;
            v16->field_10 = v13;
            v16->padding_11[0] = v13 >> 8;
            v16->padding_11[1] = v13 >> 16;
            v16->padding_11[2] = v13 >> 24;
            v3 = &v16->field_14;
            if (!a2)
            {
                sub_a9f8e8(&v3, a1, 0);
                v21 = v16;
                goto LABEL_a9f6f8;
            }
            if ((int)sub_aa8658(a5, v3, 16, 0) >= 1)
            {
                v3 = (char *)&v16[1].field_8 + 4;
                sub_a9f8e8(&v3, a1, 0);
                if (a3)
                    a3();
                if ((int)sub_a9be54(&v7, 0x400, 1, a4) > 0)
                {
                    if (!sub_a9fe80(&v4, v3, 16, &v7))
                        goto LABEL_a9f800;
                    v20 = sub_a4e104(a5, "RC4", a6);
                    v11 = v0;
                    if (v20)
                    {
                        if (a2 == 1)
                        {
                            v6 = 0;
                            v5 = 0;
                        }
                        v3 = &v16[1].field_10;
                        if (!sub_a4d02c(v1, v20, 0, &v4, 0) || (sub_a66ec0(&v4, 20), !sub_c672c8(v1, v3, &v2, v3, v13 - 8) || !sub_a4ca24(v1, v3 + v2, &v2)))
                            goto LABEL_a9f80c;
                        v21 = v16;
                    }
                    else
                    {
LABEL_a9f80c:
LABEL_a9f810:
                        v21 = 0;
LABEL_a9f814:
                        v15 = 0xffffffff;
                    }
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/pem/pvkfmt.c", 1091, "i2b_PVK");
                    sub_a36abc(9, 104, 0);
LABEL_a9f800:
                    v20 = 0;
                    v11 = v0;
                    goto LABEL_a9f810;
                }
            }
            else
            {
                v21 = 0;
                v15 = 0xffffffff;
                v20 = 0;
LABEL_a9f6f8:
                v11 = v0;
            }
            sub_a4bca0();
            sub_a4bbe4(v20);
            if (!v21)
            {
                sub_a6c2e4(v16, "crypto/pem/pvkfmt.c", 1124);
                if (!(v15 >> 31 & 1))
                {
LABEL_a9f848:
                    v22 = sub_9d3fec(v11, v21, v15);
                    sub_a6c2e4(v21, "crypto/pem/pvkfmt.c", 1140);
                    if (v22 != (unsigned int)v15)
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/pem/pvkfmt.c", 1144, "i2b_PVK_bio_ex");
                        sub_a36abc(9, 118, 0);
                    }
                    else
                    {
                        if (*(long long *)&g_10002b0 == v8)
                            return v15;
                        ___stack_chk_fail();
                    }
                }
            }
            else if (!(v15 >> 31 & 1))
            {
                goto LABEL_a9f848;
            }
        }
    }
    if (*(long long *)&g_10002b0 == v8)
        return 0xffffffff;
    ___stack_chk_fail();
}
