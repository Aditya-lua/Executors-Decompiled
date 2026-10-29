/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb44230..0xb442e4 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b44230_1 {
    unsigned long long field_0;
    char field_5;
} st_b44230_1;

typedef struct st_b44230_0 {
    char padding_0[16];
    char field_10;
    char padding_11[23];
    long long field_28;
    long long field_30;
    long long field_38;
    unsigned long long field_40;
    char field_45;
    char padding_46[10];
    long long field_50;
} st_b44230_0;


long long sub_b44230(st_b44230_0 *a0, st_b44230_1 *a1, long long a2)
{
    st_b44230_0 *v2;  // x21
    long long v3;  // x0
    long long v4;  // x22
    long long v5;  // x21
    long long v6;  // x20
    long long v7;  // x19
    long long v8;  // x30
    unsigned long long v9;  // x8
    long long v0;  // [bp-0x38]
    char v1;  // [bp+0x0]

    if (a0->field_38)
    {
        if (*(int *)&a0->padding_46[7])
        {
            if ((unsigned long long)a0->field_38 >= (unsigned long long)a2)
            {
                v2 = a0;
                v3 = sub_954340(&a0->field_10);
                *(char *)&v0 = 0;
                return sub_c6aa54(v3, &(v2->padding_46)[1 + 1], &v2[1].field_38, &v2->field_40, a1, a2, v2->field_38, v2->field_28, a0->field_30, v0, v4, v5, v6, v7, &v1, v8);
            }
            return 0;
        }
        else
        {
            if (a2 == 13)
            {
                v9 = a1->field_0;
                *(long long *)((char *)&a0->field_40 + 5) = *(long long *)((char *)&a1->field_0 + 5);
                a0->field_40 = v9;
                *(unsigned int *)&a0->padding_46[7] = 1;
                return 1;
            }
            return 0;
        }
    }
}
