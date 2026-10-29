/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9f0d8..0xa9f524 (1100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a9f0d8_0 {
    unsigned long long field_0;
    unsigned int field_8;
} st_a9f0d8_0;

extern char g_10002b0;

unsigned long long sub_a9f0d8(long long a0, unsigned long long a1, long long a2, long long a3, long long a4, long long a5, long long a6)
{
    unsigned long v15;  // x28
    unsigned long long v16;  // x19
    st_a9f0d8_0 *v25;  // x21
    unsigned int *v26;  // x21
    unsigned long long v17;  // x0
    unsigned long v18;  // x20
    unsigned long long v19;  // x25
    unsigned long long v20;  // x0
    unsigned long long v21;  // x22
    unsigned long long v22;  // x26
    long long v23;  // x21
    long long v24;  // x23
    unsigned int v0;  // [bp-0x4c8]
    unsigned int v1;  // [bp-0x4c4]
    char v2;  // [bp-0x4c0], Other Possible Types: unsigned int
    unsigned int v3;  // [bp-0x4bc]
    char *v4;  // [bp-0x4b8], Other Possible Types: unsigned long long
    unsigned int v5;  // [bp-0x4ac]
    unsigned long long *v6;  // [bp-0x4a8], Other Possible Types: unsigned long
    char v7;  // [bp-0x49c]
    char v8;  // [bp-0x484]
    char v9;  // [bp-0x84]
    unsigned long long v10;  // [bp-0x7f]
    unsigned long long v11;  // [bp-0x78]
    unsigned long v12;  // [bp-0x70]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v12 = *(long long *)&g_10002b0;
    if (sub_9d3d84() == 24)
    {
        v4 = &v7;
        if (sub_a9eed0(&v4, 24, 0, a3, &v3, &v2))
        {
            v15 = v3;
            v1 = v2;
            v16 = v15 + v1;
            v17 = sub_a6bf4c(v16, "crypto/pem/pvkfmt.c", 968);
            if (v17)
            {
                v18 = v17;
                v4 = v17;
                if (sub_9d3d84(a0, v18, v16) == (unsigned int)v16)
                {
                    v6 = v18;
                    v19 = sub_a4bc70();
                    if (!v19)
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/pem/pvkfmt.c", 870, "do_PVK_body_key");
                        sub_a36abc(9, 0x80006, 0);
                        v21 = 0;
                        v17 = 0;
                        v22 = 0;
                        goto LABEL_a9f364;
                    }
                    if (!(unsigned int)v15)
                    {
                        v21 = 0;
                        v22 = 0;
                        goto LABEL_a9f2f4;
                    }
                    if (a1)
                        a1();
                    v20 = sub_a9be54(&v8, 0x400, 0, a2);
                    if (v20 >> 31 & 1)
                    {
                        v21 = 0;
                        v22 = 0;
                        v23 = 104;
                        v24 = 886;
                        goto LABEL_a9f334;
                    }
                    v21 = sub_a6bf4c(v1 + 8, "crypto/pem/pvkfmt.c", 889);
                    if (v21 && sub_a9fe80(&v9, v18, v15, &v8, v20, a5, a6))
                    {
                        v6 = v18 + v15;
                        if (8 > v1)
                        {
                            v22 = 0;
                            v23 = 125;
                            v24 = 897;
                            goto LABEL_a9f334;
                        }
                        else
                        {
                            v0 = v1 - 8;
                            v25 = v21;
                            v25->field_0 = *v6;
                            v26 = &v25->field_8;
                            v6 += 1;
                            v22 = sub_a4e104(a5, "RC4", a6);
                            if (v22 && sub_a4d058(v19, v22, 0, &v9, 0) && sub_a4c6b0(v19, v26, &v5, v6, v0) && sub_a4cc84(v19, (char *)v26 + v5, &v5))
                            {
                                if (*v26 == 843141970 || *v26 == 844321604)
                                {
LABEL_a9f490:
                                    v6 = v21;
LABEL_a9f2f4:
                                    v17 = sub_a9e79c(&v6, v1, a3, a4);
LABEL_a9f364:
                                    sub_a4bca0(v19);
                                    sub_a4bbe4(v22);
                                    if (v21)
                                    {
                                        sub_a66ec0(&v9, 20);
                                        sub_a6c2e4(v21, "crypto/pem/pvkfmt.c", 944);
                                        sub_a6c4e8(v18, v16, "crypto/pem/pvkfmt.c", 979);
                                        if (*(long long *)&g_10002b0 == v12)
                                            return v17;
                                        ___stack_chk_fail();
                                    }
                                    else
                                    {
                                        sub_a6c4e8(v18, v16, "crypto/pem/pvkfmt.c", 979);
                                        if (*(long long *)&g_10002b0 == v12)
                                            return v17;
                                        ___stack_chk_fail();
                                    }
                                }
                                v11 = 0;
                                v10 = 0;
                                if (sub_a4d058(v19, v22, 0, &v9, 0) && sub_a4c6b0(v19, v26, &v5, v6, v0) && sub_a4cc84(v19, (char *)v26 + v5, &v5))
                                {
                                    if (*v26 == 843141970 || *v26 == 844321604)
                                        goto LABEL_a9f490;
                                    v23 = 101;
                                    v24 = 925;
LABEL_a9f334:
                                    sub_a368c8();
                                    sub_a369bc("crypto/pem/pvkfmt.c", v24, "do_PVK_body_key");
                                    sub_a36abc(9, v23, 0);
                                }
                            }
                        }
                    }
                    else
                    {
                        v22 = 0;
                    }
                    v17 = 0;
                    goto LABEL_a9f364;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/pem/pvkfmt.c", 973, "do_PVK_key_bio");
                    sub_a36abc(9, 124, 0);
                    sub_a6c4e8(v18, v16, "crypto/pem/pvkfmt.c", 979);
                    if (*(long long *)&g_10002b0 == v12)
                        return 0;
                    ___stack_chk_fail();
                }
            }
            else
            {
                if (*(long long *)&g_10002b0 == v12)
                    return v17;
                ___stack_chk_fail();
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/pem/pvkfmt.c", 960, "do_PVK_key_bio");
        sub_a36abc(9, 124, 0);
    }
    if (*(long long *)&g_10002b0 == v12)
        return 0;
    ___stack_chk_fail();
}
