/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbffc94..0xbffcf0 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bffc94_0 {
    char field_0;
    char padding_1[7];
    unsigned long long field_8;
    long long field_10;
} st_bffc94_0;


void sub_bffc94(st_bffc94_0 *a0, unsigned long long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long *v8;  // x20
    unsigned long long v9;  // x19
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a1)
        return;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = &a0->field_8;
    do
    {
        v9 = a1;
        if ((*((char *)v8 - 8) == 8 || *((char *)v8 - 8) == 5) && *v8)
            _free(v8[1]);
    } while ((v8 += 4, a1 = v9 - 1, v9 != 1));
    return;
}
