/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96418c..0x9643e4 (600 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96418c_0 {
    long long field_0;
    struct st_96418c_1 *field_8;
} st_96418c_0;

typedef struct st_96418c_2 {
    char padding_0[1];
    char field_1;
    char padding_2[6];
    struct st_96418c_0 *field_8;
    char padding_10[8];
    struct st_96418c_1 *field_18;
} st_96418c_2;

typedef struct st_96418c_3 {
    char padding_0[64];
    unsigned long long field_40;
} st_96418c_3;

typedef struct st_96418c_1 {
    char padding_0[64];
    unsigned long long field_40;
    unsigned long long field_48;
} st_96418c_1;


long long sub_96418c(st_96418c_2 *a0, st_96418c_2 *a1, st_96418c_2 *a2, st_96418c_2 *a3)
{
    unsigned long long v17;  // x26
    unsigned long long v18;  // x25
    long long v27;  // x1
    st_96418c_2 *v28;  // x2
    st_96418c_0 *v29;  // x23
    long long v30;  // x0
    st_96418c_2 *v31;  // x0
    st_96418c_2 *v32;  // x20
    st_96418c_3 *v33;  // x24
    st_96418c_2 *v35;  // w23
    st_96418c_2 *v36;  // w25
    unsigned long long v19;  // x24
    st_96418c_2 *v37;  // x22
    st_96418c_2 *v38;  // w8
    st_96418c_2 *v39;  // w21
    unsigned long long v20;  // x23
    unsigned long long v21;  // x22
    unsigned long long v22;  // x21
    unsigned long long v23;  // x20
    unsigned long long v24;  // x19
    unsigned long long v25;  // x30
    st_96418c_2 *v26;  // w19
    unsigned long long v0;  // [bp-0x80]
    unsigned long v1;  // [bp-0x78]
    unsigned long v2;  // [bp-0x70]
    st_96418c_2 *v3;  // [bp-0x68]
    char v4;  // [bp-0x60]
    st_96418c_2 *v5;  // [bp-0x58]
    unsigned long long v6;  // [bp-0x50]
    unsigned long long v7;  // [bp-0x48]
    unsigned long long v8;  // [bp-0x40]
    unsigned long long v9;  // [bp-0x38]
    unsigned long long v10;  // [bp-0x30]
    unsigned long long v11;  // [bp-0x28]
    unsigned long long v12;  // [bp-0x20]
    unsigned long long v13;  // [bp-0x18]
    char *v14;  // [bp-0x10]
    unsigned long long v15;  // [bp-0x8]
    char v16;  // [bp+0x0]

    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = v21;
    v11 = v22;
    v12 = v23;
    v13 = v24;
    v14 = &v16;
    v15 = v25;
    v26 = a3;
    v5 = a2;
    if (!a0 && !a1)
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_mcnf.c", 36, "ssl_do_config");
        v27 = 786690;
        v28 = 0;
        goto LABEL_9641e4;
    }
    else
    {
        v29 = a1;
        if (!a2 && v26)
        {
            a2 = "system_default";
            v5 = "system_default";
        }
        if (sub_9f5f24(a2, &v4))
        {
            v30 = sub_9f5f00(v4, &v5, &v3);
            v31 = sub_95c958(v30, &v5, &v3);
            v32 = v31;
            if (v31)
            {
                if (a0)
                {
                    v33 = a0->field_18;
                    sub_95cbf4(v32, a0);
                    v29 = a0->field_8;
                }
                else
                {
                    v33 = v29->field_8;
                    sub_95ccec(v32, v29);
                }
                v35 = (st_96418c_2 *)(!sub_a68564(v29->field_0));
                sub_95cbe0();
                v31 = sub_a68148(v29->field_0);
                if (v3)
                {
                    v36 = (st_96418c_2 *)0;
                    v37 = 0;
                    do
                    {
                        sub_9f5fa0(v30, v37, &v2, &v1);
                        if (1 > (int)sub_95c58c(v32, v2, v1))
                            v36 = &v36->field_1;
                    } while ((v37 = &v37->field_1, v37 < v3));
                }
                else
                {
                    v36 = (st_96418c_2 *)0;
                }
                if (sub_95c96c(v32))
                    v38 = (st_96418c_2 *)0;
                else
                    v38 = 0xffffffff;
                v39 = (st_96418c_2 *)(v36 == v38);
            }
            else
            {
                v39 = (st_96418c_2 *)0;
                v26 = (st_96418c_2 *)0;
                v35 = (st_96418c_2 *)1;
            }
        }
        else if (v26)
        {
            v39 = (st_96418c_2 *)0;
            v32 = 0;
            v31 = 0;
            v35 = (st_96418c_2 *)1;
            v26 = (st_96418c_2 *)1;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("ssl/ssl_mcnf.c", 44, "ssl_do_config");
            v0 = a2;
            v28 = "name=%s";
            v27 = 113;
LABEL_9641e4:
            sub_a36abc(20, v27, v28);
            v39 = (st_96418c_2 *)0;
            v32 = 0;
            v31 = 0;
            v35 = (st_96418c_2 *)1;
        }
    }
    sub_a68148(v31);
    sub_95cb34(v32);
    if (!v26)
        v35 = (st_96418c_2 *)0;
    return v39 | v35;
}
