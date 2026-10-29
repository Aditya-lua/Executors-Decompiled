/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbdd8..0xbe90 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bdd8_0 {
    char field_0;
} st_bdd8_0;

typedef struct st_bdd8_1 {
    long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_bdd8_1;

extern unsigned long long g_c7c2eb;
extern st_bdd8_1 g_e61528;

long long sub_bdd8(long long a0, unsigned long a1)
{
    unsigned long long idx;  // x21
    st_bdd8_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_bdd8_0 *v1;  // [bp-0x48]
    long long v2;  // [bp-0x40], Other Possible Types: unsigned long long
    unsigned int v3;  // [bp-0x38], Other Possible Types: unsigned long long
    unsigned int v4;  // [bp-0x34]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    v2 = &g_c7c2eb;
    v3 = 0;
    idx = 0;
    *(unsigned long *)(sub_bfd0() + 48) = a1;
    do
    {
        v2 = (&g_e61528.field_0)[idx];
        v3 = _strlen((&g_e61528.field_0)[idx]);
        v4 = (unsigned int)idx + 291;
        sub_a328(a0, &v2);
        sub_9ea8(a0, &v2);
        idx += 1;
    } while (idx != 21);
    return a0;
}
