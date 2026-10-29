/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x10776c..0x1078d4 (360 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_10776c_1 {
    char padding_0[80];
    unsigned long long field_50;
} st_10776c_1;

typedef struct st_10776c_2 {
    char padding_0[8];
    struct st_10776c_1 *field_8;
    char padding_10[64];
    unsigned long long field_50;
} st_10776c_2;

typedef struct st_10776c_0 {
    char field_0;
} st_10776c_0;

typedef struct st_10776c_6 {
    unsigned long long field_0;
} st_10776c_6;

typedef struct st_10776c_4 {
    char padding_0[1504];
    unsigned long long field_5e0;
    char padding_5e8[152];
    unsigned long long field_680;
} st_10776c_4;

typedef struct st_10776c_5 {
    char padding_0[392];
    struct st_10776c_6 *field_188;
} st_10776c_5;

typedef struct st_10776c_3 {
    char padding_0[96];
    struct st_10776c_4 *field_60;
} st_10776c_3;

extern unsigned long long g_e6e690;
extern st_10776c_3 *g_f0d198;
extern st_10776c_5 *g_f0d3d8;

unsigned long long sub_10776c(st_10776c_2 *a0)
{
    st_10776c_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_10776c_0 *v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    char v3;  // [bp-0x30]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_50 == g_f0d198->field_60->field_680)
    {
        return 0;
    }
    else if (a0->field_8->field_50 != g_f0d198->field_60->field_5e0)
    {
        sub_611d8(&v3);
        if (!(sub_66dc4(&v3) & 1))
        {
            sub_614bc(&v3);
            if (v2)
                g_f0d3d8->field_188();
            sub_60b78(&v2);
        }
        sub_611fc(&v3);
        goto *((void *)(g_e6e690));
    }
    else
    {
        goto *((void *)(g_e6e690));
    }
}
