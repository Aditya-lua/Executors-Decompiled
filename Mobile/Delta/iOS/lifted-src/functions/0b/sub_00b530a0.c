/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb530a0..0xb531ac (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b530a0_0 {
    char padding_0[28];
    char field_1c;
    char padding_1d[3];
    long long field_20;
    unsigned long long field_28;
    char padding_30[56];
    unsigned int field_68;
} st_b530a0_0;

extern long long g_b51a8c;

unsigned long long sub_b530a0(st_b530a0_0 *a0, long long a1, long long a2, long long a3, long long a4)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    unsigned long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(unsigned int)v2)
        return v2;
    v3 = sub_b51f10(a0, a1, &g_b51a8c, a2, a4);
    if (!(unsigned int)v3)
    {
        return v3;
    }
    else if (a0->field_68 == 6)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/signature/rsa_sig.c", 1956, "rsa_sigalg_signverify_init");
        sub_a36abc(57, 178, 0);
        return 0;
    }
    else
    {
        v4 = sub_b52328(a0, a3, 0);
        if (!(unsigned int)v4)
            return v4;
        a0->field_68 = 1;
        a0->field_1c = a0->field_1c & 252 | 1;
        v5 = a0->field_28;
        if (v5 || (v5 = sub_a3f728(0), a0->field_28 = v5, v5))
        {
            if (sub_a3f7f0(v5, a0->field_20, a2))
                return 1;
        }
        sub_a3f73c();
        a0->field_28 = 0;
        return 0;
    }
}
