/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xed8c..0xef54 (456 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ed8c_2 {
    char padding_0[132];
    unsigned int field_84;
} st_ed8c_2;

typedef struct st_ed8c_3 {
    char padding_0[4];
    unsigned int field_4;
} st_ed8c_3;

typedef struct st_ed8c_0 {
    char field_0;
} st_ed8c_0;

typedef struct st_ed8c_1 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
} st_ed8c_1;

extern char g_c7c2eb;

char * sub_ed8c(st_ed8c_2 *a0, long long a1, st_ed8c_1 *a2, unsigned long a3)
{
    unsigned long v15;  // x20
    st_ed8c_3 *v16;  // x25
    unsigned long long v17;  // x23
    unsigned long long v18;  // x24
    unsigned long long v19;  // x0
    unsigned long v20;  // x8
    unsigned long long v21;  // x0
    unsigned long v22;  // x8
    unsigned long long v0;  // [bp-0x100]
    unsigned long long v1;  // [bp-0xf8]
    unsigned long v2;  // [bp-0xf0]
    unsigned long long v3;  // [bp-0xe8]
    unsigned long v4;  // [bp-0xe0]
    st_ed8c_0 **v5;  // [bp-0xd0], Other Possible Types: char
    st_ed8c_0 *v6;  // [bp-0xc8]
    unsigned long v7;  // [bp-0xc0]
    unsigned long v8;  // [bp-0xb8]
    unsigned long v9;  // [bp-0xb0]
    unsigned long v10;  // [bp-0xa8]
    char v11;  // [bp-0x98]
    char v12;  // [bp-0x78]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v15 = a3;
    v6 = &v5;
    v5 = &v6;
    v9 = 0;
    v10 = 0;
    sub_9f8c(&v11, &v9, a1);
    sub_b814(&v11);
    v7 = 0;
    v8 = 0;
    sub_9f8c(&v11, &v7, a2->field_0);
    sub_b814(&v11);
    v16 = &a0->padding_0[128];
    v17 = sub_a0c8(&v12);
    v18 = sub_a0c8(&v9);
    if (a0->field_84 == a2->field_4)
    {
        sub_b814(v16);
        v19 = sub_a0c8(&v11);
        v20 = &g_c7c2eb;
        if (!v15)
            v15 = v20;
        v3 = v19;
        v4 = v15;
        v1 = v18;
        v2 = a2->field_8 + 1;
        v0 = v17;
        sub_1db64();
    }
    else
    {
        sub_b814(v16);
        v21 = sub_a0c8(&v11);
        v22 = &g_c7c2eb;
        if (!v15)
            v15 = v22;
        v3 = v21;
        v4 = v15;
        v1 = v18;
        v2 = a2->field_4 + 1;
        v0 = v17;
        sub_1db64();
    }
    return &v12;
}
