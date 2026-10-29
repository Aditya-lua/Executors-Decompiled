/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1679ac..0x167aa4 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1679ac_3 {
    struct st_1679ac_2 *field_0;
    char padding_8[8];
    char field_10;
} st_1679ac_3;

typedef struct st_1679ac_1 {
    struct st_1679ac_2 *field_0;
    char padding_8[4];
    struct st_1679ac_2 *field_c;
} st_1679ac_1;

typedef struct st_1679ac_2 {
    char padding_0[72];
    struct st_1679ac_1 *field_48;
    char padding_50[8];
    struct st_1679ac_1 *field_58;
} st_1679ac_2;

typedef struct st_1679ac_0 {
    char field_0;
} st_1679ac_0;

typedef struct st_1679ac_5 {
    unsigned long long field_0;
} st_1679ac_5;

typedef struct st_1679ac_4 {
    char padding_0[208];
    struct st_1679ac_5 *field_d0;
} st_1679ac_4;

typedef struct st_1679ac_6 {
    struct st_1679ac_5 *field_0;
} st_1679ac_6;

extern st_1679ac_6 *g_f0d398;
extern st_1679ac_4 *g_f0d3d8;

int sub_1679ac(st_1679ac_3 *a0)
{
    st_1679ac_1 **v4;  // x0
    st_1679ac_1 *v5;  // x8
    st_1679ac_1 **v6;  // x8
    st_1679ac_1 *v7;  // x9
    st_1679ac_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1679ac_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_0;
    if (!v4)
    {
        return operatordelete(a0);
    }
    else if (a0->field_10 != 1)
    {
        g_f0d3d8->field_d0();
    }
    else
    {
        while (1)
        {
            v5 = v4[11];
            if (v5 >= v4[9])
                break;
            v4[11] = &v5->field_c;
            *(unsigned int *)(v5->padding_8)[1] = 0;
        }
        v4[11] = v4[9];
        v6 = a0->field_0;
        v7 = v6[11];
        v7->field_0 = v6;
        *(unsigned int *)(v7->padding_8)[1] = 10;
        v6[11] = &v6[11]->field_c;
        (*(long long *)g_f0d398)();
    }
}
