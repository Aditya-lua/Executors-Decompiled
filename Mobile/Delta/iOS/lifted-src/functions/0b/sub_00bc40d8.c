/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbc40d8..0xbc4764 (1676 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bc40d8_0 {
    char padding_0[144];
    struct st_bc40d8_1 *field_90;
} st_bc40d8_0;

typedef struct st_bc40d8_1 {
    char padding_0[32];
    unsigned long long field_20;
    unsigned long long field_28;
} st_bc40d8_1;

extern char g_e065ae;
extern long long g_ef97c8;
extern long long g_ef97e0;
extern long long g_ef97f8;

void sub_bc40d8(st_bc40d8_0 *a0, unsigned int a1, unsigned long a2)
{
    unsigned long long v13;  // x28
    unsigned long long v14;  // x27
    unsigned long long v23;  // x30
    unsigned long v24;  // x19
    unsigned long long *v25;  // x8
    unsigned long long v26;  // x8
    unsigned long long v15;  // x26
    long long v16;  // x25
    unsigned long long v17;  // x24
    unsigned long long v18;  // x23
    unsigned long long v19;  // x22
    unsigned long long v20;  // x21
    unsigned long long v21;  // x20
    unsigned long long v22;  // x19
    unsigned long long v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x58]
    unsigned long long v2;  // [bp-0x50]
    long long v3;  // [bp-0x48]
    unsigned long long v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x38]
    unsigned long long v6;  // [bp-0x30]
    unsigned long long v7;  // [bp-0x28]
    unsigned long long v8;  // [bp-0x20]
    unsigned long long v9;  // [bp-0x18]
    char *v10;  // [bp-0x10]
    unsigned long long v11;  // [bp-0x8]
    char v12;  // [bp+0x0]

    v0 = v13;
    v1 = v14;
    v2 = v15;
    v3 = v16;
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = &v12;
    v11 = v23;
    v24 = a1;
    if (a0->field_90->field_28 <= v24 || (v25 = a0->field_90->field_20 + v24 * 32, *v25 == 0x8000000000000000))
    {
        sub_c73c64(&g_ef97c8);
        sub_c73c94(v16);
    }
    else if (v25[2] > a2)
    {
        v26 = 9;
        if (11 < (unsigned long long)*(long long *)(v25[1] + 264 * a2 + 24))
            v26 = *(long long *)(v25[1] + 264 * a2 + 24) - 12;
        goto *((void *)(sub_bc4174 + (&g_e065ae)[v26] * 4));
    }
    else
    {
        sub_c73c64(&g_ef97e0);
        sub_c73c64(&g_ef97f8);
    }
    __debugbreak();
}
