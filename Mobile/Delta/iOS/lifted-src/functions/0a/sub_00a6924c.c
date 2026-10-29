/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6924c..0xa694f4 (680 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6924c_0 {
    struct st_a6924c_0 *field_0;
    char field_1;
    char padding_2[6];
    unsigned long long field_8;
    unsigned long long field_10;
} st_a6924c_0;

extern char g_10002b0;

st_a6924c_0 * sub_a6924c(st_a6924c_0 *a0, st_a6924c_0 *a1, long long a2, long long a3)
{
    st_a6924c_0 *v12;  // x23
    st_a6924c_0 *v13;  // x0
    st_a6924c_0 *v22;  // x21
    st_a6924c_0 *v23;  // x2
    long long v24;  // x1
    st_a6924c_0 *v25;  // x22
    unsigned long long len;  // x0
    st_a6924c_0 *v27;  // x21
    st_a6924c_0 *v14;  // x20
    st_a6924c_0 *v15;  // x24
    st_a6924c_0 *v16;  // x25
    st_a6924c_0 *ptr;  // x0
    st_a6924c_0 *v18;  // x24
    st_a6924c_0 *v19;  // x8
    st_a6924c_0 *v20;  // w9
    st_a6924c_0 *v21;  // x0
    st_a6924c_0 *v0;  // [bp-0xe0]
    st_a6924c_0 *v1;  // [bp-0xd8]
    long long v2;  // [bp-0xd0]
    unsigned long v3;  // [bp-0xb8]
    char *v4;  // [bp-0xb0]
    st_a6924c_0 *v5;  // [bp-0xa8]
    st_a6924c_0 *v6;  // [bp-0x98]
    st_a6924c_0 *v7;  // [bp-0x88]
    st_a6924c_0 *v8;  // [bp-0x78]
    unsigned long v9;  // [bp-0x68]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v9 = *(long long *)&g_10002b0;
    if (a0)
    {
        v12 = a1;
        v13 = sub_a6d9b4(a2, "crypto/core_namemap.c", 318);
        if (v13)
        {
            v14 = v13;
            if (sub_a7c198(a0->field_8))
            {
                if ((char)v14->field_0)
                {
                    v15 = v14;
                    do
                    {
                        v16 = v15;
                        ptr = _strchr(v15, a3);
                        if (ptr)
                        {
                            v18 = ptr;
                            *(char *)&v18->field_0 = 0;
                            v15 = (char *)&v18->field_0 + 1;
                            if (!(char)v16->field_0)
                            {
                                sub_a368c8();
                                sub_a369bc("crypto/core_namemap.c", 342, "ossl_namemap_add_names");
                                v24 = 117;
                                v23 = 0;
LABEL_a69450:
                                sub_a36abc(15, v24, v23);
                                v12 = 0;
                                goto LABEL_a69458;
                            }
                        }
                        else
                        {
                            v15 = (char *)v16 + _strlen(v16);
                        }
                        v19 = 0;
                        v7 = (st_a6924c_0 *)0;
                        v8 = (st_a6924c_0 *)0;
                        v5 = (st_a6924c_0 *)0;
                        v6 = (st_a6924c_0 *)0;
                        v3 = 64;
                        v4 = &v5;
                        do
                        {
                            v20 = (st_a6924c_0 *)*(char *)(v16 + v19);
                        } while (v20 && (*(char *)(&v5 + v19) = (char)v20 & 223, v19 = (char *)&v19->field_0 + 1, v19 != 63));
                        v21 = sub_a63e6c(*(long long *)&a0->field_1, &v3);
                        if (v21)
                        {
                            v22 = (int)v21->field_0;
                            if ((unsigned int)v12)
                                goto LABEL_a69370;
                            goto LABEL_a692d8;
                        }
                        else
                        {
                            v22 = 0;
                            if (!(unsigned int)v12)
                            {
LABEL_a692d8:
                                v12 = v22;
                                continue;
                            }
                            else
                            {
LABEL_a69370:
                                if ((unsigned int)v22 && (unsigned int)v22 != (unsigned int)v12)
                                {
                                    sub_a368c8();
                                    sub_a369bc("crypto/core_namemap.c", 352, "ossl_namemap_add_names");
                                    v1 = v22;
                                    v2 = a2;
                                    v0 = v16;
                                    v23 = "\"%s\" has an existing different identity %d (from \"%s\")";
                                    v24 = 118;
                                    goto LABEL_a69450;
                                }
                            }
                        }
                    } while ((char)v15->field_0);
                    if (v15 > v14)
                    {
                        v25 = v14;
                        do
                        {
                            len = _strlen(v25);
                            v27 = sub_c6811c(a0, v12, v25);
                            if ((unsigned int)v12)
                            {
                                if ((unsigned int)v27 == (unsigned int)v12)
                                    continue;
                                sub_a368c8();
                                sub_a369bc("crypto/core_namemap.c", 371, "ossl_namemap_add_names");
                                v0 = v27;
                                v1 = v12;
                                v23 = "Got number %d when expecting %d";
                                v24 = 786691;
                                goto LABEL_a69450;
                            }
                            else
                            {
                                v12 = v27;
                            }
                        } while ((v25 = (char *)v25 + len + 1, v25 < v15));
                    }
                }
LABEL_a69458:
                sub_a7c1b4(a0->field_8);
                sub_a6c2e4(v14, "crypto/core_namemap.c", 381);
                goto LABEL_a69474;
            }
            else
            {
                sub_a6c2e4(v14, "crypto/core_namemap.c", 322);
            }
        }
    }
    else
    {
        sub_c68318();
    }
    v12 = 0;
LABEL_a69474:
    if (*(long long *)&g_10002b0 == v9)
        return v12;
    ___stack_chk_fail();
}
