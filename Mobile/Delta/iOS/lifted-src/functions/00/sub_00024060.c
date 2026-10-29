/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x24060..0x244c8 (1128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_24060_2 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_24060_2;

typedef struct st_24060_0 {
    char field_0;
} st_24060_0;

typedef struct st_24060_1 {
    char padding_0[128];
    unsigned int field_80;
    uint128_t field_84;
    char padding_94[988];
    unsigned long long field_470;
    unsigned long long field_478;
} st_24060_1;

extern unsigned long long g_e621c8;
extern char g_10002b0;

void sub_24060(st_24060_1 *a0)
{
    unsigned long long v20;  // x28
    unsigned long long v21;  // x27
    unsigned long long v30;  // x9
    unsigned long long v31;  // x8
    unsigned long long v22;  // x24
    unsigned long long v23;  // x23
    unsigned long long v24;  // x22
    unsigned long long v25;  // x21
    unsigned long long v26;  // x20
    unsigned long long v27;  // x19
    unsigned long long v28;  // x30
    unsigned int v29;  // w8
    st_24060_0 **v0;  // [bp-0x108], Other Possible Types: char
    st_24060_0 *v1;  // [bp-0x100]
    unsigned long long *v2;  // [bp-0xe8]
    long long v3;  // [bp-0xe0]
    unsigned long long v4;  // [bp-0xd8]
    unsigned long long v5;  // [bp-0xd0]
    st_24060_2 **v6;  // [bp-0xc8], Other Possible Types: unsigned long long
    uint128_t v7;  // [bp-0xc0]
    unsigned long v8;  // [bp-0x58]
    unsigned long long v9;  // [bp-0x50]
    unsigned long long v10;  // [bp-0x48]
    unsigned long long v11;  // [bp-0x40]
    unsigned long long v12;  // [bp-0x38]
    unsigned long long v13;  // [bp-0x30]
    unsigned long long v14;  // [bp-0x28]
    unsigned long long v15;  // [bp-0x20]
    unsigned long long v16;  // [bp-0x18]
    char *v17;  // [bp-0x10]
    unsigned long long v18;  // [bp-0x8]
    char v19;  // [bp+0x0]

    v9 = v20;
    v10 = v21;
    v11 = v22;
    v12 = v23;
    v13 = v24;
    v14 = v25;
    v15 = v26;
    v16 = v27;
    v17 = &v19;
    v18 = v28;
    v8 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v7 = *(int128_t *)&(&a0->field_80)[1];
    v5 = 0;
    v6 = 0;
    v2 = &a0->padding_94[976];
    v3 = *(long long *)&a0->padding_94[984] - *(long long *)&a0->padding_94[976] >> 3;
    v4 = 0;
    v5 = sub_237f0();
    v6 = &v2;
    v29 = a0->field_80;
    v30 = ((v29 != 299) * 64 | (char)(v29 != 299) >> 58) & 0x3fffffffc0 & 0x3fffffffff;
    if (v29 == 302)
        v30 = 8;
    v31 = 32;
    if (v29 == 281)
        v30 = v31;
    goto *((void *)(*(long long *)((char *)&g_e621c8 + v30)));
}
