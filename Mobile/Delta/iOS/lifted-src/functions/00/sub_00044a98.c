/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x44a98..0x44b88 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_44a98_0 {
    char field_0;
} st_44a98_0;

extern unsigned int g_f00ba0;

unsigned long long sub_44a98(long long a0, unsigned long a1)
{
    unsigned long long v6;  // x0
    unsigned long long *iter;  // x20
    unsigned long long v8;  // x0
    unsigned long long v9;  // x1
    st_44a98_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_44a98_0 *v1;  // [bp-0x48]
    unsigned long v2;  // [bp-0x40]
    unsigned long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v3 = a1;
    v6 = sub_3b040(a0 + 104, &v3);
    if (!v6)
        return v6;
    iter = *(long long *)(v6 + 16);
    if (*(long long *)(v6 + 16) == *(long long *)(v6 + 24))
        return 1;
    while (1)
    {
        v2 = *iter;
        v8 = sub_34930(a0 + 224, &v2);
        if (!v8 || *(char *)(v8 + 16) & 1 || (*(long long *)(v2 + 32) || *(long long *)(v2 + 40)) && (v9 = *(long long *)(v8 + 8), !v9 || *(int *)(v9 + 8) != g_f00ba0 || v9 != v3 && !(sub_44a98(a0, v9) & 1)))
            break;
        iter += 1;
        if (iter == *(long long *)(v6 + 24))
            return 1;
    }
    return 0;
}
