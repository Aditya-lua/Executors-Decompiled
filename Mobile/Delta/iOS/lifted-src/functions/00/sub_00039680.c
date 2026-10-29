/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x39680..0x39788 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_39680_1 {
    char padding_0[1632];
    struct st_39680_2 *field_660;
    unsigned long long field_668;
} st_39680_1;

typedef struct st_39680_2 {
    unsigned int field_0;
} st_39680_2;

typedef struct st_39680_0 {
    char field_0;
} st_39680_0;

extern unsigned long long g_e67078;

st_39680_1 * sub_39680(st_39680_1 *a0, unsigned long a1, long long a2, unsigned long a3, unsigned long a4)
{
    unsigned long long v4;  // x10
    unsigned long long v5;  // x9
    st_39680_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_39680_0 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_668 - (char *)a0->field_660 >> 4 <= (unsigned long long)a2)
        return a0;
    v4 = 16;
    if (!*(int *)&a0->field_660[4 * a2])
        v4 = 32;
    v5 = 24;
    if (*(int *)&a0->field_660[4 * a2] == 1)
        v4 = v5;
    goto *((void *)(*(long long *)((char *)&g_e67078 + v4)));
}
