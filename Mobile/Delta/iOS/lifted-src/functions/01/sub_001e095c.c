/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e095c..0x1e0a6c (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1e095c_0 {
    struct st_1e095c_0 *field_0;
    char padding_8[24];
    unsigned long long field_20;
    char padding_28[8];
    int field_30;
    int field_34;
    int field_38;
    int field_3c;
    int field_40;
    char padding_44[12];
    unsigned long long field_50;
} st_1e095c_0;

typedef struct st_1e095c_1 {
    char field_0;
} st_1e095c_1;

typedef struct st_1e095c_3 {
    unsigned long long field_0;
} st_1e095c_3;

typedef struct st_1e095c_2 {
    char padding_0[288];
    struct st_1e095c_3 *field_120;
} st_1e095c_2;

extern long long g_f02738;
extern st_1e095c_2 *g_f0d3d8;

int sub_1e095c(st_1e095c_0 *a0)
{
    st_1e095c_1 **v0;  // [bp-0x38], Other Possible Types: char
    st_1e095c_1 *v1;  // [bp-0x30]
    st_1e095c_0 *v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v2 = a0;
    v0 = &v1;
    if (a0)
    {
        sub_1dd788();
        sub_1db208(std::__1::mutex::lock(&g_f02738), &v2);
        std::__1::mutex::unlock(&g_f02738);
        if (a0->field_0 && a0->field_0->field_50 == a0->field_20)
        {
            if (a0->field_34 >= 1)
            {
                g_f0d3d8->field_120();
            }
            else if (a0->field_38 >= 1)
            {
                g_f0d3d8->field_120();
            }
            else if (a0->field_3c >= 1)
            {
                g_f0d3d8->field_120();
            }
            else if (a0->field_40 >= 1)
            {
                g_f0d3d8->field_120();
            }
            else if (a0->field_30 >= 1)
            {
                g_f0d3d8->field_120();
            }
        }
        a0 = operatordelete(a0);
    }
    return (unsigned int)a0;
}
