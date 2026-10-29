/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab1360..0xab146c (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab1360_0 {
    unsigned long long field_0;
    char padding_8[16];
    struct st_ab1360_0 *field_18;
    long long field_20;
    long long field_28;
    long long field_30;
    long long field_38;
    struct st_ab1360_0 *field_40;
    long long field_48;
    long long field_50;
    long long field_58;
    long long field_60;
    char padding_68[24];
    long long field_80;
    long long field_88;
    char field_90;
    char padding_91[47];
    long long field_c0;
    long long field_c8;
    long long field_d0;
} st_ab1360_0;

extern long long g_ab2858;

void sub_ab1360(st_ab1360_0 *a0)
{
    unsigned int v2;  // w8
    unsigned long long v3;  // 4102
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
    if (a0->field_18 && a0->field_18->field_40)
        a0->field_18->field_40();
    sub_a32e7c(a0->field_20);
    sub_a6a9e8(9, a0, &a0->field_90);
    sub_a7c1d0(a0->field_d0);
    sub_9e48d4(a0->field_28);
    sub_9e48d4(a0->field_30);
    sub_9e4838(a0->field_38);
    sub_9e4838(a0->field_40);
    sub_9e4838(a0->field_48);
    sub_9e4838(a0->field_50);
    sub_9e4838(a0->field_58);
    sub_9e4838(a0->field_60);
    sub_aadf28(a0->field_80);
    sub_ad6958(a0->field_88, &g_ab2858);
    sub_9dceb4(a0->field_c0);
    sub_9dceb4(a0->field_c8);
}
