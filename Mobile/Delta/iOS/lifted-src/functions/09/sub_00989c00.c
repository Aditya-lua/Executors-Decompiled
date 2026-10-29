/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x989c00..0x989c60 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_989c00_0 {
    char padding_0[64];
    unsigned long long field_40;
    char padding_48[184];
    unsigned long long field_100;
} st_989c00_0;


unsigned long long sub_989c00(unsigned long a0, st_989c00_0 *a1, unsigned long a2)
{
    unsigned long long v3;  // x8
    unsigned long long v4;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    v3 = a1->field_100;
    if (v3 >> 26 & 1)
    {
        return 0;
    }
    else if (1 >= (((unsigned int)v3 * 0x10000 | (unsigned int)v3 >> 16) & 0xff) - 1)
    {
        a1->field_100 = v3 | 0x4000000;
        a1->field_40 = a2;
        if (v3 >> 0x22 & 1)
            return 1;
        v0 = &v2;
        v1 = v4;
        a1->field_100 = v3 | 0x404000000;
        sub_98959c();
        return 1;
    }
    else
    {
        return 0;
    }
}
