/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4a078..0x4a204 (396 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4a078_1 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[16];
    unsigned int field_1c;
    void* field_20;
    char padding_28[8];
    void* field_30;
} st_4a078_1;

typedef struct st_4a078_0 {
    char field_0;
} st_4a078_0;

extern unsigned long long g_e67a20;
extern unsigned long long g_e67ad0;
extern unsigned int g_f00ae0;
extern unsigned int g_f00b40;
extern unsigned int g_f00bd0;
extern unsigned int g_f00be0;
extern unsigned int g_f00bf0;
extern unsigned int g_f00c10;

void sub_4a078(long long a0, st_4a078_1 *a1)
{
    unsigned long long v15;  // x28
    unsigned long long v16;  // x27
    unsigned long long v25;  // x30
    unsigned int v26;  // w8
    unsigned long long v17;  // x26
    unsigned long long v18;  // x25
    unsigned long long v19;  // x24
    unsigned long long v20;  // x23
    unsigned long long v21;  // x22
    unsigned long long v22;  // x21
    unsigned long long v23;  // x20
    unsigned long long v24;  // x19
    st_4a078_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_4a078_0 *v1;  // [bp-0x68]
    unsigned long long v2;  // [bp-0x60]
    unsigned long long v3;  // [bp-0x58]
    unsigned long long v4;  // [bp-0x50]
    unsigned long long v5;  // [bp-0x48]
    unsigned long long v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x38]
    unsigned long long v8;  // [bp-0x30]
    unsigned long long v9;  // [bp-0x28]
    unsigned long long v10;  // [bp-0x20]
    unsigned long long v11;  // [bp-0x18]
    char *v12;  // [bp-0x10]
    unsigned long long v13;  // [bp-0x8]
    char v14;  // [bp+0x0]

    v2 = v15;
    v3 = v16;
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = &v14;
    v13 = v25;
    v1 = &v0;
    v0 = &v1;
    v26 = a1->field_8;
    if (a1 && v26 == g_f00b40)
    {
        sub_3aaac(a0 + 16, &a1->field_20);
        sub_447fc(a0 + 16, &a1->field_20);
        goto *((void *)(g_e67a20));
    }
    if (a1 && v26 == g_f00ae0)
        goto *((void *)(g_e67ad0));
    if (a1 && v26 == g_f00be0)
        goto *((void *)(g_e67ad0));
    if (a1 && v26 == g_f00c10)
        goto *((void *)(g_e67ad0));
    if (a1 && v26 == g_f00bf0)
        sub_4a078(a0, a1->field_30); /* do not return */
    if (!a1)
    {
        goto *((void *)(g_e67a20));
    }
    else if (v26 == g_f00bd0)
    {
        if ((a1->field_1c & 0xfffffffe) == 14)
            sub_4a078(a0, a1->field_20); /* do not return */
        goto *((void *)(g_e67a20));
    }
    else
    {
        goto *((void *)(g_e67a20));
    }
}
