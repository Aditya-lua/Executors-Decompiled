/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1fae28..0x1fb474 (1612 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1fae28_1 {
    char padding_0[4];
    unsigned int field_4;
} st_1fae28_1;

typedef struct st_1fae28_0 {
    char field_0;
} st_1fae28_0;

extern unsigned long long g_e783d8;

long long sub_1fae28(unsigned long a0, unsigned long a1, st_1fae28_1 *a2, unsigned long a3, unsigned long a4, unsigned int a5)
{
    unsigned long long v13;  // x26
    unsigned long long v14;  // x25
    unsigned long long v23;  // x10
    unsigned long long v15;  // x24
    unsigned long long v16;  // x23
    unsigned long long v17;  // x22
    unsigned long long v18;  // x21
    unsigned long long v19;  // x20
    unsigned long long v20;  // x19
    unsigned long long v21;  // x30
    unsigned int v22;  // w8
    st_1fae28_0 **v0;  // [bp-0x98], Other Possible Types: char
    st_1fae28_0 *v1;  // [bp-0x90]
    unsigned long long v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x48]
    unsigned long long v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x38]
    unsigned long long v6;  // [bp-0x30]
    unsigned long long v7;  // [bp-0x28]
    unsigned long long v8;  // [bp-0x20]
    unsigned long long v9;  // [bp-0x18]
    char *v10;  // [bp-0x10]
    unsigned long long v11;  // [bp-0x8]
    char v12;  // [bp+0x0]

    v2 = v13;
    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = &v12;
    v11 = v21;
    v1 = &v0;
    v0 = &v1;
    if (a5)
        sub_1fae68(); /* do not return */
    v22 = a2->field_4;
    v23 = 408;
    if (v22 == 0x44)
        v23 = 104;
    if (v22 == 100)
        v23 = 376;
    if (v22 == 83)
        v23 = 0x88;
    if (v22 == 115)
        v23 = 416;
    if (v22 == 87)
        v23 = 552;
    if (v22 == 0x77)
        v23 = 296;
    if (v22 == 80)
        v23 = 96;
    if (v22 == 112)
        v23 = 320;
    goto *((void *)(*(long long *)((char *)&g_e783d8 + v23)));
}
