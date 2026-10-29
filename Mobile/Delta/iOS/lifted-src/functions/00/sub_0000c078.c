/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc078..0xc294 (540 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c078_1 {
    struct st_c078_0 *field_0;
    unsigned long long field_8;
    unsigned int field_10;
} st_c078_1;

typedef struct st_c078_0 {
    char field_0;
} st_c078_0;

extern unsigned long long g_e61b20;
extern unsigned long long g_e61b28;
extern unsigned long long g_e61b30;
extern unsigned long long g_e61b50;

long long sub_c078(st_c078_1 *a0)
{
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long v16;  // x10
    unsigned long long *v18;  // x11
    st_c078_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_c078_0 *v1;  // [bp-0x48]
    st_c078_0 **v2;  // [bp-0x40], Other Possible Types: char
    st_c078_0 *v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    v4 = v11;
    v5 = v12;
    v6 = v13;
    v7 = v14;
    v8 = &v10;
    v9 = v15;
    v1 = &v0;
    v0 = &v1;
    v16 = a0->field_10 + 1;
    a0->field_10 = v16;
    v3 = &v2;
    v2 = &v3;
    if (a0->field_8 > v16)
    {
        switch (*(char *)&a0->field_0[v16])
        {
        case 0:
            goto *((void *)(g_e61b28));
        case 122:
            goto *((void *)(g_e61b30));
        case 13:
            v18 = &g_e61b20;
            break;
        default:
            v18 = &g_e61b50;
            break;
        }
        goto *((void *)(*v18));
    }
    else
    {
        goto *((void *)(g_e61b28));
    }
}
