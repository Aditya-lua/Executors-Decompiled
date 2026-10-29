/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2ac620..0x2ac7c4 (420 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2ac620_1 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long *field_10;
} st_2ac620_1;

typedef struct st_2ac620_0 {
    char field_0;
} st_2ac620_0;

extern unsigned long long g_e7c9a0;
extern unsigned long long g_e7c9c0;

long long sub_2ac620(st_2ac620_1 *a0, unsigned long a1)
{
    unsigned long long *v9;  // x21
    unsigned long long v10;  // 4109
    st_2ac620_0 **v0;  // [bp-0x88], Other Possible Types: char
    st_2ac620_0 *v1;  // [bp-0x80]
    char v2;  // [bp-0x78]
    char v3;  // [bp-0x60], Other Possible Types: unsigned int
    unsigned long long v4;  // [bp-0x48]
    char *v5;  // [bp-0x40]
    char v6;  // [bp-0x31]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v1 = &v0;
    v0 = &v1;
    v3 = (char *)a0->field_10 - a0->field_8 >> 3;
    v2 = 2;
    v6 = sub_1b2e04(a0 + 4, &v3, &v2, &a0[5].field_10);
    sub_2a6c24(&a0[1].field_8, &v6);
    v3 = 2;
    v4 = sub_2ab640(a0, &v3, 1);
    v5 = &v3;
    sub_103a8(&a0->field_8, &v5);
    if (!*(long long *)((char *)a0->field_10 - 8))
        return 1;
    v9 = &g_e7c9a0;
    v10 = arm64g_calculate_condition(2, a1, 1, 0);
    if (!(v10 & 1) && sub_2a91bc() < a1)
        v9 = &g_e7c9c0;
    goto *((void *)(*v9));
}
