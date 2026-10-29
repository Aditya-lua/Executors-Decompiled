/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5a4c8..0xa5a588 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5a4c8_0 {
    struct st_a5a4c8_0 *field_0;
    char padding_8[48];
    long long field_38;
    long long field_40;
    char padding_48[8];
    char field_50;
    char padding_51[15];
    struct st_a5a4c8_0 *field_60;
    struct st_a5a4c8_0 *field_68;
} st_a5a4c8_0;

extern long long g_af9564;

void sub_a5a4c8(st_a5a4c8_0 *a0)
{
    unsigned int v2;  // w8
    unsigned long long v3;  // 4102
    st_a5a4c8_0 **v4;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return;
    do
    {
        /* unsupported instruction */;
        v2 = /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v3 = arm64g_calculate_condition(19, v2, 1, 0);
    if (!(v3 & 1))
    {
        /* unsupported instruction */;
    }
    else if ((int)v2 > 1)
    {
        return;
    }
    sub_a54a84(a0);
    sub_a5bd20(a0);
    v4 = &a0->field_60;
    if (a0->field_60)
    {
        sub_a55970(a0->field_60, a0->field_68);
        sub_a55830(a0->field_60);
        *v4 = 0;
        v4[1] = 0;
    }
    *(unsigned int *)&a0->field_0 = 0;
    sub_a6a9e8(0x11, a0, &a0->field_50);
    sub_a7c1d0(a0->field_38);
    sub_ad6958(a0->field_40, &g_af9564);
}
