/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb616c4..0xb64bb4 (13552 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b616c4_1 {
    unsigned long long field_0;
    unsigned int field_8;
    char padding_c[12];
    unsigned long long field_18;
    unsigned int field_20;
    char padding_24[20];
    struct st_b616c4_0 *field_38;
} st_b616c4_1;

typedef struct st_b616c4_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[68];
    unsigned long long field_50;
    unsigned int field_58;
} st_b616c4_0;

typedef struct st_b616c4_2 {
    int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_b616c4_2;

extern char g_b61814;
extern st_b616c4_2 g_b64bb4;

unsigned int sub_b616c4(st_b616c4_1 *a0, unsigned int a1)
{
    unsigned int v0;  // [bp-0x78]
    unsigned int v1;  // [bp-0x5c]
    unsigned int v2;  // [bp-0x58]
    unsigned int v3;  // [bp-0x54]
    unsigned long v4;  // [bp-0x50]
    unsigned int v5;  // [bp-0x48]
    unsigned int v6;  // [bp-0x44]
    unsigned long v7;  // [bp-0x40]
    unsigned long v8;  // [bp-0x38]
    st_b616c4_0 *v9;  // [bp-0x30]
    unsigned int v10;  // [bp-0x24]
    unsigned int v11;  // [bp-0x14]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v10 = a1;
    if (!sub_b611f4(a0) && a0->field_18 && (a0->field_0 || !a0->field_8))
    {
        v9 = a0->field_38;
        if (v9->field_8 == 0x3f3f)
            v9->field_8 = 16192;
        v7 = a0->field_18;
        v5 = a0->field_20;
        v8 = a0->field_0;
        v6 = a0->field_8;
        v4 = v9->field_50;
        v3 = v9->field_58;
        v2 = v6;
        v1 = v5;
        v0 = 0;
        if (v9->field_8 - 16180 > 31)
        {
            v11 = 0xfffffffe;
            return v11;
        }
        goto *((void *)(&(&g_b61814)[*(int *)((char *)&(&g_b64bb4.field_0)[v9->field_8] - 64720)]));
    }
    v11 = 0xfffffffe;
    return v11;
}
