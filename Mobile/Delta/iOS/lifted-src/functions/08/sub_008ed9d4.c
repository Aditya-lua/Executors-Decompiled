/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8ed9d4..0x8eda84 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8ed9d4_0 {
    char padding_0[1608];
    unsigned long long field_648;
} st_8ed9d4_0;

typedef struct st_8ed9d4_1 {
    char padding_0[2];
    char field_2;
    char padding_3[77];
    struct st_8ed9d4_0 *field_50;
} st_8ed9d4_1;

extern unsigned long long g_e82bb8;
extern unsigned long long g_f0d540;

void sub_8ed9d4(st_8ed9d4_1 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long v8;  // x8
    unsigned int v9;  // w9
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = a0->field_2;
    if (!(v8 >> 31 & 1))
    {
        v9 = (unsigned int)v8 + ~(unsigned int)v8 * 2 + 1;
        a0->field_2 = (char)v8 + ((char)v9 ^ 128) + ((char)~v9 | 128) + 129;
    }
    if (!g_f0d540)
        g_f0d540 = a0->field_50->field_648;
    (g_e82bb8 - 0x786c1700)();
}
