/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c72b4..0x3c73a0 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c72b4_1 {
    char padding_0[8];
    struct st_3c72b4_2 *field_8;
    unsigned long long field_10;
    char padding_18[16];
    unsigned long long field_28;
} st_3c72b4_1;

typedef struct st_3c72b4_2 {
    long long field_0;
} st_3c72b4_2;

typedef struct st_3c72b4_0 {
    char field_0;
} st_3c72b4_0;

extern unsigned long long g_e7d8a8;

void sub_3c72b4(st_3c72b4_1 *a0, unsigned long a1)
{
    unsigned long long v10;  // x22
    unsigned long long v11;  // x21
    unsigned long long v12;  // x20
    unsigned long long v13;  // x19
    unsigned long long v14;  // x30
    long long *v15;  // x8
    long long i;  // x9
    unsigned long long v17;  // x8
    st_3c72b4_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_3c72b4_0 *v1;  // [bp-0x48]
    unsigned long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = v13;
    v7 = &v9;
    v8 = v14;
    v1 = &v0;
    v0 = &v1;
    v2 = sub_3c73a0();
    sub_3c6c08(a0);
    a0->field_28 = 0;
    v15 = a0->field_8;
    i = a0->field_10 - (char *)v15;
    if ((unsigned long long)i >= 0x11)
    {
        do
        {
            sub_4e14(*v15, 0x200, 8);
            v15 = a0->field_8 + 1;
            a0->field_8 = v15;
            i = a0->field_10 - (char *)v15;
        } while (0x11 <= (unsigned long long)i);
    }
    v17 = 56;
    if (i == 8)
        v17 = 48;
    if (i == 16)
        v17 = 40;
    goto *((void *)(*(long long *)((char *)&g_e7d8a8 + v17)));
}
