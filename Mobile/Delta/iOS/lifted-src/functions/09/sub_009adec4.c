/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9adec4..0x9ae094 (464 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9adec4_3 {
    char padding_0[24];
    struct st_9adec4_1 *field_18;
    char padding_20[140];
    unsigned int field_ac;
    char padding_b0[32];
    struct st_9adec4_4 *field_d0;
    char padding_d8[16];
    char field_e8;
    char padding_e9[15];
    struct st_9adec4_2 *field_f8;
    char padding_100[8];
    unsigned long long field_108;
    unsigned long long field_110;
    char padding_118[992];
    struct st_9adec4_4 *field_4f8;
} st_9adec4_3;

typedef struct st_9adec4_2 {
    char padding_0[8];
    unsigned long long field_8;
} st_9adec4_2;

typedef struct st_9adec4_1 {
    int field_0;
    char padding_4[212];
    struct st_9adec4_0 *field_d8;
} st_9adec4_1;

typedef struct st_9adec4_0 {
    char padding_0[80];
    char field_50;
} st_9adec4_0;

typedef struct st_9adec4_4 {
    unsigned long long field_0;
} st_9adec4_4;


unsigned long long sub_9adec4(st_9adec4_3 *a0, unsigned long long a1)
{
    unsigned long long v3;  // x10
    unsigned long long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if (a0->field_d0 && (unsigned int)a1 == 22 && !(a0->field_e8 & 1) && a0->field_108 >= 4)
        a0->field_d0();
    if ((int)sub_992b38(a0, a1, a0->field_f8->field_8 + a0->field_110, a0->field_108, &v0) >= 1 && ((unsigned int)a1 != 22 || !(a0->field_18->field_d8->field_50 >> 3 & 1) && a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000 && 47 >= a0->field_ac && 1 << ((char)a0->field_ac & 63) & 0xc02000000000 || sub_9544f0(a0, a0->field_f8->field_8 + a0->field_110, v0)))
    {
        if (a0->field_108 == v0)
        {
            a0->field_e8 = a0->field_e8 & 254;
            if (!a0->field_4f8)
                return 1;
            a0->field_4f8();
        }
        else
        {
            v3 = a0->field_110;
            a0->field_108 = a0->field_108 - v0;
            a0->field_110 = v3 + v0;
            return 0;
        }
    }
    return 0xffffffff;
}
