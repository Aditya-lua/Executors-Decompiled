/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa31490..0xa318f8 (1128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a31490_0 {
    unsigned long long field_0[2];
    char field_8;
    char padding_9[7];
    unsigned long long field_10;
} st_a31490_0;

extern unsigned long long g_f127f8;

int sub_a31490(unsigned long a0, long long a1)
{
    long long v9;  // x24
    unsigned long v10;  // x0
    unsigned long v19;  // x25
    unsigned long v20;  // x21
    st_a31490_0 *v21;  // x0
    st_a31490_0 *v22;  // x27
    unsigned long v23;  // x19
    unsigned long ptr;  // x0
    unsigned long v25;  // x24
    unsigned long v26;  // x0
    unsigned long v27;  // x1
    unsigned long v28;  // x2
    unsigned long v11;  // x25
    unsigned long v29;  // x0
    unsigned long long v30;  // 4118
    unsigned long v31;  // x0
    unsigned long v12;  // x20
    unsigned long long *v13;  // x0
    unsigned long v14;  // x26
    unsigned long ptr1;  // x21
    unsigned long v16;  // x0
    unsigned long v17;  // x28
    unsigned long v18;  // x20
    uint128_t v0;  // [bp-0xa0]
    unsigned long v1;  // [bp-0x90]
    unsigned long v2;  // [bp-0x80]
    long long v3;  // [bp-0x78]
    unsigned int v4;  // [bp-0x70]
    unsigned int v5;  // [bp-0x6c]
    unsigned long v6;  // [bp-0x68]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v9 = a1;
    v10 = sub_9f4bd0(v9, sub_c4ba8());
    if (!v10)
    {
        sub_a368c8();
        sub_a369bc("crypto/engine/eng_cnf.c", 157, "int_engine_module_init");
        sub_a36abc(38, 148, 0);
        return 0;
    }
    v11 = v10;
    if ((int)sub_ad69e4() < 1)
        return 1;
    v12 = 0;
    v2 = v11;
    v3 = v9;
    do
    {
        v13 = sub_ad69f8(v11, v12);
        v14 = v13[2];
        v6 = 0xffffffffffffffff;
        ptr1 = _strchr(v13[1], 46);
        v16 = sub_9f4bd0(v9, v14);
        if (!v16)
        {
            sub_a368c8();
            sub_a369bc("crypto/engine/eng_cnf.c", 60, "int_engine_configure");
            sub_a36abc(38, 149, 0);
            return 0;
        }
        v17 = v16;
        v4 = v12;
        if ((int)sub_ad69e4() >= 1)
        {
            v5 = 0;
            v18 = 0;
            v19 = 0;
            if (!ptr1)
                v20 = v13[1];
            else
                v20 = ptr1 + 1;
            do
            {
                v21 = sub_ad69f8(v17, v19);
                v22 = v21;
                v23 = v21->field_0[1];
                ptr = _strchr(v21->field_0[1], 46);
                if (ptr)
                    v23 = ptr + 1;
                v25 = *(long long *)&v22->field_8;
                if (!_strcmp())
                {
                    v20 = v25;
                    continue;
                }
                if (_strcmp(v23, "soft_load"))
                {
                    if (_strcmp(v23, "dynamic_path"))
                    {
                        if (!v18)
                        {
                            v18 = sub_a33a3c(v20);
                            if (!v18 && v5)
                            {
                                sub_a35af4();
                                v11 = v2;
                                v9 = v3;
                                goto LABEL_a31794;
                            }
                            if (!v18)
                                goto LABEL_a31858;
                        }
                        if (!_strcmp(v25, "EMPTY"))
                            v25 = 0;
                        if (_strcmp())
                        {
                            if (_strcmp(v23, "default_algorithms"))
                            {
                                v26 = v18;
                                v27 = v23;
                                v28 = v25;
                                goto LABEL_a316a8;
                            }
                            else if (sub_a32950(v18, v25))
                            {
                                continue;
                            }
                        }
                        else
                        {
                            if (sub_9f4cec(v3, v14, "init", &v6))
                            {
                                if (!v6)
                                    continue;
                                if (v6 != 1)
                                {
                                    sub_a368c8();
                                    sub_a369bc("crypto/engine/eng_cnf.c", 118, "int_engine_configure");
                                    sub_a36abc(38, 151, 0);
                                }
                                else if (sub_a32d54(v18))
                                {
                                    v29 = g_f127f8;
                                    if (v29 || (v29 = sub_ad61b4(0), g_f127f8 = v29, v29))
                                    {
                                        if (sub_ad68a0(v29, v18))
                                            continue;
                                    }
                                    sub_a32e7c(v18);
                                }
                            }
                        }
LABEL_a31858:
                        sub_a368c8();
                        sub_a369bc("crypto/engine/eng_cnf.c", 138, "int_engine_configure");
                        v1 = *(long long *)&v22->field_8;
                        v0 = (uint128_t)v22->field_0;
                        sub_a36abc(38, 0x66, "section=%s, name=%s, value=%s");
                        sub_a330d4(v18);
                        return 0;
                    }
                    v18 = sub_a33a3c("dynamic");
                    if (!v18 || !sub_a31c3c(v18, "SO_PATH", v25, 0) || !sub_a31c3c(v18, "LIST_ADD", "2", 0))
                        goto LABEL_a31858;
                    v26 = v18;
                    v27 = "LOAD";
                    v28 = 0;
LABEL_a316a8:
                    if (sub_a31c3c(v26, v27, v28, 0))
                        continue;
                    goto LABEL_a31858;
                }
                else
                {
                    v5 = 1;
                }
            } while ((v19 = (unsigned int)v19 + 1, (int)sub_ad69e4(v17) > (int)v19));
            if (v18)
            {
                v30 = arm64g_calculate_condition(18, v6, 1, 0);
                v11 = v2;
                v9 = v3;
                if (v30 & 1)
                    goto LABEL_a3178c;
                if (sub_a32d54(v18))
                {
                    v31 = g_f127f8;
                    if (v31 || (v31 = sub_ad61b4(0), g_f127f8 = v31, v31))
                    {
                        v11 = v2;
                        v9 = v3;
                        if (sub_ad68a0(v31, v18))
                            goto LABEL_a3178c;
                    }
                    sub_a32e7c(v18);
                }
                sub_a368c8();
                sub_a369bc("crypto/engine/eng_cnf.c", 0x88, "int_engine_configure");
                sub_a36abc(38, 0x66, 0);
                sub_a330d4(v18);
                return 0;
            }
            v11 = v2;
            v9 = v3;
        }
        else
        {
            v18 = 0;
        }
LABEL_a3178c:
        sub_a330d4(v18);
LABEL_a31794:
        v12 = v4 + 1;
    } while ((int)v12 < (int)sub_ad69e4(v11));
    return 1;
}
