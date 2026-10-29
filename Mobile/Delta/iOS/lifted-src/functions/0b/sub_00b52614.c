/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb52614..0xb52700 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b52614_0 {
    char padding_0[32];
    long long field_20;
    char padding_28[64];
    unsigned int field_68;
    char padding_6c[4];
    long long field_70;
    char padding_78[60];
    unsigned int field_b4;
} st_b52614_0;


long long sub_b52614(st_b52614_0 *a0, long long a1, long long a2, unsigned long long a3)
{
    unsigned int v2;  // w8
    long long v3;  // x19
    long long v4;  // x20
    unsigned long long v5;  // 4112
    unsigned long long v6;  // 4118
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    switch (v2)
    {
    case 6:
        v6 = arm64g_calculate_condition(1, a0->field_b4, 1, 0);
        if (v6 & 1)
            return 1;
        if (!a1 || sub_a509f4(a0->field_20))
        {
            if (!a2)
            {
                return 1;
            }
            else if (sub_a509f4(a0->field_70, a2))
            {
                return 1;
            }
        }
        v3 = 174;
        v4 = 198;
        break;
    case 5:
        v5 = arm64g_calculate_condition(0x11, sub_aba5a8(a3) & 0xffffffff, 1, 0);
        if (v5 & 1)
            return 1;
        v3 = 0xaa;
        v4 = 189;
        break;
    case 3:
        v3 = 168;
        v4 = 183;
        if (!a1 && !(unsigned int)a3)
            return 1;
        break;
    default:
        return 1;
    }
    sub_a368c8();
    sub_a369bc("providers/implementations/signature/rsa_sig.c", v4, "rsa_check_padding");
    sub_a36abc(57, v3, 0);
    return 0;
}
