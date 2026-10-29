/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2a234..0xb2a2f4 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2a234_0 {
    char padding_0[8];
    long long field_8;
} st_b2a234_0;


int sub_b2a234(st_b2a234_0 *a0, int a1, long long *a2, long long a3)
{
    long long v2;  // x23
    int v3;  // w0
    long long v4;  // x21
    unsigned long long v5;  // 4106
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a3;
    v3 = sub_a2f9e0();
    if (!v3)
        return v3;
    v4 = sub_a536d0(a0->field_8);
    if (!a1)
    {
        *a2 = v4;
        return 1;
    }
    v5 = arm64g_calculate_condition(2, v4, 1, 0);
    if (!(v5 & 1))
    {
        if ((unsigned long long)v4 <= (unsigned long long)v2)
            goto LABEL_b2a2b4;
        sub_a368c8();
        sub_a369bc("providers/implementations/exchange/kdf_exch.c", 117, "kdf_derive");
        sub_a36abc(57, 106, 0);
    }
    else
    {
        v4 = v2;
LABEL_b2a2b4:
        if ((int)sub_a53798(a0->field_8, a1, v4, 0) >= 1)
        {
            *a2 = v4;
            return 1;
        }
    }
    return 0;
}
