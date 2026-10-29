/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xf10f4..0xf11a4 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_f10f4_6 {
    struct st_f10f4_7 *field_0;
    struct st_f10f4_7 *field_8;
} st_f10f4_6;

typedef struct st_f10f4_3 {
    struct st_f10f4_2 *field_0;
    char padding_8[4];
    unsigned int field_c;
} st_f10f4_3;

typedef struct st_f10f4_2 {
    char padding_0[3];
    char field_3;
    char padding_4[20];
    struct st_f10f4_1 *field_18;
} st_f10f4_2;

typedef struct st_f10f4_5 {
    char padding_0[8];
    struct st_f10f4_3 *field_8;
    struct st_f10f4_1 *field_10;
    char padding_18[8];
    unsigned long long field_20;
} st_f10f4_5;

typedef struct st_f10f4_1 {
    char padding_0[40];
    unsigned long long field_28;
} st_f10f4_1;

typedef struct st_f10f4_4 {
    char field_0;
    char padding_1[2];
    char field_3;
    char padding_4[36];
    char *field_28;
    char padding_30[16];
    struct st_f10f4_5 *field_40;
} st_f10f4_4;

typedef struct st_f10f4_7 {
    struct st_f10f4_1 *field_0;
} st_f10f4_7;

typedef struct st_f10f4_0 {
    char field_0;
} st_f10f4_0;


char sub_f10f4(st_f10f4_6 *a0, st_f10f4_4 *a1)
{
    char *iter;  // x8
    char *v3;  // x9
    st_f10f4_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_f10f4_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a1->field_0 != 10)
    {
        return 0;
    }
    else if (a1->field_3 == 1)
    {
        iter = &a1->field_40->padding_0[0];
        for (v3 = a1->field_28; iter != v3; iter -= 48)
        {
            if (*(int *)(*(long long *)&iter[8] + 12) == 8 && !(*(char *)(*(long long *)*(long long *)&iter[8] + 3) & 1) && (*(long long *)(*(long long *)*(long long *)&iter[8] + 24) == *(long long *)a0->field_0 || *(long long *)&iter[16] == *(long long *)a0->field_0))
            {
                *(long long *)&iter[32] = *(long long *)(*(long long *)a0->field_8 + 40);
                *(long long *)&iter[16] = *(long long *)a0->field_8;
                v3 = a1->field_28;
            }
        }
        return 0;
    }
    else
    {
        return 0;
    }
}
