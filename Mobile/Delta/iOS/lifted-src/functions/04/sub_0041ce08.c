/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x41ce08..0x41cf24 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_41ce08_0 {
    char field_0;
} st_41ce08_0;

extern unsigned long long g_e80fb8;

long long sub_41ce08(st_41ce08_0 **a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned int v8;  // w8
    unsigned long long v9;  // x9
    unsigned long long v10;  // x8
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = *(char *)*a0;
    v9 = 24;
    if (v8 == 1)
        v9 = 8;
    v10 = 16;
    if (v8 == 2)
        v9 = v10;
    goto *((void *)(*(long long *)((char *)&g_e80fb8 + v9)));
}
