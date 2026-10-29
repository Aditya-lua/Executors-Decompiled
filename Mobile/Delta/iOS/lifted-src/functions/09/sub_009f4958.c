/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f4958..0x9f49a4 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f4958_0 {
    char padding_0[8];
    struct st_9f4958_1 *field_8;
} st_9f4958_0;

typedef struct st_9f4958_1 {
    unsigned short field_0;
} st_9f4958_1;


st_9f4958_0 * sub_9f4958(st_9f4958_0 *a0, char *a1)
{
    char *v0;  // x9
    unsigned short v1;  // x10
    char *v2;  // x10
    unsigned long v3;  // x9

    v0 = a1 - 1;
    while (1)
    {
        v1 = v0[1];
        if (v1 >= 0 && (unsigned short)(*(short *)&a0->field_8[v1]) >> 3 & 1)
            break;
        v0 += 1;
    }
    do
    {
        v2 = v0;
    } while (a1 <= v0 && (v3 = *v2, (long long)v3 >= 0 && (v0 = v2 - 1, (unsigned short)(*(short *)&a0->field_8[v3]) >> 4 & 1)));
    v2[1] = 0;
    return a0;
}
