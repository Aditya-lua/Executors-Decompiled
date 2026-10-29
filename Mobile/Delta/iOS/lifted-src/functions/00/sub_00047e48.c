/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x47e48..0x4840c (1476 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_47e48_2 {
    char padding_0[8];
    struct st_47e48_2 *field_8;
} st_47e48_2;

typedef struct st_47e48_1 {
    long long field_0;
    char padding_8[12];
    int field_14;
} st_47e48_1;

typedef struct st_47e48_0 {
    char field_0;
} st_47e48_0;

extern unsigned long long g_e66708;
extern unsigned long long g_e667a8;

void sub_47e48(st_47e48_1 *a0, unsigned long a1, long long a2, unsigned long a3)
{
    unsigned long long v14;  // x26
    unsigned long long v15;  // x25
    unsigned long long v16;  // x24
    unsigned long long v17;  // x23
    unsigned long long v18;  // x22
    unsigned long long v19;  // x21
    unsigned long long v20;  // x20
    unsigned long long v21;  // x19
    unsigned long long v22;  // x30
    st_47e48_2 *v23;  // x0
    st_47e48_0 **v0;  // [bp-0x68], Other Possible Types: char
    st_47e48_0 *v1;  // [bp-0x60]
    unsigned long v2;  // [bp-0x58]
    unsigned long long v3;  // [bp-0x50]
    unsigned long long v4;  // [bp-0x48]
    unsigned long long v5;  // [bp-0x40]
    unsigned long long v6;  // [bp-0x38]
    unsigned long long v7;  // [bp-0x30]
    unsigned long long v8;  // [bp-0x28]
    unsigned long long v9;  // [bp-0x20]
    unsigned long long v10;  // [bp-0x18]
    char *v11;  // [bp-0x10]
    unsigned long long v12;  // [bp-0x8]
    char v13;  // [bp+0x0]

    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = v21;
    v11 = &v13;
    v12 = v22;
    v1 = &v0;
    v2 = a1;
    v0 = &v1;
    sub_395b0();
    if (a0->field_14 >= 2 && sub_400d8(a0, a1))
        sub_2ad10(a0->field_0, 69, 0, 0, 0);
    v23 = sub_3a7e0(a0 + 11, &v2);
    if (!v23)
    {
        goto *((void *)(g_e66708));
    }
    else if ((int)v23->field_8)
    {
        sub_437a8(a0, v2, &v23->field_8, a2);
        goto *((void *)(g_e667a8));
    }
    else
    {
        goto *((void *)(g_e66708));
    }
}
