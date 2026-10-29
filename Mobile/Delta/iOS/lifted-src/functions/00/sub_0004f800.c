/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4f800..0x4f8a4 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4f800_1 {
    char padding_0[16];
    long long field_10;
} st_4f800_1;

typedef struct st_4f800_2 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    double field_10;
} st_4f800_2;

typedef struct st_4f800_0 {
    char field_0;
} st_4f800_0;

extern unsigned long long g_e68448;
extern unsigned long long g_e68458;

void sub_4f800(st_4f800_1 *a0, unsigned long a1, unsigned long long *a2)
{
    unsigned long long v8;  // x20
    unsigned long long v9;  // x19
    unsigned long long v10;  // x30
    st_4f800_2 *v11;  // x0
    st_4f800_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_4f800_0 *v1;  // [bp-0x30]
    unsigned long v2;  // [bp-0x28]
    unsigned long long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    v3 = v8;
    v4 = v9;
    v5 = &v7;
    v6 = v10;
    v1 = &v0;
    v2 = a1;
    v0 = &v1;
    v11 = sub_3a7e0(a0->field_10, &v2);
    if (!v11)
    {
        goto *((void *)(g_e68448));
    }
    else if (v11->field_8 == 3)
    {
        *(double *)a2 = v11->field_10;
        goto *((void *)(g_e68458));
    }
    else
    {
        goto *((void *)(g_e68448));
    }
}
