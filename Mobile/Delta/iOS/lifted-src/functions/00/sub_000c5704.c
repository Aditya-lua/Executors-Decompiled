/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5704..0xc57c4 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5704_0 {
    char field_0;
} st_c5704_0;

extern unsigned long long g_e6cf48;

long long sub_c5704(unsigned long a0)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    unsigned long long v10;  // x9
    unsigned long long v11;  // x8
    unsigned long long v12;  // 4116
    st_c5704_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_c5704_0 *v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    v1 = &v0;
    v0 = &v1;
    v10 = 24;
    if (*(int *)(a0 + 0x7600) == 1)
        v10 = 0;
    v11 = 8;
    v12 = arm64g_calculate_condition(1, *(int *)(a0 + 0x7600), 1, 0);
    if (v12 & 1)
        v10 = v11;
    goto *((void *)(*(long long *)((char *)&g_e6cf48 + v10)));
}
