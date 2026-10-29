/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x64e34..0x64ea0 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_64e34_0 {
    char padding_0[120];
    long long field_78;
} st_64e34_0;


long long sub_64e34(st_64e34_0 *a0, long long a1, long long a2)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_78)
        return 0;
    v2 = sub_64c0c(a2);
    if (!v2)
        return 0;
    _fopen(a1, v2);
}
