/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3f99c4..0x3f9aa4 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3f99c4_0 {
    char field_0;
} st_3f99c4_0;

extern unsigned long long g_e810b8;

long long sub_3f99c4(st_3f99c4_0 **a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned int v12;  // w9
    unsigned long long v13;  // x10
    unsigned long long v14;  // x9
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = *(char *)*a0;
    v13 = 24;
    if (v12 == 1)
        v13 = 8;
    v14 = 16;
    if (v12 == 2)
        v13 = v14;
    goto *((void *)(*(long long *)((char *)&g_e810b8 + v13)));
}
