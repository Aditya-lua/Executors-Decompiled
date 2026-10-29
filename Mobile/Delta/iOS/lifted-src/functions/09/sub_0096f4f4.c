/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96f4f4..0x96f598 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96f4f4_1 {
    char padding_0[8];
    long long field_8;
    char padding_10[752];
    unsigned long long field_300;
    char padding_308[104];
    long long field_370;
    long long field_378;
    unsigned int field_380;
    char padding_384[4];
    unsigned long long field_388;
    char padding_390[1392];
    struct st_96f4f4_0 *field_900;
} st_96f4f4_1;

typedef struct st_96f4f4_0 {
    char padding_0[760];
    unsigned long long field_2f8;
} st_96f4f4_0;


int sub_96f4f4(st_96f4f4_1 *a0)
{
    st_96f4f4_0 *v6;  // x1
    unsigned long v0;  // [bp-0x40]
    unsigned int v1;  // [bp-0x34]
    long long v2;  // [bp-0x30]
    long long v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = 0;
    v0 = 0;
    v6 = a0->field_900;
    v6->field_2f8 = a0->field_300;
    if (!sub_95a46c(a0->field_8, v6, &v3, &v2, &v1, &v0, 0, 0, v0))
    {
        sub_9a5810(a0, 80);
        return 0;
    }
    sub_961c44(a0->field_370);
    a0->field_370 = v3;
    sub_961c0c(a0->field_378);
    a0->field_378 = v2;
    a0->field_380 = v1;
    a0->field_388 = v0;
    return 1;
}
