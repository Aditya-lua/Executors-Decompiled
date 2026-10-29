/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb54c20..0xb54de8 (456 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b54c20_1 {
    long long field_0;
    char padding_8[8];
    struct st_b54c20_0 *field_10;
    char padding_18[12];
    char field_24;
    char padding_25[3];
    struct st_b54c20_0 *field_28;
    struct st_b54c20_0 *field_30;
} st_b54c20_1;

typedef struct st_b54c20_0 {
    struct st_b54c20_0 *field_0;
} st_b54c20_0;


st_b54c20_0 ** sub_b54c20(st_b54c20_1 *a0, st_b54c20_0 **a1)
{
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    st_b54c20_1 *v21;  // x22
    st_b54c20_0 **v22;  // x22
    st_b54c20_0 **v23;  // x0
    st_b54c20_0 **v24;  // x0
    st_b54c20_0 **v25;  // x0
    st_b54c20_0 **v26;  // x20
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    st_b54c20_0 **v16;  // x0
    st_b54c20_1 *v17;  // x22
    st_b54c20_0 **v18;  // x22
    st_b54c20_0 **v19;  // x0
    st_b54c20_0 **v20;  // x0
    unsigned long long v0;  // [bp-0x50]
    st_b54c20_0 **v1;  // [bp-0x44], Other Possible Types: char
    st_b54c20_0 **v2;  // [bp-0x40]
    st_b54c20_0 **v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    if (!a1)
        return 1;
    v4 = v11;
    v5 = v12;
    v6 = v13;
    v7 = v14;
    v8 = &v10;
    v9 = v15;
    if (!*a1)
        return 1;
    if ((int)a0->field_10 != 1)
    {
        v16 = sub_a6fbc4(a1, "properties");
        if (v16)
        {
            v17 = a0;
            v18 = &v17->field_30;
            sub_a6c2e4(v17->field_30, "providers/implementations/storemgmt/file_store.c", 332);
            *v18 = 0;
            v19 = sub_a71220(v16, v18, 0);
            if (!(unsigned int)v19)
                return v19;
        }
        v20 = sub_a6fbc4(a1, "input-type");
        if (v20)
        {
            v21 = a0;
            v22 = &v21->field_28;
            sub_a6c2e4(v21->field_28, "providers/implementations/storemgmt/file_store.c", 339);
            *v22 = 0;
            v23 = sub_a71220(v20, v22, 0);
            if (!(unsigned int)v23)
                return v23;
        }
    }
    if (sub_a6fbc4(a1, "expect"))
    {
        v24 = sub_a6fc2c();
        if (!(unsigned int)v24)
            return v24;
    }
    if (!sub_a6fbc4(a1, "subject"))
        return 1;
    v2 = 0;
    v3 = 0;
    if ((int)a0->field_10 != 1)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/storemgmt/file_store.c", 358, "file_set_ctx_params");
        sub_a36abc(57, 222, 0);
    }
    else if (sub_a71cdc())
    {
        v25 = sub_afa36c(0, &v3, v2);
        if (v25)
        {
            v26 = v25;
            v0 = sub_af19c4(v26, sub_9f2aec(a0->field_0), 0, &v1);
            sub_9d5b44(&a0->field_24, 9, "%08lx");
            sub_afa390(v26);
            if (v1)
                return 1;
        }
    }
    return 0;
}
