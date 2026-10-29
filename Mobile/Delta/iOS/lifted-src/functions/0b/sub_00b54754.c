/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb54754..0xb54b84 (1072 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b54754_2 {
    char padding_0[56];
    unsigned int field_38;
} st_b54754_2;

typedef struct st_b54754_1 {
    char padding_0[48];
    long long field_30;
    unsigned long long field_38;
} st_b54754_1;

typedef struct st_b54754_0 {
    unsigned long long field_0;
    char field_8;
} st_b54754_0;

extern char g_10002b0;

unsigned long long sub_b54754(unsigned long a0, unsigned long long a1)
{
    unsigned long long v7;  // w22
    unsigned long v8;  // x21
    unsigned long long v17;  // w9
    unsigned int *v19;  // x0
    unsigned long long index;  // x0
    unsigned long long v21;  // x8
    st_b54754_1 *v22;  // x19
    unsigned long long v23;  // x1
    long long v24;  // x0
    unsigned long long idx;  // x0
    unsigned long long v26;  // w8
    unsigned long long v9;  // w0
    st_b54754_2 *v27;  // x19
    unsigned long long v29;  // x0
    unsigned long long v30;  // x8
    st_b54754_0 *v10;  // x8
    long long v12;  // x1
    unsigned long long v13;  // x8
    unsigned long long v14;  // x21
    unsigned int *v15;  // x0
    unsigned long long v16;  // w8
    unsigned long long v0;  // [bp-0xf0]
    char v1;  // [bp-0xe8]
    unsigned short v2;  // [bp-0xe4]
    uint72_t v3;  // [bp-0x48]
    unsigned long v4;  // [bp-0x38]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    sub_a36c8c();
    v7 = 0;
    if (!sub_a6e258(a1, "file:", 5))
    {
        v8 = a1 + 5;
        v9 = (unsigned int)sub_a6e258(v8, "//", 2);
        v7 = v9 != 0;
        if (v9)
        {
            v10 = &v3;
        }
        else
        {
            if (!sub_a6e258(a1 + 7, "localhost/", 10))
            {
                v13 = 0x11;
            }
            else if (sub_a6e258(a1 + 7, "/", 1))
            {
                sub_a368c8(sub_a36e70());
                sub_a369bc("providers/implementations/storemgmt/file_store.c", 231, "file_open");
                v12 = 223;
                goto LABEL_b54afc;
            }
            else
            {
                v13 = 8;
            }
            v8 = a1 + v13 - 1;
            v10 = &a1;
        }
        v10->field_8 = v10->field_8 | 1;
        v10->field_0 = v8;
    }
    v14 = a1;
    if (!((char)(a1 >> 64) & 1) || *(char *)v14 == 47)
    {
        if (_stat(v14, &v1) >> 31 & 1)
        {
            sub_a368c8();
            v15 = ___error(sub_a369bc("providers/implementations/storemgmt/file_store.c", 265, "file_open"), 265, "file_open");
            v0 = v14;
            sub_a36abc(2, *v15, "calling stat(%s)");
            v14 = 0;
        }
        v16 = !v14;
        if (v14)
            v17 = 0;
        else
            v17 = v7;
        if (v17 == 1)
        {
            v14 = *(unsigned long long *)&v3;
            if (*(char *)((void*)&v3 + 8) & 1 && *(char *)v14 != 47)
                goto LABEL_b5494c;
            if (_stat(v14, &v1) >> 31 & 1)
            {
                sub_a368c8();
                v19 = ___error(sub_a369bc("providers/implementations/storemgmt/file_store.c", 265, "file_open"), 265, "file_open");
                v0 = v14;
                sub_a36abc(2, *v19, "calling stat(%s)");
                v14 = 0;
            }
            v16 = !v14;
        }
        if (v16)
        {
            sub_a36e70();
        }
        else
        {
            sub_a36cd4();
            if ((v2 & 0xf000) == 0x4000)
            {
                index = sub_a6bffc(72, "providers/implementations/storemgmt/file_store.c", 130);
                if (index && (!a1 || (v21 = sub_a6d9b4(a1, "providers/implementations/storemgmt/file_store.c", 131), index = index, *(unsigned long long *)(index + 8) = v21, v21)))
                {
                    *(unsigned int *)(index + 16) = 1;
                    *(unsigned long *)index = a0;
                    v22 = index;
                    v23 = v14;
                    v24 = sub_a6d858(index + 24, v23);
                    v22->field_30 = v24;
                    idx = v22;
                    v26 = *(int *)___error(v24, v23);
                    *(unsigned int *)&v22->field_38 = v26;
                    if (v22->field_30)
                    {
                        if (*(long long *)&g_10002b0 == v4)
                            return idx;
                        ___stack_chk_fail();
                    }
                    else if (v26)
                    {
                        v27 = idx;
                        sub_a368c8();
                        sub_a369bc("providers/implementations/storemgmt/file_store.c", 184, "file_open_dir");
                        v0 = v14;
                        sub_a36abc(2, v27->field_38, "Calling OPENSSL_DIR_read(\"%s\")");
                        sub_b554bc(v27);
                    }
                    else
                    {
                        *(unsigned int *)(idx + 32) = 1;
                        if (*(long long *)&g_10002b0 == v4)
                            return idx;
                        ___stack_chk_fail();
                    }
                }
                else
                {
                    sub_a368c8(sub_b55578());
                    sub_a369bc("providers/implementations/storemgmt/file_store.c", 176, "file_open_dir");
                    v12 = 524345;
LABEL_b54afc:
                    sub_a36abc(57, v12, 0);
                }
            }
            else
            {
                v29 = sub_9d8180(v14, "rb");
                if (v29)
                {
                    idx = sub_a6bffc(72, "providers/implementations/storemgmt/file_store.c", 130);
                    if (idx && (!a1 || !(v30 = sub_a6d9b4(a1, "providers/implementations/storemgmt/file_store.c", 131), idx = idx, *(unsigned long long *)(idx + 8) = v30, !v30)))
                    {
                        *(unsigned int *)(idx + 16) = 0;
                        *(unsigned long *)idx = a0;
                        *(unsigned long long *)(idx + 24) = v29;
                        if (*(long long *)&g_10002b0 == v4)
                            return idx;
                        ___stack_chk_fail();
                    }
                    sub_a368c8(sub_b55578());
                    sub_a369bc("providers/implementations/storemgmt/file_store.c", 159, "file_open_stream");
                    sub_a36abc(57, 0x80039, 0);
                }
                sub_9d5018();
            }
        }
    }
    else
    {
LABEL_b5494c:
        sub_a368c8(sub_a36e70());
        sub_a369bc("providers/implementations/storemgmt/file_store.c", 259, "file_open");
        v0 = v14;
        sub_a36abc(57, 219, "Given path=%s");
    }
    if (*(long long *)&g_10002b0 == v4)
        return 0;
    ___stack_chk_fail();
}
