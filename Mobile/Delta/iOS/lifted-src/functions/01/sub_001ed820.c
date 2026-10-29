/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ed820..0x1ed8d8 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ed820_1 {
    char padding_0[8];
    unsigned long long field_8;
} st_1ed820_1;

typedef struct st_1ed820_0 {
    char field_0;
} st_1ed820_0;

extern char g_cd6d08;
extern long long g_cd6dc0;
extern unsigned int g_d0a170[4];

long long sub_1ed820(unsigned long a0, st_1ed820_1 *a1, unsigned int a2)
{
    st_1ed820_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1ed820_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    a1->field_8 = 0;
    if (371 >= a2)
    {
        if (a2 == 47)
        {
            sub_1ebdf8(a1, &g_cd6dc0, 735);
            sub_1eed2c(a1);
        }
        else
        {
            sub_1ebdf8(a1, &(&g_cd6d08)[8 * g_d0a170[2 * a2]], g_d0a170[1 + 2 * a2]);
            return 372 > a2;
        }
    }
    return 372 > a2;
}
