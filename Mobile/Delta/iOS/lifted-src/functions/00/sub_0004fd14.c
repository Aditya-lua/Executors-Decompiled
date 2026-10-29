/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4fd14..0x4fe30 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4fd14_1 {
    char padding_0[32];
    struct st_4fd14_2 *field_20;
    unsigned long long field_28;
    struct st_4fd14_2 *field_30;
    unsigned long long field_38;
} st_4fd14_1;

typedef struct st_4fd14_3 {
    char padding_0[64];
    unsigned long long field_40;
    unsigned long long field_48;
} st_4fd14_3;

typedef struct st_4fd14_2 {
    long long field_0;
} st_4fd14_2;

typedef struct st_4fd14_0 {
    char field_0;
} st_4fd14_0;


unsigned long long sub_4fd14(st_4fd14_3 *a0, st_4fd14_1 *a1)
{
    unsigned long long v4;  // x8
    unsigned long long i;  // x21
    unsigned long long v6;  // x21
    unsigned long long v7;  // x0
    unsigned long long v8;  // x22
    unsigned long long v9;  // x0
    unsigned long long v10;  // x8
    st_4fd14_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_4fd14_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a1->field_28;
    if (a1->field_28)
    {
        i = 0;
        do
        {
            sub_4ee84(a0, *(long long *)&a1->field_20[i]);
            i += 1;
            v4 = a1->field_28;
        } while (i < a1->field_28);
    }
    v6 = 0;
    while (1)
    {
        if (v4 > v6)
        {
            v7 = sub_4f204(a0, *(long long *)&a1->field_20[v6]);
            v8 = (v7 & 0x8080808080808080) - ((v7 & 0x8080808080808080) >> 7) | v7 & 0x7f7f7f7f7f7f7f7f;
            if (a1->field_38 > v6)
                goto LABEL_4fdf0;
        }
        else
        {
            if (a1->field_38 <= v6)
                break;
            v8 = 0;
            if (a1->field_38 > v6)
            {
LABEL_4fdf0:
                v9 = sub_4f204(a0, *(long long *)&a1->field_30[v6]);
                v8 = (v9 + v8 & 0x8080808080808080) - ((v9 + v8 & 0x8080808080808080) >> 7) | v9 + v8 & 0x7f7f7f7f7f7f7f7f;
            }
        }
        if (1 >= v8)
            v8 = 1;
        v10 = v8 + a0->field_40;
        a0->field_40 = (v10 & 0x8080808080808080) - ((v10 & 0x8080808080808080) >> 7) | v10 & 0x7f7f7f7f7f7f7f7f;
        a0->field_48 = 0;
        v6 += 1;
        v4 = a1->field_28;
    }
    return 0;
}
