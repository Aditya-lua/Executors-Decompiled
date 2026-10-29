/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe6664..0xe68c0 (604 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_e6664_2 {
    char padding_0[8];
    struct st_e6664_3 *field_8;
} st_e6664_2;

typedef struct st_e6664_1 {
    char padding_0[3];
    char field_3;
    char padding_4[8];
    struct st_e6664_1 *field_c;
    char padding_14[4];
    char field_18;
    char padding_19[7];
    struct st_e6664_1 *field_20;
} st_e6664_1;

typedef struct st_e6664_3 {
    struct st_e6664_1 *field_0;
} st_e6664_3;

typedef struct st_e6664_4 {
    char padding_0[40];
    struct st_e6664_2 *field_28;
    char padding_30[16];
    struct st_e6664_2 *field_40;
    char padding_48[32];
    struct st_e6664_1 *field_68;
} st_e6664_4;

typedef struct st_e6664_0 {
    char field_0;
} st_e6664_0;

typedef struct st_e6664_7 {
    unsigned long long field_0;
} st_e6664_7;

typedef struct st_e6664_6 {
    char padding_0[352];
    struct st_e6664_7 *field_160;
} st_e6664_6;

typedef struct st_e6664_5 {
    struct st_e6664_1 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_e6664_5;

extern st_e6664_5 g_e691a8;
extern st_e6664_6 *g_f0d3d8;
extern unsigned long long g_f0d528;

void sub_e6664(st_e6664_4 *a0, unsigned long long a1, st_e6664_1 *a2, unsigned long long a3, st_e6664_1 *a4)
{
    st_e6664_1 *v9;  // x8
    st_e6664_1 *v10;  // x8
    st_e6664_2 *v11;  // x20
    unsigned long long v0;  // [bp-0x90]
    st_e6664_1 *v1;  // [bp-0x88], Other Possible Types: st_e6664_2 *
    st_e6664_1 *v2;  // [bp-0x80]
    st_e6664_0 **v3;  // [bp-0x70], Other Possible Types: char
    st_e6664_0 *v4;  // [bp-0x68]
    st_e6664_0 **v5;  // [bp-0x60], Other Possible Types: char
    st_e6664_0 *v6;  // [bp-0x58]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v4 = &v3;
    v3 = &v4;
    if (a2 && *(int *)&(a2->padding_4)[1])
    {
        if (*(int *)&(a2->padding_4)[1] != (unsigned int)a3)
        {
            v6 = &v5;
            v5 = &v6;
            if (a0->field_40 <= a0->field_28 || !(v9 = *(long long *)a0->field_40->field_8, v9 && v9->field_3 == 1 && *(long long *)&v9->padding_19[3]))
            {
LABEL_e6858:
                g_f0d3d8->field_160();
            }
            a4 = a4;
            if (!_strcmp(*(long long *)&v9->padding_19[3] + 24, g_f0d528 + 1823) && !a0->field_68)
                goto LABEL_e6858;
            g_f0d3d8->field_160();
        }
        else
        {
            return;
        }
    }
    v6 = &v5;
    v5 = &v6;
    if (a0->field_40 > a0->field_28 && !(v10 = *(long long *)a0->field_40->field_8, !v10 || v10->field_3 != 1 || !*(long long *)&v10->padding_19[3]))
    {
        v11 = *(long long *)&v10->padding_19[3] + 24;
        a3 = a3;
        a4 = a4;
        if (!_strcmp(v11, g_f0d528 + 1823))
        {
            if (!a0->field_68)
                goto LABEL_e682c;
            v11 = a0->field_68->padding_14;
        }
        if (!a4)
            a4 = (&g_e691a8.field_0)[(unsigned int)a3];
        v1 = v11;
        v2 = a4;
        v0 = a1;
    }
    else
    {
LABEL_e682c:
        if (!a4)
            a4 = (&g_e691a8.field_0)[(unsigned int)a3];
        v0 = a1;
        v1 = a4;
    }
    sub_d5c30();
    return;
}
