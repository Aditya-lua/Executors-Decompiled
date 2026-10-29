/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f6548..0x9f65d0 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f6548_0 {
    char padding_0[16];
    long long field_10;
} st_9f6548_0;


unsigned long long sub_9f6548(st_9f6548_0 *a0, long long a1, long long a2)
{
    unsigned long long v2;  // x22
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((int)sub_ad69e4(a0->field_10) >= 1)
    {
        v2 = 0;
        do
        {
            v3 = sub_ad69f8(a0->field_10, v2);
            if (!_memcmp(v3 + 24, a1, a2))
                return v3;
        } while ((v2 = (unsigned int)v2 + 1, (int)v2 < (int)sub_ad69e4(a0->field_10)));
    }
    return 0;
}
