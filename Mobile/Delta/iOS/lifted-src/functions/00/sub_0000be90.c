/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe90..0xbfd0 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_be90_3 {
    struct st_be90_0 *field_0;
    unsigned long long field_8;
    unsigned int field_10;
    unsigned int field_14;
    unsigned int field_18;
} st_be90_3;

typedef struct st_be90_1 {
    struct st_be90_2 *field_0;
} st_be90_1;

typedef struct st_be90_2 {
    struct st_be90_1 *field_0;
} st_be90_2;

typedef struct st_be90_0 {
    char field_0;
} st_be90_0;

extern unsigned long long g_e61518;
extern unsigned long long g_e61520;

void sub_be90(st_be90_3 *a0, unsigned long a1, unsigned int a2)
{
    unsigned long long v13;  // x24
    unsigned long long v14;  // x23
    unsigned int v23;  // w8
    unsigned long long v15;  // x22
    unsigned long long v16;  // x21
    unsigned long long v17;  // x20
    unsigned long long v18;  // x19
    unsigned long long v19;  // x30
    unsigned long long v20;  // x24
    unsigned long v21;  // x8
    unsigned long v22;  // x8
    st_be90_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_be90_0 *v1;  // [bp-0x70]
    st_be90_2 **v2;  // [bp-0x68]
    st_be90_2 **v3;  // [bp-0x48]
    unsigned long long v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x38]
    unsigned long long v6;  // [bp-0x30]
    unsigned long long v7;  // [bp-0x28]
    unsigned long long v8;  // [bp-0x20]
    unsigned long long v9;  // [bp-0x18]
    char *v10;  // [bp-0x10]
    unsigned long long v11;  // [bp-0x8]
    char v12;  // [bp+0x0]

    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = v16;
    v8 = v17;
    v9 = v18;
    v10 = &v12;
    v11 = v19;
    v1 = &v0;
    v0 = &v1;
    if (a2)
        v20 = g_e61520;
    else
        v20 = g_e61518;
    v2 = &v3;
    v3 = &v2;
    v21 = a0->field_10;
    if (v21 < a0->field_8)
        goto LABEL_bf10;
LABEL_befc:
    if (sub_9e8c(0))
    {
        do
        {
            v2 = &v3;
            v3 = &v2;
            v22 = a0->field_10;
            if (*(char *)&a0->field_0[v22] == 10)
            {
                v23 = (unsigned int)v22 + 1;
                a0->field_14 = a0->field_14 + 1;
                a0->field_18 = v23;
            }
            else
            {
                v23 = (unsigned int)v22 + 1;
            }
            a0->field_10 = v23;
            v2 = &v3;
            v3 = &v2;
            v21 = v23;
            if (v21 >= a0->field_8)
                goto LABEL_befc;
LABEL_bf10:
        } while (sub_9e8c(*(char *)&a0->field_0[v21]));
    }
    goto *((void *)(v20));
}
