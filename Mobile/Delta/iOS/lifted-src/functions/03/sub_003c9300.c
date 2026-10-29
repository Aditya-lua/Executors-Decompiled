/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c9300..0x3c93d0 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c9300_0 {
    char field_0;
} st_3c9300_0;

typedef struct st_3c9300_1 {
    unsigned long long field_0;
} st_3c9300_1;

extern st_3c9300_1 *g_f0b120;

int sub_3c9300(unsigned long long *a0)
{
    unsigned int v4;  // w19
    unsigned long long v5;  // x0
    st_3c9300_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_3c9300_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_3cedc4();
    v5 = sub_3cedc4(a0);
    if (a0[1] > *a0 && ((unsigned int)v5 | v4 * 0x100) * 3186588639 <= 138547332 && !(v5 >> 5 & 1) && (v4 & 15) == 8)
        return 1;
    g_f0b120();
}
