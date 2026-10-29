/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc54460..0xc54510 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_c413b0;
extern long long g_cbaf9a;
extern long long g_efd738;

unsigned long long sub_c54460(long long a0)
{
    unsigned long long v5;  // x0
    unsigned int *v6;  // x0
    unsigned long v7;  // x20
    unsigned long long v8;  // x0
    unsigned long v0;  // [bp-0x38]
    char *v1;  // [bp-0x30], Other Possible Types: unsigned long
    unsigned long long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    _dirfd();
    v5 = _closedir(a0);
    if (!(unsigned int)v5)
        return v5;
    v6 = ___error();
    v7 = *v6;
    v1 = 2 | v7 * 0x100000000;
    v8 = sub_c40ff0(&v1);
    if ((unsigned int)v7 == 4)
        return v8;
    v0 = 2 | *v6 * 0x100000000;
    v1 = &v0;
    v2 = &g_c413b0;
    sub_c73b38(&g_cbaf9a, &v1, &g_efd738);
    __debugbreak();
}
